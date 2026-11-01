package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum mga implements alah {
    DIAGNOSTIC_EVENT_UNSPECIFIED(0),
    PROCESS_EVENT_TEST(3),
    OEM_DEVICE_ID_DIALOG_USED(1),
    ADN_QUERY_REMOVED(2);

    private final int f;

    mga(int i) {
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
