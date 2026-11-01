package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum nvq implements alah {
    PROTECTION_LEVEL_UNSPECIFIED(0),
    PROTECTION_LEVEL_BASIC(1),
    PROTECTION_LEVEL_MEDIUM(2),
    PROTECTION_LEVEL_MAXIMUM(3);

    public final int e;

    nvq(int i) {
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
