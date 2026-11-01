package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anrh {
    public final java.lang.Class a;
    public final java.lang.reflect.Method b;
    public final java.lang.reflect.Method c;
    public final java.lang.reflect.Method d;
    public final java.util.List e;

    public anrh(java.lang.Class cls, java.lang.ClassLoader classLoader) throws java.lang.NoSuchMethodException {
        java.lang.Class clsAsSubclass = cls.asSubclass(ahvs.class);
        this.a = clsAsSubclass;
        this.d = clsAsSubclass.getMethod("getScopes", null);
        java.lang.reflect.Method declaredMethod = java.lang.Class.forName("ahwf", false, classLoader).asSubclass(ahvs.class).getDeclaredMethod("newBuilder", null);
        this.b = declaredMethod;
        java.lang.Class<?> returnType = declaredMethod.getReturnType();
        this.c = returnType.getMethod("build", null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.e = arrayList;
        java.lang.reflect.Method method = clsAsSubclass.getMethod("getClientId", null);
        arrayList.add(new defpackage.anri(method, returnType.getMethod("setClientId", method.getReturnType())));
        java.lang.reflect.Method method2 = clsAsSubclass.getMethod("getClientEmail", null);
        arrayList.add(new defpackage.anri(method2, returnType.getMethod("setClientEmail", method2.getReturnType())));
        java.lang.reflect.Method method3 = clsAsSubclass.getMethod("getPrivateKey", null);
        arrayList.add(new defpackage.anri(method3, returnType.getMethod("setPrivateKey", method3.getReturnType())));
        java.lang.reflect.Method method4 = clsAsSubclass.getMethod("getPrivateKeyId", null);
        arrayList.add(new defpackage.anri(method4, returnType.getMethod("setPrivateKeyId", method4.getReturnType())));
        java.lang.reflect.Method method5 = clsAsSubclass.getMethod("getQuotaProjectId", null);
        arrayList.add(new defpackage.anri(method5, returnType.getMethod("setQuotaProjectId", method5.getReturnType())));
    }
}
