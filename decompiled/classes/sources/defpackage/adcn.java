package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adcn implements defpackage.acvk {
    public final android.net.Uri a;
    public final defpackage.ahzi b;
    public final defpackage.ahzi c;
    public final java.util.concurrent.Executor d;
    public final defpackage.ahyn e;
    public final defpackage.adai f;
    private final android.content.Context g;
    private final defpackage.adao h;
    private final defpackage.tvn i = new defpackage.tvn((byte[]) null, (byte[]) null);
    private final defpackage.tvn j;
    private final defpackage.aogc k;

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ahzi, java.lang.Object] */
    public adcn(defpackage.adcm adcmVar) {
        android.content.Context context = (android.content.Context) adcmVar.a;
        this.g = context;
        this.a = defpackage.abrz.R((android.content.Context) adcmVar.a);
        this.b = adcmVar.b;
        this.c = adcmVar.c;
        this.h = (defpackage.adao) adcmVar.h;
        this.k = (defpackage.aogc) adcmVar.d;
        ?? r1 = adcmVar.e;
        this.d = r1;
        this.e = (defpackage.ahyn) adcmVar.f;
        this.j = new defpackage.tvn(adcmVar.i);
        java.lang.Object obj = adcmVar.g;
        android.net.Uri uriBuild = defpackage.abrz.R(context).buildUpon().appendPath("manifest_metadata.pb").build();
        defpackage.afgo afgoVarA = defpackage.afgp.a();
        afgoVarA.e(uriBuild);
        afgoVarA.d(defpackage.adcp.a);
        this.f = new defpackage.adai(((defpackage.ahbz) obj).k(afgoVarA.a()), (java.util.concurrent.Executor) r1);
    }

    public static defpackage.ahyn b(adco adcoVar) {
        return (adcoVar.b & 2) != 0 ? defpackage.ahyn.h(adcoVar.d) : defpackage.ahwt.a;
    }

    public static adco f(java.lang.String str, int i, defpackage.ahyn ahynVar) {
        defpackage.akzx akzxVarM = adco.a.m();
        akzxVarM.u();
        adco adcoVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        adcoVar.b |= 1;
        adcoVar.c = str;
        akzxVarM.u();
        adco adcoVar2 = akzxVarM.b;
        adcoVar2.e = i - 1;
        adcoVar2.b |= 4;
        if (ahynVar.f()) {
            java.lang.String str2 = (java.lang.String) ahynVar.b();
            akzxVarM.u();
            adco adcoVar3 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            adcoVar3.b |= 2;
            adcoVar3.d = str2;
        }
        return akzxVarM.r();
    }

    @Override // defpackage.acvk
    public final defpackage.ajcq a(defpackage.acwi acwiVar) {
        return this.i.af(defpackage.ahqx.b(new adck(this, acwiVar, 0)), this.d);
    }

    public final defpackage.ajcq c(defpackage.acwi acwiVar, android.net.Uri uri, java.util.concurrent.atomic.AtomicReference atomicReference) {
        int i = defpackage.adbe.a;
        adcs adcsVarE = adcs.e(defpackage.acvh.a(this.h.a(uri), acvg.Z, "Failed to parse the manifest file."));
        acze aczeVar = new acze(this, acwiVar, 15, (byte[]) null);
        java.util.concurrent.Executor executor = this.d;
        return adcsVarE.g(aczeVar, executor).g(new aczi(atomicReference, 19), executor);
    }

    public final void d(android.net.Uri uri) throws defpackage.acvh {
        try {
            defpackage.aogc aogcVar = this.k;
            if (!aogcVar.R(uri)) {
                int i = defpackage.adbe.a;
            } else {
                int i2 = defpackage.adbe.a;
                aogcVar.P(uri);
            }
        } catch (java.io.IOException e) {
            yg ygVarB = defpackage.acvh.b();
            ygVarB.c = e;
            ygVarB.b = acvg.aa;
            ygVarB.d = "Failed to delete manifest file.";
            throw ygVarB.d();
        }
    }

    public final void e(defpackage.acvh acvhVar, defpackage.acve acveVar) {
        this.j.ag(airh.j(acvhVar.a.aL), acveVar.c, this.g.getPackageName(), acveVar.d);
    }

    public final void g(int i, defpackage.acve acveVar) {
        this.j.ag(i, acveVar.c, this.g.getPackageName(), acveVar.d);
    }
}
