package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class err {
    public final boolean B;
    public final aigf H;
    public final aihd I;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final aify m;
    public final aify n;
    public final aify o;
    public final aify q;
    public final aify r;
    public final int t;
    public final int u;
    public final aify v;
    public final defpackage.erp w;
    public final aify y;
    public final aify z;
    public final int e = 0;
    public final int f = 0;
    public final int g = 0;
    public final int h = 0;
    public final int p = 0;
    public final int s = 0;
    public final boolean x = false;
    public final int A = 0;
    public final int C = 0;
    public final boolean D = false;
    public final boolean E = false;
    public final boolean F = false;
    public final boolean G = false;

    static {
        new defpackage.err(new defpackage.erq());
        java.lang.String str = eum.a;
    }

    protected err(defpackage.erq erqVar) {
        this.a = erqVar.a;
        this.b = erqVar.b;
        this.c = erqVar.c;
        this.d = erqVar.d;
        this.i = erqVar.e;
        this.j = erqVar.f;
        this.k = erqVar.g;
        this.l = erqVar.h;
        this.m = erqVar.i;
        this.n = erqVar.j;
        this.o = erqVar.k;
        this.q = erqVar.l;
        this.t = erqVar.n;
        this.r = erqVar.m;
        this.u = erqVar.o;
        this.v = erqVar.p;
        this.w = erqVar.q;
        this.y = erqVar.r;
        this.B = erqVar.s;
        this.z = erqVar.t;
        this.H = aigf.i(erqVar.u);
        this.I = aihd.o(erqVar.v);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.err errVar = (defpackage.err) obj;
            if (this.a == errVar.a && this.b == errVar.b && this.c == errVar.c && this.d == errVar.d && this.l == errVar.l && this.i == errVar.i && this.j == errVar.j && this.k == errVar.k && ahvr.aP(this.m, errVar.m) && ahvr.aP(this.n, errVar.n) && ahvr.aP(this.o, errVar.o) && ahvr.aP(this.q, errVar.q) && this.t == errVar.t && ahvr.aP(this.r, errVar.r) && this.u == errVar.u && ahvr.aP(this.v, errVar.v) && this.w.equals(errVar.w) && ahvr.aP(this.z, errVar.z) && ahvr.aP(this.y, errVar.y) && this.B == errVar.B && this.H.equals(errVar.H) && this.I.equals(errVar.I)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.l ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1 : 0)) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 961) + this.q.hashCode()) * 961) + this.t) * 31) + this.r.hashCode()) * 31) + this.u) * 31) + this.v.hashCode()) * 31) + 29791) * 961) + this.y.hashCode()) * 961) + (this.B ? 1 : 0)) * 31) + this.z.hashCode()) * 887503681) + this.H.hashCode()) * 31) + this.I.hashCode();
    }
}
