package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fmh implements defpackage.fll {
    public final long a;
    private final defpackage.fll b;

    public fmh(long j, defpackage.fll fllVar) {
        this.a = j;
        this.b = fllVar;
    }

    @Override // defpackage.fll
    public final defpackage.fmk r(int i, int i2) {
        return this.b.r(i, i2);
    }

    @Override // defpackage.fll
    public final void s() {
        this.b.s();
    }

    @Override // defpackage.fll
    public final void y(defpackage.fma fmaVar) {
        this.b.y(new defpackage.fmg(this, fmaVar, fmaVar));
    }
}
