package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wrn implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ wrn(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        int i = 19;
        int i2 = 7;
        int i3 = 0;
        switch (this.$cid) {
            case 0:
                return (aify) j$.util.Collection.-EL.stream((aify) obj).filter(new defpackage.wrm(i3)).map(new defpackage.vxb(this.a, i2)).collect(aido.a);
            case 1:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    defpackage.wrh.a.b().l("com/android/dialer/xatu/impl/storage/XatuSessionPersistor", "save", 120, "XatuSessionPersistor.java").v("no audio info present");
                    return null;
                }
                java.lang.Object obj2 = this.a;
                defpackage.wqn wqnVar = (defpackage.wqn) optional.orElseThrow();
                akzx akzxVar = (akzx) obj2;
                akzxVar.u();
                defpackage.wrf wrfVar = (defpackage.wrf) akzxVar.b;
                defpackage.wrf wrfVar2 = defpackage.wrf.a;
                j$.util.Objects.requireNonNull(wqnVar);
                wrfVar.d = wqnVar;
                wrfVar.b |= 2;
                return null;
            case 2:
                defpackage.wlf wlfVar = (defpackage.wlf) obj;
                int i4 = wlfVar.c;
                if (i4 != 0) {
                    switch (i4) {
                        case 2:
                            i2 = 1;
                            break;
                        case 3:
                            i2 = 2;
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            i2 = 3;
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            i2 = 4;
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            i2 = 5;
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            i2 = 6;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                }
                if (i2 == 0) {
                    throw null;
                }
                int i5 = i2 - 1;
                java.lang.Object obj3 = this.a;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return ((defpackage.wtk) obj3).j;
                    }
                    if (i5 == 2) {
                        return ((defpackage.wtk) obj3).q;
                    }
                    if (i5 == 3) {
                        return ((defpackage.wtk) obj3).r;
                    }
                    if (i5 == 4) {
                        return ((defpackage.wtk) obj3).k;
                    }
                    if (i5 == 5) {
                        return ((defpackage.wtk) obj3).l;
                    }
                    throw new java.lang.IllegalStateException("invalid row item type");
                }
                int I = wsc.I((i4 == 2 ? (defpackage.wmz) wlfVar.d : defpackage.wmz.a).c);
                int i6 = I - 1;
                if (I == 0) {
                    throw null;
                }
                if (i6 == 0) {
                    return ((defpackage.wtk) obj3).h;
                }
                if (i6 == 1) {
                    return ((defpackage.wtk) obj3).m;
                }
                if (i6 == 2) {
                    return ((defpackage.wtk) obj3).n;
                }
                if (i6 == 3) {
                    return ((defpackage.wtk) obj3).o;
                }
                if (i6 == 4) {
                    return ((defpackage.wtk) obj3).p;
                }
                throw new java.lang.IllegalStateException("invalid tree item type");
            case 3:
                defpackage.wvq wvqVar = ((defpackage.wvn) this.a).c;
                agsm.i(1123, wvqVar.j.d(ahqx.i(new defpackage.vug(wvqVar, i)), wvqVar.c), "reset failed", new java.lang.Object[0]);
                return j$.util.Optional.ofNullable((defpackage.wus) obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.wwb wwbVar = (defpackage.wwb) this.a;
                if (!wwbVar.d.isPresent()) {
                    wwbVar.e = false;
                    return null;
                }
                wwbVar.b.a((defpackage.wwa) wwbVar.d.orElseThrow());
                wwbVar.d = j$.util.Optional.empty();
                wwbVar.b();
                return null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.wwd.a.b().l("com/android/incallui/atlas/detection/techniques/asr/SodaModelRunner", "closeResources", 163, "SodaModelRunner.java").v("Stopped SODA HFM.");
                defpackage.wwd wwdVar = (defpackage.wwd) this.a;
                wwdVar.f = j$.util.Optional.empty();
                wwdVar.e = j$.util.Optional.empty();
                wwdVar.g = j$.util.Optional.empty();
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((defpackage.wwd) this.a).f = (j$.util.Optional) obj;
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                final defpackage.wxb wxbVar = (defpackage.wxb) obj;
                akzx akzxVarM = defpackage.wwn.a.m();
                defpackage.wxh wxhVar = (defpackage.wxh) this.a;
                long j = wxhVar.i;
                akzxVarM.u();
                defpackage.wwn wwnVar = (defpackage.wwn) akzxVarM.b;
                wwnVar.b |= 1;
                wwnVar.c = j;
                long j2 = wxhVar.j;
                akzxVarM.u();
                defpackage.wwn wwnVar2 = (defpackage.wwn) akzxVarM.b;
                wwnVar2.b |= 2;
                wwnVar2.d = j2;
                defpackage.wxk wxkVarB = defpackage.wxk.b(wxhVar.c);
                if (wxkVarB == null) {
                    wxkVarB = defpackage.wxk.UNKNOWN_SOUND_EVENT_TYPE;
                }
                akzxVarM.u();
                defpackage.wwn wwnVar3 = (defpackage.wwn) akzxVarM.b;
                wwnVar3.e = wxkVarB.f;
                wwnVar3.b |= 4;
                java.lang.Iterable iterable = (java.lang.Iterable) j$.util.Collection.-EL.stream(wxhVar.d).map(new defpackage.vun(i)).collect(aido.a);
                akzxVarM.u();
                defpackage.wwn wwnVar4 = (defpackage.wwn) akzxVarM.b;
                alat alatVar = wwnVar4.f;
                if (!alatVar.c()) {
                    wwnVar4.f = alad.J(alatVar);
                }
                akyl.i(iterable, wwnVar4.f);
                final defpackage.wwn wwnVar5 = (defpackage.wwn) akzxVarM.p();
                agsm.i(1134, wxbVar.o.d(ahqx.i(new java.util.concurrent.Callable() { // from class: wwv
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        defpackage.wxb wxbVar2 = wxbVar;
                        if (!wxbVar2.i.isPresent()) {
                            hgb.h(defpackage.wxb.a.d(), "unable to submit sound indication: conversation absent", "com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner", "submitDaredevilIndication", (char) 192, "HoldDetectionModelRunner.java", (byte) 1, zct.b, java.util.concurrent.TimeUnit.MINUTES);
                            return null;
                        }
                        defpackage.wwn wwnVar6 = wwnVar5;
                        if (wwnVar6.c < wxbVar2.l) {
                            a.bI(defpackage.wxb.a.d(), "sound indication received before conversation start", "com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner", "isValidSoundIndication", (char) 528, "HoldDetectionModelRunner.java", zct.b);
                            return null;
                        }
                        if (wwnVar6.d <= 0) {
                            a.bI(defpackage.wxb.a.d(), "invalid duration", "com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner", "isValidSoundIndication", (char) 533, "HoldDetectionModelRunner.java", zct.b);
                            return null;
                        }
                        if (j$.util.Collection.-EL.stream(wwnVar6.f).anyMatch(new defpackage.wrm(2))) {
                            a.bI(defpackage.wxb.a.d(), "invalid score", "com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner", "isValidSoundIndication", (char) 539, "HoldDetectionModelRunner.java", zct.b);
                            return null;
                        }
                        aigf aigfVar = defpackage.wxb.d;
                        defpackage.wxk wxkVarB2 = defpackage.wxk.b(wwnVar6.e);
                        if (wxkVarB2 == null) {
                            wxkVarB2 = defpackage.wxk.UNKNOWN_SOUND_EVENT_TYPE;
                        }
                        if (!aigfVar.containsKey(wxkVarB2) || j$.util.Collection.-EL.stream(wwnVar6.f).anyMatch(new defpackage.wrm(3))) {
                            a.bI(defpackage.wxb.a.d(), "invalid type (cannot convert to hold detection model type)", "com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner", "isValidSoundIndication", (char) 551, "HoldDetectionModelRunner.java", zct.b);
                            return null;
                        }
                        aify aifyVar = (aify) j$.util.Collection.-EL.stream(wwnVar6.f).map(new defpackage.wyd(1)).collect(aido.a);
                        akzz akzzVarM = alro.a.m();
                        apdi apdiVar = defpackage.alrc.f;
                        akzx akzxVarM2 = defpackage.alrc.a.m();
                        defpackage.wxk wxkVarB3 = defpackage.wxk.b(wwnVar6.e);
                        if (wxkVarB3 == null) {
                            wxkVarB3 = defpackage.wxk.UNKNOWN_SOUND_EVENT_TYPE;
                        }
                        defpackage.alrb alrbVar = (defpackage.alrb) aigfVar.get(wxkVarB3);
                        akzxVarM2.u();
                        defpackage.alrc alrcVar = (defpackage.alrc) akzxVarM2.b;
                        alrcVar.c = alrbVar.f;
                        alrcVar.b |= 1;
                        long j3 = wwnVar6.d;
                        akzxVarM2.u();
                        defpackage.alrc alrcVar2 = (defpackage.alrc) akzxVarM2.b;
                        alrcVar2.b |= 2;
                        alrcVar2.d = j3;
                        akzxVarM2.aO(aifyVar);
                        akzzVarM.bV(apdiVar, (defpackage.alrc) akzxVarM2.p());
                        long j4 = wwnVar6.c - wxbVar2.l;
                        akzzVarM.u();
                        alro alroVar = akzzVarM.b;
                        alroVar.b |= 1;
                        alroVar.c = j4;
                        ((alje) wxbVar2.i.orElseThrow()).b(akzzVarM.p());
                        return null;
                    }
                }), wxbVar.h), "failed to submit Daredevil indication", new java.lang.Object[0]);
                return null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                final defpackage.wxb wxbVar2 = (defpackage.wxb) obj;
                ajwr ajwrVar = wxbVar2.o;
                final defpackage.wvg wvgVar = (defpackage.wvg) this.a;
                agsm.i(1135, ajwrVar.d(ahqx.i(new java.util.concurrent.Callable() { // from class: www
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        int i7;
                        defpackage.wvg wvgVar2 = wvgVar;
                        int i8 = wvgVar2.c;
                        if (i8 == 0) {
                            i7 = 3;
                        } else if (i8 != 1) {
                            i7 = 2;
                            if (i8 != 2) {
                                i7 = 0;
                            }
                        } else {
                            i7 = 1;
                        }
                        if (i7 == 0) {
                            throw null;
                        }
                        int i9 = i7 - 1;
                        defpackage.wxb wxbVar3 = wxbVar2;
                        if (i9 == 0) {
                            defpackage.wvf wvfVar = i8 == 1 ? (defpackage.wvf) wvgVar2.d : defpackage.wvf.a;
                            if (!wxbVar3.j.isPresent()) {
                                hgb.h(defpackage.wxb.a.d(), "skip: output stream absent", "com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner", "submitAudioData", (char) 460, "HoldDetectionModelRunner.java", (byte) 1, zct.b, java.util.concurrent.TimeUnit.MINUTES);
                                return null;
                            }
                            if (wvfVar.c.C()) {
                                hgb.h(defpackage.wxb.a.d(), "skip: empty data", "com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner", "submitAudioData", (char) 465, "HoldDetectionModelRunner.java", (byte) 1, zct.b, java.util.concurrent.TimeUnit.MINUTES);
                            } else {
                                if (wvfVar.d != 16000) {
                                    hgb.h(defpackage.wxb.a.d(), "input sample rate different from hold detection model sample rate; consider resampling input", "com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner", "submitAudioData", (char) 474, "HoldDetectionModelRunner.java", (byte) 1, zct.b, java.util.concurrent.TimeUnit.MINUTES);
                                }
                                try {
                                    wvfVar.c.m((java.io.OutputStream) wxbVar3.j.orElseThrow());
                                    if (!wxbVar3.k) {
                                        wxbVar3.e.c(defpackage.alex.ATLAS_START_INPUT_AUDIO_TO_DUPLEX);
                                        wxbVar3.k = true;
                                    }
                                } catch (java.io.IOException e) {
                                    defpackage.wxb.a.d().i(zct.b).k(e).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner", "submitAudioData", 492, "HoldDetectionModelRunner.java").v("failed to submit audio data");
                                }
                            }
                        } else if (i9 == 1) {
                            long j3 = wvgVar2.e;
                            if (!wxbVar3.i.isPresent()) {
                                hgb.h(defpackage.wxb.a.d(), "unable to submit dialpad click: conversation absent", "com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner", "submitDialpadClick", (char) 502, "HoldDetectionModelRunner.java", (byte) 1, zct.b, java.util.concurrent.TimeUnit.MINUTES);
                                return null;
                            }
                            if (j3 < wxbVar3.l) {
                                a.bI(defpackage.wxb.a.d(), "dialpad click happened before conversation start", "com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner", "submitDialpadClick", (char) 510, "HoldDetectionModelRunner.java", zct.b);
                                return null;
                            }
                            alje aljeVar = (alje) wxbVar3.i.orElseThrow();
                            akzz akzzVarM = alro.a.m();
                            apdi apdiVar = defpackage.alre.e;
                            akzx akzxVarM2 = defpackage.alre.a.m();
                            akzxVarM2.u();
                            defpackage.alre alreVar = (defpackage.alre) akzxVarM2.b;
                            alreVar.b |= 1;
                            alreVar.c = true;
                            akzzVarM.bV(apdiVar, (defpackage.alre) akzxVarM2.p());
                            long j4 = j3 - wxbVar3.l;
                            akzzVarM.u();
                            alro alroVar = akzzVarM.b;
                            alroVar.b |= 1;
                            alroVar.c = j4;
                            aljeVar.b(akzzVarM.p());
                            return null;
                        }
                        return null;
                    }
                }), wxbVar2.h), "failed to submit data", new java.lang.Object[0]);
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((defpackage.wxb) this.a).e.c(defpackage.alex.ATLAS_FAILED_TO_UNZIP_DUPLEX_MODEL);
                throw new java.lang.AssertionError((java.lang.Throwable) obj);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                ((defpackage.wyn) this.a).l.set(bool.booleanValue());
                return bool;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return (aigf) j$.util.Collection.-EL.stream(((java.util.Map) obj).values()).collect(aido.b(new defpackage.wyd(4), new defpackage.vxb(this.a, 8)));
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ((kjr) ((defpackage.wyw) this.a).c).a();
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((kjr) ((defpackage.wyw) this.a).c).a();
                return null;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return (aify) j$.util.Collection.-EL.stream((java.util.List) obj).filter(new defpackage.wrm(i2)).map(new defpackage.vxb(this.a, 9)).collect(aido.a);
            case 15:
                ((wzh) this.a).h.o(rmx.jn);
                hgb.f(wzh.a.c(), obj, "error uploading to scotty", "com/android/incallui/atlas/ui/impl/database/postcall/AtlasMetricsWorker", "uploadWaitingAudioToScotty", 'l', "AtlasMetricsWorker.java", zct.b);
                return null;
            case 16:
                ((defpackage.txk) obj).a((akff) this.a);
                return null;
            case 17:
                defpackage.amoc amocVar = (defpackage.amoc) obj;
                defpackage.xbb xbbVar = (defpackage.xbb) this.a;
                long j3 = xbbVar.a;
                java.lang.Object obj4 = xbbVar.b;
                agsm.i(1143, ahvr.F(new jww(obj4, j3, 14), ((defpackage.wys) obj4).c), "failed to clear metrics for call created at %d", new java.lang.Object[]{java.lang.Long.valueOf(j3)});
                return amocVar;
            case 18:
                ((defpackage.xbc) this.a).c.set(true);
                return null;
            case 19:
                ((defpackage.xbk) this.a).c();
                return null;
            default:
                ((defpackage.xbk) this.a).c();
                return null;
        }
    }
}
