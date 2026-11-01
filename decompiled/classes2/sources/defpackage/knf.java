package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class knf implements defpackage.oql {
    private static final aimz a = aimz.i("com/android/dialer/calllog/ui/hats/Cc26BaselineMakeCallHatsRule");
    private final aoin b;
    private final aoin c;
    private final int d;

    public knf(aoin aoinVar, aoin aoinVar2, int i) {
        aooh.f(aoinVar, "triggerId");
        aooh.f(aoinVar2, "enableSurvey");
        this.b = aoinVar;
        this.c = aoinVar2;
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
        boolean zBooleanValue = ((java.lang.Boolean) this.c.a()).booleanValue();
        aimz aimzVar = a;
        if (zBooleanValue) {
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calllog/ui/hats/Cc26BaselineMakeCallHatsRule", "shouldShowSurvey", 40, "Cc26BaselineMakeCallHatsRule.kt").v("enabled");
            return aiql.z(java.lang.Boolean.TRUE);
        }
        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calllog/ui/hats/Cc26BaselineMakeCallHatsRule", "shouldShowSurvey", 32, "Cc26BaselineMakeCallHatsRule.kt").v("disabled");
        return aiql.z(java.lang.Boolean.FALSE);
    }
}
