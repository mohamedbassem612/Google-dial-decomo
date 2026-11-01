package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ctq extends defpackage.cts {
    public final float a;

    public ctq(float f) {
        super(false, false);
        this.a = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ctq) && java.lang.Float.compare(this.a, ((defpackage.ctq) obj).a) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "RelativeVerticalTo(dy=" + this.a + ')';
    }
}
