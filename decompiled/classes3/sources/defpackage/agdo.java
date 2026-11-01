package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agdo extends android.widget.LinearLayout {
    public final android.widget.TextView a;
    public java.lang.CharSequence b;
    public final com.google.android.material.internal.CheckableImageButton c;
    private final com.google.android.material.textfield.TextInputLayout d;
    private android.content.res.ColorStateList e;
    private android.graphics.PorterDuff.Mode f;
    private int g;
    private boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View, com.google.android.material.internal.CheckableImageButton, hr] */
    public agdo(com.google.android.material.textfield.TextInputLayout textInputLayout, ajxw ajxwVar) {
        super(textInputLayout.getContext());
        this.d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -1, 8388611));
        ?? r2 = (com.google.android.material.internal.CheckableImageButton) android.view.LayoutInflater.from(getContext()).inflate(2131624140, (android.view.ViewGroup) this, false);
        this.c = r2;
        android.support.v7.widget.AppCompatTextView appCompatTextView = new android.support.v7.widget.AppCompatTextView(getContext());
        this.a = appCompatTextView;
        if (agab.q(getContext())) {
            ((android.view.ViewGroup.MarginLayoutParams) r2.getLayoutParams()).setMarginEnd(0);
        }
        i();
        j();
        int[] iArr = defpackage.agdn.a;
        if (ajxwVar.z(70)) {
            this.e = agab.av(getContext(), ajxwVar, 70);
        }
        if (ajxwVar.z(71)) {
            this.f = a.q(ajxwVar.o(71, -1), (android.graphics.PorterDuff.Mode) null);
        }
        if (ajxwVar.z(67)) {
            android.graphics.drawable.Drawable drawableT = ajxwVar.t(67);
            r2.setImageDrawable(drawableT);
            if (drawableT != null) {
                afsq.x(textInputLayout, (com.google.android.material.internal.CheckableImageButton) r2, this.e, this.f);
                f(true);
                d();
            } else {
                f(false);
                i();
                j();
                e(null);
            }
            if (ajxwVar.z(66)) {
                e(ajxwVar.v(66));
            }
            r2.a(ajxwVar.y(65, true));
        }
        int iN = ajxwVar.n(68, getResources().getDimensionPixelSize(2131167139));
        if (iN < 0) {
            throw new java.lang.IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (iN != this.g) {
            this.g = iN;
            afsq.z((com.google.android.material.internal.CheckableImageButton) r2, iN);
        }
        if (ajxwVar.z(69)) {
            r2.setScaleType(afsq.w(ajxwVar.o(69, -1)));
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(2131429257);
        appCompatTextView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(ajxwVar.r(61, 0));
        if (ajxwVar.z(62)) {
            appCompatTextView.setTextColor(ajxwVar.s(62));
        }
        java.lang.CharSequence charSequenceV = ajxwVar.v(60);
        this.b = true != android.text.TextUtils.isEmpty(charSequenceV) ? charSequenceV : null;
        appCompatTextView.setText(charSequenceV);
        k();
        addView(r2);
        addView(appCompatTextView);
        r2.d = new defpackage.agdc(this, 2);
    }

    private final void k() {
        int i = 0;
        int i2 = (this.b == null || this.h) ? 8 : 0;
        if (this.c.getVisibility() != 0 && i2 != 0) {
            i = 8;
        }
        setVisibility(i);
        this.a.setVisibility(i2);
        this.d.C();
    }

    public final int a() {
        int measuredWidth;
        if (h()) {
            com.google.android.material.internal.CheckableImageButton checkableImageButton = this.c;
            measuredWidth = checkableImageButton.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd();
        } else {
            measuredWidth = 0;
        }
        return getPaddingStart() + this.a.getPaddingStart() + measuredWidth;
    }

    final java.lang.CharSequence b() {
        return this.c.getContentDescription();
    }

    public final void c(boolean z) {
        this.h = z;
        k();
    }

    public final void d() {
        afsq.y(this.d, this.c, this.e);
    }

    final void e(java.lang.CharSequence charSequence) {
        if (b() != charSequence) {
            com.google.android.material.internal.CheckableImageButton checkableImageButton = this.c;
            checkableImageButton.setContentDescription(charSequence);
            afsq.C(checkableImageButton, charSequence);
        }
    }

    final void f(boolean z) {
        android.widget.EditText editText;
        if (h() != z) {
            if (!z && this.c.hasFocus() && (editText = this.d.c) != null) {
                editText.requestFocus();
            }
            this.c.setVisibility(true != z ? 8 : 0);
            g();
            k();
        }
    }

    final void g() {
        android.widget.EditText editText = this.d.c;
        if (editText != null) {
            this.a.setPaddingRelative(h() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(2131166975), editText.getCompoundPaddingBottom());
        }
    }

    final boolean h() {
        return this.c.getVisibility() == 0;
    }

    final void i() {
        afsq.A(this.c, (android.view.View.OnClickListener) null);
    }

    final void j() {
        afsq.B(this.c);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        g();
    }
}
