package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum aiyh implements alah {
    PATRONUS_STATUS_UNKNOWN(0),
    PATRONUS_STATUS_SPAM(1),
    PATRONUS_STATUS_NOT_SPAM(2);

    public final int d;

    aiyh(int i) {
        this.d = i;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
