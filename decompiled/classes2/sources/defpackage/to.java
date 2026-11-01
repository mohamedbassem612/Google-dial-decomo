package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class to extends android.app.Service {
    private to() {
    }

    public static android.content.pm.ServiceInfo a(android.content.Context context) {
        return context.getPackageManager().getServiceInfo(new android.content.ComponentName(context, (java.lang.Class<?>) defpackage.to.class), 640);
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        throw new java.lang.UnsupportedOperationException();
    }
}
