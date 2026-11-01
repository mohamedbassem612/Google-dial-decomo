package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tlv extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(ajxw ajxwVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ajxwVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 15:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 16:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 17:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 18:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 19:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    public final java.lang.Object b(java.lang.Object obj) throws java.io.IOException {
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                ((defpackage.tlw) this.a).c = true;
                return aojh.a;
            case 1:
                aooc.af(obj);
                ((defpackage.tlw) this.a).b = true;
                return aojh.a;
            case 2:
                aooc.af(obj);
                return defpackage.abxl.L("STATE_SHARPIE_ENABLED", ((tkk) this.a).a() ? 1 : 0);
            case 3:
                aooc.af(obj);
                defpackage.tpf tpfVar = (defpackage.tpf) this.a;
                if (tpfVar.d != null) {
                    tpfVar.d = null;
                    ((zpz) tpfVar.c).a(aiql.z(aojh.a));
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aooc.af(obj);
                defpackage.tqr tqrVar = (defpackage.tqr) this.a;
                aosy aosyVar = tqrVar.c;
                if (aosyVar == null) {
                    tqrVar.b();
                    return java.lang.Boolean.FALSE;
                }
                if (aosyVar.x()) {
                    long jB = aazc.b() - tqrVar.e;
                    aoin aoinVar = tqrVar.b;
                    j$.time.Duration durationOfNanos = j$.time.Duration.ofNanos(jB);
                    java.lang.Object objA = aoinVar.a();
                    aooh.e(objA, "get(...)");
                    j$.time.Duration durationOfMillis = j$.time.Duration.ofMillis(((java.lang.Number) objA).longValue());
                    aooh.e(durationOfMillis, "ofMillis(...)");
                    if (durationOfNanos.compareTo(durationOfMillis) > 0) {
                        tqrVar.b();
                    }
                    tqrVar.d = (java.lang.Boolean) aosyVar.b();
                }
                java.lang.Boolean bool = tqrVar.d;
                return java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aooc.af(obj);
                tsg tsgVar = (tsg) this.a;
                tsgVar.f.unregisterNetworkCallback(tsgVar.j);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aooc.af(obj);
                ((tsj) this.a).i = false;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aooc.af(obj);
                ((tsj) this.a).i = true;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aooc.af(obj);
                return ((ajxw) this.a).c;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aooc.af(obj);
                return new java.lang.Integer(((txc) this.a).e.size());
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aooc.af(obj);
                txc txcVar = (txc) this.a;
                return new java.lang.Integer(txcVar.e.size() + txcVar.f.size());
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aooc.af(obj);
                txh txhVar = (txh) this.a;
                if (txhVar.j.x()) {
                    txhVar.j = aoov.am(txhVar.e, 0, new defpackage.txf(txhVar, (aoln) null, 0), 3);
                }
                return txhVar.j;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aooc.af(obj);
                android.os.ParcelFileDescriptor[] parcelFileDescriptorArr = ((defpackage.txv) this.a).n;
                if (parcelFileDescriptorArr != null) {
                    try {
                        parcelFileDescriptorArr[1].close();
                    } catch (java.io.IOException e) {
                        defpackage.txv.a.d().k(e).l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechSession", "closePipe$<anonymous>", 320, "SodaAndroidSpeechSession.kt").v("unable to close write end of pipe");
                    }
                    try {
                        parcelFileDescriptorArr[0].close();
                    } catch (java.io.IOException e2) {
                        defpackage.txv.a.d().k(e2).l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechSession", "closePipe$<anonymous>", 325, "SodaAndroidSpeechSession.kt").v("unable to close read end of pipe");
                    }
                    break;
                }
                defpackage.txv txvVar = (defpackage.txv) this.a;
                txvVar.n = null;
                txvVar.m = null;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aooc.af(obj);
                defpackage.txv txvVar2 = (defpackage.txv) this.a;
                android.speech.SpeechRecognizer speechRecognizer = txvVar2.l;
                if (speechRecognizer != null) {
                    defpackage.txv.a.b().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechSession", "closeResources$<anonymous>", 301, "SodaAndroidSpeechSession.kt").v("destroy recognizer");
                    speechRecognizer.destroy();
                    txvVar2.l = null;
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                aooc.af(obj);
                java.lang.Object obj2 = this.a;
                android.os.ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = android.os.ParcelFileDescriptor.createPipe();
                defpackage.txv txvVar3 = (defpackage.txv) obj2;
                txvVar3.n = parcelFileDescriptorArrCreatePipe;
                txvVar3.m = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]).getChannel();
                long fd = parcelFileDescriptorArrCreatePipe[0].getFd();
                if (fd != -1) {
                    return android.content.ContentUris.withAppendedId(android.net.Uri.parse("content://com.android.dialer.sodatranscription.impl.provider"), fd);
                }
                throw new java.lang.IllegalArgumentException("#getAudioStreamUri fileDescriptor == -1");
            case 15:
                aooc.af(obj);
                android.speech.SpeechRecognizer speechRecognizer2 = ((defpackage.txv) this.a).l;
                if (speechRecognizer2 == null) {
                    return null;
                }
                speechRecognizer2.stopListening();
                return aojh.a;
            case 16:
                aooc.af(obj);
                if (android.os.Build.VERSION.SDK_INT < 31) {
                    return java.lang.Boolean.FALSE;
                }
                try {
                    java.lang.Object obj3 = this.a;
                    android.content.pm.PackageInfo packageInfo = ((txy) obj3).b.getPackageInfo("com.google.android.tts", 0);
                    if (packageInfo == null) {
                        txy.a.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcAvailability", "isAvailable$<anonymous>", 49, "SodaOnDeviceGrpcAvailability.kt").v("Null SSBG package info, should not happen");
                        return java.lang.Boolean.FALSE;
                    }
                    java.lang.Long l = (java.lang.Long) ((txy) obj3).c.a();
                    if (ft$.ExternalSyntheticApiModelOutline0.m(packageInfo) >= l.longValue()) {
                        return java.lang.Boolean.TRUE;
                    }
                    aimw aimwVarL = txy.a.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcAvailability", "isAvailable$<anonymous>", 56, "SodaOnDeviceGrpcAvailability.kt");
                    long jM = ft$.ExternalSyntheticApiModelOutline0.m(packageInfo);
                    aooh.c(l);
                    aimwVarL.D("SSBG package info version %d lower than min version supporting gRPC API %d", jM, l.longValue());
                    return java.lang.Boolean.FALSE;
                } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
                    txy.a.d().k(e3).l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcAvailability", "isAvailable$<anonymous>", 65, "SodaOnDeviceGrpcAvailability.kt").v("SSBG not found");
                    return java.lang.Boolean.FALSE;
                }
            case 17:
                aooc.af(obj);
                tyd tydVar = (tyd) this.a;
                if (tydVar.f.x()) {
                    tydVar.f = aoov.am(tydVar.c, 0, new defpackage.txf(tydVar, (aoln) null, 5), 3);
                }
                return tydVar.f;
            case 18:
                aooc.af(obj);
                android.os.ParcelFileDescriptor[] parcelFileDescriptorArr2 = ((defpackage.typ) this.a).r;
                if (parcelFileDescriptorArr2 != null) {
                    try {
                        parcelFileDescriptorArr2[1].close();
                    } catch (java.io.IOException e4) {
                        defpackage.typ.a.d().k(e4).l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession", "closePipe$<anonymous>", 354, "SodaOnDeviceGrpcSession.kt").v("unable to close write end of pipe");
                    }
                    defpackage.typ typVar = (defpackage.typ) this.a;
                    if (!((java.lang.Boolean) typVar.o.a()).booleanValue() || !typVar.v || typVar.w) {
                        try {
                            parcelFileDescriptorArr2[0].close();
                        } catch (java.io.IOException e5) {
                            defpackage.typ.a.d().k(e5).l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession", "closePipe$<anonymous>", 364, "SodaOnDeviceGrpcSession.kt").v("unable to close read end of pipe");
                        }
                    }
                    break;
                }
                defpackage.typ typVar2 = (defpackage.typ) this.a;
                typVar2.r = null;
                typVar2.q = null;
                typVar2.i.t(typVar2.y.p());
                return aojh.a;
            case 19:
                aooc.af(obj);
                java.lang.Object obj4 = this.a;
                android.os.ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe2 = android.os.ParcelFileDescriptor.createPipe();
                defpackage.typ typVar3 = (defpackage.typ) obj4;
                typVar3.r = parcelFileDescriptorArrCreatePipe2;
                typVar3.q = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe2[1]).getChannel();
                return parcelFileDescriptorArrCreatePipe2;
            default:
                aooc.af(obj);
                aohy aohyVar = ((defpackage.typ) this.a).p;
                if (aohyVar == null) {
                    return null;
                }
                xtq xtqVarI = defpackage.afcd.i(defpackage.afcz.a.m());
                akzx akzxVarM = defpackage.afcx.a.m();
                aooh.f(akzxVarM, "builder");
                alad aladVarP = akzxVarM.p();
                aooh.e(aladVarP, "build(...)");
                defpackage.afcx afcxVar = (defpackage.afcx) aladVarP;
                aooh.f(afcxVar, "value");
                akzx akzxVar = (akzx) xtqVarI.a;
                akzxVar.u();
                defpackage.afcz afczVar = (defpackage.afcz) akzxVar.b;
                j$.util.Objects.requireNonNull(afcxVar);
                afczVar.c = afcxVar;
                afczVar.b = 2;
                aohyVar.g(xtqVarI.G());
                return aojh.a;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.tlv((defpackage.tlw) this.a, aolnVar, 0);
            case 1:
                return new defpackage.tlv((defpackage.tlw) this.a, aolnVar, 1, (byte[]) null);
            case 2:
                return new defpackage.tlv((tkk) this.a, aolnVar, 2);
            case 3:
                return new defpackage.tlv((defpackage.tpf) this.a, aolnVar, 3);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new defpackage.tlv((defpackage.tqr) this.a, aolnVar, 4);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new defpackage.tlv((tsg) this.a, aolnVar, 5);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new defpackage.tlv((tsj) this.a, aolnVar, 6);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new defpackage.tlv((tsj) this.a, aolnVar, 7, (byte[]) null);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new defpackage.tlv((ajxw) this.a, aolnVar, 8);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new defpackage.tlv((txc) this.a, aolnVar, 9);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new defpackage.tlv((txc) this.a, aolnVar, 10, (byte[]) null);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new defpackage.tlv((txh) this.a, aolnVar, 11);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new defpackage.tlv((defpackage.txv) this.a, aolnVar, 12);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new defpackage.tlv((defpackage.txv) this.a, aolnVar, 13, (byte[]) null);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new defpackage.tlv((defpackage.txv) this.a, aolnVar, 14, (char[]) null);
            case 15:
                return new defpackage.tlv((defpackage.txv) this.a, aolnVar, 15, (short[]) null);
            case 16:
                return new defpackage.tlv((txy) this.a, aolnVar, 16);
            case 17:
                return new defpackage.tlv((tyd) this.a, aolnVar, 17);
            case 18:
                return new defpackage.tlv((defpackage.typ) this.a, aolnVar, 18);
            case 19:
                return new defpackage.tlv((defpackage.typ) this.a, aolnVar, 19, (byte[]) null);
            default:
                return new defpackage.tlv((defpackage.typ) this.a, aolnVar, 20, (char[]) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(tkk tkkVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tkkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(defpackage.tlw tlwVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tlwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(defpackage.tlw tlwVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tlwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(defpackage.tpf tpfVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tpfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(defpackage.tqr tqrVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tqrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(tsg tsgVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tsgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(tsj tsjVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tsjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(tsj tsjVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tsjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(txc txcVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = txcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(txc txcVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = txcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(txh txhVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = txhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(defpackage.txv txvVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = txvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(defpackage.txv txvVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = txvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(defpackage.txv txvVar, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = txvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(defpackage.txv txvVar, aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = txvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(txy txyVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = txyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(tyd tydVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tydVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(defpackage.typ typVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = typVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(defpackage.typ typVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = typVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlv(defpackage.typ typVar, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = typVar;
    }
}
