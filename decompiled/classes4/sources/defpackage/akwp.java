package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akwp implements alah {
    SEARCH_ADS_LIMITED_FOR_UNSPECIFIED(0),
    SEARCH_ADS_LIMITED_FOR_EDTREK(1),
    SEARCH_ADS_LIMITED_FOR_SENSITIVE_ATTRIBUTES_P13N(2),
    UNRECOGNIZED(-1);

    private final int f;

    akwp(int i) {
        this.f = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
