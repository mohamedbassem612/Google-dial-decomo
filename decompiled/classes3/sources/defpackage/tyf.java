package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tyf extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(defpackage.uyg uygVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = uygVar;
        this.a = "android.permission.READ_PHONE_STATE";
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

    /* JADX WARN: Type inference failed for: r10v75, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v78, types: [aoln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v79, types: [aoln, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v82, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, twh] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object b(java.lang.Object obj) throws java.io.IOException {
        java.lang.String strS;
        android.content.pm.PackageInfo packageInfoA;
        boolean z;
        boolean z2 = false;
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                ((defpackage.typ) this.a).m = this.b;
                return aojh.a;
            case 1:
                aooc.af(obj);
                defpackage.txv txvVar = (defpackage.txv) this.b;
                if (txvVar.o || txvVar.p) {
                    defpackage.txv.a.b().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechSession", "addData$<anonymous>", 339, "SodaAndroidSpeechSession.kt").v("the session is interrupted or stop, can't add data");
                    return aojh.a;
                }
                java.nio.channels.FileChannel fileChannel = txvVar.m;
                if (fileChannel != null) {
                    akzc akzcVar = (akzc) this.a;
                    byte[] bArr = new byte[akzcVar.D().length];
                    int i = akzcVar.h().read(bArr);
                    if (i > 0) {
                        java.nio.ByteBuffer byteBufferPut = java.nio.ByteBuffer.allocateDirect(i).put(bArr, 0, i);
                        aooh.e(byteBufferPut, "put(...)");
                        byteBufferPut.flip();
                        fileChannel.write(byteBufferPut);
                    }
                }
                return aojh.a;
            case 2:
                aooc.af(obj);
                defpackage.typ typVar = (defpackage.typ) this.b;
                if (typVar.s) {
                    defpackage.typ.a.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession", "addData$<anonymous>", 708, "SodaOnDeviceGrpcSession.kt").v("the session is interrupted, can't add data");
                    return aojh.a;
                }
                if (typVar.t) {
                    defpackage.typ.a.b().l("com/android/dialer/sodatranscription/impl/ondevicegrpc/SodaOnDeviceGrpcSession", "addData$<anonymous>", 712, "SodaOnDeviceGrpcSession.kt").v("the session is completed, can't add data");
                    return aojh.a;
                }
                java.nio.channels.FileChannel fileChannel2 = typVar.q;
                if (fileChannel2 != null) {
                    akzc akzcVar2 = (akzc) this.a;
                    byte[] bArr2 = new byte[akzcVar2.D().length];
                    int i2 = akzcVar2.h().read(bArr2);
                    if (i2 > 0) {
                        java.nio.ByteBuffer byteBufferPut2 = java.nio.ByteBuffer.allocateDirect(i2).put(bArr2, 0, i2);
                        aooh.e(byteBufferPut2, "put(...)");
                        byteBufferPut2.flip();
                        fileChannel2.write(byteBufferPut2);
                    }
                }
                return aojh.a;
            case 3:
                aooc.af(obj);
                return ((umx) this.b).e.d((java.util.List) this.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aooc.af(obj);
                j$.util.Optional optional = (j$.util.Optional) this.a;
                optional.isPresent();
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) optional.orElseThrow();
                try {
                    int i3 = android.os.Build.VERSION.SDK_INT;
                    java.lang.Object obj2 = this.b;
                    if (i3 >= 33) {
                        okj okjVar = ((defpackage.vjm) obj2).d;
                        aooh.c(phoneAccountHandle);
                        strS = okjVar.m(okjVar.b(phoneAccountHandle));
                    } else {
                        strS = ((defpackage.vjm) obj2).e.i(phoneAccountHandle).S();
                    }
                    java.lang.String str = strS;
                    if (android.text.TextUtils.isEmpty(str)) {
                        throw new java.lang.IllegalArgumentException("phone number is empty");
                    }
                    aooh.c(str);
                    if (aoov.ad(str, "+1")) {
                        java.lang.String strSubstring = str.substring(2);
                        aooh.e(strSubstring, "substring(...)");
                        return strSubstring;
                    }
                    if (!aoov.ad(str, "1")) {
                        return str;
                    }
                    java.lang.String strSubstring2 = str.substring(1);
                    aooh.e(strSubstring2, "substring(...)");
                    return strSubstring2;
                } catch (java.lang.SecurityException e) {
                    throw new java.lang.AssertionError("failed to get mailbox number", e);
                }
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(((defpackage.vvk) this.a).c.c((android.telecom.PhoneAccountHandle) this.b) == 2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(((defpackage.wjt) this.b).b.add(this.a));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aooc.af(obj);
                java.lang.Object obj3 = this.a;
                apdi apdiVar = amgq.g;
                alaa alaaVar = (alaa) obj3;
                alaaVar.c(apdiVar);
                akzs akzsVar = alaaVar.n;
                alac alacVar = (alac) apdiVar.a;
                if (akzsVar.l(alacVar)) {
                    alaaVar.c(apdiVar);
                    java.lang.Object objJ = alaaVar.n.j(alacVar);
                    if (objJ == null) {
                        objJ = apdiVar.b;
                    } else {
                        apdiVar.c(objJ);
                    }
                    aooh.e(objJ, "getExtension(...)");
                    final amgq amgqVar = (amgq) objJ;
                    int i4 = amgqVar.c;
                    if (i4 == 7) {
                        java.lang.Object obj4 = this.b;
                        amgo amgoVar = i4 == 7 ? (amgo) amgqVar.d : amgo.a;
                        java.util.List list = ((defpackage.wjt) obj4).c;
                        aooh.e(amgoVar, "getTranscriptionModeUpdate(...)");
                        list.add(amgoVar);
                    }
                    defpackage.wjt wjtVar = (defpackage.wjt) this.b;
                    wjtVar.d = amgqVar;
                    final defpackage.wle wleVar = wjtVar.e;
                    if (wleVar.d()) {
                        agsm.i(1095, ahvr.E(new java.lang.Runnable() { // from class: wld
                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Code duplicated, block: B:101:0x03f0  */
                            /* JADX WARN: Code duplicated, block: B:104:0x03f6  */
                            /* JADX WARN: Code duplicated, block: B:108:0x0404  */
                            /* JADX WARN: Code duplicated, block: B:110:0x044d A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:111:0x044f  */
                            /* JADX WARN: Code duplicated, block: B:116:0x0458 A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:123:0x048c  */
                            /* JADX WARN: Code duplicated, block: B:124:0x0491  */
                            /* JADX WARN: Code duplicated, block: B:127:0x049b  */
                            /* JADX WARN: Code duplicated, block: B:129:0x049e  */
                            /* JADX WARN: Code duplicated, block: B:133:0x04db  */
                            /* JADX WARN: Code duplicated, block: B:134:0x04e0  */
                            /* JADX WARN: Code duplicated, block: B:137:0x04e6  */
                            /* JADX WARN: Code duplicated, block: B:140:0x0528  */
                            /* JADX WARN: Code duplicated, block: B:145:0x0572  */
                            /* JADX WARN: Code duplicated, block: B:146:0x0577  */
                            /* JADX WARN: Code duplicated, block: B:149:0x057d  */
                            /* JADX WARN: Code duplicated, block: B:152:0x05c8  */
                            /* JADX WARN: Code duplicated, block: B:155:0x05cd A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:156:0x05cf A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:157:0x05d1  */
                            /* JADX WARN: Code duplicated, block: B:160:0x05db  */
                            /* JADX WARN: Code duplicated, block: B:161:0x05dd  */
                            /* JADX WARN: Code duplicated, block: B:164:0x0606  */
                            /* JADX WARN: Code duplicated, block: B:167:0x0615  */
                            /* JADX WARN: Code duplicated, block: B:170:0x061b  */
                            /* JADX WARN: Code duplicated, block: B:173:0x065b  */
                            /* JADX WARN: Code duplicated, block: B:175:0x066b A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:176:0x066d  */
                            /* JADX WARN: Code duplicated, block: B:177:0x0672  */
                            /* JADX WARN: Code duplicated, block: B:180:0x0678  */
                            /* JADX WARN: Code duplicated, block: B:183:0x0680  */
                            /* JADX WARN: Code duplicated, block: B:188:0x0695  */
                            /* JADX WARN: Code duplicated, block: B:191:0x069b  */
                            /* JADX WARN: Code duplicated, block: B:194:0x06a4  */
                            /* JADX WARN: Code duplicated, block: B:196:0x06af  */
                            /* JADX WARN: Code duplicated, block: B:197:0x06b4  */
                            /* JADX WARN: Code duplicated, block: B:200:0x06ba  */
                            /* JADX WARN: Code duplicated, block: B:203:0x06c2  */
                            /* JADX WARN: Code duplicated, block: B:210:0x06de  */
                            /* JADX WARN: Code duplicated, block: B:213:0x06e3 A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:214:0x06e5  */
                            /* JADX WARN: Code duplicated, block: B:215:0x0723  */
                            /* JADX WARN: Code duplicated, block: B:216:0x075f  */
                            /* JADX WARN: Code duplicated, block: B:219:0x07d5  */
                            /* JADX WARN: Code duplicated, block: B:223:0x07e8  */
                            /* JADX WARN: Code duplicated, block: B:224:0x07ed  */
                            /* JADX WARN: Code duplicated, block: B:227:0x07f3  */
                            /* JADX WARN: Code duplicated, block: B:230:0x083b  */
                            /* JADX WARN: Code duplicated, block: B:235:0x0874  */
                            /* JADX WARN: Code duplicated, block: B:238:0x08ae  */
                            /* JADX WARN: Code duplicated, block: B:244:0x086e A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:245:0x07e2 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:246:0x056e A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:247:0x0552 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:248:0x04d7 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:249:0x0486 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:250:0x0471 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:251:0x045d A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:252:0x045a A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:253:0x0455 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:254:0x0453 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:255:0x05d3 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:96:0x03e3  */
                            /* JADX WARN: Code duplicated, block: B:99:0x03ec  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5;
                                aift aiftVar;
                                amfv amfvVar;
                                java.lang.String str2;
                                aify aifyVarH;
                                defpackage.wog wogVar;
                                alat alatVar;
                                amfv amfvVar2;
                                amfu amfuVar;
                                java.util.Iterator it;
                                amft amftVar;
                                akzx akzxVarM;
                                int i6;
                                int iE;
                                int i7;
                                amfp amfpVar;
                                amfy amfyVar;
                                defpackage.wnc wncVar;
                                alat alatVar2;
                                java.lang.String str3;
                                amgf amgfVar;
                                amfy amfyVar2;
                                defpackage.wng wngVar;
                                alat alatVar3;
                                amgd amgdVar;
                                int iAQ;
                                amgc amgcVar;
                                amfy amfyVar3;
                                int iAN;
                                int i8;
                                int i9;
                                defpackage.wnb wnbVar;
                                alat alatVar4;
                                amfv amfvVar3;
                                amfu amfuVar2;
                                alat alatVar5;
                                int iIndexOf;
                                akzx akzxVarM2;
                                boolean zNoneMatch;
                                int i10;
                                boolean z3;
                                boolean zNoneMatch2;
                                boolean z4;
                                int i11;
                                boolean z5;
                                java.util.Iterator it2;
                                boolean z6;
                                defpackage.wna wnaVar;
                                amgc amgcVar2;
                                amfy amfyVar4;
                                amft amftVar2;
                                int i12;
                                boolean z7;
                                amgc amgcVar3;
                                amfy amfyVar5;
                                defpackage.wle wleVar2 = wleVar;
                                j$.util.Optional optional2 = wleVar2.k;
                                defpackage.vxc vxcVar = new defpackage.vxc(wleVar2, 19);
                                int i13 = 1;
                                if (true == optional2.isPresent()) {
                                    java.lang.Object obj5 = optional2.get();
                                    defpackage.wle wleVar3 = (defpackage.wle) vxcVar.a;
                                    defpackage.wjb wjbVar = wleVar3.h;
                                    agsm.i(1065, ahvr.F(new defpackage.wja(wjbVar, (amgo) obj5, wleVar3.f, 1), wjbVar.a), "failed to track post transcription mode update", new java.lang.Object[0]);
                                }
                                amgq amgqVar2 = amgqVar;
                                int i14 = amgqVar2.c;
                                int i15 = 6;
                                int i16 = 3;
                                int i17 = 2;
                                if (i14 != 0) {
                                    switch (i14) {
                                        case 2:
                                            i5 = 1;
                                            break;
                                        case 3:
                                            i5 = 2;
                                            break;
                                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                            i5 = 3;
                                            break;
                                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                            i5 = 4;
                                            break;
                                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                            i5 = 5;
                                            break;
                                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                            i5 = 6;
                                            break;
                                        default:
                                            i5 = 0;
                                            break;
                                    }
                                } else {
                                    i5 = 7;
                                }
                                if (i5 == 0) {
                                    throw null;
                                }
                                switch (i5 - 1) {
                                    case 0:
                                        amgk amgkVar = i14 == 2 ? (amgk) amgqVar2.d : amgk.a;
                                        ahvr.bN(1 == (amgkVar.b & 1), "human agent detection with no status");
                                        int iAQ2 = a.aQ(amgkVar.c);
                                        if (iAQ2 == 0) {
                                            iAQ2 = 1;
                                        }
                                        int i18 = iAQ2 - 1;
                                        if (i18 == 0) {
                                            throw new java.lang.IllegalArgumentException("human agent detection with unknown status");
                                        }
                                        if (i18 != 1) {
                                            defpackage.wle.a.b().l("com/android/dialer/xatu/impl/service/XatuInterpreter", "handleHumanAgentDetection", 262, "XatuInterpreter.java").v("connecting to agent");
                                            defpackage.abtr abtrVar = wleVar2.l;
                                            akzx akzxVarM3 = defpackage.wor.a.m();
                                            defpackage.wnw wnwVar = defpackage.wnw.a;
                                            akzxVarM3.u();
                                            defpackage.wor worVar = (defpackage.wor) akzxVarM3.b;
                                            j$.util.Objects.requireNonNull(wnwVar);
                                            worVar.c = wnwVar;
                                            worVar.b = 23;
                                            agsm.i(1097, abtrVar.o((defpackage.wor) akzxVarM3.p()), "failed to show connecting to human agent prompt", new java.lang.Object[0]);
                                            wleVar2.g.b(wleVar2.e, 10);
                                        } else {
                                            defpackage.wle.a.b().l("com/android/dialer/xatu/impl/service/XatuInterpreter", "handleHumanAgentDetection", 257, "XatuInterpreter.java").v("agent answered call");
                                            defpackage.abtr abtrVar2 = wleVar2.l;
                                            akzx akzxVarM4 = defpackage.wor.a.m();
                                            defpackage.wny wnyVar = defpackage.wny.a;
                                            akzxVarM4.u();
                                            defpackage.wor worVar2 = (defpackage.wor) akzxVarM4.b;
                                            j$.util.Objects.requireNonNull(wnyVar);
                                            worVar2.c = wnyVar;
                                            worVar2.b = 22;
                                            agsm.i(1098, abtrVar2.o((defpackage.wor) akzxVarM4.p()), "failed to show human agent detected prompt", new java.lang.Object[0]);
                                            wleVar2.g.b(wleVar2.e, 11);
                                        }
                                        aimz aimzVar = defpackage.wle.a;
                                        aimzVar.b().l("com/android/dialer/xatu/impl/service/XatuInterpreter", "handleHumanAgentDetection", 267, "XatuInterpreter.java").v("closing xatu");
                                        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                                        defpackage.wre wreVar = defpackage.wre.AGENT_DETECTED;
                                        if ((amgkVar.b & 2) != 0) {
                                            akzm akzmVar = amgkVar.d;
                                            if (akzmVar == null) {
                                                akzmVar = akzm.a;
                                            }
                                            optionalEmpty = j$.util.Optional.of(java.lang.Integer.valueOf((int) aldf.a(akzmVar)));
                                        } else {
                                            a.bI(aimzVar.d(), "agent detected but agent online duration missing", "com/android/dialer/xatu/impl/service/XatuInterpreter", "handleHumanAgentDetection", (char) 277, "XatuInterpreter.java", zct.b);
                                        }
                                        defpackage.wky wkyVar = (defpackage.wky) wleVar2.d.a();
                                        defpackage.wkx wkxVar = new defpackage.wkx(wreVar, optionalEmpty);
                                        a.bI(defpackage.wky.a.b(), "enter", "com/android/dialer/xatu/impl/service/XatuController", "closeWithDelay", (char) 305, "XatuController.java", zct.a);
                                        agsm.i(1073, wkyVar.d(wkxVar), "failed to stop session", new java.lang.Object[0]);
                                        agsm.i(1074, wkyVar.g.c(ahqx.i(new defpackage.vug(wkyVar, 9)), ((java.lang.Long) wkyVar.l.a()).longValue(), java.util.concurrent.TimeUnit.SECONDS), "failed to close ui after delay", new java.lang.Object[0]);
                                        wleVar2.k = j$.util.Optional.empty();
                                        aiftVar = new aift(4);
                                        amfvVar = amgqVar2.e;
                                        if (amfvVar == null) {
                                            amfvVar = amfv.a;
                                        }
                                        str2 = "XatuInterpreter.java";
                                        if ((amfvVar.b & 1) != 0) {
                                            amfvVar2 = amgqVar2.e;
                                            if (amfvVar2 == null) {
                                                amfvVar2 = amfv.a;
                                            }
                                            amfuVar = amfvVar2.c;
                                            if (amfuVar == null) {
                                                amfuVar = amfu.a;
                                            }
                                            it = amfuVar.b.iterator();
                                            while (it.hasNext()) {
                                                amftVar = (amft) it.next();
                                                akzxVarM = defpackage.wmz.a.m();
                                                long j = amftVar.e;
                                                akzxVarM.u();
                                                defpackage.wmz wmzVar = (defpackage.wmz) akzxVarM.b;
                                                wmzVar.b |= i13;
                                                wmzVar.e = j;
                                                long j2 = amftVar.g;
                                                akzxVarM.u();
                                                defpackage.wmz wmzVar2 = (defpackage.wmz) akzxVarM.b;
                                                wmzVar2.b |= i17;
                                                wmzVar2.f = j2;
                                                int i19 = amftVar.h;
                                                akzxVarM.u();
                                                defpackage.wmz wmzVar3 = (defpackage.wmz) akzxVarM.b;
                                                wmzVar3.b |= 4;
                                                wmzVar3.g = i19;
                                                i6 = amftVar.c;
                                                iE = amjk.e(i6);
                                                i7 = iE - 1;
                                                if (iE != 0) {
                                                    throw null;
                                                }
                                                if (i7 != 0) {
                                                    java.util.Iterator it3 = it;
                                                    java.lang.String str4 = str2;
                                                    if (i6 == i13) {
                                                        amfpVar = (amfp) amftVar.d;
                                                    } else {
                                                        amfpVar = amfp.a;
                                                    }
                                                    amfyVar = amfpVar.d;
                                                    if (amfyVar == null) {
                                                        amfyVar = amfy.a;
                                                    }
                                                    akzx akzxVarM5 = defpackage.wnc.a.m();
                                                    java.lang.String str5 = amfyVar.c;
                                                    akzxVarM5.u();
                                                    defpackage.wnc wncVar2 = (defpackage.wnc) akzxVarM5.b;
                                                    j$.util.Objects.requireNonNull(str5);
                                                    wncVar2.b |= 1;
                                                    wncVar2.c = str5;
                                                    boolean zC = defpackage.wle.c(amfyVar);
                                                    akzxVarM5.u();
                                                    defpackage.wnc wncVar3 = (defpackage.wnc) akzxVarM5.b;
                                                    wncVar3.b |= 2;
                                                    wncVar3.d = zC;
                                                    aify aifyVarA = defpackage.wle.a(amfyVar.d);
                                                    akzxVarM5.u();
                                                    wncVar = (defpackage.wnc) akzxVarM5.b;
                                                    alatVar2 = wncVar.e;
                                                    if (!alatVar2.c()) {
                                                        wncVar.e = alad.J(alatVar2);
                                                    }
                                                    akyl.i(aifyVarA, wncVar.e);
                                                    defpackage.wnc wncVar4 = (defpackage.wnc) akzxVarM5.p();
                                                    akzxVarM.u();
                                                    defpackage.wmz wmzVar4 = (defpackage.wmz) akzxVarM.b;
                                                    j$.util.Objects.requireNonNull(wncVar4);
                                                    wmzVar4.d = wncVar4;
                                                    wmzVar4.c = 2;
                                                    aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                    it = it3;
                                                    str2 = str4;
                                                    i13 = 1;
                                                } else if (i7 != i13) {
                                                    java.lang.String str6 = str2;
                                                    if (i6 == i17) {
                                                        amgcVar = (amgc) amftVar.d;
                                                    } else {
                                                        amgcVar = amgc.a;
                                                    }
                                                    amfyVar3 = amgcVar.e;
                                                    if (amfyVar3 == null) {
                                                        amfyVar3 = amfy.a;
                                                    }
                                                    akzx akzxVarM6 = defpackage.wnb.a.m();
                                                    java.lang.String str7 = amfyVar3.c;
                                                    akzxVarM6.u();
                                                    defpackage.wnb wnbVar2 = (defpackage.wnb) akzxVarM6.b;
                                                    j$.util.Objects.requireNonNull(str7);
                                                    wnbVar2.b |= i13;
                                                    wnbVar2.c = str7;
                                                    boolean zC2 = defpackage.wle.c(amfyVar3);
                                                    akzxVarM6.u();
                                                    defpackage.wnb wnbVar3 = (defpackage.wnb) akzxVarM6.b;
                                                    wnbVar3.b |= i17;
                                                    wnbVar3.d = zC2;
                                                    java.lang.String str8 = amgcVar.c;
                                                    akzxVarM6.u();
                                                    defpackage.wnb wnbVar4 = (defpackage.wnb) akzxVarM6.b;
                                                    j$.util.Objects.requireNonNull(str8);
                                                    wnbVar4.b |= 8;
                                                    wnbVar4.f = str8;
                                                    iAN = a.aN(amgcVar.g);
                                                    if (iAN == 0) {
                                                        iAN = i13;
                                                    }
                                                    i8 = iAN - 1;
                                                    if (i8 != i13) {
                                                        i9 = 4;
                                                    } else if (i8 != i17) {
                                                        i9 = i17;
                                                    } else {
                                                        if (i8 == i16) {
                                                            throw new java.lang.IllegalStateException("invalid option state");
                                                        }
                                                        i9 = i16;
                                                    }
                                                    akzxVarM6.u();
                                                    defpackage.wnb wnbVar5 = (defpackage.wnb) akzxVarM6.b;
                                                    wnbVar5.e = i9 - 1;
                                                    wnbVar5.b |= 4;
                                                    aify aifyVarA2 = defpackage.wle.a(amfyVar3.d);
                                                    akzxVarM6.u();
                                                    wnbVar = (defpackage.wnb) akzxVarM6.b;
                                                    alatVar4 = wnbVar.g;
                                                    if (!alatVar4.c()) {
                                                        wnbVar.g = alad.J(alatVar4);
                                                    }
                                                    akyl.i(aifyVarA2, wnbVar.g);
                                                    amfvVar3 = amgqVar2.e;
                                                    if (amfvVar3 == null) {
                                                        amfvVar3 = amfv.a;
                                                    }
                                                    amfuVar2 = amfvVar3.c;
                                                    if (amfuVar2 == null) {
                                                        amfuVar2 = amfu.a;
                                                    }
                                                    alatVar5 = amfuVar2.b;
                                                    iIndexOf = alatVar5.indexOf(amftVar);
                                                    akzxVarM2 = defpackage.wna.a.m();
                                                    zNoneMatch = j$.util.Collection.-EL.stream(alatVar5).limit(iIndexOf).noneMatch(new vpl(amftVar, 12));
                                                    i10 = iIndexOf + 1;
                                                    z3 = i13;
                                                    zNoneMatch2 = j$.util.Collection.-EL.stream(alatVar5).skip(i10).noneMatch(new vpl(amftVar, 13));
                                                    if (iIndexOf > 0) {
                                                        amftVar2 = (amft) alatVar5.get(iIndexOf - 1);
                                                        i12 = amftVar2.c;
                                                        if (amjk.e(i12) != i17) {
                                                            z4 = zNoneMatch2;
                                                            i11 = i10;
                                                        } else {
                                                            if (i12 == i17) {
                                                                amgcVar3 = (amgc) amftVar2.d;
                                                            } else {
                                                                amgcVar3 = amgc.a;
                                                            }
                                                            amfyVar5 = amgcVar3.e;
                                                            if (amfyVar5 == null) {
                                                                amfyVar5 = amfy.a;
                                                            }
                                                            if (!defpackage.wle.c(amfyVar5) || (amftVar2.b & 4) == 0) {
                                                                z4 = zNoneMatch2;
                                                                i11 = i10;
                                                            } else {
                                                                i11 = i10;
                                                                z4 = zNoneMatch2;
                                                                z7 = amftVar2.g == amftVar.g ? z3 ? 1 : 0 : false;
                                                            }
                                                        }
                                                        z5 = !z7;
                                                    } else {
                                                        z4 = zNoneMatch2;
                                                        i11 = i10;
                                                        z5 = false;
                                                    }
                                                    if (alatVar5.size() > i11) {
                                                        amft amftVar3 = (amft) alatVar5.get(i11);
                                                        if (amftVar.c == 2) {
                                                            amgcVar2 = (amgc) amftVar.d;
                                                        } else {
                                                            amgcVar2 = amgc.a;
                                                        }
                                                        amfyVar4 = amgcVar2.e;
                                                        if (amfyVar4 == null) {
                                                            amfyVar4 = amfy.a;
                                                        }
                                                        if (defpackage.wle.c(amfyVar4) && amjk.e(amftVar3.c) == 2 && (amftVar3.b & 4) != 0) {
                                                            long j3 = amftVar3.g;
                                                            it2 = it;
                                                            if (j3 == amftVar.g) {
                                                                z6 = false;
                                                            }
                                                        } else {
                                                            it2 = it;
                                                        }
                                                        z6 = z3 ? 1 : 0;
                                                    } else {
                                                        it2 = it;
                                                        z6 = z3 ? 1 : 0;
                                                    }
                                                    if (zNoneMatch) {
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar2 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar2.b |= 1;
                                                        wnaVar2.c = false;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar3 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar3.b |= 2;
                                                        wnaVar3.d = z5;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar4 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar4.b |= 4;
                                                        wnaVar4.e = z6;
                                                        wnaVar = (defpackage.wna) akzxVarM2.p();
                                                    } else if (z4) {
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar5 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar5.b |= 1;
                                                        wnaVar5.c = false;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar6 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar6.b |= 2;
                                                        wnaVar6.d = z3;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar7 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar7.b |= 4;
                                                        wnaVar7.e = z3;
                                                        wnaVar = (defpackage.wna) akzxVarM2.p();
                                                    } else {
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar8 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar8.b = (wnaVar8.b | (z3 ? 1 : 0)) == true ? 1 : 0;
                                                        wnaVar8.c = z3;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar9 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar9.b |= 2;
                                                        wnaVar9.d = false;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar10 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar10.b |= 4;
                                                        wnaVar10.e = z6;
                                                        wnaVar = (defpackage.wna) akzxVarM2.p();
                                                    }
                                                    akzxVarM6.u();
                                                    defpackage.wnb wnbVar6 = (defpackage.wnb) akzxVarM6.b;
                                                    j$.util.Objects.requireNonNull(wnaVar);
                                                    wnbVar6.h = wnaVar;
                                                    wnbVar6.b |= 16;
                                                    akzxVarM.u();
                                                    defpackage.wmz wmzVar5 = (defpackage.wmz) akzxVarM.b;
                                                    defpackage.wnb wnbVar7 = (defpackage.wnb) akzxVarM6.p();
                                                    j$.util.Objects.requireNonNull(wnbVar7);
                                                    wmzVar5.d = wnbVar7;
                                                    wmzVar5.c = 3;
                                                    aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                    if (wleVar2.i.compareAndSet(false, true)) {
                                                        wleVar2.g.b(wleVar2.e, 3);
                                                    }
                                                    it = it2;
                                                    i13 = 1;
                                                    str2 = str6;
                                                } else if (i7 != i17) {
                                                    if (i7 != 5) {
                                                        str3 = str2;
                                                        if (i6 == 8) {
                                                            amgfVar = (amgf) amftVar.d;
                                                        } else {
                                                            amgfVar = amgf.a;
                                                        }
                                                        amfyVar2 = amgfVar.e;
                                                        if (amfyVar2 == null) {
                                                            amfyVar2 = amfy.a;
                                                        }
                                                        akzx akzxVarM7 = defpackage.wng.a.m();
                                                        java.lang.String str9 = amfyVar2.c;
                                                        akzxVarM7.u();
                                                        defpackage.wng wngVar2 = (defpackage.wng) akzxVarM7.b;
                                                        j$.util.Objects.requireNonNull(str9);
                                                        wngVar2.b |= i13;
                                                        wngVar2.c = str9;
                                                        boolean zC3 = defpackage.wle.c(amfyVar2);
                                                        akzxVarM7.u();
                                                        defpackage.wng wngVar3 = (defpackage.wng) akzxVarM7.b;
                                                        wngVar3.b |= i17;
                                                        wngVar3.d = zC3;
                                                        aify aifyVarA3 = defpackage.wle.a(amfyVar2.d);
                                                        akzxVarM7.u();
                                                        wngVar = (defpackage.wng) akzxVarM7.b;
                                                        alatVar3 = wngVar.e;
                                                        if (!alatVar3.c()) {
                                                            wngVar.e = alad.J(alatVar3);
                                                        }
                                                        akyl.i(aifyVarA3, wngVar.e);
                                                        akzxVarM.u();
                                                        defpackage.wmz wmzVar6 = (defpackage.wmz) akzxVarM.b;
                                                        defpackage.wng wngVar4 = (defpackage.wng) akzxVarM7.p();
                                                        j$.util.Objects.requireNonNull(wngVar4);
                                                        wmzVar6.d = wngVar4;
                                                        wmzVar6.c = 5;
                                                        aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                    } else if (i7 != i15) {
                                                        str3 = str2;
                                                        if (i6 == 9) {
                                                            amgdVar = (amgd) amftVar.d;
                                                        } else {
                                                            amgdVar = amgd.a;
                                                        }
                                                        iAQ = a.aQ(amgdVar.c);
                                                        if (iAQ == 0) {
                                                            iAQ = i13;
                                                        }
                                                        if (iAQ == i17) {
                                                            akzx akzxVarM8 = defpackage.wnf.a.m();
                                                            defpackage.wne wneVar = defpackage.wne.LIVE;
                                                            akzxVarM8.u();
                                                            defpackage.wnf wnfVar = (defpackage.wnf) akzxVarM8.b;
                                                            wnfVar.c = wneVar.d;
                                                            wnfVar.b |= i13;
                                                            akzxVarM.u();
                                                            defpackage.wmz wmzVar7 = (defpackage.wmz) akzxVarM.b;
                                                            defpackage.wnf wnfVar2 = (defpackage.wnf) akzxVarM8.p();
                                                            j$.util.Objects.requireNonNull(wnfVar2);
                                                            wmzVar7.d = wnfVar2;
                                                            wmzVar7.c = i15;
                                                            aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                        }
                                                    } else if (i7 != 7) {
                                                        a.bI(defpackage.wle.a.d(), "Unhandled AmItem 'item' value", "com/android/dialer/xatu/impl/service/XatuInterpreter", "createXatuTreeItemsList", (char) 416, str2, zct.b);
                                                    } else {
                                                        a.bI(defpackage.wle.a.d(), "AmItem 'item' field not set", "com/android/dialer/xatu/impl/service/XatuInterpreter", "createXatuTreeItemsList", (char) 413, str2, zct.b);
                                                    }
                                                    str2 = str3;
                                                } else {
                                                    defpackage.wnd wndVar = defpackage.wnd.a;
                                                    akzxVarM.u();
                                                    defpackage.wmz wmzVar8 = (defpackage.wmz) akzxVarM.b;
                                                    j$.util.Objects.requireNonNull(wndVar);
                                                    wmzVar8.d = wndVar;
                                                    wmzVar8.c = 4;
                                                    aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                }
                                                i15 = 6;
                                                i16 = 3;
                                                i17 = 2;
                                            }
                                            aifyVarH = aiftVar.h();
                                        } else {
                                            defpackage.wle.a.b().l("com/android/dialer/xatu/impl/service/XatuInterpreter", "createXatuTreeItemsList", 339, "XatuInterpreter.java").v("event has no AmLog");
                                            aifyVarH = aiftVar.h();
                                        }
                                        defpackage.abtr abtrVar3 = wleVar2.l;
                                        akzx akzxVarM9 = defpackage.wor.a.m();
                                        akzx akzxVarM10 = defpackage.wog.a.m();
                                        akzxVarM10.u();
                                        wogVar = (defpackage.wog) akzxVarM10.b;
                                        alatVar = wogVar.b;
                                        if (!alatVar.c()) {
                                            wogVar.b = alad.J(alatVar);
                                        }
                                        akyl.i(aifyVarH, wogVar.b);
                                        defpackage.wog wogVar2 = (defpackage.wog) akzxVarM10.p();
                                        akzxVarM9.u();
                                        defpackage.wor worVar3 = (defpackage.wor) akzxVarM9.b;
                                        j$.util.Objects.requireNonNull(wogVar2);
                                        worVar3.c = wogVar2;
                                        worVar3.b = 6;
                                        agsm.i(1102, abtrVar3.o((defpackage.wor) akzxVarM9.p()), "failed to update latest tree items state", new java.lang.Object[0]);
                                        defpackage.wjb wjbVar2 = wleVar2.h;
                                        aooh.f(aifyVarH, "xatuTreeItems");
                                        agsm.i(1064, ahvr.F(new defpackage.whv(wjbVar2, aifyVarH, 3), wjbVar2.a), "failed to track items for logging", new java.lang.Object[0]);
                                        defpackage.wit witVar = wleVar2.b;
                                        agsm.i(1061, ahvr.E(new defpackage.wdm(witVar, aifyVarH, 2), witVar.a), "failed to track options", new java.lang.Object[0]);
                                        return;
                                    case 1:
                                        amgj amgjVar = i14 == 3 ? (amgj) amgqVar2.d : amgj.a;
                                        ahvr.bN(1 == (amgjVar.b & 1), "hold detection with no status");
                                        int iAe = a.ae(amgjVar.c);
                                        if (iAe == 0) {
                                            iAe = 1;
                                        }
                                        if (iAe - 1 == 0) {
                                            throw new java.lang.IllegalArgumentException("hold detection with unknown status");
                                        }
                                        defpackage.wle.a.b().l("com/android/dialer/xatu/impl/service/XatuInterpreter", "handleHoldDetection", 239, "XatuInterpreter.java").v("on hold detected");
                                        defpackage.abtr abtrVar4 = wleVar2.l;
                                        akzx akzxVarM11 = defpackage.wor.a.m();
                                        defpackage.wnq wnqVar = defpackage.wnq.a;
                                        akzxVarM11.u();
                                        defpackage.wor worVar4 = (defpackage.wor) akzxVarM11.b;
                                        j$.util.Objects.requireNonNull(wnqVar);
                                        worVar4.c = wnqVar;
                                        worVar4.b = 24;
                                        agsm.i(1101, abtrVar4.o((defpackage.wor) akzxVarM11.p()), "failed to update state with hold detected action", new java.lang.Object[0]);
                                        wleVar2.g.b(wleVar2.e, 16);
                                        agsm.i(1090, ((defpackage.wky) wleVar2.d.a()).d(new defpackage.wkx(defpackage.wre.HOLD_DETECTED, j$.util.Optional.empty())), "failed to stop session", new java.lang.Object[0]);
                                        wleVar2.k = j$.util.Optional.empty();
                                        aiftVar = new aift(4);
                                        amfvVar = amgqVar2.e;
                                        if (amfvVar == null) {
                                            amfvVar = amfv.a;
                                        }
                                        str2 = "XatuInterpreter.java";
                                        if ((amfvVar.b & 1) != 0) {
                                            amfvVar2 = amgqVar2.e;
                                            if (amfvVar2 == null) {
                                                amfvVar2 = amfv.a;
                                            }
                                            amfuVar = amfvVar2.c;
                                            if (amfuVar == null) {
                                                amfuVar = amfu.a;
                                            }
                                            it = amfuVar.b.iterator();
                                            while (it.hasNext()) {
                                                amftVar = (amft) it.next();
                                                akzxVarM = defpackage.wmz.a.m();
                                                long j4 = amftVar.e;
                                                akzxVarM.u();
                                                defpackage.wmz wmzVar9 = (defpackage.wmz) akzxVarM.b;
                                                wmzVar9.b |= i13;
                                                wmzVar9.e = j4;
                                                long j5 = amftVar.g;
                                                akzxVarM.u();
                                                defpackage.wmz wmzVar10 = (defpackage.wmz) akzxVarM.b;
                                                wmzVar10.b |= i17;
                                                wmzVar10.f = j5;
                                                int i110 = amftVar.h;
                                                akzxVarM.u();
                                                defpackage.wmz wmzVar11 = (defpackage.wmz) akzxVarM.b;
                                                wmzVar11.b |= 4;
                                                wmzVar11.g = i110;
                                                i6 = amftVar.c;
                                                iE = amjk.e(i6);
                                                i7 = iE - 1;
                                                if (iE != 0) {
                                                    throw null;
                                                }
                                                if (i7 != 0) {
                                                    java.util.Iterator it4 = it;
                                                    java.lang.String str10 = str2;
                                                    if (i6 == i13) {
                                                        amfpVar = (amfp) amftVar.d;
                                                    } else {
                                                        amfpVar = amfp.a;
                                                    }
                                                    amfyVar = amfpVar.d;
                                                    if (amfyVar == null) {
                                                        amfyVar = amfy.a;
                                                    }
                                                    akzx akzxVarM12 = defpackage.wnc.a.m();
                                                    java.lang.String str11 = amfyVar.c;
                                                    akzxVarM12.u();
                                                    defpackage.wnc wncVar5 = (defpackage.wnc) akzxVarM12.b;
                                                    j$.util.Objects.requireNonNull(str11);
                                                    wncVar5.b |= 1;
                                                    wncVar5.c = str11;
                                                    boolean zC4 = defpackage.wle.c(amfyVar);
                                                    akzxVarM12.u();
                                                    defpackage.wnc wncVar6 = (defpackage.wnc) akzxVarM12.b;
                                                    wncVar6.b |= 2;
                                                    wncVar6.d = zC4;
                                                    aify aifyVarA4 = defpackage.wle.a(amfyVar.d);
                                                    akzxVarM12.u();
                                                    wncVar = (defpackage.wnc) akzxVarM12.b;
                                                    alatVar2 = wncVar.e;
                                                    if (!alatVar2.c()) {
                                                        wncVar.e = alad.J(alatVar2);
                                                    }
                                                    akyl.i(aifyVarA4, wncVar.e);
                                                    defpackage.wnc wncVar7 = (defpackage.wnc) akzxVarM12.p();
                                                    akzxVarM.u();
                                                    defpackage.wmz wmzVar12 = (defpackage.wmz) akzxVarM.b;
                                                    j$.util.Objects.requireNonNull(wncVar7);
                                                    wmzVar12.d = wncVar7;
                                                    wmzVar12.c = 2;
                                                    aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                    it = it4;
                                                    str2 = str10;
                                                    i13 = 1;
                                                } else if (i7 != i13) {
                                                    java.lang.String str12 = str2;
                                                    if (i6 == i17) {
                                                        amgcVar = (amgc) amftVar.d;
                                                    } else {
                                                        amgcVar = amgc.a;
                                                    }
                                                    amfyVar3 = amgcVar.e;
                                                    if (amfyVar3 == null) {
                                                        amfyVar3 = amfy.a;
                                                    }
                                                    akzx akzxVarM13 = defpackage.wnb.a.m();
                                                    java.lang.String str13 = amfyVar3.c;
                                                    akzxVarM13.u();
                                                    defpackage.wnb wnbVar8 = (defpackage.wnb) akzxVarM13.b;
                                                    j$.util.Objects.requireNonNull(str13);
                                                    wnbVar8.b |= i13;
                                                    wnbVar8.c = str13;
                                                    boolean zC5 = defpackage.wle.c(amfyVar3);
                                                    akzxVarM13.u();
                                                    defpackage.wnb wnbVar9 = (defpackage.wnb) akzxVarM13.b;
                                                    wnbVar9.b |= i17;
                                                    wnbVar9.d = zC5;
                                                    java.lang.String str14 = amgcVar.c;
                                                    akzxVarM13.u();
                                                    defpackage.wnb wnbVar10 = (defpackage.wnb) akzxVarM13.b;
                                                    j$.util.Objects.requireNonNull(str14);
                                                    wnbVar10.b |= 8;
                                                    wnbVar10.f = str14;
                                                    iAN = a.aN(amgcVar.g);
                                                    if (iAN == 0) {
                                                        iAN = i13;
                                                    }
                                                    i8 = iAN - 1;
                                                    if (i8 != i13) {
                                                        i9 = 4;
                                                    } else if (i8 != i17) {
                                                        i9 = i17;
                                                    } else {
                                                        if (i8 == i16) {
                                                            throw new java.lang.IllegalStateException("invalid option state");
                                                        }
                                                        i9 = i16;
                                                    }
                                                    akzxVarM13.u();
                                                    defpackage.wnb wnbVar11 = (defpackage.wnb) akzxVarM13.b;
                                                    wnbVar11.e = i9 - 1;
                                                    wnbVar11.b |= 4;
                                                    aify aifyVarA5 = defpackage.wle.a(amfyVar3.d);
                                                    akzxVarM13.u();
                                                    wnbVar = (defpackage.wnb) akzxVarM13.b;
                                                    alatVar4 = wnbVar.g;
                                                    if (!alatVar4.c()) {
                                                        wnbVar.g = alad.J(alatVar4);
                                                    }
                                                    akyl.i(aifyVarA5, wnbVar.g);
                                                    amfvVar3 = amgqVar2.e;
                                                    if (amfvVar3 == null) {
                                                        amfvVar3 = amfv.a;
                                                    }
                                                    amfuVar2 = amfvVar3.c;
                                                    if (amfuVar2 == null) {
                                                        amfuVar2 = amfu.a;
                                                    }
                                                    alatVar5 = amfuVar2.b;
                                                    iIndexOf = alatVar5.indexOf(amftVar);
                                                    akzxVarM2 = defpackage.wna.a.m();
                                                    zNoneMatch = j$.util.Collection.-EL.stream(alatVar5).limit(iIndexOf).noneMatch(new vpl(amftVar, 12));
                                                    i10 = iIndexOf + 1;
                                                    z3 = i13;
                                                    zNoneMatch2 = j$.util.Collection.-EL.stream(alatVar5).skip(i10).noneMatch(new vpl(amftVar, 13));
                                                    if (iIndexOf > 0) {
                                                        amftVar2 = (amft) alatVar5.get(iIndexOf - 1);
                                                        i12 = amftVar2.c;
                                                        if (amjk.e(i12) != i17) {
                                                            z4 = zNoneMatch2;
                                                            i11 = i10;
                                                        } else {
                                                            if (i12 == i17) {
                                                                amgcVar3 = (amgc) amftVar2.d;
                                                            } else {
                                                                amgcVar3 = amgc.a;
                                                            }
                                                            amfyVar5 = amgcVar3.e;
                                                            if (amfyVar5 == null) {
                                                                amfyVar5 = amfy.a;
                                                            }
                                                            if (defpackage.wle.c(amfyVar5)) {
                                                                z4 = zNoneMatch2;
                                                                i11 = i10;
                                                            } else {
                                                                z4 = zNoneMatch2;
                                                                i11 = i10;
                                                            }
                                                        }
                                                        z5 = !z7;
                                                    } else {
                                                        z4 = zNoneMatch2;
                                                        i11 = i10;
                                                        z5 = false;
                                                    }
                                                    if (alatVar5.size() > i11) {
                                                        amft amftVar4 = (amft) alatVar5.get(i11);
                                                        if (amftVar.c == 2) {
                                                            amgcVar2 = (amgc) amftVar.d;
                                                        } else {
                                                            amgcVar2 = amgc.a;
                                                        }
                                                        amfyVar4 = amgcVar2.e;
                                                        if (amfyVar4 == null) {
                                                            amfyVar4 = amfy.a;
                                                        }
                                                        if (defpackage.wle.c(amfyVar4)) {
                                                            it2 = it;
                                                            z6 = z3 ? 1 : 0;
                                                        } else {
                                                            it2 = it;
                                                            z6 = z3 ? 1 : 0;
                                                        }
                                                    } else {
                                                        it2 = it;
                                                        z6 = z3 ? 1 : 0;
                                                    }
                                                    if (zNoneMatch) {
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar11 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar11.b |= 1;
                                                        wnaVar11.c = false;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar12 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar12.b |= 2;
                                                        wnaVar12.d = z5;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar13 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar13.b |= 4;
                                                        wnaVar13.e = z6;
                                                        wnaVar = (defpackage.wna) akzxVarM2.p();
                                                    } else if (z4) {
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar14 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar14.b |= 1;
                                                        wnaVar14.c = false;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar15 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar15.b |= 2;
                                                        wnaVar15.d = z3;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar16 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar16.b |= 4;
                                                        wnaVar16.e = z3;
                                                        wnaVar = (defpackage.wna) akzxVarM2.p();
                                                    } else {
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar17 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar17.b = (wnaVar17.b | (z3 ? 1 : 0)) == true ? 1 : 0;
                                                        wnaVar17.c = z3;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar18 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar18.b |= 2;
                                                        wnaVar18.d = false;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar19 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar19.b |= 4;
                                                        wnaVar19.e = z6;
                                                        wnaVar = (defpackage.wna) akzxVarM2.p();
                                                    }
                                                    akzxVarM13.u();
                                                    defpackage.wnb wnbVar12 = (defpackage.wnb) akzxVarM13.b;
                                                    j$.util.Objects.requireNonNull(wnaVar);
                                                    wnbVar12.h = wnaVar;
                                                    wnbVar12.b |= 16;
                                                    akzxVarM.u();
                                                    defpackage.wmz wmzVar13 = (defpackage.wmz) akzxVarM.b;
                                                    defpackage.wnb wnbVar13 = (defpackage.wnb) akzxVarM13.p();
                                                    j$.util.Objects.requireNonNull(wnbVar13);
                                                    wmzVar13.d = wnbVar13;
                                                    wmzVar13.c = 3;
                                                    aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                    if (wleVar2.i.compareAndSet(false, true)) {
                                                        wleVar2.g.b(wleVar2.e, 3);
                                                    }
                                                    it = it2;
                                                    i13 = 1;
                                                    str2 = str12;
                                                } else if (i7 != i17) {
                                                    if (i7 != 5) {
                                                        str3 = str2;
                                                        if (i6 == 8) {
                                                            amgfVar = (amgf) amftVar.d;
                                                        } else {
                                                            amgfVar = amgf.a;
                                                        }
                                                        amfyVar2 = amgfVar.e;
                                                        if (amfyVar2 == null) {
                                                            amfyVar2 = amfy.a;
                                                        }
                                                        akzx akzxVarM14 = defpackage.wng.a.m();
                                                        java.lang.String str15 = amfyVar2.c;
                                                        akzxVarM14.u();
                                                        defpackage.wng wngVar5 = (defpackage.wng) akzxVarM14.b;
                                                        j$.util.Objects.requireNonNull(str15);
                                                        wngVar5.b |= i13;
                                                        wngVar5.c = str15;
                                                        boolean zC6 = defpackage.wle.c(amfyVar2);
                                                        akzxVarM14.u();
                                                        defpackage.wng wngVar6 = (defpackage.wng) akzxVarM14.b;
                                                        wngVar6.b |= i17;
                                                        wngVar6.d = zC6;
                                                        aify aifyVarA6 = defpackage.wle.a(amfyVar2.d);
                                                        akzxVarM14.u();
                                                        wngVar = (defpackage.wng) akzxVarM14.b;
                                                        alatVar3 = wngVar.e;
                                                        if (!alatVar3.c()) {
                                                            wngVar.e = alad.J(alatVar3);
                                                        }
                                                        akyl.i(aifyVarA6, wngVar.e);
                                                        akzxVarM.u();
                                                        defpackage.wmz wmzVar14 = (defpackage.wmz) akzxVarM.b;
                                                        defpackage.wng wngVar7 = (defpackage.wng) akzxVarM14.p();
                                                        j$.util.Objects.requireNonNull(wngVar7);
                                                        wmzVar14.d = wngVar7;
                                                        wmzVar14.c = 5;
                                                        aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                    } else if (i7 != i15) {
                                                        str3 = str2;
                                                        if (i6 == 9) {
                                                            amgdVar = (amgd) amftVar.d;
                                                        } else {
                                                            amgdVar = amgd.a;
                                                        }
                                                        iAQ = a.aQ(amgdVar.c);
                                                        if (iAQ == 0) {
                                                            iAQ = i13;
                                                        }
                                                        if (iAQ == i17) {
                                                            akzx akzxVarM15 = defpackage.wnf.a.m();
                                                            defpackage.wne wneVar2 = defpackage.wne.LIVE;
                                                            akzxVarM15.u();
                                                            defpackage.wnf wnfVar3 = (defpackage.wnf) akzxVarM15.b;
                                                            wnfVar3.c = wneVar2.d;
                                                            wnfVar3.b |= i13;
                                                            akzxVarM.u();
                                                            defpackage.wmz wmzVar15 = (defpackage.wmz) akzxVarM.b;
                                                            defpackage.wnf wnfVar4 = (defpackage.wnf) akzxVarM15.p();
                                                            j$.util.Objects.requireNonNull(wnfVar4);
                                                            wmzVar15.d = wnfVar4;
                                                            wmzVar15.c = i15;
                                                            aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                        }
                                                    } else if (i7 != 7) {
                                                        a.bI(defpackage.wle.a.d(), "Unhandled AmItem 'item' value", "com/android/dialer/xatu/impl/service/XatuInterpreter", "createXatuTreeItemsList", (char) 416, str2, zct.b);
                                                    } else {
                                                        a.bI(defpackage.wle.a.d(), "AmItem 'item' field not set", "com/android/dialer/xatu/impl/service/XatuInterpreter", "createXatuTreeItemsList", (char) 413, str2, zct.b);
                                                    }
                                                    str2 = str3;
                                                } else {
                                                    defpackage.wnd wndVar2 = defpackage.wnd.a;
                                                    akzxVarM.u();
                                                    defpackage.wmz wmzVar16 = (defpackage.wmz) akzxVarM.b;
                                                    j$.util.Objects.requireNonNull(wndVar2);
                                                    wmzVar16.d = wndVar2;
                                                    wmzVar16.c = 4;
                                                    aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                }
                                                i15 = 6;
                                                i16 = 3;
                                                i17 = 2;
                                            }
                                            aifyVarH = aiftVar.h();
                                        } else {
                                            defpackage.wle.a.b().l("com/android/dialer/xatu/impl/service/XatuInterpreter", "createXatuTreeItemsList", 339, "XatuInterpreter.java").v("event has no AmLog");
                                            aifyVarH = aiftVar.h();
                                        }
                                        defpackage.abtr abtrVar5 = wleVar2.l;
                                        akzx akzxVarM16 = defpackage.wor.a.m();
                                        akzx akzxVarM17 = defpackage.wog.a.m();
                                        akzxVarM17.u();
                                        wogVar = (defpackage.wog) akzxVarM17.b;
                                        alatVar = wogVar.b;
                                        if (!alatVar.c()) {
                                            wogVar.b = alad.J(alatVar);
                                        }
                                        akyl.i(aifyVarH, wogVar.b);
                                        defpackage.wog wogVar3 = (defpackage.wog) akzxVarM17.p();
                                        akzxVarM16.u();
                                        defpackage.wor worVar5 = (defpackage.wor) akzxVarM16.b;
                                        j$.util.Objects.requireNonNull(wogVar3);
                                        worVar5.c = wogVar3;
                                        worVar5.b = 6;
                                        agsm.i(1102, abtrVar5.o((defpackage.wor) akzxVarM16.p()), "failed to update latest tree items state", new java.lang.Object[0]);
                                        defpackage.wjb wjbVar3 = wleVar2.h;
                                        aooh.f(aifyVarH, "xatuTreeItems");
                                        agsm.i(1064, ahvr.F(new defpackage.whv(wjbVar3, aifyVarH, 3), wjbVar3.a), "failed to track items for logging", new java.lang.Object[0]);
                                        defpackage.wit witVar2 = wleVar2.b;
                                        agsm.i(1061, ahvr.E(new defpackage.wdm(witVar2, aifyVarH, 2), witVar2.a), "failed to track options", new java.lang.Object[0]);
                                        return;
                                    case 2:
                                    case 3:
                                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                        wleVar2.k = j$.util.Optional.empty();
                                        aiftVar = new aift(4);
                                        amfvVar = amgqVar2.e;
                                        if (amfvVar == null) {
                                            amfvVar = amfv.a;
                                        }
                                        str2 = "XatuInterpreter.java";
                                        if ((amfvVar.b & 1) != 0) {
                                            amfvVar2 = amgqVar2.e;
                                            if (amfvVar2 == null) {
                                                amfvVar2 = amfv.a;
                                            }
                                            amfuVar = amfvVar2.c;
                                            if (amfuVar == null) {
                                                amfuVar = amfu.a;
                                            }
                                            it = amfuVar.b.iterator();
                                            while (it.hasNext()) {
                                                amftVar = (amft) it.next();
                                                akzxVarM = defpackage.wmz.a.m();
                                                long j6 = amftVar.e;
                                                akzxVarM.u();
                                                defpackage.wmz wmzVar17 = (defpackage.wmz) akzxVarM.b;
                                                wmzVar17.b |= i13;
                                                wmzVar17.e = j6;
                                                long j7 = amftVar.g;
                                                akzxVarM.u();
                                                defpackage.wmz wmzVar18 = (defpackage.wmz) akzxVarM.b;
                                                wmzVar18.b |= i17;
                                                wmzVar18.f = j7;
                                                int i111 = amftVar.h;
                                                akzxVarM.u();
                                                defpackage.wmz wmzVar19 = (defpackage.wmz) akzxVarM.b;
                                                wmzVar19.b |= 4;
                                                wmzVar19.g = i111;
                                                i6 = amftVar.c;
                                                iE = amjk.e(i6);
                                                i7 = iE - 1;
                                                if (iE != 0) {
                                                    throw null;
                                                }
                                                if (i7 != 0) {
                                                    java.util.Iterator it5 = it;
                                                    java.lang.String str16 = str2;
                                                    if (i6 == i13) {
                                                        amfpVar = (amfp) amftVar.d;
                                                    } else {
                                                        amfpVar = amfp.a;
                                                    }
                                                    amfyVar = amfpVar.d;
                                                    if (amfyVar == null) {
                                                        amfyVar = amfy.a;
                                                    }
                                                    akzx akzxVarM18 = defpackage.wnc.a.m();
                                                    java.lang.String str17 = amfyVar.c;
                                                    akzxVarM18.u();
                                                    defpackage.wnc wncVar8 = (defpackage.wnc) akzxVarM18.b;
                                                    j$.util.Objects.requireNonNull(str17);
                                                    wncVar8.b |= 1;
                                                    wncVar8.c = str17;
                                                    boolean zC7 = defpackage.wle.c(amfyVar);
                                                    akzxVarM18.u();
                                                    defpackage.wnc wncVar9 = (defpackage.wnc) akzxVarM18.b;
                                                    wncVar9.b |= 2;
                                                    wncVar9.d = zC7;
                                                    aify aifyVarA7 = defpackage.wle.a(amfyVar.d);
                                                    akzxVarM18.u();
                                                    wncVar = (defpackage.wnc) akzxVarM18.b;
                                                    alatVar2 = wncVar.e;
                                                    if (!alatVar2.c()) {
                                                        wncVar.e = alad.J(alatVar2);
                                                    }
                                                    akyl.i(aifyVarA7, wncVar.e);
                                                    defpackage.wnc wncVar10 = (defpackage.wnc) akzxVarM18.p();
                                                    akzxVarM.u();
                                                    defpackage.wmz wmzVar110 = (defpackage.wmz) akzxVarM.b;
                                                    j$.util.Objects.requireNonNull(wncVar10);
                                                    wmzVar110.d = wncVar10;
                                                    wmzVar110.c = 2;
                                                    aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                    it = it5;
                                                    str2 = str16;
                                                    i13 = 1;
                                                } else if (i7 != i13) {
                                                    java.lang.String str18 = str2;
                                                    if (i6 == i17) {
                                                        amgcVar = (amgc) amftVar.d;
                                                    } else {
                                                        amgcVar = amgc.a;
                                                    }
                                                    amfyVar3 = amgcVar.e;
                                                    if (amfyVar3 == null) {
                                                        amfyVar3 = amfy.a;
                                                    }
                                                    akzx akzxVarM19 = defpackage.wnb.a.m();
                                                    java.lang.String str19 = amfyVar3.c;
                                                    akzxVarM19.u();
                                                    defpackage.wnb wnbVar14 = (defpackage.wnb) akzxVarM19.b;
                                                    j$.util.Objects.requireNonNull(str19);
                                                    wnbVar14.b |= i13;
                                                    wnbVar14.c = str19;
                                                    boolean zC8 = defpackage.wle.c(amfyVar3);
                                                    akzxVarM19.u();
                                                    defpackage.wnb wnbVar15 = (defpackage.wnb) akzxVarM19.b;
                                                    wnbVar15.b |= i17;
                                                    wnbVar15.d = zC8;
                                                    java.lang.String str110 = amgcVar.c;
                                                    akzxVarM19.u();
                                                    defpackage.wnb wnbVar16 = (defpackage.wnb) akzxVarM19.b;
                                                    j$.util.Objects.requireNonNull(str110);
                                                    wnbVar16.b |= 8;
                                                    wnbVar16.f = str110;
                                                    iAN = a.aN(amgcVar.g);
                                                    if (iAN == 0) {
                                                        iAN = i13;
                                                    }
                                                    i8 = iAN - 1;
                                                    if (i8 != i13) {
                                                        i9 = 4;
                                                    } else if (i8 != i17) {
                                                        i9 = i17;
                                                    } else {
                                                        if (i8 == i16) {
                                                            throw new java.lang.IllegalStateException("invalid option state");
                                                        }
                                                        i9 = i16;
                                                    }
                                                    akzxVarM19.u();
                                                    defpackage.wnb wnbVar17 = (defpackage.wnb) akzxVarM19.b;
                                                    wnbVar17.e = i9 - 1;
                                                    wnbVar17.b |= 4;
                                                    aify aifyVarA8 = defpackage.wle.a(amfyVar3.d);
                                                    akzxVarM19.u();
                                                    wnbVar = (defpackage.wnb) akzxVarM19.b;
                                                    alatVar4 = wnbVar.g;
                                                    if (!alatVar4.c()) {
                                                        wnbVar.g = alad.J(alatVar4);
                                                    }
                                                    akyl.i(aifyVarA8, wnbVar.g);
                                                    amfvVar3 = amgqVar2.e;
                                                    if (amfvVar3 == null) {
                                                        amfvVar3 = amfv.a;
                                                    }
                                                    amfuVar2 = amfvVar3.c;
                                                    if (amfuVar2 == null) {
                                                        amfuVar2 = amfu.a;
                                                    }
                                                    alatVar5 = amfuVar2.b;
                                                    iIndexOf = alatVar5.indexOf(amftVar);
                                                    akzxVarM2 = defpackage.wna.a.m();
                                                    zNoneMatch = j$.util.Collection.-EL.stream(alatVar5).limit(iIndexOf).noneMatch(new vpl(amftVar, 12));
                                                    i10 = iIndexOf + 1;
                                                    z3 = i13;
                                                    zNoneMatch2 = j$.util.Collection.-EL.stream(alatVar5).skip(i10).noneMatch(new vpl(amftVar, 13));
                                                    if (iIndexOf > 0) {
                                                        amftVar2 = (amft) alatVar5.get(iIndexOf - 1);
                                                        i12 = amftVar2.c;
                                                        if (amjk.e(i12) != i17) {
                                                            z4 = zNoneMatch2;
                                                            i11 = i10;
                                                        } else {
                                                            if (i12 == i17) {
                                                                amgcVar3 = (amgc) amftVar2.d;
                                                            } else {
                                                                amgcVar3 = amgc.a;
                                                            }
                                                            amfyVar5 = amgcVar3.e;
                                                            if (amfyVar5 == null) {
                                                                amfyVar5 = amfy.a;
                                                            }
                                                            if (defpackage.wle.c(amfyVar5)) {
                                                                z4 = zNoneMatch2;
                                                                i11 = i10;
                                                            } else {
                                                                z4 = zNoneMatch2;
                                                                i11 = i10;
                                                            }
                                                        }
                                                        z5 = !z7;
                                                    } else {
                                                        z4 = zNoneMatch2;
                                                        i11 = i10;
                                                        z5 = false;
                                                    }
                                                    if (alatVar5.size() > i11) {
                                                        amft amftVar5 = (amft) alatVar5.get(i11);
                                                        if (amftVar.c == 2) {
                                                            amgcVar2 = (amgc) amftVar.d;
                                                        } else {
                                                            amgcVar2 = amgc.a;
                                                        }
                                                        amfyVar4 = amgcVar2.e;
                                                        if (amfyVar4 == null) {
                                                            amfyVar4 = amfy.a;
                                                        }
                                                        if (defpackage.wle.c(amfyVar4)) {
                                                            it2 = it;
                                                            z6 = z3 ? 1 : 0;
                                                        } else {
                                                            it2 = it;
                                                            z6 = z3 ? 1 : 0;
                                                        }
                                                    } else {
                                                        it2 = it;
                                                        z6 = z3 ? 1 : 0;
                                                    }
                                                    if (zNoneMatch) {
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar110 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar110.b |= 1;
                                                        wnaVar110.c = false;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar111 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar111.b |= 2;
                                                        wnaVar111.d = z5;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar112 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar112.b |= 4;
                                                        wnaVar112.e = z6;
                                                        wnaVar = (defpackage.wna) akzxVarM2.p();
                                                    } else if (z4) {
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar113 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar113.b |= 1;
                                                        wnaVar113.c = false;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar114 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar114.b |= 2;
                                                        wnaVar114.d = z3;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar115 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar115.b |= 4;
                                                        wnaVar115.e = z3;
                                                        wnaVar = (defpackage.wna) akzxVarM2.p();
                                                    } else {
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar116 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar116.b = (wnaVar116.b | (z3 ? 1 : 0)) == true ? 1 : 0;
                                                        wnaVar116.c = z3;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar117 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar117.b |= 2;
                                                        wnaVar117.d = false;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar118 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar118.b |= 4;
                                                        wnaVar118.e = z6;
                                                        wnaVar = (defpackage.wna) akzxVarM2.p();
                                                    }
                                                    akzxVarM19.u();
                                                    defpackage.wnb wnbVar18 = (defpackage.wnb) akzxVarM19.b;
                                                    j$.util.Objects.requireNonNull(wnaVar);
                                                    wnbVar18.h = wnaVar;
                                                    wnbVar18.b |= 16;
                                                    akzxVarM.u();
                                                    defpackage.wmz wmzVar111 = (defpackage.wmz) akzxVarM.b;
                                                    defpackage.wnb wnbVar19 = (defpackage.wnb) akzxVarM19.p();
                                                    j$.util.Objects.requireNonNull(wnbVar19);
                                                    wmzVar111.d = wnbVar19;
                                                    wmzVar111.c = 3;
                                                    aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                    if (wleVar2.i.compareAndSet(false, true)) {
                                                        wleVar2.g.b(wleVar2.e, 3);
                                                    }
                                                    it = it2;
                                                    i13 = 1;
                                                    str2 = str18;
                                                } else if (i7 != i17) {
                                                    if (i7 != 5) {
                                                        str3 = str2;
                                                        if (i6 == 8) {
                                                            amgfVar = (amgf) amftVar.d;
                                                        } else {
                                                            amgfVar = amgf.a;
                                                        }
                                                        amfyVar2 = amgfVar.e;
                                                        if (amfyVar2 == null) {
                                                            amfyVar2 = amfy.a;
                                                        }
                                                        akzx akzxVarM110 = defpackage.wng.a.m();
                                                        java.lang.String str111 = amfyVar2.c;
                                                        akzxVarM110.u();
                                                        defpackage.wng wngVar8 = (defpackage.wng) akzxVarM110.b;
                                                        j$.util.Objects.requireNonNull(str111);
                                                        wngVar8.b |= i13;
                                                        wngVar8.c = str111;
                                                        boolean zC9 = defpackage.wle.c(amfyVar2);
                                                        akzxVarM110.u();
                                                        defpackage.wng wngVar9 = (defpackage.wng) akzxVarM110.b;
                                                        wngVar9.b |= i17;
                                                        wngVar9.d = zC9;
                                                        aify aifyVarA9 = defpackage.wle.a(amfyVar2.d);
                                                        akzxVarM110.u();
                                                        wngVar = (defpackage.wng) akzxVarM110.b;
                                                        alatVar3 = wngVar.e;
                                                        if (!alatVar3.c()) {
                                                            wngVar.e = alad.J(alatVar3);
                                                        }
                                                        akyl.i(aifyVarA9, wngVar.e);
                                                        akzxVarM.u();
                                                        defpackage.wmz wmzVar112 = (defpackage.wmz) akzxVarM.b;
                                                        defpackage.wng wngVar10 = (defpackage.wng) akzxVarM110.p();
                                                        j$.util.Objects.requireNonNull(wngVar10);
                                                        wmzVar112.d = wngVar10;
                                                        wmzVar112.c = 5;
                                                        aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                    } else if (i7 != i15) {
                                                        str3 = str2;
                                                        if (i6 == 9) {
                                                            amgdVar = (amgd) amftVar.d;
                                                        } else {
                                                            amgdVar = amgd.a;
                                                        }
                                                        iAQ = a.aQ(amgdVar.c);
                                                        if (iAQ == 0) {
                                                            iAQ = i13;
                                                        }
                                                        if (iAQ == i17) {
                                                            akzx akzxVarM111 = defpackage.wnf.a.m();
                                                            defpackage.wne wneVar3 = defpackage.wne.LIVE;
                                                            akzxVarM111.u();
                                                            defpackage.wnf wnfVar5 = (defpackage.wnf) akzxVarM111.b;
                                                            wnfVar5.c = wneVar3.d;
                                                            wnfVar5.b |= i13;
                                                            akzxVarM.u();
                                                            defpackage.wmz wmzVar113 = (defpackage.wmz) akzxVarM.b;
                                                            defpackage.wnf wnfVar6 = (defpackage.wnf) akzxVarM111.p();
                                                            j$.util.Objects.requireNonNull(wnfVar6);
                                                            wmzVar113.d = wnfVar6;
                                                            wmzVar113.c = i15;
                                                            aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                        }
                                                    } else if (i7 != 7) {
                                                        a.bI(defpackage.wle.a.d(), "Unhandled AmItem 'item' value", "com/android/dialer/xatu/impl/service/XatuInterpreter", "createXatuTreeItemsList", (char) 416, str2, zct.b);
                                                    } else {
                                                        a.bI(defpackage.wle.a.d(), "AmItem 'item' field not set", "com/android/dialer/xatu/impl/service/XatuInterpreter", "createXatuTreeItemsList", (char) 413, str2, zct.b);
                                                    }
                                                    str2 = str3;
                                                } else {
                                                    defpackage.wnd wndVar3 = defpackage.wnd.a;
                                                    akzxVarM.u();
                                                    defpackage.wmz wmzVar114 = (defpackage.wmz) akzxVarM.b;
                                                    j$.util.Objects.requireNonNull(wndVar3);
                                                    wmzVar114.d = wndVar3;
                                                    wmzVar114.c = 4;
                                                    aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                }
                                                i15 = 6;
                                                i16 = 3;
                                                i17 = 2;
                                            }
                                            aifyVarH = aiftVar.h();
                                        } else {
                                            defpackage.wle.a.b().l("com/android/dialer/xatu/impl/service/XatuInterpreter", "createXatuTreeItemsList", 339, "XatuInterpreter.java").v("event has no AmLog");
                                            aifyVarH = aiftVar.h();
                                        }
                                        defpackage.abtr abtrVar6 = wleVar2.l;
                                        akzx akzxVarM112 = defpackage.wor.a.m();
                                        akzx akzxVarM113 = defpackage.wog.a.m();
                                        akzxVarM113.u();
                                        wogVar = (defpackage.wog) akzxVarM113.b;
                                        alatVar = wogVar.b;
                                        if (!alatVar.c()) {
                                            wogVar.b = alad.J(alatVar);
                                        }
                                        akyl.i(aifyVarH, wogVar.b);
                                        defpackage.wog wogVar4 = (defpackage.wog) akzxVarM113.p();
                                        akzxVarM112.u();
                                        defpackage.wor worVar6 = (defpackage.wor) akzxVarM112.b;
                                        j$.util.Objects.requireNonNull(wogVar4);
                                        worVar6.c = wogVar4;
                                        worVar6.b = 6;
                                        agsm.i(1102, abtrVar6.o((defpackage.wor) akzxVarM112.p()), "failed to update latest tree items state", new java.lang.Object[0]);
                                        defpackage.wjb wjbVar4 = wleVar2.h;
                                        aooh.f(aifyVarH, "xatuTreeItems");
                                        agsm.i(1064, ahvr.F(new defpackage.whv(wjbVar4, aifyVarH, 3), wjbVar4.a), "failed to track items for logging", new java.lang.Object[0]);
                                        defpackage.wit witVar3 = wleVar2.b;
                                        agsm.i(1061, ahvr.E(new defpackage.wdm(witVar3, aifyVarH, 2), witVar3.a), "failed to track options", new java.lang.Object[0]);
                                        return;
                                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                        int iAe2 = a.ae((i14 == 6 ? (defpackage.amgp) amgqVar2.d : defpackage.amgp.a).c);
                                        if (iAe2 != 0 && iAe2 == 2) {
                                            defpackage.wle.a.b().l("com/android/dialer/xatu/impl/service/XatuInterpreter", "handleLowQualityTranscriptEvent", 287, "XatuInterpreter.java").v("Low quality transcript detected.");
                                            wleVar2.g.b(wleVar2.e, 17);
                                            defpackage.abtr abtrVar7 = wleVar2.l;
                                            akzx akzxVarM20 = defpackage.wor.a.m();
                                            defpackage.wnz wnzVar = defpackage.wnz.a;
                                            akzxVarM20.u();
                                            defpackage.wor worVar7 = (defpackage.wor) akzxVarM20.b;
                                            j$.util.Objects.requireNonNull(wnzVar);
                                            worVar7.c = wnzVar;
                                            worVar7.b = 19;
                                            agsm.i(1099, abtrVar7.o((defpackage.wor) akzxVarM20.p()), "failed to show low quality transcript prompt", new java.lang.Object[0]);
                                        }
                                        wleVar2.k = j$.util.Optional.empty();
                                        aiftVar = new aift(4);
                                        amfvVar = amgqVar2.e;
                                        if (amfvVar == null) {
                                            amfvVar = amfv.a;
                                        }
                                        str2 = "XatuInterpreter.java";
                                        if ((amfvVar.b & 1) != 0) {
                                            amfvVar2 = amgqVar2.e;
                                            if (amfvVar2 == null) {
                                                amfvVar2 = amfv.a;
                                            }
                                            amfuVar = amfvVar2.c;
                                            if (amfuVar == null) {
                                                amfuVar = amfu.a;
                                            }
                                            it = amfuVar.b.iterator();
                                            while (it.hasNext()) {
                                                amftVar = (amft) it.next();
                                                akzxVarM = defpackage.wmz.a.m();
                                                long j8 = amftVar.e;
                                                akzxVarM.u();
                                                defpackage.wmz wmzVar115 = (defpackage.wmz) akzxVarM.b;
                                                wmzVar115.b |= i13;
                                                wmzVar115.e = j8;
                                                long j9 = amftVar.g;
                                                akzxVarM.u();
                                                defpackage.wmz wmzVar116 = (defpackage.wmz) akzxVarM.b;
                                                wmzVar116.b |= i17;
                                                wmzVar116.f = j9;
                                                int i112 = amftVar.h;
                                                akzxVarM.u();
                                                defpackage.wmz wmzVar117 = (defpackage.wmz) akzxVarM.b;
                                                wmzVar117.b |= 4;
                                                wmzVar117.g = i112;
                                                i6 = amftVar.c;
                                                iE = amjk.e(i6);
                                                i7 = iE - 1;
                                                if (iE != 0) {
                                                    throw null;
                                                }
                                                if (i7 != 0) {
                                                    java.util.Iterator it6 = it;
                                                    java.lang.String str112 = str2;
                                                    if (i6 == i13) {
                                                        amfpVar = (amfp) amftVar.d;
                                                    } else {
                                                        amfpVar = amfp.a;
                                                    }
                                                    amfyVar = amfpVar.d;
                                                    if (amfyVar == null) {
                                                        amfyVar = amfy.a;
                                                    }
                                                    akzx akzxVarM114 = defpackage.wnc.a.m();
                                                    java.lang.String str113 = amfyVar.c;
                                                    akzxVarM114.u();
                                                    defpackage.wnc wncVar11 = (defpackage.wnc) akzxVarM114.b;
                                                    j$.util.Objects.requireNonNull(str113);
                                                    wncVar11.b |= 1;
                                                    wncVar11.c = str113;
                                                    boolean zC10 = defpackage.wle.c(amfyVar);
                                                    akzxVarM114.u();
                                                    defpackage.wnc wncVar12 = (defpackage.wnc) akzxVarM114.b;
                                                    wncVar12.b |= 2;
                                                    wncVar12.d = zC10;
                                                    aify aifyVarA10 = defpackage.wle.a(amfyVar.d);
                                                    akzxVarM114.u();
                                                    wncVar = (defpackage.wnc) akzxVarM114.b;
                                                    alatVar2 = wncVar.e;
                                                    if (!alatVar2.c()) {
                                                        wncVar.e = alad.J(alatVar2);
                                                    }
                                                    akyl.i(aifyVarA10, wncVar.e);
                                                    defpackage.wnc wncVar13 = (defpackage.wnc) akzxVarM114.p();
                                                    akzxVarM.u();
                                                    defpackage.wmz wmzVar118 = (defpackage.wmz) akzxVarM.b;
                                                    j$.util.Objects.requireNonNull(wncVar13);
                                                    wmzVar118.d = wncVar13;
                                                    wmzVar118.c = 2;
                                                    aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                    it = it6;
                                                    str2 = str112;
                                                    i13 = 1;
                                                } else if (i7 != i13) {
                                                    java.lang.String str114 = str2;
                                                    if (i6 == i17) {
                                                        amgcVar = (amgc) amftVar.d;
                                                    } else {
                                                        amgcVar = amgc.a;
                                                    }
                                                    amfyVar3 = amgcVar.e;
                                                    if (amfyVar3 == null) {
                                                        amfyVar3 = amfy.a;
                                                    }
                                                    akzx akzxVarM115 = defpackage.wnb.a.m();
                                                    java.lang.String str115 = amfyVar3.c;
                                                    akzxVarM115.u();
                                                    defpackage.wnb wnbVar110 = (defpackage.wnb) akzxVarM115.b;
                                                    j$.util.Objects.requireNonNull(str115);
                                                    wnbVar110.b |= i13;
                                                    wnbVar110.c = str115;
                                                    boolean zC11 = defpackage.wle.c(amfyVar3);
                                                    akzxVarM115.u();
                                                    defpackage.wnb wnbVar111 = (defpackage.wnb) akzxVarM115.b;
                                                    wnbVar111.b |= i17;
                                                    wnbVar111.d = zC11;
                                                    java.lang.String str116 = amgcVar.c;
                                                    akzxVarM115.u();
                                                    defpackage.wnb wnbVar112 = (defpackage.wnb) akzxVarM115.b;
                                                    j$.util.Objects.requireNonNull(str116);
                                                    wnbVar112.b |= 8;
                                                    wnbVar112.f = str116;
                                                    iAN = a.aN(amgcVar.g);
                                                    if (iAN == 0) {
                                                        iAN = i13;
                                                    }
                                                    i8 = iAN - 1;
                                                    if (i8 != i13) {
                                                        i9 = 4;
                                                    } else if (i8 != i17) {
                                                        i9 = i17;
                                                    } else {
                                                        if (i8 == i16) {
                                                            throw new java.lang.IllegalStateException("invalid option state");
                                                        }
                                                        i9 = i16;
                                                    }
                                                    akzxVarM115.u();
                                                    defpackage.wnb wnbVar113 = (defpackage.wnb) akzxVarM115.b;
                                                    wnbVar113.e = i9 - 1;
                                                    wnbVar113.b |= 4;
                                                    aify aifyVarA11 = defpackage.wle.a(amfyVar3.d);
                                                    akzxVarM115.u();
                                                    wnbVar = (defpackage.wnb) akzxVarM115.b;
                                                    alatVar4 = wnbVar.g;
                                                    if (!alatVar4.c()) {
                                                        wnbVar.g = alad.J(alatVar4);
                                                    }
                                                    akyl.i(aifyVarA11, wnbVar.g);
                                                    amfvVar3 = amgqVar2.e;
                                                    if (amfvVar3 == null) {
                                                        amfvVar3 = amfv.a;
                                                    }
                                                    amfuVar2 = amfvVar3.c;
                                                    if (amfuVar2 == null) {
                                                        amfuVar2 = amfu.a;
                                                    }
                                                    alatVar5 = amfuVar2.b;
                                                    iIndexOf = alatVar5.indexOf(amftVar);
                                                    akzxVarM2 = defpackage.wna.a.m();
                                                    zNoneMatch = j$.util.Collection.-EL.stream(alatVar5).limit(iIndexOf).noneMatch(new vpl(amftVar, 12));
                                                    i10 = iIndexOf + 1;
                                                    z3 = i13;
                                                    zNoneMatch2 = j$.util.Collection.-EL.stream(alatVar5).skip(i10).noneMatch(new vpl(amftVar, 13));
                                                    if (iIndexOf > 0) {
                                                        amftVar2 = (amft) alatVar5.get(iIndexOf - 1);
                                                        i12 = amftVar2.c;
                                                        if (amjk.e(i12) != i17) {
                                                            z4 = zNoneMatch2;
                                                            i11 = i10;
                                                        } else {
                                                            if (i12 == i17) {
                                                                amgcVar3 = (amgc) amftVar2.d;
                                                            } else {
                                                                amgcVar3 = amgc.a;
                                                            }
                                                            amfyVar5 = amgcVar3.e;
                                                            if (amfyVar5 == null) {
                                                                amfyVar5 = amfy.a;
                                                            }
                                                            if (defpackage.wle.c(amfyVar5)) {
                                                                z4 = zNoneMatch2;
                                                                i11 = i10;
                                                            } else {
                                                                z4 = zNoneMatch2;
                                                                i11 = i10;
                                                            }
                                                        }
                                                        z5 = !z7;
                                                    } else {
                                                        z4 = zNoneMatch2;
                                                        i11 = i10;
                                                        z5 = false;
                                                    }
                                                    if (alatVar5.size() > i11) {
                                                        amft amftVar6 = (amft) alatVar5.get(i11);
                                                        if (amftVar.c == 2) {
                                                            amgcVar2 = (amgc) amftVar.d;
                                                        } else {
                                                            amgcVar2 = amgc.a;
                                                        }
                                                        amfyVar4 = amgcVar2.e;
                                                        if (amfyVar4 == null) {
                                                            amfyVar4 = amfy.a;
                                                        }
                                                        if (defpackage.wle.c(amfyVar4)) {
                                                            it2 = it;
                                                            z6 = z3 ? 1 : 0;
                                                        } else {
                                                            it2 = it;
                                                            z6 = z3 ? 1 : 0;
                                                        }
                                                    } else {
                                                        it2 = it;
                                                        z6 = z3 ? 1 : 0;
                                                    }
                                                    if (zNoneMatch) {
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar119 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar119.b |= 1;
                                                        wnaVar119.c = false;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar1110 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar1110.b |= 2;
                                                        wnaVar1110.d = z5;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar1111 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar1111.b |= 4;
                                                        wnaVar1111.e = z6;
                                                        wnaVar = (defpackage.wna) akzxVarM2.p();
                                                    } else if (z4) {
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar1112 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar1112.b |= 1;
                                                        wnaVar1112.c = false;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar1113 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar1113.b |= 2;
                                                        wnaVar1113.d = z3;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar1114 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar1114.b |= 4;
                                                        wnaVar1114.e = z3;
                                                        wnaVar = (defpackage.wna) akzxVarM2.p();
                                                    } else {
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar1115 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar1115.b = (wnaVar1115.b | (z3 ? 1 : 0)) == true ? 1 : 0;
                                                        wnaVar1115.c = z3;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar1116 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar1116.b |= 2;
                                                        wnaVar1116.d = false;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar1117 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar1117.b |= 4;
                                                        wnaVar1117.e = z6;
                                                        wnaVar = (defpackage.wna) akzxVarM2.p();
                                                    }
                                                    akzxVarM115.u();
                                                    defpackage.wnb wnbVar114 = (defpackage.wnb) akzxVarM115.b;
                                                    j$.util.Objects.requireNonNull(wnaVar);
                                                    wnbVar114.h = wnaVar;
                                                    wnbVar114.b |= 16;
                                                    akzxVarM.u();
                                                    defpackage.wmz wmzVar119 = (defpackage.wmz) akzxVarM.b;
                                                    defpackage.wnb wnbVar115 = (defpackage.wnb) akzxVarM115.p();
                                                    j$.util.Objects.requireNonNull(wnbVar115);
                                                    wmzVar119.d = wnbVar115;
                                                    wmzVar119.c = 3;
                                                    aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                    if (wleVar2.i.compareAndSet(false, true)) {
                                                        wleVar2.g.b(wleVar2.e, 3);
                                                    }
                                                    it = it2;
                                                    i13 = 1;
                                                    str2 = str114;
                                                } else if (i7 != i17) {
                                                    if (i7 != 5) {
                                                        str3 = str2;
                                                        if (i6 == 8) {
                                                            amgfVar = (amgf) amftVar.d;
                                                        } else {
                                                            amgfVar = amgf.a;
                                                        }
                                                        amfyVar2 = amgfVar.e;
                                                        if (amfyVar2 == null) {
                                                            amfyVar2 = amfy.a;
                                                        }
                                                        akzx akzxVarM116 = defpackage.wng.a.m();
                                                        java.lang.String str117 = amfyVar2.c;
                                                        akzxVarM116.u();
                                                        defpackage.wng wngVar11 = (defpackage.wng) akzxVarM116.b;
                                                        j$.util.Objects.requireNonNull(str117);
                                                        wngVar11.b |= i13;
                                                        wngVar11.c = str117;
                                                        boolean zC12 = defpackage.wle.c(amfyVar2);
                                                        akzxVarM116.u();
                                                        defpackage.wng wngVar12 = (defpackage.wng) akzxVarM116.b;
                                                        wngVar12.b |= i17;
                                                        wngVar12.d = zC12;
                                                        aify aifyVarA12 = defpackage.wle.a(amfyVar2.d);
                                                        akzxVarM116.u();
                                                        wngVar = (defpackage.wng) akzxVarM116.b;
                                                        alatVar3 = wngVar.e;
                                                        if (!alatVar3.c()) {
                                                            wngVar.e = alad.J(alatVar3);
                                                        }
                                                        akyl.i(aifyVarA12, wngVar.e);
                                                        akzxVarM.u();
                                                        defpackage.wmz wmzVar1110 = (defpackage.wmz) akzxVarM.b;
                                                        defpackage.wng wngVar13 = (defpackage.wng) akzxVarM116.p();
                                                        j$.util.Objects.requireNonNull(wngVar13);
                                                        wmzVar1110.d = wngVar13;
                                                        wmzVar1110.c = 5;
                                                        aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                    } else if (i7 != i15) {
                                                        str3 = str2;
                                                        if (i6 == 9) {
                                                            amgdVar = (amgd) amftVar.d;
                                                        } else {
                                                            amgdVar = amgd.a;
                                                        }
                                                        iAQ = a.aQ(amgdVar.c);
                                                        if (iAQ == 0) {
                                                            iAQ = i13;
                                                        }
                                                        if (iAQ == i17) {
                                                            akzx akzxVarM117 = defpackage.wnf.a.m();
                                                            defpackage.wne wneVar4 = defpackage.wne.LIVE;
                                                            akzxVarM117.u();
                                                            defpackage.wnf wnfVar7 = (defpackage.wnf) akzxVarM117.b;
                                                            wnfVar7.c = wneVar4.d;
                                                            wnfVar7.b |= i13;
                                                            akzxVarM.u();
                                                            defpackage.wmz wmzVar1111 = (defpackage.wmz) akzxVarM.b;
                                                            defpackage.wnf wnfVar8 = (defpackage.wnf) akzxVarM117.p();
                                                            j$.util.Objects.requireNonNull(wnfVar8);
                                                            wmzVar1111.d = wnfVar8;
                                                            wmzVar1111.c = i15;
                                                            aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                        }
                                                    } else if (i7 != 7) {
                                                        a.bI(defpackage.wle.a.d(), "Unhandled AmItem 'item' value", "com/android/dialer/xatu/impl/service/XatuInterpreter", "createXatuTreeItemsList", (char) 416, str2, zct.b);
                                                    } else {
                                                        a.bI(defpackage.wle.a.d(), "AmItem 'item' field not set", "com/android/dialer/xatu/impl/service/XatuInterpreter", "createXatuTreeItemsList", (char) 413, str2, zct.b);
                                                    }
                                                    str2 = str3;
                                                } else {
                                                    defpackage.wnd wndVar4 = defpackage.wnd.a;
                                                    akzxVarM.u();
                                                    defpackage.wmz wmzVar1112 = (defpackage.wmz) akzxVarM.b;
                                                    j$.util.Objects.requireNonNull(wndVar4);
                                                    wmzVar1112.d = wndVar4;
                                                    wmzVar1112.c = 4;
                                                    aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                }
                                                i15 = 6;
                                                i16 = 3;
                                                i17 = 2;
                                            }
                                            aifyVarH = aiftVar.h();
                                        } else {
                                            defpackage.wle.a.b().l("com/android/dialer/xatu/impl/service/XatuInterpreter", "createXatuTreeItemsList", 339, "XatuInterpreter.java").v("event has no AmLog");
                                            aifyVarH = aiftVar.h();
                                        }
                                        defpackage.abtr abtrVar8 = wleVar2.l;
                                        akzx akzxVarM118 = defpackage.wor.a.m();
                                        akzx akzxVarM119 = defpackage.wog.a.m();
                                        akzxVarM119.u();
                                        wogVar = (defpackage.wog) akzxVarM119.b;
                                        alatVar = wogVar.b;
                                        if (!alatVar.c()) {
                                            wogVar.b = alad.J(alatVar);
                                        }
                                        akyl.i(aifyVarH, wogVar.b);
                                        defpackage.wog wogVar5 = (defpackage.wog) akzxVarM119.p();
                                        akzxVarM118.u();
                                        defpackage.wor worVar8 = (defpackage.wor) akzxVarM118.b;
                                        j$.util.Objects.requireNonNull(wogVar5);
                                        worVar8.c = wogVar5;
                                        worVar8.b = 6;
                                        agsm.i(1102, abtrVar8.o((defpackage.wor) akzxVarM118.p()), "failed to update latest tree items state", new java.lang.Object[0]);
                                        defpackage.wjb wjbVar5 = wleVar2.h;
                                        aooh.f(aifyVarH, "xatuTreeItems");
                                        agsm.i(1064, ahvr.F(new defpackage.whv(wjbVar5, aifyVarH, 3), wjbVar5.a), "failed to track items for logging", new java.lang.Object[0]);
                                        defpackage.wit witVar4 = wleVar2.b;
                                        agsm.i(1061, ahvr.E(new defpackage.wdm(witVar4, aifyVarH, 2), witVar4.a), "failed to track options", new java.lang.Object[0]);
                                        return;
                                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                        amgo amgoVar2 = i14 == 7 ? (amgo) amgqVar2.d : amgo.a;
                                        defpackage.wle.a.b().l("com/android/dialer/xatu/impl/service/XatuInterpreter", "handleTranscriptionModeUpdateEvent", 294, "XatuInterpreter.java").y("transcription mode update to: %s", defpackage.amgn.a(amgoVar2.b));
                                        akzx akzxVarM21 = defpackage.wor.a.m();
                                        int iOrdinal = defpackage.amgn.a(amgoVar2.b).ordinal();
                                        if (iOrdinal == 0) {
                                            defpackage.wnj wnjVar = defpackage.wnj.a;
                                            akzxVarM21.u();
                                            defpackage.wor worVar9 = (defpackage.wor) akzxVarM21.b;
                                            j$.util.Objects.requireNonNull(wnjVar);
                                            worVar9.c = wnjVar;
                                            worVar9.b = 16;
                                            wleVar2.h.b(amgoVar2, wleVar2.f);
                                        } else if (iOrdinal == 1) {
                                            long j10 = (amgoVar2.b == 3 ? (amgm) amgoVar2.c : amgm.a).c;
                                            akzx akzxVarM22 = defpackage.wni.a.m();
                                            akzxVarM22.u();
                                            defpackage.wni wniVar = (defpackage.wni) akzxVarM22.b;
                                            wniVar.b |= 1;
                                            wniVar.c = j10;
                                            defpackage.wni wniVar2 = (defpackage.wni) akzxVarM22.p();
                                            akzxVarM21.u();
                                            defpackage.wor worVar10 = (defpackage.wor) akzxVarM21.b;
                                            j$.util.Objects.requireNonNull(wniVar2);
                                            worVar10.c = wniVar2;
                                            worVar10.b = 14;
                                            java.lang.String str20 = (amgoVar2.b == 3 ? (amgm) amgoVar2.c : amgm.a).d;
                                            if (!str20.isEmpty()) {
                                                defpackage.wjb wjbVar6 = wleVar2.h;
                                                aooh.f(str20, "version");
                                                agsm.i(1066, ahvr.F(new defpackage.aayb(wjbVar6, str20, 1), wjbVar6.a), "failed to track version for logging", new java.lang.Object[0]);
                                            }
                                            agsm.i(1092, wleVar2.m.R(oqt.g), "failed to log Xatu Show Ahead available HaTS event", new java.lang.Object[0]);
                                            wleVar2.h.b(amgoVar2, wleVar2.f);
                                        } else if (iOrdinal == 2) {
                                            throw new java.lang.IllegalArgumentException("transcription mode not set");
                                        }
                                        agsm.i(1091, wleVar2.l.o((defpackage.wor) akzxVarM21.p()), "Failed to update transcription mode", new java.lang.Object[0]);
                                        wleVar2.k = j$.util.Optional.of(amgoVar2);
                                        aiftVar = new aift(4);
                                        amfvVar = amgqVar2.e;
                                        if (amfvVar == null) {
                                            amfvVar = amfv.a;
                                        }
                                        str2 = "XatuInterpreter.java";
                                        if ((amfvVar.b & 1) != 0) {
                                            amfvVar2 = amgqVar2.e;
                                            if (amfvVar2 == null) {
                                                amfvVar2 = amfv.a;
                                            }
                                            amfuVar = amfvVar2.c;
                                            if (amfuVar == null) {
                                                amfuVar = amfu.a;
                                            }
                                            it = amfuVar.b.iterator();
                                            while (it.hasNext()) {
                                                amftVar = (amft) it.next();
                                                akzxVarM = defpackage.wmz.a.m();
                                                long j11 = amftVar.e;
                                                akzxVarM.u();
                                                defpackage.wmz wmzVar1113 = (defpackage.wmz) akzxVarM.b;
                                                wmzVar1113.b |= i13;
                                                wmzVar1113.e = j11;
                                                long j12 = amftVar.g;
                                                akzxVarM.u();
                                                defpackage.wmz wmzVar1114 = (defpackage.wmz) akzxVarM.b;
                                                wmzVar1114.b |= i17;
                                                wmzVar1114.f = j12;
                                                int i113 = amftVar.h;
                                                akzxVarM.u();
                                                defpackage.wmz wmzVar1115 = (defpackage.wmz) akzxVarM.b;
                                                wmzVar1115.b |= 4;
                                                wmzVar1115.g = i113;
                                                i6 = amftVar.c;
                                                iE = amjk.e(i6);
                                                i7 = iE - 1;
                                                if (iE != 0) {
                                                    throw null;
                                                }
                                                if (i7 != 0) {
                                                    java.util.Iterator it7 = it;
                                                    java.lang.String str118 = str2;
                                                    if (i6 == i13) {
                                                        amfpVar = (amfp) amftVar.d;
                                                    } else {
                                                        amfpVar = amfp.a;
                                                    }
                                                    amfyVar = amfpVar.d;
                                                    if (amfyVar == null) {
                                                        amfyVar = amfy.a;
                                                    }
                                                    akzx akzxVarM1110 = defpackage.wnc.a.m();
                                                    java.lang.String str119 = amfyVar.c;
                                                    akzxVarM1110.u();
                                                    defpackage.wnc wncVar14 = (defpackage.wnc) akzxVarM1110.b;
                                                    j$.util.Objects.requireNonNull(str119);
                                                    wncVar14.b |= 1;
                                                    wncVar14.c = str119;
                                                    boolean zC13 = defpackage.wle.c(amfyVar);
                                                    akzxVarM1110.u();
                                                    defpackage.wnc wncVar15 = (defpackage.wnc) akzxVarM1110.b;
                                                    wncVar15.b |= 2;
                                                    wncVar15.d = zC13;
                                                    aify aifyVarA13 = defpackage.wle.a(amfyVar.d);
                                                    akzxVarM1110.u();
                                                    wncVar = (defpackage.wnc) akzxVarM1110.b;
                                                    alatVar2 = wncVar.e;
                                                    if (!alatVar2.c()) {
                                                        wncVar.e = alad.J(alatVar2);
                                                    }
                                                    akyl.i(aifyVarA13, wncVar.e);
                                                    defpackage.wnc wncVar16 = (defpackage.wnc) akzxVarM1110.p();
                                                    akzxVarM.u();
                                                    defpackage.wmz wmzVar1116 = (defpackage.wmz) akzxVarM.b;
                                                    j$.util.Objects.requireNonNull(wncVar16);
                                                    wmzVar1116.d = wncVar16;
                                                    wmzVar1116.c = 2;
                                                    aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                    it = it7;
                                                    str2 = str118;
                                                    i13 = 1;
                                                } else if (i7 != i13) {
                                                    java.lang.String str1110 = str2;
                                                    if (i6 == i17) {
                                                        amgcVar = (amgc) amftVar.d;
                                                    } else {
                                                        amgcVar = amgc.a;
                                                    }
                                                    amfyVar3 = amgcVar.e;
                                                    if (amfyVar3 == null) {
                                                        amfyVar3 = amfy.a;
                                                    }
                                                    akzx akzxVarM1111 = defpackage.wnb.a.m();
                                                    java.lang.String str1111 = amfyVar3.c;
                                                    akzxVarM1111.u();
                                                    defpackage.wnb wnbVar116 = (defpackage.wnb) akzxVarM1111.b;
                                                    j$.util.Objects.requireNonNull(str1111);
                                                    wnbVar116.b |= i13;
                                                    wnbVar116.c = str1111;
                                                    boolean zC14 = defpackage.wle.c(amfyVar3);
                                                    akzxVarM1111.u();
                                                    defpackage.wnb wnbVar117 = (defpackage.wnb) akzxVarM1111.b;
                                                    wnbVar117.b |= i17;
                                                    wnbVar117.d = zC14;
                                                    java.lang.String str1112 = amgcVar.c;
                                                    akzxVarM1111.u();
                                                    defpackage.wnb wnbVar118 = (defpackage.wnb) akzxVarM1111.b;
                                                    j$.util.Objects.requireNonNull(str1112);
                                                    wnbVar118.b |= 8;
                                                    wnbVar118.f = str1112;
                                                    iAN = a.aN(amgcVar.g);
                                                    if (iAN == 0) {
                                                        iAN = i13;
                                                    }
                                                    i8 = iAN - 1;
                                                    if (i8 != i13) {
                                                        i9 = 4;
                                                    } else if (i8 != i17) {
                                                        i9 = i17;
                                                    } else {
                                                        if (i8 == i16) {
                                                            throw new java.lang.IllegalStateException("invalid option state");
                                                        }
                                                        i9 = i16;
                                                    }
                                                    akzxVarM1111.u();
                                                    defpackage.wnb wnbVar119 = (defpackage.wnb) akzxVarM1111.b;
                                                    wnbVar119.e = i9 - 1;
                                                    wnbVar119.b |= 4;
                                                    aify aifyVarA14 = defpackage.wle.a(amfyVar3.d);
                                                    akzxVarM1111.u();
                                                    wnbVar = (defpackage.wnb) akzxVarM1111.b;
                                                    alatVar4 = wnbVar.g;
                                                    if (!alatVar4.c()) {
                                                        wnbVar.g = alad.J(alatVar4);
                                                    }
                                                    akyl.i(aifyVarA14, wnbVar.g);
                                                    amfvVar3 = amgqVar2.e;
                                                    if (amfvVar3 == null) {
                                                        amfvVar3 = amfv.a;
                                                    }
                                                    amfuVar2 = amfvVar3.c;
                                                    if (amfuVar2 == null) {
                                                        amfuVar2 = amfu.a;
                                                    }
                                                    alatVar5 = amfuVar2.b;
                                                    iIndexOf = alatVar5.indexOf(amftVar);
                                                    akzxVarM2 = defpackage.wna.a.m();
                                                    zNoneMatch = j$.util.Collection.-EL.stream(alatVar5).limit(iIndexOf).noneMatch(new vpl(amftVar, 12));
                                                    i10 = iIndexOf + 1;
                                                    z3 = i13;
                                                    zNoneMatch2 = j$.util.Collection.-EL.stream(alatVar5).skip(i10).noneMatch(new vpl(amftVar, 13));
                                                    if (iIndexOf > 0) {
                                                        amftVar2 = (amft) alatVar5.get(iIndexOf - 1);
                                                        i12 = amftVar2.c;
                                                        if (amjk.e(i12) != i17) {
                                                            z4 = zNoneMatch2;
                                                            i11 = i10;
                                                        } else {
                                                            if (i12 == i17) {
                                                                amgcVar3 = (amgc) amftVar2.d;
                                                            } else {
                                                                amgcVar3 = amgc.a;
                                                            }
                                                            amfyVar5 = amgcVar3.e;
                                                            if (amfyVar5 == null) {
                                                                amfyVar5 = amfy.a;
                                                            }
                                                            if (defpackage.wle.c(amfyVar5)) {
                                                                z4 = zNoneMatch2;
                                                                i11 = i10;
                                                            } else {
                                                                z4 = zNoneMatch2;
                                                                i11 = i10;
                                                            }
                                                        }
                                                        z5 = !z7;
                                                    } else {
                                                        z4 = zNoneMatch2;
                                                        i11 = i10;
                                                        z5 = false;
                                                    }
                                                    if (alatVar5.size() > i11) {
                                                        amft amftVar7 = (amft) alatVar5.get(i11);
                                                        if (amftVar.c == 2) {
                                                            amgcVar2 = (amgc) amftVar.d;
                                                        } else {
                                                            amgcVar2 = amgc.a;
                                                        }
                                                        amfyVar4 = amgcVar2.e;
                                                        if (amfyVar4 == null) {
                                                            amfyVar4 = amfy.a;
                                                        }
                                                        if (defpackage.wle.c(amfyVar4)) {
                                                            it2 = it;
                                                            z6 = z3 ? 1 : 0;
                                                        } else {
                                                            it2 = it;
                                                            z6 = z3 ? 1 : 0;
                                                        }
                                                    } else {
                                                        it2 = it;
                                                        z6 = z3 ? 1 : 0;
                                                    }
                                                    if (zNoneMatch) {
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar1118 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar1118.b |= 1;
                                                        wnaVar1118.c = false;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar1119 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar1119.b |= 2;
                                                        wnaVar1119.d = z5;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar11110 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar11110.b |= 4;
                                                        wnaVar11110.e = z6;
                                                        wnaVar = (defpackage.wna) akzxVarM2.p();
                                                    } else if (z4) {
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar11111 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar11111.b |= 1;
                                                        wnaVar11111.c = false;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar11112 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar11112.b |= 2;
                                                        wnaVar11112.d = z3;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar11113 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar11113.b |= 4;
                                                        wnaVar11113.e = z3;
                                                        wnaVar = (defpackage.wna) akzxVarM2.p();
                                                    } else {
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar11114 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar11114.b = (wnaVar11114.b | (z3 ? 1 : 0)) == true ? 1 : 0;
                                                        wnaVar11114.c = z3;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar11115 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar11115.b |= 2;
                                                        wnaVar11115.d = false;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar11116 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar11116.b |= 4;
                                                        wnaVar11116.e = z6;
                                                        wnaVar = (defpackage.wna) akzxVarM2.p();
                                                    }
                                                    akzxVarM1111.u();
                                                    defpackage.wnb wnbVar1110 = (defpackage.wnb) akzxVarM1111.b;
                                                    j$.util.Objects.requireNonNull(wnaVar);
                                                    wnbVar1110.h = wnaVar;
                                                    wnbVar1110.b |= 16;
                                                    akzxVarM.u();
                                                    defpackage.wmz wmzVar1117 = (defpackage.wmz) akzxVarM.b;
                                                    defpackage.wnb wnbVar1111 = (defpackage.wnb) akzxVarM1111.p();
                                                    j$.util.Objects.requireNonNull(wnbVar1111);
                                                    wmzVar1117.d = wnbVar1111;
                                                    wmzVar1117.c = 3;
                                                    aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                    if (wleVar2.i.compareAndSet(false, true)) {
                                                        wleVar2.g.b(wleVar2.e, 3);
                                                    }
                                                    it = it2;
                                                    i13 = 1;
                                                    str2 = str1110;
                                                } else if (i7 != i17) {
                                                    if (i7 != 5) {
                                                        str3 = str2;
                                                        if (i6 == 8) {
                                                            amgfVar = (amgf) amftVar.d;
                                                        } else {
                                                            amgfVar = amgf.a;
                                                        }
                                                        amfyVar2 = amgfVar.e;
                                                        if (amfyVar2 == null) {
                                                            amfyVar2 = amfy.a;
                                                        }
                                                        akzx akzxVarM1112 = defpackage.wng.a.m();
                                                        java.lang.String str1113 = amfyVar2.c;
                                                        akzxVarM1112.u();
                                                        defpackage.wng wngVar14 = (defpackage.wng) akzxVarM1112.b;
                                                        j$.util.Objects.requireNonNull(str1113);
                                                        wngVar14.b |= i13;
                                                        wngVar14.c = str1113;
                                                        boolean zC15 = defpackage.wle.c(amfyVar2);
                                                        akzxVarM1112.u();
                                                        defpackage.wng wngVar15 = (defpackage.wng) akzxVarM1112.b;
                                                        wngVar15.b |= i17;
                                                        wngVar15.d = zC15;
                                                        aify aifyVarA15 = defpackage.wle.a(amfyVar2.d);
                                                        akzxVarM1112.u();
                                                        wngVar = (defpackage.wng) akzxVarM1112.b;
                                                        alatVar3 = wngVar.e;
                                                        if (!alatVar3.c()) {
                                                            wngVar.e = alad.J(alatVar3);
                                                        }
                                                        akyl.i(aifyVarA15, wngVar.e);
                                                        akzxVarM.u();
                                                        defpackage.wmz wmzVar1118 = (defpackage.wmz) akzxVarM.b;
                                                        defpackage.wng wngVar16 = (defpackage.wng) akzxVarM1112.p();
                                                        j$.util.Objects.requireNonNull(wngVar16);
                                                        wmzVar1118.d = wngVar16;
                                                        wmzVar1118.c = 5;
                                                        aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                    } else if (i7 != i15) {
                                                        str3 = str2;
                                                        if (i6 == 9) {
                                                            amgdVar = (amgd) amftVar.d;
                                                        } else {
                                                            amgdVar = amgd.a;
                                                        }
                                                        iAQ = a.aQ(amgdVar.c);
                                                        if (iAQ == 0) {
                                                            iAQ = i13;
                                                        }
                                                        if (iAQ == i17) {
                                                            akzx akzxVarM1113 = defpackage.wnf.a.m();
                                                            defpackage.wne wneVar5 = defpackage.wne.LIVE;
                                                            akzxVarM1113.u();
                                                            defpackage.wnf wnfVar9 = (defpackage.wnf) akzxVarM1113.b;
                                                            wnfVar9.c = wneVar5.d;
                                                            wnfVar9.b |= i13;
                                                            akzxVarM.u();
                                                            defpackage.wmz wmzVar1119 = (defpackage.wmz) akzxVarM.b;
                                                            defpackage.wnf wnfVar10 = (defpackage.wnf) akzxVarM1113.p();
                                                            j$.util.Objects.requireNonNull(wnfVar10);
                                                            wmzVar1119.d = wnfVar10;
                                                            wmzVar1119.c = i15;
                                                            aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                        }
                                                    } else if (i7 != 7) {
                                                        a.bI(defpackage.wle.a.d(), "Unhandled AmItem 'item' value", "com/android/dialer/xatu/impl/service/XatuInterpreter", "createXatuTreeItemsList", (char) 416, str2, zct.b);
                                                    } else {
                                                        a.bI(defpackage.wle.a.d(), "AmItem 'item' field not set", "com/android/dialer/xatu/impl/service/XatuInterpreter", "createXatuTreeItemsList", (char) 413, str2, zct.b);
                                                    }
                                                    str2 = str3;
                                                } else {
                                                    defpackage.wnd wndVar5 = defpackage.wnd.a;
                                                    akzxVarM.u();
                                                    defpackage.wmz wmzVar11110 = (defpackage.wmz) akzxVarM.b;
                                                    j$.util.Objects.requireNonNull(wndVar5);
                                                    wmzVar11110.d = wndVar5;
                                                    wmzVar11110.c = 4;
                                                    aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                }
                                                i15 = 6;
                                                i16 = 3;
                                                i17 = 2;
                                            }
                                            aifyVarH = aiftVar.h();
                                        } else {
                                            defpackage.wle.a.b().l("com/android/dialer/xatu/impl/service/XatuInterpreter", "createXatuTreeItemsList", 339, "XatuInterpreter.java").v("event has no AmLog");
                                            aifyVarH = aiftVar.h();
                                        }
                                        defpackage.abtr abtrVar9 = wleVar2.l;
                                        akzx akzxVarM1114 = defpackage.wor.a.m();
                                        akzx akzxVarM1115 = defpackage.wog.a.m();
                                        akzxVarM1115.u();
                                        wogVar = (defpackage.wog) akzxVarM1115.b;
                                        alatVar = wogVar.b;
                                        if (!alatVar.c()) {
                                            wogVar.b = alad.J(alatVar);
                                        }
                                        akyl.i(aifyVarH, wogVar.b);
                                        defpackage.wog wogVar6 = (defpackage.wog) akzxVarM1115.p();
                                        akzxVarM1114.u();
                                        defpackage.wor worVar11 = (defpackage.wor) akzxVarM1114.b;
                                        j$.util.Objects.requireNonNull(wogVar6);
                                        worVar11.c = wogVar6;
                                        worVar11.b = 6;
                                        agsm.i(1102, abtrVar9.o((defpackage.wor) akzxVarM1114.p()), "failed to update latest tree items state", new java.lang.Object[0]);
                                        defpackage.wjb wjbVar7 = wleVar2.h;
                                        aooh.f(aifyVarH, "xatuTreeItems");
                                        agsm.i(1064, ahvr.F(new defpackage.whv(wjbVar7, aifyVarH, 3), wjbVar7.a), "failed to track items for logging", new java.lang.Object[0]);
                                        defpackage.wit witVar5 = wleVar2.b;
                                        agsm.i(1061, ahvr.E(new defpackage.wdm(witVar5, aifyVarH, 2), witVar5.a), "failed to track options", new java.lang.Object[0]);
                                        return;
                                    default:
                                        aiftVar = new aift(4);
                                        amfvVar = amgqVar2.e;
                                        if (amfvVar == null) {
                                            amfvVar = amfv.a;
                                        }
                                        str2 = "XatuInterpreter.java";
                                        if ((amfvVar.b & 1) != 0) {
                                            amfvVar2 = amgqVar2.e;
                                            if (amfvVar2 == null) {
                                                amfvVar2 = amfv.a;
                                            }
                                            amfuVar = amfvVar2.c;
                                            if (amfuVar == null) {
                                                amfuVar = amfu.a;
                                            }
                                            it = amfuVar.b.iterator();
                                            while (it.hasNext()) {
                                                amftVar = (amft) it.next();
                                                akzxVarM = defpackage.wmz.a.m();
                                                long j13 = amftVar.e;
                                                akzxVarM.u();
                                                defpackage.wmz wmzVar11111 = (defpackage.wmz) akzxVarM.b;
                                                wmzVar11111.b |= i13;
                                                wmzVar11111.e = j13;
                                                long j14 = amftVar.g;
                                                akzxVarM.u();
                                                defpackage.wmz wmzVar11112 = (defpackage.wmz) akzxVarM.b;
                                                wmzVar11112.b |= i17;
                                                wmzVar11112.f = j14;
                                                int i114 = amftVar.h;
                                                akzxVarM.u();
                                                defpackage.wmz wmzVar11113 = (defpackage.wmz) akzxVarM.b;
                                                wmzVar11113.b |= 4;
                                                wmzVar11113.g = i114;
                                                i6 = amftVar.c;
                                                iE = amjk.e(i6);
                                                i7 = iE - 1;
                                                if (iE != 0) {
                                                    throw null;
                                                }
                                                if (i7 != 0) {
                                                    java.util.Iterator it8 = it;
                                                    java.lang.String str1114 = str2;
                                                    if (i6 == i13) {
                                                        amfpVar = (amfp) amftVar.d;
                                                    } else {
                                                        amfpVar = amfp.a;
                                                    }
                                                    amfyVar = amfpVar.d;
                                                    if (amfyVar == null) {
                                                        amfyVar = amfy.a;
                                                    }
                                                    akzx akzxVarM1116 = defpackage.wnc.a.m();
                                                    java.lang.String str1115 = amfyVar.c;
                                                    akzxVarM1116.u();
                                                    defpackage.wnc wncVar17 = (defpackage.wnc) akzxVarM1116.b;
                                                    j$.util.Objects.requireNonNull(str1115);
                                                    wncVar17.b |= 1;
                                                    wncVar17.c = str1115;
                                                    boolean zC16 = defpackage.wle.c(amfyVar);
                                                    akzxVarM1116.u();
                                                    defpackage.wnc wncVar18 = (defpackage.wnc) akzxVarM1116.b;
                                                    wncVar18.b |= 2;
                                                    wncVar18.d = zC16;
                                                    aify aifyVarA16 = defpackage.wle.a(amfyVar.d);
                                                    akzxVarM1116.u();
                                                    wncVar = (defpackage.wnc) akzxVarM1116.b;
                                                    alatVar2 = wncVar.e;
                                                    if (!alatVar2.c()) {
                                                        wncVar.e = alad.J(alatVar2);
                                                    }
                                                    akyl.i(aifyVarA16, wncVar.e);
                                                    defpackage.wnc wncVar19 = (defpackage.wnc) akzxVarM1116.p();
                                                    akzxVarM.u();
                                                    defpackage.wmz wmzVar11114 = (defpackage.wmz) akzxVarM.b;
                                                    j$.util.Objects.requireNonNull(wncVar19);
                                                    wmzVar11114.d = wncVar19;
                                                    wmzVar11114.c = 2;
                                                    aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                    it = it8;
                                                    str2 = str1114;
                                                    i13 = 1;
                                                } else if (i7 != i13) {
                                                    java.lang.String str1116 = str2;
                                                    if (i6 == i17) {
                                                        amgcVar = (amgc) amftVar.d;
                                                    } else {
                                                        amgcVar = amgc.a;
                                                    }
                                                    amfyVar3 = amgcVar.e;
                                                    if (amfyVar3 == null) {
                                                        amfyVar3 = amfy.a;
                                                    }
                                                    akzx akzxVarM1117 = defpackage.wnb.a.m();
                                                    java.lang.String str1117 = amfyVar3.c;
                                                    akzxVarM1117.u();
                                                    defpackage.wnb wnbVar1112 = (defpackage.wnb) akzxVarM1117.b;
                                                    j$.util.Objects.requireNonNull(str1117);
                                                    wnbVar1112.b |= i13;
                                                    wnbVar1112.c = str1117;
                                                    boolean zC17 = defpackage.wle.c(amfyVar3);
                                                    akzxVarM1117.u();
                                                    defpackage.wnb wnbVar1113 = (defpackage.wnb) akzxVarM1117.b;
                                                    wnbVar1113.b |= i17;
                                                    wnbVar1113.d = zC17;
                                                    java.lang.String str1118 = amgcVar.c;
                                                    akzxVarM1117.u();
                                                    defpackage.wnb wnbVar1114 = (defpackage.wnb) akzxVarM1117.b;
                                                    j$.util.Objects.requireNonNull(str1118);
                                                    wnbVar1114.b |= 8;
                                                    wnbVar1114.f = str1118;
                                                    iAN = a.aN(amgcVar.g);
                                                    if (iAN == 0) {
                                                        iAN = i13;
                                                    }
                                                    i8 = iAN - 1;
                                                    if (i8 != i13) {
                                                        i9 = 4;
                                                    } else if (i8 != i17) {
                                                        i9 = i17;
                                                    } else {
                                                        if (i8 == i16) {
                                                            throw new java.lang.IllegalStateException("invalid option state");
                                                        }
                                                        i9 = i16;
                                                    }
                                                    akzxVarM1117.u();
                                                    defpackage.wnb wnbVar1115 = (defpackage.wnb) akzxVarM1117.b;
                                                    wnbVar1115.e = i9 - 1;
                                                    wnbVar1115.b |= 4;
                                                    aify aifyVarA17 = defpackage.wle.a(amfyVar3.d);
                                                    akzxVarM1117.u();
                                                    wnbVar = (defpackage.wnb) akzxVarM1117.b;
                                                    alatVar4 = wnbVar.g;
                                                    if (!alatVar4.c()) {
                                                        wnbVar.g = alad.J(alatVar4);
                                                    }
                                                    akyl.i(aifyVarA17, wnbVar.g);
                                                    amfvVar3 = amgqVar2.e;
                                                    if (amfvVar3 == null) {
                                                        amfvVar3 = amfv.a;
                                                    }
                                                    amfuVar2 = amfvVar3.c;
                                                    if (amfuVar2 == null) {
                                                        amfuVar2 = amfu.a;
                                                    }
                                                    alatVar5 = amfuVar2.b;
                                                    iIndexOf = alatVar5.indexOf(amftVar);
                                                    akzxVarM2 = defpackage.wna.a.m();
                                                    zNoneMatch = j$.util.Collection.-EL.stream(alatVar5).limit(iIndexOf).noneMatch(new vpl(amftVar, 12));
                                                    i10 = iIndexOf + 1;
                                                    z3 = i13;
                                                    zNoneMatch2 = j$.util.Collection.-EL.stream(alatVar5).skip(i10).noneMatch(new vpl(amftVar, 13));
                                                    if (iIndexOf > 0) {
                                                        amftVar2 = (amft) alatVar5.get(iIndexOf - 1);
                                                        i12 = amftVar2.c;
                                                        if (amjk.e(i12) != i17) {
                                                            z4 = zNoneMatch2;
                                                            i11 = i10;
                                                        } else {
                                                            if (i12 == i17) {
                                                                amgcVar3 = (amgc) amftVar2.d;
                                                            } else {
                                                                amgcVar3 = amgc.a;
                                                            }
                                                            amfyVar5 = amgcVar3.e;
                                                            if (amfyVar5 == null) {
                                                                amfyVar5 = amfy.a;
                                                            }
                                                            if (defpackage.wle.c(amfyVar5)) {
                                                                z4 = zNoneMatch2;
                                                                i11 = i10;
                                                            } else {
                                                                z4 = zNoneMatch2;
                                                                i11 = i10;
                                                            }
                                                        }
                                                        z5 = !z7;
                                                    } else {
                                                        z4 = zNoneMatch2;
                                                        i11 = i10;
                                                        z5 = false;
                                                    }
                                                    if (alatVar5.size() > i11) {
                                                        amft amftVar8 = (amft) alatVar5.get(i11);
                                                        if (amftVar.c == 2) {
                                                            amgcVar2 = (amgc) amftVar.d;
                                                        } else {
                                                            amgcVar2 = amgc.a;
                                                        }
                                                        amfyVar4 = amgcVar2.e;
                                                        if (amfyVar4 == null) {
                                                            amfyVar4 = amfy.a;
                                                        }
                                                        if (defpackage.wle.c(amfyVar4)) {
                                                            it2 = it;
                                                            z6 = z3 ? 1 : 0;
                                                        } else {
                                                            it2 = it;
                                                            z6 = z3 ? 1 : 0;
                                                        }
                                                    } else {
                                                        it2 = it;
                                                        z6 = z3 ? 1 : 0;
                                                    }
                                                    if (zNoneMatch) {
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar11117 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar11117.b |= 1;
                                                        wnaVar11117.c = false;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar11118 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar11118.b |= 2;
                                                        wnaVar11118.d = z5;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar11119 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar11119.b |= 4;
                                                        wnaVar11119.e = z6;
                                                        wnaVar = (defpackage.wna) akzxVarM2.p();
                                                    } else if (z4) {
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar111110 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar111110.b |= 1;
                                                        wnaVar111110.c = false;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar111111 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar111111.b |= 2;
                                                        wnaVar111111.d = z3;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar111112 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar111112.b |= 4;
                                                        wnaVar111112.e = z3;
                                                        wnaVar = (defpackage.wna) akzxVarM2.p();
                                                    } else {
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar111113 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar111113.b = (wnaVar111113.b | (z3 ? 1 : 0)) == true ? 1 : 0;
                                                        wnaVar111113.c = z3;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar111114 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar111114.b |= 2;
                                                        wnaVar111114.d = false;
                                                        akzxVarM2.u();
                                                        defpackage.wna wnaVar111115 = (defpackage.wna) akzxVarM2.b;
                                                        wnaVar111115.b |= 4;
                                                        wnaVar111115.e = z6;
                                                        wnaVar = (defpackage.wna) akzxVarM2.p();
                                                    }
                                                    akzxVarM1117.u();
                                                    defpackage.wnb wnbVar1116 = (defpackage.wnb) akzxVarM1117.b;
                                                    j$.util.Objects.requireNonNull(wnaVar);
                                                    wnbVar1116.h = wnaVar;
                                                    wnbVar1116.b |= 16;
                                                    akzxVarM.u();
                                                    defpackage.wmz wmzVar11115 = (defpackage.wmz) akzxVarM.b;
                                                    defpackage.wnb wnbVar1117 = (defpackage.wnb) akzxVarM1117.p();
                                                    j$.util.Objects.requireNonNull(wnbVar1117);
                                                    wmzVar11115.d = wnbVar1117;
                                                    wmzVar11115.c = 3;
                                                    aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                    if (wleVar2.i.compareAndSet(false, true)) {
                                                        wleVar2.g.b(wleVar2.e, 3);
                                                    }
                                                    it = it2;
                                                    i13 = 1;
                                                    str2 = str1116;
                                                } else if (i7 != i17) {
                                                    if (i7 != 5) {
                                                        str3 = str2;
                                                        if (i6 == 8) {
                                                            amgfVar = (amgf) amftVar.d;
                                                        } else {
                                                            amgfVar = amgf.a;
                                                        }
                                                        amfyVar2 = amgfVar.e;
                                                        if (amfyVar2 == null) {
                                                            amfyVar2 = amfy.a;
                                                        }
                                                        akzx akzxVarM1118 = defpackage.wng.a.m();
                                                        java.lang.String str1119 = amfyVar2.c;
                                                        akzxVarM1118.u();
                                                        defpackage.wng wngVar17 = (defpackage.wng) akzxVarM1118.b;
                                                        j$.util.Objects.requireNonNull(str1119);
                                                        wngVar17.b |= i13;
                                                        wngVar17.c = str1119;
                                                        boolean zC18 = defpackage.wle.c(amfyVar2);
                                                        akzxVarM1118.u();
                                                        defpackage.wng wngVar18 = (defpackage.wng) akzxVarM1118.b;
                                                        wngVar18.b |= i17;
                                                        wngVar18.d = zC18;
                                                        aify aifyVarA18 = defpackage.wle.a(amfyVar2.d);
                                                        akzxVarM1118.u();
                                                        wngVar = (defpackage.wng) akzxVarM1118.b;
                                                        alatVar3 = wngVar.e;
                                                        if (!alatVar3.c()) {
                                                            wngVar.e = alad.J(alatVar3);
                                                        }
                                                        akyl.i(aifyVarA18, wngVar.e);
                                                        akzxVarM.u();
                                                        defpackage.wmz wmzVar11116 = (defpackage.wmz) akzxVarM.b;
                                                        defpackage.wng wngVar19 = (defpackage.wng) akzxVarM1118.p();
                                                        j$.util.Objects.requireNonNull(wngVar19);
                                                        wmzVar11116.d = wngVar19;
                                                        wmzVar11116.c = 5;
                                                        aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                    } else if (i7 != i15) {
                                                        str3 = str2;
                                                        if (i6 == 9) {
                                                            amgdVar = (amgd) amftVar.d;
                                                        } else {
                                                            amgdVar = amgd.a;
                                                        }
                                                        iAQ = a.aQ(amgdVar.c);
                                                        if (iAQ == 0) {
                                                            iAQ = i13;
                                                        }
                                                        if (iAQ == i17) {
                                                            akzx akzxVarM1119 = defpackage.wnf.a.m();
                                                            defpackage.wne wneVar6 = defpackage.wne.LIVE;
                                                            akzxVarM1119.u();
                                                            defpackage.wnf wnfVar11 = (defpackage.wnf) akzxVarM1119.b;
                                                            wnfVar11.c = wneVar6.d;
                                                            wnfVar11.b |= i13;
                                                            akzxVarM.u();
                                                            defpackage.wmz wmzVar11117 = (defpackage.wmz) akzxVarM.b;
                                                            defpackage.wnf wnfVar12 = (defpackage.wnf) akzxVarM1119.p();
                                                            j$.util.Objects.requireNonNull(wnfVar12);
                                                            wmzVar11117.d = wnfVar12;
                                                            wmzVar11117.c = i15;
                                                            aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                        }
                                                    } else if (i7 != 7) {
                                                        a.bI(defpackage.wle.a.d(), "Unhandled AmItem 'item' value", "com/android/dialer/xatu/impl/service/XatuInterpreter", "createXatuTreeItemsList", (char) 416, str2, zct.b);
                                                    } else {
                                                        a.bI(defpackage.wle.a.d(), "AmItem 'item' field not set", "com/android/dialer/xatu/impl/service/XatuInterpreter", "createXatuTreeItemsList", (char) 413, str2, zct.b);
                                                    }
                                                    str2 = str3;
                                                } else {
                                                    defpackage.wnd wndVar6 = defpackage.wnd.a;
                                                    akzxVarM.u();
                                                    defpackage.wmz wmzVar11118 = (defpackage.wmz) akzxVarM.b;
                                                    j$.util.Objects.requireNonNull(wndVar6);
                                                    wmzVar11118.d = wndVar6;
                                                    wmzVar11118.c = 4;
                                                    aiftVar.i((defpackage.wmz) akzxVarM.p());
                                                }
                                                i15 = 6;
                                                i16 = 3;
                                                i17 = 2;
                                            }
                                            aifyVarH = aiftVar.h();
                                        } else {
                                            defpackage.wle.a.b().l("com/android/dialer/xatu/impl/service/XatuInterpreter", "createXatuTreeItemsList", 339, "XatuInterpreter.java").v("event has no AmLog");
                                            aifyVarH = aiftVar.h();
                                        }
                                        defpackage.abtr abtrVar10 = wleVar2.l;
                                        akzx akzxVarM11110 = defpackage.wor.a.m();
                                        akzx akzxVarM11111 = defpackage.wog.a.m();
                                        akzxVarM11111.u();
                                        wogVar = (defpackage.wog) akzxVarM11111.b;
                                        alatVar = wogVar.b;
                                        if (!alatVar.c()) {
                                            wogVar.b = alad.J(alatVar);
                                        }
                                        akyl.i(aifyVarH, wogVar.b);
                                        defpackage.wog wogVar7 = (defpackage.wog) akzxVarM11111.p();
                                        akzxVarM11110.u();
                                        defpackage.wor worVar12 = (defpackage.wor) akzxVarM11110.b;
                                        j$.util.Objects.requireNonNull(wogVar7);
                                        worVar12.c = wogVar7;
                                        worVar12.b = 6;
                                        agsm.i(1102, abtrVar10.o((defpackage.wor) akzxVarM11110.p()), "failed to update latest tree items state", new java.lang.Object[0]);
                                        defpackage.wjb wjbVar8 = wleVar2.h;
                                        aooh.f(aifyVarH, "xatuTreeItems");
                                        agsm.i(1064, ahvr.F(new defpackage.whv(wjbVar8, aifyVarH, 3), wjbVar8.a), "failed to track items for logging", new java.lang.Object[0]);
                                        defpackage.wit witVar6 = wleVar2.b;
                                        agsm.i(1061, ahvr.E(new defpackage.wdm(witVar6, aifyVarH, 2), witVar6.a), "failed to track options", new java.lang.Object[0]);
                                        return;
                                }
                            }
                        }, wleVar.c), "failed to handle pipeline result", new java.lang.Object[0]);
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aooc.af(obj);
                hgw hgwVarCl = pez.cl(defpackage.quf.a.m());
                hgwVarCl.W(2131231550);
                hgwVarCl.T(defpackage.qug.BUTTON_XATU);
                android.content.Context context = (android.content.Context) this.b;
                java.lang.String string = context.getString(2132021115);
                aooh.e(string, "getString(...)");
                hgwVarCl.Y(string);
                java.lang.String string2 = context.getString(2132021114);
                aooh.e(string2, "getString(...)");
                hgwVarCl.V(string2);
                hgwVarCl.U(defpackage.que.CALL_ASSIST);
                hgwVarCl.X(this.a == defpackage.zpo.f);
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(hgwVarCl.S());
                aooh.e(optionalOfNullable, "ofNullable(...)");
                return optionalOfNullable;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aooc.af(obj);
                defpackage.ytj ytjVar = (defpackage.ytj) this.b;
                aooh.e(ytjVar.c.getPackageManager(), "getPackageManager(...)");
                java.lang.Object obj5 = this.a;
                if (aooh.n(obj5, "com.google.android.aicore") && (packageInfoA = ytjVar.a((java.lang.String) obj5)) != null) {
                    if (((java.lang.Boolean) ytjVar.d.a()).booleanValue()) {
                        android.content.pm.ApplicationInfo applicationInfo = packageInfoA.applicationInfo;
                        boolean z3 = applicationInfo != null ? applicationInfo.enabled : false;
                        android.content.pm.ServiceInfo[] serviceInfoArr = packageInfoA.services;
                        if (serviceInfoArr != null) {
                            int i5 = 0;
                            while (true) {
                                if (i5 < serviceInfoArr.length) {
                                    android.content.pm.ServiceInfo serviceInfo = serviceInfoArr[i5];
                                    if (z3 && serviceInfo.enabled) {
                                        aooh.c(serviceInfo);
                                        if (defpackage.ytj.b.contains(serviceInfo.name)) {
                                            z = true;
                                        }
                                    }
                                    i5++;
                                }
                            }
                        }
                        z = false;
                    } else {
                        android.content.pm.ServiceInfo[] serviceInfoArr2 = packageInfoA.services;
                        if (serviceInfoArr2 != null) {
                            int i6 = 0;
                            while (true) {
                                if (i6 < serviceInfoArr2.length) {
                                    android.content.pm.ServiceInfo serviceInfo2 = serviceInfoArr2[i6];
                                    if (aooh.n(serviceInfo2.name, "com.google.android.apps.aicore.service.AiCoreService") || aooh.n(serviceInfo2.name, "com.google.android.apps.aicore.service.multiuser.AiCoreMultiUserService")) {
                                        z = true;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                        }
                        z = false;
                    }
                    defpackage.ytj.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/callcoreshared/aicore/ondeviceversion/OnDeviceVersion", "isStubAiCore", 78, "OnDeviceVersion.kt").y("isStubAiCore - hasService: %s", java.lang.Boolean.valueOf(z));
                    if (!z) {
                        z2 = true;
                    }
                }
                aimz aimzVar = defpackage.ytj.a;
                aimzVar.b().l("com/google/android/callcoreshared/aicore/ondeviceversion/OnDeviceVersion", "get$<anonymous>", 39, "OnDeviceVersion.kt").J("isStub: %s [%s]", obj5, z2);
                if (z2) {
                    return null;
                }
                android.content.pm.PackageInfo packageInfoA2 = ytjVar.a((java.lang.String) obj5);
                java.lang.Long l = packageInfoA2 != null ? new java.lang.Long(ft$.ExternalSyntheticApiModelOutline0.m(packageInfoA2)) : null;
                aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/google/android/callcoreshared/aicore/ondeviceversion/OnDeviceVersion", "get$<anonymous>", 46, "OnDeviceVersion.kt").I("onDeviceVersion: %s, %s", obj5, l);
                return l;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aooc.af(obj);
                java.lang.Object obj6 = this.a;
                java.lang.Object obj7 = this.b;
                ((defpackage.zdr) obj7).c.d(new uph(obj6, obj7, 16));
                ((defpackage.zdt) obj6).d.add(obj7);
                defpackage.zdt.a.b().l("com/google/android/callingshared/peertopeer/capabilities/CapabilityDataCommander", "registerChannelForIncomingData$<anonymous>", 154, "CapabilityDataCommander.kt").v("Channel and identity added for broadcasts.");
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aooc.af(obj);
                ((defpackage.zdt) this.a).d.remove(this.b);
                defpackage.zdt.a.b().l("com/google/android/callingshared/peertopeer/capabilities/CapabilityDataCommander", "unregisterChannel$<anonymous>", 163, "CapabilityDataCommander.kt").v("Channel and identity removed.");
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aooc.af(obj);
                defpackage.zfx zfxVar = (defpackage.zfx) this.b;
                defpackage.zfw zfwVar = zfxVar.c;
                if (zfwVar == null) {
                    zfwVar = defpackage.zfw.a;
                }
                defpackage.aprf aprfVar = (defpackage.aprf) ((defpackage.abtr) this.a).d.remove(zfwVar.b);
                if (aprfVar != null) {
                    if (zfxVar.d) {
                        aprfVar.a.w(defpackage.zfm.f);
                    } else {
                        aprfVar.a.w(defpackage.zfm.a);
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aooc.af(obj);
                return ((defpackage.abtr) this.b).d.remove(this.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(dvx.c((android.content.Context) ((defpackage.uyg) this.b).b, (java.lang.String) this.a) == 0);
            case 15:
                aooc.af(obj);
                try {
                    return ((defpackage.zhp) this.a).b.getLine1Number((android.telecom.PhoneAccountHandle) this.b);
                } catch (java.lang.SecurityException e2) {
                    defpackage.zhp.a.d().k(e2).l("com/google/android/callingshared/telephony/CallingTelecom", "getLine1Number$<anonymous>", 58, "CallingTelecom.kt").v("Error getting line 1 number");
                    return null;
                }
            case 16:
                aooc.af(obj);
                return aooh.q(((zjs) this.b).g((java.lang.String) this.a));
            case 17:
                aooc.af(obj);
                return ((zjs) this.b).g((java.lang.String) this.a);
            case 18:
                aooc.af(obj);
                return aooh.q(((zjs) this.b).h((java.lang.String) this.a));
            case 19:
                aooc.af(obj);
                return ((zjs) this.b).h((java.lang.String) this.a);
            default:
                aooc.af(obj);
                return aooh.q(((zjs) this.a).i((android.telecom.PhoneAccountHandle) this.b));
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, twh] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.tyf tyfVar;
        switch (this.$cid) {
            case 0:
                tyfVar = new defpackage.tyf((defpackage.typ) this.a, (defpackage.twh) this.b, aolnVar, 0);
                break;
            case 1:
                tyfVar = new defpackage.tyf((defpackage.txv) this.b, (akzc) this.a, aolnVar, 1);
                break;
            case 2:
                tyfVar = new defpackage.tyf((defpackage.typ) this.b, (akzc) this.a, aolnVar, 2);
                break;
            case 3:
                tyfVar = new defpackage.tyf((umx) this.b, (java.util.List) this.a, aolnVar, 3);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                tyfVar = new defpackage.tyf((j$.util.Optional) this.a, (defpackage.vjm) this.b, aolnVar, 4);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                tyfVar = new defpackage.tyf((defpackage.vvk) this.a, (android.telecom.PhoneAccountHandle) this.b, aolnVar, 5);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                tyfVar = new defpackage.tyf((defpackage.wjt) this.b, (altn) this.a, aolnVar, 6);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                tyfVar = new defpackage.tyf((alsi) this.a, (defpackage.wjt) this.b, aolnVar, 7);
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                tyfVar = new defpackage.tyf((android.content.Context) this.b, (defpackage.zpo) this.a, aolnVar, 8);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                tyfVar = new defpackage.tyf((defpackage.ytj) this.b, (java.lang.String) this.a, aolnVar, 9);
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                tyfVar = new defpackage.tyf((defpackage.zdr) this.b, (defpackage.zdt) this.a, aolnVar, 10);
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                tyfVar = new defpackage.tyf((defpackage.zdt) this.a, (defpackage.zdr) this.b, aolnVar, 11);
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                tyfVar = new defpackage.tyf((defpackage.abtr) this.a, (defpackage.zfx) this.b, aolnVar, 12);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                tyfVar = new defpackage.tyf((defpackage.abtr) this.b, (java.lang.String) this.a, aolnVar, 13);
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new defpackage.tyf((defpackage.uyg) this.b, aolnVar, 14);
            case 15:
                tyfVar = new defpackage.tyf((defpackage.zhp) this.a, (android.telecom.PhoneAccountHandle) this.b, aolnVar, 15);
                break;
            case 16:
                return new defpackage.tyf((zjs) this.b, aolnVar, 16);
            case 17:
                return new defpackage.tyf((zjs) this.b, aolnVar, 17, (byte[]) null);
            case 18:
                return new defpackage.tyf((zjs) this.b, aolnVar, 18, (char[]) null);
            case 19:
                return new defpackage.tyf((zjs) this.b, aolnVar, 19, (short[]) null);
            default:
                tyfVar = new defpackage.tyf((zjs) this.a, (android.telecom.PhoneAccountHandle) this.b, aolnVar, 20);
                break;
        }
        return tyfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(defpackage.abtr abtrVar, defpackage.zfx zfxVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = abtrVar;
        this.b = zfxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(alsi alsiVar, defpackage.wjt wjtVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = alsiVar;
        this.b = wjtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(android.content.Context context, defpackage.zpo zpoVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = context;
        this.a = zpoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(j$.util.Optional optional, defpackage.vjm vjmVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = optional;
        this.b = vjmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(defpackage.txv txvVar, akzc akzcVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = txvVar;
        this.a = akzcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(defpackage.typ typVar, akzc akzcVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = typVar;
        this.a = akzcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(defpackage.typ typVar, defpackage.twh twhVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = typVar;
        this.b = twhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(umx umxVar, java.util.List list, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = umxVar;
        this.a = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(defpackage.abtr abtrVar, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = abtrVar;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(defpackage.vvk vvkVar, android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = vvkVar;
        this.b = phoneAccountHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(defpackage.wjt wjtVar, altn altnVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = wjtVar;
        this.a = altnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(defpackage.ytj ytjVar, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ytjVar;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(defpackage.zdr zdrVar, defpackage.zdt zdtVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = zdrVar;
        this.a = zdtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(defpackage.zdt zdtVar, defpackage.zdr zdrVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zdtVar;
        this.b = zdrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(defpackage.zhp zhpVar, android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zhpVar;
        this.b = phoneAccountHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(zjs zjsVar, android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zjsVar;
        this.b = phoneAccountHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(zjs zjsVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = zjsVar;
        this.a = "tel";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(zjs zjsVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = zjsVar;
        this.a = "voicemail";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(zjs zjsVar, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = zjsVar;
        this.a = "tel";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyf(zjs zjsVar, aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = zjsVar;
        this.a = "tel";
    }
}
