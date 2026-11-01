package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vrw implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ vrw(boolean z, boolean z2, int i) {
        this.$cid = i;
        this.a = z;
        this.b = z2;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        int i = this.$cid;
        if (i == 0) {
            return (this.a || this.b) ? defpackage.vry.a : defpackage.vry.b;
        }
        boolean z = this.a;
        if (i == 1) {
            return (z || this.b) ? j$.util.Optional.of(new oai(0)) : j$.util.Optional.empty();
        }
        if (!z) {
            defpackage.vrz.a.b().l("com/android/dialer/voicemail/settings/service/VoicemailSettingsModelProducerModule", "produceChangeFiGreetingPreferenceState", 558, "VoicemailSettingsModelProducerModule.java").v("not Fi account");
            return defpackage.vrr.c;
        }
        if (this.b) {
            return defpackage.vrr.a;
        }
        defpackage.vrz.a.b().l("com/android/dialer/voicemail/settings/service/VoicemailSettingsModelProducerModule", "produceChangeFiGreetingPreferenceState", 562, "VoicemailSettingsModelProducerModule.java").v("Fi account has not activated VVM.");
        return defpackage.vrr.b;
    }
}
