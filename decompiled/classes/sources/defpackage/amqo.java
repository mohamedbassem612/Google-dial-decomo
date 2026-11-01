package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amqo extends defpackage.alad implements defpackage.albi {
    public static final defpackage.amqo a;
    public int b;
    public long e;
    public defpackage.ampq f;
    public long h;
    public defpackage.ampu i;
    public int c = 1000;
    public int d = 100000;
    public java.lang.String g = "";

    static {
        defpackage.amqo amqoVar = new defpackage.amqo();
        a = amqoVar;
        defpackage.alad.Q(defpackage.amqo.class, amqoVar);
    }

    private amqo() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0007\u0000\u0001\u0003\t\u0007\u0000\u0000\u0000\u0003ဂ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007᠌\u0000\b᠌\u0001\tဉ\u0006", new java.lang.Object[]{"b", "e", "f", "g", "h", "c", defpackage.rmv.a, "d", defpackage.udi.b, "i"});
        }
        if (i2 == 3) {
            return new defpackage.amqo();
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
        return defpackage.alad.M(defpackage.amqo.class);
    }
}
