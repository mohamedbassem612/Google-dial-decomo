package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alrn extends alad implements albi {
    public static final defpackage.alrn a;

    static {
        defpackage.alrn alrnVar = new defpackage.alrn();
        a = alrnVar;
        alad.Q(defpackage.alrn.class, alrnVar);
    }

    private alrn() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0000", (java.lang.Object[]) null);
        }
        if (i2 == 3) {
            return new defpackage.alrn();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alrn.class);
        }
        return null;
    }
}
