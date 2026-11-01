package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ixq extends aomh implements aonn {
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ java.lang.String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixq(java.lang.String str, java.lang.String str2, aoln aolnVar) {
        super(2, aolnVar);
        this.b = str;
        this.c = str2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((ixh) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.String str;
        aooc.af(obj);
        ixh ixhVar = (ixh) this.a;
        alat alatVar = ixhVar.e;
        aooh.e(alatVar, "getBeeslyGreetingsList(...)");
        java.util.Iterator it = alatVar.iterator();
        int i = 0;
        while (true) {
            str = this.b;
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            defpackage.ixd ixdVar = (defpackage.ixd) it.next();
            int i2 = ixdVar.b;
            if (defpackage.ixc.a(i2) == defpackage.ixc.b) {
                if (aooh.n((i2 == 2 ? (defpackage.ixf) ixdVar.c : defpackage.ixf.a).b, str)) {
                    break;
                }
            }
            i++;
        }
        if (i < 0) {
            ixt.b.d().l("com/android/dialer/beesly/impl/settings/greeting/service/BeeslyGreetingsDataService", "renameCustomGreeting$<anonymous>", 235, "BeeslyGreetingsDataService.kt").y("Rename failed: greeting with id: %s not found", str);
            return ixhVar;
        }
        aimw aimwVarL = ixt.b.b().l("com/android/dialer/beesly/impl/settings/greeting/service/BeeslyGreetingsDataService", "renameCustomGreeting$<anonymous>", 238, "BeeslyGreetingsDataService.kt");
        java.lang.String str2 = this.c;
        aimwVarL.I("Renaming custom greeting with id: %s to %s", str, str2);
        alat alatVar2 = ixhVar.e;
        aooh.e(alatVar2, "getBeeslyGreetingsList(...)");
        java.util.List listCb = ajsz.cb(alatVar2);
        java.lang.Object obj2 = listCb.get(i);
        aooh.e(obj2, "get(...)");
        defpackage.ni niVarV = defpackage.hgz.V(((defpackage.ixd) obj2).p());
        defpackage.ixd ixdVar2 = (defpackage.ixd) ((akzx) niVarV.a).b;
        defpackage.ixf ixfVar = ixdVar2.b == 2 ? (defpackage.ixf) ixdVar2.c : defpackage.ixf.a;
        aooh.e(ixfVar, "getCustomGreeting(...)");
        defpackage.her herVarV = defpackage.hgz.v(ixfVar.p());
        herVarV.p(str2);
        niVarV.S(herVarV.o());
        listCb.set(i, niVarV.R());
        defpackage.her herVarM = defpackage.hhb.m(ixhVar.p());
        herVarM.n();
        herVarM.m();
        herVarM.n();
        herVarM.k(listCb);
        return herVarM.h();
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.ixq ixqVar = new defpackage.ixq(this.b, this.c, aolnVar);
        ixqVar.a = obj;
        return ixqVar;
    }
}
