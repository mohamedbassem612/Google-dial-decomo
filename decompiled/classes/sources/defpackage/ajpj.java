package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajpj extends defpackage.alad implements defpackage.albi {
    public static final defpackage.ajpj a;
    public int b;
    public int c;
    public ajph d;
    public defpackage.akzc e;
    public defpackage.akzc f;

    static {
        defpackage.ajpj ajpjVar = new defpackage.ajpj();
        a = ajpjVar;
        defpackage.alad.Q(defpackage.ajpj.class, ajpjVar);
    }

    private ajpj() {
        defpackage.akzc akzcVar = defpackage.akzc.d;
        this.e = akzcVar;
        this.f = akzcVar;
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new java.lang.Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.ajpj();
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
        return defpackage.alad.M(defpackage.ajpj.class);
    }
}
