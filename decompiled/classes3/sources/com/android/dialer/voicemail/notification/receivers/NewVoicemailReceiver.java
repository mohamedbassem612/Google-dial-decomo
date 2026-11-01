package com.android.dialer.voicemail.notification.receivers;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.Deprecated
public final class NewVoicemailReceiver extends android.content.BroadcastReceiver {
    private static final aimz a = aimz.i("com/android/dialer/voicemail/notification/receivers/NewVoicemailReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        ahok ahokVarF = wsc.aP(context).fi().f(968, "Broadcast to NewVoicemailReceiver");
        try {
            aimz aimzVar = a;
            aimzVar.b().l("com/android/dialer/voicemail/notification/receivers/NewVoicemailReceiver", "onReceive", 63, "NewVoicemailReceiver.java").v("enter");
            ahvr.ci(intent.getAction());
            if (intent.getAction().equals("android.intent.action.NEW_VOICEMAIL")) {
                agsm.i(969, ahvr.H(wsc.aP(context).cR().a(intent, getResultCode()), new defpackage.van(goAsync(), 5), wsc.aP(context).fH()), "failed updating visual voicemail notification", new java.lang.Object[0]);
            } else {
                aimzVar.d().i(zct.b).l("com/android/dialer/voicemail/notification/receivers/NewVoicemailReceiver", "onReceive", 67, "NewVoicemailReceiver.java").y("could not handle: %s", intent);
            }
            ahokVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
