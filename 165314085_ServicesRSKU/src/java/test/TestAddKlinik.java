/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.KlinikHelper;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Windows
 */
public class TestAddKlinik {
    public static void main(String[] args) {
        try {
            KlinikHelper klinik = new KlinikHelper();
            klinik.addNewClinic("004", "Hati", "Fractura Hepatica");
        } catch (Exception e) {
            Logger.getLogger(TestAddKlinik.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
