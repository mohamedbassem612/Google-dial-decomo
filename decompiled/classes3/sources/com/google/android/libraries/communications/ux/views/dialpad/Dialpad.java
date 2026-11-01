package com.google.android.libraries.communications.ux.views.dialpad;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class Dialpad extends android.widget.FrameLayout {
    private static final java.lang.Integer[] d = {2131428622, 2131429326, 2131429260, 2131428298, 2131428279, 2131428958, 2131428934, 2131428083, 2131428583, 2131429014, 2131429546, 2131428713};
    public android.util.Size a;
    public android.util.Size b;
    public defpackage.abpn c;
    private final android.text.TextPaint e;
    private final java.util.List f;
    private final com.google.android.libraries.communications.ux.views.dialpad.DialpadKey g;
    private final float h;
    private final float i;
    private final float j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dialpad(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        aooh.f(context, "context");
        android.widget.FrameLayout.inflate(context, 2131624088, this);
        this.e = new android.text.TextPaint();
        java.lang.Integer[] numArr = d;
        int length = numArr.length;
        java.util.ArrayList arrayList = new java.util.ArrayList(12);
        for (int i3 = 0; i3 < 12; i3++) {
            arrayList.add((com.google.android.libraries.communications.ux.views.dialpad.DialpadKey) findViewById(numArr[i3].intValue()));
        }
        this.f = arrayList;
        android.view.View viewFindViewById = findViewById(2131429326);
        aooh.e(viewFindViewById, "findViewById(...)");
        this.g = (com.google.android.libraries.communications.ux.views.dialpad.DialpadKey) viewFindViewById;
        this.h = context.getResources().getDimension(2131165622);
        this.i = context.getResources().getDimension(2131165641);
        this.j = context.getResources().getDimension(2131165607);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final void a(defpackage.abpn abpnVar, android.util.Size size) throws aois {
        float f;
        float f2;
        java.lang.Object abpqVar;
        int width = getWidth();
        int height = getHeight();
        if (height >= this.i || width < height) {
            float height2 = size.getHeight();
            java.util.List list = abpnVar.a;
            float f3 = height2 * 0.65f;
            if (!list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        f = f3 * 0.7f;
                        f2 = 0.3f;
                        break;
                    } else if (((defpackage.abpo) it.next()).c != null) {
                        f = 0.6f * f3;
                        f2 = 0.2f;
                        break;
                    }
                }
            } else {
                f = f3 * 0.7f;
                f2 = 0.3f;
                break;
            }
            abpqVar = new defpackage.abpq(f, f3 * f2);
        } else {
            android.text.TextPaint textPaint = this.e;
            com.google.android.libraries.communications.ux.views.dialpad.DialpadKey dialpadKey = this.g;
            float height3 = size.getHeight();
            textPaint.set(dialpadKey.b().getPaint());
            float f4 = height3 * 0.6f;
            textPaint.setTextSize(f4);
            java.util.List list2 = abpnVar.a;
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list2, 10));
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((defpackage.abpo) it2.next()).a);
            }
            int iO = abts.o(textPaint, arrayList);
            float f5 = 0.5f * f4;
            android.widget.TextView textViewD = dialpadKey.d();
            aooh.c(textViewD);
            textPaint.set(textViewD.getPaint());
            textPaint.setTextSize(f5);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(list2, 10));
            java.util.Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((defpackage.abpo) it3.next()).b);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                java.lang.String str = ((defpackage.abpo) it4.next()).c;
                if (str != null) {
                    arrayList3.add(str);
                }
            }
            int iO2 = abts.o(textPaint, ajsz.bT(arrayList2, arrayList3));
            float fR = aooc.r((size.getWidth() * 0.6f) / (iO + iO2), 1.0f);
            abpqVar = new defpackage.abpp(f4 * fR, (int) (iO * fR), f5 * fR, (int) (iO2 * fR));
        }
        java.util.List list3 = abpnVar.a;
        java.util.List list4 = this.f;
        java.util.Iterator it5 = list3.iterator();
        java.util.Iterator it6 = list4.iterator();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(java.lang.Math.min(ajsz.bl(list3, 10), ajsz.bl(list4, 10)));
        while (it5.hasNext() && it6.hasNext()) {
            java.lang.Object next = it5.next();
            com.google.android.libraries.communications.ux.views.dialpad.DialpadKey dialpadKey2 = (com.google.android.libraries.communications.ux.views.dialpad.DialpadKey) it6.next();
            defpackage.abpo abpoVar = (defpackage.abpo) next;
            aooh.f(abpoVar, "data");
            dialpadKey2.a = abpoVar;
            int id = dialpadKey2.getId();
            j$.util.Objects.checkIndex(0, 3);
            if (abpqVar instanceof defpackage.abpp) {
                dialpadKey2.e(id == 2131428622 ? 2131624090 : 2131624089);
                android.widget.TextView textViewB = dialpadKey2.b();
                android.view.ViewGroup.LayoutParams layoutParams = textViewB.getLayoutParams();
                if (layoutParams == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                defpackage.abpp abppVar = (defpackage.abpp) abpqVar;
                layoutParams.width = abppVar.b;
                textViewB.setLayoutParams(layoutParams);
                textViewB.setTextSize(0, abppVar.a);
                android.widget.TextView textViewD2 = dialpadKey2.d();
                if (textViewD2 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams2 = textViewD2.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams2.width = abppVar.d;
                    textViewD2.setLayoutParams(layoutParams2);
                    textViewD2.setTextSize(0, abppVar.c);
                }
                android.widget.TextView textViewC = dialpadKey2.c();
                if (textViewC != null) {
                    if (abpoVar.c != null) {
                        textViewC.setVisibility(0);
                        android.view.ViewGroup.LayoutParams layoutParams3 = textViewC.getLayoutParams();
                        if (layoutParams3 == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams3.width = abppVar.d;
                        textViewC.setLayoutParams(layoutParams3);
                        textViewC.setTextSize(0, abppVar.c);
                    } else {
                        textViewC.setVisibility(8);
                    }
                }
                android.widget.ImageView imageViewA = dialpadKey2.a();
                if (imageViewA != null) {
                    android.view.ViewGroup.LayoutParams layoutParams4 = imageViewA.getLayoutParams();
                    if (layoutParams4 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams4.width = abppVar.d;
                    layoutParams4.height = (int) (abppVar.c * 1.5f);
                    imageViewA.setLayoutParams(layoutParams4);
                }
            } else {
                if (!(abpqVar instanceof defpackage.abpq)) {
                    throw new aois();
                }
                dialpadKey2.e(id == 2131428622 ? 2131624092 : 2131624091);
                defpackage.abpq abpqVar2 = (defpackage.abpq) abpqVar;
                dialpadKey2.b().setTextSize(0, abpqVar2.a);
                android.widget.TextView textViewD3 = dialpadKey2.d();
                if (textViewD3 != null) {
                    textViewD3.setTextSize(0, abpqVar2.b);
                }
                android.widget.TextView textViewC2 = dialpadKey2.c();
                if (textViewC2 != null) {
                    if (abpoVar.c != null) {
                        textViewC2.setVisibility(0);
                        textViewC2.setTextSize(0, abpqVar2.b);
                    } else {
                        textViewC2.setVisibility(8);
                    }
                }
                android.widget.ImageView imageViewA2 = dialpadKey2.a();
                if (imageViewA2 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams5 = imageViewA2.getLayoutParams();
                    if (layoutParams5 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    float f6 = abpqVar2.b;
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams5;
                    marginLayoutParams.height = (int) (1.5f * f6);
                    marginLayoutParams.bottomMargin = abpoVar.c != null ? (int) f6 : 0;
                    imageViewA2.setLayoutParams(marginLayoutParams);
                }
            }
            dialpadKey2.b().setText(abpoVar.a);
            android.widget.TextView textViewD4 = dialpadKey2.d();
            if (textViewD4 != null) {
                textViewD4.setText(abpoVar.b);
            }
            android.widget.TextView textViewC3 = dialpadKey2.c();
            if (textViewC3 != null) {
                textViewC3.setText(abpoVar.c);
            }
            dialpadKey2.setContentDescription(abpoVar.d);
            arrayList4.add(aojh.a);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) throws aois {
        android.util.Size size;
        super.onLayout(z, i, i2, i3, i4);
        defpackage.abpn abpnVar = this.c;
        if (abpnVar == null || (size = this.b) == null || aooh.n(this.a, size)) {
            return;
        }
        this.a = size;
        a(abpnVar, size);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float fMin = java.lang.Math.min(i, i2);
        float f = this.j;
        float f2 = this.h;
        if (fMin < f) {
            f2 = (f2 * fMin) / f;
        }
        android.view.View childAt = getChildAt(0);
        aooh.d(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
        java.util.Iterator itA = dzl.b((android.widget.LinearLayout) childAt).a();
        while (true) {
            int i5 = (int) f2;
            if (!itA.hasNext()) {
                this.b = new android.util.Size((i - (i5 << 1)) / 3, (i2 - (i5 * 3)) / 4);
                return;
            }
            android.view.View view = (android.view.View) itA.next();
            if (view instanceof android.widget.Space) {
                ((android.widget.Space) view).setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, i5));
            }
            if (view instanceof android.widget.LinearLayout) {
                java.util.Iterator itA2 = dzl.b((android.widget.LinearLayout) view).a();
                while (itA2.hasNext()) {
                    android.view.View view2 = (android.view.View) itA2.next();
                    if (view2 instanceof android.widget.Space) {
                        ((android.widget.Space) view2).setLayoutParams(new android.widget.LinearLayout.LayoutParams(i5, 0));
                    }
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dialpad(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dialpad(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dialpad(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        aooh.f(context, "context");
    }

    public /* synthetic */ Dialpad(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, aooc aoocVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
