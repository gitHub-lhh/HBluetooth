package com.lhh.hbluetooth;

public interface HBReadListener {
    void onRead(byte[] cache);

    void onError(int code);
}