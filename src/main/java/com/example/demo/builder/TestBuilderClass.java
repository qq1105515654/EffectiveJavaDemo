package com.example.demo.builder;

import java.util.Iterator;
import java.util.Set;

public class TestBuilderClass {


    public static void main(String[] args) {

        NyPizza nyPizza=new NyPizza.Builder(NyPizza.Size.MEDIUM)
                .addTopping(Pizza.Topping.ONION)
                .addTopping(Pizza.Topping.PEPPER)
                .addTopping(Pizza.Topping.HAM)
                .builder();

        System.out.println(nyPizza.getSize().toString());

        Set<Pizza.Topping> set=nyPizza.getToppings();

        Iterator<Pizza.Topping> it=set.iterator();
        while(it.hasNext()){
            Pizza.Topping topping=it.next();
            System.out.println(topping);
        }
        CalzonePizza calzonePizza=new CalzonePizza.Builder().sauceInside().builder();

        System.out.println(calzonePizza.isSauceInside());
    }
}
