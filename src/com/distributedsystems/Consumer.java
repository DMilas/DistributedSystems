package com.distributedsystems;

public interface Consumer extends Node{
    void register(Broker broker, ArtistName artistName);
    void disconnect(Broker broker, ArtistName artistName);
    void playData(ArtistName artistName, Value musicFile);
}
