package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aehh extends defpackage.xlh {
    private final defpackage.uzx i;

    /* JADX WARN: Type inference failed for: r10v1, types: [ecx, java.lang.Object] */
    public aehh(defpackage.xhu xhuVar, final java.util.function.Supplier supplier, java.util.Collection collection, java.lang.Class cls, aolr aolrVar, defpackage.uzx uzxVar) {
        aooh.f(xhuVar, "component");
        aooh.f(aolrVar, "context");
        defpackage.xkp xkpVar = new defpackage.xkp(supplier, cls);
        apbj apbjVarN = aosv.n(aolrVar);
        java.util.function.Supplier supplier2 = new java.util.function.Supplier() { // from class: xmi
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                int i = defpackage.xlh.h;
                java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(supplier);
                aooh.e(objM, "get(...)");
                return new defpackage.xpy((android.content.Context) objM);
            }
        };
        java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(supplier);
        aooh.e(objM, "get(...)");
        android.content.Context context = (android.content.Context) objM;
        java.lang.Object objM2 = aa$.ExternalSyntheticApiModelOutline1.m(supplier);
        aooh.e(objM2, "get(...)");
        android.content.Context context2 = (android.content.Context) objM2;
        aoqc[] aoqcVarArr = defpackage.xor.a;
        aooh.f(context2, "<this>");
        defpackage.xhd xhdVar = new defpackage.xhd(context, new xtq(context), new defpackage.xpy(context), apbjVarN, defpackage.xor.b.a(context2, defpackage.xor.a[0]));
        aoke aokeVar = aoke.a;
        java.lang.Object objM3 = aa$.ExternalSyntheticApiModelOutline1.m(supplier2);
        aooh.e(objM3, "get(...)");
        defpackage.xmw xmwVar = new defpackage.xmw((defpackage.xpz) objM3, xhdVar, apbjVarN);
        java.lang.Object objM4 = aa$.ExternalSyntheticApiModelOutline1.m(supplier2);
        aooh.e(objM4, "get(...)");
        defpackage.xkw xkwVar = new defpackage.xkw(supplier, (defpackage.xpz) objM4);
        defpackage.xov xovVar = defpackage.xov.a;
        defpackage.aopd aopdVar = new defpackage.aopd();
        aooh.f(xhuVar, "component");
        super(xhuVar, supplier, collection, xkpVar, apbjVarN.a, supplier2, aokeVar, aokeVar, xmwVar, xkwVar, xovVar, xhdVar, aopdVar, new defpackage.xon(xhuVar, supplier, collection, xkpVar, apbjVarN, supplier2, xmwVar, aokeVar, aokeVar, aopdVar));
        this.i = uzxVar;
    }

    @Override // defpackage.xlh, defpackage.xlu
    public final com.android.onboarding.tasks.ErasedOnboardingTaskState f(com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken) {
        aooh.f(erasedOnboardingTaskToken, "token");
        ahpm ahpmVarAO = this.i.aO("TikTokOnboardingTaskManagerServiceBinder", "getTaskState");
        try {
            com.android.onboarding.tasks.ErasedOnboardingTaskState erasedOnboardingTaskStateF = super.f(erasedOnboardingTaskToken);
            ajsz.ak(ahpmVarAO, (java.lang.Throwable) null);
            return erasedOnboardingTaskStateF;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahpmVarAO, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.xlh, defpackage.xlu
    public final boolean s(com.android.onboarding.tasks.ErasedOnboardingTaskToken erasedOnboardingTaskToken, android.os.PersistableBundle persistableBundle) {
        aooh.f(erasedOnboardingTaskToken, "token");
        aooh.f(persistableBundle, "bundle");
        ahpm ahpmVarAO = this.i.aO("TikTokOnboardingTaskManagerServiceBinder", "startTask");
        try {
            boolean zS = super.s(erasedOnboardingTaskToken, persistableBundle);
            ajsz.ak(ahpmVarAO, (java.lang.Throwable) null);
            return zS;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahpmVarAO, th);
                throw th2;
            }
        }
    }
}
