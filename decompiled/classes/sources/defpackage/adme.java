package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum adme implements defpackage.alah {
    FILE_DELETION_REASON_UNSPECIFIED(0),
    EXPLICIT_GC(1),
    CHILL_GC(2),
    DELETE_PACKS(3),
    RELEASE_SUPERPACK(4),
    INVALID_PACK(5),
    DELETE_FETCHED(6),
    INVALID_UNSTAGED_FILE(7),
    AGGRESSIVE_GC(8),
    MANIFEST_GC(9),
    POST_SYNC_GC(10),
    DATA_CLEAR_REQUEST(11),
    UNRECOGNIZED(-1);

    private final int o;

    adme(int i) {
        this.o = i;
    }

    @Override // defpackage.alah
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.alau.a() : this.o;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.o);
    }
}
