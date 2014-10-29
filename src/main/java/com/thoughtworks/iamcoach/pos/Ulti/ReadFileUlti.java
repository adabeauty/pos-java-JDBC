package com.thoughtworks.iamcoach.pos.Ulti;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 * Created by wanghuan on 14-10-29.
 */
public class ReadFileUlti {
    public ArrayList<String> readFile(String fileName){
        ArrayList<String> text = new ArrayList<String>();

        try {
            Path path = FileSystems.getDefault().getPath("src/main/resources/", fileName);
            text = (ArrayList<String>) Files.readAllLines(path);
        } catch (IOException ex) {
            System.out.println("fail read file!");
        }

        return text;
    }
}
