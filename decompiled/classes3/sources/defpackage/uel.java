package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class uel implements java.util.concurrent.Callable {
    public final /* synthetic */ ueo a;
    public final /* synthetic */ defpackage.uen b;

    public /* synthetic */ uel(ueo ueoVar, defpackage.uen uenVar) {
        this.a = ueoVar;
        this.b = uenVar;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        anph anphVar = new anph();
        anoz anozVar = anph.b;
        int i = anpc.d;
        anphVar.h(new anoy("X-Goog-Api-Key", anozVar), "AIzaSyDEabslTraNEB9Tn0sKiJuSyoUN5Uebus8");
        ueo ueoVar = this.a;
        android.content.Context context = ueoVar.d;
        java.lang.String strA = uey.a(context);
        if (strA != null) {
            anphVar.h(new anoy("X-Android-Cert", anozVar), strA);
        } else {
            a.bI(uey.a.c().m(aioa.b), "X-Android-Cert value unavailable.", "com/android/dialer/spam/inapp/SpamGrpcStubFactory", "produceApiKeyInterceptor", 'R', "SpamGrpcStubFactory.java", zct.b);
        }
        uey ueyVar = ueoVar.e;
        defpackage.uen uenVar = this.b;
        anphVar.h(new anoy("X-Android-Package", anozVar), context.getPackageName());
        java.util.List listSingletonList = java.util.Collections.singletonList(new aohs(anphVar));
        aofa aofaVar = new aofa(ueyVar.c.k(), 443);
        aofaVar.e(listSingletonList);
        aofaVar.c(ueyVar.b);
        anor anorVarA = aofaVar.a();
        ajed ajedVarI = ajed.b(new ajeb(0), anorVarA).i(10000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        defpackage.ufb ufbVar = new defpackage.ufb(anorVarA, uenVar, 1);
        long jLongValue = ((java.lang.Long) ueoVar.i.a()).longValue();
        ajdx ajdxVar = ajdx.a;
        akzx akzxVarM = ajdxVar.m();
        akzxVarM.u();
        akzxVarM.b.e = -1L;
        long jA = ueu.a(context);
        akzxVarM.u();
        akzxVarM.b.d = jA;
        akzxVarM.u();
        akzxVarM.b.c = jLongValue;
        java.util.Set<java.lang.String> stringSet = context.getSharedPreferences(context.getPackageName(), 0).getStringSet("global_blacklist_country_codes", null);
        if (stringSet == null) {
            stringSet = null;
        }
        if (stringSet != null) {
            akzxVarM.u();
            ajdx ajdxVar2 = akzxVarM.b;
            alat alatVar = ajdxVar2.f;
            if (!alatVar.c()) {
                ajdxVar2.f = alad.J(alatVar);
            }
            akyl.i(stringSet, ajdxVar2.f);
        }
        java.lang.String str = (java.lang.String) ueoVar.f.z().orElse((java.lang.Object) null);
        akzxVarM.u();
        ajdx ajdxVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        ajdxVar3.b = str;
        ajdx ajdxVarP = akzxVarM.p();
        ueo.a.b().l("com/android/dialer/spam/inapp/SpamAsyncTaskUtil", "getAndUpdateServerSpamList", 156, "SpamAsyncTaskUtil.java").y("request: %s", ajdxVarP);
        defpackage.uem uemVar = new defpackage.uem(ueoVar, ufbVar);
        anmc anmcVar = ((aohh) ajedVarI).a;
        anpk anpkVar = ajee.a;
        if (anpkVar == null) {
            synchronized (ajee.class) {
                anpkVar = ajee.a;
                if (anpkVar == null) {
                    aal aalVarD = anpk.d();
                    aalVarD.b = anpj.a;
                    aalVarD.d = anpk.c("scooby.SpamProtectionService", "GetSpamNumbers");
                    aalVarD.b();
                    akzq akzqVar = aohd.a;
                    aalVarD.e = new aohc(ajdxVar);
                    aalVarD.c = new aohc(ajdy.a);
                    anpk anpkVarA = aalVarD.a();
                    ajee.a = anpkVarA;
                    anpkVar = anpkVarA;
                }
            }
        }
        ajsz ajszVarB = anmcVar.b(anpkVar, ((aohh) ajedVarI).b);
        int i2 = aohp.b;
        aohp.b(ajszVarB, ajdxVarP, new aohm(uemVar, new aohj(ajszVarB, false)));
        return null;
    }
}
