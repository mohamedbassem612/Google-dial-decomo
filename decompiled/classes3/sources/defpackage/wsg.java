package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wsg extends defpackage.ahao {
    private final android.content.Context a;

    public wsg(android.content.Context context) {
        this.a = context;
    }

    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624715, viewGroup, false);
    }

    @Override // defpackage.ahao
    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.wlf wlfVar = (defpackage.wlf) obj;
        defpackage.wox woxVar = wlfVar.c == 6 ? (defpackage.wox) wlfVar.d : defpackage.wox.a;
        if (!woxVar.c) {
            view.setVisibility(4);
        } else {
            ((android.widget.TextView) view.findViewById(2131429531)).setText(android.text.TextUtils.expandTemplate(this.a.getString(2132021060), java.text.DateFormat.getDateInstance(2, java.util.Locale.getDefault()).format(java.lang.Long.valueOf(woxVar.b))));
            view.setVisibility(0);
        }
    }
}
