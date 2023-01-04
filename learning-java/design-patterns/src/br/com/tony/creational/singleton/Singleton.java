package br.com.tony.creational.singleton;

import java.util.Objects;


class SingletonEagerImpl {
    private static final SingletonEagerImpl eagerInstance = new SingletonEagerImpl();

    private SingletonEagerImpl() {}

    public static SingletonEagerImpl getEagerInstance() {
        return eagerInstance;
    }
}


class SingletonLazyImpl {
    private static SingletonLazyImpl lazyInstance;
    private SingletonLazyImpl(){}

    public static SingletonLazyImpl getLazyInstance() {
        if (Objects.isNull(lazyInstance)) {
            lazyInstance = new SingletonLazyImpl();
        }
        return lazyInstance;
    }
}

class SingletonThreadSafeImpl {
    private static SingletonThreadSafeImpl threadSafeInstance;

    private SingletonThreadSafeImpl(){}

    public static SingletonThreadSafeImpl getThreadSafeInstance() {
        synchronized (SingletonThreadSafeImpl.class) {
            if (Objects.isNull(threadSafeInstance)) {
                threadSafeInstance = new SingletonThreadSafeImpl();
            }
        }
        return threadSafeInstance;
    }
}

public class Singleton {
    public static void main(String[] args) {
        var eagerInstanceOne = SingletonEagerImpl.getEagerInstance();
        var eagerInstanceTwo = SingletonEagerImpl.getEagerInstance();

        System.out.println("Eager Instance");
        System.out.println(eagerInstanceOne);
        System.out.println(eagerInstanceTwo);

        var lazyInstanceOne = SingletonLazyImpl.getLazyInstance();
        var lazyInstanceTwo = SingletonLazyImpl.getLazyInstance();

        System.out.println("Lazy Instance");
        System.out.println(lazyInstanceOne);
        System.out.println(lazyInstanceTwo);

        var threadSafeInstanceOne = SingletonThreadSafeImpl.getThreadSafeInstance();
        var threadSafeInstanceTwo = SingletonThreadSafeImpl.getThreadSafeInstance();

        System.out.println("Thread Safe Instance");
        System.out.println(threadSafeInstanceOne);
        System.out.println(threadSafeInstanceTwo);
    }
}
