package com.thoughtworks.iamcoach.pos.Dao;

import com.thoughtworks.iamcoach.pos.Ulti.Ulti;
import com.thoughtworks.iamcoach.pos.module.Promotion;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by wanghuan on 14-10-29.
 */
public class PromotionImple implements PromotionDao {
    private Ulti ulti = new Ulti();

    private PreparedStatement preparedStatement = null;
    private ResultSet result = null;

    @Override
    public Promotion getPromotionByType(int type) {
        String sql =  "SELECT * FROM promotions WHERE type = ?";
        Connection connection = ulti.getConnection();
        Promotion promotion = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, type);

            result = preparedStatement.executeQuery();
            result.next();

            promotion = new Promotion(result.getInt("id"), result.getInt("type"), result.getString("description"));

            ulti.closeConnection();
            preparedStatement.close();
            result.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return promotion;
    }

    @Override
    public ArrayList<Promotion> getPromotions() {
        ArrayList<Promotion> promotions = new ArrayList<Promotion>();
        String sql = "SELECT * FROM promotions";

        Promotion promotion = null;
        Connection conn = ulti.getConnection();
        try{
            preparedStatement = conn.prepareStatement(sql);

            result = preparedStatement.executeQuery(sql);
            while (result.next()){
                promotion = new Promotion(result.getInt("id"), result.getInt("type"), result.getString("description"));
                promotions.add(promotion);
            }

            ulti.closeConnection();
            preparedStatement.close();
            result.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return promotions;
    }
}
