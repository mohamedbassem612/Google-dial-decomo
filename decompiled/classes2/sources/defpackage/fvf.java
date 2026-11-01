package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fvf implements defpackage.fve {
    private final defpackage.fll a;
    private final defpackage.fmk b;
    private final defpackage.fvh c;
    private final defpackage.eqg d;
    private final int e;
    private long f;
    private int g;
    private long h;

    public fvf(defpackage.fll fllVar, defpackage.fmk fmkVar, defpackage.fvh fvhVar, java.lang.String str, int i) throws defpackage.era {
        this.a = fllVar;
        this.b = fmkVar;
        this.c = fvhVar;
        int i2 = fvhVar.b * fvhVar.e;
        int i3 = fvhVar.d;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw new defpackage.era(a.bf(i3, i4, "Expected block size: ", "; got: "), null, true, 1);
        }
        int i5 = fvhVar.c * i4;
        int i6 = i5 << 3;
        int iMax = java.lang.Math.max(i4, i5 / 10);
        this.e = iMax;
        defpackage.eqf eqfVar = new defpackage.eqf();
        eqfVar.a("audio/wav");
        eqfVar.c(str);
        eqfVar.h = i6;
        eqfVar.i = i6;
        eqfVar.o = iMax;
        eqfVar.F = fvhVar.b;
        eqfVar.G = defpackage.esv.g(fvhVar.g);
        eqfVar.H = fvhVar.c;
        eqfVar.I = i;
        this.d = new defpackage.eqg(eqfVar);
    }

    @Override // defpackage.fve
    public final void a(int i, long j) {
        this.a.y(new defpackage.fvj(this.c, 1, i, j));
        defpackage.fmk fmkVar = this.b;
        fmkVar.p(this.d);
        fmkVar.z();
    }

    @Override // defpackage.fve
    public final void b(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.fve
    public final boolean c(defpackage.flk flkVar, long j) {
        int i;
        int i2;
        while (j > 0 && (i = this.g) < (i2 = this.e)) {
            int iA = this.b.a(flkVar, (int) java.lang.Math.min(i2 - i, j), true);
            if (iA == -1) {
                j = 0;
            } else {
                this.g += iA;
                j -= (long) iA;
            }
        }
        defpackage.fvh fvhVar = this.c;
        int i3 = this.g;
        int i4 = fvhVar.d;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long jZ = this.f + eum.z(this.h, 1000000L, fvhVar.c);
            int i6 = i5 * i4;
            int i7 = this.g - i6;
            this.b.d(jZ, 1, i6, i7, null);
            this.h += (long) i5;
            this.g = i7;
        }
        return j <= 0;
    }
}
