package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afsn extends cx {
    public android.graphics.drawable.Drawable b;
    private final android.graphics.Rect c;

    /* JADX WARN: Illegal instructions before constructor call */
    public afsn(android.content.Context context, int i) {
        int iB = B(context);
        android.content.Context contextA = agdv.a(context, (android.util.AttributeSet) null, 2130968628, 2132083428);
        super(iB != 0 ? new pc(contextA, iB) : contextA, i == 0 ? B(context) : i);
        android.content.Context context2 = getContext();
        android.content.res.Resources.Theme theme = context2.getTheme();
        int[] iArr = defpackage.afso.a;
        android.content.res.TypedArray typedArrayA = afvl.a(context2, (android.util.AttributeSet) null, iArr, 2130968628, 2132083428, new int[0]);
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(2, context2.getResources().getDimensionPixelSize(2131166991));
        int dimensionPixelSize2 = typedArrayA.getDimensionPixelSize(3, context2.getResources().getDimensionPixelSize(2131166992));
        int dimensionPixelSize3 = typedArrayA.getDimensionPixelSize(1, context2.getResources().getDimensionPixelSize(2131166990));
        int dimensionPixelSize4 = typedArrayA.getDimensionPixelSize(0, context2.getResources().getDimensionPixelSize(2131166989));
        typedArrayA.recycle();
        int layoutDirection = context2.getResources().getConfiguration().getLayoutDirection();
        this.c = new android.graphics.Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection != 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize4);
        int iZ = agab.Z(context2, 2130969105, getClass().getCanonicalName());
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, 2130968628, 2132083428);
        int color = typedArrayObtainStyledAttributes.getColor(4, iZ);
        typedArrayObtainStyledAttributes.recycle();
        agaf agafVar = new agaf(context2, (android.util.AttributeSet) null, 2130968628, 2132083428);
        agafVar.N(context2);
        agafVar.R(android.content.res.ColorStateList.valueOf(color));
        android.util.TypedValue typedValue = new android.util.TypedValue();
        theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
        float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
        if (typedValue.type == 5 && dimension >= 0.0f) {
            agafVar.O(dimension);
        }
        this.b = agafVar;
    }

    private static int B(android.content.Context context) {
        android.util.TypedValue typedValueW = agab.w(context, 2130969848);
        if (typedValueW == null) {
            return 0;
        }
        return typedValueW.data;
    }

    public final void A(android.view.View view) {
        super.setView(view);
    }

    public final cy create() {
        cy cyVarCreate = super.create();
        android.view.Window window = cyVarCreate.getWindow();
        android.view.View decorView = window.getDecorView();
        agaf agafVar = this.b;
        if (agafVar instanceof agaf) {
            agafVar.Q(decorView.getElevation());
        }
        android.graphics.drawable.Drawable drawable = this.b;
        android.graphics.Rect rect = this.c;
        window.setBackgroundDrawable(new android.graphics.drawable.InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new defpackage.afsm(cyVarCreate, rect));
        return cyVarCreate;
    }

    public final void l(int i) {
        int layoutDirection = getContext().getResources().getConfiguration().getLayoutDirection();
        android.graphics.Rect rect = this.c;
        if (layoutDirection == 1) {
            rect.left = i;
        } else {
            rect.right = i;
        }
    }

    public final void m(int i) {
        int layoutDirection = getContext().getResources().getConfiguration().getLayoutDirection();
        android.graphics.Rect rect = this.c;
        if (layoutDirection == 1) {
            rect.right = i;
        } else {
            rect.left = i;
        }
    }

    public final void n(android.view.View view) {
        super.c(view);
    }

    public final void o(android.widget.ListAdapter listAdapter, android.content.DialogInterface.OnClickListener onClickListener) {
        super.b(listAdapter, onClickListener);
    }

    public final void p(boolean z) {
        ((cx) this).a.n = z;
    }

    public final void q(int i) {
        ((cx) this).a.c = i;
    }

    public final void r(int i) {
        super.e(i);
    }

    public final void s(java.lang.CharSequence charSequence) {
        super.f(charSequence);
    }

    public final /* synthetic */ cx setNegativeButton(int i, android.content.DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(i, onClickListener);
        return this;
    }

    public final /* synthetic */ cx setPositiveButton(int i, android.content.DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(i, onClickListener);
        return this;
    }

    public final /* synthetic */ cx setTitle(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        return this;
    }

    public final /* synthetic */ cx setView(android.view.View view) {
        super.setView(view);
        return this;
    }

    public final void t(int i, android.content.DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(i, onClickListener);
    }

    public final void u(java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener) {
        super.g(charSequence, onClickListener);
    }

    public final void v(android.content.DialogInterface.OnDismissListener onDismissListener) {
        ((cx) this).a.o = onDismissListener;
    }

    public final void w(int i, android.content.DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(i, onClickListener);
    }

    public final void x(int i) {
        super.j(i);
    }

    public final void y(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
    }

    public final void z() {
        super.k(2131624229);
    }
}
