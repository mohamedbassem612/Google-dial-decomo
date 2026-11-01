package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aavq extends aavn {
    public final void c(com.google.android.gms.common.api.Status status) {
        if (status.c()) {
            return;
        }
        android.util.Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener: status=".concat(java.lang.String.valueOf(java.lang.String.valueOf(status))));
    }
}
