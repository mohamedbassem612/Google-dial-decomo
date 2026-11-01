package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agms implements java.io.Closeable {
    final /* synthetic */ com.google.apps.tiktok.account.api.AccountOperationContext a;

    public agms(com.google.apps.tiktok.account.api.AccountOperationContext accountOperationContext) {
        j$.util.Objects.requireNonNull(accountOperationContext);
        this.a = accountOperationContext;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ahvr.bZ(this.a.a.compareAndSet(true, false), "AccountOperationContext is already in the immutable state. This may be caused by concurrent access to the object, which is forbidden.");
    }
}
