package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jub {
    public static final aimz a = aimz.i("com/android/dialer/calleridfeedback/impl/ui/CallerIdCrowdsourcingOptInDialogFragmentPeer");
    public final defpackage.jrz b;
    public final defpackage.jua c;
    public final agsm d;
    public final rlv e;
    public final defpackage.jyn f;
    public final ucm g;
    public final defpackage.jhw h;

    public jub(defpackage.jrz jrzVar, defpackage.jua juaVar, defpackage.jyn jynVar, agsm agsmVar, ucm ucmVar, defpackage.jhw jhwVar, rlv rlvVar) {
        this.b = jrzVar;
        this.c = juaVar;
        this.f = jynVar;
        this.d = agsmVar;
        this.g = ucmVar;
        this.h = jhwVar;
        this.e = rlvVar;
    }

    public final void a() {
        android.view.View viewFindViewById = this.c.G().findViewById(this.b.k);
        if (viewFindViewById == null) {
            a.bI(a.d(), "null parent view", "com/android/dialer/calleridfeedback/impl/ui/CallerIdCrowdsourcingOptInDialogFragmentPeer", "showSnackbar", (char) 130, "CallerIdCrowdsourcingOptInDialogFragmentPeer.java", zct.b);
        } else {
            agby.o(viewFindViewById, 2132021040, -1).h();
        }
    }
}
