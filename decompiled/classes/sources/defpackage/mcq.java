package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mcq implements defpackage.zaq {
    public static final /* synthetic */ int a = 0;
    private static final java.util.Set b = defpackage.ajsz.aF(defpackage.aais.aJ(new defpackage.mco(6)));

    @Override // defpackage.zaq
    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.adcm adcmVar = new defpackage.adcm(null);
        defpackage.mco mcoVar = new defpackage.mco(7);
        defpackage.aacy aacyVar = new defpackage.aacy(null, null, null);
        mcoVar.a(aacyVar);
        adcmVar.h = aacyVar;
        adcmVar.i = defpackage.mce.USER_CLICKED_TO_START_CALL_RECORDING;
        defpackage.mco mcoVar2 = new defpackage.mco(8);
        defpackage.aacy aacyVar2 = new defpackage.aacy();
        mcoVar2.a(aacyVar2);
        defpackage.mco mcoVar3 = new defpackage.mco(9);
        defpackage.aacy aacyVar3 = new defpackage.aacy();
        mcoVar3.a(aacyVar3);
        adcmVar.e(defpackage.ajsz.cW(new defpackage.aacy[]{aacyVar2, aacyVar3}));
        defpackage.mce mceVar = defpackage.mce.ON_IN_CALL_ACTIVITY_DESTROYED;
        java.util.Set setSingleton = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton, "singleton(...)");
        adcmVar.d(setSingleton);
        java.util.Set set = b;
        adcmVar.f(set);
        arrayList.add(adcmVar.c());
        defpackage.adcm adcmVar2 = new defpackage.adcm(null);
        defpackage.mco mcoVar4 = new defpackage.mco(10);
        defpackage.aacy aacyVar4 = new defpackage.aacy(null, null, null);
        mcoVar4.a(aacyVar4);
        adcmVar2.h = aacyVar4;
        adcmVar2.i = defpackage.mce.CALL_RECORDING_DISCLOSURE_FINISHED_PLAYING;
        adcmVar2.a = defpackage.mce.CALL_RECORDING_STARTED_CAPTURING_AUDIO;
        java.util.Set setSingleton2 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton2, "singleton(...)");
        adcmVar2.d(setSingleton2);
        adcmVar2.f(set);
        arrayList.add(adcmVar2.c());
        defpackage.adcm adcmVar3 = new defpackage.adcm(null);
        defpackage.mco mcoVar5 = new defpackage.mco(11);
        defpackage.aacy aacyVar5 = new defpackage.aacy(null, null, null);
        mcoVar5.a(aacyVar5);
        adcmVar3.h = aacyVar5;
        adcmVar3.i = defpackage.mce.USER_CLICKED_TO_STOP_CALL_RECORDING;
        adcmVar3.a = defpackage.mce.CALL_RECORDING_RECORDING_SAVED;
        java.util.Set setSingleton3 = java.util.Collections.singleton(mceVar);
        defpackage.aooh.e(setSingleton3, "singleton(...)");
        adcmVar3.d(setSingleton3);
        arrayList.add(adcmVar3.c());
        defpackage.adcm adcmVar4 = new defpackage.adcm(null);
        defpackage.mco mcoVar6 = new defpackage.mco(12);
        defpackage.aacy aacyVar6 = new defpackage.aacy(null, null, null);
        mcoVar6.a(aacyVar6);
        adcmVar4.h = aacyVar6;
        adcmVar4.i = defpackage.mce.USER_CLICKED_TO_PLAY_CALL_RECORDING;
        adcmVar4.a = defpackage.mce.CALL_RECORDING_PLAYBACK_STARTED;
        java.util.Set setSingleton4 = java.util.Collections.singleton(defpackage.mce.MAIN_ACTIVITY_ON_PAUSE);
        defpackage.aooh.e(setSingleton4, "singleton(...)");
        adcmVar4.d(setSingleton4);
        defpackage.mco mcoVar7 = new defpackage.mco(13);
        defpackage.ajni ajniVar = new defpackage.ajni(null);
        mcoVar7.a(ajniVar);
        java.util.Set setSingleton5 = java.util.Collections.singleton(ajniVar);
        defpackage.aooh.e(setSingleton5, "singleton(...)");
        adcmVar4.f(setSingleton5);
        arrayList.add(adcmVar4.c());
        return defpackage.ajsz.bZ(arrayList);
    }
}
