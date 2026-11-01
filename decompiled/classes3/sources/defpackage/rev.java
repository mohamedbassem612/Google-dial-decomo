package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum rev implements alah {
    PROMO_TEXT_UNKNOWN(0),
    PROMO_TEXT_ATLAS(1),
    PROMO_TEXT_XATU(2),
    PROMO_TEXT_ATLAS_AND_XATU(3),
    UNRECOGNIZED(-1);

    private final int g;

    rev(int i) {
        this.g = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
