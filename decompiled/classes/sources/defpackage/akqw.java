package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akqw extends defpackage.alad implements defpackage.albi {
    public static final defpackage.akqw a;

    static {
        defpackage.akqw akqwVar = new defpackage.akqw();
        a = akqwVar;
        defpackage.alad.Q(defpackage.akqw.class, akqwVar);
    }

    private akqw() {
        defpackage.akzc akzcVar = defpackage.akzc.d;
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new defpackage.akqw();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.akqw.class);
        }
        return null;
    }
}
