package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lrz implements defpackage.lsc {
    public final defpackage.lsa a;

    public lrz(defpackage.lsa lsaVar) {
        this.a = lsaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.lrz) && aooh.n(this.a, ((defpackage.lrz) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Failed(reason=" + this.a + ')';
    }
}
