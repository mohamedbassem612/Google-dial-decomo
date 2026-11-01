package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ajzz implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ ajzz(defpackage.aevz aevzVar, ajcq ajcqVar, ajcq ajcqVar2, ajcq ajcqVar3, int i) {
        this.$cid = i;
        this.d = aevzVar;
        this.a = ajcqVar;
        this.c = ajcqVar2;
        this.b = ajcqVar3;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v0, types: [akab, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        int i = this.$cid;
        if (i == 0) {
            boolean zBooleanValue = ((java.lang.Boolean) ((anmb) ((defpackage.aljf) this.b).a).f(defpackage.akaa.a)).booleanValue();
            java.lang.Object obj = this.d;
            ?? r2 = this.c;
            java.lang.Object obj2 = this.a;
            if (zBooleanValue) {
                defpackage.akaa akaaVar = (defpackage.akaa) obj2;
                if (!akaaVar.h.f()) {
                    return r2.c((defpackage.ajzy) obj, akaaVar.g);
                }
            }
            return r2.b((defpackage.ajzy) obj, ((defpackage.akaa) obj2).g);
        }
        if (i != 1) {
            java.util.List list = (java.util.List) aiql.H((java.util.concurrent.Future) this.d);
            java.lang.Object obj3 = this.c;
            java.lang.Object obj4 = this.b;
            java.lang.Object obj5 = this.a;
            defpackage.akxf akxfVar = defpackage.akxf.b;
            ((akwz) obj5).d(list, (alfr) obj4, (akxt) obj3, akxfVar);
            return akxfVar;
        }
        akzx akzxVarM = defpackage.aevy.a.m();
        akzxVarM.u();
        defpackage.aevy aevyVar = (defpackage.aevy) akzxVarM.b;
        defpackage.aevz aevzVar = (defpackage.aevz) this.d;
        java.lang.String str = aevzVar.d;
        j$.util.Objects.requireNonNull(str);
        aevyVar.b |= 1;
        aevyVar.c = str;
        akzxVarM.an(aevzVar.a);
        akzxVarM.an(aevzVar.b);
        akzxVarM.an(aevzVar.c);
        akzxVarM.u();
        defpackage.aevy aevyVar2 = (defpackage.aevy) akzxVarM.b;
        aevyVar2.b |= 2;
        aevyVar2.d = false;
        akzxVarM.u();
        defpackage.aevy aevyVar3 = (defpackage.aevy) akzxVarM.b;
        aevyVar3.b |= 16;
        aevyVar3.h = aevzVar.e;
        ?? r1 = this.a;
        ?? r3 = this.c;
        ?? r6 = this.b;
        try {
            ahyn ahynVar = (ahyn) aiql.H((java.util.concurrent.Future) r1);
            if (ahynVar.f()) {
                java.lang.String str2 = (java.lang.String) ahynVar.b();
                akzxVarM.u();
                defpackage.aevy aevyVar4 = (defpackage.aevy) akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                aevyVar4.b |= 8;
                aevyVar4.f = str2;
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            java.util.List list2 = (java.util.List) aiql.H((java.util.concurrent.Future) r3);
            akzxVarM.u();
            defpackage.aevy aevyVar5 = (defpackage.aevy) akzxVarM.b;
            alak alakVar = aevyVar5.g;
            if (!alakVar.c()) {
                aevyVar5.g = alad.H(alakVar);
            }
            akyl.i(list2, aevyVar5.g);
        } catch (java.lang.Exception unused2) {
        }
        try {
            ahyn ahynVar2 = (ahyn) aiql.H((java.util.concurrent.Future) r6);
            if (ahynVar2.f()) {
                java.lang.String str3 = (java.lang.String) ahynVar2.b();
                akzxVarM.u();
                defpackage.aevy aevyVar6 = (defpackage.aevy) akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                aevyVar6.b |= 4;
                aevyVar6.e = str3;
            }
        } catch (java.lang.Exception unused3) {
        }
        akzz akzzVarM = defpackage.aevu.a.m();
        akzzVarM.bV(defpackage.aevy.j, (defpackage.aevy) akzxVarM.p());
        return akzzVarM.p();
    }

    public /* synthetic */ ajzz(defpackage.akaa akaaVar, defpackage.aljf aljfVar, akab akabVar, defpackage.ajzy ajzyVar, int i) {
        this.$cid = i;
        this.a = akaaVar;
        this.b = aljfVar;
        this.c = akabVar;
        this.d = ajzyVar;
    }

    public /* synthetic */ ajzz(akwz akwzVar, ajcq ajcqVar, alfr alfrVar, akxt akxtVar, int i) {
        this.$cid = i;
        this.a = akwzVar;
        this.d = ajcqVar;
        this.b = alfrVar;
        this.c = akxtVar;
    }
}
