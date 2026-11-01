package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apui extends defpackage.apyf implements defpackage.apyw {
    public static final int APPLY_EVEN_IF_CRONET_TELEMETRY_DISABLED_FIELD_NUMBER = 8;
    public static final int APP_ID_FIELD_NUMBER = 1;
    public static final int BOOL_VALUE_FIELD_NUMBER = 3;
    public static final int BYTES_VALUE_FIELD_NUMBER = 7;
    public static final defpackage.apui DEFAULT_INSTANCE;
    public static final int FLOAT_VALUE_FIELD_NUMBER = 5;
    public static final int INT_VALUE_FIELD_NUMBER = 4;
    public static final int MIN_VERSION_FIELD_NUMBER = 2;
    private static volatile defpackage.apza PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 6;
    public boolean applyEvenIfCronetTelemetryDisabled_;
    public int bitField0_;
    public java.lang.Object value_;
    public int valueCase_ = 0;
    public java.lang.String appId_ = "";
    public java.lang.String minVersion_ = "";

    static {
        defpackage.apui apuiVar = new defpackage.apui();
        DEFAULT_INSTANCE = apuiVar;
        defpackage.apyf.o(defpackage.apui.class, apuiVar);
    }

    private apui() {
    }

    @Override // defpackage.apyf
    protected final java.lang.Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new defpackage.apzd(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003:\u0000\u00045\u0000\u00054\u0000\u0006;\u0000\u0007=\u0000\bဇ\u0002", new java.lang.Object[]{"value_", "valueCase_", "bitField0_", "appId_", "minVersion_", "applyEvenIfCronetTelemetryDisabled_"});
        }
        if (i2 == 3) {
            return new defpackage.apui();
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
