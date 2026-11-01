package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yhw implements java.lang.Cloneable {
    public defpackage.yig A;
    public java.lang.Float B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public defpackage.zlr L;
    public long a = 0;
    public defpackage.yig b;
    public java.lang.Float c;
    public defpackage.yig d;
    public java.lang.Float e;
    public defpackage.yhh f;
    public java.lang.Float g;
    public defpackage.yhh[] h;
    public defpackage.yhh i;
    public java.lang.Float j;
    public defpackage.ygy k;
    public java.util.List l;
    public defpackage.yhh m;
    public java.lang.Integer n;
    public java.lang.Boolean o;
    public java.lang.String p;
    public java.lang.String q;
    public java.lang.String r;
    public java.lang.Boolean s;
    public java.lang.Boolean t;
    public defpackage.yig u;
    public java.lang.Float v;
    public java.lang.String w;
    public java.lang.String x;
    public defpackage.yig y;
    public java.lang.Float z;

    protected yhw() {
    }

    public static defpackage.yhw a() {
        defpackage.yhw yhwVar = new defpackage.yhw();
        yhwVar.a = -1L;
        defpackage.ygy ygyVar = defpackage.ygy.a;
        yhwVar.b = ygyVar;
        yhwVar.C = 1;
        java.lang.Float fValueOf = java.lang.Float.valueOf(1.0f);
        yhwVar.c = fValueOf;
        yhwVar.d = null;
        yhwVar.e = fValueOf;
        yhwVar.f = new defpackage.yhh(1.0f);
        yhwVar.D = 1;
        yhwVar.E = 1;
        yhwVar.g = java.lang.Float.valueOf(4.0f);
        yhwVar.h = null;
        yhwVar.i = new defpackage.yhh(0.0f);
        yhwVar.j = fValueOf;
        yhwVar.k = ygyVar;
        yhwVar.l = null;
        yhwVar.m = new defpackage.yhh(12.0f, 7);
        yhwVar.n = 400;
        yhwVar.F = 1;
        yhwVar.G = 1;
        yhwVar.H = 1;
        yhwVar.I = 1;
        yhwVar.o = java.lang.Boolean.TRUE;
        yhwVar.L = null;
        yhwVar.p = null;
        yhwVar.q = null;
        yhwVar.r = null;
        yhwVar.s = java.lang.Boolean.TRUE;
        yhwVar.t = java.lang.Boolean.TRUE;
        yhwVar.u = ygyVar;
        yhwVar.v = fValueOf;
        yhwVar.w = null;
        yhwVar.J = 1;
        yhwVar.x = null;
        yhwVar.y = null;
        yhwVar.z = fValueOf;
        yhwVar.A = null;
        yhwVar.B = fValueOf;
        yhwVar.K = 1;
        return yhwVar;
    }

    protected final java.lang.Object clone() {
        try {
            defpackage.yhw yhwVar = (defpackage.yhw) super.clone();
            defpackage.yhh[] yhhVarArr = this.h;
            if (yhhVarArr != null) {
                yhwVar.h = (defpackage.yhh[]) yhhVarArr.clone();
            }
            return yhwVar;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.InternalError(e.toString());
        }
    }
}
