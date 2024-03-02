package com.ankul.Observer_Design_Pattern.Observer;

import com.ankul.Observer_Design_Pattern.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
    String MobileNo;
    StockObservable observable;
    public MobileAlertObserver(String MobileNo, StockObservable observable){
        this.observable = observable;
        this.MobileNo = MobileNo;
    }
    @Override
    public void update(){
        sendMsgOnMobile(MobileNo, "Product is Back in Stock :");
    }
    
    private void sendMsgOnMobile(String MobileNo, String msg){
        System.out.println("Message sent to : "+ MobileNo);
    }
}