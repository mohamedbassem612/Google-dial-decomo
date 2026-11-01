package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class umh extends defpackage.umk {
    private final defpackage.uku b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public umh(defpackage.uku ukuVar) {
        super(defpackage.ukv.BLOCK_AND_REPORT_AS_SPAM);
        aooh.f(ukuVar, "model");
        this.b = ukuVar;
    }

    @Override // defpackage.umk
    public final defpackage.uku a() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.umh) && aooh.n(this.b, ((defpackage.umh) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "BlockAndReportAsSpam(model=" + this.b + ')';
    }
}
