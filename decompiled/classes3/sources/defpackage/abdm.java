package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abdm extends alad implements albi {
    public static final defpackage.abdm a;
    public alat b = albq.a;

    static {
        defpackage.abdm abdmVar = new defpackage.abdm();
        a = abdmVar;
        alad.Q(defpackage.abdm.class, abdmVar);
    }

    private abdm() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"b", defpackage.abdk.class});
        }
        if (i2 == 3) {
            return new defpackage.abdm();
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
        return alad.M(defpackage.abdm.class);
    }

    public final void b() {
        alat alatVar = this.b;
        if (alatVar.c()) {
            return;
        }
        this.b = alad.J(alatVar);
    }
}
