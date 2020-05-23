package vn.ntu.edu.honguyenthanhthien_59136283_recycleview.controller;

import java.util.ArrayList;

import vn.ntu.edu.honguyenthanhthien_59136283_recycleview.model.Product;

public interface ICartController {
    public ArrayList<Product> getListProduct();
    public boolean addToShopping(Product p);
    public ArrayList<Product>getds();
    public void clearShopping();

}
