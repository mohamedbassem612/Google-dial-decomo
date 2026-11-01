package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hvs implements zni, zog, zoi {
    public static final aimz a = aimz.i("com/android/dialer/assistedemergencydialing/impl/tts/TextToSpeechCallEventListener");
    public final huy b;
    public final defpackage.mba c;
    public final zpz d;
    public final qbe e;
    public final hvy f;
    public final afpl g;
    private final aoss h;
    private final defpackage.hwj i;

    public hvs(aoss aossVar, huy huyVar, hvy hvyVar, afpl afplVar, zpz zpzVar, defpackage.hwj hwjVar, qbe qbeVar, defpackage.mba mbaVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(hvyVar, "voiceAssistAudioGenerator");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(hwjVar, "voiceAssistAudioPlayer");
        aooh.f(qbeVar, "inCallLogging");
        this.h = aossVar;
        this.b = huyVar;
        this.f = hvyVar;
        this.g = afplVar;
        this.d = zpzVar;
        this.i = hwjVar;
        this.e = qbeVar;
        this.c = mbaVar;
    }

    public final /* synthetic */ int a() {
        return 0;
    }

    public final void b(android.telecom.Call.Details details) {
        aimz aimzVar = zih.a;
        defpackage.hwj hwjVar = this.i;
        hwjVar.e = aoov.al(hwjVar.c, zih.b.plus(aols.a), 1, new defpackage.dqx((aoln) null, hwjVar, 8));
    }

    public final ajcq d() {
        return aosv.C(aoov.am(this.h, 0, new defpackage.hvr(this, null), 3));
    }

    public final void eh() {
        defpackage.hwj hwjVar = this.i;
        aoub aoubVar = hwjVar.e;
        if (aoubVar != null) {
            aoubVar.s((java.util.concurrent.CancellationException) null);
        }
        hwjVar.f.e((java.lang.Throwable) null);
    }
}
