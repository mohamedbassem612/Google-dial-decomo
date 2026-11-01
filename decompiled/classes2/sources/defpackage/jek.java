package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jek {
    private final android.content.Context a;
    private final long b;
    private final java.lang.String c;
    private final defpackage.jeq d;
    private final defpackage.mba e;
    private final iqm f;
    private final qbe g;
    private final kgl h;
    private final afpl i;

    public jek(android.content.Context context, long j, java.lang.String str, afpl afplVar, defpackage.jeq jeqVar, defpackage.mba mbaVar, qbe qbeVar, kgl kglVar, iqm iqmVar) {
        aooh.f(context, "appContext");
        aooh.f(str, "uniqueCallId");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(kglVar, "beeslySot");
        this.a = context;
        this.b = j;
        this.c = str;
        this.i = afplVar;
        this.d = jeqVar;
        this.e = mbaVar;
        this.g = qbeVar;
        this.h = kglVar;
        this.f = iqmVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0111  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:50:0x011d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0120  */
    /* JADX WARN: Code duplicated, block: B:53:0x0122  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.itc itcVar, aoln aolnVar) {
        defpackage.jee jeeVar;
        java.lang.String string;
        int i;
        java.lang.Object objE;
        defpackage.itc itcVar2;
        java.lang.String str;
        int i2;
        java.lang.String str2;
        int iP;
        java.lang.Object objF;
        int i3;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        boolean z;
        if (aolnVar instanceof defpackage.jee) {
            jeeVar = (defpackage.jee) aolnVar;
            int i4 = jeeVar.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                jeeVar.e = i4 - Integer.MIN_VALUE;
            } else {
                jeeVar = new defpackage.jee(this, aolnVar);
            }
        } else {
            jeeVar = new defpackage.jee(this, aolnVar);
        }
        java.lang.Object obj = jeeVar.c;
        aolu aoluVar = aolu.a;
        int i5 = jeeVar.e;
        if (i5 != 0) {
            if (i5 == 1) {
                int i6 = jeeVar.a;
                string = jeeVar.g;
                defpackage.itc itcVar3 = jeeVar.f;
                aooc.af(obj);
                i = i6;
                itcVar2 = itcVar3;
                objE = obj;
            } else if (i5 == 2) {
                int i7 = jeeVar.a;
                java.lang.String str6 = jeeVar.h;
                str2 = jeeVar.g;
                defpackage.itc itcVar4 = jeeVar.f;
                aooc.af(obj);
                i2 = i7;
                itcVar2 = itcVar4;
                str = str6;
                iP = rsr.p((zna) obj);
                jeeVar.f = itcVar2;
                jeeVar.g = str2;
                jeeVar.h = str;
                jeeVar.a = i2;
                jeeVar.b = iP;
                jeeVar.e = 3;
                objF = f(jeeVar);
                if (objF != aoluVar) {
                    return aoluVar;
                }
                i3 = i2;
                str3 = str2;
                str4 = str;
            } else {
                if (i5 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = jeeVar.b;
                i3 = jeeVar.a;
                str4 = jeeVar.h;
                str3 = jeeVar.g;
                defpackage.itc itcVar5 = jeeVar.f;
                aooc.af(obj);
                iP = i8;
                itcVar2 = itcVar5;
                objF = obj;
            }
            java.lang.String str7 = this.c;
            abwd abwdVar = (abwd) objF;
            if (itcVar2 != null) {
                str5 = itcVar2.f;
            } else {
                str5 = null;
            }
            if (1 != i3) {
                z = false;
            } else {
                z = true;
            }
            return new defpackage.jel(str4, iP, abwdVar, str7, str3, str5, z);
        }
        aooc.af(obj);
        iqm iqmVar = this.f;
        if (iqmVar.d()) {
            this.g.a(qbc.cv);
            string = this.a.getString(2132017506);
        } else if (itcVar == null || defpackage.hgz.l(itcVar)) {
            this.g.a(qbc.cv);
            string = this.a.getString(2132017564);
        } else {
            string = itcVar.d;
            if (string == null || !aoov.H(string)) {
                this.g.a(qbc.cs);
            } else {
                this.g.a(qbc.cu);
                string = this.a.getString(2132017565);
            }
        }
        i = (iqmVar.d() || itcVar == null || defpackage.hgz.l(itcVar)) ? 0 : 1;
        this.e.b(mce.gX);
        jeeVar.f = itcVar;
        jeeVar.g = string;
        jeeVar.a = i;
        jeeVar.e = 1;
        objE = e(jeeVar);
        if (objE == aoluVar) {
            return aoluVar;
        }
        itcVar2 = itcVar;
        str = (java.lang.String) objE;
        jeeVar.f = itcVar2;
        jeeVar.g = string;
        jeeVar.h = str;
        jeeVar.a = i;
        jeeVar.e = 2;
        java.lang.Object objD = d(jeeVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        java.lang.String str8 = string;
        i2 = i;
        obj = objD;
        str2 = str8;
        iP = rsr.p((zna) obj);
        jeeVar.f = itcVar2;
        jeeVar.g = str2;
        jeeVar.h = str;
        jeeVar.a = i2;
        jeeVar.b = iP;
        jeeVar.e = 3;
        objF = f(jeeVar);
        if (objF != aoluVar) {
            return aoluVar;
        }
        i3 = i2;
        str3 = str2;
        str4 = str;
        java.lang.String str9 = this.c;
        abwd abwdVar2 = (abwd) objF;
        if (itcVar2 != null) {
            str5 = itcVar2.f;
        } else {
            str5 = null;
        }
        if (1 != i3) {
            z = false;
        } else {
            z = true;
        }
        return new defpackage.jel(str4, iP, abwdVar2, str9, str3, str5, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.jef jefVar;
        if (aolnVar instanceof defpackage.jef) {
            jefVar = (defpackage.jef) aolnVar;
            int i = jefVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jefVar.c = i - Integer.MIN_VALUE;
            } else {
                jefVar = new defpackage.jef(this, aolnVar);
            }
        } else {
            jefVar = new defpackage.jef(this, aolnVar);
        }
        java.lang.Object objD = jefVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jefVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.i.X();
            jefVar.c = 1;
            objD = aosv.D(ajcqVarX, jefVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.jed.class);
        aooh.e(objAr, "get(...)");
        return objAr;
    }

    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.jeg jegVar;
        defpackage.jeq jeqVar;
        long j;
        if (aolnVar instanceof defpackage.jeg) {
            jegVar = (defpackage.jeg) aolnVar;
            int i = jegVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jegVar.d = i - Integer.MIN_VALUE;
            } else {
                jegVar = new defpackage.jeg(this, aolnVar);
            }
        } else {
            jegVar = new defpackage.jeg(this, aolnVar);
        }
        java.lang.Object objP = jegVar.b;
        aolu aoluVar = aolu.a;
        int i2 = jegVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objP);
            } else if (i2 == 2) {
                j = jegVar.a;
                jeqVar = jegVar.e;
                aooc.af(objP);
                jegVar.e = null;
                jegVar.d = 3;
                if (jeqVar.c(j, (defpackage.jel) objP, jegVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objP);
            }
            return aojh.a;
        }
        aooc.af(objP);
        kgl kglVar = this.h;
        defpackage.ity ityVar = new defpackage.ity(this.b);
        jegVar.d = 1;
        objP = kglVar.p(ityVar, jegVar);
        if (objP == aoluVar) {
            return aoluVar;
        }
        defpackage.jeq jeqVar2 = this.d;
        long j2 = this.b;
        jegVar.e = jeqVar2;
        jegVar.a = j2;
        jegVar.d = 2;
        objP = a((defpackage.itc) objP, jegVar);
        if (objP == aoluVar) {
            return aoluVar;
        }
        jeqVar = jeqVar2;
        j = j2;
        jegVar.e = null;
        jegVar.d = 3;
        if (jeqVar.c(j, (defpackage.jel) objP, jegVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.jeh jehVar;
        if (aolnVar instanceof defpackage.jeh) {
            jehVar = (defpackage.jeh) aolnVar;
            int i = jehVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jehVar.c = i - Integer.MIN_VALUE;
            } else {
                jehVar = new defpackage.jeh(this, aolnVar);
            }
        } else {
            jehVar = new defpackage.jeh(this, aolnVar);
        }
        java.lang.Object objB = jehVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jehVar.c;
        if (i2 == 0) {
            aooc.af(objB);
            jehVar.c = 1;
            objB = b(jehVar);
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
        ajcq ajcqVarV = ((defpackage.jed) objB).v();
        jehVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarV, jehVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.jei jeiVar;
        if (aolnVar instanceof defpackage.jei) {
            jeiVar = (defpackage.jei) aolnVar;
            int i = jeiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jeiVar.c = i - Integer.MIN_VALUE;
            } else {
                jeiVar = new defpackage.jei(this, aolnVar);
            }
        } else {
            jeiVar = new defpackage.jei(this, aolnVar);
        }
        java.lang.Object objB = jeiVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jeiVar.c;
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
        jeiVar.c = 1;
        objB = b(jeiVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarBl = ((defpackage.jed) objB).bl();
        jeiVar.c = 2;
        objB = aosv.D(ajcqVarBl, jeiVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(aoln aolnVar) {
        defpackage.jej jejVar;
        if (aolnVar instanceof defpackage.jej) {
            jejVar = (defpackage.jej) aolnVar;
            int i = jejVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jejVar.c = i - Integer.MIN_VALUE;
            } else {
                jejVar = new defpackage.jej(this, aolnVar);
            }
        } else {
            jejVar = new defpackage.jej(this, aolnVar);
        }
        java.lang.Object objB = jejVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jejVar.c;
        if (i2 == 0) {
            aooc.af(objB);
            jejVar.c = 1;
            objB = b(jejVar);
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
        ajcq ajcqVarBh = ((defpackage.jed) objB).bh();
        jejVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarBh, jejVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }
}
