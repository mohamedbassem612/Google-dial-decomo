package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mvk implements defpackage.oql {
    private final aoss a;
    private final aoin b;
    private final mnk c;

    public mvk(aoss aossVar, aoin aoinVar, mnk mnkVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aoinVar, "dobbyHappinessSurveyTriggerId");
        this.a = aossVar;
        this.b = aoinVar;
        this.c = mnkVar;
    }

    @Override // defpackage.oql
    public final defpackage.oqt a() {
        return defpackage.oqt.DIALER_HATS_CALL_END;
    }

    @Override // defpackage.oql
    public final aify b() {
        return aify.p(defpackage.oqu.DIALER_HATS_PSD_DOBBY);
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
        if (!this.c.a()) {
            return aiql.z(java.lang.Boolean.FALSE);
        }
        java.lang.Object objA = this.b.a();
        aooh.e(objA, "get(...)");
        return ((java.lang.CharSequence) objA).length() == 0 ? aiql.z(java.lang.Boolean.FALSE) : aosv.F(this.a, 0, new defpackage.muz(oqiVar, (aoln) null, 4), 3);
    }
}
