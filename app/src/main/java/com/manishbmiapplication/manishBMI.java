package com.manishbmiapplication;

public class manishBMI {
    private double height, weight, bmi;

    public manishBMI(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double Bmi(){
        bmi = weight/(height/100 * height/100);
        bmi = Math.round(bmi*100)/100.0D;
        return bmi;

    }
    public String Category(){
        if (bmi<18.5){
            return " You are Underweight";
        }
        else if(bmi>18.5 && bmi<24.9){
            return "You are Normal";

        }
        else if(bmi>25 && bmi<29.9){
           return "You are Overweight";

        }
        else{
            return "Obesity";

        }
    }
}
