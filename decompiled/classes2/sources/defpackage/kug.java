package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kug {
    public static final aimz a = aimz.i("com/android/dialer/callqualityrating/impl/service/CallQualityRatingDialogLauncher");
    public final android.content.Context b;
    public final ahpz c;
    public defpackage.kuf f;
    public android.content.IntentFilter g;
    private final java.util.concurrent.Executor j;
    public final ahzi d = ahvr.bI(new defpackage.exm(this, 8));
    public boolean e = false;
    public boolean h = false;
    public boolean i = false;

    public kug(android.content.Context context, ahpz ahpzVar, ajct ajctVar) {
        this.b = context;
        this.c = ahpzVar;
        this.j = new ajdc(ajctVar);
    }

    final ajcq a() {
        return ahvr.E(new defpackage.ldf(this, 1), this.j);
    }

    public final void b(android.os.Bundle bundle, java.lang.String str, java.lang.String str2) {
        a.b().l("com/android/dialer/callqualityrating/impl/service/CallQualityRatingDialogLauncher", "showDialog", 138, "CallQualityRatingDialogLauncher.java").v("Displaying feedback dialog");
        bundle.putString("CONTACT_NAME", str);
        if (str.isEmpty() && str2 != null) {
            bundle.putString("CONTACT_NAME", str2);
        }
        bundle.putString("CONTACT_NAME", str);
        android.content.Context context = this.b;
        android.content.Intent data = new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.callqualityrating.impl.CallQualityRatingActivity.class).putExtra("call_info_bundle", bundle).putExtra("rating", 0).putExtra("notification_id", 1).setData(android.net.Uri.fromParts("vnd.hangouts", "unique0", null));
        data.setFlags(268435456);
        ahqx.l(context, data);
    }

    public final void c() {
        agsm.i(224, ahvr.E(new defpackage.ioi(this, 20), this.j), "failed unregister FeedbackRequestReceiver", new java.lang.Object[0]);
    }

    public final boolean d(android.os.Bundle bundle) {
        if (!bundle.getBoolean("should_request_feedback_in_dialer", false)) {
            a.b().l("com/android/dialer/callqualityrating/impl/service/CallQualityRatingDialogLauncher", "shouldRequestFeedback", 203, "CallQualityRatingDialogLauncher.java").y("Feedback is not requested by %s.apk", bundle.getString("com.google.android.ims.caller_source", ""));
            return false;
        }
        if (android.text.TextUtils.isEmpty(bundle.getString("com.google.android.ims.client_call_id", ""))) {
            a.b().l("com/android/dialer/callqualityrating/impl/service/CallQualityRatingDialogLauncher", "shouldRequestFeedback", 213, "CallQualityRatingDialogLauncher.java").v("Feedback is disabled because there is no client call id.");
            return false;
        }
        if (bundle.getBoolean("is_spam_call", false)) {
            a.b().l("com/android/dialer/callqualityrating/impl/service/CallQualityRatingDialogLauncher", "shouldRequestFeedback", 219, "CallQualityRatingDialogLauncher.java").v("Feedback is disabled due to the Spam Call");
            return false;
        }
        if (this.i) {
            return true;
        }
        a.b().l("com/android/dialer/callqualityrating/impl/service/CallQualityRatingDialogLauncher", "shouldRequestFeedback", 224, "CallQualityRatingDialogLauncher.java").v("Feedback is disabled because the last call was not activated.");
        return false;
    }
}
