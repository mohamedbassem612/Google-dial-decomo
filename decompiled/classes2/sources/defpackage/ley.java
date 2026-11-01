package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ley {
    static final java.lang.String[] a = {"android.permission.CAPTURE_AUDIO_OUTPUT", "android.permission.MODIFY_AUDIO_SETTINGS", "android.permission.RECORD_AUDIO", "android.permission.ACCESS_NETWORK_STATE", "android.permission.RECEIVE_BOOT_COMPLETED", "android.permission.MODIFY_AUDIO_ROUTING"};
    private static final aimz b = aimz.i("com/android/dialer/callscreen/impl/service/CallScreenPermissionRequirements");
    private final android.content.Context c;
    private j$.util.Optional d = j$.util.Optional.empty();

    public ley(android.content.Context context) {
        this.c = context;
    }

    final boolean a() {
        boolean zBooleanValue;
        ahoq ahoqVarW = ahvr.W(273, "CallScreenPermissionRequirements_hasRequiredPermissions");
        try {
            if (this.d.isPresent()) {
                zBooleanValue = ((java.lang.Boolean) this.d.orElseThrow()).booleanValue();
            } else {
                java.lang.String[] strArr = a;
                for (int i = 0; i < 6; i++) {
                    java.lang.String str = strArr[i];
                    if (dvx.c(this.c, str) == -1) {
                        b.b().l("com/android/dialer/callscreen/impl/service/CallScreenPermissionRequirements", "hasRequiredPermissions", 53, "CallScreenPermissionRequirements.java").y("missing permission: %s", str);
                        this.d = j$.util.Optional.of(java.lang.Boolean.FALSE);
                        zBooleanValue = false;
                    }
                }
                this.d = j$.util.Optional.of(java.lang.Boolean.TRUE);
                zBooleanValue = true;
            }
            ahoqVarW.close();
            return zBooleanValue;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
