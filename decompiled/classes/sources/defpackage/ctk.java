package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ctk extends defpackage.cts {
    public final float a;

    public ctk(float f) {
        super(false, false);
        this.a = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ctk) && java.lang.Float.compare(this.a, ((defpackage.ctk) obj).a) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "RelativeHorizontalTo(dx=" + this.a + ')';
    }
}
