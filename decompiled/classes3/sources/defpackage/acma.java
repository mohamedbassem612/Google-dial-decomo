package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acma {
    public final ahyc a;
    public final defpackage.vaa b;
    private final akzx e;
    private final aaoo f = defpackage.acmd.e;
    private defpackage.acmd c = null;
    private final akzz d = acmi.a.m();

    public acma(defpackage.vaa vaaVar, ahyc ahycVar, defpackage.vaa vaaVar2) {
        this.e = (akzx) vaaVar.a;
        d(((akzx) vaaVar.a).b.d);
        this.a = ahycVar;
        this.b = vaaVar2;
    }

    private final void d(int i) {
        akzz akzzVar = this.d;
        long j = akzzVar.b.g + ((long) i);
        akzzVar.u();
        acmi acmiVar = akzzVar.b;
        acmiVar.b |= 8;
        acmiVar.g = j;
    }

    private final void e(int i) {
        akzz akzzVar = this.d;
        long j = akzzVar.b.h + ((long) i);
        akzzVar.u();
        acmi acmiVar = akzzVar.b;
        acmiVar.b |= 16;
        acmiVar.h = j;
    }

    public final void a(defpackage.acmb acmbVar) {
        defpackage.acmd acmdVar = this.c;
        ahvr.cc(acmdVar == null, "CVE %s has already been built.", acmdVar);
        akzz akzzVar = this.d;
        aiwc aiwcVar = akzzVar.b.d;
        if (aiwcVar == null) {
            aiwcVar = aiwc.a;
        }
        ahvr.bY(!((aiwcVar.b & 2048) != 0));
        apdi apdiVar = acmbVar.b;
        if (!akzzVar.bU(apdiVar)) {
            int iA = apdiVar.a();
            akzzVar.u();
            acmi acmiVar = akzzVar.b;
            alak alakVar = acmiVar.c;
            if (!alakVar.c()) {
                acmiVar.c = alad.H(alakVar);
            }
            acmiVar.c.g(iA);
        }
        java.lang.Object obj = acmbVar.a;
        akzzVar.bV(apdiVar, obj);
        d(apdiVar.a());
        d(apdiVar.hashCode());
        d(obj.hashCode());
    }

    public final void b(acmc acmcVar) {
        defpackage.acmd acmdVar = this.c;
        ahvr.cc(acmdVar == null, "CVE %s has already been built.", acmdVar);
        apdi apdiVar = acmcVar.b;
        java.lang.Object obj = acmcVar.a;
        this.d.bV(apdiVar, obj);
        e(apdiVar.a());
        e(apdiVar.hashCode());
        e(obj.hashCode());
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Set] */
    public final defpackage.acmd c(defpackage.vaa vaaVar) {
        ahvr.bZ(this.c == null, "Cannot create CVE twice.");
        akzz akzzVar = this.d;
        akzzVar.u();
        acmi acmiVar = akzzVar.b;
        aiwc aiwcVarP = this.e.p();
        acmi acmiVar2 = acmi.a;
        j$.util.Objects.requireNonNull(aiwcVarP);
        acmiVar.d = aiwcVarP;
        acmiVar.b |= 1;
        defpackage.acmd acmdVar = new defpackage.acmd(akzzVar.p().p(), this.f, vaaVar);
        this.c = acmdVar;
        ?? r6 = acmdVar.d.a;
        if (!r6.isEmpty()) {
            if (android.util.Log.isLoggable("GIL", 2)) {
                android.util.Log.v("GIL", "Instrumented: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(acmdVar))));
            }
            java.util.Iterator it = r6.iterator();
            while (it.hasNext()) {
                java.lang.Object obj = ((defpackage.aprf) it.next()).a;
                afec.c();
            }
        }
        return this.c;
    }
}
