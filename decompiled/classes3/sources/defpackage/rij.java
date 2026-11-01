package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum rij implements alah {
    JOYBALL_DIALOG_KEY_UNKNOWN(0),
    JOYBALL_DIALOG_KEY_DOBBY(1),
    JOYBALL_DIALOG_KEY_SHARPIE(2),
    UNRECOGNIZED(-1);

    private final int f;

    rij(int i) {
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
