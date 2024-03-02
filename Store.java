package com.ankul.Observer_Design_Pattern;

import com.ankul.Observer_Design_Pattern.Observable.StockObservable;
import com.ankul.Observer_Design_Pattern.Observer.MobileAlertObserver;
import com.ankul.Observer_Design_Pattern.Observer.NotificationAlertObserver;
import com.ankul.Observer_Design_Pattern.Observer.EmailAlertObserver;

public class Store {
    public static void main(String[] args) {
        System.out.printf("\n\n");

        StockObservable IphoneObservable = new com.ankul.Observer_Design_Pattern.Observable.IphoneObservable();
        NotificationAlertObserver obs1 = new EmailAlertObserver("xyz@gmail.com", IphoneObservable);
        NotificationAlertObserver obs2 = new EmailAlertObserver("xyz@gmail.com", IphoneObservable);
        NotificationAlertObserver obs3 = new MobileAlertObserver("9955935590", IphoneObservable);
        IphoneObservable.add(obs1);
        IphoneObservable.add(obs2);
        IphoneObservable.add(obs3);

        System.out.printf("\n\n");
    }
}
