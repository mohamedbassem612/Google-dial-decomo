package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cas extends java.lang.IllegalStateException {
    private final java.lang.String a;

    public cas(java.lang.String str) {
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.a;
    }
}
