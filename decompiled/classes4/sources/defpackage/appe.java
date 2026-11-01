package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class appe implements java.io.Closeable {
    public static final defpackage.appe a;
    public static final defpackage.appe b;

    static {
        defpackage.appe applVar;
        try {
            java.lang.Class.forName("java.nio.file.Files");
            applVar = new defpackage.appm();
        } catch (java.lang.ClassNotFoundException unused) {
            applVar = new defpackage.appl();
        }
        a = applVar;
        java.lang.String str = defpackage.appp.a;
        java.lang.String property = java.lang.System.getProperty("java.io.tmpdir");
        aooh.e(property, "getProperty(...)");
        defpackage.antw.r(property);
        java.lang.ClassLoader classLoader = defpackage.apqp.class.getClassLoader();
        aooh.e(classLoader, "getClassLoader(...)");
        b = new defpackage.apqp(classLoader, applVar);
    }

    public abstract defpackage.appd a(defpackage.appp apppVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
