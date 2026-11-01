package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wph implements defpackage.qtx {
    private static final aimz a = aimz.i("com/android/dialer/xatu/impl/service/voice/XatuVoiceButtonController");
    private final java.lang.String b;
    private final defpackage.wky c;
    private final defpackage.whs d;
    private final defpackage.ptx e;
    private final zpz f;
    private final defpackage.ahdv g;

    public wph(java.lang.String str, defpackage.ptx ptxVar, zpz zpzVar, defpackage.ahdv ahdvVar, defpackage.wky wkyVar, defpackage.whs whsVar) {
        aooh.f(str, "callId");
        aooh.f(ptxVar, "callProperties");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(ahdvVar, "xatuAutomaticDisplaySnackbarController");
        aooh.f(wkyVar, "xatuController");
        aooh.f(whsVar, "xatuLoggingCoordinator");
        this.b = str;
        this.e = ptxVar;
        this.f = zpzVar;
        this.g = ahdvVar;
        this.c = wkyVar;
        this.d = whsVar;
    }

    @Override // defpackage.qtx
    public final void a() {
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/xatu/impl/service/voice/XatuVoiceButtonController", "onButtonClicked", 28, "XatuVoiceButtonController.kt").v("enter");
        this.d.b(this.b, 12);
        if (this.e.s()) {
            aimzVar.c().m(aioa.b).l("com/android/dialer/xatu/impl/service/voice/XatuVoiceButtonController", "onButtonClicked", 35, "XatuVoiceButtonController.kt").v("call is on telephony hold, the Xatu voice button should be disabled");
        } else {
            this.g.e();
            this.f.a(this.c.c());
        }
    }
}
