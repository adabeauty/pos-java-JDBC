package com.thoughtworks.iamcoach.pos.Dao;

import com.thoughtworks.iamcoach.pos.Category;
import com.thoughtworks.iamcoach.pos.Ulti.Ulti;
import com.thoughtworks.iamcoach.pos.module.Item;
import com.thoughtworks.iamcoach.pos.module.Promotion;

import java.sql.*;
import java.util.ArrayList;

public class ItemImple implements ItemDao {
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Ulti ulti= new Ulti();

    @Override
    public Item getItemByBarcode(String barcode) {
        String sql = "SELECT * FROM items WHERE barcode = ?";
        Item item = null;
        Connection conn = ulti.getConnection();
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, barcode);
            rs = pstmt.executeQuery(sql);
            rs.next();
            item = new Item(rs.getInt("categoryId"), rs.getString("barcode"), rs.getString("name"), rs.getString("unit"), rs.getDouble("price"));

            ulti.closeConnection();
            pstmt.close();
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return item;
    }

    @Override
    public ArrayList<ItemDao> getItems() {
        return null;
    }

    @Override
    public ArrayList<Promotion> getPromotionOfItem(int id) {
        return null;
    }

    @Override
    public Category getCategory(int id) {
        return null;
    }
}
