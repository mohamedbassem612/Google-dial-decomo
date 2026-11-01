package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abyu implements defpackage.xvb, defpackage.xva {
    public final int a;
    public final int b;
    public final defpackage.xus c;
    public final defpackage.abys d;
    public volatile defpackage.xsm e;
    public volatile boolean f;
    public volatile defpackage.xvb g;
    public final /* synthetic */ defpackage.abyv h;
    private volatile defpackage.xva i;
    private volatile boolean j;
    private volatile ajcq k;

    public abyu(defpackage.abyv abyvVar, defpackage.abys abysVar, int i, int i2, defpackage.xus xusVar) {
        j$.util.Objects.requireNonNull(abyvVar);
        this.h = abyvVar;
        this.a = i;
        this.b = i2;
        this.c = xusVar;
        this.d = abysVar;
    }

    @Override // defpackage.xvb
    public final java.lang.Class a() {
        return this.h.c;
    }

    @Override // defpackage.xva
    public final void c(java.lang.Object obj) {
        if (this.f) {
            return;
        }
        this.i.c(obj);
    }

    @Override // defpackage.xvb
    public final void d() {
        this.f = true;
        ajcq ajcqVar = this.k;
        if (ajcqVar != null) {
            ajcqVar.cancel(true);
        }
        defpackage.xvb xvbVar = this.g;
        if (xvbVar != null) {
            xvbVar.d();
        }
    }

    @Override // defpackage.xvb
    public final void e() {
        defpackage.xvb xvbVar = this.g;
        if (xvbVar != null) {
            xvbVar.e();
        }
    }

    @Override // defpackage.xvb
    public final defpackage.xuc ey() {
        return defpackage.xuc.b;
    }

    @Override // defpackage.xva
    public final void f(java.lang.Exception exc) {
        if (!this.f && !this.j) {
            defpackage.xur xurVar = defpackage.abyv.a;
            if ((exc instanceof defpackage.xuf) && ((defpackage.xuf) exc).a == 403) {
                this.j = true;
                defpackage.abyv abyvVar = this.h;
                defpackage.abys abysVar = this.d;
                aooh.f(abysVar, "fifeModel");
                ahys ahysVar = abysVar.c.a;
                defpackage.afmo afmoVar = abyvVar.e;
                java.lang.String str = (java.lang.String) afmoVar.b.get(ahysVar.a);
                if (str != null) {
                    try {
                        zwq.e((android.content.Context) afmoVar.d.a, str, 0L);
                    } catch (java.lang.Exception e) {
                        defpackage.afmo.a.d().k(e).l("com/google/android/libraries/user/profile/common/glide/FifeHeaderProvider", "invalidateHeaders$<anonymous>", 82, "FifeHeaderProvider.kt").v("Error while attempting to clear auth token");
                    }
                }
                afmoVar.b.remove(ahysVar.a);
                defpackage.abyz abyzVar = afmoVar.c;
                if (abyzVar != null) {
                    ((defpackage.yfy) ((defpackage.abyv) abyzVar).f.a).i(0L);
                }
                g(this.e, this.i);
                return;
            }
        }
        this.i.f(exc);
    }

    @Override // defpackage.xvb
    public final void g(defpackage.xsm xsmVar, defpackage.xva xvaVar) {
        this.e = xsmVar;
        this.i = xvaVar;
        if (this.f) {
            return;
        }
        defpackage.abyv abyvVar = this.h;
        defpackage.abys abysVar = this.d;
        aooh.f(abysVar, "fifeModel");
        ajcq ajcqVarEU = abyvVar.d.eU(new defpackage.afgu(abyvVar.e, abysVar.c.a, 2, null));
        aooh.c(ajcqVarEU);
        this.k = ajcqVarEU;
        aiql.I(ajcqVarEU, new kxp(this, xvaVar, 9), ajbm.a);
        if (this.f) {
            d();
        }
    }
}
