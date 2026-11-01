package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ukp implements defpackage.uks {
    public final defpackage.ujd a;

    public ukp(defpackage.ujd ujdVar) {
        aooh.f(ujdVar, "model");
        this.a = ujdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ukp) && aooh.n(this.a, ((defpackage.ukp) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ShowNonSpamDialog(model=" + this.a + ')';
    }
}
