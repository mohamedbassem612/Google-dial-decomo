package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class adby implements defpackage.afgr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.adba a;

    public /* synthetic */ adby(defpackage.adba adbaVar, int i) {
        this.$cid = i;
        this.a = adbaVar;
    }

    @Override // defpackage.afgr
    public final defpackage.albh a(afpl afplVar, defpackage.albh albhVar) {
        if (this.$cid != 0) {
            defpackage.akzx akzxVarM = defpackage.acvz.a.m();
            defpackage.ailj it = afplVar.f().entrySet().iterator();
            defpackage.adba adbaVar = this.a;
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                try {
                    java.lang.String str = (java.lang.String) entry.getValue();
                    defpackage.ahvr.ci(str);
                    try {
                        acvu acvuVar = acvu.a;
                        akzxVarM.aj((java.lang.String) entry.getKey(), (acvu) defpackage.abrz.E(str, defpackage.alad.M(acvu.class)));
                    } catch (defpackage.alaz e) {
                        defpackage.adbe.c("SharedPreferences file groups metadata had unexpected format: %s", e);
                        adbaVar.l(1084);
                    }
                } catch (java.lang.ClassCastException | java.lang.NullPointerException e2) {
                    defpackage.adbe.c("SharedPreferences file groups metadata key wasn't a string: %s", e2);
                    adbaVar.l(1083);
                }
            }
            return (defpackage.acvz) akzxVarM.r();
        }
        defpackage.akzx akzxVarM2 = defpackage.acwh.a.m();
        defpackage.ailj it2 = afplVar.f().entrySet().iterator();
        defpackage.adba adbaVar2 = this.a;
        while (it2.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it2.next();
            try {
                java.lang.String str2 = (java.lang.String) entry2.getValue();
                defpackage.ahvr.ci(str2);
                try {
                    acwg acwgVar = acwg.a;
                    akzxVarM2.al((java.lang.String) entry2.getKey(), (acwg) defpackage.abrz.E(str2, defpackage.alad.M(acwg.class)));
                } catch (defpackage.alaz e3) {
                    defpackage.adbe.c("SharedPreferences shared files metadata had unexpected format: %s", e3);
                    adbaVar2.l(1084);
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException e4) {
                defpackage.adbe.c("SharedPreferences shared files metadata key wasn't a string: %s", e4);
                adbaVar2.l(1083);
            }
        }
        return (defpackage.acwh) akzxVarM2.r();
    }
}
