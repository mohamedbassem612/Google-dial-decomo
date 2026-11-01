package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adax {
    public final android.content.Context a;
    public final defpackage.ahzi b;
    public final defpackage.adch c;
    public final defpackage.ahyn d;
    public final defpackage.adbf e;
    public final java.util.concurrent.Executor f;
    public final defpackage.acvl g;
    public final java.util.HashMap h = new java.util.HashMap();
    public final defpackage.aogc i;
    private final defpackage.ahbq j;

    public adax(android.content.Context context, defpackage.ahzi ahziVar, defpackage.aogc aogcVar, defpackage.adch adchVar, defpackage.ahyn ahynVar, defpackage.adbf adbfVar, java.util.concurrent.Executor executor, defpackage.acvl acvlVar) {
        this.a = context;
        this.b = ahziVar;
        this.i = aogcVar;
        this.c = adchVar;
        this.d = ahynVar;
        this.e = adbfVar;
        this.f = executor;
        this.g = acvlVar;
        this.j = defpackage.ahbq.l(executor);
    }

    public final defpackage.ajcq a(java.lang.String str, android.net.Uri uri) {
        return !this.g.E() ? defpackage.aiql.z(defpackage.ahyn.g((defpackage.ajcq) this.h.get(uri))) : this.j.g(str);
    }

    public final defpackage.ajcq b(java.lang.String str, android.net.Uri uri) {
        if (this.g.E()) {
            return this.j.h(str);
        }
        defpackage.ajcq ajcqVar = (defpackage.ajcq) this.h.remove(uri);
        return ajcqVar == null ? defpackage.ajcm.a : ajcqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq c(java.lang.String str, acwb acwbVar, int i, long j, java.lang.String str2, android.net.Uri uri, java.lang.String str3, long j2, acvw acvwVar, adaw adawVar, int i2, java.util.List list, defpackage.akyp akypVar) {
        defpackage.ajcq ajcqVarAe;
        adav adavVar = new adav(this, acwbVar, i, j, str2, uri, str3, j2, acvwVar, i2, list, akypVar);
        defpackage.ajcr ajcrVar = new defpackage.ajcr(new defpackage.aczf(5));
        adcs adcsVarE = adcs.e(ajcrVar);
        java.util.concurrent.Executor executor = this.f;
        adcs adcsVarD = adcsVarE.g(adavVar, executor).g(new acze(adawVar, uri, 12, (byte[]) null), executor).d(java.lang.Exception.class, new acze(this, adawVar, 13, (byte[]) null), executor);
        if (this.g.E()) {
            defpackage.ahbq ahbqVar = this.j;
            int i3 = defpackage.adbe.a;
            ajcqVarAe = ((defpackage.tvn) ahbqVar.d).ae(new wwx(ahbqVar, str, adcsVarD, 10, (int[]) null), ahbqVar.c);
        } else {
            ajcqVarAe = defpackage.ahvr.F(new wwx(this, uri, adcsVarD, 9), executor);
        }
        return adcs.e(ajcqVarAe).g(new acyf(this, adcsVarD, ajcrVar, str, uri, 5), executor);
    }

    public final void d(java.lang.String str, android.net.Uri uri) {
        defpackage.ahvr.I(a(str, uri), new aczq(this, uri, str, 6, (byte[]) null), this.f);
    }
}
