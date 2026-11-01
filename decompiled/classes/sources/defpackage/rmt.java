package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum rmt implements defpackage.alah {
    UNKNOWN_SOURCE_TYPE(0),
    SOURCE_TYPE_DIRECTORY(1),
    SOURCE_TYPE_EXTENDED(2),
    SOURCE_TYPE_PLACES(3),
    SOURCE_TYPE_PROFILE(4),
    SOURCE_TYPE_CNAP(5),
    SOURCE_TYPE_CEQUINT_CALLER_ID(6),
    SOURCE_TYPE_REMOTE_OTHER(7),
    SOURCE_TYPE_REMOTE_MANUAL(8),
    SOURCE_TYPE_REMOTE_GOOGLE_VOICE(9),
    SOURCE_TYPE_REMOTE_CSA(10),
    SOURCE_TYPE_REMOTE_KNOWLEDGE_GRAPH(11),
    SOURCE_TYPE_CALLER_ID_FEEDBACK(12),
    SOURCE_TYPE_FIXED_DIALING_NUMBER(13),
    SOURCE_TYPE_B2C_ENRICHED_CALLING(14),
    SOURCE_TYPE_TRANSCRIPT_INFERRED(15);

    public final int q;

    rmt(int i) {
        this.q = i;
    }

    public static defpackage.rmt b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SOURCE_TYPE;
            case 1:
                return SOURCE_TYPE_DIRECTORY;
            case 2:
                return SOURCE_TYPE_EXTENDED;
            case 3:
                return SOURCE_TYPE_PLACES;
            case 4:
                return SOURCE_TYPE_PROFILE;
            case 5:
                return SOURCE_TYPE_CNAP;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return SOURCE_TYPE_CEQUINT_CALLER_ID;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return SOURCE_TYPE_REMOTE_OTHER;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return SOURCE_TYPE_REMOTE_MANUAL;
            case 9:
                return SOURCE_TYPE_REMOTE_GOOGLE_VOICE;
            case 10:
                return SOURCE_TYPE_REMOTE_CSA;
            case 11:
                return SOURCE_TYPE_REMOTE_KNOWLEDGE_GRAPH;
            case 12:
                return SOURCE_TYPE_CALLER_ID_FEEDBACK;
            case 13:
                return SOURCE_TYPE_FIXED_DIALING_NUMBER;
            case 14:
                return SOURCE_TYPE_B2C_ENRICHED_CALLING;
            case 15:
                return SOURCE_TYPE_TRANSCRIPT_INFERRED;
            default:
                return null;
        }
    }

    @Override // defpackage.alah
    public final int a() {
        return this.q;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.q);
    }
}
