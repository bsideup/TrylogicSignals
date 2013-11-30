package ru.trylogic.signals;

abstract public class TwoArgsSignal<T extends TwoArgsSignal, ARG0, ARG1> extends SignalBase<TwoArgsSignalListener<T, ARG0, ARG1>> {

    public void call(ARG0 arg0, ARG1 arg1) {
        for(TwoArgsSignalListener listener : listeners) {
            try {
                listener.onSignal((T) this, arg0, arg1);
            } catch(Throwable e) {
                e.printStackTrace();
            }
        }
    }
}
