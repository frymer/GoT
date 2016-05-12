package com.mapad.games.gameofthrones.model;

import java.util.LinkedList;
import java.util.List;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Itai on 5/8/2016.
 */
public class Deck<T extends Card> {
    private LinkedList<T> _cards;

    public Deck(LinkedList<T> cards){
        this._cards = cards;
    }
    public T top(){
        return this._cards.peek();
    }

    public T pop(){
        T temp = this._cards.poll();
        this._cards.add(temp);
        return temp;
    }

    public void shuffle(){
        throw new NotImplementedException();
    }
}
