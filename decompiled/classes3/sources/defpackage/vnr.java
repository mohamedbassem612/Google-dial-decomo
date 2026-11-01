package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vnr {
    private static final aimz c = aimz.i("com/android/dialer/voicemail/service/sodatranscribe/impl/VvmSodaTranscription");
    public final aoss a;
    public final ahda b;
    private final android.content.Context d;
    private final rlv e;
    private final vdo f;
    private final ruc g;
    private final aoin h;
    private final aoin i;
    private final defpackage.twu j;

    public vnr(android.content.Context context, aoss aossVar, defpackage.twu twuVar, rlv rlvVar, vdo vdoVar, ruc rucVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(context, "appContext");
        aooh.f(aossVar, "backgroundScope");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(rucVar, "metrics");
        aooh.f(aoinVar, "preferOfflineTranscriptionForVvmSoda");
        this.d = context;
        this.a = aossVar;
        this.j = twuVar;
        this.e = rlvVar;
        this.f = vdoVar;
        this.g = rucVar;
        this.h = aoinVar;
        this.i = aoinVar2;
        this.b = new ahda((byte[]) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(android.net.Uri uri, java.lang.Exception exc, aeun aeunVar, aoln aolnVar) {
        defpackage.vnm vnmVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.vnm) {
            vnmVar = (defpackage.vnm) aolnVar;
            int i = vnmVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vnmVar.d = i - Integer.MIN_VALUE;
            } else {
                vnmVar = new defpackage.vnm(this, aolnVar);
            }
        } else {
            vnmVar = new defpackage.vnm(this, aolnVar);
        }
        java.lang.Object obj2 = vnmVar.b;
        aolu aoluVar = aolu.a;
        int i2 = vnmVar.d;
        if (i2 == 0) {
            aooc.af(obj2);
            if (aeunVar != null) {
                this.g.q(aeunVar, ruc.bD, rub.c);
            }
            c.c().k(exc).l("com/android/dialer/voicemail/service/sodatranscribe/impl/VvmSodaTranscription", "handleDecodingError", 214, "VvmSodaTranscription.kt").v("soda transcription failed when decoding audio");
            this.e.o(rmx.nq);
            defpackage.uzm uzmVar = defpackage.uzm.TRANSCRIPTION_FAILED;
            vnmVar.a = exc;
            vnmVar.d = 1;
            obj = exc;
            if (e(uri, null, uzmVar, vnmVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj3 = vnmVar.a;
            aooc.af(obj2);
            obj = obj3;
        }
        return ((obj instanceof android.media.MediaCodec.CodecException) && ((android.media.MediaCodec.CodecException) obj).isTransient()) ? new gse() : new gsf();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(android.net.Uri uri, defpackage.twe tweVar, aeun aeunVar, aoln aolnVar) throws aois {
        defpackage.vnn vnnVar;
        rmx rmxVar;
        if (aolnVar instanceof defpackage.vnn) {
            vnnVar = (defpackage.vnn) aolnVar;
            int i = vnnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vnnVar.c = i - Integer.MIN_VALUE;
            } else {
                vnnVar = new defpackage.vnn(this, aolnVar);
            }
        } else {
            vnnVar = new defpackage.vnn(this, aolnVar);
        }
        java.lang.Object obj = vnnVar.a;
        aolu aoluVar = aolu.a;
        int i2 = vnnVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (aeunVar != null) {
                this.g.q(aeunVar, ruc.bD, rub.c);
            }
            aimz aimzVar = c;
            aimzVar.c().i(zct.b).k(tweVar).l("com/android/dialer/voicemail/service/sodatranscribe/impl/VvmSodaTranscription", "handleTranscriptionFailure", 180, "VvmSodaTranscription.kt").v("soda transcription failed");
            rlv rlvVar = this.e;
            defpackage.twg twgVar = tweVar.a;
            if (twgVar != null) {
                switch (twgVar.ordinal()) {
                    case 0:
                        rmxVar = rmx.nn;
                        break;
                    case 1:
                        rmxVar = rmx.no;
                        break;
                    case 2:
                        rmxVar = rmx.np;
                        break;
                    case 3:
                        rmxVar = rmx.nq;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        rmxVar = rmx.nr;
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        rmxVar = rmx.ns;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        rmxVar = rmx.nx;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        rmxVar = rmx.nt;
                        break;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        rmxVar = rmx.nu;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        rmxVar = rmx.nv;
                        break;
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                        rmxVar = rmx.nw;
                        break;
                    case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                        rmxVar = rmx.ny;
                        break;
                    case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                        rmxVar = rmx.nz;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                        rmxVar = rmx.nA;
                        break;
                    case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                        rmxVar = rmx.nB;
                        break;
                    case 15:
                        rmxVar = rmx.nC;
                        break;
                    case 16:
                        rmxVar = rmx.nD;
                        break;
                    case 17:
                        rmxVar = rmx.nF;
                        break;
                    case 18:
                        rmxVar = rmx.nE;
                        break;
                    case 19:
                        rmxVar = rmx.nG;
                        break;
                    case 20:
                        rmxVar = rmx.nH;
                        break;
                    case 21:
                        rmxVar = rmx.nI;
                        break;
                    case 22:
                        rmxVar = rmx.nJ;
                        break;
                    case 23:
                        rmxVar = rmx.nK;
                        break;
                    case 24:
                        rmxVar = rmx.nL;
                        break;
                    case 25:
                        aimzVar.d().l("com/android/dialer/voicemail/service/sodatranscribe/impl/VvmSodaTranscription", "getSodaVvmErrorImpression", 292, "VvmSodaTranscription.kt").v("Unhandled AiCore app quota error");
                        rmxVar = rmx.nn;
                        break;
                    default:
                        throw new aois();
                }
            } else {
                rmxVar = rmx.nn;
            }
            rlvVar.o(rmxVar);
            rlvVar.o(rmx.ll);
            defpackage.uzm uzmVar = defpackage.uzm.TRANSCRIPTION_FAILED;
            vnnVar.d = tweVar;
            vnnVar.c = 1;
            if (e(uri, null, uzmVar, vnnVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tweVar = vnnVar.d;
            aooc.af(obj);
        }
        defpackage.twg twgVar2 = tweVar.a;
        return (twgVar2 == defpackage.twg.j || twgVar2 == defpackage.twg.n) ? new gsf() : new gsd();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(android.net.Uri uri, java.lang.String str, aeun aeunVar, aoln aolnVar) {
        defpackage.vno vnoVar;
        if (aolnVar instanceof defpackage.vno) {
            vnoVar = (defpackage.vno) aolnVar;
            int i = vnoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vnoVar.c = i - Integer.MIN_VALUE;
            } else {
                vnoVar = new defpackage.vno(this, aolnVar);
            }
        } else {
            vnoVar = new defpackage.vno(this, aolnVar);
        }
        java.lang.Object obj = vnoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = vnoVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (aeunVar != null) {
                this.g.q(aeunVar, ruc.bD, rub.b);
            }
            c.b().l("com/android/dialer/voicemail/service/sodatranscribe/impl/VvmSodaTranscription", "handleTranscriptionSuccess", 158, "VvmSodaTranscription.kt").v("soda transcription succeeded");
            this.e.o(rmx.lk);
            defpackage.uzm uzmVar = defpackage.uzm.TRANSCRIPTION_AVAILABLE;
            vnoVar.c = 1;
            if (e(uri, str, uzmVar, vnoVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return new gsf();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080 A[Catch: Exception -> 0x012c, IOException -> 0x0149, CancellationException -> 0x016f, TRY_LEAVE, TryCatch #9 {IOException -> 0x0149, CancellationException -> 0x016f, Exception -> 0x012c, blocks: (B:25:0x006f, B:27:0x0080, B:33:0x009b, B:68:0x0120, B:69:0x0123, B:70:0x0124, B:71:0x012b), top: B:103:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:30:0x008f A[Catch: all -> 0x011c, TRY_LEAVE, TryCatch #7 {all -> 0x011c, blocks: (B:28:0x008b, B:30:0x008f, B:32:0x0098, B:60:0x0110, B:61:0x0113, B:62:0x0114, B:63:0x011b, B:31:0x0095, B:58:0x010e), top: B:98:0x008b, inners: #6, #9 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5 A[Catch: twe -> 0x00f2, CancellationException -> 0x0109, TryCatch #2 {twe -> 0x00f2, blocks: (B:34:0x009e, B:36:0x00b5, B:38:0x00d2, B:37:0x00c3), top: B:92:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3 A[Catch: twe -> 0x00f2, CancellationException -> 0x0109, TryCatch #2 {twe -> 0x00f2, blocks: (B:34:0x009e, B:36:0x00b5, B:38:0x00d2, B:37:0x00c3), top: B:92:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:62:0x0114 A[Catch: all -> 0x011c, TryCatch #7 {all -> 0x011c, blocks: (B:28:0x008b, B:30:0x008f, B:32:0x0098, B:60:0x0110, B:61:0x0113, B:62:0x0114, B:63:0x011b, B:31:0x0095, B:58:0x010e), top: B:98:0x008b, inners: #6, #9 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0124 A[Catch: Exception -> 0x012c, IOException -> 0x0149, CancellationException -> 0x016f, TryCatch #9 {IOException -> 0x0149, CancellationException -> 0x016f, Exception -> 0x012c, blocks: (B:25:0x006f, B:27:0x0080, B:33:0x009b, B:68:0x0120, B:69:0x0123, B:70:0x0124, B:71:0x012b), top: B:103:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
    
        if (r0 != r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
    
        if (r0 == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0145, code lost:
    
        if (r13 == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0163, code lost:
    
        if (r13 == r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0168, code lost:
    
        return r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.net.Uri r14, aoln r15) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vnr.d(android.net.Uri, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(android.net.Uri uri, java.lang.String str, defpackage.uzm uzmVar, aoln aolnVar) {
        defpackage.vnq vnqVar;
        if (aolnVar instanceof defpackage.vnq) {
            vnqVar = (defpackage.vnq) aolnVar;
            int i = vnqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vnqVar.c = i - Integer.MIN_VALUE;
            } else {
                vnqVar = new defpackage.vnq(this, aolnVar);
            }
        } else {
            vnqVar = new defpackage.vnq(this, aolnVar);
        }
        java.lang.Object objD = vnqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = vnqVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            c.b().l("com/android/dialer/voicemail/service/sodatranscribe/impl/VvmSodaTranscription", "updateTranscriptionAndState", 235, "VvmSodaTranscription.kt").I("uri: %s, state: %s", uri, uzmVar);
            defpackage.vdm vdmVar = new defpackage.vdm();
            vdmVar.c(j$.util.Optional.ofNullable(str));
            vdmVar.d(j$.util.Optional.of(uzmVar));
            ajcq ajcqVarH = this.f.h(uri, vdmVar.a());
            vnqVar.c = 1;
            objD = aosv.D(ajcqVarH, vnqVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Integer num = (java.lang.Integer) objD;
        if (num == null || num.intValue() != 1) {
            aimw aimwVarL = c.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/service/sodatranscribe/impl/VvmSodaTranscription", "updateTranscriptionAndState", 247, "VvmSodaTranscription.kt");
            aooh.c(num);
            aimwVarL.w("Wrong row count, should have updated 1 row, was: %d", num.intValue());
        }
        return aojh.a;
    }
}
