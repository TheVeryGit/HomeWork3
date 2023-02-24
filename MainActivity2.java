package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.firstproject.RailwayTicket;
import com.example.firstproject.RailwayTicketChild;
import com.example.firstproject.RailwayTicketOld;

public class MainActivity2 extends AppCompatActivity {

    // создание объекта сущности взрослых билетов (стоимость билета, количество билетов)
    RailwayTicket railwayTicket = new RailwayTicket(70, 9);
    // создание объекта сущности детских билетов (стоимость билета, количество билетов, скидка)
    RailwayTicket railwayTicketChild = new RailwayTicketChild(70, 11, 50);

    RailwayTicket railwayTicketOld = new RailwayTicketOld(70, 5 , 30);

    // создание полей для вывода на экран нужных значений
    private TextView railwayTicketOut; // поле вывода общей стоимости взрослых билетов
    private TextView railwayTicketChildOut; // поле вывода общей стоимости детских билетов
    private TextView railwayTicketTotalOut; // поле вывода общей стоимости всех билетов


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        railwayTicketOut = findViewById(R.id.railwayTicketOut);
        railwayTicketChildOut = findViewById(R.id.railwayTicketChildOut);
        railwayTicketTotalOut = findViewById(R.id.railwayTicketTotalOut);
        railwayTicketOldOut = findViewById(R.id.railwayTicketOldOut);

        railwayTicketOut.setText(Float.toString(railwayTicket.ticketPriceAll()) + " монет");
        railwayTicketChildOut.setText(Float.toString(railwayTicketChild.ticketPriceAll()) + " монет");
        railwayTicketOldOut.setText(Float.toString(railwayTicketOld.ticketPriceAll()) + " монет");
        railwayTicketTotalOut.setText(Float.toString(railwayTicket.ticketPriceAll() + railwayTicketChild.ticketPriceAll()) + " монет");

    }
}
