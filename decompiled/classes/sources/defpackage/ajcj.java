package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajcj {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.aijz b;
    private static final defpackage.aijz c;

    static {
        defpackage.aiju aijuVar = defpackage.aiju.a;
        defpackage.aikq aikqVar = new defpackage.aikq(new defpackage.aiei(new defpackage.aidi(new defpackage.agqh(9), aijuVar), new defpackage.aidi(new defpackage.agqh(10), aijuVar)));
        b = aikqVar;
        c = new defpackage.aidi(new defpackage.agqh(11), aikqVar);
    }

    public static java.lang.Exception a(java.lang.Class cls, java.lang.Throwable th) {
        java.util.List listAsList = java.util.Arrays.asList(cls.getConstructors());
        defpackage.aijz aijzVar = c;
        java.lang.Object[] objArrBr = defpackage.ahvr.br(listAsList);
        java.util.Arrays.sort(objArrBr, aijzVar);
        java.util.Iterator it = new java.util.ArrayList(java.util.Arrays.asList(objArrBr)).iterator();
        while (it.hasNext()) {
            java.lang.Exception exc = (java.lang.Exception) b((java.lang.reflect.Constructor) it.next(), th);
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th);
                }
                return exc;
            }
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bJ(cls, "No appropriate constructor for exception of type ", " in response to chained exception"), th);
    }

    private static java.lang.Object b(java.lang.reflect.Constructor constructor, java.lang.Throwable th) {
        java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
        java.lang.Object[] objArr = new java.lang.Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            java.lang.Class<?> cls = parameterTypes[i];
            if (cls.equals(java.lang.String.class)) {
                objArr[i] = th.toString();
            } else {
                if (!cls.equals(java.lang.Throwable.class)) {
                    return null;
                }
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }
}
