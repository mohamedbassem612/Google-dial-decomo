package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fmv {
    public final defpackage.fmu a;
    public final defpackage.fmk b;
    public final int c;
    public final int d;
    public final boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;
    private final long o;

    public fmv(int i, defpackage.fmu fmuVar, defpackage.fmk fmkVar, boolean z) {
        this.a = fmuVar;
        this.e = z;
        int iB = fmuVar.b();
        boolean z2 = true;
        if (iB != 1) {
            if (iB == 2) {
                iB = 2;
            } else {
                z2 = false;
            }
        }
        ahvr.bM(z2);
        int i2 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (iB == 2 ? 1667497984 : 1651965952) | i2;
        this.o = fmuVar.c();
        this.b = fmkVar;
        this.d = iB == 2 ? i2 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = fmuVar.d;
    }

    private final defpackage.fmb c(int i) {
        return new defpackage.fmb(((long) this.n[i]) * a(1), this.m[i]);
    }

    public final long a(int i) {
        return (this.o * ((long) i)) / ((long) this.f);
    }

    public final defpackage.fly b(long j) {
        if (this.k == 0) {
            defpackage.fmb fmbVar = new defpackage.fmb(0L, this.l);
            return new defpackage.fly(fmbVar, fmbVar);
        }
        int iA = (int) (j / a(1));
        int iB = eum.b(this.n, iA, true, true);
        if (this.n[iB] == iA) {
            defpackage.fmb fmbVarC = c(iB);
            return new defpackage.fly(fmbVarC, fmbVarC);
        }
        defpackage.fmb fmbVarC2 = c(iB);
        int i = iB + 1;
        return i < this.m.length ? new defpackage.fly(fmbVarC2, c(i)) : new defpackage.fly(fmbVarC2, fmbVarC2);
    }
}
