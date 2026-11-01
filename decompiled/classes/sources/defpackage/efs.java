package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class efs extends defpackage.ehg implements defpackage.ehx {
    public static final defpackage.efs DEFAULT_INSTANCE;
    private static volatile eib PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    public defpackage.ehk strings_ = defpackage.eie.a;

    static {
        defpackage.efs efsVar = new defpackage.efs();
        DEFAULT_INSTANCE = efsVar;
        defpackage.ehg.p(defpackage.efs.class, efsVar);
    }

    private efs() {
    }

    @Override // defpackage.ehg
    protected final java.lang.Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new defpackage.eif(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new java.lang.Object[]{"strings_"});
        }
        if (i2 == 3) {
            return new defpackage.efs();
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
