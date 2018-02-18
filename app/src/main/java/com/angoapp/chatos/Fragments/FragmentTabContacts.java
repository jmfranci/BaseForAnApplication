package com.angoapp.chatos.Fragments;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import com.angoapp.chatos.Activities.ExchangeMessageActivity;
import com.angoapp.chatos.Objects.Contact;
import com.angoapp.chatos.Adaptor.ItemAdaptor;
import com.angoapp.chatos.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mateusjose on 1/9/18.
 */

public class FragmentTabContacts extends android.support.v4.app.Fragment{


    public void FragmentTabContacts(){

        Toast.makeText(getActivity(), "mateua", Toast.LENGTH_LONG).show();


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View page=inflater.inflate(R.layout.tab_general,container,false);
        page.setBackgroundResource(R.color.orange);


        final List<Contact> listOfContacts=new ArrayList<>();
        listOfContacts.add(new Contact("Jose","Manuel","8129292903",BitmapFactory.decodeResource(this.getResources(), R.drawable.bonita)));
        listOfContacts.add(new Contact("mae","812000000"));
        listOfContacts.add(new Contact("joaquim"," fernando","8127777777"));
        listOfContacts.add(new Contact("puto da paraboloca","317888888888"));
        listOfContacts.add(new Contact("marcia","marilia","333331234131",BitmapFactory.decodeResource(this.getResources(), R.drawable.bonita)));
        listOfContacts.add(new Contact("edna","sibo","234234545542"));
        listOfContacts.add(new Contact("pai","235354542"));


        //Mateus: call and set the card adaptor
        ItemAdaptor adaptor = new ItemAdaptor(getContext(),listOfContacts,0);
        final ListView listView = (ListView) page.findViewById(R.id.lvItem);
        listView.setAdapter(adaptor);

        //mateus: set onclick listner for the list of items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getContext(), ExchangeMessageActivity.class);
                startActivity(intent);
            }
        });


        return page;
    }
}
