package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mda implements defpackage.zaq {
    public static final /* synthetic */ int a = 0;
    private static final java.util.Set b = defpackage.ajsz.cW(new defpackage.mce[]{defpackage.mce.ON_CALL_REMOVED, defpackage.mce.ON_CALL_DISCONNECTED, defpackage.mce.ON_IN_CALL_ACTIVITY_STOPPED, defpackage.mce.SINGLE_CALL_IN_CALL_ACTIVITY_DESTROYED});

    @Override // defpackage.zaq
    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.adcm adcmVar = new defpackage.adcm(null);
        defpackage.mcz mczVar = new defpackage.mcz(10);
        defpackage.aacy aacyVar = new defpackage.aacy(null, null, null);
        mczVar.a(aacyVar);
        adcmVar.h = aacyVar;
        adcmVar.i = defpackage.mce.HEDWIG_CALL_DIALING_STARTED;
        adcmVar.a = defpackage.mce.HEDWIG_UI_FULLY_RENDERED;
        java.util.Set set = b;
        adcmVar.d(set);
        defpackage.mcz mczVar2 = new defpackage.mcz(11);
        defpackage.ajni ajniVar = new defpackage.ajni(null);
        mczVar2.a(ajniVar);
        defpackage.mcz mczVar3 = new defpackage.mcz(12);
        defpackage.ajni ajniVar2 = new defpackage.ajni(null);
        mczVar3.a(ajniVar2);
        adcmVar.f(defpackage.ajsz.cW(new defpackage.ajni[]{ajniVar, ajniVar2}));
        arrayList.add(adcmVar.c());
        defpackage.adcm adcmVar2 = new defpackage.adcm(null);
        defpackage.mcz mczVar4 = new defpackage.mcz(13);
        defpackage.aacy aacyVar2 = new defpackage.aacy(null, null, null);
        mczVar4.a(aacyVar2);
        adcmVar2.h = aacyVar2;
        adcmVar2.i = defpackage.mce.HEDWIG_TAKEOVER_CLICKED;
        adcmVar2.a = defpackage.mce.HEDWIG_SESSION_ENDED;
        adcmVar2.d(set);
        defpackage.mcz mczVar5 = new defpackage.mcz(14);
        defpackage.ajni ajniVar3 = new defpackage.ajni(null);
        mczVar5.a(ajniVar3);
        java.util.Set setSingleton = java.util.Collections.singleton(ajniVar3);
        defpackage.aooh.e(setSingleton, "singleton(...)");
        adcmVar2.f(setSingleton);
        arrayList.add(adcmVar2.c());
        return arrayList;
    }
}
