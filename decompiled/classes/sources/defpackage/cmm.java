package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cmm implements defpackage.cmi {
    private final float a;

    public cmm(float f) {
        this.a = f;
    }

    @Override // defpackage.cmi
    public final int a(int i, int i2, defpackage.dpq dpqVar) {
        defpackage.dpq dpqVar2 = defpackage.dpq.a;
        float f = this.a;
        if (dpqVar != dpqVar2) {
            f = -f;
        }
        return java.lang.Math.round(((i2 - i) / 2.0f) * (f + 1.0f));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.cmm) && java.lang.Float.compare(this.a, ((defpackage.cmm) obj).a) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "Horizontal(bias=" + this.a + ')';
    }
}
