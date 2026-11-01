package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yyk implements defpackage.yzt {
    private static final aenj a = new aenj("SharpieAiCoreQueryLatency");
    private final defpackage.ysf b;
    private final yvp c;
    private final aenl d;
    private final java.util.Set e;
    private final ugs f;
    private final defpackage.yzk g;
    private final tmi h;
    private final zzx i;

    public yyk(ugs ugsVar, zzx zzxVar, defpackage.yzk yzkVar, tmi tmiVar, defpackage.ysf ysfVar, yvp yvpVar, aenl aenlVar) {
        aooh.f(tmiVar, "sharpieConfigProvider");
        aooh.f(aenlVar, "primes");
        this.f = ugsVar;
        this.i = zzxVar;
        this.g = yzkVar;
        this.h = tmiVar;
        this.b = ysfVar;
        this.c = yvpVar;
        this.d = aenlVar;
        this.e = new java.util.LinkedHashSet();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.yyg yygVar;
        defpackage.abaz abazVar;
        aokv aokvVar;
        aokv aokvVar2;
        if (aolnVar instanceof defpackage.yyg) {
            yygVar = (defpackage.yyg) aolnVar;
            int i = yygVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yygVar.c = i - Integer.MIN_VALUE;
            } else {
                yygVar = new defpackage.yyg(this, aolnVar);
            }
        } else {
            yygVar = new defpackage.yyg(this, aolnVar);
        }
        java.lang.Object obj = yygVar.a;
        aolu aoluVar = aolu.a;
        int i2 = yygVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            defpackage.abaz abazVar2 = defpackage.abba.a;
            aokv aokvVar3 = new aokv(10);
            aokvVar3.add(aaoo.H(ajsz.cr(this.e, "|", "|", "|", (aonj) null, 56), "en"));
            tmi tmiVar = this.h;
            yygVar.e = aokvVar3;
            yygVar.f = aokvVar3;
            yygVar.d = abazVar2;
            yygVar.c = 1;
            java.lang.Object objB = tmiVar.b(yygVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            obj = objB;
            abazVar = abazVar2;
            aokvVar = aokvVar3;
            aokvVar2 = aokvVar;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abazVar = yygVar.d;
            aokvVar2 = yygVar.f;
            aokvVar = yygVar.e;
            aooc.af(obj);
        }
        akfg akfgVar = ((defpackage.yuw) obj).b.b;
        if (!akfgVar.c()) {
            aokvVar2.add(aaoo.I((java.lang.String) null, akfgVar.eW));
        }
        return abazVar.b(ajsz.aX(aokvVar));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:40:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:44:0x0115  */
    /* JADX WARN: Code duplicated, block: B:45:0x0118  */
    /* JADX WARN: Code duplicated, block: B:46:0x011b  */
    /* JADX WARN: Code duplicated, block: B:47:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0121  */
    /* JADX WARN: Code duplicated, block: B:49:0x0124  */
    /* JADX WARN: Code duplicated, block: B:50:0x0127  */
    /* JADX WARN: Code duplicated, block: B:51:0x012a  */
    /* JADX WARN: Code duplicated, block: B:52:0x012d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0130  */
    /* JADX WARN: Code duplicated, block: B:54:0x0133  */
    /* JADX WARN: Code duplicated, block: B:55:0x0136  */
    /* JADX WARN: Code duplicated, block: B:56:0x0139  */
    /* JADX WARN: Code duplicated, block: B:57:0x013c  */
    /* JADX WARN: Code duplicated, block: B:58:0x013f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0142  */
    /* JADX WARN: Code duplicated, block: B:60:0x0145  */
    /* JADX WARN: Code duplicated, block: B:61:0x0148  */
    /* JADX WARN: Code duplicated, block: B:62:0x014b  */
    /* JADX WARN: Code duplicated, block: B:63:0x014e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0151  */
    /* JADX WARN: Code duplicated, block: B:65:0x0154  */
    /* JADX WARN: Code duplicated, block: B:66:0x0157  */
    /* JADX WARN: Code duplicated, block: B:67:0x015a  */
    /* JADX WARN: Code duplicated, block: B:68:0x015d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0166  */
    /* JADX WARN: Code duplicated, block: B:72:0x016a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0178  */
    /* JADX WARN: Code duplicated, block: B:77:0x0180  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, yzz] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [yzz] */
    /* JADX WARN: Type inference failed for: r13v8 */
    @Override // defpackage.yzt
    public final java.lang.Object b(defpackage.yzz yzzVar, aoln aolnVar) throws aois {
        defpackage.yyh yyhVar;
        aeun aeunVarB;
        ahoq ahoqVarZ;
        java.lang.Object objB;
        ?? r13;
        defpackage.yzp yzpVar;
        defpackage.yxi yxiVar;
        zzx zzxVar;
        aeun aeunVar;
        defpackage.yxv yxvVar;
        if (aolnVar instanceof defpackage.yyh) {
            yyhVar = (defpackage.yyh) aolnVar;
            int i = yyhVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                yyhVar.e = i - Integer.MIN_VALUE;
            } else {
                yyhVar = new defpackage.yyh(this, aolnVar);
            }
        } else {
            yyhVar = new defpackage.yyh(this, aolnVar);
        }
        java.lang.Object objD = yyhVar.c;
        aolu zabVar = aolu.a;
        int i2 = yyhVar.e;
        try {
            if (i2 == 0) {
                aooc.af(objD);
                aeunVarB = this.d.b();
                if (!ahvr.R(yyhVar.u())) {
                    throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                ahoqVarZ = ahvr.Z(1197, "SharpieScamDetectionAiCoreIntentsQueryStrategy_detectScamInTranscriptWindow_query");
                try {
                    this.i.l(new zbq(defpackage.zbr.ac));
                    tmi tmiVar = this.h;
                    yyhVar.a = yzzVar;
                    yyhVar.b = aeunVarB;
                    yyhVar.f = ahoqVarZ;
                    yyhVar.e = 1;
                    objB = tmiVar.b(yyhVar);
                    r13 = yzzVar;
                    if (objB != zabVar) {
                    }
                    return zabVar;
                } catch (java.lang.Throwable th) {
                    th = th;
                    yzzVar = ahoqVarZ;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        ajsz.ak((java.io.Closeable) yzzVar, th);
                        throw th2;
                    }
                }
            }
            if (i2 == 1) {
                ahoq ahoqVar = yyhVar.f;
                aeunVarB = (aeun) yyhVar.b;
                defpackage.yzz yzzVar2 = (defpackage.yzz) yyhVar.a;
                aooc.af(objD);
                ahoqVarZ = ahoqVar;
                r13 = yzzVar2;
                objB = objD;
            } else {
                if (i2 == 2) {
                    java.io.Closeable closeable = (java.io.Closeable) yyhVar.b;
                    aeunVarB = (aeun) yyhVar.a;
                    aooc.af(objD);
                    yzzVar = closeable;
                    yzpVar = (defpackage.yzp) objD;
                    ajsz.ak((java.io.Closeable) yzzVar, (java.lang.Throwable) null);
                    yxiVar = new defpackage.yxi(yzpVar.a().a, null);
                    zzxVar = this.i;
                    zzxVar.l(new zbq(defpackage.zbr.ae));
                    j$.util.Objects.checkIndex(0, 3);
                    if (yzpVar != null) {
                        if (yzpVar instanceof defpackage.yzl) {
                            zzxVar.l(new zbq(defpackage.zbr.af));
                            switch (((defpackage.yzl) yzpVar).a - 1) {
                                case 1:
                                    yxvVar = defpackage.yxv.ALREADY_QUERYING;
                                    break;
                                case 2:
                                    yxvVar = defpackage.yxv.AICORE_FEATURE_UNAVAILABLE;
                                    break;
                                case 3:
                                    yxvVar = defpackage.yxv.AICORE_FEATURE_NOT_DOWNLOADED;
                                    break;
                                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                    yxvVar = defpackage.yxv.SUMMARIZATION_SERVICE_UNAVAILABLE;
                                    break;
                                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                    yxvVar = defpackage.yxv.LLM_SERVICE_UNAVAILABLE;
                                    break;
                                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                    yxvVar = defpackage.yxv.FAILED_TO_PREPARE_INFERENCE_ENGINE;
                                    break;
                                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                    yxvVar = defpackage.yxv.AICORE_UNKNOWN;
                                    break;
                                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                    yxvVar = defpackage.yxv.AICORE_BAD_INPUT;
                                    break;
                                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                    yxvVar = defpackage.yxv.AICORE_INTERNAL_ERROR;
                                    break;
                                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                    yxvVar = defpackage.yxv.AICORE_CANCELLED;
                                    break;
                                case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                    yxvVar = defpackage.yxv.AICORE_NOT_AVAILABLE;
                                    break;
                                case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                    yxvVar = defpackage.yxv.AICORE_BUSY;
                                    break;
                                case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                    yxvVar = defpackage.yxv.AICORE_SAFETY_ERROR;
                                    break;
                                case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                    yxvVar = defpackage.yxv.AICORE_DEADLINE_EXCEEDED;
                                    break;
                                case 15:
                                    yxvVar = defpackage.yxv.AICORE_UNAUTHENTICATED;
                                    break;
                                case 16:
                                    yxvVar = defpackage.yxv.AICORE_QUOTA_EXCEEDED;
                                    break;
                                case 17:
                                    yxvVar = defpackage.yxv.AICORE_SUSPENDED;
                                    break;
                                case 18:
                                    yxvVar = defpackage.yxv.AICORE_IPC_ERROR;
                                    break;
                                case 19:
                                    yxvVar = defpackage.yxv.AICORE_NOT_SUPPORTED;
                                    break;
                                case 20:
                                    yxvVar = defpackage.yxv.AICORE_PERMISSION_DENIED;
                                    break;
                                case 21:
                                    yxvVar = defpackage.yxv.AICORE_RESOURCE_EXHAUSTED;
                                    break;
                                case 22:
                                    yxvVar = defpackage.yxv.AICORE_TURN_FINISHED;
                                    break;
                                case 23:
                                    yxvVar = defpackage.yxv.AICORE_INTERNAL_ERROR_MODEL_LOAD_FAILED;
                                    break;
                                case 24:
                                    yxvVar = defpackage.yxv.AICORE_BACKGROUND_USE_BLOCKED;
                                    break;
                                default:
                                    yxvVar = defpackage.yxv.AICORE_OTHER;
                                    break;
                            }
                            zabVar = new defpackage.zab(new defpackage.yxu(yxvVar), yxiVar);
                        } else if (yzpVar instanceof defpackage.yzo) {
                            yyhVar.a = aeunVarB;
                            yyhVar.b = null;
                            yyhVar.e = 3;
                            objD = d((defpackage.yzo) yzpVar, yxiVar, yyhVar);
                            if (objD != zabVar) {
                                aeunVar = aeunVarB;
                            }
                        }
                        return zabVar;
                    }
                    throw new aois();
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aeunVar = (aeun) yyhVar.a;
                aooc.af(objD);
            }
            zabVar = (defpackage.zaf) objD;
            if (!(zabVar instanceof defpackage.zab)) {
                this.d.f(aeunVar, a, 1);
            }
            return zabVar;
            defpackage.yuu yuuVar = ((defpackage.yuw) objB).a;
            defpackage.yzk yzkVar = this.g;
            java.lang.String str = r13.a;
            int iS = anty.S(yuuVar);
            if (iS != 0) {
                if (iS != 1) {
                    throw new aois();
                }
                throw new java.lang.IllegalStateException("BertHades does not support AiCore feature ID");
            }
            defpackage.yzb yzbVar = new defpackage.yzb(str, this.b.a(((defpackage.yus) yuuVar).a), (int) this.c.a().b);
            yyhVar.a = aeunVarB;
            yyhVar.b = ahoqVarZ;
            yyhVar.f = null;
            yyhVar.e = 2;
            java.lang.Object objB2 = yzkVar.b(yzbVar, yyhVar);
            if (objB2 != zabVar) {
                ahoq ahoqVar2 = ahoqVarZ;
                objD = objB2;
                yzzVar = ahoqVar2;
                yzpVar = (defpackage.yzp) objD;
                ajsz.ak((java.io.Closeable) yzzVar, (java.lang.Throwable) null);
                yxiVar = new defpackage.yxi(yzpVar.a().a, null);
                zzxVar = this.i;
                zzxVar.l(new zbq(defpackage.zbr.ae));
                j$.util.Objects.checkIndex(0, 3);
                if (yzpVar != null) {
                    if (yzpVar instanceof defpackage.yzl) {
                        zzxVar.l(new zbq(defpackage.zbr.af));
                        switch (((defpackage.yzl) yzpVar).a - 1) {
                            case 1:
                                yxvVar = defpackage.yxv.ALREADY_QUERYING;
                                break;
                            case 2:
                                yxvVar = defpackage.yxv.AICORE_FEATURE_UNAVAILABLE;
                                break;
                            case 3:
                                yxvVar = defpackage.yxv.AICORE_FEATURE_NOT_DOWNLOADED;
                                break;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                yxvVar = defpackage.yxv.SUMMARIZATION_SERVICE_UNAVAILABLE;
                                break;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                yxvVar = defpackage.yxv.LLM_SERVICE_UNAVAILABLE;
                                break;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                yxvVar = defpackage.yxv.FAILED_TO_PREPARE_INFERENCE_ENGINE;
                                break;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                yxvVar = defpackage.yxv.AICORE_UNKNOWN;
                                break;
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                yxvVar = defpackage.yxv.AICORE_BAD_INPUT;
                                break;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                yxvVar = defpackage.yxv.AICORE_INTERNAL_ERROR;
                                break;
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                yxvVar = defpackage.yxv.AICORE_CANCELLED;
                                break;
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                yxvVar = defpackage.yxv.AICORE_NOT_AVAILABLE;
                                break;
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                yxvVar = defpackage.yxv.AICORE_BUSY;
                                break;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                yxvVar = defpackage.yxv.AICORE_SAFETY_ERROR;
                                break;
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                yxvVar = defpackage.yxv.AICORE_DEADLINE_EXCEEDED;
                                break;
                            case 15:
                                yxvVar = defpackage.yxv.AICORE_UNAUTHENTICATED;
                                break;
                            case 16:
                                yxvVar = defpackage.yxv.AICORE_QUOTA_EXCEEDED;
                                break;
                            case 17:
                                yxvVar = defpackage.yxv.AICORE_SUSPENDED;
                                break;
                            case 18:
                                yxvVar = defpackage.yxv.AICORE_IPC_ERROR;
                                break;
                            case 19:
                                yxvVar = defpackage.yxv.AICORE_NOT_SUPPORTED;
                                break;
                            case 20:
                                yxvVar = defpackage.yxv.AICORE_PERMISSION_DENIED;
                                break;
                            case 21:
                                yxvVar = defpackage.yxv.AICORE_RESOURCE_EXHAUSTED;
                                break;
                            case 22:
                                yxvVar = defpackage.yxv.AICORE_TURN_FINISHED;
                                break;
                            case 23:
                                yxvVar = defpackage.yxv.AICORE_INTERNAL_ERROR_MODEL_LOAD_FAILED;
                                break;
                            case 24:
                                yxvVar = defpackage.yxv.AICORE_BACKGROUND_USE_BLOCKED;
                                break;
                            default:
                                yxvVar = defpackage.yxv.AICORE_OTHER;
                                break;
                        }
                        zabVar = new defpackage.zab(new defpackage.yxu(yxvVar), yxiVar);
                    } else if (yzpVar instanceof defpackage.yzo) {
                        yyhVar.a = aeunVarB;
                        yyhVar.b = null;
                        yyhVar.e = 3;
                        objD = d((defpackage.yzo) yzpVar, yxiVar, yyhVar);
                        if (objD != zabVar) {
                            aeunVar = aeunVarB;
                            zabVar = (defpackage.zaf) objD;
                            if (!(zabVar instanceof defpackage.zab)) {
                                this.d.f(aeunVar, a, 1);
                            }
                        }
                    }
                }
                throw new aois();
            }
            return zabVar;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yzt
    public final java.lang.Object c(aoln aolnVar) throws aois {
        defpackage.yyi yyiVar;
        if (aolnVar instanceof defpackage.yyi) {
            yyiVar = (defpackage.yyi) aolnVar;
            int i = yyiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yyiVar.c = i - Integer.MIN_VALUE;
            } else {
                yyiVar = new defpackage.yyi(this, aolnVar);
            }
        } else {
            yyiVar = new defpackage.yyi(this, aolnVar);
        }
        java.lang.Object objA = yyiVar.a;
        aolu aoluVar = aolu.a;
        int i2 = yyiVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            defpackage.yzk yzkVar = this.g;
            yyiVar.c = 1;
            objA = yzkVar.a(yyiVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        defpackage.yze yzeVar = (defpackage.yze) objA;
        if (aooh.n(yzeVar, defpackage.yzc.a)) {
            return defpackage.yzu.a;
        }
        if (aooh.n(yzeVar, defpackage.yzd.a)) {
            return defpackage.yzv.a;
        }
        throw new aois();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0131  */
    /* JADX WARN: Code duplicated, block: B:58:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x013e A[Catch: all -> 0x0166, TryCatch #1 {all -> 0x0166, blocks: (B:13:0x002c, B:56:0x0132, B:59:0x013e, B:60:0x014d, B:61:0x0157, B:53:0x011f), top: B:79:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x014d A[Catch: all -> 0x0166, TryCatch #1 {all -> 0x0166, blocks: (B:13:0x002c, B:56:0x0132, B:59:0x013e, B:60:0x014d, B:61:0x0157, B:53:0x011f), top: B:79:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0157 A[Catch: all -> 0x0166, TRY_LEAVE, TryCatch #1 {all -> 0x0166, blocks: (B:13:0x002c, B:56:0x0132, B:59:0x013e, B:60:0x014d, B:61:0x0157, B:53:0x011f), top: B:79:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [yyk] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v4 */
    public final java.lang.Object d(defpackage.yzo yzoVar, defpackage.yxi yxiVar, aoln aolnVar) {
        defpackage.yyj yyjVar;
        ahoq ahoqVarZ;
        java.util.Set setCf;
        ugs ugsVar;
        defpackage.ugv ugvVar;
        ahoq ahoqVar;
        defpackage.yxi yxiVar2;
        defpackage.abbi abbiVar;
        int i;
        aolu zacVar;
        if (aolnVar instanceof defpackage.yyj) {
            yyjVar = (defpackage.yyj) aolnVar;
            int i2 = yyjVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yyjVar.c = i2 - Integer.MIN_VALUE;
            } else {
                yyjVar = new defpackage.yyj(this, aolnVar);
            }
        } else {
            yyjVar = new defpackage.yyj(this, aolnVar);
        }
        java.lang.Object objB = yyjVar.a;
        aolu zacVar2 = aolu.a;
        int i3 = yyjVar.c;
        try {
            if (i3 == 0) {
                aooc.af(objB);
                if (!ahvr.R(yyjVar.u())) {
                    throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                ahoqVarZ = ahvr.Z(1198, "SharpieScamDetectionAiCoreIntentsQueryStrategy_verifyWithHadesPolicy");
                try {
                    this.i.l(new zbq(defpackage.zbr.ag));
                    java.util.Set set = this.e;
                    aooh.f(yzoVar, "result");
                    j$.util.Objects.checkIndex(0, 3);
                    if (yzoVar != null) {
                        if (yzoVar instanceof defpackage.yzm) {
                            aify aifyVar = ((defpackage.yzm) yzoVar).a.a;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.util.Iterator it = aifyVar.iterator();
                            while (it.hasNext()) {
                                ajsz.bv(arrayList, wsc.y(((defpackage.ynl) it.next()).a));
                            }
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            for (java.lang.Object obj : arrayList) {
                                if (((java.lang.String) obj).length() > 0) {
                                    arrayList2.add(obj);
                                }
                            }
                            setCf = ajsz.cf(arrayList2);
                        } else if (yzoVar instanceof defpackage.yzn) {
                            aify aifyVar2 = ((defpackage.yzn) yzoVar).a.a;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.util.Iterator it2 = aifyVar2.iterator();
                            while (it2.hasNext()) {
                                ajsz.bv(arrayList3, wsc.y(((defpackage.you) it2.next()).a));
                            }
                            setCf = ajsz.cf(arrayList3);
                        }
                        set.addAll(setCf);
                        if (set.isEmpty()) {
                            zacVar2 = new defpackage.zac(yxiVar);
                        } else {
                            ugsVar = this.f;
                            ugvVar = defpackage.ugv.d;
                            yyjVar.d = yxiVar;
                            yyjVar.f = ahoqVarZ;
                            yyjVar.g = ugvVar;
                            yyjVar.e = ugsVar;
                            yyjVar.c = 1;
                            java.lang.Object objA = a(yyjVar);
                            if (objA != zacVar2) {
                                objB = objA;
                                ahoqVar = ahoqVarZ;
                                yyjVar.d = yxiVar;
                                yyjVar.f = ahoqVar;
                                yyjVar.g = null;
                                yyjVar.e = null;
                                yyjVar.c = 2;
                                objB = ugsVar.b(ugvVar, (defpackage.abba) objB, false, yyjVar);
                                if (objB != zacVar2) {
                                    yxiVar2 = yxiVar;
                                    abbiVar = ((defpackage.zdn) objB).a;
                                    i = abbiVar.b - 1;
                                    if (i != 0) {
                                        zacVar = new defpackage.zac(defpackage.yxi.a(yxiVar2, abbiVar));
                                    } else if (i != 1) {
                                        zacVar = new defpackage.zab(new defpackage.yxw(2), defpackage.yxi.a(yxiVar2, abbiVar));
                                    } else {
                                        zacVar = new defpackage.zad(defpackage.yxi.a(yxiVar2, abbiVar));
                                    }
                                    zacVar2 = zacVar;
                                    ahoqVarZ = ahoqVar;
                                }
                            }
                        }
                        return zacVar2;
                    }
                    throw new aois();
                } catch (java.lang.Throwable th) {
                    th = th;
                    this = ahoqVarZ;
                    throw th;
                }
            }
            if (i3 == 1) {
                ugs ugsVar2 = yyjVar.e;
                defpackage.ugv ugvVar2 = yyjVar.g;
                ahoq ahoqVar2 = yyjVar.f;
                defpackage.yxi yxiVar3 = yyjVar.d;
                try {
                    aooc.af(objB);
                    ugsVar = ugsVar2;
                    ahoqVar = ahoqVar2;
                    yxiVar = yxiVar3;
                    ugvVar = ugvVar2;
                    yyjVar.d = yxiVar;
                    yyjVar.f = ahoqVar;
                    yyjVar.g = null;
                    yyjVar.e = null;
                    yyjVar.c = 2;
                    objB = ugsVar.b(ugvVar, (defpackage.abba) objB, false, yyjVar);
                    if (objB != zacVar2) {
                        yxiVar2 = yxiVar;
                    }
                    return zacVar2;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    this = ahoqVar2;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th3) {
                        ajsz.ak((java.io.Closeable) this, th);
                        throw th3;
                    }
                }
            }
            if (i3 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = yyjVar.f;
            yxiVar2 = yyjVar.d;
            aooc.af(objB);
            abbiVar = ((defpackage.zdn) objB).a;
            i = abbiVar.b - 1;
            if (i != 0) {
                zacVar = new defpackage.zac(defpackage.yxi.a(yxiVar2, abbiVar));
            } else if (i != 1) {
                zacVar = new defpackage.zab(new defpackage.yxw(2), defpackage.yxi.a(yxiVar2, abbiVar));
            } else {
                zacVar = new defpackage.zad(defpackage.yxi.a(yxiVar2, abbiVar));
            }
            zacVar2 = zacVar;
            ahoqVarZ = ahoqVar;
            ajsz.ak(ahoqVarZ, (java.lang.Throwable) null);
            return zacVar2;
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.yzt
    public final void e() {
        this.e.clear();
    }
}
