package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eud {
    final /* synthetic */ defpackage.iay a;
    private final int b;
    private java.lang.Object c;
    private int d;
    private int e;
    private boolean f;
    private long g;

    public eud(defpackage.iay iayVar, int i) {
        j$.util.Objects.requireNonNull(iayVar);
        this.a = iayVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [etk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [etk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [eri, java.lang.Object] */
    public final void a() {
        long jO;
        defpackage.iay iayVar = this.a;
        ?? r1 = iayVar.e;
        defpackage.erm ermVarQ = r1.q();
        java.lang.Object objF = ermVarQ.n() ? null : ermVarQ.f(r1.j());
        int iG = r1.g();
        int iH = r1.h();
        long jN = r1.n();
        if (objF == null || iG != -1) {
            jO = iG != -1 ? r1.o() : -9223372036854775807L;
        } else {
            defpackage.erk erkVar = (defpackage.erk) iayVar.a;
            ermVarQ.m(objF, erkVar);
            jN -= erkVar.f();
            jO = eum.C(erkVar.d);
            iG = -1;
        }
        boolean zE = r1.e();
        if (!zE || jO == -9223372036854775807L || jN < jO) {
            ?? r0 = iayVar.g;
            r0.b(3);
            if (zE && jO != -9223372036854775807L) {
                defpackage.eyc eycVar = (defpackage.eyc) r1;
                eycVar.L();
                r0.g(3, (int) java.lang.Math.ceil((jO - jN) / eycVar.w.p.b));
            }
            this.f = false;
            return;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.f && j$.util.Objects.equals(objF, this.c) && iG == this.d && iH == this.e) {
            long j = jElapsedRealtime - this.g;
            int i = this.b;
            if (j >= i) {
                ((defpackage.exy) iayVar.f).a(new defpackage.euf(3, i));
                return;
            }
            return;
        }
        this.f = true;
        this.g = jElapsedRealtime;
        this.c = objF;
        this.d = iG;
        this.e = iH;
        ?? r2 = iayVar.g;
        r2.b(3);
        r2.g(3, this.b);
    }
}
