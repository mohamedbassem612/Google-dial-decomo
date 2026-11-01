package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acsr {
    public boolean a;
    public int b;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float y;
    public float z;
    public float[] c = new float[0];
    public float[] d = new float[0];
    public float[] e = new float[0];
    public float[] f = new float[0];
    public final float[] q = new float[4];
    public final android.graphics.PathMeasure r = new android.graphics.PathMeasure();
    public final float[] s = new float[2];
    public final float[] t = new float[2];
    public final float[] u = new float[4];
    public final int[] v = new int[4];
    public float w = -1.0f;
    public float x = -1.0f;

    public final boolean a(float f, float f2, float f3, float f4) {
        int i = this.b - 1;
        float f5 = this.f[i];
        float f6 = -this.e[i];
        float f7 = (f5 * f3) + (f6 * f4);
        if (f7 >= this.z) {
            return true;
        }
        float fAtan2 = (float) java.lang.Math.atan2((f5 * f4) - (f6 * f3), f7);
        float f8 = this.c[i];
        float f9 = this.d[i];
        float fCeil = (float) java.lang.Math.ceil(java.lang.Math.abs(fAtan2) / this.y);
        int i2 = 1;
        while (true) {
            int i3 = (int) fCeil;
            if (i2 >= i3) {
                return true;
            }
            float f10 = i2 / i3;
            double d = fAtan2 * f10;
            float fCos = (float) java.lang.Math.cos(d);
            float fSin = (float) java.lang.Math.sin(d);
            float f11 = 1.0f - f10;
            if (!b((f11 * f8) + (f10 * f), (f11 * f9) + (f10 * f2), (f5 * fCos) - (f6 * fSin), (fSin * f5) + (fCos * f6))) {
                return false;
            }
            i2++;
        }
    }

    public final boolean b(float f, float f2, float f3, float f4) {
        int i = this.b;
        if (i == 512) {
            return false;
        }
        if (i == this.c.length) {
            int iW = aooc.w(i << 1, 48, 512);
            float[] fArrCopyOf = java.util.Arrays.copyOf(this.c, iW);
            aooh.e(fArrCopyOf, "copyOf(...)");
            this.c = fArrCopyOf;
            float[] fArrCopyOf2 = java.util.Arrays.copyOf(this.d, iW);
            aooh.e(fArrCopyOf2, "copyOf(...)");
            this.d = fArrCopyOf2;
            float[] fArrCopyOf3 = java.util.Arrays.copyOf(this.e, iW);
            aooh.e(fArrCopyOf3, "copyOf(...)");
            this.e = fArrCopyOf3;
            float[] fArrCopyOf4 = java.util.Arrays.copyOf(this.f, iW);
            aooh.e(fArrCopyOf4, "copyOf(...)");
            this.f = fArrCopyOf4;
        }
        this.c[i] = f;
        this.d[i] = f2;
        this.e[i] = -f4;
        this.f[i] = f3;
        this.b = i + 1;
        return true;
    }
}
