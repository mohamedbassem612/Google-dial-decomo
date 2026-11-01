package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mec implements defpackage.zaq {
    public static final defpackage.aaif c = defpackage.aais.aI("SharpieManuallyActivatedToDisclosureStarted", 250246);
    public static final defpackage.aaif d = defpackage.aais.aI("SharpieManuallyDeactivatedToUiUpdated", 233620);
    public static final java.util.Set a = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_DISCONNECTED, defpackage.mce.ON_CALL_REMOVED});
    public static final java.util.Set b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.SINGLE_CALL_IN_CALL_ACTIVITY_DESTROYED, defpackage.mce.ON_IN_CALL_ACTIVITY_STOPPED, defpackage.mce.ON_IN_CALL_ACTIVITY_DESTROYED, defpackage.mce.FEATURE_INDICATOR_NOT_UPDATED_BECAUSE_DISPLAY_OFF, defpackage.mce.SHARPIE_IN_CALL_ACTIVITY_NOT_VISIBLE_ON_SESSION_START});

    @Override // defpackage.zaq
    public final java.util.List a() {
        defpackage.adcm adcmVar = new defpackage.adcm(null);
        defpackage.meb mebVar = new defpackage.meb(4);
        defpackage.aacy aacyVar = new defpackage.aacy(null, null, null);
        mebVar.a(aacyVar);
        adcmVar.h = aacyVar;
        adcmVar.i = defpackage.mce.SHARPIE_CALL_ACTIVATED;
        adcmVar.a = defpackage.mce.SHARPIE_DISCLOSURE_STARTED;
        java.util.Set set = a;
        defpackage.mce mceVar = defpackage.mce.SHARPIE_PRECONDITIONS_FAILED;
        adcmVar.d(defpackage.ajsz.aJ(set, mceVar));
        defpackage.adcm adcmVar2 = new defpackage.adcm(null);
        defpackage.meb mebVar2 = new defpackage.meb(1);
        defpackage.aacy aacyVar2 = new defpackage.aacy(null, null, null);
        mebVar2.a(aacyVar2);
        adcmVar2.h = aacyVar2;
        adcmVar2.i = defpackage.mce.USER_CLICKED_IN_CALL_SHARPIE_VOICE_BUTTON;
        defpackage.meb mebVar3 = new defpackage.meb(0);
        defpackage.aacy aacyVar3 = new defpackage.aacy();
        mebVar3.a(aacyVar3);
        defpackage.meb mebVar4 = new defpackage.meb(2);
        defpackage.aacy aacyVar4 = new defpackage.aacy();
        mebVar4.a(aacyVar4);
        adcmVar2.g(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar3, aacyVar4}));
        java.util.Set set2 = b;
        adcmVar2.d(defpackage.ajsz.aJ(defpackage.ajsz.aJ(defpackage.ajsz.aI(set, set2), mceVar), defpackage.mce.SHARPIE_DEACTIVATE_WHEN_SCAM_DETECTED));
        defpackage.meb mebVar5 = new defpackage.meb(3);
        defpackage.ajni ajniVar = new defpackage.ajni(null);
        mebVar5.a(ajniVar);
        java.util.Set setSingleton = java.util.Collections.singleton(ajniVar);
        defpackage.aooh.e(setSingleton, "singleton(...)");
        adcmVar2.f(setSingleton);
        defpackage.adcm adcmVar3 = new defpackage.adcm(null);
        defpackage.mdz mdzVar = new defpackage.mdz(18);
        defpackage.aacy aacyVar5 = new defpackage.aacy(null, null, null);
        mdzVar.a(aacyVar5);
        adcmVar3.h = aacyVar5;
        adcmVar3.i = defpackage.mce.SHARPIE_DISCLOSURE_FINISHED;
        adcmVar3.a = defpackage.mce.SHARPIE_SESSION_STARTED;
        adcmVar3.d(set);
        defpackage.mdz mdzVar2 = new defpackage.mdz(19);
        defpackage.ajni ajniVar2 = new defpackage.ajni(null);
        mdzVar2.a(ajniVar2);
        java.util.Set setSingleton2 = java.util.Collections.singleton(ajniVar2);
        defpackage.aooh.e(setSingleton2, "singleton(...)");
        adcmVar3.f(setSingleton2);
        defpackage.adcm adcmVar4 = new defpackage.adcm(null);
        defpackage.mdz mdzVar3 = new defpackage.mdz(20);
        defpackage.aacy aacyVar6 = new defpackage.aacy(null, null, null);
        mdzVar3.a(aacyVar6);
        adcmVar4.h = aacyVar6;
        adcmVar4.i = defpackage.mce.SHARPIE_START_SESSION;
        adcmVar4.a = defpackage.mce.SHARPIE_ACTIVE_INDICATOR_SHOWN;
        java.util.Set setAI = defpackage.ajsz.aI(set, set2);
        java.util.Set setSingleton3 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton3, "singleton(...)");
        adcmVar4.d(defpackage.ajsz.aI(setAI, setSingleton3));
        java.util.List listAsList = java.util.Arrays.asList(adcmVar.c(), adcmVar2.c(), adcmVar3.c(), adcmVar4.c());
        defpackage.aooh.e(listAsList, "asList(...)");
        return listAsList;
    }
}
