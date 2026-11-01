package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ulm extends defpackage.ulp {
    private final defpackage.uku b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulm(defpackage.uku ukuVar) {
        super(defpackage.ujq.SHOW_NON_SPAM_DIALOG);
        aooh.f(ukuVar, "model");
        this.b = ukuVar;
    }

    @Override // defpackage.ulp
    public final defpackage.uku a() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ulm) && aooh.n(this.b, ((defpackage.ulm) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ShowNonSpamDialog(model=" + this.b + ')';
    }
}
