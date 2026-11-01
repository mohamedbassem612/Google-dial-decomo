package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum aivt implements alah {
    UNKNOWN_REPORT_ACTION(0),
    NOT_SPAM(1),
    SPAM(2),
    DO_NOT_SCREEN(3);

    public final int e;

    aivt(int i) {
        this.e = i;
    }

    public static defpackage.aivt b(int i) {
        if (i == 0) {
            return UNKNOWN_REPORT_ACTION;
        }
        if (i == 1) {
            return NOT_SPAM;
        }
        if (i == 2) {
            return SPAM;
        }
        if (i != 3) {
            return null;
        }
        return DO_NOT_SCREEN;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
