package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sbf implements oql {
    public static final aimz a = aimz.i("com/android/dialer/patrick/impl/hats/CallingCardSurveyHatsRule");
    private final aoss b;
    private final aoin c;
    private final aoin d;

    public sbf(aoss aossVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aoinVar, "enableCallingCardHatsSurvey");
        aooh.f(aoinVar2, "callingCardSurveyTriggerId");
        this.b = aossVar;
        this.c = aoinVar;
        this.d = aoinVar2;
    }

    public final oqt a() {
        return oqt.b;
    }

    public final aify b() {
        return aify.p(oqu.g);
    }

    public final /* synthetic */ aify c() {
        return aike.a;
    }

    public final java.lang.String d() {
        return "main.hats_container";
    }

    public final java.lang.String e() {
        java.lang.Object objA = this.d.a();
        aooh.e(objA, "get(...)");
        return (java.lang.String) objA;
    }

    public final ajcq f(oqi oqiVar) {
        if (((java.lang.Boolean) this.c.a()).booleanValue()) {
            java.lang.Object objA = this.d.a();
            aooh.e(objA, "get(...)");
            if (((java.lang.CharSequence) objA).length() != 0) {
                return aosv.F(this.b, 0, new defpackage.roy(oqiVar, (aoln) null, 11), 3);
            }
        }
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/patrick/impl/hats/CallingCardSurveyHatsRule", "shouldShowSurvey", 47, "CallingCardSurveyHatsRule.kt").v("Calling Card survey should not be shown.");
        return aiql.z(java.lang.Boolean.FALSE);
    }
}
