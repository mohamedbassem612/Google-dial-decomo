package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apul extends defpackage.apyf implements defpackage.apyw {
    public static final defpackage.apul DEFAULT_INSTANCE;
    public static final int FLAGS_FIELD_NUMBER = 1;
    private static volatile defpackage.apza PARSER;
    public defpackage.apys flags_ = defpackage.apys.a;

    static {
        defpackage.apul apulVar = new defpackage.apul();
        DEFAULT_INSTANCE = apulVar;
        defpackage.apyf.o(defpackage.apul.class, apulVar);
    }

    private apul() {
    }

    @Override // defpackage.apyf
    protected final java.lang.Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new defpackage.apzd(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"flags_", defpackage.apuk.a});
        }
        if (i2 == 3) {
            return new defpackage.apul();
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
