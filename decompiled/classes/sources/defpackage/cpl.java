package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cpl {
    public float a = 0.0f;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;

    public final void a(float f, float f2, float f3, float f4) {
        this.a = java.lang.Math.max(f, this.a);
        this.b = java.lang.Math.max(f2, this.b);
        this.c = java.lang.Math.min(f3, this.c);
        this.d = java.lang.Math.min(f4, this.d);
    }

    public final void b(long j) {
        int i = (int) (4294967295L & j);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i);
        this.a += fIntBitsToFloat;
        this.b += fIntBitsToFloat2;
        this.c += fIntBitsToFloat;
        this.d += fIntBitsToFloat2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public final boolean c() {
        return (((this.a > this.c ? 1 : (this.a == this.c ? 0 : -1)) ^ (-1)) | ((this.b > this.d ? 1 : (this.b == this.d ? 0 : -1)) ^ (-1))) >>> 31;
    }

    public final void d(float f, float f2) {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
    }

    public final java.lang.String toString() {
        return "MutableRect(" + defpackage.rz.j(this.a) + ", " + defpackage.rz.j(this.b) + ", " + defpackage.rz.j(this.c) + ", " + defpackage.rz.j(this.d) + ')';
    }
}
