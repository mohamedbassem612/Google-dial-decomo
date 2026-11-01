package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahvm extends alad implements albi {
    public static final defpackage.ahvm a;
    public java.lang.String b = "";
    public int c;

    static {
        defpackage.ahvm ahvmVar = new defpackage.ahvm();
        a = ahvmVar;
        alad.Q(defpackage.ahvm.class, ahvmVar);
    }

    private ahvm() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.ahvm();
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
        return alad.M(defpackage.ahvm.class);
    }
}
