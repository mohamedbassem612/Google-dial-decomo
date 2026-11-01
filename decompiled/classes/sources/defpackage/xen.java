package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class xen {
    private final android.content.Context c;
    private final defpackage.zzx d;
    private static final defpackage.aimz b = defpackage.aimz.i("com/android/incallui/callscreen/impl/coordinator/UbiquitousRequirements");
    public static final java.lang.String[] a = {"android.permission.CAPTURE_AUDIO_OUTPUT", "android.permission.MODIFY_AUDIO_SETTINGS", "android.permission.RECORD_AUDIO", "android.permission.ACCESS_NETWORK_STATE", "android.permission.RECEIVE_BOOT_COMPLETED", "android.permission.MODIFY_AUDIO_ROUTING"};

    public xen(android.content.Context context, defpackage.zzx zzxVar) {
        this.c = context;
        this.d = zzxVar;
    }

    final boolean a() {
        boolean z;
        boolean zM = this.d.m();
        java.lang.String[] strArr = a;
        int i = 0;
        while (true) {
            if (i >= 6) {
                z = true;
                break;
            }
            java.lang.String str = strArr[i];
            if (defpackage.dvx.c(this.c, str) == -1) {
                ((defpackage.aimw) ((defpackage.aimw) b.b()).l("com/android/incallui/callscreen/impl/coordinator/UbiquitousRequirements", "hasRequiredPermissions", 55, "UbiquitousRequirements.java")).y("missing permission: %s", str);
                z = false;
                break;
            }
            i++;
        }
        ((defpackage.aimw) ((defpackage.aimw) b.b()).l("com/android/incallui/callscreen/impl/coordinator/UbiquitousRequirements", "areSatisfied", 45, "UbiquitousRequirements.java")).L("isDirectBoot: %b, hasRequiredPermissions: %b", zM, z);
        return !zM && z;
    }
}
