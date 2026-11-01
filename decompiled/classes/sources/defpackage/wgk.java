package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class wgk implements defpackage.zcr {
    private static final defpackage.aimz f = defpackage.aimz.i("com/android/dialer/wificallingicons/impl/enabledfn/WifiCallingIconsEnabledFn");
    public final defpackage.lnr a;
    public final defpackage.oko b;
    public final defpackage.okj c;
    public final defpackage.oki d;
    private final android.content.Context g;
    private final defpackage.aoin h;
    private final defpackage.zjs i;

    public wgk(android.content.Context context, defpackage.aoin aoinVar, defpackage.lnr lnrVar, defpackage.zjs zjsVar, defpackage.oko okoVar, defpackage.okj okjVar, defpackage.oki okiVar) {
        this.g = context;
        this.h = aoinVar;
        this.a = lnrVar;
        this.i = zjsVar;
        this.b = okoVar;
        this.c = okjVar;
        this.d = okiVar;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        defpackage.aify aifyVar = defpackage.zqz.a;
        if (defpackage.dvx.c(this.g, "android.permission.READ_PRIVILEGED_PHONE_STATE") != 0) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) f.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/wificallingicons/impl/enabledfn/WifiCallingIconsEnabledFn", "isEnabled", '=', "WifiCallingIconsEnabledFn.java")).v("READ_PRIVILEGED_PHONE_STATE permission missing");
            return false;
        }
        if (((java.lang.Boolean) this.h.a()).booleanValue()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) f.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/wificallingicons/impl/enabledfn/WifiCallingIconsEnabledFn", "isEnabled", 'B', "WifiCallingIconsEnabledFn.java")).v("enabled for all carriers");
        } else {
            java.util.List listT = this.i.t();
            if (listT.isEmpty()) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) f.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/wificallingicons/impl/enabledfn/WifiCallingIconsEnabledFn", "isEnabled", 'J', "WifiCallingIconsEnabledFn.java")).v("no SIM present, feature disabled");
                return false;
            }
            long jCount = j$.util.Collection.-EL.stream(listT).filter(new defpackage.tcw(this, 5)).count();
            if (jCount > 0) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) f.b()).g(1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/wificallingicons/impl/enabledfn/WifiCallingIconsEnabledFn", "isEnabled", 84, "WifiCallingIconsEnabledFn.java")).x("%d unsupported SIM present in device, feature disabled.", jCount);
                return false;
            }
        }
        return true;
    }
}
