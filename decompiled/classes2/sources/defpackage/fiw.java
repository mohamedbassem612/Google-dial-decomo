package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fiw extends java.io.IOException {
    public fiw(java.lang.Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + (th.getMessage() != null ? ": ".concat(java.lang.String.valueOf(th.getMessage())) : ""), th);
    }
}
