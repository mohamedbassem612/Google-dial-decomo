package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afmh extends android.text.style.ClickableSpan {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ defpackage.afmi b;

    public afmh(defpackage.afmi afmiVar, java.lang.String str) {
        this.a = str;
        j$.util.Objects.requireNonNull(afmiVar);
        this.b = afmiVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        this.b.aP(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(this.a)));
    }
}
