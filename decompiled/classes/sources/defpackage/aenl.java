package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aenl {
    private static final defpackage.aenl b;
    private static volatile boolean c;
    private static volatile defpackage.aenl d;
    public final defpackage.aenm a;

    static {
        defpackage.aenl aenlVar = new defpackage.aenl(new defpackage.aenk());
        b = aenlVar;
        c = true;
        d = aenlVar;
    }

    public aenl(defpackage.aenm aenmVar) {
        aenmVar.getClass();
        this.a = aenmVar;
    }

    public static defpackage.aenl a() {
        if (d == b && c) {
            c = false;
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).m(java.lang.Math.random() < 0.01d ? defpackage.aioa.FULL : defpackage.aioa.NONE)).l("com/google/android/libraries/performance/primes/Primes", "get", 179, "Primes.java")).v("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.");
        }
        return d;
    }

    public static synchronized void c(defpackage.aenl aenlVar) {
        if (d == b) {
            d = aenlVar;
        }
    }

    public final defpackage.aeun b() {
        return this.a.a();
    }

    public final void d(defpackage.aenj aenjVar, long j, long j2) {
        this.a.j(aenjVar, j, j2);
    }

    public final void e(aeto aetoVar) {
        this.a.e(aetoVar);
    }

    public final void f(defpackage.aeun aeunVar, defpackage.aenj aenjVar, int i) {
        this.a.n(aeunVar, aenjVar, i);
    }

    public final void g(defpackage.aenj aenjVar) {
        this.a.k(aenjVar);
    }
}
