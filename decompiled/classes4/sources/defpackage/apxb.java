package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apxb extends defpackage.apyf implements defpackage.apyw {
    public static final defpackage.apxb DEFAULT_INSTANCE;
    private static volatile defpackage.apza PARSER = null;
    public static final int PROXIES_FIELD_NUMBER = 1;
    public defpackage.apyi proxies_ = defpackage.apzc.a;

    static {
        defpackage.apxb apxbVar = new defpackage.apxb();
        DEFAULT_INSTANCE = apxbVar;
        defpackage.apyf.o(defpackage.apxb.class, apxbVar);
    }

    private apxb() {
    }

    @Override // defpackage.apyf
    protected final java.lang.Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new defpackage.apzd(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"proxies_", defpackage.apxa.class});
        }
        if (i2 == 3) {
            return new defpackage.apxb();
        }
        if (i2 == 4) {
            return new defpackage.apyd(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }
}
