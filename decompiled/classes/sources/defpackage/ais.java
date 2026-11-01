package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ais extends defpackage.aiw {
    public float a;

    public ais(float f) {
        this.a = f;
    }

    @Override // defpackage.aiw
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.aiw
    public final int b() {
        return 1;
    }

    @Override // defpackage.aiw
    public final /* synthetic */ defpackage.aiw c() {
        return new defpackage.ais(0.0f);
    }

    @Override // defpackage.aiw
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.aiw
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ais) && ((defpackage.ais) obj).a == this.a;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
