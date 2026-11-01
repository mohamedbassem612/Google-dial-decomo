package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class czb implements defpackage.dpf {
    private boolean a;

    public static /* synthetic */ void A(defpackage.czb czbVar, defpackage.czc czcVar, long j, defpackage.aonj aonjVar, int i) {
        if ((i & 4) != 0) {
            aonjVar = defpackage.czd.a;
        }
        czbVar.v(czcVar, j, 0.0f, aonjVar);
    }

    public static /* synthetic */ void B(defpackage.czb czbVar, defpackage.czc czcVar, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        defpackage.aonj aonjVar = defpackage.czd.a;
        if (czbVar.p() == defpackage.dpq.a || czbVar.n() == 0) {
            czbVar.r(czcVar);
            czcVar.dg(defpackage.dpn.d(j, czcVar.e), 0.0f, aonjVar);
        } else {
            czbVar.r(czcVar);
            czcVar.dg(defpackage.dpn.d((((long) ((czbVar.n() - czcVar.a) - ((int) (j >> 32)))) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), czcVar.e), 0.0f, aonjVar);
        }
    }

    public static /* synthetic */ void z(defpackage.czb czbVar, defpackage.czc czcVar, int i, int i2, defpackage.aonj aonjVar, int i3) {
        if ((i3 & 8) != 0) {
            aonjVar = defpackage.czd.a;
        }
        czbVar.y(czcVar, i, i2, aonjVar);
    }

    @Override // defpackage.dpf
    public float a() {
        throw null;
    }

    @Override // defpackage.dpl
    public float b() {
        throw null;
    }

    @Override // defpackage.dpl
    public final /* synthetic */ float dh(long j) {
        return defpackage.dfd.m(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float di(float f) {
        return (f / a()) + 0.0f;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dj(int i) {
        return (i / a()) + 0.0f;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dk(long j) {
        return defpackage.dfd.o(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dl(float f) {
        return f * a();
    }

    @Override // defpackage.dpf
    /* JADX INFO: renamed from: do */
    public final /* synthetic */ int mo1do(long j) {
        throw null;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ int dp(float f) {
        return defpackage.dfd.p(this, f);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dq(long j) {
        return defpackage.dfd.q(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dr(long j) {
        return defpackage.dfd.r(this, j);
    }

    @Override // defpackage.dpl
    public final /* synthetic */ long ds(float f) {
        return defpackage.dfd.n(this, f);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dt(float f) {
        return ds(di(f));
    }

    public abstract int n();

    public defpackage.cxi o() {
        return null;
    }

    public abstract defpackage.dpq p();

    public float q(defpackage.czi cziVar) {
        return Float.NaN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(defpackage.czc czcVar) {
        if (czcVar instanceof defpackage.dcb) {
            ((defpackage.dcb) czcVar).U(this.a);
        }
    }

    public final void s(defpackage.czc czcVar, int i, int i2, float f) {
        r(czcVar);
        czcVar.dg(defpackage.dpn.d((((long) i) << 32) | (((long) i2) & 4294967295L), czcVar.e), f, null);
    }

    public final void t(defpackage.czc czcVar, long j, float f) {
        r(czcVar);
        czcVar.dg(defpackage.dpn.d(j, czcVar.e), f, null);
    }

    public final void u(defpackage.czc czcVar, int i, int i2, float f) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (p() == defpackage.dpq.a || n() == 0) {
            r(czcVar);
            czcVar.dg(defpackage.dpn.d(j, czcVar.e), f, null);
        } else {
            r(czcVar);
            czcVar.dg(defpackage.dpn.d((((long) ((n() - czcVar.a) - ((int) (j >> 32)))) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), czcVar.e), f, null);
        }
    }

    public final void v(defpackage.czc czcVar, long j, float f, defpackage.aonj aonjVar) {
        r(czcVar);
        czcVar.dg(defpackage.dpn.d(j, czcVar.e), f, aonjVar);
    }

    public final void w(defpackage.czc czcVar, long j, defpackage.cso csoVar, float f) {
        r(czcVar);
        czcVar.y(defpackage.dpn.d(j, czcVar.e), f, csoVar);
    }

    public final void x(defpackage.aonj aonjVar) {
        this.a = true;
        aonjVar.a(this);
        this.a = false;
    }

    public final void y(defpackage.czc czcVar, int i, int i2, defpackage.aonj aonjVar) {
        r(czcVar);
        czcVar.dg(defpackage.dpn.d((((long) i) << 32) | (((long) i2) & 4294967295L), czcVar.e), 0.0f, aonjVar);
    }
}
