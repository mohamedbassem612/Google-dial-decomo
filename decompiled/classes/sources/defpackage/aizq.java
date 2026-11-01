package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum aizq implements defpackage.aizr {
    INSTANCE;

    @Override // defpackage.aizr
    public final j$.time.Instant a() {
        return j$.time.Instant.now();
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "TimeSource.system()";
    }
}
