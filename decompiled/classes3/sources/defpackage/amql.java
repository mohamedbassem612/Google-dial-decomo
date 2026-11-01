package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amql implements alah {
    ENROLLMENT_STATUS_UNKNOWN(0),
    ENROLLMENT_STATUS_MANUAL_OPTED_OUT(1),
    ENROLLMENT_STATUS_MANUAL_OPTED_IN(2),
    ENROLLMENT_STATUS_OPTED_OUT_FROM_OUT_OF_DATE_MESSAGE_APP(3),
    ENROLLMENT_STATUS_OPTED_IN_FROM_UPGRADED_MESSAGE_APP(4);

    public final int f;

    amql(int i) {
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
