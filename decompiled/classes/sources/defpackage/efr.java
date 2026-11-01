package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class efr extends defpackage.ehg implements defpackage.ehx {
    public static final defpackage.efr DEFAULT_INSTANCE;
    private static volatile eib PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    public defpackage.eht preferences_ = defpackage.eht.a;

    static {
        defpackage.efr efrVar = new defpackage.efr();
        DEFAULT_INSTANCE = efrVar;
        defpackage.ehg.p(defpackage.efr.class, efrVar);
    }

    private efr() {
    }

    @Override // defpackage.ehg
    protected final java.lang.Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new defpackage.eif(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"preferences_", defpackage.efq.a});
        }
        if (i2 == 3) {
            return new defpackage.efr();
        }
        if (i2 == 4) {
            return new defpackage.ehe(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }
}
