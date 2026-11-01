package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiv extends defpackage.aiw {
    public float a;
    public float b;
    public float c;
    public float d;

    public aiv(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.aiw
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // defpackage.aiw
    public final int b() {
        return 4;
    }

    @Override // defpackage.aiw
    public final /* synthetic */ defpackage.aiw c() {
        return new defpackage.aiv(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.aiw
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // defpackage.aiw
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else if (i == 3) {
            this.d = f;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.aiv) {
            defpackage.aiv aivVar = (defpackage.aiv) obj;
            if (aivVar.a == this.a && aivVar.b == this.b && aivVar.c == this.c && aivVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}
