package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agdi {
    private final float A;
    public final android.content.Context a;
    public final com.google.android.material.textfield.TextInputLayout b;
    public android.animation.Animator c;
    public int d;
    public int e;
    public java.lang.CharSequence f;
    public boolean g;
    public android.widget.TextView h;
    public java.lang.CharSequence i;
    public int j;
    public int k;
    public android.content.res.ColorStateList l;
    public java.lang.CharSequence m;
    public boolean n;
    public android.widget.TextView o;
    public int p;
    public android.content.res.ColorStateList q;
    private final int r;
    private final int s;
    private final int t;
    private final android.animation.TimeInterpolator u;
    private final android.animation.TimeInterpolator v;
    private final android.animation.TimeInterpolator w;
    private android.widget.LinearLayout x;
    private int y;
    private android.widget.FrameLayout z;

    public agdi(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        android.content.Context context = textInputLayout.getContext();
        this.a = context;
        this.b = textInputLayout;
        this.A = context.getResources().getDimensionPixelSize(2131165595);
        this.r = agab.u(context, 2130970065, 217);
        this.s = agab.u(context, 2130970061, 167);
        this.t = agab.u(context, 2130970065, 167);
        this.u = agab.C(context, 2130970070, afpc.d);
        android.animation.TimeInterpolator timeInterpolator = afpc.a;
        this.v = agab.C(context, 2130970070, timeInterpolator);
        this.w = agab.C(context, 2130970073, timeInterpolator);
    }

    static final boolean n(int i) {
        return i == 0 || i == 1;
    }

    private final int o(boolean z, int i, int i2) {
        return z ? this.a.getResources().getDimensionPixelSize(i) : i2;
    }

    private final android.widget.TextView p(int i) {
        if (i == 1) {
            return this.h;
        }
        if (i != 2) {
            return null;
        }
        return this.o;
    }

    private final void q(java.util.List list, boolean z, android.widget.TextView textView, int i, int i2, int i3) {
        boolean z2;
        if (textView == null || !z) {
            return;
        }
        if (i == i3) {
            z2 = true;
        } else if (i != i2) {
            return;
        } else {
            z2 = false;
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(textView, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.ALPHA, i3 == i ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z2 ? this.s : this.t);
        objectAnimatorOfFloat.setInterpolator(z2 ? this.v : this.w);
        if (i3 == i && i2 != 0) {
            objectAnimatorOfFloat.setStartDelay(this.t);
        }
        list.add(objectAnimatorOfFloat);
        if (i3 != i || i2 == 0) {
            return;
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(textView, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.TRANSLATION_Y, -this.A, 0.0f);
        objectAnimatorOfFloat2.setDuration(this.r);
        objectAnimatorOfFloat2.setInterpolator(this.u);
        objectAnimatorOfFloat2.setStartDelay(this.t);
        list.add(objectAnimatorOfFloat2);
    }

    public final void a(android.widget.TextView textView, int i) {
        if (this.x == null && this.z == null) {
            android.content.Context context = this.a;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
            this.x = linearLayout;
            linearLayout.setOrientation(0);
            com.google.android.material.textfield.TextInputLayout textInputLayout = this.b;
            textInputLayout.addView(this.x, -1, -2);
            this.z = new android.widget.FrameLayout(context);
            this.x.addView(this.z, new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.c != null) {
                b();
            }
        }
        if (n(i)) {
            this.z.setVisibility(0);
            this.z.addView(textView);
        } else {
            this.x.addView(textView, new android.widget.LinearLayout.LayoutParams(-2, -2));
        }
        this.x.setVisibility(0);
        this.y++;
    }

    public final void b() {
        android.widget.EditText editText;
        if (this.x == null || (editText = this.b.c) == null) {
            return;
        }
        android.content.Context context = this.a;
        boolean zQ = agab.q(context);
        this.x.setPaddingRelative(o(zQ, 2131166973, editText.getPaddingStart()), o(zQ, 2131166974, context.getResources().getDimensionPixelSize(2131166972)), o(zQ, 2131166973, editText.getPaddingEnd()), 0);
    }

    public final void c() {
        android.animation.Animator animator = this.c;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d() {
        this.f = null;
        c();
        if (this.d == 1) {
            if (!this.n || android.text.TextUtils.isEmpty(this.m)) {
                this.e = 0;
            } else {
                this.e = 2;
            }
        }
        l(this.d, this.e, m(this.h, ""));
    }

    public final void e(android.widget.TextView textView, int i) {
        android.widget.FrameLayout frameLayout;
        android.widget.LinearLayout linearLayout = this.x;
        if (linearLayout != null) {
            if (!n(i) || (frameLayout = this.z) == null) {
                linearLayout.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i2 = this.y - 1;
            this.y = i2;
            android.widget.LinearLayout linearLayout2 = this.x;
            if (i2 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final void f(int i) {
        this.j = i;
        android.widget.TextView textView = this.h;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i);
        }
    }

    public final void g(java.lang.CharSequence charSequence) {
        this.i = charSequence;
        android.widget.TextView textView = this.h;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public final void h(int i) {
        this.k = i;
        android.widget.TextView textView = this.h;
        if (textView != null) {
            this.b.t(textView, i);
        }
    }

    public final void i(android.content.res.ColorStateList colorStateList) {
        this.l = colorStateList;
        android.widget.TextView textView = this.h;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void j(int i) {
        this.p = i;
        android.widget.TextView textView = this.o;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public final void k(android.content.res.ColorStateList colorStateList) {
        this.q = colorStateList;
        android.widget.TextView textView = this.o;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void l(int i, int i2, boolean z) {
        defpackage.agdi agdiVar;
        android.widget.TextView textViewP;
        android.widget.TextView textViewP2;
        if (i != i2) {
            if (z) {
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                this.c = animatorSet;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                q(arrayList, this.n, this.o, 2, i, i2);
                q(arrayList, this.g, this.h, 1, i, i2);
                afsq.h(animatorSet, arrayList);
                agdiVar = this;
                animatorSet.addListener(new defpackage.agdh(this, i2, p(i), i, p(i2)));
                animatorSet.start();
            } else {
                agdiVar = this;
                if (i != i2) {
                    if (i2 != 0 && (textViewP2 = agdiVar.p(i2)) != null) {
                        textViewP2.setVisibility(0);
                        textViewP2.setAlpha(1.0f);
                    }
                    if (i != 0 && (textViewP = agdiVar.p(i)) != null) {
                        textViewP.setVisibility(4);
                        if (i == 1) {
                            textViewP.setText((java.lang.CharSequence) null);
                        }
                    }
                    agdiVar.d = i2;
                }
            }
            com.google.android.material.textfield.TextInputLayout textInputLayout = agdiVar.b;
            textInputLayout.v();
            textInputLayout.x(z, false);
            textInputLayout.z();
        }
    }

    public final boolean m(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.b;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.e == this.d && textView != null && android.text.TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }
}
