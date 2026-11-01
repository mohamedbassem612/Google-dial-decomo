package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class euc {
    final /* synthetic */ defpackage.iay a;
    private final int b;
    private java.lang.Object c;
    private int d;
    private int e;
    private long f;
    private boolean g;
    private long h;

    public euc(defpackage.iay iayVar, int i) {
        j$.util.Objects.requireNonNull(iayVar);
        this.a = iayVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [etk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [etk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [eri, java.lang.Object] */
    public final void a() {
        defpackage.iay iayVar = this.a;
        ?? r1 = iayVar.e;
        if (!r1.e()) {
            if (this.g) {
                iayVar.g.b(2);
            }
            this.g = false;
            return;
        }
        defpackage.erm ermVarQ = r1.q();
        java.lang.Object objF = ermVarQ.n() ? null : ermVarQ.f(r1.j());
        int iG = r1.g();
        int iH = r1.h();
        long jN = r1.n();
        if (objF != null && iG == -1) {
            jN -= ermVarQ.m(objF, (defpackage.erk) iayVar.a).f();
            iG = -1;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.g && j$.util.Objects.equals(objF, this.c) && iG == this.d && iH == this.e && jN == this.f) {
            long j = jElapsedRealtime - this.h;
            int i = this.b;
            if (j >= i) {
                ((defpackage.exy) iayVar.f).a(new defpackage.euf(2, i));
                return;
            }
            return;
        }
        this.g = true;
        this.h = jElapsedRealtime;
        this.c = objF;
        this.d = iG;
        this.e = iH;
        this.f = jN;
        ?? r0 = iayVar.g;
        r0.b(2);
        r0.g(2, this.b);
    }
}
