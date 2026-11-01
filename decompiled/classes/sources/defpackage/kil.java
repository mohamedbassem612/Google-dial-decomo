package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kil implements defpackage.rnv {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/mainscreenintegration/CallLogMainScreenFeatureProvider");
    private final defpackage.aoin b;

    public kil(defpackage.kcq kcqVar, defpackage.ahpz ahpzVar, defpackage.apni apniVar, defpackage.aoss aossVar, defpackage.ajct ajctVar, defpackage.aoin aoinVar) {
        if (kcqVar == null) {
            defpackage.aooh.i("missedCallCountRetainedState");
        }
        if (ahpzVar == null) {
            defpackage.aooh.i("traceCreation");
        }
        if (apniVar == null) {
            defpackage.aooh.i("androidJobs");
        }
        if (aossVar == null) {
            defpackage.aooh.i("activityRetainedCoroutineScope");
        }
        if (ajctVar == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("enableCallLogInCompose");
        }
        this.b = aoinVar;
    }

    @Override // defpackage.rnv
    public final defpackage.aw a() {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/calllog/mainscreenintegration/CallLogMainScreenFeatureProvider", "createScreen", 38, "CallLogMainScreenFeatureProvider.kt")).v("creating CallLogFragment");
        if (!((java.lang.Boolean) this.b.a()).booleanValue()) {
            return new kld();
        }
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/calllog/mainscreenintegration/CallLogMainScreenFeatureProvider", "createScreen", 41, "CallLogMainScreenFeatureProvider.kt")).v("creating CallLogComposeFragment");
        return new defpackage.kbi();
    }

    @Override // defpackage.rnv
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        defpackage.ipc ipcVarAb = defpackage.ttj.ab(defpackage.rob.a.m());
        ipcVarAb.aV(defpackage.roc.CALL_LOG_TAB_KEY);
        ipcVarAb.aW(true);
        ipcVarAb.aU(true);
        return ipcVarAb.aT();
    }

    @Override // defpackage.rnv
    public final java.lang.String c() {
        return "call_log_fragment";
    }

    @Override // defpackage.rnv
    public final java.util.Set d() {
        return defpackage.aoke.a;
    }
}
