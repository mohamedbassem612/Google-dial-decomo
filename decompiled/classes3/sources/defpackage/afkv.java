package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afkv implements defpackage.afkj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ afkv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.afkj
    public final void a(defpackage.afpl afplVar) {
        if (this.$cid == 0) {
            boolean zE = afplVar.e();
            java.lang.Object obj = this.a;
            if (!zE) {
                ((defpackage.afky) obj).f(false);
                return;
            }
            defpackage.afky afkyVar = (defpackage.afky) obj;
            afkyVar.o = afplVar;
            afkyVar.g.a();
            afkyVar.f(true);
            return;
        }
        java.lang.Object obj2 = this.a;
        defpackage.aflw aflwVarB = ((defpackage.afke) obj2).b();
        if (aflwVarB == null) {
            android.util.Log.w("SurveyMultiSelectFrag", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
            return;
        }
        if (!afplVar.e()) {
            aflwVarB.t(false);
            return;
        }
        defpackage.afkh afkhVar = (defpackage.afkh) obj2;
        afkhVar.e = afplVar;
        afkhVar.d.a();
        aflwVarB.q(afkhVar.t(), (aw) obj2);
    }
}
