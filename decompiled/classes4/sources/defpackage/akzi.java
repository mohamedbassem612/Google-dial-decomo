package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akzi extends java.io.IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    public akzi(int i, int i2, int i3, java.lang.Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(java.lang.String.valueOf(java.lang.String.format(java.util.Locale.US, "Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(i), java.lang.Long.valueOf(i2), java.lang.Integer.valueOf(i3)))), th);
    }

    public akzi(java.lang.Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
