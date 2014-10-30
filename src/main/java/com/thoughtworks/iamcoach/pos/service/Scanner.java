package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.Ulti.ReadFileUlti;

import java.util.ArrayList;

/**
 * Created by wanghuan on 14-10-30.
 */
public class Scanner {
    public ArrayList<String> getInputs() {
        ReadFileUlti readFileUlti = new ReadFileUlti();
        return readFileUlti.readFile("cart.txt");
    }
}
