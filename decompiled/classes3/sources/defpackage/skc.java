package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class skc implements defpackage.ske {
    private final java.lang.Throwable a;

    public skc(java.lang.Throwable th) {
        aooh.f(th, "throwable");
        this.a = th;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.skc) && aooh.n(this.a, ((defpackage.skc) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Failed(throwable=" + this.a + ')';
    }
}
