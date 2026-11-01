package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qkj {
    private static final aimz a = aimz.i("com/android/dialer/incall/statusbarnotification/buttonintent/impl/NotificationButtonIntentsImpl");
    private final android.content.Context b;
    private final oot c;
    private final ipc d;

    public qkj(android.content.Context context, ipc ipcVar, oot ootVar) {
        this.b = context;
        this.d = ipcVar;
        this.c = ootVar;
    }

    private static void c(android.content.Intent intent, defpackage.qid qidVar, java.lang.String str) {
        intent.setAction("com.android.dialer.incall.statusbarnotification.buttonintent".concat(java.lang.String.valueOf(qidVar.name())));
        intent.putExtra("com.android.dialer.incall.statusbarnotification.buttonintentCallId", str);
        intent.putExtra("com.android.dialer.incall.statusbarnotification.buttonintentActionValue", qidVar.I);
    }

    public final android.app.PendingIntent a(defpackage.qid qidVar, java.lang.String str) {
        android.content.Context context = this.b;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.incall.statusbarnotification.buttonintent.impl.NotificationBroadcastReceiver_Receiver.class);
        c(intent, qidVar, str);
        intent.addFlags(268435456);
        return defpackage.afap.c(context, str.hashCode(), intent, 201326592);
    }

    public final android.app.PendingIntent b(defpackage.qid qidVar, java.lang.String str) {
        boolean zA = this.c.a();
        a.b().l("com/android/dialer/incall/statusbarnotification/buttonintent/impl/NotificationButtonIntentsImpl", "shouldStartInCallActivityForGamingMode", 77, "NotificationButtonIntentsImpl.java").L("Gaming mode on: %b, start incall activity : %b", zA, !zA);
        if (zA) {
            return a(qidVar, str);
        }
        defpackage.otc otcVarAo = pez.ao();
        otcVarAo.e(false);
        otcVarAo.b(false);
        otcVarAo.d(false);
        otcVarAo.c(true);
        android.content.Intent intentBk = this.d.bk(otcVarAo.a());
        c(intentBk, qidVar, str);
        return defpackage.afap.b(this.b, str.hashCode(), intentBk, 201326592);
    }
}
