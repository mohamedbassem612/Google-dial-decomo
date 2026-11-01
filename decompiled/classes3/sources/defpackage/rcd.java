package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum rcd implements alah {
    EMPTY(0),
    DIALPAD(1),
    AUDIO_ROUTE_SELECTOR(2),
    MULTIBINDING_PROVIDED_FRAGMENT(4);

    public final int e;

    rcd(int i) {
        this.e = i;
    }

    public static defpackage.rcd b(int i) {
        if (i == 0) {
            return EMPTY;
        }
        if (i == 1) {
            return DIALPAD;
        }
        if (i == 2) {
            return AUDIO_ROUTE_SELECTOR;
        }
        if (i != 4) {
            return null;
        }
        return MULTIBINDING_PROVIDED_FRAGMENT;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
