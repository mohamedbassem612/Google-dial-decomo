package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class axr implements cyi {
    final /* synthetic */ cyi a;

    public axr(cyi cyiVar) {
        this.a = cyiVar;
    }

    public final float a() {
        return this.a.a();
    }

    public final float b() {
        return this.a.b();
    }

    public final /* synthetic */ float dh(long j) {
        return dfd.m(this, j);
    }

    public final /* synthetic */ float di(float f) {
        return (f / a()) + 0.0f;
    }

    public final /* synthetic */ float dj(int i) {
        return (i / a()) + 0.0f;
    }

    public final /* synthetic */ float dk(long j) {
        return dfd.o(this, j);
    }

    public final /* synthetic */ float dl(float f) {
        return f * a();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final /* synthetic */ int m73do(long j) {
        return java.lang.Math.round(dfd.o(this, j));
    }

    public final /* synthetic */ int dp(float f) {
        return dfd.p(this, f);
    }

    public final /* synthetic */ long dq(long j) {
        return dfd.q(this, j);
    }

    public final /* synthetic */ long dr(long j) {
        return dfd.r(this, j);
    }

    public final /* synthetic */ long ds(float f) {
        return dfd.n(this, f);
    }

    public final /* synthetic */ long dt(float f) {
        return dfd.n(this, (f / a()) + 0.0f);
    }

    public final /* synthetic */ cyf du(int i, int i2, java.util.Map map, aonj aonjVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            cwh.d(a.bA(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new defpackage.cyg(i, i2, map, this, aonjVar);
    }

    public final /* synthetic */ cyf dv(int i, int i2, aonj aonjVar, aonn aonnVar, java.util.Map map, aonj aonjVar2) {
        return den.y(this, i, i2, aonjVar, aonnVar, map, aonjVar2);
    }

    public final /* synthetic */ boolean dw() {
        return false;
    }

    public final /* synthetic */ cyf dx(int i, int i2, java.util.Map map, aonj aonjVar) {
        throw null;
    }

    public final dpq p() {
        return this.a.p();
    }
}
