package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cqo {
    public final int a;

    public static boolean a(int i, java.lang.Object obj) {
        return (obj instanceof defpackage.cqo) && i == ((defpackage.cqo) obj).a;
    }

    public final boolean equals(java.lang.Object obj) {
        return a(this.a, obj);
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        int i = this.a;
        if (i == 0) {
            return "Argb8888";
        }
        if (i == 1) {
            return "Alpha8";
        }
        if (i == 2) {
            return "Rgb565";
        }
        return i == 3 ? "F16" : "Gpu";
    }
}
