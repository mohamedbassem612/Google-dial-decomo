package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tll extends android.text.style.ClickableSpan {
    final /* synthetic */ defpackage.tlm a;

    public tll(defpackage.tlm tlmVar) {
        this.a = tlmVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        aooh.f(view, "widget");
        this.a.a.a(defpackage.rij.JOYBALL_DIALOG_KEY_SHARPIE);
    }
}
