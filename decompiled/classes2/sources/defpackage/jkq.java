package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jkq {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public jkq(java.util.List list) {
        this.c = list;
        this.a = "video/mp2t";
        this.b = new defpackage.fmk[list.size()];
        defpackage.evi eviVar = new defpackage.evi(new defpackage.fuu(this, 2));
        this.d = eviVar;
        eviVar.c(3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.iuu iuuVar;
        if (aolnVar instanceof defpackage.iuu) {
            iuuVar = (defpackage.iuu) aolnVar;
            int i = iuuVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                iuuVar.b = i - Integer.MIN_VALUE;
            } else {
                iuuVar = new defpackage.iuu(this, aolnVar);
            }
        } else {
            iuuVar = new defpackage.iuu(this, aolnVar);
        }
        java.lang.Object objH = iuuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = iuuVar.b;
        if (i2 == 0) {
            aooc.af(objH);
            java.lang.Object obj = this.c;
            iuuVar.b = 1;
            objH = ((ixt) obj).h(iuuVar);
            if (objH != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objH);
            return objH;
        }
        aooc.af(objH);
        java.lang.String str = (java.lang.String) objH;
        if (str == null) {
            return null;
        }
        ?? r4 = this.d;
        defpackage.fyn fynVar = new defpackage.fyn(this, str, (aoln) null, 13);
        iuuVar.b = 2;
        java.lang.Object objAj = aoov.aj((aolr) r4, fynVar, iuuVar);
        if (objAj != aoluVar) {
            return objAj;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.orr orrVar, aoln aolnVar) {
        defpackage.iuv iuvVar;
        java.lang.Object objF;
        defpackage.ivm ivmVar;
        if (aolnVar instanceof defpackage.iuv) {
            iuvVar = (defpackage.iuv) aolnVar;
            int i = iuvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iuvVar.c = i - Integer.MIN_VALUE;
            } else {
                iuvVar = new defpackage.iuv(this, aolnVar);
            }
        } else {
            iuvVar = new defpackage.iuv(this, aolnVar);
        }
        java.lang.Object objA = iuvVar.b;
        aolu aoluVar = aolu.a;
        int i2 = iuvVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                orrVar = (defpackage.orr) iuvVar.a;
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ivmVar = (defpackage.ivm) iuvVar.a;
                aooc.af(objA);
                objF = ((aoiw) objA).a;
            }
            return new defpackage.ivj(ivmVar, objF);
        }
        aooc.af(objA);
        iuvVar.a = orrVar;
        iuvVar.c = 1;
        objA = a(iuvVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        java.io.File file = (java.io.File) objA;
        if (file != null) {
            return new defpackage.ivj(defpackage.ivm.a, new defpackage.hxx(file));
        }
        java.lang.Object obj = this.b;
        defpackage.ivm ivmVar2 = defpackage.ivm.b;
        iuvVar.a = ivmVar2;
        iuvVar.c = 2;
        objF = ((ivi) obj).f(orrVar, iuvVar);
        if (objF == aoluVar) {
            return aoluVar;
        }
        ivmVar = ivmVar2;
        return new defpackage.ivj(ivmVar, objF);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.orr orrVar, aoln aolnVar) {
        defpackage.iuw iuwVar;
        defpackage.ivm ivmVar;
        if (aolnVar instanceof defpackage.iuw) {
            iuwVar = (defpackage.iuw) aolnVar;
            int i = iuwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iuwVar.c = i - Integer.MIN_VALUE;
            } else {
                iuwVar = new defpackage.iuw(this, aolnVar);
            }
        } else {
            iuwVar = new defpackage.iuw(this, aolnVar);
        }
        java.lang.Object objA = iuwVar.b;
        aolu aoluVar = aolu.a;
        int i2 = iuwVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                orrVar = (defpackage.orr) iuwVar.a;
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ivmVar = (defpackage.ivm) iuwVar.a;
                aooc.af(objA);
            }
            return new defpackage.ivl(ivmVar, (java.lang.String) objA);
        }
        aooc.af(objA);
        iuwVar.a = orrVar;
        iuwVar.c = 1;
        objA = a(iuwVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        if (((java.io.File) objA) != null) {
            return new defpackage.ivl(defpackage.ivm.a, ((android.content.Context) this.a).getString(2132017512));
        }
        java.lang.Object obj = this.b;
        defpackage.ivm ivmVar2 = defpackage.ivm.b;
        iuwVar.a = ivmVar2;
        iuwVar.c = 2;
        java.lang.Object objG = ((ivi) obj).g(orrVar, iuwVar);
        if (objG == aoluVar) {
            return aoluVar;
        }
        objA = objG;
        ivmVar = ivmVar2;
        return new defpackage.ivl(ivmVar, (java.lang.String) objA);
    }

    public final void d(long j, defpackage.etx etxVar) {
        if (etxVar.d() >= 9) {
            int i = etxVar.i();
            int i2 = etxVar.i();
            int iN = etxVar.n();
            if (i == 434 && i2 == 1195456820 && iN == 3) {
                ((defpackage.evi) this.d).a(j, etxVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final void e(defpackage.fll fllVar, defpackage.fvb fvbVar) {
        int i = 0;
        while (true) {
            defpackage.fmk[] fmkVarArr = (defpackage.fmk[]) this.b;
            if (i >= fmkVarArr.length) {
                return;
            }
            fvbVar.c();
            defpackage.fmk fmkVarR = fllVar.r(fvbVar.a(), 3);
            defpackage.eqg eqgVar = (defpackage.eqg) this.c.get(i);
            java.lang.String str = eqgVar.p;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            ahvr.bR(z, "Invalid closed caption MIME type provided: %s", str);
            defpackage.eqf eqfVar = new defpackage.eqf();
            eqfVar.a = fvbVar.b();
            eqfVar.a((java.lang.String) this.a);
            eqfVar.c(str);
            eqfVar.e = eqgVar.e;
            eqfVar.d = eqgVar.d;
            eqfVar.L = eqgVar.N;
            eqfVar.q = eqgVar.s;
            fmkVarR.p(new defpackage.eqg(eqfVar));
            fmkVarArr[i] = fmkVarR;
            i++;
        }
    }

    public jkq(defpackage.hda hdaVar, defpackage.hda hdaVar2, defpackage.hdb hdbVar, defpackage.hdb hdbVar2) {
        this.d = hdaVar;
        this.a = hdaVar2;
        this.c = hdbVar;
        this.b = hdbVar2;
    }

    public jkq(ivi iviVar, ixt ixtVar, android.content.Context context, aolr aolrVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "backgroundContext");
        this.b = iviVar;
        this.c = ixtVar;
        this.a = context;
        this.d = aolrVar;
    }

    public jkq(defpackage.jkp jkpVar, ucm ucmVar, rlv rlvVar, uhs uhsVar, agtj agtjVar, defpackage.jmk jmkVar) {
        aooh.f(ucmVar, "tikTokAlertDialogs");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(uhsVar, "spamSettings");
        aooh.f(agtjVar, "futuresMixin");
        this.a = jkpVar;
        this.b = ucmVar;
        this.c = rlvVar;
        this.d = jmkVar;
    }

    public jkq(android.content.Context context, ixt ixtVar, kaw kawVar, aoss aossVar) {
        aooh.f(context, "appContext");
        aooh.f(aossVar, "backgroundScope");
        this.a = context;
        this.b = ixtVar;
        this.c = kawVar;
        this.d = aossVar;
    }
}
