package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoiw implements java.io.Serializable {
    public final java.lang.Object a;

    public static int a(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static java.lang.String b(java.lang.Object obj) {
        return obj instanceof defpackage.aoiv ? ((defpackage.aoiv) obj).toString() : defpackage.a.bF((byte) 41, obj, "Success(");
    }

    public static final java.lang.Throwable c(java.lang.Object obj) {
        if (obj instanceof defpackage.aoiv) {
            return ((defpackage.aoiv) obj).a;
        }
        return null;
    }

    public static final boolean d(java.lang.Object obj) {
        return !(obj instanceof defpackage.aoiv);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aoiw) && defpackage.aooh.n(this.a, ((defpackage.aoiw) obj).a);
    }

    public final int hashCode() {
        return a(this.a);
    }

    public final java.lang.String toString() {
        return b(this.a);
    }
}
