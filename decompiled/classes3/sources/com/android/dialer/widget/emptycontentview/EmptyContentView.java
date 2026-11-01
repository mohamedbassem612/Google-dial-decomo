package com.android.dialer.widget.emptycontentview;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class EmptyContentView extends androidx.constraintlayout.widget.ConstraintLayout {
    public final j$.util.Optional j;
    public final j$.util.Optional k;
    public final android.widget.TextView l;
    private final android.content.Context m;
    private final android.widget.TextView n;
    private j$.util.Optional o;
    private boolean p;

    /* JADX WARN: Multi-variable type inference failed */
    public EmptyContentView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.o = j$.util.Optional.empty();
        this.p = false;
        this.m = context;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.weg.a, 0, 0);
            try {
                this.p = typedArrayObtainStyledAttributes.getBoolean(0, false);
                typedArrayObtainStyledAttributes.recycle();
            } catch (java.lang.Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        ((android.view.LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(this.p ? 2131624186 : i() ? 2131624185 : 2131624184, (android.view.ViewGroup) this);
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(findViewById(2131428107));
        this.j = optionalOfNullable;
        j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable((android.widget.ProgressBar) findViewById(2131428109));
        this.k = optionalOfNullable2;
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131428108);
        this.n = textView;
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(2131428106);
        this.l = textView2;
        if (true == optionalOfNullable.isPresent()) {
            ((com.airbnb.lottie.LottieAnimationView) optionalOfNullable.get()).setVisibility(8);
        }
        if (true == optionalOfNullable2.isPresent()) {
            ((android.widget.ProgressBar) optionalOfNullable2.get()).setVisibility(8);
        }
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    private final boolean i() {
        android.content.Context context = this.m;
        return wsc.ab(context).ce().a(context) && ((java.lang.Boolean) wsc.ab(context).hJ().a()).booleanValue();
    }

    public final void e(int i, android.view.View.OnClickListener onClickListener) {
        if (i() && !((java.lang.Boolean) wsc.ab(this.m).hK().a()).booleanValue()) {
            this.l.setVisibility(8);
            return;
        }
        android.widget.TextView textView = this.l;
        textView.setText(i);
        textView.setVisibility(0);
        textView.setOnClickListener(onClickListener);
    }

    public final void f(int i) {
        if (!this.o.isPresent() || i != ((java.lang.Integer) this.o.orElseThrow()).intValue()) {
            this.o = j$.util.Optional.of(java.lang.Integer.valueOf(i));
            j$.util.Optional optional = this.j;
            defpackage.oxt oxtVar = new defpackage.oxt(i, 5);
            if (true == optional.isPresent()) {
                com.airbnb.lottie.LottieAnimationView lottieAnimationView = (com.airbnb.lottie.LottieAnimationView) optional.get();
                lottieAnimationView.h(oxtVar.a);
                lottieAnimationView.e();
            }
        }
        j$.util.Optional optional2 = this.j;
        if (true == optional2.isPresent()) {
            ((com.airbnb.lottie.LottieAnimationView) optional2.get()).setVisibility(0);
        }
        j$.util.Optional optional3 = this.k;
        if (true == optional3.isPresent()) {
            ((android.widget.ProgressBar) optional3.get()).setVisibility(8);
        }
    }

    public final void g(int i) {
        android.widget.TextView textView = this.n;
        textView.setText(i);
        textView.setVisibility(0);
    }

    public final void h() {
        android.view.View viewFindViewById = findViewById(2131428319);
        if (viewFindViewById != null) {
            dtv layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams.Z == 0) {
                android.util.TypedValue typedValue = new android.util.TypedValue();
                this.m.getResources().getValue(2131165527, typedValue, true);
                layoutParams.c = typedValue.getFloat();
                viewFindViewById.setLayoutParams(layoutParams);
            }
        }
    }

    public EmptyContentView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EmptyContentView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public EmptyContentView(android.content.Context context) {
        this(context, null);
    }
}
