package example;
import org.example.bot.mybot.MyBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);
        api.registerBot(new MyBot("6513821661:AAFM0NrnilTDJt6_djY9lK_Y-KmZTXBYRRw"));
        System.out.println("....");
    }
}