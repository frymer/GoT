package com.mapad.games.gameofthrones.model;

/**
 * Created by Itai on 5/8/2016.
 */
public class Piece {

    /*TODO change to enum:*//* PieceType*/int pieceType;
    int cost;
    int power;

    public Piece(int pieceType)
    {
//TODO        cost = //BY CONF;
//TODO        power= //BY CONF;
    }


    public int getPieceType() {
        return pieceType;
    }

    public int getPieceCost()
    {return cost;}

    public int getPower(boolean isSiege) {
        if(pieceType==4)//TODO:change to catapult
            return power+4;// RULZ: catapults gives 4 damage on sieges, and 0 otherwise
        return power;
    }
}
