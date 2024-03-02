package com.ankul.Observer_Design_Pattern.Observable;
import com.ankul.Observer_Design_Pattern.Observer.NotificationAlertObserver;
import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount=0;

    @Override
    public void add(NotificationAlertObserver observer){
        observerList.add(observer);
    }
    @Override
    public void remove(NotificationAlertObserver observer){
        observerList.remove(observer);
    }
    @Override
    public void notify_Subscribers(){
        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }
    public void setStockCount(int newStockAdded){
        if(stockCount ==0){
            notify_Subscribers();
        }
        stockCount = stockCount + newStockAdded;
    }
    public int getStockCount(){
        return stockCount;
    }

}
