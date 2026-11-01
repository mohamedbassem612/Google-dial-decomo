package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bfz implements defpackage.bfy {
    private final float a;

    public bfz(float f) {
        this.a = f;
    }

    @Override // defpackage.bfy
    public final float a(long j, defpackage.dpf dpfVar) {
        return dpfVar.dl(this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.bfz) && java.lang.Float.compare(this.a, ((defpackage.bfz) obj).a) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
