package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amkr implements alah {
    DISABLED(0),
    SPEAKER_LABEL(1),
    SPEAKER_CHANGE(2);

    public final int d;

    amkr(int i) {
        this.d = i;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
