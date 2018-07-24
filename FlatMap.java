package com.fusap.sanofi.backend;

import java.util.ArrayList;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainTest {

    public static void main (String [ ] args) {


        Observer<Integer> observerx = new Observer<Integer>() {

            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("onSubscribe");
            }

            @Override
            public void onNext(Integer numero) {
                System.out.println(numero.toString() + "teclado");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("onError");
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };

        ArrayList<Integer> numeros= new ArrayList<Integer>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);


        Observable.fromArray(numeros)
                .flatMap(s-> hacerAlgo(s))
                .subscribe(observerx);


    }

    private static Observable<Integer> hacerAlgo(ArrayList<Integer> s) {
        s.add(33);
        return Observable.fromIterable(s);
    }


}
