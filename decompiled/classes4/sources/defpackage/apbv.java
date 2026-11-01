package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apbv {
    public static final /* synthetic */ int a = 0;
    private static final int b = c(java.lang.Throwable.class, -1);
    private static final defpackage.apbl c;

    static {
        apcw apcwVar;
        try {
            apcwVar = apbw.a ? apcw.a : defpackage.apbf.a;
        } catch (java.lang.Throwable unused) {
            apcwVar = apcw.a;
        }
        c = apcwVar;
    }

    public static final java.lang.Throwable a(java.lang.Throwable th) {
        java.lang.Object objAe;
        if (!(th instanceof aosm)) {
            return (java.lang.Throwable) c.a(th.getClass()).a(th);
        }
        try {
            objAe = ((aosm) th).a();
        } catch (java.lang.Throwable th2) {
            objAe = aooc.ae(th2);
        }
        if (true == (objAe instanceof aoiv)) {
            objAe = null;
        }
        return (java.lang.Throwable) objAe;
    }

    public static final aonj b(java.lang.Class cls) {
        aonj aonjVar;
        aoiu aoiuVar;
        aoiu aoiuVar2;
        agkh agkhVar = new agkh(18);
        java.lang.Object next = null;
        try {
            final java.lang.reflect.Method method = cls.getMethod("copyForStackTraceRecovery", null);
            return new aonj() { // from class: apbq
                public final java.lang.Object a(java.lang.Object obj) {
                    java.lang.Object objAe;
                    java.lang.Throwable th = (java.lang.Throwable) obj;
                    int i = defpackage.apbv.a;
                    try {
                        objAe = (java.lang.Throwable) method.invoke(th, null);
                    } catch (java.lang.Throwable th2) {
                        objAe = aooc.ae(th2);
                    }
                    return (java.lang.Throwable) (true != (objAe instanceof aoiv) ? objAe : null);
                }
            };
        } catch (java.lang.NoClassDefFoundError | java.lang.NoSuchMethodException | java.lang.SecurityException unused) {
            if (b != c(cls, 0)) {
                return agkhVar;
            }
            java.lang.reflect.Constructor<?>[] constructors = cls.getConstructors();
            java.util.ArrayList arrayList = new java.util.ArrayList(constructors.length);
            for (final java.lang.reflect.Constructor<?> constructor : constructors) {
                java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length = parameterTypes.length;
                if (length != 0) {
                    if (length == 1) {
                        java.lang.Class<?> cls2 = parameterTypes[0];
                        if (aooh.n(cls2, java.lang.String.class)) {
                            aoiuVar = new aoiu(new agkc(new aonj() { // from class: apbs
                                public final java.lang.Object a(java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
                                    java.lang.Throwable th = (java.lang.Throwable) obj;
                                    int i = defpackage.apbv.a;
                                    java.lang.Object objNewInstance = constructor.newInstance(th.getMessage());
                                    aooh.d(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                    java.lang.Throwable th2 = (java.lang.Throwable) objNewInstance;
                                    th2.initCause(th);
                                    return th2;
                                }
                            }, 19), 2);
                        } else if (aooh.n(cls2, java.lang.Throwable.class)) {
                            aoiuVar = new aoiu(new agkc(new aonj() { // from class: apbt
                                public final java.lang.Object a(java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
                                    int i = defpackage.apbv.a;
                                    java.lang.Object objNewInstance = constructor.newInstance((java.lang.Throwable) obj);
                                    aooh.d(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                    return (java.lang.Throwable) objNewInstance;
                                }
                            }, 19), 1);
                        } else {
                            aoiuVar2 = new aoiu((java.lang.Object) null, -1);
                        }
                    } else if (length != 2) {
                        aoiuVar2 = new aoiu((java.lang.Object) null, -1);
                    } else if (aooh.n(parameterTypes[0], java.lang.String.class) && aooh.n(parameterTypes[1], java.lang.Throwable.class)) {
                        aoiuVar = new aoiu(new agkc(new aonj() { // from class: apbr
                            public final java.lang.Object a(java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
                                java.lang.Throwable th = (java.lang.Throwable) obj;
                                int i = defpackage.apbv.a;
                                java.lang.Object objNewInstance = constructor.newInstance(th.getMessage(), th);
                                aooh.d(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                return (java.lang.Throwable) objNewInstance;
                            }
                        }, 19), 3);
                    } else {
                        aoiuVar2 = new aoiu((java.lang.Object) null, -1);
                    }
                    arrayList.add(aoiuVar2);
                } else {
                    aoiuVar = new aoiu(new agkc(new aonj() { // from class: apbu
                        public final java.lang.Object a(java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
                            int i = defpackage.apbv.a;
                            java.lang.Object objNewInstance = constructor.newInstance(null);
                            aooh.d(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                            java.lang.Throwable th = (java.lang.Throwable) objNewInstance;
                            th.initCause((java.lang.Throwable) obj);
                            return th;
                        }
                    }, 19), 0);
                }
                aoiuVar2 = aoiuVar;
                arrayList.add(aoiuVar2);
            }
            java.util.Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((java.lang.Number) ((aoiu) next).b).intValue();
                    do {
                        java.lang.Object next2 = it.next();
                        int iIntValue2 = ((java.lang.Number) ((aoiu) next2).b).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            }
            aoiu aoiuVar3 = (aoiu) next;
            return (aoiuVar3 == null || (aonjVar = (aonj) aoiuVar3.a) == null) ? agkhVar : aonjVar;
        }
    }

    private static final int c(java.lang.Class cls, int i) {
        java.lang.Object objAe;
        aooc.L(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                    if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (java.lang.Throwable th) {
                objAe = aooc.ae(th);
            }
        } while (cls != null);
        objAe = java.lang.Integer.valueOf(i2);
        java.lang.Object objValueOf = java.lang.Integer.valueOf(i);
        if (true == (objAe instanceof aoiv)) {
            objAe = objValueOf;
        }
        return ((java.lang.Number) objAe).intValue();
    }
}
