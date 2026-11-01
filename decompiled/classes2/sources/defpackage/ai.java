package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ai implements android.content.DialogInterface.OnCancelListener {
    final /* synthetic */ defpackage.al a;

    public ai(defpackage.al alVar) {
        this.a = alVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        defpackage.al alVar = this.a;
        android.app.Dialog dialog = alVar.d;
        if (dialog != null) {
            alVar.onCancel(dialog);
        }
    }
}
