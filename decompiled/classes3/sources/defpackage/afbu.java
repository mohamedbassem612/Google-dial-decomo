package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum afbu implements alah {
    DEFAULT(0),
    FALLBACK_ON_LOW_CONFIDENCE(1),
    ALWAYS_ENFORCED(2),
    FALLBACK_ALWAYS(99);

    public final int e;

    afbu(int i) {
        this.e = i;
    }

    public static defpackage.afbu b(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return FALLBACK_ON_LOW_CONFIDENCE;
        }
        if (i == 2) {
            return ALWAYS_ENFORCED;
        }
        if (i != 99) {
            return null;
        }
        return FALLBACK_ALWAYS;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
