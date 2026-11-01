package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lxq {
    public final defpackage.kiq a;
    public final java.util.List b;
    public final java.util.List c;
    final /* synthetic */ defpackage.lxt d;
    private final aoir e;

    public lxq(defpackage.lxt lxtVar, defpackage.kiq kiqVar) {
        aooh.f(kiqVar, "callDetailsList");
        this.d = lxtVar;
        this.a = kiqVar;
        this.e = aooc.ag(new defpackage.ksu(this, lxtVar, 4));
        alat alatVar = kiqVar.b;
        aooh.e(alatVar, "getCallDetailsList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : alatVar) {
            defpackage.kip kipVar = (defpackage.kip) obj;
            aooh.c(kipVar);
            if (defpackage.lxt.z(kipVar)) {
                arrayList.add(obj);
            }
        }
        this.b = arrayList;
        alat alatVar2 = this.a.b;
        aooh.e(alatVar2, "getCallDetailsList(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : alatVar2) {
            defpackage.kip kipVar2 = (defpackage.kip) obj2;
            aooh.c(kipVar2);
            if (!defpackage.lxt.z(kipVar2)) {
                arrayList2.add(obj2);
            }
        }
        this.c = arrayList2;
    }

    public final java.util.List a() {
        return (java.util.List) this.e.a();
    }
}
