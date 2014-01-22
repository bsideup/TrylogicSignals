package ru.trylogic.signals;

abstract public class FourArgsSignal  <T extends FourArgsSignal, ARG0, ARG1, ARG2, ARG3> extends SignalBase<FourArgsSignalListener<T, ARG0, ARG1, ARG2, ARG3>> {

    public void call(ARG0 arg0, ARG1 arg1, ARG2 arg2, ARG3 arg3) {
        for(FourArgsSignalListener listener : listeners) {
            try {
                listener.onSignal((T) this, arg0, arg1, arg2, arg3);
            } catch(Throwable e) {
                e.printStackTrace();
            }
        }
    }
}