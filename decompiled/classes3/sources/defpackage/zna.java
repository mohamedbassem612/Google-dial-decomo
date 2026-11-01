package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum zna implements alah {
    UNKNOWN(0),
    ALLOWED(1),
    RESTRICTED(2),
    PAYPHONE(3);

    private final int f;

    zna(int i) {
        this.f = i;
    }

    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
