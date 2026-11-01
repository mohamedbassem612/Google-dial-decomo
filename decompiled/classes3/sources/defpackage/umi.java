package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class umi extends defpackage.umk {
    private final defpackage.uku b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public umi(defpackage.uku ukuVar) {
        super(defpackage.ukv.ENABLE_SPAM_BLOCKING);
        aooh.f(ukuVar, "model");
        this.b = ukuVar;
    }

    @Override // defpackage.umk
    public final defpackage.uku a() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.umi) && aooh.n(this.b, ((defpackage.umi) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "EnableSpamBlocking(model=" + this.b + ')';
    }
}
