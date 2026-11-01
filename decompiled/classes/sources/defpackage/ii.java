package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ii {
    public android.graphics.Typeface b;
    public boolean c;
    private final android.widget.TextView d;
    private lq e;
    private lq f;
    private lq g;
    private lq h;
    private lq i;
    private lq j;
    private final defpackage.im k;
    public int a = 0;
    private int l = -1;
    private java.lang.String m = null;

    public ii(android.widget.TextView textView) {
        this.d = textView;
        this.k = new defpackage.im(textView);
    }

    public static void b(android.widget.TextView textView, android.graphics.Typeface typeface, int i) {
        defpackage.add addVar = ih.a;
        java.lang.String strM = da$.ExternalSyntheticApiModelOutline1.m(textView);
        if (!android.text.TextUtils.isEmpty(strM)) {
            ih.b(textView, (java.lang.String) null);
        }
        textView.setTypeface(typeface, i);
        if (android.text.TextUtils.isEmpty(strM)) {
            return;
        }
        ih.b(textView, strM);
    }

    private static lq f(android.content.Context context, defpackage.ho hoVar, int i) {
        android.content.res.ColorStateList colorStateListA = hoVar.a(context, i);
        if (colorStateListA == null) {
            return null;
        }
        lq lqVar = new lq();
        lqVar.d = true;
        lqVar.a = colorStateListA;
        return lqVar;
    }

    private final void g(android.graphics.drawable.Drawable drawable, lq lqVar) {
        if (drawable == null || lqVar == null) {
            return;
        }
        defpackage.lg.g(drawable, lqVar, this.d.getDrawableState());
    }

    private final void h(boolean z) {
        android.graphics.Typeface typeface = this.b;
        if (typeface != null) {
            int i = this.l;
            android.widget.TextView textView = this.d;
            if (i == -1) {
                textView.setTypeface(typeface, this.a);
            } else {
                textView.setTypeface(typeface);
            }
        } else if (z) {
            this.d.setTypeface(null);
        }
        java.lang.String str = this.m;
        if (str != null) {
            ih.b(this.d, str);
        }
    }

    private final boolean i(android.content.Context context, defpackage.ajxw ajxwVar) {
        java.lang.String strW;
        android.graphics.Typeface typeface;
        android.graphics.Typeface typeface2;
        int[] iArr = defpackage.ef.a;
        this.a = ajxwVar.o(2, this.a);
        int iO = ajxwVar.o(11, -1);
        this.l = iO;
        if (iO != -1) {
            this.a &= 2;
        }
        if (ajxwVar.z(13)) {
            this.m = ajxwVar.w(13);
        }
        if (ajxwVar.z(10) || ajxwVar.z(12)) {
            android.graphics.Typeface typefaceD = null;
            this.b = null;
            int i = true == ajxwVar.z(12) ? 12 : 10;
            int i2 = this.l;
            int i3 = this.a;
            if (!context.isRestricted()) {
                defpackage.Cif cif = new defpackage.Cif(this, i2, i3, new java.lang.ref.WeakReference(this.d));
                try {
                    int i4 = this.a;
                    int resourceId = ((android.content.res.TypedArray) ajxwVar.b).getResourceId(i, 0);
                    if (resourceId != 0) {
                        if (ajxwVar.c == null) {
                            ajxwVar.c = new android.util.TypedValue();
                        }
                        java.lang.Object obj = ajxwVar.a;
                        java.lang.Object obj2 = ajxwVar.c;
                        int i5 = defpackage.dwk.a;
                        if (!((android.content.Context) obj).isRestricted()) {
                            typefaceD = defpackage.dwk.d((android.content.Context) obj, resourceId, (android.util.TypedValue) obj2, i4, cif, true, false);
                        }
                    }
                    if (typefaceD != null) {
                        if (this.l != -1) {
                            this.b = ft$.ExternalSyntheticApiModelOutline0.m(android.graphics.Typeface.create(typefaceD, 0), this.l, (this.a & 2) != 0);
                        } else {
                            this.b = typefaceD;
                        }
                    }
                    this.c = this.b == null;
                } catch (android.content.res.Resources.NotFoundException | java.lang.UnsupportedOperationException unused) {
                }
            }
            if (this.b == null && (strW = ajxwVar.w(i)) != null) {
                if (this.l != -1) {
                    this.b = ft$.ExternalSyntheticApiModelOutline0.m(android.graphics.Typeface.create(strW, 0), this.l, (this.a & 2) != 0);
                } else {
                    this.b = android.graphics.Typeface.create(strW, this.a);
                }
            }
        } else if (ajxwVar.z(1)) {
            this.c = false;
            int iO2 = ajxwVar.o(1, 1);
            if (iO2 == 1) {
                typeface2 = android.graphics.Typeface.SANS_SERIF;
            } else if (iO2 == 2) {
                typeface2 = android.graphics.Typeface.SERIF;
            } else if (iO2 == 3) {
                typeface2 = android.graphics.Typeface.MONOSPACE;
            }
            this.b = typeface2;
        } else {
            int i6 = this.l;
            if (i6 == -1 || (typeface = this.b) == null) {
                return false;
            }
            this.b = ft$.ExternalSyntheticApiModelOutline0.m(typeface, i6, (this.a & 2) != 0);
        }
        return true;
    }

    public final void a() {
        if (this.e != null || this.f != null || this.g != null || this.h != null) {
            android.graphics.drawable.Drawable[] compoundDrawables = this.d.getCompoundDrawables();
            g(compoundDrawables[0], this.e);
            g(compoundDrawables[1], this.f);
            g(compoundDrawables[2], this.g);
            g(compoundDrawables[3], this.h);
        }
        if (this.i == null && this.j == null) {
            return;
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        g(compoundDrawablesRelative[0], this.i);
        g(compoundDrawablesRelative[2], this.j);
    }

    /* JADX WARN: Code duplicated, block: B:187:0x038d  */
    /* JADX WARN: Code duplicated, block: B:188:0x038f  */
    /* JADX WARN: Code duplicated, block: B:191:0x0396  */
    /* JADX WARN: Code duplicated, block: B:194:0x039d  */
    /* JADX WARN: Code duplicated, block: B:196:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:198:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:218:0x0411 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:219:0x0413  */
    /* JADX WARN: Code duplicated, block: B:220:0x0417  */
    /* JADX WARN: Code duplicated, block: B:223:0x041f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x0421  */
    /* JADX WARN: Code duplicated, block: B:226:0x042f  */
    /* JADX WARN: Code duplicated, block: B:227:0x0432  */
    /* JADX WARN: Code duplicated, block: B:230:0x043a  */
    /* JADX WARN: Code duplicated, block: B:231:0x044b  */
    /* JADX WARN: Code duplicated, block: B:235:0x0455 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:236:0x0457  */
    /* JADX WARN: Code duplicated, block: B:237:0x045c  */
    /* JADX WARN: Code duplicated, block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void c(android.util.AttributeSet attributeSet, int i) {
        boolean zY;
        boolean z;
        java.lang.String strW;
        int i2;
        boolean z2;
        float fN;
        int i3;
        android.graphics.Paint.FontMetricsInt fontMetricsInt;
        int i4;
        android.graphics.drawable.Drawable[] compoundDrawablesRelative;
        int i5;
        int resourceId;
        android.widget.TextView textView = this.d;
        android.content.Context context = textView.getContext();
        defpackage.ho hoVarD = defpackage.ho.d();
        int[] iArr = defpackage.ef.h;
        defpackage.ajxw ajxwVar = new defpackage.ajxw(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
        java.lang.Object obj = ajxwVar.b;
        android.content.Context context2 = textView.getContext();
        int i6 = defpackage.dzs.a;
        defpackage.dzp.b(textView, context2, iArr, attributeSet, (android.content.res.TypedArray) obj, i, 0);
        int iR = ajxwVar.r(0, -1);
        if (ajxwVar.z(3)) {
            this.e = f(context, hoVarD, ajxwVar.r(3, 0));
        }
        if (ajxwVar.z(1)) {
            this.f = f(context, hoVarD, ajxwVar.r(1, 0));
        }
        if (ajxwVar.z(4)) {
            this.g = f(context, hoVarD, ajxwVar.r(4, 0));
        }
        if (ajxwVar.z(2)) {
            this.h = f(context, hoVarD, ajxwVar.r(2, 0));
        }
        if (ajxwVar.z(5)) {
            this.i = f(context, hoVarD, ajxwVar.r(5, 0));
        }
        if (ajxwVar.z(6)) {
            this.j = f(context, hoVarD, ajxwVar.r(6, 0));
        }
        ajxwVar.x();
        boolean z3 = textView.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod;
        if (iR != -1) {
            defpackage.ajxw ajxwVar2 = new defpackage.ajxw(context, context.obtainStyledAttributes(iR, defpackage.ef.x));
            if (z3 || !ajxwVar2.z(14)) {
                zY = false;
                z = false;
            } else {
                zY = ajxwVar2.y(14, false);
                z = true;
            }
            i(context, ajxwVar2);
            strW = ajxwVar2.z(15) ? ajxwVar2.w(15) : null;
            ajxwVar2.x();
        } else {
            zY = false;
            z = false;
            strW = null;
        }
        defpackage.ajxw ajxwVar3 = new defpackage.ajxw(context, context.obtainStyledAttributes(attributeSet, defpackage.ef.x, i, 0));
        if (!z3 && ajxwVar3.z(14)) {
            zY = ajxwVar3.y(14, false);
            z = true;
        }
        if (ajxwVar3.z(15)) {
            strW = ajxwVar3.w(15);
        }
        if (ajxwVar3.z(0) && ajxwVar3.n(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        i(context, ajxwVar3);
        ajxwVar3.x();
        if (!z3 && z) {
            e(zY);
        }
        h(false);
        if (strW != null) {
            fh$.ExternalSyntheticApiModelOutline0.m(textView, aa$.ExternalSyntheticApiModelOutline1.m(strW));
        }
        defpackage.im imVar = this.k;
        android.content.Context context3 = imVar.h;
        int[] iArr2 = defpackage.ef.i;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        android.widget.TextView textView2 = imVar.g;
        defpackage.dzp.b(textView2, textView2.getContext(), iArr2, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            imVar.a = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(2) ? typedArrayObtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(1) ? typedArrayObtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) <= 0) {
            i2 = 0;
        } else {
            android.content.res.TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            i2 = 0;
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i7 = 0; i7 < length; i7++) {
                    iArr3[i7] = typedArrayObtainTypedArray.getDimensionPixelSize(i7, -1);
                }
                imVar.e = defpackage.im.b(iArr3);
                int[] iArr4 = imVar.e;
                int length2 = iArr4.length;
                boolean z4 = length2 > 0;
                imVar.f = z4;
                if (z4) {
                    imVar.a = 1;
                    imVar.c = iArr4[0];
                    imVar.d = iArr4[length2 - 1];
                    imVar.b = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!imVar.a()) {
            imVar.a = i2;
        } else if (imVar.a == 1) {
            boolean z5 = imVar.f;
            if (!z5) {
                android.util.DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i5 = 2;
                    dimension2 = android.util.TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i5 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = android.util.TypedValue.applyDimension(i5, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    throw new java.lang.IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (dimension3 <= dimension2) {
                    throw new java.lang.IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= 0.0f) {
                    throw new java.lang.IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                imVar.a = 1;
                imVar.c = dimension2;
                imVar.d = dimension3;
                imVar.b = dimension;
                imVar.f = i2;
                z5 = false;
            }
            if (imVar.a() && (!z5 || imVar.e.length == 0)) {
                int iFloor = ((int) java.lang.Math.floor((imVar.d - imVar.c) / imVar.b)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i8 = 0; i8 < iFloor; i8++) {
                    iArr5[i8] = java.lang.Math.round(imVar.c + (i8 * imVar.b));
                }
                imVar.e = defpackage.im.b(iArr5);
            }
        }
        if (imVar.a != 0) {
            int[] iArr6 = imVar.e;
            if (iArr6.length > 0) {
                defpackage.add addVar = ih.a;
                if (da$.ExternalSyntheticApiModelOutline1.m(textView) != -1.0f) {
                    da$.ExternalSyntheticApiModelOutline1.m(textView, java.lang.Math.round(imVar.c), java.lang.Math.round(imVar.d), java.lang.Math.round(imVar.b), 0);
                } else {
                    da$.ExternalSyntheticApiModelOutline1.m(textView, iArr6, 0);
                }
            }
        }
        defpackage.ajxw ajxwVar4 = new defpackage.ajxw(context, context.obtainStyledAttributes(attributeSet, iArr2));
        int iR2 = ajxwVar4.r(8, -1);
        android.graphics.drawable.Drawable drawableC = iR2 != -1 ? hoVarD.c(context, iR2) : null;
        int iR3 = ajxwVar4.r(13, -1);
        android.graphics.drawable.Drawable drawableC2 = iR3 != -1 ? hoVarD.c(context, iR3) : null;
        int iR4 = ajxwVar4.r(9, -1);
        android.graphics.drawable.Drawable drawableC3 = iR4 != -1 ? hoVarD.c(context, iR4) : null;
        int iR5 = ajxwVar4.r(6, -1);
        android.graphics.drawable.Drawable drawableC4 = iR5 != -1 ? hoVarD.c(context, iR5) : null;
        int iR6 = ajxwVar4.r(10, -1);
        android.graphics.drawable.Drawable drawableC5 = iR6 != -1 ? hoVarD.c(context, iR6) : null;
        int iR7 = ajxwVar4.r(7, -1);
        android.graphics.drawable.Drawable drawableC6 = iR7 != -1 ? hoVarD.c(context, iR7) : null;
        if (drawableC5 != null) {
            if (drawableC4 != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableC5 == null) {
                drawableC5 = compoundDrawablesRelative[0];
            }
            if (drawableC2 == null) {
                drawableC2 = compoundDrawablesRelative[1];
            }
            if (drawableC6 == null) {
                drawableC6 = compoundDrawablesRelative[2];
            }
            if (true == z2) {
                drawableC4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableC5, drawableC2, drawableC6, drawableC4);
        } else if (drawableC6 != null) {
            if (drawableC4 != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableC5 == null) {
                drawableC5 = compoundDrawablesRelative[0];
            }
            if (drawableC2 == null) {
                drawableC2 = compoundDrawablesRelative[1];
            }
            if (drawableC6 == null) {
                drawableC6 = compoundDrawablesRelative[2];
            }
            if (true == z2) {
                drawableC4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableC5, drawableC2, drawableC6, drawableC4);
        } else if (drawableC != null || drawableC2 != null || drawableC3 != null || drawableC4 != null) {
            android.graphics.drawable.Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            android.graphics.drawable.Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableC == null) {
                    drawableC = compoundDrawables[0];
                }
                if (drawableC2 == null) {
                    drawableC2 = compoundDrawables[1];
                }
                if (drawableC3 == null) {
                    drawableC3 = compoundDrawables[2];
                }
                if (drawableC4 == null) {
                    drawableC4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableC, drawableC2, drawableC3, drawableC4);
            } else {
                if (drawableC2 == null) {
                    drawableC2 = compoundDrawablesRelative2[1];
                }
                if (drawableC4 == null) {
                    drawableC4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableC2, compoundDrawablesRelative2[2], drawableC4);
            }
        }
        if (ajxwVar4.z(11)) {
            textView.setCompoundDrawableTintList(ajxwVar4.s(11));
        }
        if (ajxwVar4.z(12)) {
            int iO = ajxwVar4.o(12, -1);
            android.graphics.Rect rect = defpackage.iz.a;
            textView.setCompoundDrawableTintMode(defpackage.a.q(iO, null));
        }
        int iN = ajxwVar4.n(15, -1);
        int iN2 = ajxwVar4.n(18, -1);
        if (ajxwVar4.z(19)) {
            android.util.TypedValue typedValuePeekValue = ((android.content.res.TypedArray) ajxwVar4.b).peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                fN = ajxwVar4.n(19, -1);
            } else {
                i3 = typedValuePeekValue.data & 15;
                fN = android.util.TypedValue.complexToFloat(typedValuePeekValue.data);
            }
            ajxwVar4.x();
            if (iN != -1) {
                if (iN >= 0) {
                    throw new java.lang.IllegalArgumentException();
                }
                ft$.ExternalSyntheticApiModelOutline0.m$1(textView, iN);
            }
            if (iN2 != -1) {
                if (iN2 >= 0) {
                    throw new java.lang.IllegalArgumentException();
                }
                fontMetricsInt = textView.getPaint().getFontMetricsInt();
                if (textView.getIncludeFontPadding()) {
                    i4 = fontMetricsInt.bottom;
                } else {
                    i4 = fontMetricsInt.descent;
                }
                if (iN2 > java.lang.Math.abs(i4)) {
                    textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), iN2 - i4);
                }
            }
            if (fN != -1.0f) {
                if (i3 == -1) {
                    defpackage.dzq.d(textView, (int) fN);
                } else {
                    defpackage.dzq.e(textView, i3, fN);
                }
            }
        }
        fN = -1.0f;
        i3 = -1;
        ajxwVar4.x();
        if (iN != -1) {
            if (iN >= 0) {
                throw new java.lang.IllegalArgumentException();
            }
            ft$.ExternalSyntheticApiModelOutline0.m$1(textView, iN);
        }
        if (iN2 != -1) {
            if (iN2 >= 0) {
                throw new java.lang.IllegalArgumentException();
            }
            fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i4 = fontMetricsInt.bottom;
            } else {
                i4 = fontMetricsInt.descent;
            }
            if (iN2 > java.lang.Math.abs(i4)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), iN2 - i4);
            }
        }
        if (fN != -1.0f) {
            if (i3 == -1) {
                defpackage.dzq.d(textView, (int) fN);
            } else {
                defpackage.dzq.e(textView, i3, fN);
            }
        }
    }

    public final void d(android.content.Context context, int i) {
        defpackage.ajxw ajxwVar = new defpackage.ajxw(context, context.obtainStyledAttributes(i, defpackage.ef.x));
        if (ajxwVar.z(14)) {
            e(ajxwVar.y(14, false));
        }
        if (ajxwVar.z(0) && ajxwVar.n(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        boolean zI = i(context, ajxwVar);
        ajxwVar.x();
        h(zI);
    }

    final void e(boolean z) {
        this.d.setAllCaps(z);
    }
}
