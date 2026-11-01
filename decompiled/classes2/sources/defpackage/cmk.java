package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cmk implements cmi {
    public final float a;

    public cmk(float f) {
        this.a = f;
    }

    public final int a(int i, int i2, dpq dpqVar) {
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.cmk) && java.lang.Float.compare(this.a, ((defpackage.cmk) obj).a) == 0;
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
