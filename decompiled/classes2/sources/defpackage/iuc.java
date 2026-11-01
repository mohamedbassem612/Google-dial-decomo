package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iuc {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;
    private static final /* synthetic */ int[] h = {a, b, c, d, e, f, g};

    public static /* synthetic */ java.lang.String a(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "CLEAN";
            case 3:
                return "SPAM";
            case 4:
                return "SCAM";
            case 5:
                return "GENERATING";
            case 6:
                return "TRANSIENT_FAILURE";
            case 7:
                return "TERMINAL_FAILURE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int b(int i) {
        if (i != 0) {
            return i;
        }
        throw null;
    }

    public static int[] values$ar$edu$38a8f27f_0() {
        return new int[]{a, b, c, d, e, f, g};
    }
}
