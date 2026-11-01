package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class byf extends defpackage.bxn {
    public aomy n;
    public aonj o;
    public aii p;
    public aoub q;
    public final ceg r;
    public final defpackage.cnv s;

    public byf(aomy aomyVar, aonj aonjVar, long j, long j2, csm csmVar, csm csmVar2, float f) {
        super(j, j2, csmVar, csmVar2, f);
        this.n = aomyVar;
        this.o = aonjVar;
        this.r = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
        defpackage.cnv cnvVarN = ru.n(new defpackage.bru(this, 16));
        V(cnvVarN);
        this.s = cnvVarN;
    }

    @Override // defpackage.bxn
    protected final void b() {
        cfo.w(this.s);
    }

    @Override // defpackage.bxn
    protected final void d() {
        this.s.b();
    }

    @Override // defpackage.bxn
    protected final boolean g() {
        return this.r.c() > 0.0f;
    }

    public final void u() {
        this.p = null;
        this.l = -1;
    }

    public final void dc() {
    }
}
