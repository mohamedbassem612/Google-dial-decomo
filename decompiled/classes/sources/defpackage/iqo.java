package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iqo {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/beesly/enabledfn/BeeslyFeatureResolver");
    private final defpackage.iqn b;
    private final defpackage.rln c;
    private final defpackage.zzx d;

    public iqo(defpackage.zzx zzxVar, defpackage.rln rlnVar, defpackage.iqn iqnVar) {
        if (rlnVar == null) {
            defpackage.aooh.i("snapshot");
        }
        this.d = zzxVar;
        this.c = rlnVar;
        this.b = iqnVar;
    }

    public final int a() {
        if (this.d.m()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/BeeslyFeatureResolver", "supportedFeatures", 20, "BeeslyFeatureResolver.kt")).v("disabled in direct boot mode");
            return 1;
        }
        defpackage.iqn iqnVar = this.b;
        defpackage.rln rlnVar = this.c;
        if (!defpackage.gus.aU(iqnVar.c, rlnVar)) {
            if (!defpackage.gus.aU(iqnVar.d, rlnVar)) {
                if (!defpackage.gus.aU(iqnVar.e, rlnVar)) {
                    if (!defpackage.gus.aU(iqnVar.f, rlnVar)) {
                        if (!defpackage.gus.aU(iqnVar.g, rlnVar)) {
                            if (!defpackage.gus.aU(iqnVar.h, rlnVar)) {
                                if (!defpackage.gus.aU(iqnVar.a, rlnVar) && !defpackage.gus.aU(iqnVar.b, rlnVar)) {
                                    return 1;
                                }
                            }
                        }
                    }
                }
                return 2;
            }
            return 3;
        }
        return 4;
    }
}
