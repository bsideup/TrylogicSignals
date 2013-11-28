package ru.trylogic.signals;

abstract public class OneArgSignal<T extends OneArgSignal, ARG0> extends SignalBase<OneArgSignalListener<T, ARG0>> {

    public void call(ARG0 arg0) {
        for(OneArgSignalListener listener : listeners) {
            try {
                listener.onSignal(this, arg0);
            } catch(Throwable ignored) {
            }
        }
    }
}