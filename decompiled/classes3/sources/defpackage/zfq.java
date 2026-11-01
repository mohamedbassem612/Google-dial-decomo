package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zfq implements defpackage.zfr {
    public final defpackage.zfu a;

    public zfq(defpackage.zfu zfuVar) {
        aooh.f(zfuVar, "session");
        this.a = zfuVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.zfq) && aooh.n(this.a, ((defpackage.zfq) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Success(session=" + this.a + ')';
    }
}
