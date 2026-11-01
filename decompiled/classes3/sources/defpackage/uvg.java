package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uvg {
    public static final aimz a = aimz.i("com/android/dialer/transcriptaudiofeedback/impl/FeedbackConsentActivityPeer");
    public final com.android.dialer.transcriptaudiofeedback.impl.FeedbackConsentActivity b;
    public defpackage.utu c;
    public final defpackage.uyg d;

    public uvg(com.android.dialer.transcriptaudiofeedback.impl.FeedbackConsentActivity feedbackConsentActivity, defpackage.uyg uygVar) {
        this.b = feedbackConsentActivity;
        this.d = uygVar;
    }

    public static android.content.Intent a(android.content.Context context, defpackage.utu utuVar) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.transcriptaudiofeedback.impl.FeedbackConsentActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("feedback_consent_activity_intent_extra_feedback_ui_info", utuVar.i());
        return intent;
    }
}
