package com.example.digital.chataplicationm.View;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

import com.example.digital.chataplicationm.R;
import com.example.digital.chataplicationm.Controller.ChatController;
import com.example.digital.chataplicationm.Controller.RecyclerChatAdapter;
import com.example.digital.chataplicationm.Model.Pojo.ChatMessaje;


import com.example.digital.chataplicationm.Util.ResultListener;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    private RecyclerChatAdapter recyclerChatAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // BUSCO EL RECYCLER
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // SETEO LA CONF PARA EL RENDIMIENTO
        recyclerView.setHasFixedSize(true);

        // SETEO EL MANAGER
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        // SETEO EL ADAPTER
        recyclerChatAdapter = new RecyclerChatAdapter("usuario1");
        recyclerView.setAdapter(recyclerChatAdapter);


        // Construyo el telefono de la vista
        ResultListener<List<ChatMessaje>> telVista = new ResultListener<List<ChatMessaje>>() {
            @Override
            public void finish(List<ChatMessaje> resultado) {
                recyclerChatAdapter.addChats(resultado);
            }
        };

        // PIDO LOS MENSAJES VIEJOS
        final ChatController chatController = new ChatController();
        chatController.getChatMessajes(this, telVista);

        FloatingActionButton sendButton = findViewById(R.id.button_send);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = findViewById(R.id.main_activity_edittext);
                String message = editText.getText().toString();
                if (!message.isEmpty()) {
                    editText.setText("");
                    ChatMessaje chatMessaje = new ChatMessaje("usuario1", message);
                    chatController.putChatMessaje(chatMessaje);
                }
            }
        });

    }
}
