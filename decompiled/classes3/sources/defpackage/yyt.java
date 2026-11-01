package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yyt implements defpackage.yzt {
    private final ugs a;
    private final tmi b;
    private final zzx c;

    public yyt(ugs ugsVar, zzx zzxVar, tmi tmiVar) {
        aooh.f(tmiVar, "configProvider");
        this.a = ugsVar;
        this.c = zzxVar;
        this.b = tmiVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c4 A[Catch: all -> 0x00df, TryCatch #2 {all -> 0x00df, blocks: (B:13:0x002b, B:30:0x00a6, B:34:0x00c4, B:35:0x00ca, B:36:0x00d5, B:18:0x003e), top: B:54:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca A[Catch: all -> 0x00df, TryCatch #2 {all -> 0x00df, blocks: (B:13:0x002b, B:30:0x00a6, B:34:0x00c4, B:35:0x00ca, B:36:0x00d5, B:18:0x003e), top: B:54:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5 A[Catch: all -> 0x00df, TRY_LEAVE, TryCatch #2 {all -> 0x00df, blocks: (B:13:0x002b, B:30:0x00a6, B:34:0x00c4, B:35:0x00ca, B:36:0x00d5, B:18:0x003e), top: B:54:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, yzz] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [yzz] */
    @Override // defpackage.yzt
    public final java.lang.Object b(defpackage.yzz yzzVar, aoln aolnVar) {
        defpackage.yys yysVar;
        java.io.Closeable closeableZ;
        java.lang.Object objB;
        ?? r12;
        java.io.Closeable closeable;
        defpackage.yxk yxkVar;
        int i;
        java.lang.Object zadVar;
        if (aolnVar instanceof defpackage.yys) {
            yysVar = (defpackage.yys) aolnVar;
            int i2 = yysVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yysVar.d = i2 - Integer.MIN_VALUE;
            } else {
                yysVar = new defpackage.yys(this, aolnVar);
            }
        } else {
            yysVar = new defpackage.yys(this, aolnVar);
        }
        java.lang.Object obj = yysVar.b;
        aolu aoluVar = aolu.a;
        int i3 = yysVar.d;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    java.io.Closeable closeable2 = yysVar.e;
                    defpackage.yzz yzzVar2 = (defpackage.yzz) yysVar.a;
                    aooc.af(obj);
                    closeableZ = closeable2;
                    r12 = yzzVar2;
                    objB = obj;
                } else {
                    if (i3 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (java.io.Closeable) yysVar.a;
                    aooc.af(obj);
                }
                defpackage.abbi abbiVar = ((defpackage.zdn) obj).a;
                this.c.l(new zbq(defpackage.zbr.ah));
                yxkVar = new defpackage.yxk(abbiVar);
                i = abbiVar.b - 1;
                if (i != 1) {
                    zadVar = new defpackage.zad(yxkVar);
                } else if (i != 3) {
                    zadVar = new defpackage.zac(yxkVar);
                } else {
                    zadVar = new defpackage.zab(new defpackage.yxw(1), yxkVar);
                }
                java.lang.Object obj2 = zadVar;
                ajsz.ak(closeable, (java.lang.Throwable) null);
                return obj2;
            }
            aooc.af(obj);
            if (!ahvr.R(yysVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            closeableZ = ahvr.Z(1200, "SharpieScamDetectionHadesModelQueryStrategy_classifyWithTranscriptWindow");
            try {
                this.c.l(new zbq(defpackage.zbr.ad));
                tmi tmiVar = this.b;
                yysVar.a = yzzVar;
                yysVar.e = closeableZ;
                yysVar.d = 1;
                objB = tmiVar.b(yysVar);
                r12 = yzzVar;
                if (objB == aoluVar) {
                    return aoluVar;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                yzzVar = closeableZ;
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak((java.io.Closeable) yzzVar, th);
                    throw th2;
                }
            }
            defpackage.yuu yuuVar = ((defpackage.yuw) objB).a;
            if (!(yuuVar instanceof defpackage.yut)) {
                throw new java.lang.IllegalArgumentException("Model config is not BertHades in Hades query strategy");
            }
            java.util.Locale locale = ((defpackage.yut) yuuVar).a;
            ugs ugsVar = this.a;
            defpackage.ugv ugvVar = defpackage.ugv.c;
            defpackage.abaz abazVar = defpackage.abba.a;
            java.lang.String str = r12.a;
            java.lang.String language = locale.getLanguage();
            aooh.e(language, "getLanguage(...)");
            defpackage.abba abbaVarA = abazVar.a(str, language);
            yysVar.a = closeableZ;
            yysVar.e = null;
            yysVar.d = 2;
            java.lang.Object objB2 = ugsVar.b(ugvVar, abbaVarA, false, yysVar);
            if (objB2 == aoluVar) {
                return aoluVar;
            }
            java.io.Closeable closeable3 = closeableZ;
            obj = objB2;
            closeable = closeable3;
            defpackage.abbi abbiVar2 = ((defpackage.zdn) obj).a;
            this.c.l(new zbq(defpackage.zbr.ah));
            yxkVar = new defpackage.yxk(abbiVar2);
            i = abbiVar2.b - 1;
            if (i != 1) {
                zadVar = new defpackage.zad(yxkVar);
            } else if (i != 3) {
                zadVar = new defpackage.zac(yxkVar);
            } else {
                zadVar = new defpackage.zab(new defpackage.yxw(1), yxkVar);
            }
            java.lang.Object obj3 = zadVar;
            ajsz.ak(closeable, (java.lang.Throwable) null);
            return obj3;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.yzt
    public final java.lang.Object c(aoln aolnVar) {
        return defpackage.yzv.a;
    }

    @Override // defpackage.yzt
    public final void e() {
    }
}
