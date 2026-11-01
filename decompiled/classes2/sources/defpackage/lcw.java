package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lcw extends ahao {
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624290, viewGroup, false);
    }

    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        uva uvaVar = (uva) obj;
        ahvr.bM(uvaVar.c == 9);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131428699);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(2131428700);
        android.content.res.Resources resources = view.getResources();
        textView.setMaxWidth(resources.getDisplayMetrics().widthPixels - resources.getDimensionPixelSize(2131165649));
        textView.setText((uvaVar.c == 9 ? (uug) uvaVar.d : uug.a).c);
        android.content.Context context = textView2.getContext();
        alcf alcfVar = uvaVar.e;
        if (alcfVar == null) {
            alcfVar = alcf.a;
        }
        textView2.setText(android.text.format.DateUtils.formatDateTime(context, alcfVar.b * 1000, 1));
    }
}
