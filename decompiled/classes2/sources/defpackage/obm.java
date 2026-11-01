package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class obm implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;

    public /* synthetic */ obm(j$.util.Optional optional, boolean z, j$.util.Optional optional2, j$.util.Optional optional3, android.content.Context context, acxg acxgVar, int i) {
        this.$cid = i;
        this.b = optional;
        this.a = z;
        this.c = optional2;
        this.f = optional3;
        this.d = context;
        this.e = acxgVar;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, obg] */
    public final java.lang.Object a() {
        if (this.$cid != 0) {
            android.telecom.DisconnectCause disconnectCause = (android.telecom.DisconnectCause) aooh.q((j$.util.Optional) this.b);
            if (disconnectCause == null || !this.a || disconnectCause.getCode() != 1 || !aooh.n("REASON_IMS_ACCESS_BLOCKED", disconnectCause.getReason())) {
                return null;
            }
            java.lang.Object obj = this.c;
            aimz aimzVar = defpackage.mma.b;
            aimzVar.b().l("com/android/dialer/disconnectprompt/service/DisconnectPromptProducerModule$Companion", "produceVideoCallNotAvailablePrompt$<anonymous>", 174, "DisconnectPromptProducerModule.kt").y("produce prompt for disconnect reason: %s", disconnectCause.getReason());
            java.lang.String str = (java.lang.String) aooh.q((j$.util.Optional) obj);
            if (str == null) {
                aimzVar.d().l("com/android/dialer/disconnectprompt/service/DisconnectPromptProducerModule$Companion", "produceVideoCallNotAvailablePrompt$<anonymous>", 177, "DisconnectPromptProducerModule.kt").v("can't produce prompt due to no raw number");
                return null;
            }
            android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q((j$.util.Optional) this.f);
            if (phoneAccountHandle == null) {
                aimzVar.d().l("com/android/dialer/disconnectprompt/service/DisconnectPromptProducerModule$Companion", "produceVideoCallNotAvailablePrompt$<anonymous>", 182, "DisconnectPromptProducerModule.kt").v("can't produce prompt due to no account handle");
                return null;
            }
            java.lang.Object obj2 = this.e;
            android.content.Context context = (android.content.Context) this.d;
            java.lang.String string = context.getString(2132020782);
            aooh.e(string, "getString(...)");
            defpackage.mlt mltVar = defpackage.mlt.PROMPT_TYPE_VIDEO_CALL_NOT_AVAILABLE;
            java.lang.String string2 = context.getString(2132020781);
            aooh.e(string2, "getString(...)");
            return new defpackage.mls(mltVar, string, string, string2, context.getString(2132020816), context.getString(android.R.string.cancel), new defpackage.mly((acxg) obj2, str, phoneAccountHandle));
        }
        java.lang.Object obj3 = this.f;
        java.lang.Object obj4 = this.c;
        defpackage.obr obrVar = (defpackage.obr) this.b;
        defpackage.heq heqVar = (defpackage.heq) obj4;
        int i = 0;
        defpackage.obp obpVar = new defpackage.obp(obrVar, (java.lang.String) obj3, heqVar, 0);
        aimz aimzVar2 = defpackage.obr.a;
        aimzVar2.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyFeatureModalTransitionWithAnimation", "expandModal", 245, "EmergencyFeatureModalTransitionWithAnimation.kt").v("enter");
        ?? r6 = this.e;
        defpackage.nzp nzpVarAL = pez.aL((defpackage.obg) r6);
        if (nzpVarAL == null) {
            aimzVar2.d().l("com/android/dialer/emergencycalling/impl/ui/EmergencyFeatureModalTransitionWithAnimation", "expandModal", 249, "EmergencyFeatureModalTransitionWithAnimation.kt").v("center button is null!");
        } else {
            boolean z = this.a;
            java.lang.Object obj5 = this.d;
            heqVar.ac().setText(nzpVarAL.j);
            heqVar.ab().setText(nzpVarAL.k);
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(heqVar.ac(), "alpha", 0.0f, 1.0f);
            android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(heqVar.ab(), "alpha", 0.0f, 1.0f);
            android.animation.ObjectAnimator objectAnimatorOfFloat3 = android.animation.ObjectAnimator.ofFloat(heqVar.ae(), "alpha", 0.0f, 1.0f);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.setDuration(300L);
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            ems emsVar = (ems) obj5;
            animatorSet.addListener(defpackage.hrz.c(emsVar, new defpackage.obn(heqVar, z, obrVar, (defpackage.obf) r6, nzpVarAL, 0)));
            animatorSet.addListener(defpackage.hrz.a(emsVar, new defpackage.obo(obj4, obpVar, i)));
            animatorSet.start();
        }
        return aojh.a;
    }

    public /* synthetic */ obm(defpackage.obr obrVar, defpackage.heq heqVar, ems emsVar, defpackage.obf obfVar, boolean z, java.lang.String str, int i) {
        this.$cid = i;
        this.b = obrVar;
        this.c = heqVar;
        this.d = emsVar;
        this.e = obfVar;
        this.a = z;
        this.f = str;
    }
}
