package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoml {
    public static final java.lang.reflect.Method a;
    public static final java.lang.reflect.Method b;

    static {
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method[] methods = java.lang.Throwable.class.getMethods();
        aooh.c(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i];
            if (aooh.n(method2.getName(), "addSuppressed")) {
                java.lang.Class<?>[] parameterTypes = method2.getParameterTypes();
                aooh.e(parameterTypes, "getParameterTypes(...)");
                aooh.f(parameterTypes, "<this>");
                if (aooh.n(parameterTypes.length == 1 ? parameterTypes[0] : null, java.lang.Throwable.class)) {
                    break;
                }
            }
            i++;
        }
        a = method2;
        for (java.lang.reflect.Method method3 : methods) {
            if (aooh.n(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
        }
        b = method;
    }
}
