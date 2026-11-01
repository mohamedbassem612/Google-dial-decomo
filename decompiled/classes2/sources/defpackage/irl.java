package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class irl {
    public static final aimz a = aimz.i("com/android/dialer/beesly/impl/BeeslyImpl");
    public final ish b;
    public final iwk c;
    public final ixt d;
    public final ita e;
    public final android.content.Context f;
    public final kgl g;
    private final iqm h;
    private final jbm i;
    private final zjm j;
    private final kaw k;

    public irl(ish ishVar, iqm iqmVar, kgl kglVar, jbm jbmVar, iwk iwkVar, ixt ixtVar, ita itaVar, zjm zjmVar, android.content.Context context, kaw kawVar) {
        aooh.f(ishVar, "singletonAudioPrismConfigProvider");
        aooh.f(kglVar, "beeslySot");
        aooh.f(jbmVar, "beeslySettings");
        aooh.f(itaVar, "beeslyLatestVoteStorage");
        aooh.f(context, "appContext");
        aooh.f(kawVar, "hasAnotherActiveCallCache");
        this.b = ishVar;
        this.h = iqmVar;
        this.g = kglVar;
        this.i = jbmVar;
        this.c = iwkVar;
        this.d = ixtVar;
        this.e = itaVar;
        this.j = zjmVar;
        this.f = context;
        this.k = kawVar;
    }

    public final long a() {
        return this.b.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(long j, aoln aolnVar) {
        defpackage.irj irjVar;
        if (aolnVar instanceof defpackage.irj) {
            irjVar = (defpackage.irj) aolnVar;
            int i = irjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                irjVar.c = i - Integer.MIN_VALUE;
            } else {
                irjVar = new defpackage.irj(this, aolnVar);
            }
        } else {
            irjVar = new defpackage.irj(this, aolnVar);
        }
        java.lang.Object objP = irjVar.a;
        aolu aoluVar = aolu.a;
        int i2 = irjVar.c;
        if (i2 == 0) {
            aooc.af(objP);
            if (e()) {
                kgl kglVar = this.g;
                defpackage.ity ityVar = new defpackage.ity(j);
                irjVar.c = 1;
                objP = kglVar.p(ityVar, irjVar);
                if (objP == aoluVar) {
                    return aoluVar;
                }
            } else {
                a.b().l("com/android/dialer/beesly/impl/BeeslyImpl", "getCallActionsStateByTimestamp", 85, "BeeslyImpl.kt").v("Beesly call action is not supported, return empty call actions state.");
            }
            return null;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objP);
        defpackage.itc itcVar = (defpackage.itc) objP;
        defpackage.itr itrVar = itcVar != null ? itcVar.b : null;
        j$.util.Objects.checkIndex(0, 4);
        if (itrVar != null) {
            if (itrVar instanceof defpackage.itp) {
                defpackage.ni niVarW = defpackage.hgz.W(defpackage.kor.a.m());
                niVarW.z(((defpackage.itp) itrVar).a);
                return niVarW.y();
            }
            if (itrVar instanceof defpackage.itx) {
                defpackage.ni niVarW2 = defpackage.hgz.W(defpackage.kor.a.m());
                niVarW2.B(defpackage.hgu.J(defpackage.koq.a.m()).w());
                return niVarW2.y();
            }
            if (itrVar instanceof defpackage.itu) {
                defpackage.ni niVarW3 = defpackage.hgz.W(defpackage.kor.a.m());
                niVarW3.A(defpackage.hgu.K(defpackage.kop.a.m()).x());
                return niVarW3.y();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.irk irkVar;
        if (aolnVar instanceof defpackage.irk) {
            irkVar = (defpackage.irk) aolnVar;
            int i = irkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                irkVar.c = i - Integer.MIN_VALUE;
            } else {
                irkVar = new defpackage.irk(this, aolnVar);
            }
        } else {
            irkVar = new defpackage.irk(this, aolnVar);
        }
        java.lang.Object objA = irkVar.a;
        aolu aoluVar = aolu.a;
        int i2 = irkVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            if (this.k.r()) {
                return java.lang.Boolean.TRUE;
            }
            j$.util.Optional optionalG = this.j.g();
            aooh.e(optionalG, "getFeature(...)");
            if (aooh.q(optionalG) == null) {
                return java.lang.Boolean.FALSE;
            }
            ita itaVar = this.e;
            irkVar.c = 1;
            objA = itaVar.a(irkVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        defpackage.isx isxVar = (defpackage.isx) objA;
        return java.lang.Boolean.valueOf((isxVar != null ? isxVar.a : null) == defpackage.isw.c);
    }

    public final java.lang.Object d(aoln aolnVar) {
        return this.i.g(aolnVar);
    }

    public final boolean e() {
        return this.h.c();
    }
}
