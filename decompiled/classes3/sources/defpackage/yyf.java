package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yyf {
    public static final aimz a = aimz.i("com/google/android/callcoreshared/sharpie/scamdetection/impl/SharpieScamDetectorImpl");
    public static final aenj b = new aenj("SharpieOnNewTranscriptInterval");
    private static final aenj i = new aenj("SharpieQueryLatency");
    public final aenl c;
    public aeun d;
    public final java.util.Set e;
    public final aazc f;
    public final zzx g;
    public final ahda h;
    private final aoss j;
    private defpackage.zaf k;
    private final defpackage.yzr l;
    private final tmi m;
    private final defpackage.yzr n;
    private final ahda o;

    public yyf(defpackage.yzr yzrVar, defpackage.yzr yzrVar2, aazc aazcVar, aenl aenlVar, aoss aossVar, zzx zzxVar, tmi tmiVar) {
        aooh.f(aazcVar, "clock");
        aooh.f(aenlVar, "primes");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(tmiVar, "sharpieConfigProvider");
        this.n = yzrVar;
        this.l = yzrVar2;
        this.f = aazcVar;
        this.c = aenlVar;
        this.j = aossVar;
        this.g = zzxVar;
        this.m = tmiVar;
        this.o = new ahda((byte[]) null);
        this.h = new ahda((byte[]) null);
        this.e = new java.util.LinkedHashSet();
    }

    private final aosy h(ahda ahdaVar, aonj aonjVar) {
        return ahvr.ag(this.j, ahdaVar, new defpackage.xtn(aonjVar, (aoln) null, 7, (byte[]) null));
    }

    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [aosy] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [aosy] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final java.lang.Object a(aosy aosyVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.yxz yxzVar;
        java.lang.Object yxoVar;
        aosy aosyVar2;
        aour aourVar;
        ytl ytlVar;
        if (aolnVar instanceof defpackage.yxz) {
            yxzVar = (defpackage.yxz) aolnVar;
            int i2 = yxzVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yxzVar.d = i2 - Integer.MIN_VALUE;
            } else {
                yxzVar = new defpackage.yxz(this, aolnVar);
            }
        } else {
            yxzVar = new defpackage.yxz(this, aolnVar);
        }
        defpackage.yxz yxzVar2 = yxzVar;
        java.lang.Object objG = yxzVar2.b;
        aolu aoluVar = aolu.a;
        aosy aosyVar3 = yxzVar2.d;
        try {
            try {
                if (aosyVar3 != 0) {
                    if (aosyVar3 == 1) {
                        aosy aosyVar4 = (aosy) yxzVar2.a;
                        aooc.af(objG);
                        aosyVar2 = aosyVar4;
                    } else {
                        if (aosyVar3 != 2) {
                            if (aosyVar3 == 3 || aosyVar3 == 4) {
                                defpackage.yxq yxqVar = (defpackage.yxq) yxzVar2.a;
                                aooc.af(objG);
                                return yxqVar;
                            }
                            if (aosyVar3 != 5) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            java.lang.Throwable th = (java.lang.Throwable) yxzVar2.a;
                            aooc.af(objG);
                            throw th;
                        }
                        aosy aosyVar5 = (aosy) yxzVar2.a;
                        aooc.af(objG);
                        aosyVar3 = aosyVar5;
                    }
                    yxoVar = (defpackage.yxq) objG;
                    aourVar = aour.a;
                    ytlVar = new ytl(this, (aosy) aosyVar3, (aoln) null, 4);
                    yxzVar2.a = yxoVar;
                    yxzVar2.d = 3;
                    if (aoov.aj(aourVar, ytlVar, yxzVar2) == aoluVar) {
                        return aoluVar;
                    }
                    return yxoVar;
                }
                aooc.af(objG);
                try {
                    ahda ahdaVar = this.h;
                    aosy aosyVar6 = aosyVar;
                    bqp bqpVar = new bqp(this, aosyVar6, (aoln) null, 10, (byte[]) null);
                    yxzVar2.a = aosyVar6;
                    yxzVar2.d = 1;
                    objG = g(ahdaVar, bqpVar, yxzVar2);
                    aosyVar2 = aosyVar6;
                    if (objG == aoluVar) {
                        return aoluVar;
                    }
                } catch (java.util.concurrent.CancellationException unused) {
                    aosyVar3 = aosyVar;
                    yxoVar = new defpackage.yxo(defpackage.yxj.a);
                    aour aourVar2 = aour.a;
                    ytl ytlVar2 = new ytl(this, (aosy) aosyVar3, (aoln) null, 4);
                    yxzVar2.a = yxoVar;
                    yxzVar2.d = 4;
                    if (aoov.aj(aourVar2, ytlVar2, yxzVar2) == aoluVar) {
                        return aoluVar;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    aosyVar3 = aosyVar;
                    aour aourVar3 = aour.a;
                    ytl ytlVar3 = new ytl(this, aosyVar3, (aoln) null, 4);
                    yxzVar2.a = th;
                    yxzVar2.d = 5;
                    if (aoov.aj(aourVar3, ytlVar3, yxzVar2) == aoluVar) {
                        return aoluVar;
                    }
                    throw th;
                }
                ((java.lang.Boolean) objG).booleanValue();
                yxzVar2.a = aosyVar2;
                yxzVar2.d = 2;
                objG = aosyVar2.a(yxzVar2);
                aosyVar3 = aosyVar2;
                if (objG == aoluVar) {
                    return aoluVar;
                }
                yxoVar = (defpackage.yxq) objG;
                aourVar = aour.a;
                ytlVar = new ytl(this, (aosy) aosyVar3, (aoln) null, 4);
                yxzVar2.a = yxoVar;
                yxzVar2.d = 3;
                if (aoov.aj(aourVar, ytlVar, yxzVar2) == aoluVar) {
                    return aoluVar;
                }
            } catch (java.util.concurrent.CancellationException unused2) {
            }
            return yxoVar;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0130 A[Catch: all -> 0x013e, TryCatch #6 {all -> 0x013e, blocks: (B:13:0x0039, B:53:0x012a, B:56:0x0138, B:55:0x0130), top: B:97:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.String str, aoln aolnVar) {
        defpackage.yya yyaVar;
        java.io.Closeable closeable;
        java.lang.String str2;
        java.lang.String str3;
        java.io.Closeable closeable2;
        java.lang.Throwable th;
        aimw aimwVar;
        int i2;
        defpackage.yzr yzrVar;
        ahoq ahoqVarW;
        defpackage.yzr yzrVar2;
        ahoq ahoqVarW2;
        aeun aeunVar;
        defpackage.zaf zafVar;
        if (aolnVar instanceof defpackage.yya) {
            yyaVar = (defpackage.yya) aolnVar;
            int i3 = yyaVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                yyaVar.f = i3 - Integer.MIN_VALUE;
            } else {
                yyaVar = new defpackage.yya(this, aolnVar);
            }
        } else {
            yyaVar = new defpackage.yya(this, aolnVar);
        }
        java.lang.Object objB = yyaVar.d;
        defpackage.zaf zafVar2 = aolu.a;
        int i4 = yyaVar.f;
        try {
            try {
                if (i4 == 0) {
                    aooc.af(objB);
                    if (!ahvr.R(yyaVar.u())) {
                        throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                    }
                    java.io.Closeable closeableZ = ahvr.Z(1193, "SharpieScamDetectorImpl_detectScamInternal");
                    try {
                        aimw aimwVarL = a.b().l("com/google/android/callcoreshared/sharpie/scamdetection/impl/SharpieScamDetectorImpl", "detectScamInternal$<anonymous>", 160, "SharpieScamDetectorImpl.kt");
                        str2 = "Detection with config: %s";
                        tmi tmiVar = this.m;
                        str3 = str;
                        yyaVar.a = str3;
                        yyaVar.b = closeableZ;
                        yyaVar.g = "Detection with config: %s";
                        yyaVar.c = aimwVarL;
                        yyaVar.f = 1;
                        java.lang.Object objB2 = tmiVar.b(yyaVar);
                        if (objB2 != zafVar2) {
                            closeable2 = closeableZ;
                            objB = objB2;
                            aimwVar = aimwVarL;
                        }
                        return zafVar2;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        closeable = closeableZ;
                        th = th;
                        throw th;
                    }
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aeunVar = (aeun) yyaVar.b;
                    closeable = (java.io.Closeable) yyaVar.a;
                    try {
                        aooc.af(objB);
                        zafVar = (defpackage.zaf) objB;
                        if (!(zafVar instanceof defpackage.zab)) {
                            this.c.f(aeunVar, i, 1);
                        }
                        zafVar2 = zafVar;
                        this.k = zafVar2;
                        ajsz.ak(closeable, (java.lang.Throwable) null);
                        return zafVar2;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        th = th;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            ajsz.ak(closeable, th);
                            throw th4;
                        }
                    }
                }
                java.lang.Object obj = yyaVar.c;
                str2 = yyaVar.g;
                closeable2 = (java.io.Closeable) yyaVar.b;
                str3 = (java.lang.String) yyaVar.a;
                try {
                    aooc.af(objB);
                    aimwVar = obj;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    closeable = closeable2;
                    throw th;
                }
                defpackage.zaa zaaVarA = yzrVar2.c().a();
                ajsz.ak(ahoqVarW2, (java.lang.Throwable) null);
                j$.util.Objects.checkIndex(0, 3);
                if (zaaVarA instanceof defpackage.yzy) {
                    a.b().l("com/google/android/callcoreshared/sharpie/scamdetection/impl/SharpieScamDetectorImpl", "detectScamInternal$<anonymous>", 168, "SharpieScamDetectorImpl.kt").y("Skipping window: [%s]", ((defpackage.yzy) zaaVarA).a);
                    zafVar = defpackage.zae.a;
                    closeable = closeable2;
                    zafVar2 = zafVar;
                    this.k = zafVar2;
                    ajsz.ak(closeable, (java.lang.Throwable) null);
                } else {
                    if (!(zaaVarA instanceof defpackage.yzz)) {
                        throw new aois();
                    }
                    aeun aeunVarB = this.c.b();
                    yyaVar.a = closeable2;
                    yyaVar.b = aeunVarB;
                    yyaVar.g = null;
                    yyaVar.c = null;
                    yyaVar.f = 2;
                    objB = this.l.b((defpackage.yzz) zaaVarA, yyaVar);
                    if (objB != zafVar2) {
                        aeunVar = aeunVarB;
                        closeable = closeable2;
                        zafVar = (defpackage.zaf) objB;
                        if (!(zafVar instanceof defpackage.zab)) {
                            this.c.f(aeunVar, i, 1);
                        }
                        zafVar2 = zafVar;
                        this.k = zafVar2;
                        ajsz.ak(closeable, (java.lang.Throwable) null);
                    }
                }
                return zafVar2;
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    ajsz.ak(ahoqVarW2, th6);
                    throw th7;
                }
            }
            yzrVar.c().c(str3, i2);
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
            yzrVar2 = this.n;
            ahoqVarW2 = ahvr.W(1206, "SharpieScamDetectionCompositeQueryContextCollectorImpl_create");
        } catch (java.lang.Throwable th8) {
            try {
                throw th8;
            } catch (java.lang.Throwable th9) {
                ajsz.ak(ahoqVarW, th8);
                throw th9;
            }
        }
        aimwVar.y(str2, objB);
        defpackage.zaf zafVar3 = this.k;
        j$.util.Objects.checkIndex(0, 5);
        if (zafVar3 == null) {
            i2 = 1;
        } else if ((zafVar3 instanceof defpackage.zab) || (zafVar3 instanceof defpackage.zae)) {
            i2 = 2;
        } else {
            if (!(zafVar3 instanceof defpackage.zac) && !(zafVar3 instanceof defpackage.zad)) {
                throw new aois();
            }
            i2 = 1;
        }
        yzrVar = this.n;
        aooh.f(str3, "queryContext");
        ahoqVarW = ahvr.W(1205, "SharpieScamDetectionCompositeQueryContextCollectorImpl_collect");
    }

    public final java.lang.Object c(aoln aolnVar) {
        java.lang.Object objG = g(this.h, new defpackage.wbi(this, (aoln) null, 7), aolnVar);
        return objG != aolu.a ? aojh.a : objG;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:12:0x0027, B:22:0x0057, B:24:0x0070, B:26:0x008a, B:28:0x009e, B:29:0x00a9, B:30:0x00aa, B:31:0x00b5), top: B:43:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x008a A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #0 {all -> 0x00b6, blocks: (B:12:0x0027, B:22:0x0057, B:24:0x0070, B:26:0x008a, B:28:0x009e, B:29:0x00a9, B:30:0x00aa, B:31:0x00b5), top: B:43:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x009e A[Catch: all -> 0x00b6, TRY_ENTER, TryCatch #0 {all -> 0x00b6, blocks: (B:12:0x0027, B:22:0x0057, B:24:0x0070, B:26:0x008a, B:28:0x009e, B:29:0x00a9, B:30:0x00aa, B:31:0x00b5), top: B:43:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:12:0x0027, B:22:0x0057, B:24:0x0070, B:26:0x008a, B:28:0x009e, B:29:0x00a9, B:30:0x00aa, B:31:0x00b5), top: B:43:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.yyb yybVar;
        ahoq ahoqVar;
        defpackage.yuw yuwVar;
        defpackage.yzr yzrVar;
        defpackage.yuv yuvVar;
        defpackage.yzs yzsVar;
        defpackage.yzr yzrVar2;
        defpackage.yzt yztVar;
        if (aolnVar instanceof defpackage.yyb) {
            yybVar = (defpackage.yyb) aolnVar;
            int i2 = yybVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yybVar.c = i2 - Integer.MIN_VALUE;
            } else {
                yybVar = new defpackage.yyb(this, aolnVar);
            }
        } else {
            yybVar = new defpackage.yyb(this, aolnVar);
        }
        java.lang.Object obj = yybVar.a;
        aolu aoluVar = aolu.a;
        int i3 = yybVar.c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = yybVar.d;
            try {
                aooc.af(obj);
                yuwVar = (defpackage.yuw) obj;
                yzrVar = this.n;
                aooh.f(yuwVar, "config");
                java.lang.Object obj2 = yzrVar.b;
                yuvVar = yuwVar.a.b;
                yzsVar = (defpackage.yzs) wsc.D((zzx) obj2, yuvVar);
                if (yzsVar != null) {
                    throw new java.lang.IllegalStateException(a.bF((byte) 93, yuvVar, "QueryContextCollector not found for ModelType ["));
                }
                yzrVar.a = yzsVar;
                yzrVar.c().b();
                yzrVar2 = this.l;
                aooh.f(yuwVar, "config");
                yztVar = (defpackage.yzt) wsc.D((zzx) yzrVar2.b, yuvVar);
                if (yztVar != null) {
                    throw new java.lang.IllegalStateException(a.bF((byte) 93, yuvVar, "QueryStrategy not found for ModelType ["));
                }
                yzrVar2.a = yztVar;
                yzrVar2.a().e();
                this.k = null;
                this.d = null;
                ajsz.ak(ahoqVar, (java.lang.Throwable) null);
                return aojh.a;
            } catch (java.lang.Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(ahoqVar, th);
                    throw th2;
                }
            }
        }
        aooc.af(obj);
        if (!ahvr.R(yybVar.u())) {
            throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        ahoq ahoqVarZ = ahvr.Z(1194, "SharpieScamDetectorImpl_init");
        try {
            tmi tmiVar = this.m;
            yybVar.d = ahoqVarZ;
            yybVar.c = 1;
            java.lang.Object objB = tmiVar.b(yybVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            ahoqVar = ahoqVarZ;
            obj = objB;
            yuwVar = (defpackage.yuw) obj;
            yzrVar = this.n;
            aooh.f(yuwVar, "config");
            java.lang.Object obj3 = yzrVar.b;
            yuvVar = yuwVar.a.b;
            yzsVar = (defpackage.yzs) wsc.D((zzx) obj3, yuvVar);
            if (yzsVar != null) {
                throw new java.lang.IllegalStateException(a.bF((byte) 93, yuvVar, "QueryContextCollector not found for ModelType ["));
            }
            yzrVar.a = yzsVar;
            yzrVar.c().b();
            yzrVar2 = this.l;
            aooh.f(yuwVar, "config");
            yztVar = (defpackage.yzt) wsc.D((zzx) yzrVar2.b, yuvVar);
            if (yztVar != null) {
                throw new java.lang.IllegalStateException(a.bF((byte) 93, yuvVar, "QueryStrategy not found for ModelType ["));
            }
            yzrVar2.a = yztVar;
            yzrVar2.a().e();
            this.k = null;
            this.d = null;
            ajsz.ak(ahoqVar, (java.lang.Throwable) null);
            return aojh.a;
        } catch (java.lang.Throwable th3) {
            th = th3;
            ahoqVar = ahoqVarZ;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(java.lang.String str, aoln aolnVar) {
        defpackage.yyc yycVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.yyc) {
            yycVar = (defpackage.yyc) aolnVar;
            int i2 = yycVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yycVar.c = i2 - Integer.MIN_VALUE;
            } else {
                yycVar = new defpackage.yyc(this, aolnVar);
            }
        } else {
            yycVar = new defpackage.yyc(this, aolnVar);
        }
        java.lang.Object obj = yycVar.a;
        defpackage.yxq yxqVar = aolu.a;
        int i3 = yycVar.c;
        if (i3 == 0) {
            aooc.af(obj);
            if (!ahvr.R(yycVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(1195, "SharpieScamDetectorImpl_onNewTranscript");
            try {
                aosy aosyVarH = h(this.o, new defpackage.yyd(this, str, null));
                yycVar.d = ahoqVarZ;
                yycVar.c = 1;
                java.lang.Object objA = a(aosyVarH, yycVar);
                if (objA != yxqVar) {
                    obj = objA;
                    ahoqVar = ahoqVarZ;
                }
                return yxqVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i3 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = yycVar.d;
        try {
            aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        yxqVar = (defpackage.yxq) obj;
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        return yxqVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063 A[Catch: all -> 0x007c, TryCatch #1 {all -> 0x007c, blocks: (B:12:0x0025, B:22:0x0059, B:24:0x0063, B:25:0x0066, B:27:0x006e, B:29:0x0076, B:30:0x007b), top: B:44:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0066 A[Catch: all -> 0x007c, TryCatch #1 {all -> 0x007c, blocks: (B:12:0x0025, B:22:0x0059, B:24:0x0063, B:25:0x0066, B:27:0x006e, B:29:0x0076, B:30:0x007b), top: B:44:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006e A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #1 {all -> 0x007c, blocks: (B:12:0x0025, B:22:0x0059, B:24:0x0063, B:25:0x0066, B:27:0x006e, B:29:0x0076, B:30:0x007b), top: B:44:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0076 A[Catch: all -> 0x007c, TRY_ENTER, TryCatch #1 {all -> 0x007c, blocks: (B:12:0x0025, B:22:0x0059, B:24:0x0063, B:25:0x0066, B:27:0x006e, B:29:0x0076, B:30:0x007b), top: B:44:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(aoln aolnVar) {
        defpackage.yye yyeVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        defpackage.yzw yzwVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.yye) {
            yyeVar = (defpackage.yye) aolnVar;
            int i2 = yyeVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yyeVar.c = i2 - Integer.MIN_VALUE;
            } else {
                yyeVar = new defpackage.yye(this, aolnVar);
            }
        } else {
            yyeVar = new defpackage.yye(this, aolnVar);
        }
        java.lang.Object obj2 = yyeVar.a;
        aolu aoluVar = aolu.a;
        int i3 = yyeVar.c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = yyeVar.d;
            try {
                aooc.af(obj2);
                yzwVar = (defpackage.yzw) obj2;
                if (aooh.n(yzwVar, defpackage.yzu.a)) {
                    obj = defpackage.yxr.a;
                } else {
                    if (aooh.n(yzwVar, defpackage.yzv.a)) {
                        throw new aois();
                    }
                    obj = defpackage.yxs.a;
                }
                java.lang.Object obj3 = obj;
                ajsz.ak(ahoqVar, (java.lang.Throwable) null);
                return obj3;
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (java.lang.Throwable th3) {
                    ajsz.ak(ahoqVar, th);
                    throw th3;
                }
            }
        }
        aooc.af(obj2);
        if (!ahvr.R(yyeVar.u())) {
            throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        ahoq ahoqVarZ = ahvr.Z(1196, "SharpieScamDetectorImpl_tearDown");
        try {
            defpackage.yzr yzrVar = this.l;
            yyeVar.d = ahoqVarZ;
            yyeVar.c = 1;
            java.lang.Object objC = yzrVar.a().c(yyeVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
            obj2 = objC;
            ahoqVar = ahoqVarZ;
            yzwVar = (defpackage.yzw) obj2;
            if (aooh.n(yzwVar, defpackage.yzu.a)) {
                obj = defpackage.yxr.a;
            } else {
                if (aooh.n(yzwVar, defpackage.yzv.a)) {
                    throw new aois();
                }
                obj = defpackage.yxs.a;
            }
            java.lang.Object obj4 = obj;
            ajsz.ak(ahoqVar, (java.lang.Throwable) null);
            return obj4;
        } catch (java.lang.Throwable th4) {
            th = th4;
            ahoqVar = ahoqVarZ;
            throw th;
        }
    }

    public final java.lang.Object g(ahda ahdaVar, aonj aonjVar, aoln aolnVar) {
        return h(ahdaVar, new defpackage.wbi(aonjVar, (aoln) null, 8)).a(aolnVar);
    }
}
