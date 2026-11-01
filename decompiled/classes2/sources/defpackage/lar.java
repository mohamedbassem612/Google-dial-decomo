package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lar extends ahao {
    final /* synthetic */ defpackage.lay a;

    public lar(defpackage.lay layVar) {
        j$.util.Objects.requireNonNull(layVar);
        this.a = layVar;
    }

    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624429, viewGroup, false);
    }

    public final /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.lao laoVar = (defpackage.lao) obj;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(2131427528);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131428561);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(2131428436);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) view.findViewById(2131428424);
        abwd abwdVar = laoVar.f;
        if (abwdVar == null) {
            abwdVar = abwd.a;
        }
        defpackage.lay layVar = this.a;
        layVar.p.f(imageView, abwdVar, false);
        textView.setText(laoVar.d);
        textView2.setText(laoVar.e.isEmpty() ? laoVar.c : android.text.TextUtils.concat(laoVar.e, " ", laoVar.c).toString());
        imageButton.setContentDescription(layVar.c.Z(2132019135, new java.lang.Object[]{laoVar.d}));
        layVar.r.g(imageButton, new defpackage.lax(laoVar.g));
    }
}
