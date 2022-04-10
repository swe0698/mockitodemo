package com.example.mockitodemo;

import java.util.ArrayList;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    int find(){
        int[] data = dataService.retriveAll();
        int greatest = Integer.MIN_VALUE;
        for(int value:data){
            if(value>greatest)
                greatest = value;
        }
        return greatest;
    }
}

interface DataService{
  int[] retriveAll();

}
