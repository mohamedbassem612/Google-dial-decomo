package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rjt implements android.content.DialogInterface.OnClickListener {
    private final /* synthetic */ int $cid;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            dialogInterface.dismiss();
            return;
        }
        if (i2 == 1) {
            dialogInterface.dismiss();
            return;
        }
        if (i2 == 2) {
            dialogInterface.cancel();
            return;
        }
        if (i2 == 3) {
            dialogInterface.dismiss();
        } else if (i2 != 4) {
            dialogInterface.dismiss();
        } else {
            dialogInterface.cancel();
        }
    }
}
