package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kru extends android.text.style.ClickableSpan {
    final /* synthetic */ android.text.style.URLSpan a;
    final /* synthetic */ aomy b;

    public kru(android.text.style.URLSpan uRLSpan, aomy aomyVar) {
        this.a = uRLSpan;
        this.b = aomyVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        aooh.f(view, "widget");
        this.a.onClick(view);
        this.b.a();
    }
}
