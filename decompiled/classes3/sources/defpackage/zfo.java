package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zfo implements defpackage.zfr {
    public final defpackage.zfp a;

    public zfo(defpackage.zfp zfpVar) {
        this.a = zfpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.zfo) && this.a == ((defpackage.zfo) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Failure(failureType=" + this.a + ')';
    }
}
