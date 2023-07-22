package com.han.allcommom.util;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.Type;
import java.util.*;

/**
 * @Author: Wuj
 * @Description: TODO
 * @DateTime: 2023/7/21 22:05
 **/
public class GsonUtil {

    private static Gson gson(){
        return new Gson();
    }


    public static String toStr(Object obj){
        if (obj == null){
            return "";
        }
        return gson().toJson(obj);
    }


    public static <T> T fromJson(String jsonStr, Class<T> classOfT) {

        return gson().fromJson(jsonStr, classOfT);
    }

    public static <T> List<T> toSet(String jsonStr, Class<T> classOfT) {
        Type type = new TypeToken<HashSet<T>>(){}.getType();
        return gson().fromJson(jsonStr, type);
    }

     public static <T> T toMap(String jsonStr, Class<T> classOfT) {
        return gson().fromJson(jsonStr, classOfT);
    }


    public static <T> List<T> jsonToList(String s, Class<T[]> cls) {
        T[] arr = new Gson().fromJson(s, cls);
        return Arrays.asList(arr);
    }

    public static void main(String[] args) {

        List<Ce> list = new ArrayList<>();

        HashMap<String, Ce> objectObjectHashMap = Maps.newHashMap();
        for (int i = 0; i < 3; i++) {
            list.add(new Ce(String.valueOf(i),String.valueOf(i+2)));
            objectObjectHashMap.put(String.valueOf(i),new Ce(String.valueOf(i),String.valueOf(i+2)));
        }

        String listStr = toStr(list);
        String listMap = toStr(objectObjectHashMap);


        HashMap<String, Ce> as = toMap(listMap, objectObjectHashMap.getClass());

        String mapStr = toStr(objectObjectHashMap);

        List<Ce> rs=new ArrayList<Ce>();

        Type type = new TypeToken<ArrayList<Ce>>() {}.getType();

        rs=gson().fromJson(listStr, type);



        System.out.println("---");


    }

    @AllArgsConstructor
    @Data
    static  class Ce{

        public String name;

        public String as;


    }

}
