package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lgd implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ lgd(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v63, types: [aonj, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return j$.util.Optional.of(this.a);
            case 1:
                j$.util.Optional optional = (j$.util.Optional) obj;
                defpackage.kdb kdbVar = new defpackage.kdb(this.a, 10);
                if (true == optional.isPresent()) {
                    return j$.util.Optional.ofNullable(defpackage.adnw.a((java.io.File) optional.get(), ((defpackage.llw) kdbVar.a).b));
                }
                return optional;
            case 2:
                return java.lang.Boolean.valueOf(((aifo) this.a).contains((defpackage.lgj) obj));
            case 3:
                ((defpackage.lgn) this.a).e.j = true;
                return null;
            case 4:
                ((defpackage.lgz) this.a).k.a();
                return null;
            case 5:
                a.bI(defpackage.lhe.a.c().m(aioa.b), "failed to download call screen voice pack", "com/android/dialer/callscreen/impl/settings/CallScreenSettingsController", "downloadVoicePack", 'L', "CallScreenSettingsController.java", zct.b);
                defpackage.lij.a.b().l("com/android/dialer/callscreen/impl/settings/data/CallScreenSettingsDataService", "onVoicePackDownloadFailed", 135, "CallScreenSettingsDataService.java").v("voice pack download failed");
                defpackage.lij lijVar = ((defpackage.lhe) this.a).b;
                lijVar.d.s(lijVar.e.bl(new jsd(lijVar, 12)), defpackage.lil.b);
                return null;
            case 6:
                return ((lhp) this.a).c.h();
            case 7:
                java.lang.String str = (java.lang.String) obj;
                akzx akzxVarP = ((alad) this.a).p();
                akzxVarP.u();
                lhs lhsVar = akzxVarP.b;
                j$.util.Objects.requireNonNull(str);
                lhsVar.b |= 1;
                lhsVar.d = str;
                return akzxVarP.p();
            case 8:
                java.lang.Object obj2 = this.a;
                int i = ((ljb) obj2).r.b;
                byte[] bArr = new byte[i];
                adrl adrlVar = (adrl) ((j$.util.Optional) obj).orElseThrow();
                while (((ljb) obj2).v) {
                    try {
                        try {
                            int i2 = adrlVar.read(bArr, 0, i);
                            java.nio.ByteBuffer byteBufferPut = java.nio.ByteBuffer.allocateDirect(i2).put(bArr, 0, i2);
                            byteBufferPut.flip();
                            ((ljb) obj2).q.write(byteBufferPut);
                        } catch (java.io.IOException e) {
                            ljb.a.c().i(zct.b).k(e).l("com/android/dialer/callscreen/impl/speechrecognition/SodaSpeechRecognizer", "startReadingAudio", 257, "SodaSpeechRecognizer.java").v("Unable to read from Audio Stream");
                        }
                    } catch (java.lang.Throwable th) {
                        if (adrlVar == null) {
                            throw th;
                        }
                        try {
                            adrlVar.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                if (adrlVar == null) {
                    return null;
                }
                adrlVar.close();
                return null;
            case 9:
                java.lang.Object obj3 = this.a;
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                aimz aimzVar = ljb.a;
                defpackage.kwv kwvVar = new defpackage.kwv(obj3, 15);
                if (true != optional2.isPresent()) {
                    return obj3;
                }
                ((android.content.Intent) kwvVar.a).putExtra("android.speech.extra.LANGUAGE", (java.lang.String) optional2.get());
                return obj3;
            case 10:
                java.lang.Object obj4 = this.a;
                ljb ljbVar = (ljb) obj4;
                android.content.Context context = ljbVar.e;
                ljbVar.d = android.speech.SpeechRecognizer.createSpeechRecognizer(context, afbq.b(context));
                ljbVar.d.setRecognitionListener(ljbVar.h);
                ljbVar.d.startListening((android.content.Intent) obj);
                ljbVar.v = true;
                ahvr.H(ahvr.F(new defpackage.lgc(obj4, 7), ljbVar.i), ahqx.a(new defpackage.lgd(obj4, 8)), ljbVar.f);
                ljb.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/SodaSpeechRecognizer", "startSpeechRecognition", 176, "SodaSpeechRecognizer.java").v("Speech Recognition Started");
                return null;
            case 11:
                tvy tvyVarB = tvy.b(((tvz) obj).c);
                if (tvyVarB == null) {
                    tvyVarB = tvy.a;
                }
                return (tvyVarB.equals(tvy.b) && android.speech.SpeechRecognizer.isRecognitionAvailable(((ljf) this.a).b)) ? lje.a : lje.b;
            case 12:
                return ((ljf) this.a).b((aigf) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.ljs.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "performStopSequence", 621, "ForkedIncomingCallFlowManager.java").w("%d:performStopSequence(future): speech and playback were shutdown", ((defpackage.ljs) this.a).j);
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.ljs ljsVar = (defpackage.ljs) this.a;
                ljsVar.t(defpackage.ljr.c, null, false);
                defpackage.ljs.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "startInternal", 367, "ForkedIncomingCallFlowManager.java").w("%d:start():Incoming call flow started", ljsVar.j);
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                ((defpackage.ljs) this.a).p(defpackage.ljr.g);
                return null;
            case 16:
                defpackage.ljs ljsVar2 = (defpackage.ljs) this.a;
                ljsVar2.t(defpackage.ljr.g, null, true);
                defpackage.ljs.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "stop", 515, "ForkedIncomingCallFlowManager.java").w("%d:stop():Incoming call flow stopped", ljsVar2.j);
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                defpackage.ljs ljsVar3 = (defpackage.ljs) this.a;
                ljsVar3.q();
                ljsVar3.t(defpackage.ljr.e, null, false);
                defpackage.ljs.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "pause", 579, "ForkedIncomingCallFlowManager.java").w("%d:pause():Incoming call flow paused", ljsVar3.j);
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                aimz aimzVar2 = defpackage.lju.a;
                aimzVar2.b().l("com/android/dialer/callscreen/impl/storage/TranscriptSaver", "saveTranscriptWithFeedbackData", 183, "TranscriptSaver.java").v("transcript saved");
                defpackage.lju ljuVar = (defpackage.lju) this.a;
                if (!((java.lang.Boolean) ljuVar.c.a()).booleanValue()) {
                    return null;
                }
                aimzVar2.b().l("com/android/dialer/callscreen/impl/storage/TranscriptSaver", "saveTranscriptWithFeedbackData", 188, "TranscriptSaver.java").v("refresh AnnotatedCallLog after saving transcript");
                ljuVar.f.a();
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return this.a.a(obj);
            default:
                aigf aigfVar = (aigf) obj;
                java.lang.Object obj5 = this.a;
                if (aigfVar.containsKey(obj5)) {
                    return (wgi) aigfVar.get(obj5);
                }
                a.bI(defpackage.lzm.a.d(), "No WifiCallingIconsConfig found for row.", "com/android/dialer/conversationhistorycalldetails/dataservice/BottomActionContainerPropertiesLoader", "load", 'W', "BottomActionContainerPropertiesLoader.java", zct.b);
                return wgi.a;
        }
    }
}
