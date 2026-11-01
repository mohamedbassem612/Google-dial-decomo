package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class syb implements ahyc {
    public final /* synthetic */ syd a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ j$.util.Optional e;

    public /* synthetic */ syb(syd sydVar, long j, int i, java.lang.String str, j$.util.Optional optional) {
        this.a = sydVar;
        this.b = j;
        this.c = i;
        this.d = str;
        this.e = optional;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.CharSequence charSequenceAq;
        java.lang.Object obj2;
        syd sydVar = this.a;
        rsr rsrVar = sydVar.g;
        java.lang.String str = this.d;
        j$.util.Optional optional = (j$.util.Optional) obj;
        long j = this.b;
        java.lang.String string = java.lang.Long.toString(j);
        j$.util.Optional optionalR = rsrVar.r(this.c);
        if (str == null && optionalR.isPresent()) {
            charSequenceAq = (java.lang.CharSequence) optionalR.orElseThrow();
        } else {
            android.content.Context context = sydVar.c;
            java.lang.String strG = sydVar.d.g(str, rlt.a(context, (android.telecom.PhoneAccountHandle) null));
            charSequenceAq = strG != null ? pez.aq(context, strG) : context.getString(2132020653);
        }
        j$.util.Optional optional2 = this.e;
        dva dvaVarC = sydVar.c(j);
        android.content.Context context2 = sydVar.c;
        dvaVarC.h(context2.getText(2132019547));
        dvaVarC.g = sydVar.a(optional);
        dvaVarC.j(sydVar.b());
        dva dvaVarC2 = sydVar.c(j);
        dvaVarC2.h(context2.getText(2132019547));
        dvaVarC2.g(charSequenceAq);
        dvaVarC2.g = sydVar.a(optional);
        dvaVarC2.j(sydVar.b());
        dvaVarC2.g = sydVar.a(optional);
        dvaVarC2.v = dvaVarC.a();
        mie mieVar = new mie(sydVar, charSequenceAq, dvaVarC2, 11, (byte[]) null);
        if (true == optional2.isPresent()) {
            java.lang.Object obj3 = optional2.get();
            java.lang.Object obj4 = mieVar.b;
            java.lang.Object obj5 = mieVar.c;
            java.lang.Object obj6 = mieVar.a;
            syd.b.b().l("com/android/dialer/revelio/impl/tidepods/impl/notification/RevelioMissedCallNotifier", "postMissedCallNotification", 145, "RevelioMissedCallNotifier.java").v("Summary added to missed call notification");
            dva dvaVar = (dva) obj6;
            dvaVar.h(((syd) obj4).c.getString(2132019545, obj5));
            dvaVar.g((java.lang.String) obj3);
        }
        if (str != null) {
            syd.b.b().l("com/android/dialer/revelio/impl/tidepods/impl/notification/RevelioMissedCallNotifier", "addMissedCallNotificationActions", 183, "RevelioMissedCallNotifier.java").v("Call back and Message Actions added to missed call notification");
            java.lang.String string2 = context2.getString(2132019543);
            android.content.Intent intent = new android.content.Intent();
            intent.setComponent(new android.content.ComponentName(context2, "com.android.dialer.app.calllog.CallLogNotificationsActivity"));
            intent.setAction("com.android.dialer.calllog.CALL_BACK_FROM_MISSED_CALL_NOTIFICATION");
            intent.putExtra("android.telecom.extra.NOTIFICATION_PHONE_NUMBER", str);
            dvaVarC2.f(dux.e(androidx.core.graphics.drawable.IconCompat.h((android.content.res.Resources) null, "", 2131232043), dva.c(string2), defpackage.afap.b(context2, 0, intent, 201326592), new android.os.Bundle()));
            java.lang.String string3 = context2.getString(2132019544);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setComponent(new android.content.ComponentName(context2, "com.android.dialer.app.calllog.CallLogNotificationsActivity"));
            intent2.setAction("com.android.dialer.calllog.SEND_SMS_FROM_MISSED_CALL_NOTIFICATION");
            intent2.putExtra("MISSED_CALL_NUMBER", str);
            obj2 = null;
            dvaVarC2.f(dux.e(androidx.core.graphics.drawable.IconCompat.h((android.content.res.Resources) null, "", 2131232029), dva.c(string3), android.app.PendingIntent.getActivity(context2, 0, intent2, 201326592), new android.os.Bundle()));
        } else {
            obj2 = null;
        }
        sydVar.e.a(string, dvaVarC2.a());
        return obj2;
    }
}
