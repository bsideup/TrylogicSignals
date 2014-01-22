package ru.trylogic.signals;

public interface FourArgsSignalListener <T extends FourArgsSignal, ARG0, ARG1, ARG2, ARG3> {
    void onSignal(T signal, ARG0 arg0, ARG1 arg1, ARG2 arg2, ARG3 arg3);
}