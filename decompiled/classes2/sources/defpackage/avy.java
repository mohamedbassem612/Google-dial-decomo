package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class avy implements awa {
    private final /* synthetic */ int $cid;

    public avy(int i) {
        this.$cid = i;
    }

    public final /* synthetic */ float a() {
        return 0.0f;
    }

    public final void b(dpf dpfVar, int i, int[] iArr, dpq dpqVar, int[] iArr2) {
        if (this.$cid != 0) {
            awi.b(iArr, iArr2, false);
        } else {
            awi.c(i, iArr, iArr2, false);
        }
    }

    public final java.lang.String toString() {
        return this.$cid != 0 ? "AbsoluteArrangement#Left" : "AbsoluteArrangement#Right";
    }
}
