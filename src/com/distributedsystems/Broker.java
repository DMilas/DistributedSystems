package com.distributedsystems;

import java.util.List;

public interface Broker extends Node{
    //variables declaration
    List<Consumer> registeredUsers;
    List<Publisher> registeredPublishers;

    //methods declaration
    void calculateKeys();
    Publisher acceptConnection(Publisher publisher);
    Consumer acceptConnection(Consumer consumer);
    void notifyPublisher(String string);
    void pull(ArtistName artistName);
}
