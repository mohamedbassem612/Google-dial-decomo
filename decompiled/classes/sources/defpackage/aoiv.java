package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoiv implements java.io.Serializable {
    public final java.lang.Throwable a;

    public aoiv(java.lang.Throwable th) {
        if (th == null) {
            defpackage.aooh.i("exception");
        }
        this.a = th;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aoiv) && defpackage.aooh.n(this.a, ((defpackage.aoiv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Failure(" + this.a + ')';
    }
}
