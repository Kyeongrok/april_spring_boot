package com.aprilskin.getter;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by krkim on 2015-10-16.
 * file을 읽어서 string을 return해줌
 */
public class FileStringGetter implements StringGetter {
    /**
     *
     * @param filepathOrUrlOrNormal  파일명을 넘긴다
     * @return  파일 전체를 String으로 return한다.
     * @throws IOException
     */
    @Override
    public String getString(String filepathOrUrlOrNormal) {
        byte[] encoded = new byte[0];
        try {
            encoded = Files.readAllBytes(Paths.get(filepathOrUrlOrNormal));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(encoded, StandardCharsets.UTF_8);
    }


}
