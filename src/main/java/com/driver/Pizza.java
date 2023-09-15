package com.driver;

public class Pizza {

    private int price;
    private final Boolean isVeg;
    private String bill;

    private int cheesePrice;
    private final int toppingPrice;
    private int paperBagPrice;

    private  boolean isCheeseAdded;
    private boolean isToppingAdded;
    private  boolean isPaperBagAdded;

    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.toppingPrice=70;
        }
        else{
            this.cheesePrice=80;
            this.paperBagPrice=20;
            this.toppingPrice=120;
            this.price=400;
        }
        this.isCheeseAdded=false;
        this.isToppingAdded=false;
        this.isPaperBagAdded=false;
        this.isBillGenerated=false;

        bill=bill+ "Base Price Of The Pizza: "+price +"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!isCheeseAdded) {
            price+=cheesePrice;
            isCheeseAdded=true;
        }
        return ;

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded){
            price+=toppingPrice;
            isToppingAdded=true;
        }
        return;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded){
            price+=paperBagPrice;
            isPaperBagAdded=true;
        }
        return;
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            if(isCheeseAdded){
                bill+="Extra Cheese Added: "+toppingPrice+"\n";
            }
            if(isToppingAdded){
                bill+="Extra Toppings Added: "+toppingPrice+"\n";
            }
            if(isPaperBagAdded){
                bill+="Paperbag Added: "+paperBagPrice+"\n";
            }
            bill+="Total Price: "+price;
            isBillGenerated=true;
        }
        return this.bill;
    }
}
