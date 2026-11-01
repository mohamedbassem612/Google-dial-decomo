package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aitx extends java.lang.Exception {
    private static final long serialVersionUID = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aitx(java.lang.Exception exc) {
        super(exc);
        exc.getClass();
    }

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ java.lang.Throwable getCause() {
        return (java.lang.Exception) j$.util.Objects.requireNonNull(super.getCause());
    }
}
