package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fvj implements defpackage.fma {
    public final long a;
    private final defpackage.fvh b;
    private final int c;
    private final long d;
    private final long e;

    public fvj(defpackage.fvh fvhVar, int i, long j, long j2) {
        this.b = fvhVar;
        this.c = i;
        this.d = j;
        long j3 = (j2 - j) / ((long) fvhVar.d);
        this.e = j3;
        this.a = e(j3);
    }

    private final long e(long j) {
        return eum.z(((long) this.c) * j, 1000000L, this.b.c);
    }

    @Override // defpackage.fma
    public final long a() {
        return this.a;
    }

    @Override // defpackage.fma
    public final defpackage.fly b(long j) {
        long j2 = this.c;
        long j3 = this.e;
        defpackage.fvh fvhVar = this.b;
        long j4 = j3 - 1;
        long jS = eum.s((((long) fvhVar.c) * j) / (j2 * 1000000), 0L, j4);
        long j5 = fvhVar.d;
        long jE = e(jS);
        long j6 = this.d;
        defpackage.fmb fmbVar = new defpackage.fmb(jE, (jS * j5) + j6);
        if (jE >= j || jS == j4) {
            return new defpackage.fly(fmbVar, fmbVar);
        }
        long j7 = jS + 1;
        return new defpackage.fly(fmbVar, new defpackage.fmb(e(j7), j6 + (j5 * j7)));
    }

    @Override // defpackage.fma
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.fma
    public final boolean d() {
        return true;
    }
}
