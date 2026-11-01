package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mav implements defpackage.oql {
    public final maw a;
    public final aoin b;
    private final aoss c;
    private final aoin d;
    private final aoin e;

    public mav(aoss aossVar, aazc aazcVar, maw mawVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aazcVar, "clock");
        aooh.f(mawVar, "reverseLookupHatsEventLogger");
        aooh.f(aoinVar, "happinessSurveyLastClickSeconds");
        aooh.f(aoinVar2, "happinessSurveyTriggerId");
        aooh.f(aoinVar3, "enableHappinessSurvey");
        this.c = aossVar;
        this.a = mawVar;
        this.b = aoinVar;
        this.d = aoinVar2;
        this.e = aoinVar3;
    }

    @Override // defpackage.oql
    public final defpackage.oqt a() {
        return defpackage.oqt.DIALER_HATS_RECENTS_TAB_STARTED;
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
        java.lang.Object objA = this.d.a();
        aooh.e(objA, "get(...)");
        return (java.lang.String) objA;
    }

    @Override // defpackage.oql
    public final ajcq f(oqi oqiVar) {
        if (!((java.lang.Boolean) this.e.a()).booleanValue()) {
            return aiql.z(java.lang.Boolean.FALSE);
        }
        java.lang.Object objA = this.d.a();
        aooh.e(objA, "get(...)");
        return ((java.lang.CharSequence) objA).length() == 0 ? aiql.z(java.lang.Boolean.FALSE) : aosv.F(this.c, 0, new defpackage.hyq(this, j$.time.Instant.now(), oqiVar, (aoln) null, 20), 3);
    }
}
