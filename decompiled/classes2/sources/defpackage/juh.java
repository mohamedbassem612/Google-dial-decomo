package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class juh {
    public static final aimz a = aimz.i("com/android/dialer/calleridfeedback/impl/ui/CallerIdFeedbackDialogFragmentPeer");
    public final android.content.Context b;
    public final agsm c;
    public final defpackage.jug d;
    public final defpackage.jrz e;
    public final defpackage.hwv f;
    public final ucm g;
    public final defpackage.jhw h;

    public juh(android.content.Context context, agsm agsmVar, defpackage.jug jugVar, defpackage.hwv hwvVar, defpackage.jrz jrzVar, ucm ucmVar, defpackage.jhw jhwVar) {
        this.b = context;
        this.c = agsmVar;
        this.d = jugVar;
        this.f = hwvVar;
        this.e = jrzVar;
        this.g = ucmVar;
        this.h = jhwVar;
    }

    public final void a(int i) {
        defpackage.jug jugVar = this.d;
        android.view.View viewFindViewById = jugVar.G().findViewById(this.e.k);
        if (viewFindViewById == null) {
            a.b().l("com/android/dialer/calleridfeedback/impl/ui/CallerIdFeedbackDialogFragmentPeer", "showSnackBar", 159, "CallerIdFeedbackDialogFragmentPeer.java").v("null parent view, defaulting to android.R.id.content");
            viewFindViewById = jugVar.G().findViewById(android.R.id.content);
        }
        if (viewFindViewById == null) {
            a.d().l("com/android/dialer/calleridfeedback/impl/ui/CallerIdFeedbackDialogFragmentPeer", "showSnackBar", 166, "CallerIdFeedbackDialogFragmentPeer.java").v("null parent view");
        } else {
            agby.o(viewFindViewById, i, -1).h();
        }
    }
}
