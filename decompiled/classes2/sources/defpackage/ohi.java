package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ohi implements zno, zni, znp, qts, defpackage.ogq {
    public static final aimz a = aimz.i("com/android/dialer/expresso/sender/impl/service/ExpressoController");
    public final aoss b;
    public final defpackage.ohr c;
    public final defpackage.ogu d;
    public final defpackage.mba e;
    public final aoin f;
    public final aoin g;
    public boolean h;
    public boolean i;
    public boolean j;
    public defpackage.ohb k;
    public final rap l;
    public final zpz m;
    public final qbe n;
    public final ahda o;
    public final rsr p;
    public final tpf q;
    private final ahda r;
    private final ahda s;
    private final afpl t;

    public ohi(aoss aossVar, rap rapVar, defpackage.ohr ohrVar, defpackage.ogu oguVar, zpz zpzVar, defpackage.mba mbaVar, tpf tpfVar, qbe qbeVar, afpl afplVar, rsr rsrVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rapVar, "bottomSheetPresenter");
        aooh.f(ohrVar, "preConditions");
        aooh.f(oguVar, "remote");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(tpfVar, "snackbarController");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(aoinVar, "enableExpressoUi");
        aooh.f(aoinVar2, "enableExpressoHandshake");
        this.b = aossVar;
        this.l = rapVar;
        this.c = ohrVar;
        this.d = oguVar;
        this.m = zpzVar;
        this.e = mbaVar;
        this.q = tpfVar;
        this.n = qbeVar;
        this.t = afplVar;
        this.p = rsrVar;
        this.f = aoinVar;
        this.g = aoinVar2;
        this.r = new ahda((byte[]) null);
        this.o = new ahda((byte[]) null);
        this.s = new ahda((byte[]) null);
        this.k = defpackage.ohb.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final boolean g(defpackage.ohb ohbVar, defpackage.ohb ohbVar2) throws aois {
        switch (ohbVar.ordinal()) {
            case 0:
                if (ohbVar2 != defpackage.ohb.b) {
                    return false;
                }
                break;
            case 1:
                if (ohbVar2 != defpackage.ohb.a && ohbVar2 != defpackage.ohb.c) {
                    return false;
                }
                break;
            case 2:
                if (ohbVar2 != defpackage.ohb.d && ohbVar2 != defpackage.ohb.e && ohbVar2 != defpackage.ohb.g && ohbVar2 != defpackage.ohb.f && ohbVar2 != defpackage.ohb.h && ohbVar2 != defpackage.ohb.i && ohbVar2 != defpackage.ohb.a) {
                    return false;
                }
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                if (ohbVar2 != defpackage.ohb.a) {
                    return false;
                }
                break;
            default:
                throw new aois();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.ohe oheVar;
        if (aolnVar instanceof defpackage.ohe) {
            oheVar = (defpackage.ohe) aolnVar;
            int i = oheVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oheVar.c = i - Integer.MIN_VALUE;
            } else {
                oheVar = new defpackage.ohe(this, aolnVar);
            }
        } else {
            oheVar = new defpackage.ohe(this, aolnVar);
        }
        java.lang.Object objD = oheVar.a;
        aolu aoluVar = aolu.a;
        int i2 = oheVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.t.X();
            oheVar.c = 1;
            objD = aosv.D(ajcqVarX, oheVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
            return objD;
        }
        aooc.af(objD);
        ajcq ajcqVarR = ((defpackage.ohd) aooc.ar(objD, defpackage.ohd.class)).R();
        oheVar.c = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarR, oheVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.ohf ohfVar;
        if (aolnVar instanceof defpackage.ohf) {
            ohfVar = (defpackage.ohf) aolnVar;
            int i = ohfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ohfVar.c = i - Integer.MIN_VALUE;
            } else {
                ohfVar = new defpackage.ohf(this, aolnVar);
            }
        } else {
            ohfVar = new defpackage.ohf(this, aolnVar);
        }
        java.lang.Object objD = ohfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ohfVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            defpackage.ohb ohbVar = this.k;
            defpackage.ohb ohbVar2 = defpackage.ohb.a;
            if (g(ohbVar, ohbVar2)) {
                this.k = ohbVar2;
            }
            if (!this.h && this.i) {
                rap rapVar = this.l;
                ajcq ajcqVarG = rapVar.v.g(new raj(rapVar, 4), rapVar.k);
                aooh.e(ajcqVarG, "getCurrentlySelectedMultibindingBottomSheet(...)");
                ohfVar.c = 1;
                objD = aosv.D(ajcqVarG, ohfVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objD);
        aooh.e(objD, "await(...)");
        qtr qtrVar = (qtr) aooh.q((j$.util.Optional) objD);
        if (qtrVar != null && qtrVar == qtr.c) {
            this.l.d();
            this.h = true;
            return aojh.a;
        }
        return aojh.a;
    }

    public final ajcq d() {
        return aosv.C(ahvr.ag(this.b, this.r, new defpackage.ogf(this, (aoln) null, 4)));
    }

    public final java.lang.Object e(defpackage.ohb ohbVar, aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.b, this.s, new defpackage.ohh(this, ohbVar, (aoln) null, 2)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public final ajcq ek() {
        return aosv.C(ahvr.ag(this.b, this.r, new defpackage.ogf(this, (aoln) null, 5, (byte[]) null)));
    }

    public final ajcq em() {
        return aosv.C(ahvr.ag(this.b, this.r, new defpackage.oct(this, (aoln) null, 3)));
    }

    @Override // defpackage.ogq
    public final void f(defpackage.ogp ogpVar) {
        aooh.f(ogpVar, "message");
    }

    public final ajcq h(int i) {
        return aosv.C(ahvr.ag(this.b, this.s, new ohg(this, (aoln) null, 0)));
    }
}
