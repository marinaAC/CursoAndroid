package com.example.digital.chataplicationm.Model.Pojo;

/**
 * Created by joe on 4/9/18.
 */

public class ChatMessaje {
    private String userID;
    private String messaje;

    public ChatMessaje(String userID, String messaje) {
        this.userID = userID;
        this.messaje = messaje;
    }

    public ChatMessaje(){
        // ES NECESARIO TENER UN CONSTRUCTOR POR DEFECTO PARA FIREBASE
    }

    public String getUserID() {
        return userID;
    }

    public String getMessaje() {
        return messaje;
    }
}
