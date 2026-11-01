package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rnp implements defpackage.mdo {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/logging/session/cuimetadata/SessionCuiMetadataPopulator");
    private final defpackage.ipc b;

    public rnp(defpackage.ipc ipcVar) {
        if (ipcVar == null) {
            defpackage.aooh.i("sessionMetaDataTracker");
        }
        this.b = ipcVar;
    }

    @Override // defpackage.mdo
    public final java.lang.Object a(defpackage.aivp aivpVar, defpackage.aoln aolnVar) {
        defpackage.ampw ampwVarBd = this.b.bd();
        ((defpackage.aimw) a.b().l("com/android/dialer/logging/session/cuimetadata/SessionCuiMetadataPopulator", "populate", 19, "SessionCuiMetadataPopulator.kt")).y("sessionId: %s", ampwVarBd.c);
        defpackage.ahda ahdaVarAo = defpackage.aiql.ao(aivpVar.L());
        if (ampwVarBd == null) {
            defpackage.aooh.i("value");
        }
        defpackage.akzx akzxVar = (defpackage.akzx) ahdaVarAo.a;
        akzxVar.u();
        defpackage.aivp aivpVar2 = (defpackage.aivp) akzxVar.b;
        j$.util.Objects.requireNonNull(ampwVarBd);
        aivpVar2.d = ampwVarBd;
        aivpVar2.b |= 2;
        return ahdaVarAo.i();
    }
}
