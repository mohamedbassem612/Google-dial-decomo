package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@java.lang.Deprecated
final class emi {
    static final defpackage.emi a = new defpackage.emi();
    private final java.util.Map c = new java.util.HashMap();
    public final java.util.Map b = new java.util.HashMap();

    private static final void d(java.util.Map map, defpackage.emh emhVar, emp empVar, java.lang.Class cls) {
        emp empVar2 = (emp) map.get(emhVar);
        if (empVar2 == null) {
            map.put(emhVar, empVar);
            return;
        }
        if (empVar != empVar2) {
            throw new java.lang.IllegalArgumentException("Method " + emhVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + empVar2.toString() + ", new value " + java.lang.String.valueOf(empVar));
        }
    }

    public final defpackage.emg a(java.lang.Class cls, java.lang.reflect.Method[] methodArr) {
        int i;
        java.lang.Class superclass = cls.getSuperclass();
        java.util.HashMap map = new java.util.HashMap();
        if (superclass != null) {
            map.putAll(b(superclass).b);
        }
        for (java.lang.Class<?> cls2 : cls.getInterfaces()) {
            for (java.util.Map.Entry entry : b(cls2).b.entrySet()) {
                d(map, (defpackage.emh) entry.getKey(), (emp) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (java.lang.reflect.Method method : methodArr) {
            androidx.lifecycle.OnLifecycleEvent onLifecycleEvent = (androidx.lifecycle.OnLifecycleEvent) method.getAnnotation(androidx.lifecycle.OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else {
                    if (!emx.class.isAssignableFrom(parameterTypes[0])) {
                        throw new java.lang.IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                emp empVarA = onLifecycleEvent.a();
                if (length > 1) {
                    if (!emp.class.isAssignableFrom(parameterTypes[1])) {
                        throw new java.lang.IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (empVarA != emp.ON_ANY) {
                        throw new java.lang.IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (length > 2) {
                    throw new java.lang.IllegalArgumentException("cannot have more than 2 params");
                }
                d(map, new defpackage.emh(i, method), empVarA, cls);
                z = true;
            }
        }
        defpackage.emg emgVar = new defpackage.emg(map);
        this.c.put(cls, emgVar);
        this.b.put(cls, java.lang.Boolean.valueOf(z));
        return emgVar;
    }

    final defpackage.emg b(java.lang.Class cls) {
        defpackage.emg emgVar = (defpackage.emg) this.c.get(cls);
        return emgVar == null ? a(cls, null) : emgVar;
    }

    public final java.lang.reflect.Method[] c(java.lang.Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (java.lang.NoClassDefFoundError e) {
            throw new java.lang.IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
