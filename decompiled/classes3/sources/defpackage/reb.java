package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum reb implements alah {
    UNKNOWN(0),
    ATLAS_PROMO(1),
    ATLAS_TAKEOVER(2),
    XATU_PROMO(3);

    private final int f;

    reb(int i) {
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
