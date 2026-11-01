package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class adji {
    private static final long a;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        a = 86400000L;
    }

    public static defpackage.adjh n() {
        defpackage.adjh adjhVar = new defpackage.adjh();
        adjhVar.l(defpackage.aike.a);
        adjhVar.d(0);
        adjhVar.j(java.lang.System.currentTimeMillis());
        adjhVar.h(true);
        adjhVar.f(false);
        adjhVar.g(false);
        adjhVar.e(false);
        adjhVar.k(a);
        adjhVar.i(2);
        return adjhVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract long d();

    public abstract com.google.android.libraries.micore.superpacks.base.VersionedName e();

    public abstract defpackage.aify f();

    public abstract java.lang.String g();

    public abstract java.lang.String h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();

    public java.lang.String m() {
        throw null;
    }

    public java.lang.String toString() {
        defpackage.ahym ahymVar = new defpackage.ahym("");
        ahymVar.c();
        ahymVar.b("id", h());
        ahymVar.b("params", m());
        ahymVar.b("urls", f());
        ahymVar.e("prio", a());
        ahymVar.b("ttl", d() == 0 ? "never" : defpackage.adik.c(c() + d()));
        return ahymVar.toString();
    }
}
