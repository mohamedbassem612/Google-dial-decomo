package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amqt extends defpackage.alad implements defpackage.albi {
    public static final defpackage.amqt a;
    public int b;
    public long c;
    public defpackage.alat d = defpackage.albq.a;

    static {
        defpackage.amqt amqtVar = new defpackage.amqt();
        a = amqtVar;
        defpackage.alad.Q(defpackage.amqt.class, amqtVar);
    }

    private amqt() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b", new java.lang.Object[]{"b", "c", "d", amqr.class});
        }
        if (i2 == 3) {
            return new defpackage.amqt();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return defpackage.alad.M(defpackage.amqt.class);
    }
}
