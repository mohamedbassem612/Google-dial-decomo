package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rwd implements defpackage.rnw {
    private final defpackage.rlv a;
    private final defpackage.aw b;
    private final defpackage.ipc c;

    public rwd(defpackage.rlv rlvVar, defpackage.aw awVar, defpackage.ipc ipcVar) {
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (awVar == null) {
            defpackage.aooh.i("fragment");
        }
        this.a = rlvVar;
        this.b = awVar;
        this.c = ipcVar;
    }

    @Override // defpackage.rnw
    public final void a() {
        this.a.o(defpackage.rmx.HAMBURGER_MENU_OPEN_SETTINGS);
        defpackage.akzx akzxVarM = rvq.a.m();
        rvp rvpVar = rvp.a;
        akzxVarM.u();
        rvq rvqVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(rvpVar);
        rvqVar.d = rvpVar;
        rvqVar.c = 1;
        defpackage.afsq.G(this.b, this.c.aL(akzxVarM.r()));
    }
}
