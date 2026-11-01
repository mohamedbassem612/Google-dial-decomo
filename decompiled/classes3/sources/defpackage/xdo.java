package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xdo implements defpackage.rdz {
    private static final aimz b = aimz.i("com/android/incallui/atlas/ui/impl/tidepods/voicefeaturecombiner/AtlasVoiceFeatureController");
    public final defpackage.xcq a;
    private final defpackage.wxm c;
    private final defpackage.xdh d;
    private final long e;

    public xdo(defpackage.wxm wxmVar, defpackage.xcq xcqVar, defpackage.xdh xdhVar, long j) {
        this.c = wxmVar;
        this.a = xcqVar;
        this.d = xdhVar;
        this.e = j;
    }

    private final void e(defpackage.alex alexVar) {
        this.c.b(this.e, alexVar);
    }

    @Override // defpackage.rdz
    public final ajcq a() {
        b.b().l("com/android/incallui/atlas/ui/impl/tidepods/voicefeaturecombiner/AtlasVoiceFeatureController", "abortActivation", 53, "AtlasVoiceFeatureController.java").v("enter");
        return this.a.a();
    }

    @Override // defpackage.rdz
    public final ajcq b() {
        e(defpackage.alex.USER_CLICK_HFM_BUTTON);
        b.b().l("com/android/incallui/atlas/ui/impl/tidepods/voicefeaturecombiner/AtlasVoiceFeatureController", "activate", 41, "AtlasVoiceFeatureController.java").v("request hold for me activation on voice screen");
        return this.a.b();
    }

    @Override // defpackage.rdz
    public final ajcq c() {
        b.b().l("com/android/incallui/atlas/ui/impl/tidepods/voicefeaturecombiner/AtlasVoiceFeatureController", "deactivate", 59, "AtlasVoiceFeatureController.java").v("enter");
        defpackage.wya wyaVar = this.d.c;
        int i = wyaVar.c;
        int iJ = wsc.j(i);
        if (iJ == 0) {
            throw null;
        }
        int i2 = iJ - 1;
        if (i2 == 2) {
            e(defpackage.alex.USER_CLICK_CANCEL_OFFHOLD_DETECTION);
        } else if (i2 == 3) {
            e(defpackage.alex.USER_CLICK_RETURN_CALL_BUTTON_WHEN_IVR_SAVE);
        } else if (i2 == 4) {
            e(defpackage.alex.USER_CLICK_RETURN_CALL_BUTTON_WHEN_AGENT_READY);
        } else if (i2 == 6) {
            int iAe = a.ae((i == 8 ? (defpackage.wxs) wyaVar.d : defpackage.wxs.a).c);
            if (iAe == 0) {
                iAe = 1;
            }
            if (iAe - 1 != 0) {
                e(defpackage.alex.USER_CLICK_RETURN_TO_CALL_BUTTON_WHEN_AUDIO_ERROR);
            } else {
                e(defpackage.alex.USER_CLICK_RETURN_TO_CALL_BUTTON_ON_UNSPECIFIED_ERROR);
            }
        }
        return this.a.d();
    }

    @Override // defpackage.rdz
    public final ajcq d() {
        b.b().l("com/android/incallui/atlas/ui/impl/tidepods/voicefeaturecombiner/AtlasVoiceFeatureController", "fixActivationError", 47, "AtlasVoiceFeatureController.java").v("enter");
        return this.a.e();
    }
}
