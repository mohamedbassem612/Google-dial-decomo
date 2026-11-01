package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yyr implements defpackage.yxa {
    private final ugs a;

    public yyr(ugs ugsVar) {
        this.a = ugsVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yxa
    public final java.lang.Object a(defpackage.taq taqVar, aoln aolnVar) {
        defpackage.yyp yypVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.yyp) {
            yypVar = (defpackage.yyp) aolnVar;
            int i = yypVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yypVar.c = i - Integer.MIN_VALUE;
            } else {
                yypVar = new defpackage.yyp(this, aolnVar);
            }
        } else {
            yypVar = new defpackage.yyp(this, aolnVar);
        }
        java.lang.Object obj = yypVar.a;
        defpackage.ywz ywzVar = aolu.a;
        int i2 = yypVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!ahvr.R(yypVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(1199, "SharpieScamDetectorAiCoreIntentsPrecondition_checkDevice");
            try {
                yypVar.d = ahoqVarZ;
                yypVar.c = 1;
                java.lang.Object objC = c(taqVar, yypVar);
                if (objC != ywzVar) {
                    obj = objC;
                    ahoqVar = ahoqVarZ;
                }
                return ywzVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = yypVar.d;
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
        ywzVar = (defpackage.ywz) obj;
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        return ywzVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(ugs ugsVar, aoln aolnVar) {
        defpackage.yyo yyoVar;
        if (aolnVar instanceof defpackage.yyo) {
            yyoVar = (defpackage.yyo) aolnVar;
            int i = yyoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yyoVar.c = i - Integer.MIN_VALUE;
            } else {
                yyoVar = new defpackage.yyo(this, aolnVar);
            }
        } else {
            yyoVar = new defpackage.yyo(this, aolnVar);
        }
        java.lang.Object objF = yyoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = yyoVar.c;
        if (i2 == 0) {
            aooc.af(objF);
            defpackage.ugv ugvVar = defpackage.ugv.d;
            yyoVar.c = 1;
            objF = ugsVar.f(ugvVar, yyoVar);
            if (objF == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objF);
        }
        return java.lang.Boolean.valueOf(objF == defpackage.zdp.b);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.taq taqVar, aoln aolnVar) throws aois {
        defpackage.yyq yyqVar;
        boolean z;
        if (aolnVar instanceof defpackage.yyq) {
            yyqVar = (defpackage.yyq) aolnVar;
            int i = yyqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yyqVar.d = i - Integer.MIN_VALUE;
            } else {
                yyqVar = new defpackage.yyq(this, aolnVar);
            }
        } else {
            yyqVar = new defpackage.yyq(this, aolnVar);
        }
        java.lang.Object objG = yyqVar.b;
        aolu aoluVar = aolu.a;
        int i2 = yyqVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                taqVar = yyqVar.e;
                aooc.af(objG);
            } else if (i2 == 2) {
                z = yyqVar.a;
                taqVar = yyqVar.e;
                aooc.af(objG);
                boolean zBooleanValue = ((java.lang.Boolean) objG).booleanValue();
                if (z || !zBooleanValue) {
                    return new defpackage.yww(defpackage.ywx.j);
                }
                yyqVar.e = null;
                yyqVar.d = 3;
                java.lang.Object obj = taqVar.a;
                java.lang.Object obj2 = taqVar.b;
                defpackage.yse yseVar = defpackage.yse.d;
                aooh.f(obj, "listener");
                defpackage.ysb ysbVar = (defpackage.ysb) obj2;
                objG = (defpackage.ysc) ysbVar.e.get(yseVar);
                java.lang.Object objComputeIfAbsent = j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(ysbVar.f, yseVar, new defpackage.vxb(new defpackage.yrz(0), 11));
                aooh.c(objComputeIfAbsent);
                defpackage.xhb xhbVar = new defpackage.xhb(ysbVar, yseVar, (defpackage.tnq) obj, (aoln) null, 3);
                ysbVar.i.i(ahvr.ag(ysbVar.c, (ahda) objComputeIfAbsent, xhbVar));
                defpackage.ysb.a.b().l("com/google/android/callcoreshared/aicore/availability/AiCoreAvailabilityImpl", "getLastAvailabilityAndUpdate", 130, "AiCoreAvailabilityImpl.kt").I("[%s] cachedAvailability: %s", yseVar, objG);
                if (objG == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objG);
            }
            defpackage.ysc yscVar = (defpackage.ysc) objG;
            if (yscVar == null) {
                return new defpackage.ywy();
            }
            if (!yscVar.b) {
                return new defpackage.yww(defpackage.ywx.b);
            }
            switch (yscVar.a.ordinal()) {
                case 0:
                    return new defpackage.yww(defpackage.ywx.c);
                case 1:
                    return new defpackage.yww(defpackage.ywx.d);
                case 2:
                    return new defpackage.yww(defpackage.ywx.e);
                case 3:
                    return new defpackage.yww(defpackage.ywx.f);
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    return new defpackage.yww(defpackage.ywx.g);
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    return defpackage.ywv.a;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    return new defpackage.yww(defpackage.ywx.h);
                default:
                    throw new aois();
            }
        }
        aooc.af(objG);
        ugs ugsVar = this.a;
        yyqVar.e = taqVar;
        yyqVar.d = 1;
        objG = ugsVar.g(defpackage.ugv.d, yyqVar);
        if (objG == aoluVar) {
            return aoluVar;
        }
        boolean zBooleanValue2 = ((java.lang.Boolean) objG).booleanValue();
        ugs ugsVar2 = this.a;
        yyqVar.e = taqVar;
        yyqVar.a = zBooleanValue2;
        yyqVar.d = 2;
        java.lang.Object objB = b(ugsVar2, yyqVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        objG = objB;
        z = zBooleanValue2;
        boolean zBooleanValue3 = ((java.lang.Boolean) objG).booleanValue();
        if (z) {
        }
        return new defpackage.yww(defpackage.ywx.j);
    }
}
