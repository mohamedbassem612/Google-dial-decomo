package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akmn extends alad implements albi {
    public static final defpackage.akmn a;
    public boolean b;
    public boolean c;
    public alat d = albq.a;

    static {
        defpackage.akmn akmnVar = new defpackage.akmn();
        a = akmnVar;
        alad.Q(defpackage.akmn.class, akmnVar);
    }

    private akmn() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0007\u0002\u001b\u0003\u0007", new java.lang.Object[]{"b", "d", defpackage.akmk.class, "c"});
        }
        if (i2 == 3) {
            return new defpackage.akmn();
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
        return alad.M(defpackage.akmn.class);
    }
}
