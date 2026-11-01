package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class awg implements defpackage.awh {
    private final /* synthetic */ int $cid;

    public awg(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awh
    public final /* synthetic */ float a() {
        return 0.0f;
    }

    @Override // defpackage.awh
    public final void c(defpackage.dpf dpfVar, int i, int[] iArr, int[] iArr2) {
        if (this.$cid != 0) {
            defpackage.awi.c(i, iArr, iArr2, false);
        } else {
            defpackage.awi.b(iArr, iArr2, false);
        }
    }

    public final java.lang.String toString() {
        return this.$cid != 0 ? "Arrangement#Bottom" : "Arrangement#Top";
    }
}
