package com.distributedsystems;

import java.util.List;

public interface Node {

    //variables declaration
    List<Broker> brokers;

    //methods declaration
    void init(int a);
    List<Broker> getBrokers();
    void connect();
    void disconnect();
    void updateNodes();
}
