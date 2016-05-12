package com.mapad.games.gameofthrones.model;

import java.lang.reflect.Array;
import java.util.List;

public class Game {

    List<Territory> Board;

    Deck<WesteroseCard> Westerose_1;
    Deck<WesteroseCard> Westerose_2;
    Deck<WesteroseCard> Westerose_3;
    Deck<WildlingsCard> Wildlings;
    int WildlingsLevel;

    //TODO: think how to implement Influence indicators - currently arr
    Array ThroneIndicator;
    Array SwordIndicator;
    Array RavenIndicator;

    List<Player> Players;
    int GameType; //TODO: create enum of game types
}
