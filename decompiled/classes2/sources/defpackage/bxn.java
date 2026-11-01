package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class bxn extends dap {
    public long a;
    public long b;
    public csm c;
    public csm d;
    public float e;
    public aii j;
    public aoub k;
    public float f = 75.398224f;
    public float g = 0.0f;
    public final defpackage.bxz h = new defpackage.bxz();
    public final defpackage.bxy i = new defpackage.bxy();
    public final ceg m = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
    public int l = -1;

    public bxn(long j, long j2, csm csmVar, csm csmVar2, float f) {
        this.a = j;
        this.b = j2;
        this.c = csmVar;
        this.d = csmVar2;
        this.e = f;
    }

    protected abstract void b();

    protected abstract void d();

    public final void e() {
        int i;
        f();
        if (((cmv) this).D && aosv.r(M()) && g()) {
            if (dpi.a(0.0f, 0.0f) <= 0 || dpi.a(this.f, 0.0f) <= 0 || (i = this.l) <= 0) {
                this.m.h(0.0f);
                return;
            }
            int iT = aooc.t(java.lang.Math.round((this.f / 0.0f) * 1000.0f * i), 50);
            float fC = this.m.c();
            this.j = aij.a(fC);
            this.k = aoov.an(M(), (aolr) null, 0, new defpackage.bxm(this, fC, iT, null), 3);
        }
    }

    public final void f() {
        aoub aoubVar = this.k;
        if (aoubVar != null) {
            aoubVar.s((java.util.concurrent.CancellationException) null);
        }
        this.k = null;
        this.j = null;
    }

    protected abstract boolean g();
}
