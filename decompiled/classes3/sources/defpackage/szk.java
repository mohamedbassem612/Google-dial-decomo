package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class szk {
    public static final aimz a = aimz.i("com/android/dialer/revelio/impl/tidepods/impl/precall/RevelioPrecallIntegrationDialogFragmentPeer");
    public final defpackage.zrx b;
    public final defpackage.szi c;
    public final agtj d;
    public final agtk e;
    public final zjm f;
    public final ucm g;

    public szk(defpackage.zrx zrxVar, defpackage.szi sziVar, ucm ucmVar, agtj agtjVar, zjm zjmVar) {
        aooh.f(ucmVar, "tikTokAlertDialogs");
        aooh.f(agtjVar, "futuresMixin");
        this.b = zrxVar;
        this.c = sziVar;
        this.g = ucmVar;
        this.d = agtjVar;
        this.f = zjmVar;
        this.e = new defpackage.szj(this);
    }

    public final void a() {
        android.view.View viewFindViewById;
        android.view.View viewFindViewById2;
        defpackage.szi sziVar = this.c;
        android.app.Dialog dialog = ((al) sziVar).d;
        if (dialog != null && (viewFindViewById2 = dialog.findViewById(2131427629)) != null) {
            viewFindViewById2.setEnabled(false);
        }
        android.app.Dialog dialog2 = ((al) sziVar).d;
        if (dialog2 == null || (viewFindViewById = dialog2.findViewById(2131427627)) == null) {
            return;
        }
        viewFindViewById.setEnabled(false);
    }
}
