package com.distributedsystems;

public interface Publisher extends Node{

    //methods declaration
    void getBrokerList();
    Broker hashTopic(ArtistName artistName);
    void push(ArtistName artistName, Value musicFile);
    void notifyFailure(Broker broker);
}
