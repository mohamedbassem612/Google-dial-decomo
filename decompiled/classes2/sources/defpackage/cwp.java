package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cwp implements defpackage.cwr, defpackage.cwo {
    private final /* synthetic */ defpackage.cwo a;
    private final dpq b;

    public cwp(defpackage.cwo cwoVar, dpq dpqVar) {
        this.a = cwoVar;
        this.b = dpqVar;
    }

    public final float a() {
        return this.a.a();
    }

    public final float b() {
        return this.a.b();
    }

    public final float dh(long j) {
        return this.a.dh(j);
    }

    public final float di(float f) {
        return this.a.di(f);
    }

    public final float dj(int i) {
        return this.a.dj(i);
    }

    public final float dk(long j) {
        return this.a.dk(j);
    }

    public final float dl(float f) {
        return this.a.dl(f);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final int m86do(long j) {
        return this.a.do(j);
    }

    public final int dp(float f) {
        return this.a.dp(f);
    }

    public final long dq(long j) {
        return this.a.dq(j);
    }

    public final long dr(long j) {
        return this.a.dr(j);
    }

    public final long ds(float f) {
        return this.a.ds(f);
    }

    public final long dt(float f) {
        return this.a.dt(f);
    }

    public final /* synthetic */ cyf du(int i, int i2, java.util.Map map, aonj aonjVar) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i < 0) {
            i = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            cwh.d(a.bA(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new defpackage.cxg(i, i2, map, 1);
    }

    public final /* synthetic */ cyf dv(int i, int i2, aonj aonjVar, aonn aonnVar, java.util.Map map, aonj aonjVar2) {
        return den.y(this, i, i2, aonjVar, aonnVar, map, aonjVar2);
    }

    public final boolean dw() {
        return false;
    }

    public final cyf dx(int i, int i2, java.util.Map map, aonj aonjVar) {
        throw null;
    }

    public final dpq p() {
        return this.b;
    }

    @Override // defpackage.cwo
    public final long s() {
        return this.a.s();
    }
}
