package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agvr extends defpackage.agwm {
    public final java.lang.Throwable a;

    public agvr(java.lang.Throwable th) {
        this.a = th;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.agvr) && aooh.n(this.a, ((defpackage.agvr) obj).a);
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
