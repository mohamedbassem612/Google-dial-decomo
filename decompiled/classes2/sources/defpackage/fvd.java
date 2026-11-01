package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fvd implements defpackage.fve {
    private static final int[] a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final defpackage.fll c;
    private final defpackage.fmk d;
    private final defpackage.fvh e;
    private final int f;
    private final byte[] g;
    private final defpackage.etx h;
    private final int i;
    private final defpackage.eqg j;
    private int k;
    private long l;
    private int m;
    private long n;

    public fvd(defpackage.fll fllVar, defpackage.fmk fmkVar, defpackage.fvh fvhVar) throws defpackage.era {
        this.c = fllVar;
        this.d = fmkVar;
        this.e = fvhVar;
        int iMax = java.lang.Math.max(1, fvhVar.c / 10);
        this.i = iMax;
        defpackage.etx etxVar = new defpackage.etx(fvhVar.f);
        etxVar.l();
        int iL = etxVar.l();
        this.f = iL;
        int i = fvhVar.b;
        int i2 = (((fvhVar.d - (i << 2)) << 3) / (fvhVar.e * i)) + 1;
        if (iL != i2) {
            throw new defpackage.era(a.bf(iL, i2, "Expected frames per block: ", "; got: "), null, true, 1);
        }
        java.lang.String str = eum.a;
        int i3 = ((iMax + iL) - 1) / iL;
        this.g = new byte[fvhVar.d * i3];
        this.h = new defpackage.etx(i3 * (iL << 1) * i);
        int i4 = ((fvhVar.c * fvhVar.d) << 3) / iL;
        defpackage.eqf eqfVar = new defpackage.eqf();
        eqfVar.c("audio/raw");
        eqfVar.h = i4;
        eqfVar.i = i4;
        eqfVar.o = (iMax << 1) * i;
        eqfVar.F = fvhVar.b;
        eqfVar.G = defpackage.esv.g(fvhVar.g);
        eqfVar.H = fvhVar.c;
        eqfVar.I = 2;
        this.j = new defpackage.eqg(eqfVar);
    }

    private final int d(int i) {
        return i / (this.e.b << 1);
    }

    private final int e(int i) {
        return (i << 1) * this.e.b;
    }

    private final void f(int i) {
        long jZ = this.l + eum.z(this.n, 1000000L, this.e.c);
        int iE = e(i);
        this.d.d(jZ, 1, iE, this.m - iE, null);
        this.n += (long) i;
        this.m -= iE;
    }

    @Override // defpackage.fve
    public final void a(int i, long j) {
        this.c.y(new defpackage.fvj(this.e, this.f, i, j));
        defpackage.fmk fmkVar = this.d;
        fmkVar.p(this.j);
        fmkVar.z();
    }

    @Override // defpackage.fve
    public final void b(long j) {
        this.k = 0;
        this.l = j;
        this.m = 0;
        this.n = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0022, code lost:
    
        r9 = true;
     */
    @Override // defpackage.fve
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.flk r26, long r27) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fvd.c(flk, long):boolean");
    }
}
