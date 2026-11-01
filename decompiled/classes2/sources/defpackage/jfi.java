package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jfi implements defpackage.jfl {
    public final defpackage.ihp a;

    public jfi(defpackage.ihp ihpVar) {
        this.a = ihpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.jfi) && this.a == ((defpackage.jfi) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "BeeslySessionReserveFailure(error=" + this.a + ')';
    }
}
