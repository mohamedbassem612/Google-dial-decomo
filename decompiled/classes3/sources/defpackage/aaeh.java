package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaeh {
    final /* synthetic */ com.google.android.gms.common.api.internal.BasePendingResult a;

    public aaeh(com.google.android.gms.common.api.internal.BasePendingResult basePendingResult) {
        j$.util.Objects.requireNonNull(basePendingResult);
        this.a = basePendingResult;
    }

    protected final void finalize() throws java.lang.Throwable {
        java.lang.ThreadLocal threadLocal = com.google.android.gms.common.api.internal.BasePendingResult.b;
        com.google.android.gms.common.api.internal.BasePendingResult.k(this.a.e);
        super.finalize();
    }
}
