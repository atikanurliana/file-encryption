/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enkripsifilesederhana;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author atikacomel
 */
public class Enkripsi {
    public static void enkripsi(InputStream input, OutputStream output) throws IOException {
        boolean done =false;
        while(!done)    {
            int next = input.read();
            if (next == -1) {
                done = true;
            }   else    {
                byte b = (byte) next;
                byte c = (byte) (b + 5);
                output.write(c);
            }
        }
    }
}
