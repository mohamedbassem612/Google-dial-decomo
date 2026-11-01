package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class ewz implements defpackage.ezf, defpackage.ezg {
    public int b;
    public defpackage.fgv c;
    public long d;
    public long e;
    public boolean f;
    public defpackage.ffu h;
    public defpackage.fih j;
    private final int k;
    private defpackage.ezh l;
    private int m;
    private defpackage.fag n;
    private defpackage.etc o;
    private defpackage.eqg[] p;
    private boolean r;
    public final java.lang.Object a = new java.lang.Object();
    private final defpackage.hiz s = new defpackage.hiz();
    private long q = Long.MIN_VALUE;
    public defpackage.erm g = defpackage.erm.a;
    public long i = -9223372036854775807L;

    public ewz(int i) {
        this.k = i;
    }

    private final void Z(long j, boolean z, boolean z2) {
        this.f = false;
        this.e = j;
        this.q = j;
        if (!z2) {
            z2 = c(j) != 0;
        }
        u(j, z, z2);
    }

    private final void aa() {
        defpackage.ffu ffuVar;
        int iA;
        if (this.g.n() || (ffuVar = this.h) == null || (iA = this.g.a(ffuVar.a)) == -1) {
            this.i = -9223372036854775807L;
            return;
        }
        defpackage.erk erkVarD = this.g.d(iA, new defpackage.erk(), false);
        this.i = erkVarD.d;
        int i = ffuVar.b;
        if (i != -1) {
            this.i = erkVarD.h.a(i).f[ffuVar.c];
            return;
        }
        int i2 = ffuVar.e;
        if (i2 != -1) {
            long j = erkVarD.h.a(i2).a;
            this.i = 0L;
        }
    }

    @Override // defpackage.ezf
    public final void A() {
        ahvr.bY(this.b == 0);
        v();
    }

    @Override // defpackage.ezf
    public final void B(defpackage.eqg[] eqgVarArr, defpackage.fgv fgvVar, long j, long j2, defpackage.ffu ffuVar) {
        ahvr.bY(!this.f);
        this.c = fgvVar;
        this.h = ffuVar;
        aa();
        if (this.q == Long.MIN_VALUE) {
            this.q = j;
        }
        this.p = eqgVarArr;
        this.d = j2;
        z(eqgVarArr, j, j2, ffuVar);
    }

    @Override // defpackage.ezf
    public final void C() {
        ahvr.bY(this.b == 0);
        this.s.a();
        w();
    }

    @Override // defpackage.ezf
    public final void D(long j, boolean z) {
        Z(j, false, z);
    }

    @Override // defpackage.ezf
    public final void E() {
        this.f = true;
    }

    @Override // defpackage.ezf
    public final void G(defpackage.erm ermVar) {
        if (j$.util.Objects.equals(this.g, ermVar)) {
            return;
        }
        this.g = ermVar;
        aa();
        Q();
    }

    @Override // defpackage.ezf
    public final void H() {
        ahvr.bY(this.b == 1);
        this.b = 2;
        x();
    }

    @Override // defpackage.ezf
    public final void I() {
        ahvr.bY(this.b == 2);
        this.b = 1;
        y();
    }

    @Override // defpackage.ezf
    public final boolean J() {
        return this.q == Long.MIN_VALUE;
    }

    @Override // defpackage.ezf
    public final boolean K() {
        return this.f;
    }

    protected final boolean L() {
        if (J()) {
            return this.f;
        }
        defpackage.fgv fgvVar = this.c;
        ahvr.ci(fgvVar);
        return fgvVar.e();
    }

    @Override // defpackage.ezf
    public /* synthetic */ boolean M(long j) {
        return false;
    }

    protected final defpackage.eqg[] N() {
        defpackage.eqg[] eqgVarArr = this.p;
        ahvr.ci(eqgVarArr);
        return eqgVarArr;
    }

    @Override // defpackage.ezg
    public final void O(defpackage.fih fihVar) {
        synchronized (this.a) {
            this.j = fihVar;
        }
    }

    @Override // defpackage.ezf
    public final void P(defpackage.ezh ezhVar, defpackage.eqg[] eqgVarArr, defpackage.fgv fgvVar, boolean z, boolean z2, long j, long j2, defpackage.ffu ffuVar) {
        ahvr.bY(this.b == 0);
        this.l = ezhVar;
        this.h = ffuVar;
        this.b = 1;
        t(z, z2);
        B(eqgVarArr, fgvVar, j, j2, ffuVar);
        Z(j, z, true);
    }

    protected final void R() {
        ahvr.ci(this.l);
    }

    public final int S(defpackage.hiz hizVar, defpackage.ewu ewuVar, int i) {
        defpackage.fgv fgvVar = this.c;
        ahvr.ci(fgvVar);
        int iF = fgvVar.f(hizVar, ewuVar, i);
        if (iF == -4) {
            int i2 = i & 1;
            if (ewuVar.dL(4)) {
                if (i2 == 0) {
                    this.q = Long.MIN_VALUE;
                }
                if (!this.f) {
                    return -3;
                }
            } else {
                long j = ewuVar.f + this.d;
                ewuVar.f = j;
                if (i2 != 0) {
                    return iF;
                }
                this.q = java.lang.Math.max(this.q, j);
            }
            return -4;
        }
        if (iF != -5) {
            return iF;
        }
        java.lang.Object obj = hizVar.a;
        ahvr.ci(obj);
        defpackage.eqg eqgVar = (defpackage.eqg) obj;
        long j2 = eqgVar.u;
        if (j2 == Long.MAX_VALUE) {
            return iF;
        }
        defpackage.eqf eqfVar = new defpackage.eqf(eqgVar);
        eqfVar.s = j2 + this.d;
        hizVar.a = new defpackage.eqg(eqfVar);
        return -5;
    }

    protected final defpackage.hiz T() {
        defpackage.hiz hizVar = this.s;
        hizVar.a();
        return hizVar;
    }

    protected final int c(long j) {
        defpackage.fgv fgvVar = this.c;
        ahvr.ci(fgvVar);
        return fgvVar.b(j - this.d);
    }

    @Override // defpackage.ezg
    public int dE() {
        return 0;
    }

    @Override // defpackage.ezf
    public final int dF() {
        return this.b;
    }

    @Override // defpackage.ezf, defpackage.ezg
    public final int dG() {
        return this.k;
    }

    @Override // defpackage.ezf
    public /* synthetic */ long e(long j, long j2) {
        return defpackage.hgt.ax(this);
    }

    @Override // defpackage.ezf
    public final long f() {
        return this.q;
    }

    protected final defpackage.etc g() {
        defpackage.etc etcVar = this.o;
        ahvr.ci(etcVar);
        return etcVar;
    }

    public final defpackage.exl h(java.lang.Throwable th, defpackage.eqg eqgVar, boolean z, int i) {
        int iY;
        if (eqgVar == null || this.r) {
            iY = 4;
        } else {
            this.r = true;
            try {
                iY = Y(eqgVar) & 7;
                this.r = false;
            } catch (defpackage.exl unused) {
                this.r = false;
                iY = 4;
            } catch (java.lang.Throwable th2) {
                this.r = false;
                throw th2;
            }
        }
        return new defpackage.exl(1, th, i, U(), this.m, eqgVar, eqgVar == null ? 4 : iY, this.h, z);
    }

    @Override // defpackage.ezf
    public defpackage.eyp i() {
        return null;
    }

    protected final defpackage.fag k() {
        defpackage.fag fagVar = this.n;
        ahvr.ci(fagVar);
        return fagVar;
    }

    @Override // defpackage.ezf
    public final defpackage.fgv l() {
        return this.c;
    }

    @Override // defpackage.ezg
    public final void m() {
        synchronized (this.a) {
            this.j = null;
        }
    }

    @Override // defpackage.ezf
    public final void n() {
        ahvr.bY(this.b == 1);
        this.s.a();
        this.b = 0;
        this.c = null;
        this.p = null;
        this.f = false;
        s();
        this.h = null;
        this.i = -9223372036854775807L;
    }

    @Override // defpackage.ezf
    public final void q(int i, defpackage.fag fagVar, defpackage.etc etcVar) {
        this.m = i;
        this.n = fagVar;
        this.o = etcVar;
    }

    @Override // defpackage.ezf
    public final void r() {
        defpackage.fgv fgvVar = this.c;
        ahvr.ci(fgvVar);
        fgvVar.c();
    }

    protected void s() {
        throw null;
    }

    protected void u(long j, boolean z, boolean z2) {
        throw null;
    }

    protected void Q() {
    }

    @Override // defpackage.ezf
    public final defpackage.ezg j() {
        return this;
    }

    @Override // defpackage.ezf
    public /* synthetic */ void o() {
    }

    protected void v() {
    }

    protected void w() {
    }

    protected void x() {
    }

    protected void y() {
    }

    @Override // defpackage.ezf
    public /* synthetic */ void F(float f, float f2) {
    }

    @Override // defpackage.ezc
    public void p(int i, java.lang.Object obj) {
    }

    protected void t(boolean z, boolean z2) {
    }

    protected void z(defpackage.eqg[] eqgVarArr, long j, long j2, defpackage.ffu ffuVar) {
    }
}
