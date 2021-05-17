package com.viper;

import java.util.HashMap;
import java.util.Map;

/**
 * @author c1rew
 * @date 2021-05-17 11:55
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(10);
        map.put(1,"Jack");
        map.put(2,"Tom");
        map.put(3,"James");
        System.out.println(map);
    }
}
