package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agco extends android.widget.LinearLayout {
    public android.widget.TextView a;
    public android.widget.ImageView b;
    public final android.graphics.drawable.Drawable c;
    final /* synthetic */ com.google.android.material.tabs.TabLayout d;
    private defpackage.agcm e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agco(com.google.android.material.tabs.TabLayout tabLayout, android.content.Context context) {
        super(context);
        j$.util.Objects.requireNonNull(tabLayout);
        this.d = tabLayout;
        this.f = 2;
        int i = tabLayout.p;
        if (i != 0) {
            android.graphics.drawable.Drawable drawableBO = den.bO(context, i);
            this.c = drawableBO;
            if (drawableBO != null && drawableBO.isStateful()) {
                drawableBO.setState(getDrawableState());
            }
        } else {
            this.c = null;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(0);
        android.graphics.drawable.Drawable drawableA = gradientDrawable;
        if (tabLayout.k != null) {
            android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            android.content.res.ColorStateList colorStateListA = afzc.a(tabLayout.k);
            if (tabLayout.y) {
                drawableA = com.google.android.material.focus.FocusRingDrawable.a(context, new android.graphics.drawable.RippleDrawable(colorStateListA, null, null));
            } else {
                android.graphics.drawable.RippleDrawable rippleDrawable = new android.graphics.drawable.RippleDrawable(colorStateListA, gradientDrawable, gradientDrawable2);
                com.google.android.material.focus.FocusRingDrawable.c(context, rippleDrawable, (agaf) null);
                drawableA = rippleDrawable;
            }
        }
        setBackground(drawableA);
        tabLayout.invalidate();
        setPaddingRelative(tabLayout.c, tabLayout.d, tabLayout.e, tabLayout.f);
        setGravity(17);
        setOrientation(!tabLayout.v ? 1 : 0);
        setClickable(true);
        android.view.PointerIcon pointerIconM = aa$.ExternalSyntheticApiModelOutline1.m(getContext(), 1002);
        int i2 = dzs.a;
        dzm.a(this, pointerIconM);
    }

    private final void d(android.view.View view) {
        if (view != null) {
            view.addOnLayoutChangeListener(new defpackage.qns(this, view, 5));
        }
    }

    public final void a(defpackage.agcm agcmVar) {
        if (agcmVar != this.e) {
            this.e = agcmVar;
            b();
        }
    }

    final void b() {
        c();
        defpackage.agcm agcmVar = this.e;
        boolean z = false;
        if (agcmVar != null) {
            com.google.android.material.tabs.TabLayout tabLayout = agcmVar.f;
            if (tabLayout == null) {
                throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int iA = tabLayout.a();
            if (iA != -1 && iA == agcmVar.c) {
                z = true;
            }
        }
        setSelected(z);
    }

    public final void c() {
        boolean z;
        int i;
        defpackage.agcm agcmVar = this.e;
        if (this.b == null) {
            android.widget.ImageView imageView = (android.widget.ImageView) android.view.LayoutInflater.from(getContext()).inflate(2131624130, (android.view.ViewGroup) this, false);
            this.b = imageView;
            addView(imageView, 0);
        }
        if (this.a == null) {
            android.widget.TextView textView = (android.widget.TextView) android.view.LayoutInflater.from(getContext()).inflate(2131624131, (android.view.ViewGroup) this, false);
            this.a = textView;
            addView(textView);
            this.f = this.a.getMaxLines();
        }
        android.widget.TextView textView2 = this.a;
        com.google.android.material.tabs.TabLayout tabLayout = this.d;
        textView2.setTextAppearance(tabLayout.g);
        if (!isSelected() || (i = tabLayout.i) == -1) {
            this.a.setTextAppearance(tabLayout.h);
        } else {
            this.a.setTextAppearance(i);
        }
        android.content.res.ColorStateList colorStateList = tabLayout.j;
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
        android.widget.TextView textView3 = this.a;
        android.widget.ImageView imageView2 = this.b;
        defpackage.agcm agcmVar2 = this.e;
        java.lang.CharSequence charSequence = agcmVar2 != null ? agcmVar2.a : null;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setImageDrawable(null);
        }
        boolean zIsEmpty = android.text.TextUtils.isEmpty(charSequence);
        boolean z2 = !zIsEmpty;
        if (textView3 != null) {
            if (zIsEmpty) {
                z = false;
            } else {
                int i2 = this.e.e;
                z = true;
            }
            textView3.setText(true != z2 ? null : charSequence);
            textView3.setVisibility(true != z ? 8 : 0);
            if (!zIsEmpty) {
                setVisibility(0);
            }
        } else {
            z = false;
        }
        if (imageView2 != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
            int iE = (z && imageView2.getVisibility() == 0) ? (int) agab.E(getContext(), 8) : 0;
            if (tabLayout.v) {
                if (iE != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iE);
                    marginLayoutParams.bottomMargin = 0;
                    imageView2.setLayoutParams(marginLayoutParams);
                    imageView2.requestLayout();
                }
            } else if (iE != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iE;
                marginLayoutParams.setMarginEnd(0);
                imageView2.setLayoutParams(marginLayoutParams);
                imageView2.requestLayout();
            }
        }
        defpackage.agcm agcmVar3 = this.e;
        java.lang.CharSequence charSequence2 = agcmVar3 != null ? agcmVar3.b : null;
        if (true != z2) {
            charSequence = charSequence2;
        }
        setTooltipText(charSequence);
        d(this.b);
        d(this.a);
        if (agcmVar == null || android.text.TextUtils.isEmpty(agcmVar.b)) {
            return;
        }
        setContentDescription(agcmVar.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.c;
        int[] drawableState = getDrawableState();
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
            this.d.invalidate();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ebd ebdVar = new ebd(accessibilityNodeInfo);
        ebdVar.v(ni.r(0, 1, this.e.c, 1, false, isSelected()));
        if (isSelected()) {
            ebdVar.t(false);
            ebdVar.ad(ebc.c);
        }
        ebdVar.L(getResources().getString(2132019136));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        android.text.Layout layout;
        int size = android.view.View.MeasureSpec.getSize(i);
        int mode = android.view.View.MeasureSpec.getMode(i);
        com.google.android.material.tabs.TabLayout tabLayout = this.d;
        int i3 = tabLayout.q;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = android.view.View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.a != null) {
            float f = tabLayout.m;
            if (isSelected() && tabLayout.i != -1) {
                f = tabLayout.n;
            }
            int i4 = this.f;
            android.widget.ImageView imageView = this.b;
            if (imageView == null || imageView.getVisibility() != 0) {
                android.widget.TextView textView = this.a;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.o;
                }
            } else {
                i4 = 1;
            }
            float textSize = this.a.getTextSize();
            int lineCount = this.a.getLineCount();
            int maxLines = this.a.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i4 != maxLines)) {
                if (tabLayout.u != 1 || f <= textSize || lineCount != 1 || ((layout = this.a.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    this.a.setTextSize(0, f);
                    this.a.setMaxLines(i4);
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.e == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        this.e.a();
        return true;
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        android.widget.TextView textView = this.a;
        if (textView != null) {
            textView.setSelected(z);
        }
        android.widget.ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }
}
