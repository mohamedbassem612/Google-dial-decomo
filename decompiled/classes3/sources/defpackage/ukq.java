package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ukq implements defpackage.uks {
    public final defpackage.uki a;

    public ukq(defpackage.uki ukiVar) {
        aooh.f(ukiVar, "model");
        this.a = ukiVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ukq) && aooh.n(this.a, ((defpackage.ukq) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ShowSpamDialog(model=" + this.a + ')';
    }
}
