package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ctc extends defpackage.cts {
    public final float a;

    public ctc(float f) {
        super(false, false);
        this.a = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ctc) && java.lang.Float.compare(this.a, ((defpackage.ctc) obj).a) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "HorizontalTo(x=" + this.a + ')';
    }
}
