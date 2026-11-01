package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class tcd extends defpackage.aonv implements defpackage.aono {
    public tcd(java.lang.Object obj) {
        super(3, obj, defpackage.tcf.class, "migrate", "migrate(Landroidx/datastore/migrations/SharedPreferencesView;Lcom/android/dialer/reverselookup/settings/ReverseLookupSettingsData;)Lcom/android/dialer/reverselookup/settings/ReverseLookupSettingsData;", 4);
    }

    @Override // defpackage.aono
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.vx vxVar = (defpackage.vx) obj;
        defpackage.ipc ipcVarX = defpackage.ttj.X(((defpackage.tch) obj2).L());
        defpackage.akzx akzxVar = (defpackage.akzx) ipcVarX.a;
        if (!((defpackage.tch) akzxVar.b).e) {
            ipcVarX.an();
            ipcVarX.al(vxVar.w("google_caller_id", true));
        }
        if (!((defpackage.tch) akzxVar.b).f) {
            ipcVarX.ao();
            ipcVarX.am(vxVar.w("spam_blocking", false));
        }
        return ipcVarX.ak();
    }
}
