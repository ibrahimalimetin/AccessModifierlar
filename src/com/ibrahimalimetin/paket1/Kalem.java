/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibrahimalimetin.paket1;

import com.ibrahimalimetin.paket2.Esya;

/**
 *
 * @author Ibrahim Ali Metin
 */
public class Kalem extends Esya{
    
    public Kalem(String marka) {
        super(marka);
    }

    public void marka_soyle() {
        
        System.out.println(super.marka);//üst sınıfımızın özelliğini direk kullanmak istiyouz. 
        
    }
}
