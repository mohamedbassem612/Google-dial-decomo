package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agpx implements defpackage.xzp {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;
    private final java.lang.Object b;

    public agpx(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aehm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xzp] */
    @Override // defpackage.xzp
    public final /* synthetic */ boolean a(java.lang.Object obj) {
        if (this.$cid != 0) {
            return ((defpackage.aelb) obj).b.d;
        }
        return this.b.a(defpackage.aelb.b((defpackage.agqt) obj, this.a));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aehm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, xzp] */
    @Override // defpackage.xzp
    public final /* synthetic */ ucm b(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        if (this.$cid == 0) {
            return this.b.b(defpackage.aelb.b((defpackage.agqt) obj, this.a), i, i2, xusVar);
        }
        defpackage.aelb aelbVar = (defpackage.aelb) obj;
        ahvr.bN(i == i2, "Width and height must be the same");
        int i3 = 120;
        if (i != Integer.MIN_VALUE) {
            java.lang.Object obj2 = this.b;
            if (i <= 0) {
                i3 = 64;
            } else {
                float f = i / ((android.content.Context) obj2).getResources().getDisplayMetrics().density;
                int[] iArr = {32, 48, 64, 120, 240};
                for (int i4 = 0; i4 < 5; i4++) {
                    i3 = iArr[i4];
                    if (i3 == 0) {
                        throw null;
                    }
                    if (f > i3) {
                    }
                }
                i3 = 240;
            }
        }
        return new ucm(aelbVar, new defpackage.aelc(this, aelbVar, i3));
    }
}
