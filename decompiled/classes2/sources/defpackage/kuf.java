package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kuf extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.kug a;

    public kuf(defpackage.kug kugVar) {
        j$.util.Objects.requireNonNull(kugVar);
        this.a = kugVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        defpackage.kug kugVar = this.a;
        ahok ahokVarF = kugVar.c.f(223, "Broadcast to CallQualityRatingDialogLauncher.FeedbackRequestReceiver");
        try {
            if ("com.android.dialer.feedback.impl.action.REQUEST_FEEDBACK".equals(intent.getAction())) {
                android.os.Bundle extras = intent.getExtras();
                if (extras == null) {
                    defpackage.kug.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/callqualityrating/impl/service/CallQualityRatingDialogLauncher$FeedbackRequestReceiver", "onReceive", 175, "CallQualityRatingDialogLauncher.java").v("Error - bundle is null!");
                } else {
                    aimz aimzVar = defpackage.kug.a;
                    aimzVar.b().l("com/android/dialer/callqualityrating/impl/service/CallQualityRatingDialogLauncher$FeedbackRequestReceiver", "onReceive", 178, "CallQualityRatingDialogLauncher.java").y("Receieved intent from %s", extras.getString("com.google.android.ims.caller_source", ""));
                    if (extras.getBoolean("will_request_feedback_in_dialer", false)) {
                        aimzVar.b().l("com/android/dialer/callqualityrating/impl/service/CallQualityRatingDialogLauncher$FeedbackRequestReceiver", "onReceive", 182, "CallQualityRatingDialogLauncher.java").v("Retaining receiver after call disconnection");
                        kugVar.h = true;
                    } else {
                        if (kugVar.d(extras)) {
                            kugVar.b(extras, "", null);
                        }
                        kugVar.c();
                    }
                }
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
