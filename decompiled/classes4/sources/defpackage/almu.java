package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class almu extends alad implements albi {
    public static final defpackage.almu a;
    public static final apdi b;

    static {
        defpackage.almu almuVar = new defpackage.almu();
        a = almuVar;
        alad.Q(defpackage.almu.class, almuVar);
        defpackage.almz almzVar = defpackage.almz.a;
        alrc alrcVar = alrc.a;
        b = alad.W(almzVar, alrcVar, alrcVar, 117, alcr.k);
    }

    private almu() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0000", (java.lang.Object[]) null);
        }
        if (i2 == 3) {
            return new defpackage.almu();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.almu.class);
        }
        return null;
    }
}
