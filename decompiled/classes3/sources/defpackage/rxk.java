package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rxk extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    java.lang.Object f;
    int g;
    final /* synthetic */ defpackage.zrx h;
    final /* synthetic */ java.lang.Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxk(defpackage.zrx zrxVar, rxl rxlVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.h = zrxVar;
        this.i = rxlVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Object obj9;
        java.lang.Object obj10;
        java.lang.Object obj11;
        java.lang.Object obj12;
        java.lang.Object obj13;
        if (this.$cid != 0) {
            aolu aoluVar = aolu.a;
            if (this.g != 0) {
                obj9 = this.f;
                obj11 = this.e;
                obj10 = this.d;
                java.lang.Object obj14 = this.c;
                obj8 = this.b;
                java.lang.Object obj15 = this.a;
                aooc.af(obj);
                obj13 = obj14;
                obj12 = obj15;
            } else {
                aooc.af(obj);
                defpackage.zrx zrxVar = this.h;
                java.lang.Object obj16 = this.i;
                defpackage.zoe zoeVarCi = aehj.ci(zrxVar.p());
                defpackage.uzx uzxVarCu = aehj.cu(zoeVarCi.b().p());
                akzx akzxVarM = defpackage.zse.a.m();
                aooh.f(akzxVarM, "builder");
                defpackage.uzx uzxVar = new defpackage.uzx(akzxVarM);
                this.a = zoeVarCi;
                this.b = uzxVarCu;
                this.c = zoeVarCi;
                this.d = uzxVar;
                this.e = uzxVarCu;
                this.f = uzxVar;
                this.g = 1;
                java.lang.Object objB = ((rsr) ((sua) obj16).a).b(this);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                obj8 = uzxVarCu;
                obj9 = uzxVar;
                obj10 = obj9;
                obj = objB;
                obj11 = obj8;
                obj12 = zoeVarCi;
                obj13 = zoeVarCi;
            }
            java.lang.String str = (java.lang.String) obj;
            aooh.f(str, "value");
            akzx akzxVar = (akzx) ((defpackage.uzx) obj9).a;
            akzxVar.u();
            defpackage.zse zseVar = (defpackage.zse) akzxVar.b;
            defpackage.zse zseVar2 = defpackage.zse.a;
            j$.util.Objects.requireNonNull(str);
            zseVar.b |= 1;
            zseVar.c = str;
            alad aladVarP = ((akzx) ((defpackage.uzx) obj10).a).p();
            aooh.e(aladVarP, "build(...)");
            defpackage.zse zseVar3 = (defpackage.zse) aladVarP;
            aooh.f(zseVar3, "value");
            akzx akzxVar2 = (akzx) ((defpackage.uzx) obj11).a;
            akzxVar2.u();
            defpackage.zsf zsfVar = (defpackage.zsf) akzxVar2.b;
            defpackage.zsf zsfVar2 = defpackage.zsf.a;
            j$.util.Objects.requireNonNull(zseVar3);
            zsfVar.q = zseVar3;
            zsfVar.b |= 8192;
            ((defpackage.zoe) obj13).d(((defpackage.uzx) obj8).T());
            return ((defpackage.zoe) obj12).a();
        }
        aolu aoluVar2 = aolu.a;
        if (this.g != 0) {
            obj3 = this.f;
            obj5 = this.e;
            obj4 = this.d;
            java.lang.Object obj17 = this.c;
            obj2 = this.b;
            java.lang.Object obj18 = this.a;
            aooc.af(obj);
            obj7 = obj17;
            obj6 = obj18;
        } else {
            aooc.af(obj);
            defpackage.zrx zrxVar2 = this.h;
            java.lang.Object obj19 = this.i;
            defpackage.zoe zoeVarCi2 = aehj.ci(zrxVar2.p());
            defpackage.uzx uzxVarCu2 = aehj.cu(zoeVarCi2.b().p());
            akzx akzxVarM2 = defpackage.zsd.a.m();
            aooh.f(akzxVarM2, "builder");
            defpackage.uzx uzxVar2 = new defpackage.uzx(akzxVarM2);
            ajcq ajcqVarC = ((rxl) obj19).c.c();
            this.a = zoeVarCi2;
            this.b = uzxVarCu2;
            this.c = zoeVarCi2;
            this.d = uzxVar2;
            this.e = uzxVarCu2;
            this.f = uzxVar2;
            this.g = 1;
            java.lang.Object objD = aosv.D(ajcqVarC, this);
            if (objD == aoluVar2) {
                return aoluVar2;
            }
            obj2 = uzxVarCu2;
            obj3 = uzxVar2;
            obj4 = obj3;
            obj = objD;
            obj5 = obj2;
            obj6 = zoeVarCi2;
            obj7 = zoeVarCi2;
        }
        aooh.e(obj, "await(...)");
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        akzx akzxVar3 = (akzx) ((defpackage.uzx) obj3).a;
        akzxVar3.u();
        defpackage.zsd zsdVar = (defpackage.zsd) akzxVar3.b;
        defpackage.zsd zsdVar2 = defpackage.zsd.a;
        zsdVar.b |= 1;
        zsdVar.c = zBooleanValue;
        alad aladVarP2 = ((akzx) ((defpackage.uzx) obj4).a).p();
        aooh.e(aladVarP2, "build(...)");
        defpackage.zsd zsdVar3 = (defpackage.zsd) aladVarP2;
        aooh.f(zsdVar3, "value");
        akzx akzxVar4 = (akzx) ((defpackage.uzx) obj5).a;
        akzxVar4.u();
        defpackage.zsf zsfVar3 = (defpackage.zsf) akzxVar4.b;
        defpackage.zsf zsfVar4 = defpackage.zsf.a;
        j$.util.Objects.requireNonNull(zsdVar3);
        zsfVar3.r = zsdVar3;
        zsfVar3.b |= 16384;
        ((defpackage.zoe) obj7).d(((defpackage.uzx) obj2).T());
        return ((defpackage.zoe) obj6).a();
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return this.$cid != 0 ? new defpackage.rxk(this.h, (sua) this.i, aolnVar, 1) : new defpackage.rxk(this.h, (rxl) this.i, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxk(defpackage.zrx zrxVar, sua suaVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.h = zrxVar;
        this.i = suaVar;
    }
}
