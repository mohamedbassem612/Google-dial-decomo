package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ukl implements defpackage.ukm {
    public final defpackage.uku a;

    public ukl(defpackage.uku ukuVar) {
        aooh.f(ukuVar, "model");
        this.a = ukuVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ukl) && aooh.n(this.a, ((defpackage.ukl) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "SpamCallerEvent(model=" + this.a + ')';
    }
}
