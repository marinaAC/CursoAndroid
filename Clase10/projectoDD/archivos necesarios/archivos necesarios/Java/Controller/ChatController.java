package com.digitalhouse.whatsappchatmio.Controller;

import android.content.Context;

import com.digitalhouse.whatsappchatmio.Model.Dao.ChatDaoFirebase;
import com.digitalhouse.whatsappchatmio.Model.Pojo.ChatMessaje;
import com.digitalhouse.whatsappchatmio.Util.ResultListener;

import java.util.List;

/**
 * Created by joe on 4/9/18.
 */

public class ChatController {


    public void getChatMessajes(final Context context, final ResultListener<List<ChatMessaje>> escuchadorDeLaVista){
        ChatDaoFirebase chatDaoFirebase = new ChatDaoFirebase();
        chatDaoFirebase.getChatMessajes(context, new ResultListener<List<ChatMessaje>>() {
            @Override
            public void finish(List<ChatMessaje> resultado) {
                escuchadorDeLaVista.finish(resultado);
            }
        });
    }

    public void putChatMessaje(ChatMessaje messageToWrite){
        ChatDaoFirebase chatDaoFirebase = new ChatDaoFirebase();
        chatDaoFirebase.putChatMessaje(messageToWrite);
    }
}
