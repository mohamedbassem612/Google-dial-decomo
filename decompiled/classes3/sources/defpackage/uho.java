package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uho extends al {
    protected defpackage.uhn ak;
    protected android.content.DialogInterface.OnDismissListener al;

    public final /* synthetic */ void aU() {
        super.s(false, false);
        this.ak.a();
    }

    public final void al() {
        super.s(false, false);
        this.al = null;
        this.ak = null;
        super.al();
    }

    public final android.app.Dialog eb(android.os.Bundle bundle) {
        super.eb(bundle);
        defpackage.afsn afsnVar = new defpackage.afsn(G(), 0);
        afsnVar.p(true);
        afsnVar.x(2132020216);
        afsnVar.r(2132020215);
        afsnVar.t(2132020213, new ktq(this, 13));
        afsnVar.w(2132020214, new ktq(this, 14));
        return afsnVar.create();
    }

    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnDismissListener onDismissListener = this.al;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }
}
