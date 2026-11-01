package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alph {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.alty b;

    static {
        defpackage.altx altxVarB = defpackage.alty.b();
        altxVarB.b(1);
        b = altxVarB.a();
    }

    public static int a(alqu alquVar) {
        return j$.util.Collection.-EL.stream(b.a(alquVar, false)).mapToInt(new rar(17)).sum();
    }

    public static java.lang.String b(alqu alquVar) {
        if ((alquVar.c == 1 ? (defpackage.alqm) alquVar.d : defpackage.alqm.a).b.size() > 0) {
            return ((defpackage.alqq) (alquVar.c == 1 ? (defpackage.alqm) alquVar.d : defpackage.alqm.a).b.get(0)).c.trim();
        }
        if ((alquVar.c == 2 ? (defpackage.alqr) alquVar.d : defpackage.alqr.a).b.size() > 0) {
            return ((defpackage.alqq) (alquVar.c == 2 ? (defpackage.alqr) alquVar.d : defpackage.alqr.a).b.get(0)).c.trim();
        }
        return "";
    }

    public static boolean c(alqu alquVar) {
        if (!(alquVar.c == 2 ? (defpackage.alqr) alquVar.d : defpackage.alqr.a).b.isEmpty()) {
            if (!((defpackage.alqq) (alquVar.c == 2 ? (defpackage.alqr) alquVar.d : defpackage.alqr.a).b.get(0)).c.isEmpty()) {
                return false;
            }
        }
        if (!(alquVar.c == 1 ? (defpackage.alqm) alquVar.d : defpackage.alqm.a).b.isEmpty()) {
            if (!((defpackage.alqq) (alquVar.c == 1 ? (defpackage.alqm) alquVar.d : defpackage.alqm.a).b.get(0)).c.isEmpty()) {
                return false;
            }
        }
        if (!(alquVar.c == 12 ? (defpackage.alqs) alquVar.d : defpackage.alqs.a).b.isEmpty()) {
            if (!((defpackage.alqq) (alquVar.c == 12 ? (defpackage.alqs) alquVar.d : defpackage.alqs.a).b.get(0)).c.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(alqu alquVar, double d) {
        int iA = a(alquVar);
        int length = b(alquVar).length();
        return length > 0 && ((double) (((float) iA) / ((float) length))) >= d;
    }

    public static boolean e(aify aifyVar) {
        return j$.util.Collection.-EL.stream(aifyVar).mapToInt(new rar(19)).sum() >= 3 && ((double) (((float) j$.util.Collection.-EL.stream(aifyVar).mapToInt(new rar(20)).sum()) / ((float) j$.util.Collection.-EL.stream(aifyVar).mapToInt(new rar(18)).sum()))) >= 0.5d;
    }
}
