package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum rca implements alah {
    MODE_UNKNOWN(0),
    MODE_COMPACT(1),
    MODE_FULL_SIZE(2);

    private final int e;

    rca(int i) {
        this.e = i;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
