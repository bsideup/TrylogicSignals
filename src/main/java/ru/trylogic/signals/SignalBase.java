package ru.trylogic.signals;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

abstract public class SignalBase<T> {
    
    protected final Set<T> listeners = Collections.newSetFromMap(new WeakHashMap<T, Boolean>());
    
    public void addListener(T listener) {
        listeners.add(listener);
    }
    
    public void removeListener(T listener) {
        listeners.remove(listener);
    }
}
