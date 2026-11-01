package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gne {
    private final java.lang.ClassLoader a;

    public gne(java.lang.ClassLoader classLoader, byte[] bArr) {
        if (classLoader == null) {
            defpackage.aooh.i("loader");
        }
        this.a = classLoader;
    }

    public final java.lang.Class a() throws java.lang.ClassNotFoundException {
        java.lang.Class<?> clsLoadClass = this.a.loadClass("java.util.function.Predicate");
        defpackage.aooh.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final java.lang.Object b(defpackage.aopu aopuVar, defpackage.aopu aopuVar2, defpackage.aonn aonnVar) {
        java.lang.Object objNewProxyInstance = java.lang.reflect.Proxy.newProxyInstance(this.a, new java.lang.Class[]{a()}, new gnc(aopuVar, aopuVar2, aonnVar));
        defpackage.aooh.e(objNewProxyInstance, "newProxyInstance(...)");
        return objNewProxyInstance;
    }

    public final java.lang.Object c(defpackage.aopu aopuVar, defpackage.aonj aonjVar) {
        java.lang.Object objNewProxyInstance = java.lang.reflect.Proxy.newProxyInstance(this.a, new java.lang.Class[]{a()}, new gnd(aopuVar, aonjVar));
        defpackage.aooh.e(objNewProxyInstance, "newProxyInstance(...)");
        return objNewProxyInstance;
    }

    public final java.lang.Class d() {
        try {
            return e();
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    public final java.lang.Class e() throws java.lang.ClassNotFoundException {
        java.lang.Class<?> clsLoadClass = this.a.loadClass("java.util.function.Consumer");
        defpackage.aooh.e(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final java.lang.Object f(defpackage.aopu aopuVar, defpackage.aonj aonjVar) {
        java.lang.Object objNewProxyInstance = java.lang.reflect.Proxy.newProxyInstance(this.a, new java.lang.Class[]{e()}, new gmx(aopuVar, aonjVar));
        defpackage.aooh.e(objNewProxyInstance, "newProxyInstance(...)");
        return objNewProxyInstance;
    }

    public gne(java.lang.ClassLoader classLoader) {
        this.a = classLoader;
    }
}
