package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TaxiBot extends TelegramLongPollingBot {

    public TaxiBot(){
        super("7628684296:AAEW4cxbZ5EFUqjTASl_cyY5OcCwpUi8PrI");
    }

    @Override
    public void onUpdateReceived(Update update) {



    }

    @Override
    public String getBotUsername() {
        return "ReserveTaxi_bot";
    }
}
