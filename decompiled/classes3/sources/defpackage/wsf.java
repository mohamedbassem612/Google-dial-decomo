package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wsf extends defpackage.ahao {
    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624714, viewGroup, false);
    }

    @Override // defpackage.ahao
    public final /* bridge */ /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        defpackage.wlf wlfVar = (defpackage.wlf) obj;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131429530);
        if (((wlfVar.c == 7 ? (defpackage.wkr) wlfVar.d : defpackage.wkr.a).b & 1) == 0) {
            view.setVisibility(8);
            return;
        }
        textView.setText((wlfVar.c == 7 ? (defpackage.wkr) wlfVar.d : defpackage.wkr.a).c);
        android.content.Context context = view.getContext();
        textView.setBackgroundColor(urg.c(context, 2130969108));
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(2131168002);
        android.graphics.drawable.Drawable drawable = context.getDrawable(2131231550);
        drawable.setBounds(0, 0, dimensionPixelOffset, dimensionPixelOffset);
        textView.setCompoundDrawablesRelative(drawable, null, null, null);
        view.setVisibility(0);
    }
}
