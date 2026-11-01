package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum lln implements alah {
    UNKNOWN_ACTION(0),
    END_CALL(1),
    REPORT_SPAM(2);

    public final int d;

    lln(int i) {
        this.d = i;
    }

    public static defpackage.lln b(int i) {
        if (i == 0) {
            return UNKNOWN_ACTION;
        }
        if (i == 1) {
            return END_CALL;
        }
        if (i != 2) {
            return null;
        }
        return REPORT_SPAM;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
