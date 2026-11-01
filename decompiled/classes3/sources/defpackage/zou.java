package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zou extends aehj {
    public final java.lang.Throwable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zou(java.lang.Throwable th) {
        super((char[]) null);
        aooh.f(th, "error");
        this.a = th;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.zou) && aooh.n(this.a, ((defpackage.zou) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Failure(error=" + this.a + ')';
    }
}
