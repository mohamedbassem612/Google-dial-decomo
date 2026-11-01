package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wzr extends defpackage.ahao {
    private final ops a;

    public wzr(ops opsVar) {
        this.a = opsVar;
    }

    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624287, viewGroup, false);
    }

    @Override // defpackage.ahao
    public final /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.uva uvaVar = (defpackage.uva) obj;
        ahvr.bM(uvaVar.c == 2);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131427492);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(2131427484);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(2131427493);
        defpackage.uub uubVar = uvaVar.c == 2 ? (defpackage.uub) uvaVar.d : defpackage.uub.a;
        textView.setText(uubVar.c);
        android.content.Context context = textView2.getContext();
        alcf alcfVar = uvaVar.e;
        if (alcfVar == null) {
            alcfVar = alcf.a;
        }
        textView2.setText(android.text.format.DateUtils.formatDateTime(context, alcfVar.b * 1000, 1));
        textView2.setGravity(8388611);
        ops opsVar = this.a;
        defpackage.abwd abwdVar = uubVar.d;
        if (abwdVar == null) {
            abwdVar = defpackage.abwd.a;
        }
        opsVar.f(imageView, abwdVar, false);
    }
}
