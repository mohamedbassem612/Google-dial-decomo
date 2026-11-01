package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lcs extends ahao {
    private final ops a;

    public lcs(ops opsVar) {
        this.a = opsVar;
    }

    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624288, viewGroup, false);
    }

    public final /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        uva uvaVar = (uva) obj;
        ahvr.bM(uvaVar.c == 10);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(2131427722);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131427732);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(2131427733);
        uue uueVar = uvaVar.c == 10 ? (uue) uvaVar.d : uue.a;
        ops opsVar = this.a;
        abwd abwdVar = uueVar.d;
        if (abwdVar == null) {
            abwdVar = abwd.a;
        }
        opsVar.f(imageView, abwdVar, false);
        android.content.res.Resources resources = view.getResources();
        textView.setMaxWidth(resources.getDisplayMetrics().widthPixels - resources.getDimensionPixelSize(2131165649));
        textView.setText(uueVar.c);
        android.content.Context context = textView2.getContext();
        alcf alcfVar = uvaVar.e;
        if (alcfVar == null) {
            alcfVar = alcf.a;
        }
        textView2.setText(android.text.format.DateUtils.formatDateTime(context, alcfVar.b * 1000, 1));
    }
}
