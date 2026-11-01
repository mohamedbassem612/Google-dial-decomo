package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bjb {
    public int a;
    public defpackage.dpf b;
    public defpackage.dkw c;
    public boolean d;
    private defpackage.dji e;
    private defpackage.dnx f;
    private int g;
    private boolean h;
    private int i;
    private java.util.List j;
    private biz k;
    private defpackage.dkz m;
    private defpackage.djz n;
    private defpackage.dpq o;
    private long r;
    private defpackage.gat s;
    private long l = defpackage.mni.bj(Float.NaN, Float.NaN);
    private int p = -1;
    private int q = -1;

    public bjb(defpackage.dji djiVar, defpackage.dkz dkzVar, defpackage.gat gatVar, defpackage.dnx dnxVar, int i, boolean z, int i2, int i3, java.util.List list) {
        this.e = djiVar;
        this.s = gatVar;
        this.f = dnxVar;
        this.g = i;
        this.h = z;
        this.i = i2;
        this.a = i3;
        this.j = list;
        this.m = dkzVar;
    }

    private final void j() {
        this.n = null;
        this.c = null;
        this.q = -1;
        this.p = -1;
        this.d = false;
    }

    public final int a(int i, defpackage.dpq dpqVar) {
        defpackage.djz djzVar;
        int i2 = this.p;
        int i3 = this.q;
        if (i != i2 || i2 == -1 || dpqVar != this.o || ((djzVar = this.n) != null && djzVar.c())) {
            long jC = defpackage.dpe.c(0, i, 0, Integer.MAX_VALUE);
            if (this.a > 1) {
                jC = b(jC, dpqVar);
            }
            int iRound = java.lang.Math.round((float) java.lang.Math.ceil(c(jC, dpqVar).e));
            int iC = defpackage.dpd.c(jC);
            i3 = iRound < iC ? iC : iRound;
            this.p = i;
            this.q = i3;
        }
        return i3;
    }

    public final long b(long j, defpackage.dpq dpqVar) {
        biz bizVar = this.k;
        defpackage.dkz dkzVar = this.m;
        defpackage.dpf dpfVar = this.b;
        if (dpfVar == null) {
            defpackage.aooh.g();
        }
        biz bizVarK = aaf.k(bizVar, dpqVar, dkzVar, dpfVar, this.s, this.f);
        this.k = bizVarK;
        return bizVarK.a(j, this.a);
    }

    public final defpackage.djy c(long j, defpackage.dpq dpqVar) {
        defpackage.djz djzVarD = d(dpqVar);
        long jK = defpackage.dpe.k(0, defpackage.den.as(j, this.h, this.g, djzVarD.a()), 0, defpackage.dpd.a(j));
        boolean z = this.h;
        int i = this.g;
        return new defpackage.djy(djzVarD, jK, defpackage.den.ar(z, i, this.i), i);
    }

    public final defpackage.djz d(defpackage.dpq dpqVar) {
        defpackage.djz djzVar = this.n;
        if (djzVar == null || dpqVar != this.o || djzVar.c()) {
            if (djzVar != null && djzVar.c()) {
                this.d = true;
            }
            this.o = dpqVar;
            this.p = -1;
            this.q = -1;
            this.k = null;
            defpackage.dji djiVar = this.e;
            defpackage.dkz dkzVarF = defpackage.dff.f(this.m, dpqVar);
            defpackage.dpf dpfVar = this.b;
            if (dpfVar == null) {
                defpackage.aooh.g();
            }
            defpackage.gat gatVar = this.s;
            defpackage.dnx dnxVar = this.f;
            java.util.List list = this.j;
            if (list == null) {
                list = defpackage.aokc.a;
            }
            djzVar = new defpackage.djz(djiVar, dkzVarF, list, dpfVar, gatVar, this.h, dnxVar);
        }
        this.n = djzVar;
        return djzVar;
    }

    public final defpackage.dkw e() {
        defpackage.dkw dkwVar = this.c;
        if (dkwVar != null) {
            return dkwVar;
        }
        toString();
        throw new java.lang.IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ".concat(toString()));
    }

    public final defpackage.dkw f(defpackage.dpq dpqVar, long j, defpackage.djy djyVar) {
        float fMin = java.lang.Math.min(djyVar.a.a(), djyVar.d);
        defpackage.dji djiVar = this.e;
        defpackage.dkz dkzVar = this.m;
        java.util.List list = this.j;
        if (list == null) {
            list = defpackage.aokc.a;
        }
        int i = this.i;
        boolean z = this.h;
        int i2 = this.g;
        defpackage.dpf dpfVar = this.b;
        if (dpfVar == null) {
            defpackage.aooh.g();
        }
        defpackage.dkv dkvVar = new defpackage.dkv(djiVar, dkzVar, list, i, z, i2, dpfVar, dpqVar, this.s, this.f, j);
        float fCeil = (float) java.lang.Math.ceil(fMin);
        double d = djyVar.e;
        return new defpackage.dkw(dkvVar, djyVar, defpackage.dpe.d(j, (((long) java.lang.Math.round(fCeil)) << 32) | (((long) java.lang.Math.round((float) java.lang.Math.ceil(d))) & 4294967295L)));
    }

    public final void g(long j) {
        this.r = (this.r << 2) | j;
    }

    public final void h(defpackage.dpf dpfVar) {
        defpackage.dpf dpfVar2 = this.b;
        long jBj = dpfVar != null ? defpackage.mni.bj(dpfVar.a(), dpfVar.b()) : defpackage.mni.bj(Float.NaN, Float.NaN);
        if (dpfVar2 == null) {
            this.b = dpfVar;
            this.l = jBj;
        } else if (dpfVar == null || this.l != jBj) {
            this.b = dpfVar;
            this.l = jBj;
            g(1L);
            j();
        }
    }

    public final void i(defpackage.dji djiVar, defpackage.dkz dkzVar, defpackage.gat gatVar, defpackage.dnx dnxVar, int i, boolean z, int i2, int i3, java.util.List list) {
        this.e = djiVar;
        boolean zX = dkzVar.x(this.m);
        this.m = dkzVar;
        if (!zX) {
            g(0L);
            this.n = null;
            this.c = null;
            this.q = -1;
            this.p = -1;
            this.d = false;
        }
        this.s = gatVar;
        this.f = dnxVar;
        this.g = i;
        this.h = z;
        this.i = i2;
        this.a = i3;
        this.j = list;
        g(2L);
        j();
    }

    public final java.lang.String toString() {
        defpackage.dkw dkwVar = this.c;
        java.lang.String strA = defpackage.biy.a(this.l);
        long j = this.r;
        defpackage.dkw dkwVar2 = this.c;
        java.lang.Object dpdVar = dkwVar2 != null ? new defpackage.dpd(dkwVar2.a.j) : "null";
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        sb.append(dkwVar != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append(strA);
        sb.append(", history=");
        sb.append(j);
        sb.append(", constraints=");
        sb.append(dpdVar);
        sb.append(')');
        return sb.toString();
    }
}
