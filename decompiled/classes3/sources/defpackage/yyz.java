package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yyz implements defpackage.yxa {
    private final ugs a;

    public yyz(ugs ugsVar) {
        this.a = ugsVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yxa
    public final java.lang.Object a(defpackage.taq taqVar, aoln aolnVar) {
        defpackage.yyx yyxVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.yyx) {
            yyxVar = (defpackage.yyx) aolnVar;
            int i = yyxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yyxVar.c = i - Integer.MIN_VALUE;
            } else {
                yyxVar = new defpackage.yyx(this, aolnVar);
            }
        } else {
            yyxVar = new defpackage.yyx(this, aolnVar);
        }
        java.lang.Object obj = yyxVar.a;
        defpackage.ywz ywzVar = aolu.a;
        int i2 = yyxVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!ahvr.R(yyxVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(1201, "SharpieScamDetectorHadesModelPrecondition_checkDevice");
            try {
                yyxVar.d = ahoqVarZ;
                yyxVar.c = 1;
                java.lang.Object objB = b(yyxVar);
                if (objB != ywzVar) {
                    obj = objB;
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
        ahoqVar = yyxVar.d;
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

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.yyy yyyVar;
        if (aolnVar instanceof defpackage.yyy) {
            yyyVar = (defpackage.yyy) aolnVar;
            int i = yyyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yyyVar.c = i - Integer.MIN_VALUE;
            } else {
                yyyVar = new defpackage.yyy(this, aolnVar);
            }
        } else {
            yyyVar = new defpackage.yyy(this, aolnVar);
        }
        java.lang.Object objG = yyyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = yyyVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objG);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objG);
            }
            if (((java.lang.Boolean) objG).booleanValue()) {
                return defpackage.ywv.a;
            }
            return new defpackage.yww(defpackage.ywx.i);
        }
        aooc.af(objG);
        ugs ugsVar = this.a;
        yyyVar.c = 1;
        objG = ugsVar.g(defpackage.ugv.c, yyyVar);
        if (objG == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objG).booleanValue()) {
            ugs ugsVar2 = this.a;
            yyyVar.c = 2;
            objG = c(ugsVar2, yyyVar);
            if (objG == aoluVar) {
                return aoluVar;
            }
            if (((java.lang.Boolean) objG).booleanValue()) {
                return defpackage.ywv.a;
            }
        }
        return new defpackage.yww(defpackage.ywx.i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(ugs ugsVar, aoln aolnVar) {
        defpackage.yyw yywVar;
        if (aolnVar instanceof defpackage.yyw) {
            yywVar = (defpackage.yyw) aolnVar;
            int i = yywVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yywVar.c = i - Integer.MIN_VALUE;
            } else {
                yywVar = new defpackage.yyw(this, aolnVar);
            }
        } else {
            yywVar = new defpackage.yyw(this, aolnVar);
        }
        java.lang.Object objF = yywVar.a;
        aolu aoluVar = aolu.a;
        int i2 = yywVar.c;
        if (i2 == 0) {
            aooc.af(objF);
            defpackage.ugv ugvVar = defpackage.ugv.c;
            yywVar.c = 1;
            objF = ugsVar.f(ugvVar, yywVar);
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
}
