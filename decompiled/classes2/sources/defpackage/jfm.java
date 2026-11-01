package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jfm implements defpackage.jfo {
    public final defpackage.ihv a;

    public jfm(defpackage.ihv ihvVar) {
        this.a = ihvVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.jfm) && this.a == ((defpackage.jfm) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "BeeslySessionStopResultFailure(error=" + this.a + ')';
    }
}
