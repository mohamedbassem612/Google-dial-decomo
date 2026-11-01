package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rpc extends defpackage.alad implements defpackage.albi {
    public static final defpackage.rpc a;
    public int b;

    static {
        defpackage.rpc rpcVar = new defpackage.rpc();
        a = rpcVar;
        defpackage.alad.Q(defpackage.rpc.class, rpcVar);
    }

    private rpc() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new java.lang.Object[]{"b"});
        }
        if (i2 == 3) {
            return new defpackage.rpc();
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
        return defpackage.alad.M(defpackage.rpc.class);
    }
}
