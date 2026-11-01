package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tkw extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkw(aoot aootVar, defpackage.tgq tgqVar, aenj aenjVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = aootVar;
        this.b = tgqVar;
        this.c = aenjVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((snl) obj, (aoln) obj2).b(aojh.a);
        }
        return c((defpackage.tkp) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        rub rubVar;
        if (this.$cid != 0) {
            aooc.af(obj);
            snl snlVar = (snl) this.a;
            j$.util.Objects.checkIndex(0, 5);
            if (snlVar != null) {
                if (snlVar instanceof defpackage.tgk) {
                    rubVar = null;
                } else if (snlVar instanceof defpackage.tgi) {
                    rubVar = rub.c;
                } else if (snlVar instanceof defpackage.tgj) {
                    rubVar = rub.d;
                } else if (snlVar instanceof defpackage.tgl) {
                    rubVar = rub.b;
                }
                if (rubVar == null) {
                    return aojh.a;
                }
                aoot aootVar = (aoot) this.d;
                aeun aeunVar = (aeun) aootVar.a;
                if (aeunVar != null) {
                    ((defpackage.tgq) this.b).c.q(aeunVar, (aenj) this.c, rubVar);
                }
                aootVar.a = null;
                return aojh.a;
            }
            throw new aois();
        }
        aooc.af(obj);
        defpackage.rze rzeVarAx = snl.ax(((defpackage.tkp) this.a).p());
        java.lang.String strName = ((defpackage.zmy) this.b).name();
        aooh.f(strName, "value");
        akzx akzxVar = (akzx) rzeVarAx.a;
        akzxVar.u();
        defpackage.tkp tkpVar = (defpackage.tkp) akzxVar.b;
        j$.util.Objects.requireNonNull(strName);
        tkpVar.d = strName;
        java.lang.Object obj2 = this.c;
        aooh.f(obj2, "value");
        akzxVar.u();
        defpackage.tkp tkpVar2 = (defpackage.tkp) akzxVar.b;
        j$.util.Objects.requireNonNull(obj2);
        tkpVar2.c = (alcf) obj2;
        tkpVar2.b |= 1;
        java.lang.Object obj3 = this.d;
        aooh.f(obj3, "value");
        akzxVar.u();
        defpackage.tkp tkpVar3 = (defpackage.tkp) akzxVar.b;
        j$.util.Objects.requireNonNull(obj3);
        tkpVar3.e = (java.lang.String) obj3;
        return rzeVarAx.j();
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        if (this.$cid != 0) {
            java.lang.Object obj2 = this.d;
            aoot aootVar = (aoot) obj2;
            defpackage.tkw tkwVar = new defpackage.tkw(aootVar, (defpackage.tgq) this.b, (aenj) this.c, aolnVar, 1);
            tkwVar.a = obj;
            return tkwVar;
        }
        java.lang.Object obj3 = this.b;
        defpackage.zmy zmyVar = (defpackage.zmy) obj3;
        defpackage.tkw tkwVar2 = new defpackage.tkw(zmyVar, (alcf) this.c, (java.lang.String) this.d, aolnVar, 0);
        tkwVar2.a = obj;
        return tkwVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkw(defpackage.zmy zmyVar, alcf alcfVar, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = zmyVar;
        this.c = alcfVar;
        this.d = str;
    }
}
