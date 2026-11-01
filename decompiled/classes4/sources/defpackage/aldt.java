package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aldt extends alad implements albi {
    public static final defpackage.aldt a;
    private int b;
    private defpackage.aldq c;

    static {
        defpackage.aldt aldtVar = new defpackage.aldt();
        a = aldtVar;
        alad.Q(defpackage.aldt.class, aldtVar);
    }

    private aldt() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0003", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.aldt();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return alad.M(defpackage.aldt.class);
    }
}
