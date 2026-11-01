package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
abstract class acff implements ahyc {
    public abstract void a(defpackage.akux akuxVar, akzx akzxVar);

    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        defpackage.akux akuxVar = (defpackage.akux) obj;
        akzx akzxVarM = defpackage.akkh.a.m();
        d(akuxVar, akzxVarM);
        e(akuxVar, akzxVarM);
        k(akuxVar, akzxVarM);
        b(akuxVar, akzxVarM);
        j(akuxVar, akzxVarM);
        f(akuxVar, akzxVarM);
        c(akuxVar, akzxVarM);
        if ((akuxVar.b & 4) != 0) {
            g(akuxVar, akzxVarM);
        }
        h(akuxVar, akzxVarM);
        a(akuxVar, akzxVarM);
        if ((akuxVar.b & 2) != 0) {
            ahxq ahxqVar = defpackage.acgh.b;
            defpackage.akuw akuwVarB = defpackage.akuw.b(akuxVar.d);
            if (akuwVarB == null) {
                akuwVarB = defpackage.akuw.PLACEMENT_UNSPECIFIED;
            }
            defpackage.akkg akkgVar = (defpackage.akkg) ahxqVar.d(akuwVarB);
            akzxVarM.u();
            defpackage.akkh akkhVar = (defpackage.akkh) akzxVarM.b;
            akkhVar.l = akkgVar.d;
            akkhVar.b |= 64;
        }
        i(akuxVar, akzxVarM);
        return (defpackage.akkh) akzxVarM.p();
    }

    public abstract void b(defpackage.akux akuxVar, akzx akzxVar);

    public abstract void c(defpackage.akux akuxVar, akzx akzxVar);

    public abstract void d(defpackage.akux akuxVar, akzx akzxVar);

    public abstract void e(defpackage.akux akuxVar, akzx akzxVar);

    public abstract void f(defpackage.akux akuxVar, akzx akzxVar);

    public void g(defpackage.akux akuxVar, akzx akzxVar) {
        throw null;
    }

    public abstract void h(defpackage.akux akuxVar, akzx akzxVar);

    public abstract void i(defpackage.akux akuxVar, akzx akzxVar);

    public abstract void j(defpackage.akux akuxVar, akzx akzxVar);

    public abstract void k(defpackage.akux akuxVar, akzx akzxVar);
}
