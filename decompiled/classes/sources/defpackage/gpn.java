package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gpn {
    public static final defpackage.gpn a = new defpackage.gpn(0);
    public static final defpackage.gpn b = new defpackage.gpn(1);
    public static final defpackage.gpn c = new defpackage.gpn(2);
    private final int d;

    private gpn(int i) {
        this.d = i;
    }

    public final java.lang.String toString() {
        int i = this.d;
        if (i != 0) {
            return i != 1 ? "SplitSupportStatus: ERROR_SPLIT_PROPERTY_NOT_DECLARED" : "SplitSupportStatus: UNAVAILABLE";
        }
        return "SplitSupportStatus: AVAILABLE";
    }
}
