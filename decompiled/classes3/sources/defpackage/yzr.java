package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yzr {
    public java.lang.Object a;
    public final java.lang.Object b;

    public yzr(byte[] bArr) {
        this.b = new ahda((byte[]) null);
        this.a = defpackage.qzs.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yzt] */
    public final defpackage.yzt a() {
        ?? r1 = this.a;
        if (r1 != 0) {
            return r1;
        }
        throw new java.lang.IllegalStateException("QueryStrategy not initialized");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.yzz yzzVar, aoln aolnVar) {
        defpackage.yzq yzqVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.yzq) {
            yzqVar = (defpackage.yzq) aolnVar;
            int i = yzqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yzqVar.c = i - Integer.MIN_VALUE;
            } else {
                yzqVar = new defpackage.yzq(this, aolnVar);
            }
        } else {
            yzqVar = new defpackage.yzq(this, aolnVar);
        }
        java.lang.Object obj = yzqVar.a;
        defpackage.zaf zafVar = aolu.a;
        int i2 = yzqVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!ahvr.R(yzqVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(1207, "SharpieScamDetectionCompositeQueryStrategyImpl_detectScam");
            try {
                defpackage.yzt yztVarA = a();
                yzqVar.d = ahoqVarZ;
                yzqVar.c = 1;
                java.lang.Object objB = yztVarA.b(yzzVar, yzqVar);
                if (objB != zafVar) {
                    obj = objB;
                    ahoqVar = ahoqVarZ;
                }
                return zafVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = yzqVar.d;
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
        zafVar = (defpackage.zaf) obj;
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        return zafVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yzs] */
    public final defpackage.yzs c() {
        ?? r1 = this.a;
        if (r1 != 0) {
            return r1;
        }
        throw new java.lang.IllegalStateException("QueryContextCollector not initialized");
    }

    public final boolean d(aigf aigfVar) {
        this.a = ((defpackage.vid) this.b).a();
        defpackage.vij vijVar = new defpackage.vij();
        ailj ailjVarK = aigfVar.e().k();
        while (ailjVarK.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
            vijVar.d(new defpackage.vif((java.lang.String) entry.getKey()));
            vijVar.d((defpackage.vih) entry.getValue());
        }
        ((defpackage.vhy) this.a).g("SETMETADATA", new defpackage.vio("INBOX"), vijVar);
        defpackage.vil vilVarA = ((defpackage.vhy) this.a).a();
        if (vilVarA.q()) {
            return vilVarA.k(0, "OK", false);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.sxk sxkVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.sxk) {
            sxkVar = (defpackage.sxk) aolnVar;
            int i = sxkVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sxkVar.b = i - Integer.MIN_VALUE;
            } else {
                sxkVar = new defpackage.sxk(this, aolnVar);
            }
        } else {
            sxkVar = new defpackage.sxk(this, aolnVar);
        }
        java.lang.Object obj2 = sxkVar.a;
        java.lang.Object obj3 = aolu.a;
        int i2 = sxkVar.b;
        try {
            if (i2 == 0) {
                aooc.af(obj2);
                java.lang.Object obj4 = this.b;
                apdp apdpVar = (apdp) obj4;
                sxkVar.c = apdpVar;
                sxkVar.b = 1;
                if (apdpVar.b(sxkVar) != obj3) {
                    obj = obj4;
                }
                return obj3;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = sxkVar.c;
            aooc.af(obj2);
            obj3 = this.a;
            return obj3;
        } finally {
            ((apdp) obj).d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(lnm lnmVar, defpackage.sxi sxiVar, aoln aolnVar) {
        defpackage.sxl sxlVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.sxl) {
            sxlVar = (defpackage.sxl) aolnVar;
            int i = sxlVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sxlVar.b = i - Integer.MIN_VALUE;
            } else {
                sxlVar = new defpackage.sxl(this, aolnVar);
            }
        } else {
            sxlVar = new defpackage.sxl(this, aolnVar);
        }
        java.lang.Object obj2 = sxlVar.a;
        aojh aojhVar = aolu.a;
        int i2 = sxlVar.b;
        try {
            if (i2 == 0) {
                aooc.af(obj2);
                obj = this.b;
                sxlVar.c = lnmVar;
                sxlVar.d = sxiVar;
                apdp apdpVar = (apdp) obj;
                sxlVar.e = apdpVar;
                sxlVar.b = 1;
                if (apdpVar.b(sxlVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = sxlVar.e;
            sxiVar = sxlVar.d;
            lnm lnmVar2 = sxlVar.c;
            aooc.af(obj2);
            obj = apdpVar2;
            lnmVar = lnmVar2;
            this.a = new defpackage.sxj(lnmVar, sxiVar);
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            ((apdp) obj).d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(defpackage.pdv pdvVar, aoln aolnVar) {
        defpackage.pep pepVar;
        java.lang.Object obj;
        java.lang.Boolean bool;
        if (aolnVar instanceof defpackage.pep) {
            pepVar = (defpackage.pep) aolnVar;
            int i = pepVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pepVar.b = i - Integer.MIN_VALUE;
            } else {
                pepVar = new defpackage.pep(this, aolnVar);
            }
        } else {
            pepVar = new defpackage.pep(this, aolnVar);
        }
        java.lang.Object obj2 = pepVar.a;
        aolu aoluVar = aolu.a;
        int i2 = pepVar.b;
        if (i2 == 0) {
            aooc.af(obj2);
            obj = this.b;
            pepVar.c = pdvVar;
            apdp apdpVar = (apdp) obj;
            pepVar.d = apdpVar;
            pepVar.b = 1;
            if (apdpVar.b(pepVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = pepVar.d;
            defpackage.pdv pdvVar2 = pepVar.c;
            aooc.af(obj2);
            obj = apdpVar2;
            pdvVar = pdvVar2;
        }
        try {
            if (aooh.n(this.a, pdvVar)) {
                bool = java.lang.Boolean.FALSE;
            } else {
                this.a = pdvVar;
                bool = java.lang.Boolean.TRUE;
            }
            return bool;
        } finally {
            ((apdp) obj).d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(aoln aolnVar) {
        defpackage.peq peqVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.peq) {
            peqVar = (defpackage.peq) aolnVar;
            int i = peqVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                peqVar.b = i - Integer.MIN_VALUE;
            } else {
                peqVar = new defpackage.peq(this, aolnVar);
            }
        } else {
            peqVar = new defpackage.peq(this, aolnVar);
        }
        java.lang.Object obj2 = peqVar.a;
        java.lang.Object obj3 = aolu.a;
        int i2 = peqVar.b;
        try {
            if (i2 == 0) {
                aooc.af(obj2);
                java.lang.Object obj4 = this.b;
                apdp apdpVar = (apdp) obj4;
                peqVar.c = apdpVar;
                peqVar.b = 1;
                if (apdpVar.b(peqVar) != obj3) {
                    obj = obj4;
                }
                return obj3;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = peqVar.c;
            aooc.af(obj2);
            obj3 = this.a;
            return obj3;
        } finally {
            ((apdp) obj).d();
        }
    }

    public yzr(zzx zzxVar) {
        this.b = zzxVar;
    }

    public yzr(byte[] bArr, byte[] bArr2) {
        this.b = new apdp();
    }

    public yzr(defpackage.vid vidVar) {
        this.b = vidVar;
    }

    public yzr(defpackage.rhe rheVar, byte[] bArr) {
        this.a = j$.util.OptionalInt.empty();
        this.b = rheVar;
    }

    public yzr(defpackage.rhe rheVar) {
        this.a = j$.util.Optional.empty();
        this.b = rheVar;
    }

    public yzr() {
        this.b = new apdp();
    }
}
