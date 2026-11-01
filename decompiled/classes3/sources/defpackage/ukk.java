package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ukk implements defpackage.ukm {
    public final defpackage.uku a;

    public ukk(defpackage.uku ukuVar) {
        aooh.f(ukuVar, "model");
        this.a = ukuVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ukk) && aooh.n(this.a, ((defpackage.ukk) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "SpamBlockingPromoEvent(model=" + this.a + ')';
    }
}
