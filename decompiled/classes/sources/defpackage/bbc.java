package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bbc {
    public boolean a;
    public java.lang.Object b;
    public final defpackage.bej c;
    private final defpackage.cei d;
    private final defpackage.cei e;

    public bbc(int i, int i2) {
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(i);
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(i2);
        this.c = new defpackage.bej(i, 30, 100);
    }

    public final int a() {
        return this.d.c();
    }

    public final int b() {
        return this.e.c();
    }

    public final void c(int i) {
        this.d.h(i);
    }

    public final void d(int i) {
        this.e.h(i);
    }

    public final void e(int i, int i2) {
        if (i < 0.0f) {
            avo.c(defpackage.a.bw((byte) 41, i, "Index should be non-negative ("));
        }
        c(i);
        this.c.c(i);
        d(i2);
    }
}
