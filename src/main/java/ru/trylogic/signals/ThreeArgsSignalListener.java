package ru.trylogic.signals;

public interface ThreeArgsSignalListener <T extends ThreeArgsSignal, ARG0, ARG1, ARG2> {
    void onSignal(T signal, ARG0 arg0, ARG1 arg1, ARG2 arg2);
}
