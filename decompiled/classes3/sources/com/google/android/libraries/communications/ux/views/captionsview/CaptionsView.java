package com.google.android.libraries.communications.ux.views.captionsview;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class CaptionsView extends android.widget.LinearLayout {
    public final android.widget.TextView[] a;
    public final java.util.Queue b;
    public defpackage.aboy c;
    public int d;
    public boolean e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionsView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        aooh.f(context, "context");
        this.b = new java.util.ArrayDeque();
        setOrientation(1);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.textAppearance, android.R.attr.lines}, i, i2);
        aooh.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int integer = typedArrayObtainStyledAttributes.getInteger(1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (integer <= 0) {
                java.lang.String str = java.lang.String.format("Line count must be at least 1; got %d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(integer)}, 1));
                aooh.e(str, "format(...)");
                throw new java.lang.IllegalArgumentException(str.toString());
            }
            int i3 = integer + 1;
            android.widget.TextView[] textViewArr = new android.widget.TextView[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                android.support.v7.widget.AppCompatTextView appCompatTextView = new android.support.v7.widget.AppCompatTextView(context);
                appCompatTextView.setTextAlignment(0);
                appCompatTextView.setTag(2131427739, 2131427739);
                if (resourceId != 0) {
                    appCompatTextView.setTextAppearance(resourceId);
                }
                textViewArr[i4] = appCompatTextView;
            }
            this.a = textViewArr;
            for (android.widget.TextView textView : textViewArr) {
                addView(textView, new android.widget.LinearLayout.LayoutParams(-1, -2));
            }
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final android.widget.TextView getChildAt(int i) {
        return (android.widget.TextView) super.getChildAt(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        aooh.f(view, "child");
        aooh.f(layoutParams, "params");
        if (!aooh.n(view.getTag(2131427739), 2131427739)) {
            throw new java.lang.IllegalArgumentException("Do not add child views to CaptionsView");
        }
        super.addView(view, i, layoutParams);
    }

    public final void b(java.lang.CharSequence charSequence, int i) {
        aooh.f(charSequence, "text");
        if (this.f) {
            this.b.add(new defpackage.abpm(charSequence, i));
        } else {
            c(charSequence, i);
        }
    }

    public final void c(java.lang.CharSequence charSequence, int i) {
        final int i2 = 0;
        defpackage.abpk abpkVar = new defpackage.abpk(charSequence, i, this, 0);
        if (j$.util.stream.IntStream.VivifiedWrapper.convert(aa$.ExternalSyntheticApiModelOutline1.m(charSequence)).anyMatch(new java.util.function.IntPredicate() { // from class: abpl
            @Override // java.util.function.IntPredicate
            public final /* synthetic */ java.util.function.IntPredicate and(java.util.function.IntPredicate intPredicate) {
                return i2 != 0 ? j$.util.function.IntPredicate.-CC.$default$and(this, intPredicate) : j$.util.function.IntPredicate.-CC.$default$and(this, intPredicate);
            }

            @Override // java.util.function.IntPredicate
            public final /* synthetic */ java.util.function.IntPredicate negate() {
                return i2 != 0 ? j$.util.function.IntPredicate.-CC.$default$negate(this) : j$.util.function.IntPredicate.-CC.$default$negate(this);
            }

            @Override // java.util.function.IntPredicate
            public final /* synthetic */ java.util.function.IntPredicate or(java.util.function.IntPredicate intPredicate) {
                return i2 != 0 ? j$.util.function.IntPredicate.-CC.$default$or(this, intPredicate) : j$.util.function.IntPredicate.-CC.$default$or(this, intPredicate);
            }

            @Override // java.util.function.IntPredicate
            public final boolean test(int i3) {
                if (i2 != 0) {
                    return java.lang.Character.isDigit(i3);
                }
                return i3 == 10;
            }
        })) {
            throw new java.lang.IllegalArgumentException("Text provided to CaptionsView cannot contain new line characters.");
        }
        android.widget.TextView[] textViewArr = this.a;
        android.widget.TextView textView = textViewArr[this.d];
        boolean z = i == 3 && !android.text.TextUtils.isEmpty(textView.getText());
        java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[2];
        charSequenceArr[0] = i == 2 ? " " : "";
        charSequenceArr[1] = charSequence;
        java.lang.CharSequence charSequenceP = abts.p(charSequenceArr);
        if (!z && abts.r(textView, charSequenceP)) {
            abpkVar.a(textView);
            return;
        }
        this.d = (this.d + 1) % textViewArr.length;
        if (!this.e) {
            while (true) {
                int i3 = this.d;
                if (i3 >= textViewArr.length - 1) {
                    break;
                }
                android.widget.TextView textView2 = textViewArr[i3];
                if (abts.r(textView2, charSequenceP)) {
                    abpkVar.a(textView2);
                    return;
                }
                this.d++;
            }
        }
        this.e = true;
        this.f = true;
        android.widget.TextView childAt = getChildAt(0);
        aooh.c(childAt);
        defpackage.agtr agtrVar = new defpackage.agtr(textView, this, childAt, abpkVar, textViewArr[this.d], 1);
        defpackage.aboy aboyVar = new defpackage.aboy();
        aboyVar.setFloatValues(0.0f, 1.0f);
        aboyVar.addUpdateListener(new mh(aboyVar, 11, (byte[]) null));
        aboyVar.addListener(new defpackage.abox(aboyVar));
        agtrVar.a(aboyVar);
        this.c = aboyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.widget.TextView childAt = getChildAt(0);
        aooh.c(childAt);
        android.text.Layout layoutQ = abts.q(childAt, " ");
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = layoutQ.getHeight() * (this.a.length - 1);
        setLayoutParams(layoutParams);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptionsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptionsView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptionsView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        aooh.f(context, "context");
    }

    public /* synthetic */ CaptionsView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, aooc aoocVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
