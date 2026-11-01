package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class juq {
    public static final aimz a = aimz.i("com/android/dialer/calleridfeedback/impl/ui/CallerTagFeedbackDialogFragmentPeer");
    public final agsm b;
    public final defpackage.jup c;
    public final defpackage.jrz d;
    public final aoin e;
    public final defpackage.hwv f;
    public final ucm g;
    public final defpackage.jhw h;
    public final ipc i;

    public juq(agsm agsmVar, defpackage.jup jupVar, defpackage.hwv hwvVar, defpackage.jrz jrzVar, ucm ucmVar, aoin aoinVar, ipc ipcVar, defpackage.jhw jhwVar) {
        this.b = agsmVar;
        this.c = jupVar;
        this.f = hwvVar;
        this.d = jrzVar;
        this.g = ucmVar;
        this.e = aoinVar;
        this.i = ipcVar;
        this.h = jhwVar;
    }

    public final void a(int i) {
        android.view.View viewFindViewById = this.c.G().findViewById(this.d.k);
        if (viewFindViewById == null) {
            a.bI(a.d(), "null parent view", "com/android/dialer/calleridfeedback/impl/ui/CallerTagFeedbackDialogFragmentPeer", "showSnackBar", (char) 149, "CallerTagFeedbackDialogFragmentPeer.java", zct.b);
        } else {
            agby.o(viewFindViewById, i, -1).h();
        }
    }
}
