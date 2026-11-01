package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aawy implements defpackage.aaxa {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public aawy(defpackage.aawx aawxVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aawxVar);
        this.a = aawxVar;
    }

    @Override // defpackage.aaxa
    public final void a(defpackage.aawu aawuVar) {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((defpackage.aawx) obj).a = aawuVar;
        } else {
            ((defpackage.aawz) obj).a = aawuVar;
        }
    }

    public aawy(defpackage.aawz aawzVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aawzVar);
        this.a = aawzVar;
    }
}
