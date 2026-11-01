package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiu extends defpackage.aiw {
    private float a;
    private float b;
    private float c;

    public aiu(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.aiw
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // defpackage.aiw
    public final int b() {
        return 3;
    }

    @Override // defpackage.aiw
    public final /* synthetic */ defpackage.aiw c() {
        return new defpackage.aiu(0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.aiw
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // defpackage.aiw
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.aiu) {
            defpackage.aiu aiuVar = (defpackage.aiu) obj;
            if (aiuVar.a == this.a && aiuVar.b == this.b && aiuVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c);
    }

    public final java.lang.String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
