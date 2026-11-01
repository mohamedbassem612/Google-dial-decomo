package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class npf implements defpackage.ecs {
    public static final defpackage.npf a = new defpackage.npf();
    private static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/dobby/impl/settings/service/ShouldSaveCallAudioMigration");

    @Override // defpackage.ecs
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        return defpackage.aojh.a;
    }

    @Override // defpackage.ecs
    public final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj, defpackage.aoln aolnVar) {
        ((defpackage.aimw) b.b().l("com/android/dialer/dobby/impl/settings/service/ShouldSaveCallAudioMigration", "migrate", 23, "ShouldSaveCallAudioMigration.kt")).v("setting default value of shouldSaveCallAudio");
        defpackage.kaw kawVarAO = defpackage.gus.aO(((defpackage.nok) obj).L());
        kawVarAO.H(true);
        return kawVarAO.D();
    }

    @Override // defpackage.ecs
    public final /* bridge */ /* synthetic */ java.lang.Object c(java.lang.Object obj, defpackage.aoln aolnVar) {
        boolean z;
        if ((((defpackage.nok) obj).b & 4) != 0) {
            ((defpackage.aimw) b.b().l("com/android/dialer/dobby/impl/settings/service/ShouldSaveCallAudioMigration", "shouldMigrate", 16, "ShouldSaveCallAudioMigration.kt")).v("shouldSaveCallAudio is already set");
            z = false;
        } else {
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }
}
