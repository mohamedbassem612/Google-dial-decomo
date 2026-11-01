package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class txl implements android.speech.RecognitionListener {
    final /* synthetic */ defpackage.txv a;

    public txl(defpackage.txv txvVar) {
        this.a = txvVar;
    }

    private final void b(aonn aonnVar) {
        defpackage.txv txvVar = this.a;
        txvVar.s.i(ahvr.ag(txvVar.d, txvVar.q, aonnVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0095  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final defpackage.twj a(android.os.Bundle bundle) {
        int i;
        java.lang.String string;
        akzx akzxVarM = defpackage.twj.a.m();
        aooh.e(akzxVarM, "newBuilder(...)");
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            java.lang.String str = stringArrayList.get(0);
            akzxVarM.u();
            defpackage.twj twjVar = (defpackage.twj) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            twjVar.b = 1;
            twjVar.c = str;
            return (defpackage.twj) akzxVarM.p();
        }
        if (bundle.containsKey("detected_language")) {
            akzx akzxVarM2 = defpackage.tvx.a.m();
            aooh.e(akzxVarM2, "newBuilder(...)");
            java.lang.String string2 = bundle.getString("language_detection_confidence_level");
            if (string2 != null) {
                switch (string2.hashCode()) {
                    case -1052687648:
                        if (string2.equals("not_confident")) {
                            i = 2;
                            akzxVarM2.u();
                            defpackage.tvx tvxVar = (defpackage.tvx) akzxVarM2.b;
                            tvxVar.d = i - 1;
                            tvxVar.b |= 2;
                            string = bundle.getString("detected_language");
                            if (string != null) {
                                akzxVarM2.u();
                                defpackage.tvx tvxVar2 = (defpackage.tvx) akzxVarM2.b;
                                j$.util.Objects.requireNonNull(string);
                                tvxVar2.b |= 1;
                                tvxVar2.c = string;
                            }
                            defpackage.twh twhVar = this.a.j;
                            alad aladVarP = akzxVarM2.p();
                            aooh.e(aladVarP, "build(...)");
                            twhVar.c((defpackage.tvx) aladVarP);
                        }
                        break;
                    case -804533940:
                        if (string2.equals("confident")) {
                            i = 3;
                            akzxVarM2.u();
                            defpackage.tvx tvxVar3 = (defpackage.tvx) akzxVarM2.b;
                            tvxVar3.d = i - 1;
                            tvxVar3.b |= 2;
                            string = bundle.getString("detected_language");
                            if (string != null) {
                                akzxVarM2.u();
                                defpackage.tvx tvxVar4 = (defpackage.tvx) akzxVarM2.b;
                                j$.util.Objects.requireNonNull(string);
                                tvxVar4.b |= 1;
                                tvxVar4.c = string;
                            }
                            defpackage.twh twhVar2 = this.a.j;
                            alad aladVarP2 = akzxVarM2.p();
                            aooh.e(aladVarP2, "build(...)");
                            twhVar2.c((defpackage.tvx) aladVarP2);
                        }
                        break;
                    case -224635489:
                        if (string2.equals("unknown_confidence")) {
                            i = 1;
                            akzxVarM2.u();
                            defpackage.tvx tvxVar5 = (defpackage.tvx) akzxVarM2.b;
                            tvxVar5.d = i - 1;
                            tvxVar5.b |= 2;
                            string = bundle.getString("detected_language");
                            if (string != null) {
                                akzxVarM2.u();
                                defpackage.tvx tvxVar6 = (defpackage.tvx) akzxVarM2.b;
                                j$.util.Objects.requireNonNull(string);
                                tvxVar6.b |= 1;
                                tvxVar6.c = string;
                            }
                            defpackage.twh twhVar3 = this.a.j;
                            alad aladVarP3 = akzxVarM2.p();
                            aooh.e(aladVarP3, "build(...)");
                            twhVar3.c((defpackage.tvx) aladVarP3);
                        }
                        break;
                    case 1510899644:
                        if (string2.equals("highly_confident")) {
                            i = 4;
                            akzxVarM2.u();
                            defpackage.tvx tvxVar7 = (defpackage.tvx) akzxVarM2.b;
                            tvxVar7.d = i - 1;
                            tvxVar7.b |= 2;
                            string = bundle.getString("detected_language");
                            if (string != null) {
                                akzxVarM2.u();
                                defpackage.tvx tvxVar8 = (defpackage.tvx) akzxVarM2.b;
                                j$.util.Objects.requireNonNull(string);
                                tvxVar8.b |= 1;
                                tvxVar8.c = string;
                            }
                            defpackage.twh twhVar4 = this.a.j;
                            alad aladVarP4 = akzxVarM2.p();
                            aooh.e(aladVarP4, "build(...)");
                            twhVar4.c((defpackage.tvx) aladVarP4);
                        }
                        break;
                }
            }
            throw new defpackage.ahzr();
        }
        if (bundle.containsKey("soda_event")) {
            try {
                amle amleVarM = defpackage.akmr.m(bundle, "soda_event", amle.a, akzq.a());
                akzxVarM.u();
                defpackage.twj twjVar2 = (defpackage.twj) akzxVarM.b;
                j$.util.Objects.requireNonNull(amleVarM);
                twjVar2.c = amleVarM;
                twjVar2.b = 2;
                return (defpackage.twj) akzxVarM.p();
            } catch (alaz e) {
                defpackage.txv.a.d().k(e).l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechSession$RecognitionListenerImpl", "buildTranscriptionResult", 602, "SodaAndroidSpeechSession.kt").v("invalid SodaEvent proto");
            }
        } else {
            defpackage.txv.a.b().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechSession$RecognitionListenerImpl", "buildTranscriptionResult", 589, "SodaAndroidSpeechSession.kt").v("found neither results recognition, detected language or soda event");
        }
        return null;
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
        defpackage.txv.a.b().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechSession$RecognitionListenerImpl", "onBeginningOfSpeech", 471, "SodaAndroidSpeechSession.kt").v("onBeginningOfSpeech");
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
        aooh.f(bArr, "buffer");
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
        defpackage.txv.a.b().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechSession$RecognitionListenerImpl", "onEndOfSpeech", 479, "SodaAndroidSpeechSession.kt").v("onEndOfSpeech");
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i) {
        java.lang.String str;
        aimw aimwVarL = defpackage.txv.a.b().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechSession$RecognitionListenerImpl", "onError", 483, "SodaAndroidSpeechSession.kt");
        switch (i) {
            case 1:
                str = "SODA Error Network Timeout";
                break;
            case 2:
                str = "SODA Error Network";
                break;
            case 3:
                str = "SODA Error Audio";
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                str = "SODA Error Server";
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                str = "SODA Error Client";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                str = "SODA Error Speech Timeout";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                str = "SODA Error No Match";
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                str = "SODA Error Recognizer Busy";
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                str = "SODA Insufficient Permissions";
                break;
            default:
                str = "SODA Unknown Error";
                break;
        }
        aimwVarL.y("onError %s", str);
        b(new kgx(this.a, this, i, (aoln) null, 7));
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i, android.os.Bundle bundle) {
        aooh.f(bundle, "params");
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(android.os.Bundle bundle) {
        aooh.f(bundle, "partialResults");
        defpackage.txv.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechSession$RecognitionListenerImpl", "onPartialResults", 520, "SodaAndroidSpeechSession.kt").v("onPartialResults");
        b(new hcn(this, bundle, this.a, (aoln) null, 17));
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(android.os.Bundle bundle) {
        aooh.f(bundle, "params");
        defpackage.txv.a.b().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechSession$RecognitionListenerImpl", "onReadyForSpeech", 467, "SodaAndroidSpeechSession.kt").v("onReadyForSpeech");
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(android.os.Bundle bundle) {
        aooh.f(bundle, "results");
        defpackage.txv.a.b().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechSession$RecognitionListenerImpl", "onResults", 496, "SodaAndroidSpeechSession.kt").v("onResults");
        b(new defpackage.rjk(this, bundle, this.a, (aoln) null, 19));
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
    }
}
