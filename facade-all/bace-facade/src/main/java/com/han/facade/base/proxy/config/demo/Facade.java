package com.han.facade.base.proxy.config.demo;

import com.han.allcommom.muis.facade.FacadeI;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/8/27 01:05
 **/
public class Facade implements FacadeI {


    public String say(String ram){

        try {
//            Thread.sleep(1000);
        }catch (Exception e){

        }    finally {
//            System.out.println("---say");
        }
        return ram;
    }

}
