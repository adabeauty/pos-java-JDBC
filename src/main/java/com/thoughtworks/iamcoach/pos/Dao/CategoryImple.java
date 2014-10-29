package com.thoughtworks.iamcoach.pos.Dao;

import com.thoughtworks.iamcoach.pos.Ulti.Ulti;
import com.thoughtworks.iamcoach.pos.module.Category;
import com.thoughtworks.iamcoach.pos.module.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoryImple implements CategoryDao{
    private Ulti ulti= new Ulti();
    
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    @Override
    public ArrayList<Category> getCategories() {
        return null;
    }

    @Override
    public Category getCategoryById(int id) {
        String sql = "SELECT * FROM items WHERE id = ?";
        Category category = null;
        Connection conn = ulti.getConnection();
        try{
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery(sql);
            resultSet.next();
            category = new Category(resultSet.getString("name"));

            ulti.closeConnection();
            preparedStatement.close();
            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return category;
    }
}
