package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alop extends alad implements albi {
    public static final defpackage.alop a;
    public static final apdi b;

    static {
        defpackage.alop alopVar = new defpackage.alop();
        a = alopVar;
        alad.Q(defpackage.alop.class, alopVar);
        defpackage.almz almzVar = defpackage.almz.a;
        defpackage.alst alstVar = defpackage.alst.a;
        b = alad.W(almzVar, alstVar, alstVar, 137, alcr.k);
    }

    private alop() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0000", (java.lang.Object[]) null);
        }
        if (i2 == 3) {
            return new defpackage.alop();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alop.class);
        }
        return null;
    }
}
