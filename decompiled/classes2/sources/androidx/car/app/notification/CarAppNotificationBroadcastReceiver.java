package androidx.car.app.notification;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class CarAppNotificationBroadcastReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, final android.content.Intent intent) {
        android.os.IBinder binder;
        android.content.ComponentName componentName = (android.content.ComponentName) intent.getParcelableExtra("androidx.car.app.notification.COMPONENT_EXTRA_KEY");
        intent.removeExtra("androidx.car.app.notification.COMPONENT_EXTRA_KEY");
        intent.setComponent(componentName);
        android.os.Bundle extras = intent.getExtras();
        if (extras != null) {
            binder = extras.getBinder("androidx.car.app.extra.START_CAR_APP_BINDER_KEY");
            extras.remove("androidx.car.app.extra.START_CAR_APP_BINDER_KEY");
        } else {
            binder = null;
        }
        if (binder == null) {
            java.util.Objects.toString(intent);
            android.util.Log.e("CarApp.NBR", "Notification intent missing expected extra: ".concat(java.lang.String.valueOf(intent)));
        } else {
            final androidx.car.app.IStartCarApp iStartCarApp = (androidx.car.app.IStartCarApp) j$.util.Objects.requireNonNull(androidx.car.app.IStartCarApp.Stub.asInterface(binder));
            defpackage.rx.i("startCarApp from notification", new defpackage.abd() { // from class: aap
                @Override // defpackage.abd
                public final java.lang.Object a() {
                    iStartCarApp.startCarApp(intent);
                    return null;
                }
            });
        }
    }
}
