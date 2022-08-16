package br.com.tony.generics.classes;

import java.util.Map;

public class GenericClassTwoParamExample<K, V> {
    private Map<K, V> genericMap;

    public Map<K, V> getGenericMap() {
        return genericMap;
    }

    public void setGenericMap(Map<K, V> genericMap) {
        this.genericMap = genericMap;
    }
}
