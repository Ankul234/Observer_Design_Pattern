package com.ankul.Observer_Design_Pattern.Observer;

import com.ankul.Observer_Design_Pattern.Observable.StockObservable;


public class EmailAlertObserver implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;
    public EmailAlertObserver(String emailId, StockObservable observable){
        this.observable = observable;
        this.emailId = emailId;
    }
    @Override
    public void update(){
        sendAMail(emailId, "Product is back in Stock : ");
        //Send Actual Email
    }
    private void sendAMail(String emailId, String msg){
        System.out.println("Mail sent to :"+emailId);
    }
}
