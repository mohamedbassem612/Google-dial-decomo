package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wpm implements defpackage.rdz {
    public static final aimz a = aimz.i("com/android/dialer/xatu/impl/service/voicefeaturecombiner/XatuVoiceFeatureController");
    public final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
    public final defpackage.pqm c;
    private final java.lang.String d;
    private final ajct e;
    private final defpackage.wky f;
    private final defpackage.whs g;
    private final defpackage.ptx h;
    private final defpackage.ahdv i;

    public wpm(java.lang.String str, ajct ajctVar, defpackage.pqm pqmVar, defpackage.ptx ptxVar, defpackage.wky wkyVar, defpackage.whs whsVar, defpackage.ahdv ahdvVar) {
        this.d = str;
        this.e = ajctVar;
        this.c = pqmVar;
        this.h = ptxVar;
        this.f = wkyVar;
        this.g = whsVar;
        this.i = ahdvVar;
    }

    @Override // defpackage.rdz
    public final ajcq a() {
        a.b().l("com/android/dialer/xatu/impl/service/voicefeaturecombiner/XatuVoiceFeatureController", "abortActivation", 113, "XatuVoiceFeatureController.java").v("abortActivation");
        this.g.b(this.d, 14);
        this.b.set(j$.util.Optional.empty());
        return ajcm.a;
    }

    @Override // defpackage.rdz
    public final ajcq b() {
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/xatu/impl/service/voicefeaturecombiner/XatuVoiceFeatureController", "activate", 65, "XatuVoiceFeatureController.java").v("activate");
        this.g.b(this.d, 12);
        if (!this.h.s()) {
            this.i.e();
            return this.f.c();
        }
        aimzVar.b().l("com/android/dialer/xatu/impl/service/voicefeaturecombiner/XatuVoiceFeatureController", "activate", 70, "XatuVoiceFeatureController.java").v("call is on telephony hold");
        this.b.set(j$.util.Optional.of(defpackage.wpl.CALL_ON_TELEPHONY_HOLD));
        return ajcm.a;
    }

    @Override // defpackage.rdz
    public final /* synthetic */ ajcq c() {
        return ajcm.a;
    }

    @Override // defpackage.rdz
    public final ajcq d() {
        a.b().l("com/android/dialer/xatu/impl/service/voicefeaturecombiner/XatuVoiceFeatureController", "fixActivationError", 81, "XatuVoiceFeatureController.java").v("fixActivationError");
        this.g.b(this.d, 13);
        defpackage.viv vivVar = new defpackage.viv(this, 9);
        ajct ajctVar = this.e;
        return ahvr.H(ahvr.G(vivVar, ajctVar), new defpackage.wie(this, 16), ajctVar);
    }
}
