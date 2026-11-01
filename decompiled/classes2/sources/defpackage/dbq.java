package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dbq implements dpf {
    public boolean a;
    public long b = 9223372034707292159L;
    public long c = 0;
    public final /* synthetic */ dbt d;
    public adq e;
    private final czi f;

    public dbq(dbt dbtVar, czi cziVar) {
        this.d = dbtVar;
        this.f = cziVar;
    }

    public final float a() {
        return this.d.a();
    }

    public final float b() {
        return this.d.b();
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
    public final /* synthetic */ int m89do(long j) {
        throw null;
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

    public final void n(czi cziVar, float f) {
        dbt dbtVar = this.d;
        defpackage.yg ygVar = dbtVar.r;
        if (ygVar == null) {
            ygVar = new defpackage.yg();
            dbtVar.r = ygVar;
        }
        int iCJ = ajsz.cJ((java.lang.Object[]) ygVar.c, cziVar);
        if (iCJ < 0) {
            int i = ygVar.a;
            java.lang.Object obj = ygVar.c;
            if (i == ((czi[]) obj).length) {
                int i2 = i << 1;
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf((java.lang.Object[]) obj, i2);
                aooh.e(objArrCopyOf, "copyOf(...)");
                ygVar.c = (czi[]) objArrCopyOf;
                float[] fArrCopyOf = java.util.Arrays.copyOf((float[]) ygVar.b, i2);
                aooh.e(fArrCopyOf, "copyOf(...)");
                ygVar.b = fArrCopyOf;
                byte[] bArrCopyOf = java.util.Arrays.copyOf((byte[]) ygVar.d, i2);
                aooh.e(bArrCopyOf, "copyOf(...)");
                ygVar.d = bArrCopyOf;
            }
            ((czi[]) ygVar.c)[i] = cziVar;
            ((byte[]) ygVar.d)[i] = 3;
            ((float[]) ygVar.b)[i] = f;
            ygVar.a++;
        } else {
            float[] fArr = (float[]) ygVar.b;
            if (fArr[iCJ] == f) {
                byte[] bArr = (byte[]) ygVar.d;
                if (bArr[iCJ] == 2) {
                    bArr[iCJ] = 0;
                }
            } else {
                fArr[iCJ] = f;
                ((byte[]) ygVar.d)[iCJ] = 1;
            }
        }
        czi cziVar2 = this.f;
        if (cziVar2 == null || aooh.n(cziVar, cziVar2)) {
            return;
        }
        adq adqVar = this.e;
        if (adqVar == null) {
            adqVar = new adq(2);
            this.e = adqVar;
        }
        if (adqVar.e(cziVar)) {
            return;
        }
        adqVar.q(cziVar);
    }

    public final void o() {
        this.a = false;
    }
}
