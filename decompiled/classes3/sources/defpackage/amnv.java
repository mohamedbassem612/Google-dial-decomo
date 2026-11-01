package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amnv implements alah {
    UNKNOWN_RESULT(0),
    ANSWER(1),
    REJECT(2),
    NO_ACTION(3),
    CANCELED(4),
    TOUCHED_OUTSIDE_PUCK(5);

    public final int g;

    amnv(int i) {
        this.g = i;
    }

    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
