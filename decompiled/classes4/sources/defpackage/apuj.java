package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apuj extends defpackage.apyf implements defpackage.apyw {
    public static final int CONSTRAINED_VALUES_FIELD_NUMBER = 8;
    public static final defpackage.apuj DEFAULT_INSTANCE;
    private static volatile defpackage.apza PARSER;
    public defpackage.apyi constrainedValues_ = defpackage.apzc.a;

    static {
        defpackage.apuj apujVar = new defpackage.apuj();
        DEFAULT_INSTANCE = apujVar;
        defpackage.apyf.o(defpackage.apuj.class, apujVar);
    }

    private apuj() {
    }

    @Override // defpackage.apyf
    protected final java.lang.Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new defpackage.apzd(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new java.lang.Object[]{"constrainedValues_", defpackage.apui.class});
        }
        if (i2 == 3) {
            return new defpackage.apuj();
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
