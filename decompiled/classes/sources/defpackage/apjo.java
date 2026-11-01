package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class apjo implements java.io.Closeable {
    public static final defpackage.apjo c;

    static {
        defpackage.appb appbVar = defpackage.appb.a;
        if (appbVar == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.apoy apoyVar = new defpackage.apoy();
        apoyVar.J(appbVar);
        c = new defpackage.apjn(appbVar.c(), apoyVar);
    }

    public abstract long a();

    public abstract defpackage.appa c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        defpackage.apjv.j(c());
    }

    public final java.io.InputStream d() {
        return c().m();
    }

    public abstract defpackage.apiy fO();
}
