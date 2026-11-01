package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amsd implements alah {
    UNKNOWN_REQUEST_TYPE(0),
    INCOMING_REQUEST_TYPE(1),
    OUTGOING_REQUEST_TYPE(2);

    public final int d;

    amsd(int i) {
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
