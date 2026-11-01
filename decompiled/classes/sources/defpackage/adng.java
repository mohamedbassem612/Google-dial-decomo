package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class adng {
    public static final java.util.Set a = defpackage.aihd.v(b(false, false, false, false), b(false, false, false, true), b(false, false, true, false), b(false, false, true, true), b(false, true, false, false), b(false, true, false, true), b(false, true, true, false), b(false, true, true, true), b(true, false, false, false), b(true, false, false, true), b(true, false, true, false), b(true, false, true, true), b(true, true, false, false), b(true, true, false, true), b(true, true, true, false), b(true, true, true, true), defpackage.admp.a);

    static defpackage.adid a(defpackage.adjg adjgVar) {
        int iB = adjgVar.b();
        java.util.Set set = defpackage.adik.a;
        if ((iB & 1) != 0) {
            return defpackage.admp.a;
        }
        defpackage.adic adicVar = new defpackage.adic();
        adicVar.b(false);
        adicVar.b(false);
        defpackage.adia adiaVar = new defpackage.adia();
        adiaVar.d(false);
        adiaVar.b(false);
        adiaVar.c(adjgVar.l());
        adiaVar.e(adjgVar.n());
        adiaVar.d(adjgVar.m());
        adiaVar.b(adjgVar.k());
        adicVar.a = adiaVar.a();
        return adicVar.a();
    }

    private static defpackage.adid b(boolean z, boolean z2, boolean z3, boolean z4) {
        defpackage.adic adicVar = new defpackage.adic();
        adicVar.b(false);
        defpackage.adia adiaVar = new defpackage.adia();
        adiaVar.d(false);
        adiaVar.b(false);
        adiaVar.e(z);
        adiaVar.c(z2);
        adiaVar.d(z3);
        adiaVar.b(z4);
        adicVar.a = adiaVar.a();
        adicVar.b(false);
        return adicVar.a();
    }
}
