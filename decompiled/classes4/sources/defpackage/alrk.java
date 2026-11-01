package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alrk extends alad implements albi {
    public static final defpackage.alrk a;
    public int b = 0;
    public java.lang.Object c;

    static {
        defpackage.alrk alrkVar = new defpackage.alrk();
        a = alrkVar;
        alad.Q(defpackage.alrk.class, alrkVar);
    }

    private alrk() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new java.lang.Object[]{"c", "b", defpackage.alry.class, defpackage.alrl.class, defpackage.alrj.class});
        }
        if (i2 == 3) {
            return new defpackage.alrk();
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
        return alad.M(defpackage.alrk.class);
    }
}
