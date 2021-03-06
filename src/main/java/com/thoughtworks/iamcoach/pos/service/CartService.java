package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.Dao.*;
import com.thoughtworks.iamcoach.pos.Ulti.ReadFileUlti;
import com.thoughtworks.iamcoach.pos.module.*;

import java.util.ArrayList;

public class CartService {

    public ArrayList<CartItem> getCartInfo() {

        ArrayList<CartItem> cartItems = new ArrayList<CartItem>();

        ReadFileUlti readFileUlti = new ReadFileUlti();
        ArrayList<String> inputs = readFileUlti.readFile("cart.txt");

        ItemDao itemImple = new ItemImple();
        ArrayList<Item> items = itemImple.getItems();
        ArrayList<Promotion> promotionArrayList = null;

        double[] numbers = getNumbers(inputs, items);

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] != 0){
                promotionArrayList =  itemImple.getPromotions(Integer.parseInt(items.get(i).getId()));
                cartItems.add(new CartItem(items.get(i), numbers[i], promotionArrayList));
            }
        }
        return cartItems;
    }
    private double[] getNumbers(ArrayList<String> inputs, ArrayList<Item> items) {
        double numbers[] = new double[items.size()];

        for(int i=0; i<items.size(); i++){
            for(int j=0; j<inputs.size(); j++){
                boolean canSplit = inputs.get(j).contains("-");
                if(canSplit){
                    numbers[i] +=  processSplitedBarcode(i, j, inputs, items);
                }else{
                    numbers[i] += processBarcode(i, j, inputs, items);
                }
            }
        }
        return numbers;
    }

    private double processSplitedBarcode(int i, int j, ArrayList<String> inputs, ArrayList<Item> items){
        double number = 0;

        String[] barcodeAndNumber = inputs.get(j).split("-");
        if(items.get(i).getBarcode().equals(barcodeAndNumber[0])){
            number = Double.parseDouble(barcodeAndNumber[1]);
        }
        return number;
    }

    private double processBarcode(int i, int j, ArrayList<String> inputs, ArrayList<Item> items){
        if(items.get(i).getBarcode().equals(inputs.get(j))){
            return 1.0;
        }
        return 0.0;
    }

    public double getTotalSum() {
        ArrayList<CartItem> cartItems = this.getCartInfo();

        double total = 0;
        for(int i=0; i<cartItems.size(); i++){
            double actualSubTotal = cartItems.get(i).getNum() * cartItems.get(i).getPrice();
            total += actualSubTotal;
        }

        return total;
    }

    public double getActualSum() {
        ArrayList<CartItem> cartItems = this.getCartInfo();

        double actutalTotal = 0;
        for(int i=0; i<cartItems.size(); i++){
            actutalTotal += cartItems.get(i).getSubtotal();
        }
        return actutalTotal;
    }
}
