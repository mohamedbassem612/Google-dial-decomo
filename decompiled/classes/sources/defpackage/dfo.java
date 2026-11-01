package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dfo {
    public static final defpackage.cbd a = new defpackage.cet(new defpackage.cbz(16));
    public static final defpackage.cbd b = new defpackage.ces(new defpackage.dfn(1));
    public static final defpackage.cbd c;
    public static final defpackage.cbd d;
    public static final defpackage.cbd e;
    public static final defpackage.cbd f;
    public static final defpackage.cbd g;
    public static final defpackage.cbd h;
    public static final defpackage.cbd i;
    public static final defpackage.cbd j;
    public static final defpackage.cbd k;
    public static final defpackage.cbd l;
    public static final defpackage.cbd m;
    public static final defpackage.cbd n;
    public static final defpackage.cbd o;
    public static final defpackage.cbd p;
    public static final defpackage.cbd q;
    public static final defpackage.cbd r;
    public static final defpackage.cbd s;

    static {
        new defpackage.ces(new defpackage.dfn(0));
        new defpackage.ces(new defpackage.deo(12));
        new defpackage.ces(new defpackage.dfn(2));
        new defpackage.ces(new defpackage.deo(13));
        c = new defpackage.ces(new defpackage.deo(14));
        d = new defpackage.ces(new defpackage.deo(15));
        e = new defpackage.ces(new defpackage.deo(16));
        f = new defpackage.ces(new defpackage.deo(17));
        new defpackage.ces(new defpackage.deo(18));
        g = new defpackage.ces(new defpackage.deo(19));
        h = new defpackage.ces(new defpackage.deo(20));
        i = new defpackage.ces(new defpackage.deo(5));
        j = new defpackage.ces(new defpackage.deo(6));
        k = new defpackage.ces(new defpackage.deo(7));
        new defpackage.cbf(new defpackage.dcx(8));
        new defpackage.ces(new defpackage.dfn(3));
        new defpackage.ces(new defpackage.dfn(4));
        l = new defpackage.ces(new defpackage.deo(8));
        m = new defpackage.ces(new defpackage.dcx(9));
        n = new defpackage.ces(new defpackage.deo(9));
        o = new defpackage.ces(new defpackage.deo(10));
        new defpackage.ces(new defpackage.deo(11));
        p = new defpackage.ces(new defpackage.dcx(10));
        q = new defpackage.ces(new defpackage.dfn(5));
        r = new defpackage.cbn(defpackage.cdu.c, new defpackage.cbz(14));
        s = new defpackage.ces(new defpackage.dfn(6));
        new defpackage.cet(new defpackage.cbz(15));
    }

    public static final void a(defpackage.dcv dcvVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(915119540);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? cavVarB.B(dcvVar) : cavVarB.D(dcvVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        int i5 = 3;
        if (cavVarB.H((i3 & 19) != 18, i3 & 1)) {
            cavVarB.u(-2126002848);
            defpackage.deg degVar = (defpackage.deg) dcvVar;
            defpackage.cou couVar = degVar.F;
            defpackage.cdj cdjVarB = g.b(dcvVar.T());
            cdjVarB.g = false;
            defpackage.den.ac(new defpackage.cdj[]{a.b(dcvVar), defpackage.cjm.a.b(degVar.h), e.b(dcvVar.t()), j.b(dcvVar.u()), f.b(couVar), o.b(dcvVar.r()), n.b(dcvVar.q()), cdjVarB, d.b(degVar.N), c.b(dcvVar.V()), k.b(dcvVar.s())}, aonnVar, cavVarB, i3 & 112);
            ((defpackage.cbt) cavVarB).W(false);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bdx(dcvVar, aonnVar, i2, i5);
        }
    }
}
