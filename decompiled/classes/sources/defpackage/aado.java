package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aado extends java.lang.UnsupportedOperationException {
    private final com.google.android.gms.common.Feature a;

    public aado(com.google.android.gms.common.Feature feature) {
        this.a = feature;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return "Missing ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.a)));
    }
}
