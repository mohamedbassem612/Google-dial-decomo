package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class czc implements defpackage.cyj {
    public int a;
    public int b;
    public long c = 0;
    public long d = defpackage.dpe.c(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    public long e = 0;

    private final void dy() {
        long j = this.c >> 32;
        long j2 = this.d;
        this.a = defpackage.aooc.w((int) j, defpackage.dpd.d(j2), defpackage.dpd.b(j2));
        long j3 = this.c & 4294967295L;
        long j4 = this.d;
        int iW = defpackage.aooc.w((int) j3, defpackage.dpd.c(j4), defpackage.dpd.a(j4));
        this.b = iW;
        int i = this.a;
        long j5 = this.c;
        this.e = (((long) ((i - ((int) (j5 >> 32))) / 2)) << 32) | (((long) ((iW - ((int) (j5 & 4294967295L))) / 2)) & 4294967295L);
    }

    protected final void A(long j) {
        if (this.d != j) {
            this.d = j;
            dy();
        }
    }

    public abstract void dg(long j, float f, defpackage.aonj aonjVar);

    public /* synthetic */ java.lang.Object g() {
        return null;
    }

    public int w() {
        return (int) (this.c & 4294967295L);
    }

    public int x() {
        return (int) (this.c >> 32);
    }

    public void y(long j, float f, defpackage.cso csoVar) {
        dg(j, f, null);
    }

    protected final void z(long j) {
        if (this.c != j) {
            this.c = j;
            dy();
        }
    }
}
