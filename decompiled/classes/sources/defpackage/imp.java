package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class imp implements defpackage.ijv {
    @Override // defpackage.ijv
    public final java.lang.Object a(igr igrVar, defpackage.aoln aolnVar) {
        if (igrVar.b != 4) {
            throw new java.lang.IllegalArgumentException("provided model config is not a SODA config");
        }
        her herVarL = hhk.l(igt.a.m());
        herVarL.u(false);
        defpackage.akzx akzxVar = (defpackage.akzx) herVarL.a;
        akzxVar.u();
        igt igtVar = akzxVar.b;
        igtVar.c = java.lang.Integer.valueOf(defpackage.a.U(3));
        igtVar.b = 3;
        return herVarL.t();
    }
}
