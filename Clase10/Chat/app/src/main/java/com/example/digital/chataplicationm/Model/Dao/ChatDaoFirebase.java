package com.example.digital.chataplicationm.Model.Dao;

import android.content.Context;
import android.provider.ContactsContract;

import com.example.digital.chataplicationm.Model.Pojo.ChatMessaje;
import com.example.digital.chataplicationm.Util.ResultListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by joe on 4/9/18.
 */

public class ChatDaoFirebase {
    // TODO Descomentar esta linea, una vez agregadas las dependencias de Firebase
    //private DatabaseReference mDatabase;

    public void getChatMessajes(final Context context, final ResultListener<List<ChatMessaje>> escuchadorDelControlador) {
      FirebaseDatabase db = FirebaseDatabase.getInstance();
      DatabaseReference reference = db.getReference();
      DatabaseReference mensajeReferene = reference.child("mensajes");
        ValueEventListener mensajeListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                List<ChatMessaje> chatMessajes = new ArrayList<>();
               for (DataSnapshot dataSnapshotChildren: dataSnapshot.getChildren()){
                   ChatMessaje unMensaje = dataSnapshotChildren.getValue(ChatMessaje.class);
                   chatMessajes.add(unMensaje);
               }
               escuchadorDelControlador.finish(chatMessajes);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };
        //Leer en a parte read data once (en la documentacion )
        mensajeReferene.addValueEventListener(mensajeListener);



    }

    public void putChatMessaje(ChatMessaje messageToWrite) {
      // TODO
        //Da la instancia de la bd
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference reference = db.getReference();
        //Estoy parada dentro del a db y esto me devuelve una referencia

        DatabaseReference mensajesReference = reference.child("mensajes");
        DatabaseReference referenciaUnica = mensajesReference.push();
        mensajesReference.setPriority(messageToWrite);
    }

}
