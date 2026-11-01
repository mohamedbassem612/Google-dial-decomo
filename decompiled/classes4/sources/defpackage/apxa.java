package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apxa extends defpackage.apyf implements defpackage.apyw {
    public static final defpackage.apxa DEFAULT_INSTANCE;
    public static final int HOST_FIELD_NUMBER = 2;
    private static volatile defpackage.apza PARSER = null;
    public static final int PORT_FIELD_NUMBER = 3;
    public static final int SCHEME_FIELD_NUMBER = 1;
    public int bitField0_;
    public java.lang.String host_ = "";
    public int port_;
    public int scheme_;

    static {
        defpackage.apxa apxaVar = new defpackage.apxa();
        DEFAULT_INSTANCE = apxaVar;
        defpackage.apyf.o(defpackage.apxa.class, apxaVar);
    }

    private apxa() {
    }

    @Override // defpackage.apyf
    protected final java.lang.Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new defpackage.apzd(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002", new java.lang.Object[]{"bitField0_", "scheme_", defpackage.apxc.a, "host_", "port_"});
        }
        if (i2 == 3) {
            return new defpackage.apxa();
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
