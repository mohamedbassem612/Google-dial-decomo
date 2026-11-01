package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akme extends alad implements albi {
    public static final defpackage.akme a;
    public int b;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public alat e = albq.a;

    static {
        defpackage.akme akmeVar = new defpackage.akme();
        a = akmeVar;
        alad.Q(defpackage.akme.class, akmeVar);
    }

    private akme() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new java.lang.Object[]{"b", "c", "d", "e", defpackage.akmc.class});
        }
        if (i2 == 3) {
            return new defpackage.akme();
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
        return alad.M(defpackage.akme.class);
    }
}
