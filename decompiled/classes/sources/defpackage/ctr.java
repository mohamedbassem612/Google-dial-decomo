package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ctr extends defpackage.cts {
    public final float a;

    public ctr(float f) {
        super(false, false);
        this.a = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ctr) && java.lang.Float.compare(this.a, ((defpackage.ctr) obj).a) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "VerticalTo(y=" + this.a + ')';
    }
}
