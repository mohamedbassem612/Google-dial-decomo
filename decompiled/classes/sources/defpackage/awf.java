package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class awf implements defpackage.awa {
    private final /* synthetic */ int $cid;

    public awf(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awa, defpackage.awh
    public final /* synthetic */ float a() {
        return 0.0f;
    }

    @Override // defpackage.awa
    public final void b(defpackage.dpf dpfVar, int i, int[] iArr, defpackage.dpq dpqVar, int[] iArr2) {
        if (this.$cid != 0) {
            if (dpqVar == defpackage.dpq.a) {
                defpackage.awi.c(i, iArr, iArr2, false);
                return;
            } else {
                defpackage.awi.b(iArr, iArr2, true);
                return;
            }
        }
        if (dpqVar == defpackage.dpq.a) {
            defpackage.awi.b(iArr, iArr2, false);
        } else {
            defpackage.awi.c(i, iArr, iArr2, true);
        }
    }

    public final java.lang.String toString() {
        return this.$cid != 0 ? "Arrangement#End" : "Arrangement#Start";
    }
}
