package com.aprilskin.getter;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.SocketTimeoutException;

/**
 * Created by krkim on 2015-10-16.
 *
 */
@Slf4j
public class UrlStringGetter implements StringGetter{
    public UrlStringGetter() {
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
