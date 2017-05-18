package com.mosaic.entity;


import javafx.scene.paint.Color;

/**
 * Created by 刘亚飞 on 2017/5/18.
 */
public class User {

    private Color favoriteColor;

    public Color getFavoriteColor() {
        return favoriteColor;
    }

    public User(Color favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public void setFavoriteColor(Color favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    @Override
    public String toString() {
        return "User{" +
                "favoriteColor=" + favoriteColor +
                '}';
    }
}
