package com.distributedsystems;

import java.util.ArrayList;
import java.util.List;

public interface Node {

    //variables declaration
    List<Broker> brokers = new ArrayList<Broker>();

    //methods declaration
    void init(int a);
    List<Broker> getBrokers();
    void connect();
    void disconnect();
    void updateNodes();
}
