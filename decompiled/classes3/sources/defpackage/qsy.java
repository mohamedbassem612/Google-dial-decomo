package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qsy extends android.view.ViewOutlineProvider {
    final /* synthetic */ int a;

    public qsy(defpackage.qtd qtdVar, int i) {
        this.a = i;
        j$.util.Objects.requireNonNull(qtdVar);
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a);
    }
}
