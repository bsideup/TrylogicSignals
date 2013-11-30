package ru.trylogic.signals;

abstract public class ThreeArgsSignal <T extends ThreeArgsSignal, ARG0, ARG1, ARG2> extends SignalBase<ThreeArgsSignalListener<T, ARG0, ARG1, ARG2>> {

    public void call(ARG0 arg0, ARG1 arg1, ARG2 arg2) {
        for(ThreeArgsSignalListener listener : listeners) {
            try {
                listener.onSignal((T) this, arg0, arg1, arg2);
            } catch(Throwable e) {
                e.printStackTrace();
            }
        }
    }
}