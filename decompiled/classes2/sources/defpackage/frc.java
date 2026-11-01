package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
abstract class frc {
    public defpackage.fmk c;
    public defpackage.fll d;
    public defpackage.fqz e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public boolean o;
    public final defpackage.fqx b = new defpackage.fqx();
    public defpackage.hiz p = new defpackage.hiz();

    protected abstract long a(defpackage.etx etxVar);

    protected void b(boolean z) {
        int i;
        if (z) {
            this.p = new defpackage.hiz();
            this.g = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.k = i;
        this.f = -1L;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
    }

    protected abstract boolean c(defpackage.etx etxVar, long j, defpackage.hiz hizVar);

    protected byte[] e(long j) {
        return null;
    }

    protected final long f(long j) {
        return (j * 1000000) / ((long) this.l);
    }

    protected final long g(long j) {
        return (((long) this.l) * j) / 1000000;
    }

    protected void h(long j) {
        this.h = j;
        this.i = j;
        this.j = 0L;
    }
}
