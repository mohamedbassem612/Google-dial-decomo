package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ell {
    public final float[] a;

    public ell(float[] fArr) {
        aooh.f(fArr, "points");
        this.a = fArr;
        if (fArr.length != 8) {
            throw new java.lang.IllegalArgumentException("Points array size should be 8");
        }
    }

    public final float a() {
        return this.a[0];
    }

    public final float b() {
        return this.a[1];
    }

    public final float c() {
        return this.a[6];
    }

    public final float d() {
        return this.a[7];
    }

    public final float e() {
        return this.a[2];
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ell) {
            return java.util.Arrays.equals(this.a, ((defpackage.ell) obj).a);
        }
        return false;
    }

    public final float f() {
        return this.a[3];
    }

    public final float g() {
        return this.a[4];
    }

    public final float h() {
        return this.a[5];
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.a);
    }

    public final long i(float f) {
        float f2 = 1.0f - f;
        float f3 = f2 * f2 * f2;
        float fA = a() * f3;
        float f4 = 3.0f * f;
        float f5 = f4 * f2 * f2;
        float fE = e() * f5;
        float f6 = f4 * f * f2;
        float fG = g() * f6;
        float f7 = f * f * f;
        float fC = c() * f7;
        float fB = b() * f3;
        float f8 = f() * f5;
        return mni.bj(fA + fE + fG + fC, fB + f8 + (h() * f6) + (d() * f7));
    }

    public final defpackage.ell j(defpackage.elu eluVar) {
        defpackage.ell ellVar = new defpackage.ell((byte[]) null);
        ajsz.de(this.a, ellVar.a, 0, 14);
        ellVar.m(eluVar, 0);
        ellVar.m(eluVar, 2);
        ellVar.m(eluVar, 4);
        ellVar.m(eluVar, 6);
        return ellVar;
    }

    public final aoiu k(float f) {
        long jI = i(f);
        float fA = a();
        float fB = b();
        float f2 = 1.0f - f;
        float fA2 = a() * f2;
        float fE = e() * f;
        float fB2 = b() * f2;
        float f3 = f() * f;
        float f4 = f2 * f2;
        float fA3 = a() * f4;
        float f5 = (f2 + f2) * f;
        float fE2 = e() * f5;
        float f6 = f * f;
        float fG = g() * f6;
        float fB3 = b() * f4;
        float f7 = f() * f5;
        defpackage.ell ellVarH = defpackage.aaf.h(fA, fB, fA2 + fE, fB2 + f3, fA3 + fE2 + fG, fB3 + f7 + (h() * f6), defpackage.akf.h(jI), defpackage.akf.i(jI));
        float fH = defpackage.akf.h(jI);
        float fI = defpackage.akf.i(jI);
        float fE3 = e() * f4;
        float fG2 = g() * f5;
        float fC = c() * f6;
        float f8 = f() * f4;
        float fH2 = h() * f5;
        return new aoiu(ellVarH, defpackage.aaf.h(fH, fI, fE3 + fG2 + fC, f8 + fH2 + (d() * f6), (g() * f2) + (c() * f), (h() * f2) + (d() * f), c(), d()));
    }

    public final boolean l() {
        return java.lang.Math.abs(a() - c()) < 1.0E-4f && java.lang.Math.abs(b() - d()) < 1.0E-4f;
    }

    public final void m(defpackage.elu eluVar, int i) {
        float[] fArr = this.a;
        int i2 = i + 1;
        long jA = eluVar.a(fArr[i], fArr[i2]);
        fArr[i] = java.lang.Float.intBitsToFloat((int) (jA >> 32));
        fArr[i2] = java.lang.Float.intBitsToFloat((int) (jA & 4294967295L));
    }

    public final java.lang.String toString() {
        return "anchor0: (" + a() + ", " + b() + ") control0: (" + e() + ", " + f() + "), control1: (" + g() + ", " + h() + "), anchor1: (" + c() + ", " + d() + ')';
    }

    public ell() {
        this((byte[]) null);
    }

    public /* synthetic */ ell(byte[] bArr) {
        this(new float[8]);
    }
}
