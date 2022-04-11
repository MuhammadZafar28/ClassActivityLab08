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
public class style extends PersonOutfit{
    
    public style (Variants var1, Variants var2){
        super(var1,var2);
    }
    @Override
    public void individualsstyle() {
        System.out.println("Style is: ");
        variants.Professional();
        
    }
}
