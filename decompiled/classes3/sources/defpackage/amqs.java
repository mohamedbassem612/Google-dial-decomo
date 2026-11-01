package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amqs implements alah {
    UNSPECIFIED(0),
    DO_NOT_DISTURB(1),
    SILENT_AND_NO_VIBRATE(2),
    SILENCED_BY_COMPANION_APP(3);

    public final int e;

    amqs(int i) {
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
