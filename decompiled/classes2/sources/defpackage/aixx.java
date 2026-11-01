package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum aixx implements alah {
    UNKNOWN_CONTACT_TYPE(0),
    NOT_RESOLVED(1),
    CP2_DEFAULT_DIRECTORY(2),
    CP2_EXTENDED_DIRECTORY(3),
    CNAP(4),
    CEQUINT(5),
    CALLER_ID_BUSINESS(6),
    CALLER_ID_INDIVIDUAL(7),
    CALLER_ID_UNKNOWN(8),
    CALLER_ID_FEEDBACK(9),
    FIXED_DIALING_NUMBER(10),
    CALLER_TAG(11),
    CALLER_TAG_FEEDBACK(12),
    B2C_ENRICHED_CALLING(13);

    public final int o;

    aixx(int i) {
        this.o = i;
    }

    public final int a() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.o);
    }
}
