package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ait extends defpackage.aiw {
    public float a;
    public float b;

    public ait(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.aiw
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.aiw
    public final int b() {
        return 2;
    }

    @Override // defpackage.aiw
    public final /* synthetic */ defpackage.aiw c() {
        return new defpackage.ait(0.0f, 0.0f);
    }

    @Override // defpackage.aiw
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.aiw
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ait) {
            defpackage.ait aitVar = (defpackage.ait) obj;
            if (aitVar.a == this.a && aitVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
