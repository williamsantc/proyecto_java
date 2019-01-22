/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacion.java.utils;

import java.util.List;
import java.util.Map;

/**
 *
 * @author willi
 */
public class CollectionsUtils {
    
    public static boolean isEmptyList(Object lista) {
        List eval = (List) lista;
        return eval == null || eval.isEmpty();
    }
    
    public static boolean isEmptyMap(Object mapa){
        Map eval = (Map) mapa;
        return eval == null || eval.isEmpty();
    }
    
}
