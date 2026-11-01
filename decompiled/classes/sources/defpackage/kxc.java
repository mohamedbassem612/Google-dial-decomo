package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class kxc implements defpackage.iqf {
    public final /* synthetic */ defpackage.rlv a;

    @Override // defpackage.iqf
    public final defpackage.albh a(defpackage.albh albhVar, defpackage.albh albhVar2) {
        defpackage.kwy kwyVar = (defpackage.kwy) albhVar;
        defpackage.kwy kwyVar2 = (defpackage.kwy) albhVar2;
        defpackage.akzx akzxVarL = kwyVar.L();
        akzxVarL.u();
        defpackage.kwy kwyVar3 = (defpackage.kwy) akzxVarL.b;
        kwyVar3.b &= -9;
        kwyVar3.f = false;
        boolean zEquals = ((defpackage.kwy) akzxVarL.r()).equals(defpackage.kwy.a);
        defpackage.rlv rlvVar = this.a;
        if (zEquals) {
            ((defpackage.aimw) ((defpackage.aimw) kxg.a.b()).l("com/android/dialer/callrecording/impl/persistentdata/CallRecordingSettingsDataStoreModule", "provideCallRecordingSettingsDataStoreConfig", 59, "CallRecordingSettingsDataStoreModule.java")).v("Restoring from backup");
            rlvVar.o(defpackage.rmx.RESTORE_CALL_RECORDING_RESTORED);
            return kwyVar2;
        }
        ((defpackage.aimw) ((defpackage.aimw) kxg.a.b()).l("com/android/dialer/callrecording/impl/persistentdata/CallRecordingSettingsDataStoreModule", "provideCallRecordingSettingsDataStoreConfig", 64, "CallRecordingSettingsDataStoreModule.java")).v("Settings already changed, not restoring");
        rlvVar.o(defpackage.rmx.RESTORE_CALL_RECORDING_ALREADY_MODIFIED);
        return kwyVar;
    }
}
