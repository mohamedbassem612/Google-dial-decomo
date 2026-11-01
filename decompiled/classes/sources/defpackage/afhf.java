package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afhf {
    public final java.lang.String a;
    public final defpackage.afhg b;
    public final defpackage.agtc c;
    public final java.lang.Object d;
    public final defpackage.ahny e;
    public java.util.List f;
    private final defpackage.ajcq g;
    private final defpackage.agtc h;
    private final defpackage.ajwr i;

    public afhf(defpackage.afhg afhgVar, defpackage.ajcq ajcqVar, boolean z) {
        defpackage.afhe afheVar = new defpackage.afhe(this);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        this.h = new defpackage.agtc(afheVar, ajbmVar);
        this.d = new java.lang.Object();
        this.f = new java.util.ArrayList();
        this.b = afhgVar;
        this.g = ajcqVar;
        this.a = afhgVar.d();
        this.c = new defpackage.agtc(afhgVar.a(), ajbmVar);
        this.i = new defpackage.ajwr();
        if (z) {
            this.e = new defpackage.ahnx();
        } else {
            this.e = new defpackage.ahnw();
        }
        b(new defpackage.afgz(this, 4));
    }

    public final defpackage.ajcq a(defpackage.ahyc ahycVar, java.util.concurrent.Executor executor) {
        defpackage.afgz afgzVar = new defpackage.afgz(ahycVar, 3);
        long j = defpackage.ahqx.a;
        defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), afgzVar, 1);
        new defpackage.ahzh(defpackage.ahwr.a).e();
        defpackage.ahoq ahoqVarB = this.e.b("Update ".concat(java.lang.String.valueOf(this.a)));
        try {
            defpackage.ajcq ajcqVarA = this.h.a();
            defpackage.ajwr ajwrVar = this.i;
            defpackage.nya nyaVar = new defpackage.nya(ajcqVarA, 14);
            defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
            ajwrVar.e(nyaVar, ajbmVar);
            defpackage.ajcq ajcqVarE = ajwrVar.e(new defpackage.ahqt(defpackage.ahns.c(false), new defpackage.adlp(this, ajcqVarA, ajaxVar, executor, 3), 0), ajbmVar);
            defpackage.aiql.K(ajcqVarE, ajcqVarA);
            defpackage.aiql.A(this.g);
            defpackage.ahye ahyeVar = new defpackage.ahye(null);
            int i = defpackage.ajan.c;
            defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarE, ahyeVar);
            ajcqVarE.c(ajamVar, defpackage.aiql.t(ajbmVar, ajamVar));
            ahoqVarB.a(ajamVar);
            ahoqVarB.close();
            return ajamVar;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarB.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void b(defpackage.ajat ajatVar) {
        synchronized (this.d) {
            this.f.add(ajatVar);
        }
    }

    public final defpackage.ajcq c() {
        defpackage.ajcq ajcqVarH;
        defpackage.ahny ahnyVar = this.e;
        ahnyVar.a();
        new defpackage.ahzh(defpackage.ahwr.a).e();
        defpackage.agtc agtcVar = this.h;
        if (agtcVar.c()) {
            ajcqVarH = this.b.h();
        } else {
            defpackage.ahoq ahoqVarB = ahnyVar.b("Get ".concat(java.lang.String.valueOf(this.a)));
            try {
                defpackage.ajcq ajcqVarA = agtcVar.a();
                defpackage.afgz afgzVar = new defpackage.afgz(this, 5);
                long j = defpackage.ahqx.a;
                defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), afgzVar, 1);
                defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                int i = defpackage.ajan.c;
                defpackage.ajal ajalVar = new defpackage.ajal(ajcqVarA, ajaxVar);
                ajcqVarA.c(ajalVar, defpackage.aiql.t(ajbmVar, ajalVar));
                ahoqVarB.a(ajalVar);
                ahoqVarB.close();
                ajcqVarH = ajalVar;
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarB.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        defpackage.aiql.A(this.g);
        return defpackage.aiql.A(ajcqVarH);
    }
}
