package com.woda.run.Ebbinghaus;

import java.util.LinkedList;

public class EbbinghausImpl implements  Ebbinghaus{
    int i = 0;
    int j = 1;
    int[] days = {1,2,4,7,15,31};


    @Override
    public LinkedList<String> getCurrentLearnPlain() {
        return null;
    }

    @Override
    public void setLearnPlain(int[] plain) {

    }

    @Override
    public boolean removeContentById(String id) {
        return false;
    }
}
