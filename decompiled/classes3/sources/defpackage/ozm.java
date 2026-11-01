package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ozm extends aomh implements aonn {
    final /* synthetic */ jig a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozm(jig jigVar, aoln aolnVar) {
        super(2, aolnVar);
        this.a = jigVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        defpackage.ozn oznVar = (defpackage.ozn) this.a.b;
        int i = oznVar.e;
        int i2 = i == 0 ? 1 : i + (-1) != 0 ? 3 : 2;
        akzx akzxVarM = defpackage.amny.a.m();
        aooh.f(akzxVarM, "builder");
        for (defpackage.ozo ozoVar : oznVar.c) {
            java.lang.Float f = ozoVar.b;
            java.lang.Integer numValueOf = f != null ? java.lang.Integer.valueOf(aooc.w((int) (f.floatValue() * 1000.0f), -1000, 1000)) : null;
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.amny) akzxVarM.b).d);
            aooh.e(listUnmodifiableList, "getSwipeEventsList(...)");
            new alct(listUnmodifiableList);
            akzx akzxVarM2 = defpackage.amnu.a.m();
            aooh.f(akzxVarM2, "builder");
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                akzxVarM2.u();
                defpackage.amnu amnuVar = (defpackage.amnu) akzxVarM2.b;
                amnuVar.b |= 2;
                amnuVar.d = iIntValue;
            }
            defpackage.amnv amnvVar = ozoVar.a.f;
            aooh.f(amnvVar, "value");
            akzxVarM2.u();
            defpackage.amnu amnuVar2 = (defpackage.amnu) akzxVarM2.b;
            amnuVar2.c = amnvVar.g;
            amnuVar2.b |= 1;
            alad aladVarP = akzxVarM2.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.amnu amnuVar3 = (defpackage.amnu) aladVarP;
            aooh.f(amnuVar3, "value");
            akzxVarM.u();
            defpackage.amny amnyVar = (defpackage.amny) akzxVarM.b;
            j$.util.Objects.requireNonNull(amnuVar3);
            alat alatVar = amnyVar.d;
            if (!alatVar.c()) {
                amnyVar.d = alad.J(alatVar);
            }
            amnyVar.d.add(amnuVar3);
        }
        for (defpackage.ozq ozqVar : oznVar.d) {
            java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(((defpackage.amny) akzxVarM.b).e);
            aooh.e(listUnmodifiableList2, "getTapEventsList(...)");
            new alct(listUnmodifiableList2);
            akzx akzxVarM3 = defpackage.amnw.a.m();
            aooh.f(akzxVarM3, "builder");
            defpackage.amnx amnxVar = ozqVar.a.d;
            aooh.f(amnxVar, "value");
            akzxVarM3.u();
            defpackage.amnw amnwVar = (defpackage.amnw) akzxVarM3.b;
            amnwVar.c = amnxVar.e;
            amnwVar.b |= 1;
            alad aladVarP2 = akzxVarM3.p();
            aooh.e(aladVarP2, "build(...)");
            defpackage.amnw amnwVar2 = (defpackage.amnw) aladVarP2;
            aooh.f(amnwVar2, "value");
            akzxVarM.u();
            defpackage.amny amnyVar2 = (defpackage.amny) akzxVarM.b;
            j$.util.Objects.requireNonNull(amnwVar2);
            alat alatVar2 = amnyVar2.e;
            if (!alatVar2.c()) {
                amnyVar2.e = alad.J(alatVar2);
            }
            amnyVar2.e.add(amnwVar2);
        }
        akzxVarM.u();
        defpackage.amny amnyVar3 = (defpackage.amny) akzxVarM.b;
        amnyVar3.c = i2 - 1;
        amnyVar3.b |= 1;
        if (((java.lang.Boolean) oznVar.b.a()).booleanValue()) {
            boolean zA = oznVar.a.a();
            akzxVarM.u();
            defpackage.amny amnyVar4 = (defpackage.amny) akzxVarM.b;
            amnyVar4.b |= 2;
            amnyVar4.f = zA;
        }
        alad aladVarP3 = akzxVarM.p();
        aooh.e(aladVarP3, "build(...)");
        return (defpackage.amny) aladVarP3;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ozm(this.a, aolnVar);
    }
}
