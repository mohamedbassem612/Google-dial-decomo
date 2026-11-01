package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fug implements defpackage.ftx {
    private java.lang.String a;
    private defpackage.fmk b;
    private defpackage.fuf c;
    private boolean d;
    private boolean e;
    private defpackage.eqg f;
    private long n;
    private final defpackage.jyn q;
    private final boolean[] h = new boolean[3];
    private final defpackage.fum i = new defpackage.fum(32);
    private final defpackage.fum j = new defpackage.fum(33);
    private final defpackage.fum k = new defpackage.fum(34);
    private final defpackage.fum l = new defpackage.fum(39);
    private final defpackage.fum m = new defpackage.fum(40);
    private long o = -9223372036854775807L;
    private int g = -1;
    private final defpackage.etx p = new defpackage.etx();

    public fug(defpackage.jyn jynVar) {
        this.q = jynVar;
    }

    private final void g() {
        ahvr.ci(this.b);
        java.lang.String str = eum.a;
    }

    private final void h(long j, int i, int i2, long j2) {
        int i3;
        defpackage.fuf fufVar = this.c;
        boolean z = this.d;
        if (fufVar.i && fufVar.f) {
            fufVar.l = fufVar.b;
            fufVar.i = false;
        } else if (fufVar.g || fufVar.f) {
            if (z && fufVar.h) {
                fufVar.a(i + ((int) (j - fufVar.a)));
            }
            fufVar.j = fufVar.a;
            fufVar.k = fufVar.d;
            fufVar.l = fufVar.b;
            fufVar.h = true;
        }
        if (this.f == null) {
            defpackage.fum fumVar = this.i;
            fumVar.d(i2);
            defpackage.fum fumVar2 = this.j;
            fumVar2.d(i2);
            defpackage.fum fumVar3 = this.k;
            fumVar3.d(i2);
            if (fumVar.a && fumVar2.a && fumVar3.a) {
                java.lang.String str = this.a;
                int i4 = this.g;
                int i5 = fumVar.c;
                byte[] bArr = new byte[fumVar2.c + i5 + fumVar3.c];
                java.lang.System.arraycopy(fumVar.b, 0, bArr, 0, i5);
                java.lang.System.arraycopy(fumVar2.b, 0, bArr, fumVar.c, fumVar2.c);
                java.lang.System.arraycopy(fumVar3.b, 0, bArr, fumVar.c + fumVar2.c, fumVar3.c);
                defpackage.eva evaVarM = defpackage.evc.m(fumVar2.b, 3, fumVar2.c, null);
                defpackage.euy euyVar = evaVarM.b;
                java.lang.String strG = euyVar != null ? defpackage.ete.g(euyVar.a, euyVar.b, euyVar.c, euyVar.d, euyVar.e, euyVar.f) : null;
                defpackage.eqf eqfVar = new defpackage.eqf();
                eqfVar.a = str;
                eqfVar.a("video/mp2t");
                eqfVar.c("video/hevc");
                eqfVar.j = strG;
                eqfVar.t = evaVarM.e;
                eqfVar.u = evaVarM.f;
                eqfVar.v = evaVarM.g;
                eqfVar.w = evaVarM.h;
                eqfVar.D = new defpackage.epy(evaVarM.k, evaVarM.l, evaVarM.m, null, evaVarM.c + 8, evaVarM.d + 8);
                eqfVar.A = evaVarM.i;
                eqfVar.p = evaVarM.j;
                eqfVar.E = evaVarM.a + 1;
                eqfVar.q = java.util.Collections.singletonList(bArr);
                eqfVar.C = i4;
                defpackage.eqg eqgVar = new defpackage.eqg(eqfVar);
                this.f = eqgVar;
                this.e = true;
                ahvr.bY(eqgVar.r != -1);
                this.q.v(this.f.r);
            }
        }
        defpackage.fum fumVar4 = this.l;
        if (fumVar4.d(i2)) {
            int iE = defpackage.evc.e(fumVar4.b, fumVar4.c);
            int iD = defpackage.evc.d(fumVar4.b, 5, iE);
            if (iD != -1 && iD != (i3 = this.g) && (iD != 0 || i3 != -1)) {
                this.g = iD;
                defpackage.eqg eqgVar2 = this.f;
                if (eqgVar2 != null) {
                    defpackage.eqf eqfVar2 = new defpackage.eqf(eqgVar2);
                    eqfVar2.C = iD;
                    this.f = new defpackage.eqg(eqfVar2);
                    this.e = true;
                }
            }
            defpackage.etx etxVar = this.p;
            etxVar.O(fumVar4.b, iE);
            etxVar.R(5);
            this.q.s(j2, etxVar);
        }
        defpackage.fum fumVar5 = this.m;
        if (fumVar5.d(i2)) {
            int iE2 = defpackage.evc.e(fumVar5.b, fumVar5.c);
            defpackage.etx etxVar2 = this.p;
            etxVar2.O(fumVar5.b, iE2);
            etxVar2.R(5);
            this.q.s(j2, etxVar2);
        }
    }

    private final void i(byte[] bArr, int i, int i2) {
        defpackage.fuf fufVar = this.c;
        if (fufVar.e) {
            int i3 = fufVar.c;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                fufVar.f = (bArr[i4] & 128) != 0;
                fufVar.e = false;
            } else {
                fufVar.c = i3 + (i2 - i);
            }
        }
        if (this.f == null) {
            this.i.a(bArr, i, i2);
            this.j.a(bArr, i, i2);
            this.k.a(bArr, i, i2);
        }
        this.l.a(bArr, i, i2);
        this.m.a(bArr, i, i2);
    }

    private final void j(long j, int i, int i2, long j2) {
        defpackage.fuf fufVar = this.c;
        boolean z = this.d;
        fufVar.f = false;
        fufVar.g = false;
        fufVar.d = j2;
        fufVar.c = 0;
        fufVar.a = j;
        if (i2 >= 32 && i2 != 40) {
            if (fufVar.h && !fufVar.i) {
                if (z) {
                    fufVar.a(i);
                }
                fufVar.h = false;
            }
            if (i2 <= 35 || i2 == 39) {
                fufVar.g = !fufVar.i;
                fufVar.i = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        fufVar.b = z2;
        fufVar.e = z2 || i2 <= 9;
        if (this.e && i2 < 32) {
            defpackage.fmk fmkVar = this.b;
            defpackage.eqg eqgVar = this.f;
            ahvr.ci(eqgVar);
            fmkVar.p(eqgVar);
            this.d = true;
            this.e = false;
        }
        if (this.f == null) {
            this.i.c(i2);
            this.j.c(i2);
            this.k.c(i2);
        }
        this.l.c(i2);
        this.m.c(i2);
    }

    @Override // defpackage.ftx
    public final void a(defpackage.etx etxVar) {
        g();
        while (etxVar.d() > 0) {
            int i = etxVar.c;
            int i2 = etxVar.d;
            byte[] bArr = etxVar.b;
            this.n += (long) etxVar.d();
            this.b.b(etxVar, etxVar.d());
            while (i < i2) {
                int iB = defpackage.evc.b(bArr, i, i2, this.h);
                if (iB == i2) {
                    i(bArr, i, i2);
                    return;
                }
                int i3 = bArr[iB + 3] & 126;
                int i4 = 3;
                if (iB > 0) {
                    int i5 = iB - 1;
                    if (bArr[i5] == 0) {
                        i4 = 4;
                        iB = i5;
                    }
                }
                int i6 = iB - i;
                if (i6 > 0) {
                    i(bArr, i, iB);
                }
                int i7 = i2 - iB;
                long j = this.n - ((long) i7);
                h(j, i7, i6 < 0 ? -i6 : 0, this.o);
                j(j, i7, i3 >> 1, this.o);
                i = iB + i4;
            }
        }
    }

    @Override // defpackage.ftx
    public final void b(defpackage.fll fllVar, defpackage.fvb fvbVar) {
        fvbVar.c();
        this.a = fvbVar.b();
        this.b = fllVar.r(fvbVar.a(), 2);
        this.c = new defpackage.fuf(this.b);
        this.q.t(fllVar, fvbVar);
    }

    @Override // defpackage.ftx
    public final void c() {
        g();
        this.q.u();
        h(this.n, 0, 0, this.o);
        if (!this.d && this.e) {
            defpackage.fmk fmkVar = this.b;
            defpackage.eqg eqgVar = this.f;
            ahvr.ci(eqgVar);
            fmkVar.p(eqgVar);
            this.d = true;
            this.e = false;
        }
        j(this.n, 0, 48, this.o);
    }

    @Override // defpackage.ftx
    public final void e(long j, int i) {
        this.o = j;
    }

    @Override // defpackage.ftx
    public final void f() {
        this.n = 0L;
        this.o = -9223372036854775807L;
        defpackage.evc.i(this.h);
        this.i.b();
        this.j.b();
        this.k.b();
        this.l.b();
        this.m.b();
        this.q.r();
        defpackage.fuf fufVar = this.c;
        if (fufVar != null) {
            fufVar.e = false;
            fufVar.f = false;
            fufVar.g = false;
            fufVar.h = false;
            fufVar.i = false;
        }
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void d() {
    }
}
