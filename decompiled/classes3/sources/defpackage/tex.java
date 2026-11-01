package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class tex extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.tfz b;
    final /* synthetic */ defpackage.tez c;
    final /* synthetic */ android.app.Activity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tex(defpackage.tfz tfzVar, defpackage.tez tezVar, android.app.Activity activity, aoln aolnVar) {
        super(2, aolnVar);
        this.b = tfzVar;
        this.c = tezVar;
        this.d = activity;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, rlv] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        mce mceVar;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            defpackage.tfz tfzVar = this.b;
            j$.util.Objects.checkIndex(0, 11);
            if (tfzVar != null) {
                if (tfzVar instanceof defpackage.tfy) {
                    defpackage.tfy tfyVar = (defpackage.tfy) tfzVar;
                    this.c.d(tfyVar.a, tfyVar.b, tfyVar.c, this.d, 1);
                } else if (tfzVar instanceof defpackage.tfu) {
                    defpackage.tfu tfuVar = (defpackage.tfu) tfzVar;
                    this.c.d(tfuVar.a, tfuVar.b, false, this.d, 2);
                } else if (tfzVar instanceof defpackage.tfw) {
                    defpackage.tfw tfwVar = (defpackage.tfw) tfzVar;
                    this.c.d(tfwVar.a, null, tfwVar.b, this.d, 3);
                } else if (tfzVar instanceof defpackage.tfx) {
                    defpackage.tez tezVar = this.c;
                    android.app.Activity activity = this.d;
                    defpackage.tfj tfjVar = ((defpackage.tfx) tfzVar).a;
                    tezVar.b.k(tfjVar.a, nwt.j);
                    defpackage.zlr zlrVar = tezVar.c;
                    zlrVar.a.n(rmw.eu);
                    int i2 = tfjVar.e - 1;
                    if (i2 != 0) {
                        mceVar = i2 != 4 ? mce.eu : mce.es;
                    } else {
                        mceVar = mce.et;
                    }
                    ((gpd) zlrVar.d).i((java.lang.String) null).b(mceVar);
                    ahvr.g(new defpackage.tjr(), activity);
                } else if (tfzVar instanceof defpackage.tfp) {
                    defpackage.tez tezVar2 = this.c;
                    android.app.Activity activity2 = this.d;
                    akzx akzxVarM = defpackage.uxq.a.m();
                    aooh.f(akzxVarM, "builder");
                    defpackage.tfj tfjVar2 = ((defpackage.tfp) tfzVar).a;
                    java.lang.String str = tfjVar2.a;
                    aooh.f(str, "value");
                    akzxVarM.u();
                    defpackage.uxq uxqVar = (defpackage.uxq) akzxVarM.b;
                    j$.util.Objects.requireNonNull(str);
                    uxqVar.b |= 1;
                    uxqVar.c = str;
                    akzxVarM.u();
                    defpackage.uxq uxqVar2 = (defpackage.uxq) akzxVarM.b;
                    uxqVar2.b |= 4;
                    uxqVar2.e = true;
                    akzxVarM.u();
                    defpackage.uxq uxqVar3 = (defpackage.uxq) akzxVarM.b;
                    j$.util.Objects.requireNonNull("");
                    uxqVar3.b |= 2;
                    uxqVar3.d = "";
                    alad aladVarP = akzxVarM.p();
                    aooh.e(aladVarP, "build(...)");
                    j$.util.Optional optionalAW = wsc.aW(activity2, (defpackage.uxq) aladVarP);
                    aooh.e(optionalAW, "createAddContactAction(...)");
                    snl.aG(optionalAW);
                    tezVar2.c.a.n(tfjVar2.f == 2 ? rmw.jL : rmw.jI);
                } else if (tfzVar instanceof defpackage.tfq) {
                    mni.cB(this.d, ((defpackage.tfq) tfzVar).a.a);
                } else if (tfzVar instanceof defpackage.tfr) {
                    defpackage.tez tezVar3 = this.c;
                    android.app.Activity activity3 = this.d;
                    akzx akzxVarM2 = defpackage.uxu.a.m();
                    aooh.f(akzxVarM2, "builder");
                    java.lang.String str2 = ((defpackage.tfr) tfzVar).a.a;
                    aooh.f(str2, "value");
                    akzxVarM2.u();
                    defpackage.uxu uxuVar = (defpackage.uxu) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(str2);
                    uxuVar.b |= 1;
                    uxuVar.c = str2;
                    alad aladVarP2 = akzxVarM2.p();
                    aooh.e(aladVarP2, "build(...)");
                    j$.util.Optional optionalB = new defpackage.uxt(tezVar3.d, activity3, (defpackage.uxu) aladVarP2, 0).b();
                    aooh.e(optionalB, "getUserActionLogic(...)");
                    snl.aG(optionalB);
                } else if (tfzVar instanceof defpackage.tft) {
                    android.app.Activity activity4 = this.d;
                    this.a = 1;
                    if (this.c.b((defpackage.tft) tfzVar, activity4, this) == aoluVar) {
                        return aoluVar;
                    }
                } else if (tfzVar instanceof defpackage.tfv) {
                    defpackage.tez tezVar4 = this.c;
                    android.app.Activity activity5 = this.d;
                    defpackage.tfj tfjVar3 = ((defpackage.tfv) tfzVar).a;
                    defpackage.uxw.b(activity5, wsc.aT(tfjVar3.a), 2132017288);
                    tezVar4.c.a.n(tfjVar3.f == 2 ? rmw.jK : rmw.jH);
                } else if (tfzVar instanceof defpackage.tfs) {
                    defpackage.tez tezVar5 = this.c;
                    defpackage.tfs tfsVar = (defpackage.tfs) tfzVar;
                    android.app.Activity activity6 = this.d;
                    tezVar5.c.a.n(tfsVar.a.f == 2 ? rmw.jQ : rmw.jP);
                    android.provider.ContactsContract.QuickContact.showQuickContact(activity6, new android.graphics.Rect(0, 0, 0, 0), tfsVar.b, 3, (java.lang.String[]) null);
                }
            }
            throw new aois();
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.tex(this.b, this.c, this.d, aolnVar);
    }
}
