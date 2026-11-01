package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kng implements defpackage.oql {
    private static final aimz a = aimz.i("com/android/dialer/calllog/ui/hats/Cc26LaunchFindingInfoHatsRule");
    private final aoin b;
    private final aoin c;
    private final int d;
    private final zjm e;

    public kng(aoin aoinVar, aoin aoinVar2, zjm zjmVar, int i) {
        aooh.f(aoinVar, "triggerId");
        aooh.f(aoinVar2, "enableSurvey");
        this.b = aoinVar;
        this.c = aoinVar2;
        this.e = zjmVar;
        this.d = 5;
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
        if (!((java.lang.Boolean) this.c.a()).booleanValue()) {
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calllog/ui/hats/Cc26LaunchFindingInfoHatsRule", "shouldShowSurvey", 35, "Cc26LaunchFindingInfoHatsRule.kt").v("disabled");
            return aiql.z(java.lang.Boolean.FALSE);
        }
        boolean zIsPresent = this.e.g().isPresent();
        aimz aimzVar = a;
        if (zIsPresent) {
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calllog/ui/hats/Cc26LaunchFindingInfoHatsRule", "shouldShowSurvey", 47, "Cc26LaunchFindingInfoHatsRule.kt").v("enabled");
            return aiql.z(java.lang.Boolean.TRUE);
        }
        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calllog/ui/hats/Cc26LaunchFindingInfoHatsRule", "shouldShowSurvey", 43, "Cc26LaunchFindingInfoHatsRule.kt").v("disabled");
        return aiql.z(java.lang.Boolean.FALSE);
    }
}
