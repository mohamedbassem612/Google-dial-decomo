package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abgs implements defpackage.abgw {
    public final float a;

    public abgs(float f) {
        this.a = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.abgs) && java.lang.Float.compare(this.a, ((defpackage.abgs) obj).a) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "TouchCanceled(progress=" + this.a + ')';
    }
}
