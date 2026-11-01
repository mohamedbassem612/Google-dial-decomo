package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acza implements defpackage.aczw {
    public final defpackage.adba a;
    public final defpackage.aczz b;
    public final defpackage.aczp c;
    public final java.util.concurrent.Executor d;
    public final defpackage.acvl e;
    private final defpackage.aczp f;
    private final android.net.Uri g;
    private final android.net.Uri h;
    private final defpackage.adae i;
    private final defpackage.aogc j;

    public acza(defpackage.adba adbaVar, defpackage.aczz aczzVar, defpackage.aczp aczpVar, defpackage.aczp aczpVar2, android.net.Uri uri, android.net.Uri uri2, defpackage.adae adaeVar, defpackage.aogc aogcVar, java.util.concurrent.Executor executor, defpackage.acvl acvlVar) {
        this.a = adbaVar;
        this.b = aczzVar;
        this.c = aczpVar;
        this.f = aczpVar2;
        this.g = uri;
        this.h = uri2;
        this.i = adaeVar;
        this.j = aogcVar;
        this.d = executor;
        this.e = acvlVar;
    }

    private static defpackage.ajcq j() {
        return defpackage.aiql.y(new java.lang.IllegalStateException("Migration flag had unexpected state"));
    }

    private final void k(android.net.Uri uri) throws defpackage.affa {
        defpackage.aogc aogcVar = this.j;
        if (aogcVar.R(uri)) {
            aogcVar.P(uri);
        }
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq a() {
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            return this.b.a();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? j() : this.f.a();
        }
        return defpackage.ahvr.I(b(this.b.a()), new acyq(this, 8), this.d);
    }

    public final defpackage.ajcq b(defpackage.ajcq ajcqVar) {
        acyx acyxVar = new acyx(3);
        java.util.concurrent.Executor executor = this.d;
        return defpackage.ahvr.B(defpackage.ahvr.H(ajcqVar, acyxVar, executor), java.lang.Exception.class, new acyx(4), executor);
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq c() {
        qxq qxqVar = new qxq(18);
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            return this.b.c();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? j() : this.f.c();
        }
        return defpackage.ahvr.I(b(this.b.c()), new acyw(this, qxqVar, 19), this.d);
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq d() {
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            try {
                try {
                    k(this.g);
                    return this.b.d();
                } finally {
                    k(this.h);
                }
            } catch (java.io.IOException e) {
                return defpackage.aiql.y(e);
            }
        }
        if (iOrdinal == 2) {
            try {
                k(this.h);
                return defpackage.ahvr.I(this.b.d(), new acyq(this, 7), this.d);
            } catch (java.io.IOException e2) {
                return defpackage.aiql.y(e2);
            }
        }
        if (iOrdinal != 3) {
            return j();
        }
        try {
            k(this.g);
            return this.f.d();
        } catch (java.io.IOException e3) {
            return defpackage.aiql.y(e3);
        }
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq e(acwe acweVar) {
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            return this.b.e(acweVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? j() : this.f.e(acweVar);
        }
        return defpackage.ahvr.I(b(this.b.e(acweVar)), new acyw(this, acweVar, 13), this.d);
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq f(defpackage.aihd aihdVar) {
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            return this.b.f(aihdVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? j() : this.f.f(aihdVar);
        }
        return defpackage.ahvr.I(b(this.b.f(aihdVar)), new acyw(this, aihdVar, 15), this.d);
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq g(acwe acweVar) {
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            return this.b.g(acweVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? j() : this.f.g(acweVar);
        }
        return defpackage.ahvr.I(b(this.b.g(acweVar)), new acyw(this, acweVar, 17), this.d);
    }

    @Override // defpackage.aczw
    public final defpackage.ajcq h(acwe acweVar, acwg acwgVar) {
        int iOrdinal = this.i.b().ordinal();
        if (iOrdinal == 1) {
            return this.b.h(acweVar, acwgVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? j() : this.f.h(acweVar, acwgVar);
        }
        return defpackage.ahvr.I(b(this.b.h(acweVar, acwgVar)), new acyh(this, acweVar, acwgVar, 18), this.d);
    }

    public final defpackage.ajcq i(adbw adbwVar, adbw adbwVar2, int i) {
        int iM = this.e.m();
        if (defpackage.adbe.a(iM)) {
            boolean zEquals = adbwVar.equals(adbwVar2);
            defpackage.adba adbaVar = this.a;
            if (zEquals) {
                adbaVar.k(1106, iM);
            } else {
                adbaVar.k(i, iM);
            }
        }
        return adbwVar.a ? defpackage.aiql.z(adbwVar.a()) : defpackage.aiql.y((java.lang.Throwable) adbwVar.b());
    }
}
