package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eub {
    final /* synthetic */ defpackage.iay a;
    private java.lang.Object b;
    private int c;
    private int d;
    private long e;
    private long f;
    private boolean g;
    private long h;

    public eub(defpackage.iay iayVar) {
        j$.util.Objects.requireNonNull(iayVar);
        this.a = iayVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [etk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [etk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [eri, java.lang.Object] */
    public final void a() {
        defpackage.iay iayVar = this.a;
        ?? r1 = iayVar.e;
        if (r1.k() != 2 || !r1.x() || r1.l() != 0) {
            if (this.g) {
                iayVar.g.b(1);
            }
            this.g = false;
            return;
        }
        defpackage.erm ermVarQ = r1.q();
        java.lang.Object objF = ermVarQ.n() ? null : ermVarQ.f(r1.j());
        int iG = r1.g();
        int iH = r1.h();
        long jM = r1.m();
        long jMax = java.lang.Math.max(0L, r1.p() - java.lang.Math.max(0L, jM - r1.n()));
        if (objF != null && iG == -1) {
            jM -= ermVarQ.m(objF, (defpackage.erk) iayVar.a).f();
            iG = -1;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.g && j$.util.Objects.equals(objF, this.b) && iG == this.c && iH == this.d && jM == this.e && jMax == this.f) {
            if (jElapsedRealtime - this.h >= 600000) {
                ((defpackage.exy) iayVar.f).a(new defpackage.euf(1, 600000));
                return;
            }
            return;
        }
        this.g = true;
        this.h = jElapsedRealtime;
        this.b = objF;
        this.c = iG;
        this.d = iH;
        this.e = jM;
        this.f = jMax;
        ?? r15 = iayVar.g;
        r15.b(1);
        r15.g(1, 600000);
    }
}
