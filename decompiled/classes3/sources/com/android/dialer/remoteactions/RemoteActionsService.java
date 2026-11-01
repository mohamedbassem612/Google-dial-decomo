package com.android.dialer.remoteactions;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class RemoteActionsService extends defpackage.swk {
    private static final aimz d = aimz.i("com/android/dialer/remoteactions/RemoteActionsService");
    public aoin a;
    public defpackage.rai b;

    @Override // defpackage.ahui
    protected final defpackage.ahuo c() {
        him himVar = (him) ((hjy) this.b.a).a;
        return new defpackage.swm((java.util.concurrent.Executor) himVar.r.a(), (zpm) himVar.fn.a(), (zjs) himVar.cn.a());
    }

    @Override // defpackage.ahui, android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            d.d().l("com/android/dialer/remoteactions/RemoteActionsService", "onBind", 51, "RemoteActionsService.java").w("The Remote Actions service does not support SDK %d.", android.os.Build.VERSION.SDK_INT);
            return null;
        }
        if (((java.lang.Boolean) this.a.a()).booleanValue()) {
            return this.c.g();
        }
        a.bI(d.d(), "The Remote Actions service is disabled", "com/android/dialer/remoteactions/RemoteActionsService", "onBind", '8', "RemoteActionsService.java", zct.b);
        return null;
    }

    @Override // defpackage.swk, defpackage.ahui, android.app.Service
    public final void onCreate() {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            d.d().l("com/android/dialer/remoteactions/RemoteActionsService", "onCreate", 40, "RemoteActionsService.java").w("The Remote Actions service does not support SDK %d.", android.os.Build.VERSION.SDK_INT);
        } else {
            super.onCreate();
        }
    }
}
