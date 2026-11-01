package com.android.dialer.app.calllog;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class CallLogNotificationsService extends android.app.IntentService {
    private static final aimz a = aimz.i("com/android/dialer/app/calllog/CallLogNotificationsService");

    public CallLogNotificationsService() {
        super("CallLogNotificationsService");
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        defpackage.hmr.b(this).bt().o(rmx.dW);
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(android.content.Intent intent) {
        if (intent == null) {
            a.bI(a.c().m(aioa.b), "could not handle null intent", "com/android/dialer/app/calllog/CallLogNotificationsService", "onHandleIntent", ']', "CallLogNotificationsService.java", zct.b);
            return;
        }
        if (!zqz.a(this, "android.permission.READ_CALL_LOG")) {
            a.bI(a.c().m(aioa.b), "no READ_CALL_LOG permission", "com/android/dialer/app/calllog/CallLogNotificationsService", "onHandleIntent", 'f', "CallLogNotificationsService.java", zct.b);
            return;
        }
        if (!zqz.a(this, "android.permission.WRITE_CALL_LOG")) {
            a.bI(a.c().m(aioa.b), "no WRITE_CALL_LOG permission", "com/android/dialer/app/calllog/CallLogNotificationsService", "onHandleIntent", 'o', "CallLogNotificationsService.java", zct.b);
            return;
        }
        java.lang.String action = intent.getAction();
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/app/calllog/CallLogNotificationsService", "onHandleIntent", 116, "CallLogNotificationsService.java").y("action: %s", action);
        if (action.hashCode() != -232689031 || !action.equals("com.android.dialer.calllog.CALL_BACK_FROM_MISSED_CALL_NOTIFICATION")) {
            a.bt(aimzVar.c().m(aioa.b), "no handler for action: %s", action, "com/android/dialer/app/calllog/CallLogNotificationsService", "onHandleIntent", (char) 132, "CallLogNotificationsService.java", zct.b);
            return;
        }
        defpackage.hmr.b(this).nJ().i((java.lang.String) null).b(mce.P);
        java.lang.String stringExtra = intent.getStringExtra("android.telecom.extra.NOTIFICATION_PHONE_NUMBER");
        android.net.Uri data = intent.getData();
        if (android.os.Build.VERSION.SDK_INT < 31) {
            sendBroadcast(new android.content.Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
        hsn hsnVarB = defpackage.hmr.b(this);
        if (((java.lang.Boolean) hsnVarB.hN().a()).booleanValue()) {
            hsnVarB.t().c(data);
        } else {
            hsnVarB.s().b(data);
        }
        hsn hsnVarB2 = defpackage.hmr.b(this);
        hsnVarB2.eO().g(hsnVarB2.bz().b(data), defpackage.hsi.a.toSeconds(), java.util.concurrent.TimeUnit.SECONDS);
        acxg acxgVarOV = hsnVarB.oV();
        amdx amdxVar = new amdx((char[]) null, (byte[]) null, (byte[]) null);
        amdxVar.s(stringExtra);
        amdxVar.v(16);
        acxgVarOV.w((zrx) amdxVar.a);
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        a.bI(a.d(), "timeout called on service!", "com/android/dialer/app/calllog/CallLogNotificationsService", "onTimeout", (char) 140, "CallLogNotificationsService.java", zct.b);
    }
}
