package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uvd {
    public static final aimz a = aimz.i("com/android/dialer/transcriptaudiofeedback/impl/FeedbackActivityPeer");
    public final com.android.dialer.transcriptaudiofeedback.impl.FeedbackActivity b;
    public final agsm c;
    public final defpackage.uwp d;
    public defpackage.utu e;
    public com.android.dialer.widget.DialerToolbar f;
    public final defpackage.ulw g;

    public uvd(com.android.dialer.transcriptaudiofeedback.impl.FeedbackActivity feedbackActivity, agsm agsmVar, defpackage.ulw ulwVar, defpackage.uwp uwpVar) {
        this.b = feedbackActivity;
        this.c = agsmVar;
        this.g = ulwVar;
        this.d = uwpVar;
    }

    public static android.content.Intent a(android.content.Context context, defpackage.utu utuVar) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.transcriptaudiofeedback.impl.FeedbackActivity.class);
        intent.putExtra("feedback_activity_intent_extra_feedback_ui_info", utuVar.i());
        intent.setAction(java.lang.String.format("feedback_action_%s", java.lang.Long.valueOf(utuVar.c)));
        return intent;
    }
}
