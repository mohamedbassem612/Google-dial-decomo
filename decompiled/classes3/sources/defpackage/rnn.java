package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rnn {
    public static final aimz a = aimz.i("com/android/dialer/logging/redial/RedialLoggingImpl");
    public final aolr b;
    public final defpackage.pqo c;
    public final defpackage.qbe d;
    private final ojo e;
    private final okj f;
    private final zjs g;
    private final long h;
    private final aoin i;
    private final ahbv j;
    private final defpackage.afpl k;

    public rnn(aolr aolrVar, ahbv ahbvVar, defpackage.pqo pqoVar, ojo ojoVar, okj okjVar, zjs zjsVar, defpackage.afpl afplVar, defpackage.qbe qbeVar, long j, aoin aoinVar) {
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(ahbvVar, "dialerPhoneNumbers");
        aooh.f(pqoVar, "callDirection");
        aooh.f(ojoVar, "dialerContentResolver");
        aooh.f(zjsVar, "dialerTelecom");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(aoinVar, "redialTimeSeconds");
        this.b = aolrVar;
        this.j = ahbvVar;
        this.c = pqoVar;
        this.e = ojoVar;
        this.f = okjVar;
        this.g = zjsVar;
        this.k = afplVar;
        this.d = qbeVar;
        this.h = j;
        this.i = aoinVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.rne rneVar;
        if (aolnVar instanceof defpackage.rne) {
            rneVar = (defpackage.rne) aolnVar;
            int i = rneVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rneVar.c = i - Integer.MIN_VALUE;
            } else {
                rneVar = new defpackage.rne(this, aolnVar);
            }
        } else {
            rneVar = new defpackage.rne(this, aolnVar);
        }
        java.lang.Object objD = rneVar.a;
        aolu aoluVar = aolu.a;
        int i2 = rneVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return ((j$.util.Optional) objD).orElse((java.lang.Object) null);
        }
        aooc.af(objD);
        ajcq ajcqVarX = this.k.X();
        rneVar.c = 1;
        objD = aosv.D(ajcqVarX, rneVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarR = ((defpackage.rnd) aooc.ar(objD, defpackage.rnd.class)).R();
        rneVar.c = 2;
        objD = aosv.D(ajcqVarR, rneVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return ((j$.util.Optional) objD).orElse((java.lang.Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.rnf rnfVar;
        if (aolnVar instanceof defpackage.rnf) {
            rnfVar = (defpackage.rnf) aolnVar;
            int i = rnfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rnfVar.c = i - Integer.MIN_VALUE;
            } else {
                rnfVar = new defpackage.rnf(this, aolnVar);
            }
        } else {
            rnfVar = new defpackage.rnf(this, aolnVar);
        }
        java.lang.Object objD = rnfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = rnfVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.k.X();
            rnfVar.c = 1;
            objD = aosv.D(ajcqVarX, rnfVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.rnd.class);
        aooh.e(objAr, "get(...)");
        return objAr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.rng rngVar;
        if (aolnVar instanceof defpackage.rng) {
            rngVar = (defpackage.rng) aolnVar;
            int i = rngVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rngVar.c = i - Integer.MIN_VALUE;
            } else {
                rngVar = new defpackage.rng(this, aolnVar);
            }
        } else {
            rngVar = new defpackage.rng(this, aolnVar);
        }
        java.lang.Object objB = rngVar.a;
        aolu aoluVar = aolu.a;
        int i2 = rngVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objB);
            }
            return aooh.q((j$.util.Optional) objB);
        }
        aooc.af(objB);
        rngVar.c = 1;
        objB = b(rngVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarBa = ((defpackage.rnd) objB).ba();
        rngVar.c = 2;
        objB = aosv.D(ajcqVarBa, rngVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objB);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:36:0x0114  */
    /* JADX WARN: Code duplicated, block: B:39:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0114 -> B:37:0x0116). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(hkd r19, aoln r20) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rnn.d(hkd, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.rnj rnjVar;
        if (aolnVar instanceof defpackage.rnj) {
            rnjVar = (defpackage.rnj) aolnVar;
            int i = rnjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rnjVar.c = i - Integer.MIN_VALUE;
            } else {
                rnjVar = new defpackage.rnj(this, aolnVar);
            }
        } else {
            rnjVar = new defpackage.rnj(this, aolnVar);
        }
        java.lang.Object objC = rnjVar.a;
        aolu aoluVar = aolu.a;
        int i2 = rnjVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objC);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objC);
            }
            return java.lang.String.valueOf(((java.lang.Number) objC).intValue());
        }
        aooc.af(objC);
        rnjVar.c = 1;
        objC = c(rnjVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) objC;
        if (phoneAccountHandle == null) {
            return "-1";
        }
        okj okjVar = this.f;
        rnjVar.c = 2;
        objC = okjVar.k(phoneAccountHandle, rnjVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        return java.lang.String.valueOf(((java.lang.Number) objC).intValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(aoln aolnVar) {
        defpackage.rnk rnkVar;
        if (aolnVar instanceof defpackage.rnk) {
            rnkVar = (defpackage.rnk) aolnVar;
            int i = rnkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rnkVar.c = i - Integer.MIN_VALUE;
            } else {
                rnkVar = new defpackage.rnk(this, aolnVar);
            }
        } else {
            rnkVar = new defpackage.rnk(this, aolnVar);
        }
        java.lang.Object objB = rnkVar.a;
        aolu aoluVar = aolu.a;
        int i2 = rnkVar.c;
        if (i2 == 0) {
            aooc.af(objB);
            rnkVar.c = 1;
            objB = b(rnkVar);
            if (objB != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objB);
            return objB;
        }
        aooc.af(objB);
        ajcq ajcqVarAJ = ((defpackage.rnd) objB).aJ();
        rnkVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarAJ, rnkVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(defpackage.zmy zmyVar, defpackage.zmy zmyVar2, java.lang.String str, java.lang.String str2, aoln aolnVar) {
        defpackage.rnm rnmVar;
        defpackage.zmy zmyVar3;
        java.lang.String str3;
        java.lang.String str4;
        if (aolnVar instanceof defpackage.rnm) {
            rnmVar = (defpackage.rnm) aolnVar;
            int i = rnmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rnmVar.c = i - Integer.MIN_VALUE;
            } else {
                rnmVar = new defpackage.rnm(this, aolnVar);
            }
        } else {
            rnmVar = new defpackage.rnm(this, aolnVar);
        }
        java.lang.Object objF = rnmVar.a;
        aolu aoluVar = aolu.a;
        int i2 = rnmVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                str2 = rnmVar.g;
                str = rnmVar.f;
                zmyVar2 = rnmVar.e;
                zmyVar = rnmVar.d;
                aooc.af(objF);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = rnmVar.g;
                str3 = rnmVar.f;
                zmyVar2 = rnmVar.e;
                zmyVar3 = rnmVar.d;
                aooc.af(objF);
            }
            boolean z = (objF == null || zmyVar3 == defpackage.zmy.c || zmyVar2 != defpackage.zmy.b || aooh.n(str3, "-1") || aooh.n(str4, "-1")) ? false : true;
            return java.lang.Boolean.valueOf(z);
        }
        aooc.af(objF);
        rnmVar.d = zmyVar;
        rnmVar.e = zmyVar2;
        rnmVar.f = str;
        rnmVar.g = str2;
        rnmVar.c = 1;
        objF = f(rnmVar);
        if (objF == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objF).booleanValue()) {
            zjs zjsVar = this.g;
            rnmVar.d = zmyVar;
            rnmVar.e = zmyVar2;
            rnmVar.f = str;
            rnmVar.g = str2;
            rnmVar.c = 2;
            objF = zjsVar.B(rnmVar);
            if (objF == aoluVar) {
                return aoluVar;
            }
            java.lang.String str5 = str;
            zmyVar3 = zmyVar;
            str3 = str5;
            str4 = str2;
            if (objF == null) {
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}
