package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class awc implements defpackage.awb {
    private final /* synthetic */ int $cid;

    public awc(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awa, defpackage.awh
    public final float a() {
        return 0.0f;
    }

    @Override // defpackage.awa
    public final void b(defpackage.dpf dpfVar, int i, int[] iArr, defpackage.dpq dpqVar, int[] iArr2) {
        int i2 = this.$cid;
        if (i2 == 0) {
            if (dpqVar == defpackage.dpq.a) {
                defpackage.awi.d(i, iArr, iArr2, false);
                return;
            } else {
                defpackage.awi.d(i, iArr, iArr2, true);
                return;
            }
        }
        if (i2 != 1) {
            if (dpqVar == defpackage.dpq.a) {
                defpackage.awi.e(i, iArr, iArr2, false);
                return;
            } else {
                defpackage.awi.e(i, iArr, iArr2, true);
                return;
            }
        }
        if (dpqVar == defpackage.dpq.a) {
            defpackage.awi.a(i, iArr, iArr2, false);
        } else {
            defpackage.awi.a(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.awh
    public final void c(defpackage.dpf dpfVar, int i, int[] iArr, int[] iArr2) {
        int i2 = this.$cid;
        if (i2 == 0) {
            defpackage.awi.d(i, iArr, iArr2, false);
        } else if (i2 != 1) {
            defpackage.awi.e(i, iArr, iArr2, false);
        } else {
            defpackage.awi.a(i, iArr, iArr2, false);
        }
    }

    public final java.lang.String toString() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? "Arrangement#SpaceEvenly" : "Arrangement#Center";
        }
        return "Arrangement#SpaceBetween";
    }
}
