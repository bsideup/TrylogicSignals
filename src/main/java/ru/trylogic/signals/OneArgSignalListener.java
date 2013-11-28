package ru.trylogic.signals;

public interface OneArgSignalListener <T extends OneArgSignal, ARG0> {
    void onSignal(T signal, ARG0 arg0);
}
