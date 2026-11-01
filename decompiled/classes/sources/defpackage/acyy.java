package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acyy implements defpackage.acyv {
    public final defpackage.aczl a;
    public final java.util.concurrent.Executor b;
    private final defpackage.adba c;
    private final defpackage.aczx d;
    private final defpackage.aczl e;
    private final android.net.Uri f;
    private final android.net.Uri g;
    private final defpackage.acvl h;
    private final defpackage.adae i;
    private final defpackage.aogc j;

    public acyy(defpackage.adba adbaVar, defpackage.aczx aczxVar, defpackage.aczl aczlVar, defpackage.aczl aczlVar2, android.net.Uri uri, android.net.Uri uri2, defpackage.adae adaeVar, defpackage.aogc aogcVar, java.util.concurrent.Executor executor, defpackage.acvl acvlVar) {
        this.c = adbaVar;
        this.d = aczxVar;
        this.e = aczlVar2;
        this.a = aczlVar;
        this.f = uri;
        this.g = uri2;
        this.i = adaeVar;
        this.j = aogcVar;
        this.b = executor;
        this.h = acvlVar;
    }

    private static defpackage.ajcq q() {
        return defpackage.aiql.y(new java.lang.IllegalStateException("Migration flag had unexpected state"));
    }

    private final void r(android.net.Uri uri) throws defpackage.affa {
        defpackage.aogc aogcVar = this.j;
        if (aogcVar.R(uri)) {
            aogcVar.P(uri);
        }
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq a(acvu acvuVar) {
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            return this.d.a(acvuVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.a(acvuVar);
        }
        return defpackage.ahvr.I(n(this.d.a(acvuVar)), new acyw(this, acvuVar, 9), this.b);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq b() {
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            return this.d.b();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.b();
        }
        return defpackage.ahvr.I(n(this.d.b()), new acyq(this, 4), this.b);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq c() {
        qxq qxqVar = new qxq(17);
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            return this.d.c();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.c();
        }
        return defpackage.ahvr.I(n(this.d.c()), new acyg(this, qxqVar, 15), this.b);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq d() {
        qxq qxqVar = new qxq(16);
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            return this.d.d();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.d();
        }
        return defpackage.ahvr.I(n(this.d.d()), new acyw(this, qxqVar, 5), this.b);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq e() {
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            return this.d.e();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.e();
        }
        return defpackage.ahvr.I(n(this.d.e()), new acyq(this, 6), this.b);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq f() {
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            try {
                try {
                    r(this.f);
                    return defpackage.ajcm.a;
                } finally {
                    r(this.g);
                }
            } catch (java.io.IOException e) {
                return defpackage.aiql.y(e);
            }
        }
        if (iOrdinal == 2) {
            try {
                r(this.g);
                return defpackage.ajcm.a;
            } catch (java.io.IOException e2) {
                return defpackage.aiql.y(e2);
            }
        }
        if (iOrdinal != 3) {
            return q();
        }
        try {
            r(this.f);
            return defpackage.ajcm.a;
        } catch (java.io.IOException e3) {
            return defpackage.aiql.y(e3);
        }
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq g(acwb acwbVar) {
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            return this.d.g(acwbVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.g(acwbVar);
        }
        return defpackage.ahvr.I(n(this.d.g(acwbVar)), new acyw(this, acwbVar, 8), this.b);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq h(acwb acwbVar) {
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            return this.d.h(acwbVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.h(acwbVar);
        }
        return defpackage.ahvr.I(n(this.d.h(acwbVar)), new acyw(this, acwbVar, 3), this.b);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq i(acwb acwbVar) {
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            return this.d.i(acwbVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.i(acwbVar);
        }
        return defpackage.ahvr.I(n(this.d.i(acwbVar)), new acyw(this, acwbVar, 2), this.b);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq j(java.util.List list) {
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            return this.d.j(list);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.j(list);
        }
        return defpackage.ahvr.I(n(this.d.j(list)), new acyw(this, list, 6), this.b);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq k() {
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            return this.d.k();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.k();
        }
        return defpackage.ahvr.I(n(this.d.k()), new acyq(this, 5), this.b);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq l(acwb acwbVar, acvu acvuVar) {
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            return this.d.l(acwbVar, acvuVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.l(acwbVar, acvuVar);
        }
        return defpackage.ahvr.I(n(this.d.l(acwbVar, acvuVar)), new acyh(this, acwbVar, acvuVar, 14), this.b);
    }

    @Override // defpackage.acyv
    public final defpackage.ajcq m(java.util.List list) {
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            return this.d.m(list);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.e.m(list);
        }
        return defpackage.ahvr.I(n(this.d.m(list)), new acyg(this, list, 19), this.b);
    }

    public final defpackage.ajcq n(defpackage.ajcq ajcqVar) {
        acyx acyxVar = new acyx(0);
        java.util.concurrent.Executor executor = this.b;
        return defpackage.ahvr.B(defpackage.ahvr.H(ajcqVar, acyxVar, executor), java.lang.Exception.class, new acyx(2), executor);
    }

    public final defpackage.ajcq o(adbw adbwVar, adbw adbwVar2, int i) {
        int iM = this.h.m();
        if (defpackage.adbe.a(iM)) {
            boolean zEquals = adbwVar.equals(adbwVar2);
            defpackage.adba adbaVar = this.c;
            if (zEquals) {
                adbaVar.k(1107, iM);
            } else {
                adbaVar.k(i, iM);
            }
        }
        return adbwVar.a ? defpackage.aiql.z(adbwVar.a()) : defpackage.aiql.y((java.lang.Throwable) adbwVar.b());
    }

    public final defpackage.ajcq p(adbw adbwVar, adbw adbwVar2, java.util.Comparator comparator, int i) {
        int iM = this.h.m();
        if (defpackage.adbe.a(iM)) {
            boolean zD = adbw.d(adbwVar, adbwVar2, comparator);
            defpackage.adba adbaVar = this.c;
            if (zD) {
                adbaVar.k(1106, iM);
            } else {
                adbaVar.k(i, iM);
            }
        }
        if (adbwVar.a) {
            java.util.List list = (java.util.List) adbwVar.a();
            defpackage.ahvr.ci(list);
            return defpackage.aiql.z(list);
        }
        java.lang.Object objB = adbwVar.b();
        defpackage.ahvr.ci(objB);
        return defpackage.aiql.y((java.lang.Throwable) objB);
    }
}
