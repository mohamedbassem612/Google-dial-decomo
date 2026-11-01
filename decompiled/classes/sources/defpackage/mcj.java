package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mcj implements defpackage.zaq {
    public static final /* synthetic */ int a = 0;
    private static final java.util.Set b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_DISCONNECTED, defpackage.mce.ON_CALL_REMOVED});
    private static final java.util.Set c = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.SINGLE_CALL_IN_CALL_ACTIVITY_DESTROYED, defpackage.mce.ON_IN_CALL_ACTIVITY_STOPPED, defpackage.mce.ON_IN_CALL_ACTIVITY_DESTROYED});
    private static final defpackage.ajni d = defpackage.aais.aJ(new defpackage.mch(9));
    private static final defpackage.ajni e = defpackage.aais.aJ(new defpackage.mch(10));
    private static final defpackage.ajni f = defpackage.aais.aJ(new defpackage.mch(11));

    private static final defpackage.zao b(defpackage.mce mceVar, defpackage.aaif aaifVar) {
        defpackage.adcm adcmVar = new defpackage.adcm(null);
        defpackage.gxo gxoVar = new defpackage.gxo(aaifVar, 9);
        defpackage.aacy aacyVar = new defpackage.aacy(null, null, null);
        gxoVar.a(aacyVar);
        adcmVar.h = aacyVar;
        adcmVar.i = mceVar;
        adcmVar.a = defpackage.mce.BEACON_CARD_RENDERED_BY_SPOON;
        adcmVar.d(defpackage.ajsz.aI(defpackage.ajsz.aI(defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.BEACON_CARD_DISMISSED, defpackage.mce.BEACON_SHOULD_NOT_AUTO_SHOW}), b), c));
        adcmVar.f(defpackage.ajsz.cW(new defpackage.ajni[]{e, f, d}));
        return adcmVar.c();
    }

    @Override // defpackage.zaq
    public final java.util.List a() {
        defpackage.adcm adcmVar = new defpackage.adcm(null);
        defpackage.mch mchVar = new defpackage.mch(5);
        defpackage.aacy aacyVar = new defpackage.aacy(null, null, null);
        mchVar.a(aacyVar);
        adcmVar.h = aacyVar;
        adcmVar.i = defpackage.mce.BEACON_TOGGLING_ON_FROM_VOICE_BUTTON;
        defpackage.mch mchVar2 = new defpackage.mch(6);
        defpackage.aacy aacyVar2 = new defpackage.aacy();
        mchVar2.a(aacyVar2);
        defpackage.mch mchVar3 = new defpackage.mch(7);
        defpackage.aacy aacyVar3 = new defpackage.aacy();
        mchVar3.a(aacyVar3);
        adcmVar.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar2, aacyVar3}));
        defpackage.mce mceVar = defpackage.mce.BEACON_CARD_DISMISSED;
        java.util.Set setSingleton = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton, "singleton(...)");
        java.util.Set set = b;
        java.util.Set setAI = defpackage.ajsz.aI(setSingleton, set);
        java.util.Set set2 = c;
        adcmVar.d(defpackage.ajsz.aI(setAI, set2));
        defpackage.ajni ajniVar = f;
        java.util.Set setSingleton2 = java.util.Collections.singleton(ajniVar);
        defpackage.aooh.e(setSingleton2, "singleton(...)");
        adcmVar.f(setSingleton2);
        defpackage.adcm adcmVar2 = new defpackage.adcm(null);
        defpackage.mch mchVar4 = new defpackage.mch(8);
        defpackage.aacy aacyVar4 = new defpackage.aacy(null, null, null);
        mchVar4.a(aacyVar4);
        adcmVar2.h = aacyVar4;
        adcmVar2.i = defpackage.mce.BEACON_TOGGLING_ON_FROM_INCALL_PROMO;
        adcmVar2.a = defpackage.mce.BEACON_CARD_RENDERED_BY_SPOON;
        java.util.Set setSingleton3 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton3, "singleton(...)");
        adcmVar2.d(defpackage.ajsz.aI(defpackage.ajsz.aI(setSingleton3, set), set2));
        adcmVar2.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar, d}));
        java.util.List listAsList = java.util.Arrays.asList(b(defpackage.mce.BEACON_INCOMING_CALL_CONNECTED, defpackage.aais.aI("BeaconCardShownAutomaticallyOnIncomingCall", 262785)), b(defpackage.mce.BEACON_OUTGOING_CALL_DIALING_STARTED, defpackage.aais.aI("BeaconCardShownAutomaticallyOnOutgoingCall", 271216)), adcmVar.c(), adcmVar2.c());
        defpackage.aooh.e(listAsList, "asList(...)");
        return listAsList;
    }
}
