package com.digitalhouse.whatsappchatmio.Controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.digitalhouse.whatsappchatmio.Model.Pojo.ChatMessaje;
import com.digitalhouse.whatsappchatmio.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerChatAdapter extends RecyclerView.Adapter {
    // TODOS LOS MENSAJES DE LA CONVERSACION
    private List<ChatMessaje> chatMessajes;
    // EL ID DEL USUARIO DE LA APP
    private String myUserID;

    // TIPOS DE CELDAS DISTINTAS
    private static final int  MY_MESSAGE = 1;
    private static final int  OTHER_MESSAGE = 2;

    // CONSTRUCTOR
    public RecyclerChatAdapter(String myUserID) {
        this.myUserID = myUserID;
        this.chatMessajes = new ArrayList<>();
    }

    // FUNCIÓN PARA AGREGAR MENSAJES
    public void addChats(List<ChatMessaje> resultado) {
        chatMessajes.clear();
        chatMessajes.addAll(resultado);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View cellView = null;
        RecyclerView.ViewHolder chatViewHolder = null;

        if(viewType == MY_MESSAGE){
            cellView = layoutInflater.inflate(R.layout.recycler_chat_my_message_cell, parent, false);
            chatViewHolder = new ChatMyMessageViewHolder(cellView);
        }else{
            cellView = layoutInflater.inflate(R.layout.recycler_chat_message_cell, parent, false);
            chatViewHolder = new ChatOtherMessageViewHolder(cellView);
        }

        return chatViewHolder;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ChatMessaje chatMessaje = chatMessajes.get(position);
        int viewType = getItemViewType(position);
        if(viewType == MY_MESSAGE){
            ChatMyMessageViewHolder chatMyMessageViewHolder = (ChatMyMessageViewHolder)holder;
            chatMyMessageViewHolder.loadChatMessage(chatMessaje);
        }else{
            ChatOtherMessageViewHolder  chatOtherMessageViewHolder = (ChatOtherMessageViewHolder)holder;
            chatOtherMessageViewHolder.loadChatMessage(chatMessaje);
        }
    }

    @Override
    public int getItemCount() {
        return chatMessajes.size();
    }

    @Override
    public int getItemViewType(int position) {
        ChatMessaje chatMessaje = chatMessajes.get(position);
        if(chatMessaje.getUserID().equals(myUserID)){
            return MY_MESSAGE;
        }else{
            return OTHER_MESSAGE;
        }
    }

    // VIEW HOLDER PARA LAS CELDAS QUE SON DE MI TIPO
    private class ChatMyMessageViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewMessage;

        public ChatMyMessageViewHolder(View itemView) {
            super(itemView);
            textViewMessage = itemView.findViewById(R.id.recycler_cell_textview_message);
        }

        public void loadChatMessage(ChatMessaje chatMessage){
            textViewMessage.setText(chatMessage.getMessaje());
        }
    }

    // VIEW HOLDER PARA LAS CELDAS QUE SON DEL TIPO DE OTROS USUARIOS
    private class ChatOtherMessageViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewMessage;
        private TextView textViewUser;

        public ChatOtherMessageViewHolder(View itemView) {
            super(itemView);
            textViewMessage = itemView.findViewById(R.id.recycler_cell_textview_message);
            textViewUser = itemView.findViewById(R.id.recycler_cell_textview_user);
        }

        public void loadChatMessage(ChatMessaje chatMessage){
            textViewMessage.setText(chatMessage.getMessaje());
            textViewUser.setText(chatMessage.getUserID());
        }
    }
}
