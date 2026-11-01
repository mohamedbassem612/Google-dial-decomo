package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acso {
    public boolean C;
    public final android.graphics.Paint D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float[] L;
    public boolean M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float[] V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public int a;
    public float aa;
    public float ab;
    public float ac;
    public float ad;
    public float ae;
    public float af;
    public float ag;
    public float ah;
    public float ai;
    public float aj;
    public int v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean[] b = new boolean[0];
    public float[] c = new float[0];
    public float[] d = new float[0];
    public float[] e = new float[0];
    public float[] f = new float[0];
    public float[] g = new float[0];
    public float[] h = new float[0];
    public float[] i = new float[0];
    public float[] j = new float[0];
    public float[] k = new float[0];
    public float[] l = new float[0];
    public float[] m = new float[0];
    public float[] n = new float[0];
    public float[] o = new float[0];
    public float[] p = new float[0];
    public float[] q = new float[0];
    public float[] r = new float[0];
    public int[] s = new int[0];
    public short[] t = new short[0];
    public short[] u = new short[0];
    public final float[] z = new float[400];
    public final int[] A = new int[400];
    public final short[] B = defpackage.acsp.c(25, 8);

    public acso() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-1);
        paint.setDither(true);
        this.D = paint;
        this.L = new float[4];
        this.P = 1.0f;
        this.T = 1.0f;
        this.V = defpackage.acsp.d;
    }

    public final float a(float f, float f2, float f3) {
        return aooc.s((c(f, f2) * 0.25f) + f3, 0.0f, 1.0f);
    }

    public final float b(float f) {
        if (f <= 0.0f) {
            return 1.0f;
        }
        if (f >= 1.0f) {
            return 0.0f;
        }
        float f2 = f * 64.0f;
        float[] fArr = this.V;
        int i = (int) f2;
        float f3 = fArr[i];
        return f3 + ((fArr[i + 1] - f3) * (f2 - i));
    }

    public final float c(float f, float f2) {
        float fS = 1.0f - aooc.s(((this.H - f) + ((1.0f - (f2 + f2)) * this.U)) / this.T, 0.0f, 1.0f);
        return fS * fS * fS;
    }

    public final float d(float f, float f2, float f3, float f4, float f5) {
        float fMin = java.lang.Math.min(defpackage.acsp.b(f, f2, this.G, this.H, f5), 0.0f);
        float fMax = java.lang.Math.max(f3, 0.0f);
        float f6 = fMax - fMin;
        float fS = f6 <= 1.0E-5f ? 0.5f : aooc.s(fMax / f6, 0.0f, 1.0f) * 0.5f;
        float fS2 = aooc.s(fMax / f4, 0.0f, 1.0f) * 0.5f;
        float fS3 = fS2 + ((fS - fS2) * aooc.s(4.0f * fS * fS, 0.0f, 1.0f));
        return 1.0f - (fS3 + fS3);
    }

    public final float e(float f, float f2, float f3) {
        float fB = defpackage.acsp.b(f, f2, this.ah, this.ai, this.aj);
        if (fB >= 0.0f) {
            return 1.0f;
        }
        return f3 / (f3 - fB);
    }

    public final int f(float f, float f2) {
        float fS = aooc.s(f2, 0.0f, 1.0f);
        float fS2 = aooc.s(f, 0.0f, 1.0f);
        float f3 = this.W;
        float f4 = fS2 * (f3 + ((this.aa - f3) * fS));
        float f5 = this.X;
        float f6 = f5 + ((this.ab - f5) * fS);
        float f7 = this.Y;
        float f8 = f7 + ((this.ac - f7) * fS);
        float f9 = this.Z;
        float f10 = f9 + ((this.ad - f9) * fS);
        return (((int) (f4 + 0.5f)) << 24) | (((int) (f6 + 0.5f)) << 16) | (((int) (f8 + 0.5f)) << 8) | ((int) (f10 + 0.5f));
    }

    public final void g(defpackage.acsr acsrVar, int i, int i2) {
        this.i[i2] = acsrVar.c[i];
        this.j[i2] = acsrVar.d[i];
        this.k[i2] = acsrVar.e[i];
        this.l[i2] = acsrVar.f[i];
        this.m[i2] = this.d[i];
        this.n[i2] = this.e[i];
        this.o[i2] = this.f[i];
        this.p[i2] = this.g[i];
        this.q[i2] = this.h[i];
    }

    public final void h(android.graphics.Canvas canvas) {
        canvas.drawVertices(android.graphics.Canvas.VertexMode.TRIANGLES, this.v, this.r, 0, null, 0, this.s, 0, this.y ? this.t : this.u, 0, this.w, this.D);
    }

    public final void i(float f, float f2) {
        float f3 = this.K;
        float f4 = f * f3;
        float f5 = (-f2) * f3;
        int i = defpackage.acsq.a;
        float f6 = this.R;
        this.ae = defpackage.acsq.a((f4 * 0.4f) + 0.4f + f6, (f5 * 0.4f) + 0.4f + f6);
        float f7 = this.R;
        float fA = defpackage.acsq.a(((f4 * 0.46f) + 0.46f) - f7, ((f5 * 0.46f) + 0.46f) - f7);
        this.af = fA;
        float f8 = (this.ae + fA) * 0.5f;
        this.ag = f8 * f8 * (3.0f - (f8 + f8));
    }

    public final void j(int i, float f, float f2, float f3, float f4) {
        float[] fArr = this.r;
        float f5 = this.E + f;
        int i2 = i << 1;
        fArr[i2] = f5;
        fArr[i2 + 1] = this.F + f2;
        this.s[i] = f(f3, f4);
    }

    public final void k(defpackage.acsr acsrVar, int i, int i2, float f, float f2, int i3) {
        float[] fArr = this.c;
        float f3 = fArr[i];
        float f4 = fArr[i2];
        if (f4 - f3 > 0.5f) {
            f4 -= 1.0f;
        } else if (f3 - f4 > 0.5f) {
            f4 += 1.0f;
        }
        if (f4 > f3) {
            f = f2;
        }
        float f5 = f4 - f3;
        float fS = f5 == 0.0f ? 0.0f : aooc.s((f - f3) / f5, 0.0f, 1.0f);
        float[] fArr2 = this.i;
        float[] fArr3 = acsrVar.c;
        float f6 = 1.0f - fS;
        fArr2[i3] = (fArr3[i] * f6) + (fArr3[i2] * fS);
        float[] fArr4 = this.j;
        float[] fArr5 = acsrVar.d;
        fArr4[i3] = (fArr5[i] * f6) + (fArr5[i2] * fS);
        float[] fArr6 = acsrVar.e;
        float f7 = fArr6[i];
        float f8 = fArr6[i2] * fS;
        float[] fArr7 = acsrVar.f;
        float f9 = (fArr7[i] * f6) + (fArr7[i2] * fS);
        float f10 = (f7 * f6) + f8;
        float fSqrt = (float) java.lang.Math.sqrt((f10 * f10) + (f9 * f9));
        float[] fArr8 = this.k;
        if (fSqrt > 1.0E-6f) {
            fArr8[i3] = f10 / fSqrt;
            this.l[i3] = f9 / fSqrt;
        } else {
            fArr8[i3] = acsrVar.e[i];
            this.l[i3] = acsrVar.f[i];
        }
        this.m[i3] = 0.0f;
        float[] fArr9 = this.n;
        float[] fArr10 = this.e;
        fArr9[i3] = (fArr10[i] * f6) + (fArr10[i2] * fS);
        float[] fArr11 = this.o;
        float[] fArr12 = this.f;
        fArr11[i3] = (fArr12[i] * f6) + (fArr12[i2] * fS);
        float[] fArr13 = this.p;
        float[] fArr14 = this.g;
        fArr13[i3] = (fArr14[i] * f6) + (fArr14[i2] * fS);
        float[] fArr15 = this.q;
        float[] fArr16 = this.h;
        fArr15[i3] = (f6 * fArr16[i]) + (fS * fArr16[i2]);
    }
}
