package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jer implements zcs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jer(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v75, types: [aoin, java.lang.Object] */
    public final boolean a() {
        switch (this.$cid) {
            case 0:
                return mni.bf((iqm) this.a);
            case 1:
                return mni.bf((iqm) this.a);
            case 2:
                return mni.bf((iqm) this.a);
            case 3:
                return mni.bf((iqm) this.a);
            case 4:
                return mni.bf((iqm) this.a);
            case 5:
                iqm iqmVar = (iqm) this.a;
                if (!iqmVar.f()) {
                    iqm.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/BeeslyEnabledFn", "supportTranscriptBusinessName", 114, "BeeslyEnabledFn.kt").v("disabled as transcription is not supported");
                } else {
                    if (((java.lang.Boolean) iqmVar.b.a()).booleanValue()) {
                        return true;
                    }
                    iqm.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/enabledfn/BeeslyEnabledFn", "supportTranscriptBusinessName", 119, "BeeslyEnabledFn.kt").v("disabled by flag for transcript business name");
                }
                return false;
            case 6:
                return mni.bf((iqm) this.a);
            case 7:
                return mni.bf((iqm) this.a);
            case 8:
                return ((iqm) this.a).f();
            case 9:
                return ((iqm) this.a).f();
            case 10:
                return mni.bf((iqm) this.a);
            case 11:
                return ((iqm) this.a).b();
            case 12:
                return ((iqm) this.a).e();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ((defpackage.iqp) this.a).a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return ((defpackage.iqp) this.a).b();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((defpackage.iqp) this.a).c();
            case 16:
                return ((defpackage.iqp) this.a).c();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((defpackage.iqp) this.a).c();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((defpackage.iqp) this.a).c();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((java.lang.Boolean) this.a.a()).booleanValue();
            default:
                return ((iqm) this.a).e();
        }
    }
}
