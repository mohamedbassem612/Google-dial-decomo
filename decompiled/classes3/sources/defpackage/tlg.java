package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tlg extends android.text.style.ClickableSpan {
    final /* synthetic */ aonj a;

    public tlg(aonj aonjVar) {
        this.a = aonjVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        aooh.f(view, "widget");
        android.content.Context context = view.getContext();
        aooh.e(context, "getContext(...)");
        this.a.a(context);
    }
}
