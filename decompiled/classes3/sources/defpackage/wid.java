package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wid extends defpackage.ahao {
    private final defpackage.wib a;
    private final ops b;

    public wid(ops opsVar, defpackage.wib wibVar) {
        this.b = opsVar;
        this.a = wibVar;
    }

    @Override // defpackage.ahao
    public final android.view.View a(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624291, viewGroup, false);
    }

    @Override // defpackage.ahao
    public final /* synthetic */ void b(android.view.View view, java.lang.Object obj) {
        android.graphics.drawable.Drawable drawable;
        defpackage.uva uvaVar = (defpackage.uva) obj;
        ahvr.bM(uvaVar.c == 6);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(2131429527);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131429539);
        android.view.View viewFindViewById = view.findViewById(2131429537);
        android.view.View viewFindViewById2 = view.findViewById(2131429534);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(2131429536);
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(2131429538);
        android.view.View viewFindViewById3 = view.findViewById(2131429535);
        defpackage.uux uuxVar = uvaVar.c == 6 ? (defpackage.uux) uvaVar.d : defpackage.uux.a;
        textView.setText(uuxVar.c);
        textView2.setText(uuxVar.d);
        int dimensionPixelOffset = uuxVar.d.length() > 1 ? view.getResources().getDimensionPixelOffset(2131168022) : 0;
        int dimensionPixelOffset2 = uuxVar.d.length() > 1 ? view.getResources().getDimensionPixelOffset(2131168023) : 0;
        defpackage.wic wicVar = new defpackage.wic(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
        textView2.setPadding(wicVar.a, wicVar.b, wicVar.c, wicVar.d);
        viewFindViewById2.setVisibility(0);
        imageView2.setVisibility(true != uuxVar.e ? 8 : 0);
        textView2.setVisibility(true != uuxVar.e ? 0 : 4);
        viewFindViewById3.setSelected(uuxVar.e);
        viewFindViewById3.setEnabled(uuxVar.e);
        viewFindViewById.setVisibility(true == uuxVar.g ? 0 : 8);
        boolean z = uuxVar.h;
        boolean z2 = uuxVar.i;
        if (z) {
            defpackage.wib wibVar = this.a;
            drawable = z2 ? wibVar.b().a : wibVar.b().b;
        } else {
            defpackage.wib wibVar2 = this.a;
            drawable = z2 ? wibVar2.b().c : wibVar2.b().d;
        }
        viewFindViewById3.setBackground(drawable);
        if (uuxVar.i) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, view.getResources().getDimensionPixelOffset(2131168024));
        }
        if (uuxVar.h) {
            ops opsVar = this.b;
            defpackage.abwd abwdVar = uuxVar.f;
            if (abwdVar == null) {
                abwdVar = defpackage.abwd.a;
            }
            opsVar.f(imageView, abwdVar, false);
        }
    }
}
