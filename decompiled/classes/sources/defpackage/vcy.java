package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vcy implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/VvmServiceEnabledFn");
    private final defpackage.zzx b;

    public vcy(defpackage.zzx zzxVar) {
        this.b = zzxVar;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (this.b.m()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/impl/VvmServiceEnabledFn", "isEnabled", (char) 27, "VvmServiceEnabledFn.java")).v("Voicemail is not enabled as in direct boot.");
            return false;
        }
        if (!defpackage.ahvr.r("SAMSUNG", android.os.Build.BRAND)) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/impl/VvmServiceEnabledFn", "isEnabled", '!', "VvmServiceEnabledFn.java")).v("Voicemail is not enabled for this device.");
        return false;
    }
}
