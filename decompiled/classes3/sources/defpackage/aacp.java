package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aacp extends al {
    public android.app.Dialog ak;
    public android.content.DialogInterface.OnCancelListener al;
    private android.app.Dialog am;

    public final android.app.Dialog eb(android.os.Bundle bundle) {
        android.app.Dialog dialog = this.ak;
        if (dialog != null) {
            return dialog;
        }
        ((al) this).c = false;
        if (this.am == null) {
            android.content.Context contextZ = z();
            aais.as(contextZ);
            this.am = new android.app.AlertDialog.Builder(contextZ).create();
        }
        return this.am;
    }

    public final void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.al;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
