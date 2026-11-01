package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class okx implements defpackage.ahek {
    private final defpackage.aoin a;
    private final defpackage.rsr b;

    public okx(defpackage.rsr rsrVar, defpackage.aoin aoinVar) {
        defpackage.aooh.f(aoinVar, "disableChargingConstraint");
        this.b = rsrVar;
        this.a = aoinVar;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [aoin, java.lang.Object] */
    @Override // defpackage.ahek
    public final defpackage.ajcq a() {
        defpackage.ahyn ahynVarH;
        defpackage.aoin aoinVar = this.a;
        defpackage.ahwt ahwtVar = defpackage.ahwt.a;
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            defpackage.acxc acxcVarA = defpackage.acxd.a();
            acxcVarA.c(false);
            acxcVarA.b(true);
            defpackage.acxd acxdVarA = acxcVarA.a();
            ahynVarH = defpackage.ahyn.h(defpackage.aigf.n("MDD.WIFI.CHARGING.PERIODIC.TASK", acxdVarA, "MDD.CELLULAR.CHARGING.PERIODIC.TASK", acxdVarA, "MDD.MAINTENANCE.PERIODIC.GCM.TASK", acxdVarA, "MDD.CHARGING.PERIODIC.TASK", acxdVarA));
        } else {
            ahynVarH = ahwtVar;
        }
        defpackage.rsr rsrVar = this.b;
        defpackage.ajcq ajcqVarE = ((defpackage.acwi) rsrVar.a.a()).e(new defpackage.acwz(ahynVarH, ahwtVar));
        defpackage.aooh.e(ajcqVarE, "schedulePeriodicBackgroundTasks(...)");
        return ajcqVarE;
    }
}
