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
public abstract class PersonOutfit {
    protected Variants variants;
    protected Variants variants2;
    
    
    protected PersonOutfit(Variants var1, Variants var2){
        this.variants = var1;
        this.variants2 = var2;
    }
    abstract public void individualsstyle();
    
}
