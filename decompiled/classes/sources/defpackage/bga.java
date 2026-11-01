package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bga implements defpackage.bfy {
    private final float a;

    public bga(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            avo.c("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.bfy
    public final float a(long j, defpackage.dpf dpfVar) {
        return defpackage.cpp.a(j) * (this.a / 100.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.bga) && java.lang.Float.compare(this.a, ((defpackage.bga) obj).a) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
