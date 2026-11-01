package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bjc {
    public java.lang.String a;
    public defpackage.dkz b;
    public defpackage.dnx c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public defpackage.dpf h;
    public boolean i;
    public defpackage.dkc k;
    public defpackage.dpq l;
    public boolean n;
    public defpackage.djb o;
    public defpackage.gat p;
    private biz r;
    private long u;
    private long q = defpackage.mni.bj(Float.NaN, Float.NaN);
    public long j = 0;
    public long m = defpackage.dpe.l(0, 0);
    private int s = -1;
    private int t = -1;

    public bjc(java.lang.String str, defpackage.dkz dkzVar, defpackage.gat gatVar, defpackage.dnx dnxVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = dkzVar;
        this.p = gatVar;
        this.c = dnxVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    private final void h() {
        this.o = null;
        this.k = null;
        this.l = null;
        this.s = -1;
        this.t = -1;
        this.n = false;
        this.m = defpackage.dpe.l(0, 0);
        this.j = 0L;
        this.i = false;
    }

    public final int a(int i, defpackage.dpq dpqVar) {
        defpackage.dkc dkcVar;
        int i2 = this.s;
        int i3 = this.t;
        if (i != i2 || i2 == -1 || dpqVar != this.l || ((dkcVar = this.k) != null && dkcVar.c())) {
            long jC = defpackage.dpe.c(0, i, 0, Integer.MAX_VALUE);
            if (this.g > 1) {
                jC = b(jC, dpqVar, this.b);
            }
            int iRound = java.lang.Math.round((float) java.lang.Math.ceil(f(jC, dpqVar).d));
            int iC = defpackage.dpd.c(jC);
            i3 = iRound < iC ? iC : iRound;
            this.s = i;
            this.t = i3;
        }
        return i3;
    }

    public final long b(long j, defpackage.dpq dpqVar, defpackage.dkz dkzVar) {
        biz bizVar = this.r;
        defpackage.dpf dpfVar = this.h;
        if (dpfVar == null) {
            defpackage.aooh.g();
        }
        biz bizVarK = aaf.k(bizVar, dpqVar, dkzVar, dpfVar, this.p, this.c);
        this.r = bizVarK;
        return bizVarK.a(j, this.g);
    }

    public final defpackage.dkc c(defpackage.dpq dpqVar) {
        defpackage.dkc djcVar = this.k;
        if (djcVar == null || dpqVar != this.l || djcVar.c()) {
            if (djcVar != null && djcVar.c()) {
                this.n = true;
            }
            this.l = dpqVar;
            this.s = -1;
            this.t = -1;
            this.r = null;
            java.lang.String str = this.a;
            defpackage.dkz dkzVarF = defpackage.dff.f(this.b, dpqVar);
            defpackage.aokc aokcVar = defpackage.aokc.a;
            defpackage.dpf dpfVar = this.h;
            if (dpfVar == null) {
                defpackage.aooh.g();
            }
            djcVar = new defpackage.djc(str, dkzVarF, aokcVar, aokcVar, this.p, this.c, dpfVar, this.e);
        }
        this.k = djcVar;
        return djcVar;
    }

    public final void d(long j) {
        this.u = (this.u << 2) | j;
    }

    public final void e(defpackage.dpf dpfVar) {
        defpackage.dpf dpfVar2 = this.h;
        long jBj = dpfVar != null ? defpackage.mni.bj(dpfVar.a(), dpfVar.b()) : defpackage.mni.bj(Float.NaN, Float.NaN);
        if (dpfVar2 == null) {
            this.h = dpfVar;
            this.q = jBj;
        } else if (dpfVar == null || this.q != jBj) {
            this.h = dpfVar;
            this.q = jBj;
            d(1L);
            h();
        }
    }

    public final defpackage.djb f(long j, defpackage.dpq dpqVar) {
        defpackage.dkc dkcVarC = c(dpqVar);
        long jK = defpackage.dpe.k(0, defpackage.den.as(j, this.e, this.d, dkcVarC.a()), 0, defpackage.dpd.a(j));
        boolean z = this.e;
        int i = this.d;
        return new defpackage.djb((defpackage.djc) dkcVarC, defpackage.den.ar(z, i, this.f), i, jK);
    }

    public final void g(java.lang.String str, defpackage.dkz dkzVar, defpackage.gat gatVar, defpackage.dnx dnxVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = dkzVar;
        this.p = gatVar;
        this.c = dnxVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        d(2L);
        h();
    }

    public final java.lang.String toString() {
        defpackage.djb djbVar = this.o;
        java.lang.String strA = defpackage.biy.a(this.q);
        long j = this.u;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(djbVar != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append(strA);
        sb.append(", history=");
        sb.append(j);
        sb.append(", constraints=$)");
        return sb.toString();
    }
}
