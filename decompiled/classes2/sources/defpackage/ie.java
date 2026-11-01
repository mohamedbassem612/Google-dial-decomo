package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ie extends android.widget.Spinner {
    private static final int[] e = {android.R.attr.spinnerMode};
    public final android.content.Context a;
    public defpackage.id b;
    int c;
    final android.graphics.Rect d;
    private final hi f;
    private ji g;
    private android.widget.SpinnerAdapter h;
    private final boolean i;

    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00d4: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:213), block:B:38:0x00d4 */
    public ie(android.content.Context context, android.util.AttributeSet attributeSet) throws java.lang.Throwable {
        java.lang.Exception e2;
        android.content.res.TypedArray typedArrayObtainStyledAttributes;
        android.content.res.TypedArray typedArray;
        super(context, attributeSet, 2130970412);
        this.d = new android.graphics.Rect();
        lo.d(this, getContext());
        ajxw ajxwVarD = ajxw.D(context, attributeSet, ef.v, 2130970412, 0);
        this.f = new hi(this);
        int iR = ajxwVarD.r(4, 0);
        if (iR != 0) {
            this.a = new pc(context, iR);
        } else {
            this.a = context;
        }
        android.content.res.TypedArray typedArray2 = null;
        try {
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e, 2130970412, 0);
                try {
                    int i = typedArrayObtainStyledAttributes.hasValue(0) ? typedArrayObtainStyledAttributes.getInt(0, 0) : -1;
                    if (typedArrayObtainStyledAttributes != null) {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                    if (i == 0) {
                        defpackage.ia iaVar = new defpackage.ia(this);
                        this.b = iaVar;
                        iaVar.i(ajxwVarD.w(2));
                    } else if (i == 1) {
                        defpackage.ic icVar = new defpackage.ic(this, this.a, attributeSet);
                        ajxw ajxwVarD2 = ajxw.D(this.a, attributeSet, ef.v, 2130970412, 0);
                        this.c = ajxwVarD2.q(3, -2);
                        icVar.f(ajxwVarD2.t(1));
                        icVar.a = ajxwVarD.w(2);
                        ajxwVarD2.x();
                        this.b = icVar;
                        this.g = new defpackage.hz(this, this, icVar);
                    }
                } catch (java.lang.Exception e3) {
                    e2 = e3;
                    android.util.Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e2);
                    if (typedArrayObtainStyledAttributes != null) {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                }
            } catch (java.lang.Throwable th) {
                th = th;
                typedArray2 = typedArray;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (java.lang.Exception e4) {
            e2 = e4;
            typedArrayObtainStyledAttributes = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        java.lang.CharSequence[] textArray = ((android.content.res.TypedArray) ajxwVarD.b).getTextArray(0);
        if (textArray != null) {
            android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter(context, android.R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(2131624631);
            setAdapter((android.widget.SpinnerAdapter) arrayAdapter);
        }
        ajxwVarD.x();
        this.i = true;
        android.widget.SpinnerAdapter spinnerAdapter = this.h;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.h = null;
        }
        this.f.b(attributeSet, 2130970412);
    }

    final int a(android.widget.SpinnerAdapter spinnerAdapter, android.graphics.drawable.Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = java.lang.Math.max(0, getSelectedItemPosition());
        int iMin = java.lang.Math.min(spinnerAdapter.getCount(), iMax + 15);
        android.view.View view = null;
        int iMax2 = 0;
        for (int iMax3 = java.lang.Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = java.lang.Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        android.graphics.Rect rect = this.d;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    public final void b() {
        this.b.k(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hi hiVar = this.f;
        if (hiVar != null) {
            hiVar.a();
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        defpackage.id idVar = this.b;
        return idVar != null ? idVar.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        defpackage.id idVar = this.b;
        return idVar != null ? idVar.b() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        return this.b != null ? this.c : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public final android.graphics.drawable.Drawable getPopupBackground() {
        defpackage.id idVar = this.b;
        return idVar != null ? idVar.c() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final android.content.Context getPopupContext() {
        return this.a;
    }

    @Override // android.widget.Spinner
    public final java.lang.CharSequence getPrompt() {
        defpackage.id idVar = this.b;
        return idVar != null ? idVar.d() : super.getPrompt();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        defpackage.id idVar = this.b;
        if (idVar == null || !idVar.x()) {
            return;
        }
        this.b.m();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b == null || android.view.View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(java.lang.Math.min(java.lang.Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.ViewTreeObserver viewTreeObserver;
        android.support.v7.widget.AppCompatSpinner$SavedState appCompatSpinner$SavedState = (android.support.v7.widget.AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (!appCompatSpinner$SavedState.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new defpackage.gj((java.lang.Object) this, 2));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        android.support.v7.widget.AppCompatSpinner$SavedState appCompatSpinner$SavedState = new android.support.v7.widget.AppCompatSpinner$SavedState(super.onSaveInstanceState());
        defpackage.id idVar = this.b;
        boolean z = false;
        if (idVar != null && idVar.x()) {
            z = true;
        }
        appCompatSpinner$SavedState.a = z;
        return appCompatSpinner$SavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        ji jiVar = this.g;
        if (jiVar == null || !jiVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        defpackage.id idVar = this.b;
        if (idVar == null) {
            return super.performClick();
        }
        if (!idVar.x()) {
            b();
        }
        return true;
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(android.widget.SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.b != null) {
            android.content.Context context = this.a;
            if (context == null) {
                context = getContext();
            }
            this.b.e(new defpackage.ib(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hi hiVar = this.f;
        if (hiVar != null) {
            hiVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hi hiVar = this.f;
        if (hiVar != null) {
            hiVar.c(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        defpackage.id idVar = this.b;
        if (idVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            idVar.h(i);
            this.b.g(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        defpackage.id idVar = this.b;
        if (idVar != null) {
            idVar.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.b != null) {
            this.c = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        defpackage.id idVar = this.b;
        if (idVar != null) {
            idVar.f(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(den.bO(this.a, i));
    }

    @Override // android.widget.Spinner
    public final void setPrompt(java.lang.CharSequence charSequence) {
        defpackage.id idVar = this.b;
        if (idVar != null) {
            idVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }
}
