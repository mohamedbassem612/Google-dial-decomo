package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kni implements defpackage.oql {
    private static final aimz a = aimz.i("com/android/dialer/calllog/ui/hats/HomepageEaseOfUseHatsRule");
    private final aoin b;
    private final aoin c;

    public kni(aoin aoinVar, aoin aoinVar2) {
        aooh.f(aoinVar, "triggerId");
        aooh.f(aoinVar2, "enableSurvey");
        this.b = aoinVar;
        this.c = aoinVar2;
    }

    @Override // defpackage.oql
    public final defpackage.oqt a() {
        return defpackage.oqt.DIALER_HATS_CALL_END;
    }

    @Override // defpackage.oql
    public final /* synthetic */ aify b() {
        return aike.a;
    }

    @Override // defpackage.oql
    public final /* synthetic */ aify c() {
        return aike.a;
    }

    @Override // defpackage.oql
    public final java.lang.String d() {
        return "main.hats_container";
    }

    @Override // defpackage.oql
    public final java.lang.String e() {
        java.lang.Object objA = this.b.a();
        aooh.e(objA, "get(...)");
        return (java.lang.String) objA;
    }

    @Override // defpackage.oql
    public final ajcq f(oqi oqiVar) {
        boolean zBooleanValue = ((java.lang.Boolean) this.c.a()).booleanValue();
        aimz aimzVar = a;
        if (zBooleanValue) {
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calllog/ui/hats/HomepageEaseOfUseHatsRule", "shouldShowSurvey", 34, "HomepageEaseOfUseHatsRule.kt").v("enabled");
            return aiql.z(java.lang.Boolean.TRUE);
        }
        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calllog/ui/hats/HomepageEaseOfUseHatsRule", "shouldShowSurvey", 30, "HomepageEaseOfUseHatsRule.kt").v("disabled");
        return aiql.z(java.lang.Boolean.FALSE);
    }
}
