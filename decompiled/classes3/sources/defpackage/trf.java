package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class trf implements defpackage.tri {
    public final defpackage.trg a;

    public trf(defpackage.trg trgVar) {
        this.a = trgVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.trf) && aooh.n(this.a, ((defpackage.trf) obj).a);
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
