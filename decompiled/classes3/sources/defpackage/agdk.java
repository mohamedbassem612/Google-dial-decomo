package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agdk extends android.widget.ArrayAdapter {
    final /* synthetic */ defpackage.agdl a;
    private final android.content.res.ColorStateList b;
    private final android.content.res.ColorStateList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agdk(defpackage.agdl agdlVar, android.content.Context context, int i, java.lang.String[] strArr) {
        android.content.res.ColorStateList colorStateList;
        super(context, i, strArr);
        j$.util.Objects.requireNonNull(agdlVar);
        this.a = agdlVar;
        android.content.res.ColorStateList colorStateList2 = null;
        if (b()) {
            int[] iArr = {android.R.attr.state_pressed};
            colorStateList = new android.content.res.ColorStateList(new int[][]{iArr, new int[0]}, new int[]{agdlVar.f.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.c = colorStateList;
        if (a() && b()) {
            int[] iArr2 = {android.R.attr.state_hovered, -16842919};
            int[] iArr3 = {android.R.attr.state_selected, -16842919};
            colorStateList2 = new android.content.res.ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{dwm.g(agdlVar.f.getColorForState(iArr3, 0), agdlVar.e), dwm.g(agdlVar.f.getColorForState(iArr2, 0), agdlVar.e), agdlVar.e});
        }
        this.b = colorStateList2;
    }

    private final boolean a() {
        return this.a.e != 0;
    }

    private final boolean b() {
        return this.a.f != null;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view2;
            defpackage.agdl agdlVar = this.a;
            android.graphics.drawable.Drawable drawable = null;
            if (agdlVar.getText().toString().contentEquals(textView.getText()) && a()) {
                android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(agdlVar.e);
                android.content.res.ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    colorDrawable.setTintList(this.b);
                    android.graphics.drawable.RippleDrawable rippleDrawable = new android.graphics.drawable.RippleDrawable(colorStateList, colorDrawable, null);
                    com.google.android.material.focus.FocusRingDrawable focusRingDrawableC = com.google.android.material.focus.FocusRingDrawable.c(getContext(), rippleDrawable, (agaf) null);
                    if (focusRingDrawableC != null) {
                        focusRingDrawableC.c.x = agdlVar.b;
                    }
                    drawable = rippleDrawable;
                } else {
                    drawable = colorDrawable;
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }
}
