package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fha extends defpackage.erm {
    private static final java.lang.Object b = new java.lang.Object();
    private final long c;
    private final long d;
    private final boolean e;
    private final defpackage.eqt f;
    private final defpackage.eqp g;

    static {
        defpackage.eqk eqkVar = new defpackage.eqk();
        eqkVar.a = "SinglePeriodTimeline";
        eqkVar.b = android.net.Uri.EMPTY;
        eqkVar.a();
    }

    public fha(long j, long j2, boolean z, boolean z2, defpackage.eqt eqtVar) {
        defpackage.eqp eqpVar = z2 ? eqtVar.c : null;
        this.c = j;
        this.d = j2;
        this.e = z;
        ahvr.ci(eqtVar);
        this.f = eqtVar;
        this.g = eqpVar;
    }

    @Override // defpackage.erm
    public final int a(java.lang.Object obj) {
        return b.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.erm
    public final int b() {
        return 1;
    }

    @Override // defpackage.erm
    public final int c() {
        return 1;
    }

    @Override // defpackage.erm
    public final defpackage.erk d(int i, defpackage.erk erkVar, boolean z) {
        ahvr.ch(i, 1);
        erkVar.i(null, z ? b : null, 0, this.c, 0L, defpackage.ept.a, false, -9223372036854775807L);
        return erkVar;
    }

    @Override // defpackage.erm
    public final defpackage.erl e(int i, defpackage.erl erlVar, long j) {
        ahvr.ch(i, 1);
        erlVar.d(defpackage.erl.a, this.f, this.e, false, this.g, this.d);
        return erlVar;
    }

    @Override // defpackage.erm
    public final java.lang.Object f(int i) {
        ahvr.ch(i, 1);
        return b;
    }
}
