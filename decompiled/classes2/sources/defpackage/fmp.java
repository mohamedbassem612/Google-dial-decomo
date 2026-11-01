package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fmp implements defpackage.flj {
    private static final int[] a = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] b = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] c = eum.Z("#!AMR\n");
    private static final byte[] d = eum.Z("#!AMR-WB\n");
    private final byte[] e;
    private final int f;
    private final defpackage.fmk g;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private long l;
    private int m;
    private int n;
    private long o;
    private defpackage.fll p;
    private defpackage.fmk q;
    private defpackage.fmk r;
    private defpackage.fma s;
    private boolean t;
    private long u;
    private boolean v;

    public fmp(int i) {
        this.f = (i & 2) != 0 ? i | 1 : i;
        this.e = new byte[1];
        this.m = -1;
        defpackage.flg flgVar = new defpackage.flg();
        this.g = flgVar;
        this.r = flgVar;
    }

    private final int h(defpackage.flk flkVar) throws defpackage.era {
        if (this.k == 0) {
            try {
                flkVar.k();
                byte[] bArr = this.e;
                ((defpackage.flc) flkVar).n(bArr, 0, 1, false);
                byte b2 = bArr[0];
                if ((b2 & 131) > 0) {
                    throw new defpackage.era(a.bj(b2, "Invalid padding bits for frame header "), null, true, 1);
                }
                boolean z = this.h;
                int i = (b2 >> 3) & 15;
                if (!z ? !(i < 12 || i > 14) : !(i < 10 || i > 13)) {
                    throw new defpackage.era(a.bu(i, true != z ? "NB" : "WB", "Illegal AMR ", " frame type "), null, true, 1);
                }
                int i2 = z ? b[i] : a[i];
                this.j = i2;
                this.k = i2;
                int i3 = this.m;
                if (i3 == -1) {
                    this.l = ((defpackage.flc) flkVar).b;
                    this.m = i2;
                    i3 = i2;
                }
                if (i3 == i2) {
                    this.n++;
                }
                defpackage.fma fmaVar = this.s;
                if (fmaVar instanceof defpackage.flu) {
                    defpackage.flu fluVar = (defpackage.flu) fmaVar;
                    long j = this.o + this.i + 20000;
                    long j2 = ((defpackage.flc) flkVar).b + ((long) i2);
                    defpackage.aizg aizgVar = fluVar.c;
                    int i4 = aizgVar.a;
                    if (i4 == 0 || j - aizgVar.i(i4 - 1) >= 100000) {
                        if (aizgVar.a == 0 && j > 0) {
                            fluVar.b.j(0L);
                            aizgVar.j(0L);
                        }
                        fluVar.b.j(j2);
                        aizgVar.j(j);
                    }
                    if (this.t && k(j, this.u)) {
                        this.t = false;
                        this.r = this.q;
                    }
                }
            } catch (java.io.EOFException unused) {
                return -1;
            }
        }
        int iA = this.r.a(flkVar, this.k, true);
        if (iA == -1) {
            return -1;
        }
        int i5 = this.k - iA;
        this.k = i5;
        if (i5 <= 0) {
            this.r.d(this.i + this.o, 1, this.j, 0, null);
            this.i += 20000;
        }
        return 0;
    }

    private static boolean i(defpackage.flk flkVar, byte[] bArr) {
        flkVar.k();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((defpackage.flc) flkVar).n(bArr2, 0, length, false);
        return java.util.Arrays.equals(bArr2, bArr);
    }

    private final boolean j(defpackage.flk flkVar) {
        byte[] bArr = c;
        if (i(flkVar, bArr)) {
            this.h = false;
            ((defpackage.flc) flkVar).p(bArr.length, false);
            return true;
        }
        byte[] bArr2 = d;
        if (!i(flkVar, bArr2)) {
            return false;
        }
        this.h = true;
        ((defpackage.flc) flkVar).p(bArr2.length, false);
        return true;
    }

    private static final boolean k(long j, long j2) {
        return java.lang.Math.abs(j2 - j) < 20000;
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return aike.a;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        this.p = fllVar;
        defpackage.fmk fmkVarR = fllVar.r(0, 1);
        this.q = fmkVarR;
        this.r = fmkVarR;
        fllVar.s();
    }

    @Override // defpackage.flj
    public final void d(long j, long j2) {
        this.i = 0L;
        this.j = 0;
        this.k = 0;
        this.u = j2;
        defpackage.fma fmaVar = this.s;
        if (!(fmaVar instanceof defpackage.flu)) {
            if (j == 0 || !(fmaVar instanceof defpackage.flb)) {
                this.o = 0L;
                return;
            } else {
                this.o = ((defpackage.flb) fmaVar).j(j);
                return;
            }
        }
        defpackage.flu fluVar = (defpackage.flu) fmaVar;
        defpackage.aizg aizgVar = fluVar.c;
        long jI = aizgVar.a == 0 ? -9223372036854775807L : aizgVar.i(eum.ai(fluVar.b, j));
        this.o = jI;
        if (k(jI, this.u)) {
            return;
        }
        this.t = true;
        this.r = this.g;
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        return j(flkVar);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00dc  */
    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) throws defpackage.era {
        int i;
        defpackage.fma fmaVar;
        ahvr.ci(this.q);
        java.lang.String str = eum.a;
        defpackage.flc flcVar = (defpackage.flc) flkVar;
        if (flcVar.b == 0 && !j(flkVar)) {
            throw new defpackage.era("Could not find AMR header.", null, true, 1);
        }
        if (!this.v) {
            this.v = true;
            boolean z = this.h;
            java.lang.String str2 = true != z ? "audio/amr" : "audio/amr-wb";
            java.lang.String str3 = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i2 = true != z ? 8000 : 16000;
            int i3 = z ? b[8] : a[7];
            defpackage.fmk fmkVar = this.q;
            defpackage.eqf eqfVar = new defpackage.eqf();
            eqfVar.a(str2);
            eqfVar.c(str3);
            eqfVar.o = i3;
            eqfVar.F = 1;
            eqfVar.H = i2;
            fmkVar.p(new defpackage.eqg(eqfVar));
        }
        int iH = h(flkVar);
        long j = flcVar.a;
        int i4 = -1;
        if (this.s != null) {
            i4 = -1;
        } else {
            int i5 = this.f;
            if ((i5 & 4) != 0) {
                this.s = new defpackage.flu(new long[]{this.l}, new long[]{0}, -9223372036854775807L);
            } else {
                if ((i5 & 1) == 0 || !((i = this.m) == -1 || i == this.j)) {
                    this.s = new defpackage.flz(-9223372036854775807L, 0L);
                } else if (this.n >= 20 || iH == -1) {
                    defpackage.flb flbVar = new defpackage.flb(j, this.l, (int) ((((long) i) * 8000000) / 20000), i, (i5 & 2) != 0, true);
                    this.s = flbVar;
                    defpackage.fmk fmkVar2 = this.q;
                    flbVar.a();
                    fmkVar2.z();
                }
                fmaVar = this.s;
                if (fmaVar != null) {
                    this.p.y(fmaVar);
                }
            }
            fmaVar = this.s;
            if (fmaVar != null) {
                this.p.y(fmaVar);
            }
        }
        if (iH != i4) {
            return 0;
        }
        defpackage.fma fmaVar2 = this.s;
        if (fmaVar2 instanceof defpackage.flu) {
            ((defpackage.flu) fmaVar2).a = this.o + this.i;
            this.p.y(fmaVar2);
            this.q.z();
        }
        return i4;
    }

    @Override // defpackage.flj
    public final void c() {
    }

    @Override // defpackage.flj
    public final /* synthetic */ void f() {
    }
}
