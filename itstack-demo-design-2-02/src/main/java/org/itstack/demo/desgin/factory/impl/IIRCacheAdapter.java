package org.itstack.demo.desgin.factory.impl;

import org.itstack.demo.desgin.factory.ICacheAdapter;
import org.itstack.demo.design.CacheService;
import org.itstack.demo.design.matter.IIR;

import java.util.concurrent.TimeUnit;

public class IIRCacheAdapter implements CacheService {

    private IIR iir = new IIR();

    public String get2(String key) {
        return iir.get(key);
    }

    public void set(String key, String value) {
        iir.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        iir.del(key);
    }

}
