package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qes implements afgr {
    private final /* synthetic */ int $cid;

    public final albh a(defpackage.afpl afplVar, albh albhVar) {
        int i = this.$cid;
        if (i == 0) {
            akzx akzxVarP = ((defpackage.qer) albhVar).p();
            boolean zG = afplVar.g("suppress_rtt_merge_dialog", false);
            akzxVarP.u();
            defpackage.qer qerVar = (defpackage.qer) akzxVarP.b;
            qerVar.b |= 1;
            qerVar.c = zG;
            return (defpackage.qer) akzxVarP.p();
        }
        if (i != 1) {
            akzx akzxVarP2 = ((defpackage.rhq) albhVar).p();
            boolean zG2 = afplVar.g("ALWAYS_SHOW_INTERNATIONAL_CALL_ON_WIFI_WARNING", true);
            akzxVarP2.u();
            defpackage.rhq rhqVar = (defpackage.rhq) akzxVarP2.b;
            rhqVar.b |= 1;
            rhqVar.c = zG2;
            return (defpackage.rhq) akzxVarP2.p();
        }
        akzx akzxVarP3 = ((defpackage.qej) albhVar).p();
        boolean zG3 = afplVar.g("rtt_info_dialog_shown", false);
        akzxVarP3.u();
        defpackage.qej qejVar = (defpackage.qej) akzxVarP3.b;
        qejVar.b |= 1;
        qejVar.c = zG3;
        return (defpackage.qej) akzxVarP3.p();
    }
}
