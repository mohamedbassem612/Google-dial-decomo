package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aczk {
    public static volatile boolean a = false;
    public final android.content.Context b;
    public final defpackage.adba c;
    public final defpackage.acyu d;
    public final defpackage.acyv e;
    public final defpackage.aczw f;
    public final defpackage.acxa g;
    public final defpackage.ahyn h;
    public final java.util.concurrent.Executor i;
    public final defpackage.ahyn j;
    public final defpackage.acvl k;
    public final defpackage.adbf l;
    public final defpackage.adlt m;
    public final defpackage.adak n;
    public final defpackage.agqj o;
    public final defpackage.ahbq p;
    public final defpackage.aogc q;

    public aczk(android.content.Context context, defpackage.adba adbaVar, defpackage.adlt adltVar, defpackage.aczw aczwVar, defpackage.acyu acyuVar, defpackage.acyv acyvVar, defpackage.adak adakVar, defpackage.acxa acxaVar, defpackage.agqj agqjVar, defpackage.ahbq ahbqVar, defpackage.aogc aogcVar, defpackage.ahyn ahynVar, java.util.concurrent.Executor executor, defpackage.ahyn ahynVar2, defpackage.acvl acvlVar, defpackage.adbf adbfVar) {
        this.b = context;
        this.c = adbaVar;
        this.m = adltVar;
        this.f = aczwVar;
        this.d = acyuVar;
        this.e = acyvVar;
        this.n = adakVar;
        this.g = acxaVar;
        this.o = agqjVar;
        this.p = ahbqVar;
        this.q = aogcVar;
        this.h = ahynVar;
        this.i = executor;
        this.j = ahynVar2;
        this.k = acvlVar;
        this.l = adbfVar;
    }

    public static final defpackage.ajcq f(acvu acvuVar) {
        long j = acvuVar.s;
        return defpackage.ajcm.a;
    }

    public final defpackage.ajcq a() {
        return defpackage.ahvr.I(this.m.g(), new acyq(this, 10), this.i);
    }

    public final defpackage.ajcq b(boolean z, defpackage.ajat ajatVar) {
        int i = defpackage.adbe.a;
        return defpackage.ahvr.I(e(), new vll(this, z, ajatVar, 5), this.i);
    }

    public final defpackage.ajcq c(acwb acwbVar, defpackage.ahyn ahynVar, defpackage.ajat ajatVar) {
        java.lang.String str = acwbVar.c;
        java.lang.String str2 = acwbVar.d;
        int i = defpackage.adbe.a;
        return defpackage.ahvr.I(e(), new acyj(this, acwbVar, ahynVar, ajatVar, 8), this.i);
    }

    public final defpackage.ajcq d(acwb acwbVar, boolean z) {
        java.lang.String str = acwbVar.c;
        java.lang.String str2 = acwbVar.d;
        int i = defpackage.adbe.a;
        return defpackage.ahvr.I(e(), new vll(this, acwbVar, z, 6), this.i);
    }

    public final defpackage.ajcq e() {
        if (a) {
            return defpackage.ajcm.a;
        }
        adcs adcsVarE = adcs.e(defpackage.ajcm.a);
        acyq acyqVar = new acyq(this, 16);
        java.util.concurrent.Executor executor = this.i;
        return adcsVarE.g(acyqVar, executor).g(new acyq(this, 17), executor).g(new acyq(this, 18), executor).g(new acyq(this, 19), executor).f(new acyx(10), executor);
    }
}
