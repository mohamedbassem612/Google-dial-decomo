package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gyf {
    public static final java.lang.String a = defpackage.gsh.b("NetworkRequestCompat");
    public final java.lang.Object b;

    public gyf(java.lang.Object obj) {
        this.b = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.gyf) && defpackage.aooh.n(this.b, ((defpackage.gyf) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        java.lang.Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final java.lang.String toString() {
        return "NetworkRequestCompat(wrapped=" + this.b + ')';
    }

    public gyf() {
        this(null);
    }
}
