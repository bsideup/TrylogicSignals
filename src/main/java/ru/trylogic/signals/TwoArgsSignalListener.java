package ru.trylogic.signals;

public interface TwoArgsSignalListener<T extends TwoArgsSignal, ARG0, ARG1> {
    void onSignal(T signal, ARG0 arg0, ARG1 arg1);
}
