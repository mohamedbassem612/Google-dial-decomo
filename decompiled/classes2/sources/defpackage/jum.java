package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jum {
    public static final aimz a = aimz.i("com/android/dialer/calleridfeedback/impl/ui/CallerIdSuggestionDialogFragmentPeer");
    public final defpackage.juk b;
    public final agsm c;
    public final defpackage.jrz d;
    public final android.view.inputmethod.InputMethodManager e;
    public final rlv f;
    public final defpackage.jyn g;
    public final ucm h;
    public final defpackage.jhw i;

    public jum(defpackage.juk jukVar, defpackage.jyn jynVar, agsm agsmVar, defpackage.jrz jrzVar, ucm ucmVar, android.view.inputmethod.InputMethodManager inputMethodManager, rlv rlvVar, defpackage.jhw jhwVar) {
        this.b = jukVar;
        this.g = jynVar;
        this.c = agsmVar;
        this.d = jrzVar;
        this.h = ucmVar;
        this.e = inputMethodManager;
        this.f = rlvVar;
        this.i = jhwVar;
    }

    public static boolean a(j$.util.Optional optional) {
        if (true == optional.isPresent() && ((android.text.Editable) optional.get()).toString().trim().length() == 0) {
            optional = j$.util.Optional.empty();
        }
        return optional.isPresent();
    }
}
