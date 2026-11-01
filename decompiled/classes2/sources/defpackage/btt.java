package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class btt {
    public final aomy a;
    public final aonj b;
    public final boolean c;
    public defpackage.apy d;
    public ajl e;
    public ajl f;
    private final java.util.Set g;

    public btt(java.util.Set set, aomy aomyVar, defpackage.btu btuVar, aonj aonjVar, boolean z) {
        this.g = set;
        this.a = aomyVar;
        this.b = aonjVar;
        this.c = z;
        if (!set.contains(defpackage.btu.b)) {
            throw new java.lang.IllegalArgumentException("Expanded must be one of the enabled values.");
        }
        if (!set.contains(btuVar)) {
            throw new java.lang.IllegalArgumentException("The initial value must be one of the enabled values.");
        }
        int i = defpackage.bto.a;
        this.d = new defpackage.apy(btuVar, aonjVar);
        this.e = new defpackage.aks(null);
        this.f = new defpackage.aks(null);
    }

    public final float a() {
        return this.d.c();
    }

    public final float b() {
        return this.d.e();
    }

    public final defpackage.btu c() {
        return (defpackage.btu) this.d.j();
    }

    public final defpackage.btu d() {
        return (defpackage.btu) this.d.k();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(ars arsVar, float f, aoln aolnVar) {
        defpackage.btp btpVar;
        aooq aooqVar;
        if (aolnVar instanceof defpackage.btp) {
            btpVar = (defpackage.btp) aolnVar;
            int i = btpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                btpVar.c = i - Integer.MIN_VALUE;
            } else {
                btpVar = new defpackage.btp(this, aolnVar);
            }
        } else {
            btpVar = new defpackage.btp(this, aolnVar);
        }
        java.lang.Object obj = btpVar.a;
        aolu aoluVar = aolu.a;
        int i2 = btpVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aooq aooqVar2 = new aooq();
            defpackage.apy apyVar = this.d;
            defpackage.btq btqVar = new defpackage.btq(aooqVar2, arsVar, this, f, null);
            btpVar.d = aooqVar2;
            btpVar.c = 1;
            if (apyVar.f(defpackage.aoc.a, btqVar, btpVar) == aoluVar) {
                return aoluVar;
            }
            aooqVar = aooqVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooqVar = btpVar.d;
            aooc.af(obj);
        }
        return new java.lang.Float(aooqVar.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.btu btuVar, ajl ajlVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.btr btrVar;
        defpackage.btu btuVar2;
        aoot aootVar;
        if (aolnVar instanceof defpackage.btr) {
            btrVar = (defpackage.btr) aolnVar;
            int i = btrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                btrVar.c = i - Integer.MIN_VALUE;
            } else {
                btrVar = new defpackage.btr(this, aolnVar);
            }
        } else {
            btrVar = new defpackage.btr(this, aolnVar);
        }
        java.lang.Object obj = btrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = btrVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aootVar = btrVar.e;
                btuVar2 = btrVar.d;
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        aoot aootVar2 = new aoot();
        aootVar2.a = btuVar;
        defpackage.apy apyVar = this.d;
        defpackage.bts btsVar = new defpackage.bts(aootVar2, this, ajlVar, null);
        btrVar.d = btuVar;
        btrVar.e = aootVar2;
        btrVar.c = 1;
        if (apyVar.g(btuVar, defpackage.aoc.a, btsVar, btrVar) == aoluVar) {
            return aoluVar;
        }
        btuVar2 = btuVar;
        aootVar = aootVar2;
        if (aootVar.a != btuVar2 && this.d.p().g(aootVar.a)) {
            defpackage.apy apyVar2 = this.d;
            java.lang.Object obj2 = aootVar.a;
            btrVar.d = null;
            btrVar.e = null;
            btrVar.c = 2;
            java.lang.Object objG = apyVar2.g(obj2, defpackage.aoc.a, new defpackage.apo(null), btrVar);
            if (objG != aoluVar) {
                objG = aojh.a;
            }
            if (objG == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final java.lang.Object g(aoln aolnVar) {
        java.lang.Object objF;
        aonj aonjVar = this.b;
        defpackage.btu btuVar = defpackage.btu.b;
        return (((java.lang.Boolean) aonjVar.a(btuVar)).booleanValue() && (objF = f(btuVar, this.e, aolnVar)) == aolu.a) ? objF : aojh.a;
    }

    public final java.lang.Object h(aoln aolnVar) {
        java.lang.Object objF;
        java.util.Set set = this.g;
        defpackage.btu btuVar = defpackage.btu.a;
        if (set.contains(btuVar)) {
            return (((java.lang.Boolean) this.b.a(btuVar)).booleanValue() && (objF = f(btuVar, this.f, aolnVar)) == aolu.a) ? objF : aojh.a;
        }
        throw new java.lang.IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
    }

    public final java.lang.Object i(aoln aolnVar) {
        java.lang.Object objF;
        if (l()) {
            throw new java.lang.IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        aonj aonjVar = this.b;
        defpackage.btu btuVar = defpackage.btu.c;
        return (((java.lang.Boolean) aonjVar.a(btuVar)).booleanValue() && (objF = f(btuVar, this.f, aolnVar)) == aolu.a) ? objF : aojh.a;
    }

    public final java.lang.Object j(aoln aolnVar) {
        java.lang.Object objF;
        defpackage.btu btuVar = k() ? defpackage.btu.c : defpackage.btu.b;
        return (((java.lang.Boolean) this.b.a(btuVar)).booleanValue() && (objF = f(btuVar, this.e, aolnVar)) == aolu.a) ? objF : aojh.a;
    }

    public final boolean k() {
        return this.d.p().g(defpackage.btu.c);
    }

    public final boolean l() {
        return !this.g.contains(defpackage.btu.c);
    }

    public final boolean m() {
        return this.d.h() != defpackage.btu.a;
    }
}
