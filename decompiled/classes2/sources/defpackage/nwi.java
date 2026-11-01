package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class nwi implements android.content.DialogInterface.OnDismissListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public nwi(defpackage.al alVar, int i) {
        this.$cid = i;
        this.a = alVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        int i = this.$cid;
        if (i == 0) {
            ahvr.h(new zsy(), (defpackage.al) ((defpackage.nwj) this.a).a);
            return;
        }
        if (i == 1) {
            defpackage.al alVar = (defpackage.al) this.a;
            android.app.Dialog dialog = alVar.d;
            if (dialog != null) {
                alVar.onDismiss(dialog);
                return;
            }
            return;
        }
        java.lang.Object obj = this.a;
        if (i != 2) {
            ((vxq) obj).I = false;
        } else {
            ahvr.i(umb.a, ((umd) obj).d);
        }
    }

    public /* synthetic */ nwi(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
