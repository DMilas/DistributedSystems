package com.distributedsystems;

import java.util.ArrayList;
import java.util.List;

public interface Broker extends Node{
    //variables declaration
    List<Consumer> registeredUsers = new ArrayList<Consumer>();
    List<Publisher> registeredPublishers = new ArrayList<Publisher>();

    //methods declaration
    void calculateKeys();
    Publisher acceptConnection(Publisher publisher);
    Consumer acceptConnection(Consumer consumer);
    void notifyPublisher(String string);
    void pull(ArtistName artistName);
}
