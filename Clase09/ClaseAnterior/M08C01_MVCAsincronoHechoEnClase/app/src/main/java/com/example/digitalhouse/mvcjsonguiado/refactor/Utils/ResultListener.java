package com.example.digitalhouse.mvcjsonguiado.refactor.Utils;

/**
 * Created by digitalhouse on 18/01/18.
 */

// El tipo que pase por paŕametro es el mismo tipo que va a devolver finish.
public interface ResultListener<T> {
    void finish(T resultado);
}
