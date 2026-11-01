package com.android.dialer.calllog.icons.container;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class CallLogIconContainerView extends android.widget.LinearLayout {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.kie b;
    private final android.widget.LinearLayout c;

    static {
        defpackage.jhw jhwVarF = defpackage.hgt.F(defpackage.kie.a.m());
        jhwVarF.u(2131231740);
        jhwVarF.v(2);
        b = jhwVarF.s();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallLogIconContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        aooh.f(context, "context");
        android.view.View.inflate(context, 2131624057, this);
        android.view.View viewFindViewById = findViewById(2131428272);
        aooh.e(viewFindViewById, "findViewById(...)");
        this.c = (android.widget.LinearLayout) viewFindViewById;
    }

    private final int b() {
        return this.c.getChildCount() - 1;
    }

    private final android.widget.ImageView c(int i) {
        android.view.View childAt = this.c.getChildAt(i + 1);
        aooh.d(childAt, "null cannot be cast to non-null type android.widget.ImageView");
        return (android.widget.ImageView) childAt;
    }

    public final void a(aify aifyVar, boolean z, java.lang.Integer num) {
        aooh.f(aifyVar, "icons");
        int i = 0;
        if (num != null) {
            if (num.intValue() <= 0) {
                throw new java.lang.IllegalArgumentException("Failed requirement.");
            }
            if (aifyVar.size() > num.intValue()) {
                aifyVar = ajsz.bU(aifyVar.subList(0, num.intValue() - 1), b);
            }
        }
        int size = aifyVar.size();
        if (b() < size) {
            int iB = size - b();
            for (int i2 = 0; i2 < iB; i2++) {
                android.widget.LinearLayout.inflate(getContext(), 2131624056, this.c);
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            c(i3).setVisibility(0);
        }
        int iB2 = b();
        while (size < iB2) {
            c(size).setVisibility(8);
            size++;
        }
        for (defpackage.kie kieVar : aifyVar) {
            int i4 = i + 1;
            android.widget.ImageView imageViewC = c(i);
            if ((kieVar.b & 1) != 0) {
                imageViewC.setImageResource(kieVar.c);
            }
            android.content.res.ColorStateList colorStateListValueOf = null;
            if ((kieVar.b & 2) != 0) {
                int iAN = a.aN(kieVar.d);
                if (iAN == 0) {
                    iAN = 1;
                }
                int i5 = iAN - 1;
                if (i5 == 1) {
                    colorStateListValueOf = z ? android.content.res.ColorStateList.valueOf(urg.c(getContext(), 2130968936)) : android.content.res.ColorStateList.valueOf(urg.c(getContext(), 2130968935));
                } else if (i5 == 2) {
                    colorStateListValueOf = android.content.res.ColorStateList.valueOf(urg.c(getContext(), 2130968958));
                } else if (i5 == 3) {
                    colorStateListValueOf = android.content.res.ColorStateList.valueOf(urg.c(getContext(), 2130969072));
                }
            }
            imageViewC.setImageTintList(colorStateListValueOf);
            imageViewC.setTranslationY(0.0f);
            i = i4;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallLogIconContainerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallLogIconContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallLogIconContainerView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        aooh.f(context, "context");
    }

    public /* synthetic */ CallLogIconContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, aooc aoocVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
