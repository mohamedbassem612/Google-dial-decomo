package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amnx implements alah {
    UNKNOWN_TAP_RESULT(0),
    TAP_ANSWER(1),
    TAP_REJECT(2),
    TOUCHED_OUTSIDE_BUTTONS(3);

    public final int e;

    amnx(int i) {
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
