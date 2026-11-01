package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wwz implements alip {
    final /* synthetic */ defpackage.wxb a;
    private final defpackage.wvs b;

    public wwz(defpackage.wxb wxbVar, defpackage.wvs wvsVar) {
        j$.util.Objects.requireNonNull(wxbVar);
        this.a = wxbVar;
        this.b = wvsVar;
    }

    public final void m(alio alioVar) {
        aimw aimwVarL = defpackage.wxb.a.c().i(zct.b).k(alioVar).i(zct.a).l("com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner$DuplexListenerImpl", "onError", 379, "HoldDetectionModelRunner.java");
        alti altiVar = alioVar.a;
        aimwVarL.w("hold detection model error: %d", altiVar.m);
        defpackage.wxb wxbVar = this.a;
        wxbVar.a();
        switch (altiVar.ordinal()) {
            case 0:
                wxbVar.e.c(defpackage.alex.DUPLEX_UNKNOWN_ERROR);
                break;
            case 1:
                wxbVar.e.c(defpackage.alex.DUPLEX_RECOGNIZER_STATUS_INITIALIZATION_ERROR);
                break;
            case 2:
                wxbVar.e.c(defpackage.alex.DUPLEX_RUN_RECOGNITION_ERROR);
                break;
            case 3:
                wxbVar.e.c(defpackage.alex.DUPLEX_RECOGNIZER_STATUS_STREAM_BROKEN);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                wxbVar.e.c(defpackage.alex.DUPLEX_INVALID_INPUT_FORMAT);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                wxbVar.e.c(defpackage.alex.DUPLEX_START_CALLED_WHILE_IN_PROGRESS);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                wxbVar.e.c(defpackage.alex.DUPLEX_SPECS_LOADING_FAILURE);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                wxbVar.e.c(defpackage.alex.DUPLEX_CALLBACK_HANDLING_FAILURE);
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                wxbVar.e.c(defpackage.alex.DUPLEX_START_CALLED_BEFORE_INITIALIZATION);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                wxbVar.e.c(defpackage.alex.CORE_INFRA_FATAL_FAILURE);
                break;
        }
        defpackage.wvs wvsVar = this.b;
        akzx akzxVarM = defpackage.wwr.a.m();
        defpackage.wwp wwpVar = defpackage.wwp.a;
        akzxVarM.u();
        defpackage.wwr wwrVar = (defpackage.wwr) akzxVarM.b;
        j$.util.Objects.requireNonNull(wwpVar);
        wwrVar.c = wwpVar;
        wwrVar.b = 9;
        wvsVar.a((defpackage.wwr) akzxVarM.p());
    }

    public final void n(altn altnVar) {
        hgb.c(defpackage.wxb.a.b(), "logging recognition event", "com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner$DuplexListenerImpl", "onLog", (char) 441, "HoldDetectionModelRunner.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
        akzx akzxVarM = defpackage.wwr.a.m();
        akzx akzxVarM2 = defpackage.wwq.a.m();
        akzxVarM2.u();
        defpackage.wwq wwqVar = (defpackage.wwq) akzxVarM2.b;
        j$.util.Objects.requireNonNull(altnVar);
        wwqVar.c = altnVar;
        wwqVar.b |= 1;
        defpackage.wwq wwqVar2 = (defpackage.wwq) akzxVarM2.p();
        akzxVarM.u();
        defpackage.wwr wwrVar = (defpackage.wwr) akzxVarM.b;
        j$.util.Objects.requireNonNull(wwqVar2);
        wwrVar.c = wwqVar2;
        wwrVar.b = 3;
        this.b.a((defpackage.wwr) akzxVarM.p());
        int i = altnVar.b;
        if (i == 12) {
            altl altlVar = i == 12 ? (altl) altnVar.c : altl.a;
            defpackage.wxb wxbVar = this.a;
            java.lang.String str = altlVar.b;
            defpackage.wvq wvqVar = wxbVar.e;
            agsm.i(1117, wvqVar.a(new defpackage.whv(wvqVar, str, 15)), "failed to record hold detection model version", new java.lang.Object[0]);
        }
    }

    public final void o(alsi alsiVar) {
        apdi apdiVar = amah.e;
        alsiVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) alsiVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        amag amagVarB = amag.b(((amah) objJ).c);
        if (amagVarB == null) {
            amagVarB = amag.a;
        }
        a.bt(defpackage.wxb.a.b(), "got %s", amagVarB.name(), "com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner$DuplexListenerImpl", "onOutboundEvent", (char) 335, "HoldDetectionModelRunner.java", zct.a);
        int iOrdinal = amagVarB.ordinal();
        if (iOrdinal == 0) {
            this.a.e.c(defpackage.alex.DUPLEX_NOTIFY_USER);
            defpackage.wvs wvsVar = this.b;
            akzx akzxVarM = defpackage.wwr.a.m();
            defpackage.wws wwsVar = defpackage.wws.a;
            akzxVarM.u();
            defpackage.wwr wwrVar = (defpackage.wwr) akzxVarM.b;
            j$.util.Objects.requireNonNull(wwsVar);
            wwrVar.c = wwsVar;
            wwrVar.b = 2;
            wvsVar.a((defpackage.wwr) akzxVarM.p());
            return;
        }
        if (iOrdinal == 5) {
            this.a.e.c(defpackage.alex.DUPLEX_AUDIO_ERROR);
            defpackage.wvs wvsVar2 = this.b;
            akzx akzxVarM2 = defpackage.wwr.a.m();
            defpackage.wwl wwlVar = defpackage.wwl.a;
            akzxVarM2.u();
            defpackage.wwr wwrVar2 = (defpackage.wwr) akzxVarM2.b;
            j$.util.Objects.requireNonNull(wwlVar);
            wwrVar2.c = wwlVar;
            wwrVar2.b = 8;
            wvsVar2.a((defpackage.wwr) akzxVarM2.p());
            return;
        }
        if (iOrdinal == 2) {
            this.a.e.c(defpackage.alex.DUPLEX_DO_NOT_RECORD_CALL);
            defpackage.wvs wvsVar3 = this.b;
            akzx akzxVarM3 = defpackage.wwr.a.m();
            defpackage.wwo wwoVar = defpackage.wwo.a;
            akzxVarM3.u();
            defpackage.wwr wwrVar3 = (defpackage.wwr) akzxVarM3.b;
            j$.util.Objects.requireNonNull(wwoVar);
            wwrVar3.c = wwoVar;
            wwrVar3.b = 4;
            wvsVar3.a((defpackage.wwr) akzxVarM3.p());
            return;
        }
        if (iOrdinal == 3) {
            this.a.e.c(defpackage.alex.DUPLEX_IVR_DETECTED);
            defpackage.wvs wvsVar4 = this.b;
            akzx akzxVarM4 = defpackage.wwr.a.m();
            defpackage.wwu wwuVar = defpackage.wwu.a;
            akzxVarM4.u();
            defpackage.wwr wwrVar4 = (defpackage.wwr) akzxVarM4.b;
            j$.util.Objects.requireNonNull(wwuVar);
            wwrVar4.c = wwuVar;
            wwrVar4.b = 7;
            wvsVar4.a((defpackage.wwr) akzxVarM4.p());
        }
    }

    public final void l() {
    }
}
