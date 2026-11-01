package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bej implements defpackage.cer {
    private final int a;
    private final int b;
    private final defpackage.ccp c;
    private int d;

    public bej(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        int i4 = (i / i2) * i2;
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.aooc.C(java.lang.Math.max(i4 - i3, 0), i4 + i2 + i3), defpackage.cdu.c);
        this.d = i;
    }

    @Override // defpackage.cer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.aopq a() {
        return (defpackage.aopq) this.c.a();
    }

    public final void c(int i) {
        if (i != this.d) {
            this.d = i;
            int i2 = this.a;
            int i3 = this.b;
            int i4 = (i / i2) * i2;
            this.c.b(defpackage.aooc.C(java.lang.Math.max(i4 - i3, 0), i4 + i2 + i3));
        }
    }
}
