/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacion.java.utils;

import java.util.regex.Pattern;

/**
 *
 * @author willi
 */
public class StringUtils extends com.sun.xml.internal.ws.util.StringUtils {

    public static boolean isEmptyString(Object cadena) {
        String eval = (String) cadena;
        return eval == null || eval.isEmpty();
    }

    public static String randomPassword(int length) {

        if (length < 3) {
            return "";
        }

        String text = "";
        String possible
                = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        boolean generated = false;
        // Por lo menos un número, una letra minúscula y una mayúscula
        String re = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).";
        while (!generated) {
            for (int i = 0; i < length; i++) {
                text += possible.charAt((int) Math.floor(Math.random() * possible.length()));
            }

            if (Pattern.compile(re).matcher(text).find()) {
                generated = true;
            } else {
                text = "";
            }
        }

        return text;
    }

    public static boolean isValidEmail(String email) {
        String re = "^(([^<>()[\\]\\\\.,;:\\s@\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\"]+)*)|(\".+\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        return Pattern.compile(re).matcher(email).find();
    }

}
