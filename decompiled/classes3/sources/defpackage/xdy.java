package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xdy implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ xdy(j$.util.Optional optional, defpackage.wxm wxmVar, long j, int i) {
        this.$cid = i;
        this.b = optional;
        this.c = wxmVar;
        this.a = j;
    }

    public final ajcq a() {
        if (this.$cid == 0) {
            if (!((j$.util.Optional) this.b).isPresent()) {
                return aiql.z(j$.util.Optional.empty());
            }
            long j = this.a;
            defpackage.wxm wxmVar = (defpackage.wxm) this.c;
            wxmVar.c(j, defpackage.alex.ATLAS_UI_READY);
            wxmVar.c(j, defpackage.alex.ATLAS_UI_HFM_BUTTON_SHOWN);
            return aiql.z(j$.util.Optional.of(defpackage.wha.ADDON_FEATURE_KEY_HOLD_FOR_ME));
        }
        defpackage.wvn wvnVar = (defpackage.wvn) this.c;
        if (wvnVar.h.isPresent()) {
            defpackage.wvn.a.d().l("com/android/incallui/atlas/detection/detectors/callaudiodetector/CallAudioAtlasDetector", "init", 77, "CallAudioAtlasDetector.java").v("detector already initialized or being initialized; to re-initialize, call closeResources() first");
            return (ajcq) wvnVar.h.orElseThrow();
        }
        java.lang.Object obj = this.b;
        long j2 = this.a;
        defpackage.wvq wvqVar = wvnVar.c;
        agsm.i(1115, wvqVar.j.d(ahqx.i(new jww(wvqVar, j2, 9)), wvqVar.c), "init failed", new java.lang.Object[0]);
        agsm.i(1122, wvqVar.a(new jww(wvqVar, android.os.SystemClock.elapsedRealtime(), 11)), "recordStartTimeMillis failed", new java.lang.Object[0]);
        wvqVar.c(defpackage.alex.ATLAS_DETECTOR_START);
        defpackage.wvx wvxVar = wvnVar.b;
        defpackage.wvw wvwVar = new defpackage.wvw(wvxVar, (defpackage.xbk) obj);
        wvxVar.e = j$.util.Optional.of(wvwVar);
        defpackage.wvt wvtVar = wvxVar.c;
        defpackage.wwj wwjVar = (defpackage.wwj) wvtVar;
        defpackage.wwh wwhVar = new defpackage.wwh(wwjVar, wvwVar);
        defpackage.wwi wwiVar = new defpackage.wwi(wvwVar, 1);
        defpackage.wwi wwiVar2 = new defpackage.wwi(wvwVar, 0);
        defpackage.wwi wwiVar3 = new defpackage.wwi(wvwVar, 2);
        ahrv ahrvVarG = ahrv.g(wwjVar.d.a());
        defpackage.wkv wkvVar = new defpackage.wkv(wwiVar, 14);
        ajct ajctVar = wwjVar.b;
        ajcq ajcqVarI = ahrvVarG.i(wkvVar, ajctVar);
        defpackage.wxj wxjVar = wwjVar.f;
        wxjVar.h = wwhVar;
        wxjVar.c.b.set(0L);
        wxjVar.g.set(true);
        ajcq ajcqVar = ajcm.a;
        defpackage.wxc wxcVar = wwjVar.c;
        ajcq ajcqVarD = wxcVar.i.d(ahqx.i(new defpackage.whv(wxcVar, wwiVar3, 18, null)), wxcVar.d);
        agsm.i(1130, ahrv.g(ajcqVarI).i(new defpackage.whr(wvtVar, wwiVar2, 15, null), ajctVar), "failed to initialize ASR", new java.lang.Object[0]);
        wvnVar.h = j$.util.Optional.of(ahvr.ak(new ajcq[]{ajcqVarI, ajcqVar, ajcqVarD}).o(new defpackage.vnc(6), ajctVar));
        wvnVar.g.set(false);
        a.bI(defpackage.wvn.a.b(), "detector has been initialized", "com/android/incallui/atlas/detection/detectors/callaudiodetector/CallAudioAtlasDetector", "init", 'Z', "CallAudioAtlasDetector.java", zct.a);
        return (ajcq) wvnVar.h.orElseThrow();
    }

    public /* synthetic */ xdy(defpackage.wvn wvnVar, long j, defpackage.xbk xbkVar, int i) {
        this.$cid = i;
        this.c = wvnVar;
        this.a = j;
        this.b = xbkVar;
    }
}
