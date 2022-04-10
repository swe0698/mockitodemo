package com.example.mockitodemo;

import org.junit.Test;
import org.mockito.Mockito;


import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class SomeBusinessImplTests {

    @Test
    public void findtest(){
        DataService dataServiceMock = mock(DataService.class);
                when(dataServiceMock.retriveAll()).thenReturn(new int[] {1,2,3});
        SomeBusinessImpl someBusiness= new SomeBusinessImpl(dataServiceMock);
       int result =  someBusiness.find();
       assertEquals(3  ,result);
    }

    @Test
    public void goodtest(){
        List list = mock(List.class);
        when(list.size()).thenReturn(10).thenReturn(25);
        assertEquals(10, list.size());
        assertEquals(25, list.size());
    }

    @Test
    public void badtest(){
        List list = mock(List.class);
        when(list.get(Mockito.anyInt())).thenReturn(10).thenReturn(25);
        assertEquals(10, list.get(0));
        assertEquals(25, list.get(1));
    }
}
