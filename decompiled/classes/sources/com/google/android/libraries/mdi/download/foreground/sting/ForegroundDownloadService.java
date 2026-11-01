package com.google.android.libraries.mdi.download.foreground.sting;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ForegroundDownloadService extends defpackage.acxv {
    public defpackage.acwi a;

    private final void c(android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            startForeground(1585575426, notification, 1);
        } else {
            startForeground(1585575426, notification);
        }
    }

    private final void d(android.app.Notification notification, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            c(notification);
            return;
        }
        try {
            c(notification);
        } catch (android.app.ForegroundServiceStartNotAllowedException e) {
            defpackage.adbe.e("%s: Failed to startForeground for Key %s with exception %s", "MDD Foreground Download Service", str, e);
            this.a.f(str);
        }
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        int i3 = defpackage.adbe.a;
        java.lang.String stringExtra = intent.getStringExtra("key");
        if (defpackage.ahvr.cp(stringExtra)) {
            defpackage.adbe.c("%s: KEY_EXTRA is null or empty!", "MDD Foreground Download Service");
        } else if (intent.getBooleanExtra("stop-service", false)) {
            d(defpackage.abrz.X(this).a(), stringExtra);
            stopForeground(true);
            stopSelf(i2);
        } else {
            if (intent.hasExtra("cancel-action")) {
                this.a.f(stringExtra);
            }
            d(defpackage.abrz.X(this).a(), stringExtra);
        }
        return 2;
    }

    public final void onTimeout(int i, int i2) {
        defpackage.adbe.i("%s: onTimeout: %s", "MDD Foreground Download Service", java.lang.Integer.valueOf(i2));
        super.onTimeout(i, i2);
        stopForeground(true);
        stopSelf(i);
    }
}
