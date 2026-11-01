package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hyb implements aono {
    final /* synthetic */ aosb a;
    final /* synthetic */ defpackage.oii b;

    public hyb(defpackage.oii oiiVar, aosb aosbVar) {
        this.b = oiiVar;
        this.a = aosbVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int iIntValue = ((java.lang.Number) obj2).intValue();
        int iIntValue2 = ((java.lang.Number) obj3).intValue();
        aooh.f((defpackage.oii) obj, "<unused var>");
        defpackage.hyj.a.c().m(aioa.b).l("com/android/dialer/audio/audioinjector/audioplayer/LocalAudioPlayer$Companion", "playSuspending$<anonymous>$<anonymous>", 301, "LocalAudioPlayer.kt").z("onError: %s %s", iIntValue, iIntValue2);
        defpackage.hgt.i(this.b);
        aosb aosbVar = this.a;
        if (!aosbVar.i()) {
            aosbVar.w(aooc.ae(new java.lang.IllegalStateException()));
        }
        return java.lang.Boolean.TRUE;
    }
}
