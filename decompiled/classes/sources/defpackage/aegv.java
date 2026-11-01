package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum aegv implements defpackage.alah {
    UNKNOWN(0),
    SIGNED_IN(1),
    SIGNED_OUT_ZWIEBACK(2),
    SIGNED_OUT_YOUTUBE_VISITOR(3),
    SIGNED_IN_FITBIT(4),
    UNRECOGNIZED(-1);

    private final int h;

    aegv(int i) {
        this.h = i;
    }

    @Override // defpackage.alah
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.alau.a() : this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
