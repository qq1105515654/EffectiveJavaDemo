package com.example.demo.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;


//使用类层次结构的 Builder 模式
public abstract class Pizza {

    public enum Topping{HAM,MUSHROOM,ONION,PEPPER,SAUSAGE};

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>>{

        EnumSet<Topping> toppings=EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping){

            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza builder();

        protected abstract  T self();
    }

    Pizza(Builder builder){
        this.toppings=builder.toppings.clone();
    }

    public Set<Topping> getToppings() {
        return toppings;
    }
}
