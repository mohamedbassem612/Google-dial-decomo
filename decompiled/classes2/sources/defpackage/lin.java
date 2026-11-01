package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum lin implements alah {
    UNKNOWN(0),
    READY(1),
    CURRENTLY_DOWNLOADING(2),
    NEEDS_DOWNLOAD(3),
    UNNECESSARY(4),
    ERROR(5),
    NEEDS_UPDATE(6),
    MODEL_UNREADY(7),
    UNRECOGNIZED(-1);

    private final int k;

    lin(int i) {
        this.k = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.k;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.k);
    }
}
