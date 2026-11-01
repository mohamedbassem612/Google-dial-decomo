package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gof extends defpackage.goh {
    public final int a;

    public gof(int i) {
        this.a = i;
        if (android.graphics.Color.alpha(i) != 255) {
            throw new java.lang.IllegalArgumentException("Background color must be opaque");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof defpackage.gof) && this.a == ((defpackage.gof) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "ColorBackground{color:" + java.lang.Integer.toHexString(this.a) + '}';
    }
}
