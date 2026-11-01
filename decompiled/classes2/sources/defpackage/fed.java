package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fed implements ahzi {
    private final /* synthetic */ int $cid;

    public /* synthetic */ fed(int i) {
        this.$cid = i;
    }

    public final java.lang.Object eZ() {
        boolean z = false;
        switch (this.$cid) {
            case 0:
                ahzi ahziVar = defpackage.fee.a;
                return aiql.X(ahvr.co(eum.J("ro.vendor.api_level")));
            case 1:
                int i = defpackage.fbp.d;
                if (android.os.Build.VERSION.SDK_INT > 37 && j$.util.Objects.equals(eum.J("persist.audio.compressed_offload_implicit_aac"), "false")) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 2:
                int i2 = defpackage.fju.a;
                try {
                    return java.lang.Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (java.lang.Exception e) {
                    throw new java.lang.IllegalStateException(e);
                }
            case 3:
                return new defpackage.icw();
            case 4:
                java.lang.String str = ymr.a;
                return new ymi(3, 6, "AICore service disconnected", (java.lang.Throwable) null);
            case 5:
                java.lang.String str2 = ymr.a;
                return new ymi(3, 6, "AICore service disconnected", (java.lang.Throwable) null);
            case 6:
                java.lang.String str3 = yna.a;
                return new ymi(1, 6, "AICore service disconnected", (java.lang.Throwable) null);
            case 7:
                return new aiep((int) anef.a.b().a());
            case 8:
                return java.lang.Boolean.TRUE;
            case 9:
                return new java.util.zip.Adler32();
            case 10:
                return new aekw();
            case 11:
                return new aekv();
            case 12:
                return java.lang.Boolean.valueOf(android.app.ActivityManager.isUserAMonkey() ? true : fn$.ExternalSyntheticApiModelOutline0.m());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
                try {
                    android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    android.util.Log.i("PhenotypeProcessReaper", "Memory state is: " + runningAppProcessInfo.importance);
                    if (runningAppProcessInfo.importance >= 400) {
                        z = true;
                    }
                } catch (java.lang.RuntimeException e2) {
                    android.util.Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e2);
                }
                return java.lang.Boolean.valueOf(z);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return java.lang.Boolean.FALSE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new android.content.Intent();
            case 16:
                return java.lang.Boolean.FALSE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return java.lang.Boolean.FALSE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                long j = ajzw.a;
                return java.lang.Boolean.FALSE;
            default:
                return java.lang.Integer.valueOf((int) anjr.a.b().a());
        }
    }
}
