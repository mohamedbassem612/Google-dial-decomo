package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class tyi extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.typ b;
    final /* synthetic */ defpackage.afde c;
    final /* synthetic */ defpackage.tyk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyi(defpackage.typ typVar, defpackage.afde afdeVar, defpackage.tyk tykVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = typVar;
        this.c = afdeVar;
        this.d = tykVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        int i;
        java.lang.String str;
        defpackage.twg twgVar;
        defpackage.twj twjVarC;
        defpackage.twj twjVarC2;
        aolu aoluVar = aolu.a;
        if (this.a != 0) {
            aooc.af(obj);
        } else {
            aooc.af(obj);
            defpackage.typ typVar = this.b;
            if (((java.lang.Boolean) typVar.o.a()).booleanValue()) {
                typVar.w = true;
            }
            defpackage.afde afdeVar = this.c;
            int i2 = afdeVar.b;
            int i3 = 3;
            switch (i2) {
                case 0:
                    i = 7;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    i = 4;
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    i = 5;
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    i = 6;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i == 0) {
                throw null;
            }
            int i4 = i - 1;
            if (i4 == 0) {
                int iAM = a.aM((i2 == 1 ? (defpackage.afdd) afdeVar.c : defpackage.afdd.a).b);
                if (iAM == 0) {
                    iAM = 1;
                }
                int i5 = iAM - 1;
                if (i5 == 4) {
                    defpackage.tyk tykVar = this.d;
                    this.a = 2;
                    if (tykVar.c(this) == aoluVar) {
                        return aoluVar;
                    }
                } else if (i5 == 5) {
                    defpackage.tyk tykVar2 = this.d;
                    int iO = aehj.O((afdeVar.b == 1 ? (defpackage.afdd) afdeVar.c : defpackage.afdd.a).c);
                    if (iO == 0) {
                        iO = 1;
                    }
                    this.a = 1;
                    anqt anqtVar = anqt.a;
                    int i6 = iO - 1;
                    switch (i6) {
                        case 1:
                            str = "SODA Error Client";
                            break;
                        case 2:
                            str = "SODA Error No Match";
                            break;
                        case 3:
                            str = "SODA Error Network";
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            str = "SODA Insufficient Permissions";
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        default:
                            str = "SODA Unknown Error";
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            str = "SODA Error Audio";
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            str = "SODA Error Server";
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            str = "SODA Error Recognizer Busy";
                            break;
                        case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                            str = "SODA Error AICore Not Enabled Runtime Limits";
                            break;
                        case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                            str = "SODA Error AICore App Quota";
                            break;
                        case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                            str = "SODA Error S3";
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                            str = "SODA Error AICore";
                            break;
                    }
                    switch (i6) {
                        case 1:
                        case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                        case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                            twgVar = defpackage.twg.e;
                            break;
                        case 2:
                            twgVar = defpackage.twg.j;
                            break;
                        case 3:
                            twgVar = defpackage.twg.h;
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            twgVar = defpackage.twg.f;
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        default:
                            twgVar = defpackage.twg.a;
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            twgVar = defpackage.twg.d;
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                            twgVar = defpackage.twg.g;
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            twgVar = defpackage.twg.k;
                            break;
                    }
                    java.lang.Object objB = tykVar2.b(str, twgVar, this);
                    if (objB != aoluVar) {
                        objB = aojh.a;
                    }
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                }
            } else if (i4 == 1) {
                defpackage.tyk tykVar3 = this.d;
                defpackage.afdc afdcVar = i2 == 2 ? (defpackage.afdc) afdeVar.c : defpackage.afdc.a;
                aooh.e(afdcVar, "getPartialRecognitionEvent(...)");
                aimz aimzVar = defpackage.typ.a;
                aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onPartialResults", 503, "SodaOnDeviceGrpcSession.kt").v("onPartialResults");
                defpackage.typ typVar2 = tykVar3.a;
                if (typVar2.s) {
                    aimzVar.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onPartialResults", 506, "SodaOnDeviceGrpcSession.kt").v("Already interrupted, return");
                } else {
                    java.lang.String str2 = afdcVar.b;
                    aooh.e(str2, "getStable(...)");
                    if (str2.length() == 0) {
                        twjVarC = null;
                    } else {
                        defpackage.uzx uzxVarCi = wsc.ci(defpackage.twj.a.m());
                        java.lang.String str3 = afdcVar.b;
                        aooh.e(str3, "getStable(...)");
                        uzxVarCi.F(str3);
                        twjVarC = uzxVarCi.C();
                    }
                    if (twjVarC == null) {
                        aimzVar.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onPartialResults", 512, "SodaOnDeviceGrpcSession.kt").v("builtResult is null, return");
                    } else if (typVar2.l.e) {
                        aimzVar.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onPartialResults", 517, "SodaOnDeviceGrpcSession.kt").v("use raw soda event, return");
                    } else {
                        typVar2.m.e(twjVarC);
                    }
                }
            } else if (i4 == 2) {
                defpackage.tyk tykVar4 = this.d;
                defpackage.afda afdaVar = i2 == 3 ? (defpackage.afda) afdeVar.c : defpackage.afda.a;
                aooh.e(afdaVar, "getFinalRecognitionEvent(...)");
                aimz aimzVar2 = defpackage.typ.a;
                aimzVar2.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onSegmentResults", 479, "SodaOnDeviceGrpcSession.kt").v("onSegmentResults");
                defpackage.typ typVar3 = tykVar4.a;
                if (typVar3.s) {
                    aimzVar2.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onSegmentResults", 482, "SodaOnDeviceGrpcSession.kt").v("Already interrupted, return");
                } else {
                    alat alatVar = afdaVar.b;
                    aooh.e(alatVar, "getHypothesisList(...)");
                    if (alatVar.isEmpty()) {
                        twjVarC2 = null;
                    } else {
                        java.lang.String str4 = (java.lang.String) alatVar.get(0);
                        aooh.c(str4);
                        tykVar4.d(str4);
                        defpackage.uzx uzxVarCi2 = wsc.ci(defpackage.twj.a.m());
                        uzxVarCi2.F(str4);
                        twjVarC2 = uzxVarCi2.C();
                    }
                    if (twjVarC2 == null) {
                        aimzVar2.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onSegmentResults", 488, "SodaOnDeviceGrpcSession.kt").v("builtResult is null, return");
                    } else if (typVar3.l.e) {
                        aimzVar2.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onSegmentResults", 493, "SodaOnDeviceGrpcSession.kt").v("use raw soda event, return");
                    } else {
                        typVar3.m.f(twjVarC2);
                    }
                }
            } else if (i4 == 3) {
                defpackage.tyk tykVar5 = this.d;
                defpackage.afdb afdbVar = i2 == 4 ? (defpackage.afdb) afdeVar.c : defpackage.afdb.a;
                aooh.e(afdbVar, "getLanguageDetectionEvent(...)");
                java.lang.String str5 = afdbVar.b;
                aooh.e(str5, "getDetectedLanguage(...)");
                aimz aimzVar3 = defpackage.typ.a;
                aimzVar3.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onLanguageDetected", 526, "SodaOnDeviceGrpcSession.kt").y("onLanguageDetected %s", str5);
                defpackage.typ typVar4 = tykVar5.a;
                if (typVar4.s) {
                    aimzVar3.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onLanguageDetected", 529, "SodaOnDeviceGrpcSession.kt").v("Already interrupted, return");
                } else {
                    defpackage.twh twhVar = typVar4.m;
                    akzx akzxVarM = defpackage.tvx.a.m();
                    aooh.f(akzxVarM, "builder");
                    int iAN = a.aN(afdbVar.c);
                    if (iAN == 0) {
                        iAN = 1;
                    }
                    anqt anqtVar2 = anqt.a;
                    int i7 = iAN - 1;
                    if (i7 == 0) {
                        i3 = 1;
                    } else if (i7 == 1) {
                        i3 = 2;
                    } else if (i7 != 2) {
                        i3 = 4;
                    }
                    akzxVarM.u();
                    defpackage.tvx tvxVar = (defpackage.tvx) akzxVarM.b;
                    tvxVar.d = i3 - 1;
                    tvxVar.b |= 2;
                    aooh.f(str5, "value");
                    akzxVarM.u();
                    defpackage.tvx tvxVar2 = (defpackage.tvx) akzxVarM.b;
                    j$.util.Objects.requireNonNull(str5);
                    tvxVar2.b |= 1;
                    tvxVar2.c = str5;
                    alad aladVarP = akzxVarM.p();
                    aooh.e(aladVarP, "build(...)");
                    twhVar.c((defpackage.tvx) aladVarP);
                }
            } else if (i4 == 5) {
                defpackage.tyk tykVar6 = this.d;
                amle amleVar = i2 == 6 ? (amle) afdeVar.c : amle.a;
                aooh.e(amleVar, "getSodaEvent(...)");
                if ((amleVar.b & 2) != 0) {
                    defpackage.amld amldVar = amleVar.c;
                    if (amldVar == null) {
                        amldVar = defpackage.amld.a;
                    }
                    if (amldVar.b == 1) {
                        defpackage.typ typVar5 = tykVar6.a;
                        typVar5.m.f(tykVar6.a(amleVar));
                        defpackage.amld amldVar2 = amleVar.c;
                        if (amldVar2 == null) {
                            amldVar2 = defpackage.amld.a;
                        }
                        defpackage.amkw amkwVar = amldVar2.b == 1 ? (defpackage.amkw) amldVar2.c : defpackage.amkw.a;
                        aooh.e(amkwVar, "getFinalResult(...)");
                        akzx akzxVar = typVar5.y;
                        long j = akzxVar.b.d + 1;
                        akzxVar.u();
                        amrm amrmVar = akzxVar.b;
                        amrmVar.b |= 1;
                        amrmVar.d = j;
                        if ((amkwVar.b & 32768) != 0) {
                            defpackage.amkt amktVar = amkwVar.f;
                            if (amktVar == null) {
                                amktVar = defpackage.amkt.a;
                            }
                            aooh.e(amktVar, "getAicoreInfo(...)");
                            defpackage.amrl amrlVar = akzxVar.b.e;
                            if (amrlVar == null) {
                                amrlVar = defpackage.amrl.a;
                            }
                            aooh.e(amrlVar, "getAudioGeminiMetrics(...)");
                            akzx akzxVarM2 = defpackage.amrl.a.m();
                            aooh.f(akzxVarM2, "builder");
                            if (amktVar.b) {
                                long j2 = amrlVar.c + 1;
                                akzxVarM2.u();
                                defpackage.amrl amrlVar2 = (defpackage.amrl) akzxVarM2.b;
                                amrlVar2.b |= 1;
                                amrlVar2.c = j2;
                            }
                            if (amktVar.c) {
                                long j3 = amrlVar.d + 1;
                                akzxVarM2.u();
                                defpackage.amrl amrlVar3 = (defpackage.amrl) akzxVarM2.b;
                                amrlVar3.b |= 2;
                                amrlVar3.d = j3;
                            }
                            if (amktVar.d) {
                                long j4 = amrlVar.e + 1;
                                akzxVarM2.u();
                                defpackage.amrl amrlVar4 = (defpackage.amrl) akzxVarM2.b;
                                amrlVar4.b |= 4;
                                amrlVar4.e = j4;
                            }
                            float f = amrlVar.f;
                            long j5 = amrlVar.g;
                            float f2 = f * j5;
                            float f3 = amktVar.e;
                            long j6 = amktVar.f;
                            long j7 = j5 + j6;
                            float f4 = j7 == 0 ? 0.0f : (f2 + (f3 * j6)) / j7;
                            akzxVarM2.u();
                            defpackage.amrl amrlVar5 = (defpackage.amrl) akzxVarM2.b;
                            amrlVar5.b |= 8;
                            amrlVar5.f = f4;
                            akzxVarM2.u();
                            defpackage.amrl amrlVar6 = (defpackage.amrl) akzxVarM2.b;
                            amrlVar6.b |= 16;
                            amrlVar6.g = j7;
                            long j8 = amrlVar.h + amktVar.g;
                            akzxVarM2.u();
                            defpackage.amrl amrlVar7 = (defpackage.amrl) akzxVarM2.b;
                            amrlVar7.b |= 32;
                            amrlVar7.h = j8;
                            long j9 = amrlVar.i + amktVar.h + amktVar.i;
                            akzxVarM2.u();
                            defpackage.amrl amrlVar8 = (defpackage.amrl) akzxVarM2.b;
                            amrlVar8.b |= 64;
                            amrlVar8.i = j9;
                            alad aladVarP2 = akzxVarM2.p();
                            aooh.e(aladVarP2, "build(...)");
                            defpackage.amrl amrlVar9 = (defpackage.amrl) aladVarP2;
                            akzxVar.u();
                            amrm amrmVar2 = akzxVar.b;
                            j$.util.Objects.requireNonNull(amrlVar9);
                            amrmVar2.e = amrlVar9;
                            amrmVar2.b |= 2;
                        }
                    } else {
                        defpackage.amld amldVar3 = amleVar.c;
                        if (amldVar3 == null) {
                            amldVar3 = defpackage.amld.a;
                        }
                        if (amldVar3.b == 2) {
                            tykVar6.a.m.e(tykVar6.a(amleVar));
                        } else {
                            defpackage.typ.a.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onSodaEvent", 550, "SodaOnDeviceGrpcSession.kt").v("other SODA event with recognition");
                            tykVar6.a.m.d(amleVar);
                        }
                    }
                } else {
                    defpackage.typ.a.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onSodaEvent", 554, "SodaOnDeviceGrpcSession.kt").v("other SODA event without recognition");
                    tykVar6.a.m.d(amleVar);
                }
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.tyi(this.b, this.c, this.d, aolnVar);
    }
}
