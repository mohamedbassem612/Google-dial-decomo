package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agpc extends defpackage.alad implements defpackage.albi {
    public static final defpackage.agpc a;
    public int b;
    public long c;
    public long d;
    public long e;

    static {
        defpackage.agpc agpcVar = new defpackage.agpc();
        a = agpcVar;
        defpackage.alad.Q(defpackage.agpc.class, agpcVar);
    }

    private agpc() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0002\u0003ဂ\u0001", new java.lang.Object[]{"b", "c", "e", "d"});
        }
        if (i2 == 3) {
            return new defpackage.agpc();
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
        return defpackage.alad.M(defpackage.agpc.class);
    }
}
