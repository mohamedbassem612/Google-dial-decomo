package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahud extends alad implements albi {
    public static final defpackage.ahud a;
    public java.lang.String b = "";
    public alat c = albq.a;

    static {
        defpackage.ahud ahudVar = new defpackage.ahud();
        a = ahudVar;
        alad.Q(defpackage.ahud.class, ahudVar);
    }

    private ahud() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001Ȉ\u0003\u001b", new java.lang.Object[]{"b", "c", defpackage.ahub.class});
        }
        if (i2 == 3) {
            return new defpackage.ahud();
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
        return alad.M(defpackage.ahud.class);
    }
}
