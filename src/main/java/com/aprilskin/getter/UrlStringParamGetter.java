package com.aprilskin.getter;

import com.aprilskin.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.hibernate.criterion.Order;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Slf4j
public class UrlStringParamGetter implements StringGetter {
    public UrlStringParamGetter() {
    }

    @Override
    public String getString(String url) {
        log.info("getString URL="+url);

        CloseableHttpClient httpClient = null;
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(30000)
                .setSocketTimeout(30000).build();

        httpClient = HttpClients.custom()
                .setDefaultRequestConfig(requestConfig)
                .build();

        HttpGet httpGet = new HttpGet(url);

        httpGet.addHeader("charset", "utf-8");
        httpGet.addHeader("Accept", "*/*");
        httpGet.addHeader("Accept-Encoding", "gzip, deflate, sdch");
        httpGet.addHeader("Accept-Language", "*");
        httpGet.addHeader("Connection", "keep-alive");
        httpGet.addHeader("X-Fsign", "SW9D1eZo");
        httpGet.addHeader("X-Requested-With", "XMLHttpRequest");

        HttpResponse httpResponse =  null;
        try{
            httpResponse =  httpClient.execute(httpGet);
        }catch(SocketTimeoutException | ConnectTimeoutException e){
            log.error("url="+url, e);
        } catch(Exception e){
            //error나면 return함
            log.info("An Error has orrured when httpClient.execute :", e);
            return null;
        }

        HttpEntity responseEntity = httpResponse.getEntity();


        String responseString = null;
        try {
            responseString = EntityUtils.toString(responseEntity, "UTF-8");
        } catch (IOException e) {
            log.error("getString(String url)",e);
        }



        return responseString;
    }
}
