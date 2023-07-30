package com.han.allcommom.muis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/30 20:52
 **/
@Data
@AllArgsConstructor
public class NameValue {

    public final String name;

    public final String value;

    public static NameValue builder(String name, String value){
        return new NameValue(name, value);
    }

     public String toString(){
         List<Integer> emptyList = Lists.newArrayList();
        return name+"|"+value+" ";
     }

}
