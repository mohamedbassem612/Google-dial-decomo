package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahwn extends alad implements albi {
    public static final defpackage.ahwn a;
    public int b;
    public akzc c;
    public akzc d;
    public defpackage.ahwm e;
    public akzc f;

    static {
        defpackage.ahwn ahwnVar = new defpackage.ahwn();
        a = ahwnVar;
        alad.Q(defpackage.ahwn.class, ahwnVar);
    }

    private ahwn() {
        akzc akzcVar = akzc.d;
        this.c = akzcVar;
        this.d = akzcVar;
        this.f = akzcVar;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဉ\u0002\u0005ည\u0004", new java.lang.Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.ahwn();
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
        return alad.M(defpackage.ahwn.class);
    }
}
