package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tgi extends snl {
    public final java.lang.Throwable a;

    public tgi(java.lang.Throwable th) {
        aooh.f(th, "throwable");
        this.a = th;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.tgi) && aooh.n(this.a, ((defpackage.tgi) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Error(throwable=" + this.a + ')';
    }
}
