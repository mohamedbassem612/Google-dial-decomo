package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum wmv implements alah {
    UNSPECIFIED(0),
    RESUME_TRANSCRIPTION(1);

    public final int c;

    wmv(int i) {
        this.c = i;
    }

    public static defpackage.wmv b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return RESUME_TRANSCRIPTION;
    }

    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.c);
    }
}
