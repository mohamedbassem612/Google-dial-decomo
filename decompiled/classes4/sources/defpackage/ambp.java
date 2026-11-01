package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum ambp implements alah {
    SUMMARY_SAFETY_CHECK_UNSPECIFIED(0),
    SUMMARY_SAFETY_CHECK_GEMINI(1);

    public final int c;

    ambp(int i) {
        this.c = i;
    }

    public static defpackage.ambp b(int i) {
        if (i == 0) {
            return SUMMARY_SAFETY_CHECK_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return SUMMARY_SAFETY_CHECK_GEMINI;
    }

    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.c);
    }
}
