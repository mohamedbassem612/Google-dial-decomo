package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wii extends defpackage.ahao {
    private final ops a;

    public wii(ops opsVar) {
        this.a = opsVar;
    }

    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624292, viewGroup, false);
    }

    @Override // defpackage.ahao
    public final /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.uva uvaVar = (defpackage.uva) obj;
        ahvr.bM(uvaVar.c == 5);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(2131429527);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131429542);
        android.view.View viewFindViewById = view.findViewById(2131429541);
        defpackage.uuy uuyVar = uvaVar.c == 5 ? (defpackage.uuy) uvaVar.d : defpackage.uuy.a;
        textView.setText(uuyVar.c);
        viewFindViewById.setVisibility(true != uuyVar.d ? 8 : 0);
        ops opsVar = this.a;
        defpackage.abwd abwdVar = uuyVar.e;
        if (abwdVar == null) {
            abwdVar = defpackage.abwd.a;
        }
        opsVar.f(imageView, abwdVar, false);
    }
}
