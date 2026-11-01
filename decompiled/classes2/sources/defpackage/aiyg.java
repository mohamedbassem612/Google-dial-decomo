package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum aiyg implements alah {
    PATRONUS_SKIP_REASON_UNSPECIFIED(0),
    PATRONUS_SKIP_REASON_LOCAL_VERDICT_PRESENT(1);

    public final int c;

    aiyg(int i) {
        this.c = i;
    }

    public static defpackage.aiyg b(int i) {
        if (i == 0) {
            return PATRONUS_SKIP_REASON_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return PATRONUS_SKIP_REASON_LOCAL_VERDICT_PRESENT;
    }

    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.c);
    }
}
