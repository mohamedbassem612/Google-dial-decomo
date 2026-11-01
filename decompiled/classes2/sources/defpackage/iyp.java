package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iyp {
    public static final aimz a = aimz.i("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyRenameDialogFragmentPeer");
    public final defpackage.iyn b;
    public final defpackage.izo c;
    public final rlv d;
    public final ucm e;

    public iyp(defpackage.iyn iynVar, ucm ucmVar, defpackage.izo izoVar, rlv rlvVar) {
        aooh.f(ucmVar, "tiktokAlertDialogs");
        aooh.f(rlvVar, "loggingBindings");
        this.b = iynVar;
        this.e = ucmVar;
        this.c = izoVar;
        this.d = rlvVar;
    }

    public static final void a(com.google.android.material.textfield.TextInputEditText textInputEditText, android.widget.Button button, defpackage.iyp iypVar) {
        android.text.Editable text = textInputEditText.getText();
        aooh.c(text);
        java.lang.String string = aoov.x(text.toString()).toString();
        boolean z = false;
        if (string.length() > 0 && !aooh.n(string, iypVar.c.c)) {
            z = true;
        }
        button.setEnabled(z);
    }
}
