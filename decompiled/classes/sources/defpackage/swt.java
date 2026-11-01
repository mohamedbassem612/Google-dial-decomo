package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class swt {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper");
    public final android.content.Context b;
    public final defpackage.aoin c;
    public final defpackage.aoin d;
    public final defpackage.aoin e;
    public final defpackage.ajct f;
    public final defpackage.ajct g;
    public final defpackage.ajct h;
    public final defpackage.rlv i;
    public final defpackage.swn j;
    public final defpackage.swq k;
    public final defpackage.tbq l;
    public final defpackage.ojo m;
    public final defpackage.zjs n;
    public final defpackage.oko o;
    public final defpackage.okj p;
    public final defpackage.oki q;
    public final defpackage.oju r;
    public final defpackage.zpm s;
    public final defpackage.zjm t;
    public final defpackage.gou u;
    public final defpackage.aogc v;

    public swt(android.content.Context context, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aogc aogcVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.ajct ajctVar3, defpackage.rlv rlvVar, defpackage.swn swnVar, defpackage.swq swqVar, defpackage.tbq tbqVar, defpackage.zjm zjmVar, defpackage.gou gouVar, defpackage.ojo ojoVar, defpackage.zpm zpmVar, defpackage.zjs zjsVar, defpackage.oko okoVar, defpackage.okj okjVar, defpackage.oki okiVar, defpackage.oju ojuVar) {
        this.b = context;
        this.c = aoinVar;
        this.d = aoinVar2;
        this.e = aoinVar3;
        this.v = aogcVar;
        this.f = ajctVar;
        this.h = ajctVar3;
        this.g = ajctVar2;
        this.i = rlvVar;
        this.j = swnVar;
        this.k = swqVar;
        this.l = tbqVar;
        this.t = zjmVar;
        this.u = gouVar;
        this.m = ojoVar;
        this.s = zpmVar;
        this.n = zjsVar;
        this.o = okoVar;
        this.p = okjVar;
        this.q = okiVar;
        this.r = ojuVar;
    }

    public static boolean a() {
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled() && defaultAdapter.getProfileConnectionState(1) == 2;
    }

    public static final j$.util.Optional c(akfx akfxVar, java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return j$.util.Optional.empty();
        }
        try {
            return j$.util.Optional.of(akfxVar.i(str, defpackage.akfg.b(str2)));
        } catch (defpackage.akfp e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "parse", 505, "TidepodsRevelioGatekeeper.java")).I("Unable to parse phoneNumber: %s, countryIso: %s", defpackage.aais.aC(str), defpackage.aais.aD(str2));
            return j$.util.Optional.empty();
        }
    }

    public final boolean b() {
        for (android.media.AudioDeviceInfo audioDeviceInfo : this.r.i()) {
            if (audioDeviceInfo.getType() == 4) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "isWiredHeadsetConnected", 526, "TidepodsRevelioGatekeeper.java")).v("wired headphones connected");
                return true;
            }
            if (audioDeviceInfo.getType() == 3) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "isWiredHeadsetConnected", 530, "TidepodsRevelioGatekeeper.java")).v("wired headset connected");
                return true;
            }
            if (audioDeviceInfo.getType() == 22) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "isWiredHeadsetConnected", 534, "TidepodsRevelioGatekeeper.java")).v("usb headset connected");
                return true;
            }
        }
        return false;
    }
}
