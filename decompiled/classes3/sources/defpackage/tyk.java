package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tyk implements aohy {
    final /* synthetic */ defpackage.typ a;

    public tyk(defpackage.typ typVar) {
        this.a = typVar;
    }

    public final defpackage.twj a(amle amleVar) {
        defpackage.amld amldVar = amleVar.c;
        if (amldVar == null) {
            amldVar = defpackage.amld.a;
        }
        alat alatVar = (amldVar.b == 1 ? (defpackage.amkw) amldVar.c : defpackage.amkw.a).c;
        aooh.e(alatVar, "getHypothesisList(...)");
        if (!alatVar.isEmpty()) {
            java.lang.Object obj = alatVar.get(0);
            aooh.e(obj, "get(...)");
            d((java.lang.String) obj);
        }
        defpackage.uzx uzxVarCi = wsc.ci(defpackage.twj.a.m());
        uzxVarCi.E(amleVar);
        return uzxVarCi.C();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.lang.String str, defpackage.twg twgVar, aoln aolnVar) {
        defpackage.tyh tyhVar;
        defpackage.amrk amrkVar;
        if (aolnVar instanceof defpackage.tyh) {
            tyhVar = (defpackage.tyh) aolnVar;
            int i = tyhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tyhVar.c = i - Integer.MIN_VALUE;
            } else {
                tyhVar = new defpackage.tyh(this, aolnVar);
            }
        } else {
            tyhVar = new defpackage.tyh(this, aolnVar);
        }
        java.lang.Object obj = tyhVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tyhVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                defpackage.typ.a.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onError", 443, "SodaOnDeviceGrpcSession.kt").y("onError %s", str);
                defpackage.typ typVar = this.a;
                aooh.f(twgVar, "sodaErrorType");
                switch (twgVar.ordinal()) {
                    case 1:
                        amrkVar = defpackage.amrk.SODA_ERROR_LANGUAGE_UNAVAILABLE;
                        break;
                    case 2:
                        amrkVar = defpackage.amrk.SODA_ERROR_INTERRUPTED;
                        break;
                    case 3:
                        amrkVar = defpackage.amrk.SODA_ERROR_AUDIO;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        amrkVar = defpackage.amrk.SODA_ERROR_CLIENT;
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        amrkVar = defpackage.amrk.SODA_ERROR_INSUFFICIENT_PERMISSIONS;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        amrkVar = defpackage.amrk.SODA_ERROR_SERVER;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        amrkVar = defpackage.amrk.SODA_ERROR_NETWORK;
                        break;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        amrkVar = defpackage.amrk.SODA_ERROR_NETWORK_TIMEOUT;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        amrkVar = defpackage.amrk.SODA_ERROR_NO_MATCH;
                        break;
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                        amrkVar = defpackage.amrk.SODA_ERROR_RECOGNIZER_BUSY;
                        break;
                    case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                        amrkVar = defpackage.amrk.SODA_ERROR_SPEECH_TIMEOUT;
                        break;
                    case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                        amrkVar = defpackage.amrk.SODA_ERROR_INVALID_REQUEST;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                        amrkVar = defpackage.amrk.SODA_ERROR_NO_SPEECH_DETECTED;
                        break;
                    case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                        amrkVar = defpackage.amrk.SODA_ERROR_MIC_BUSY;
                        break;
                    case 15:
                        amrkVar = defpackage.amrk.SODA_ERROR_AUDIO_BUFFER_OVERFLOW;
                        break;
                    case 16:
                        amrkVar = defpackage.amrk.SODA_ERROR_SODA;
                        break;
                    case 17:
                        amrkVar = defpackage.amrk.SODA_ERROR_CANCELLED;
                        break;
                    case 18:
                        amrkVar = defpackage.amrk.SODA_ERROR_AICORE_NOT_ENABLED_RUNTIME_LIMITS;
                        break;
                    case 19:
                        amrkVar = defpackage.amrk.SODA_ERROR_GRPC_UNIMPLEMENTED;
                        break;
                    case 20:
                        amrkVar = defpackage.amrk.SODA_ERROR_GRPC_PERMISSION_DENIED;
                        break;
                    case 21:
                        amrkVar = defpackage.amrk.SODA_ERROR_GRPC_UNAVAILABLE;
                        break;
                    case 22:
                        amrkVar = defpackage.amrk.SODA_ERROR_GRPC_CANCELLED;
                        break;
                    case 23:
                        amrkVar = defpackage.amrk.SODA_ERROR_GRPC_INTERNAL;
                        break;
                    case 24:
                        amrkVar = defpackage.amrk.SODA_ERROR_GRPC_UNKNOWN;
                        break;
                    case 25:
                        amrkVar = defpackage.amrk.SODA_ERROR_AICORE_APP_QUOTA;
                        break;
                    default:
                        amrkVar = defpackage.amrk.SODA_ERROR_UNKNOWN;
                        break;
                }
                akzx akzxVar = typVar.y;
                akzxVar.u();
                amrm amrmVar = akzxVar.b;
                amrm amrmVar2 = amrm.a;
                j$.util.Objects.requireNonNull(amrkVar);
                alak alakVar = amrmVar.c;
                if (!alakVar.c()) {
                    amrmVar.c = alad.H(alakVar);
                }
                amrmVar.c.g(amrkVar.A);
                if (!typVar.s) {
                    typVar.m.a(twgVar);
                }
                tyhVar.c = 1;
                if (typVar.e(tyhVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
        } catch (java.lang.Throwable th) {
            defpackage.typ.a.d().k(th).l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onError", 454, "SodaOnDeviceGrpcSession.kt").v("Failed to clean up Soda transcriber.");
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.tyj tyjVar;
        if (aolnVar instanceof defpackage.tyj) {
            tyjVar = (defpackage.tyj) aolnVar;
            int i = tyjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tyjVar.c = i - Integer.MIN_VALUE;
            } else {
                tyjVar = new defpackage.tyj(this, aolnVar);
            }
        } else {
            tyjVar = new defpackage.tyj(this, aolnVar);
        }
        java.lang.Object obj = tyjVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tyjVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                aimz aimzVar = defpackage.typ.a;
                aimzVar.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onResults", 460, "SodaOnDeviceGrpcSession.kt").v("onResults");
                defpackage.typ typVar = this.a;
                if (typVar.s) {
                    aimzVar.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onResults", 463, "SodaOnDeviceGrpcSession.kt").v("Already interrupted, return");
                    return aojh.a;
                }
                defpackage.twh twhVar = typVar.m;
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                aooh.e(optionalEmpty, "empty(...)");
                twhVar.b(optionalEmpty);
                tyjVar.c = 1;
                if (typVar.e(tyjVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
        } catch (java.lang.Throwable th) {
            defpackage.typ.a.d().k(th).l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onResults", 474, "SodaOnDeviceGrpcSession.kt").v("Failed to clean up Soda transcriber.");
        }
        return aojh.a;
    }

    public final void d(java.lang.String str) {
        defpackage.typ typVar = this.a;
        for (java.lang.String str2 : typVar.l.l) {
            akzx akzxVar = typVar.y;
            long j = akzxVar.b.f;
            aorg aorgVar = new aorg("\\b" + str2 + "\\b");
            if (str == null) {
                aooh.i("input");
            }
            if (str.length() < 0) {
                throw new java.lang.IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str.length());
            }
            long jI = j + ((long) aooc.i(new aoqk(new defpackage.ahcm(aorgVar, str, 12), defpackage.aorf.a)));
            akzxVar.u();
            amrm amrmVar = akzxVar.b;
            amrmVar.b |= 4;
            amrmVar.f = jI;
        }
    }

    public final void e() {
        defpackage.typ.a.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onCompleted", 435, "SodaOnDeviceGrpcSession.kt").v("onCompleted");
    }

    public final void f(java.lang.Throwable th) {
        defpackage.typ.a.b().k(th).l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession$responseStreamObserver$<anonymous>", "onError", 426, "SodaOnDeviceGrpcSession.kt").v("onError");
        defpackage.typ typVar = this.a;
        typVar.h(new defpackage.rjk(this, th, typVar, (aoln) null, 20));
    }

    public final /* bridge */ /* synthetic */ void g(java.lang.Object obj) {
        defpackage.afde afdeVar = (defpackage.afde) obj;
        aooh.f(afdeVar, "recognitionResponse");
        defpackage.typ typVar = this.a;
        typVar.h(new defpackage.tyi(typVar, afdeVar, this, null));
    }
}
