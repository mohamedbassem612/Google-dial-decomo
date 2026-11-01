package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ogz implements defpackage.oql {
    private final /* synthetic */ int $cid;
    private final aoss a;
    private final aoin b;
    private final aoin c;

    public ogz(aoss aossVar, aoin aoinVar, aoin aoinVar2, int i) {
        this.$cid = i;
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aoinVar, "happinessSurveyTriggerId");
        aooh.f(aoinVar2, "enableHappinessSurvey");
        this.a = aossVar;
        this.b = aoinVar;
        this.c = aoinVar2;
    }

    @Override // defpackage.oql
    public final defpackage.oqt a() {
        if (this.$cid != 0) {
        }
        return defpackage.oqt.DIALER_HATS_CALL_END;
    }

    @Override // defpackage.oql
    public final /* synthetic */ aify b() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? aike.a : aike.a;
        }
        return aike.a;
    }

    @Override // defpackage.oql
    public final /* synthetic */ aify c() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? aike.a : aike.a;
        }
        return aike.a;
    }

    @Override // defpackage.oql
    public final java.lang.String d() {
        return "main.hats_container";
    }

    @Override // defpackage.oql
    public final java.lang.String e() {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object objA = this.b.a();
            aooh.e(objA, "get(...)");
            return (java.lang.String) objA;
        }
        aoin aoinVar = this.b;
        if (i != 1) {
            java.lang.Object objA2 = aoinVar.a();
            aooh.e(objA2, "get(...)");
            return (java.lang.String) objA2;
        }
        java.lang.Object objA3 = aoinVar.a();
        aooh.e(objA3, "get(...)");
        return (java.lang.String) objA3;
    }

    @Override // defpackage.oql
    public final ajcq f(oqi oqiVar) {
        int i = this.$cid;
        if (i == 0) {
            if (!((java.lang.Boolean) this.c.a()).booleanValue()) {
                return aiql.z(java.lang.Boolean.FALSE);
            }
            java.lang.Object objA = this.b.a();
            aooh.e(objA, "get(...)");
            return ((java.lang.CharSequence) objA).length() == 0 ? aiql.z(java.lang.Boolean.FALSE) : aosv.F(this.a, 0, new defpackage.ogf(oqiVar, (aoln) null, 3), 3);
        }
        aoin aoinVar = this.c;
        if (i != 1) {
            if (!((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                return aiql.z(java.lang.Boolean.FALSE);
            }
            java.lang.Object objA2 = this.b.a();
            aooh.e(objA2, "get(...)");
            return ((java.lang.CharSequence) objA2).length() == 0 ? aiql.z(java.lang.Boolean.FALSE) : aosv.F(this.a, 0, new defpackage.oha(oqiVar, null), 3);
        }
        if (!((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            return aiql.z(java.lang.Boolean.FALSE);
        }
        java.lang.Object objA3 = this.b.a();
        aooh.e(objA3, "get(...)");
        return ((java.lang.CharSequence) objA3).length() == 0 ? aiql.z(java.lang.Boolean.FALSE) : aosv.F(this.a, 0, new nto(oqiVar, (aoln) null, 18), 3);
    }

    public ogz(aoss aossVar, aoin aoinVar, aoin aoinVar2, int i, byte[] bArr) {
        this.$cid = i;
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aoinVar, "happinessSurveyTriggerId");
        aooh.f(aoinVar2, "enableHappinessSurvey");
        this.a = aossVar;
        this.b = aoinVar;
        this.c = aoinVar2;
    }

    public ogz(aoss aossVar, aoin aoinVar, aoin aoinVar2, int i, char[] cArr) {
        this.$cid = i;
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aoinVar, "happinessSurveyTriggerId");
        aooh.f(aoinVar2, "enableHappinessSurvey");
        this.a = aossVar;
        this.b = aoinVar;
        this.c = aoinVar2;
    }
}
