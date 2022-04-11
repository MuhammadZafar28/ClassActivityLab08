/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classactivity;

/**
 *
 * @author awais
 */
public class Professional extends PersonOutfit{
    
    public Professional (Variants var1, Variants var2){
        super(var1,var2);
    }

    Professional(Outfit outfit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void individualsstyle() {
        System.out.println("Professional ");
        variants.Professional();
        
    }
}