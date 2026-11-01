package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ucl extends defpackage.ahao {
    final /* synthetic */ ucm a;

    public ucl(ucm ucmVar) {
        j$.util.Objects.requireNonNull(ucmVar);
        this.a = ucmVar;
    }

    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624457, viewGroup, false);
    }

    @Override // defpackage.ahao
    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.ucj ucjVar = (defpackage.ucj) obj;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(2131428980);
        imageView.setImageResource(ucjVar.a());
        imageView.setContentDescription(ucjVar.c());
        view.setEnabled(ucjVar.d());
        view.setSelected(ucjVar.e());
        view.setAlpha(true != ucjVar.d() ? 0.38f : 1.0f);
        ((ajwr) this.a.a).g(view, new defpackage.uci(ucjVar.b()));
    }
}
