package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class omc implements defpackage.roa {
    private final /* synthetic */ int $cid;

    public omc(int i) {
        this.$cid = i;
    }

    @Override // defpackage.roa
    public final java.lang.Object a() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.ipc ipcVarAc = defpackage.ttj.ac(defpackage.rny.a.m());
            ipcVarAc.aY(defpackage.rnz.HELP_AND_FEEDBACK_NAV_MENU_KEY);
            ipcVarAc.bb(2132020527);
            ipcVarAc.aZ(2131231456);
            ipcVarAc.ba(2131428325);
            return ipcVarAc.aX();
        }
        if (i != 1) {
            defpackage.ipc ipcVarAc2 = defpackage.ttj.ac(defpackage.rny.a.m());
            ipcVarAc2.aY(defpackage.rnz.SETTINGS_NAV_MENU_KEY);
            ipcVarAc2.bb(2132020528);
            ipcVarAc2.aZ(2131231594);
            ipcVarAc2.ba(2131428928);
            return ipcVarAc2.aX();
        }
        defpackage.ipc ipcVarAc3 = defpackage.ttj.ac(defpackage.rny.a.m());
        ipcVarAc3.aY(defpackage.rnz.CLEAR_CALL_HISTORY_NAV_MENU_KEY);
        ipcVarAc3.bb(2132020525);
        ipcVarAc3.aZ(2131231380);
        ipcVarAc3.ba(2131427768);
        return ipcVarAc3.aX();
    }
}
