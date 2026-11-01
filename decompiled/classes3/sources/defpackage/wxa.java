package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wxa implements alit {
    final /* synthetic */ defpackage.wxb a;
    private final defpackage.wvs b;

    public wxa(defpackage.wxb wxbVar, defpackage.wvs wvsVar) {
        j$.util.Objects.requireNonNull(wxbVar);
        this.a = wxbVar;
        this.b = wvsVar;
    }

    public final altm a(java.lang.String str) {
        this.a.e.c(defpackage.alex.DUPLEX_PLAYING_PROBING_AUDIO);
        a.bI(defpackage.wxb.a.b(), "got a probing event", "com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner$OutboundAudioCallbackImpl", "playAudio", (char) 314, "HoldDetectionModelRunner.java", zct.a);
        akzx akzxVarM = defpackage.wwr.a.m();
        akzx akzxVarM2 = defpackage.wwt.a.m();
        akzxVarM2.u();
        defpackage.wwt wwtVar = (defpackage.wwt) akzxVarM2.b;
        j$.util.Objects.requireNonNull(str);
        wwtVar.b |= 1;
        wwtVar.c = str;
        defpackage.wwt wwtVar2 = (defpackage.wwt) akzxVarM2.p();
        akzxVarM.u();
        defpackage.wwr wwrVar = (defpackage.wwr) akzxVarM.b;
        j$.util.Objects.requireNonNull(wwtVar2);
        wwrVar.c = wwtVar2;
        wwrVar.b = 1;
        this.b.a((defpackage.wwr) akzxVarM.p());
        return altm.a;
    }
}
