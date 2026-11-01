package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xbp {
    private static final aimz b = aimz.i("com/android/incallui/atlas/ui/impl/tidepods/service/callaudioinjector/HoldForMeCallAudioInjector");
    public final hxv a;
    private final ajct c;
    private final defpackage.wyf d;

    public xbp(ajct ajctVar, defpackage.wyf wyfVar, hxv hxvVar) {
        this.c = ajctVar;
        this.d = wyfVar;
        this.a = hxvVar;
    }

    public final ajcq a(int i) {
        b.b().l("com/android/incallui/atlas/ui/impl/tidepods/service/callaudioinjector/HoldForMeCallAudioInjector", "injectUplinkAudio", 46, "HoldForMeCallAudioInjector.java").y("injecting %s", wsc.h(i));
        defpackage.wyf wyfVar = this.d;
        return ahvr.I(ahvr.F(new lqh(wyfVar, i, 8), wyfVar.c), new defpackage.wyv(this, 20), this.c);
    }
}
