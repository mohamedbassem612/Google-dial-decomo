package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class je extends android.widget.ListView {
    public boolean a;
    defpackage.jd b;
    private final android.graphics.Rect c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private defpackage.jb i;
    private final boolean j;
    private boolean k;
    private defpackage.ecd l;

    public je(android.content.Context context, boolean z) {
        super(context, null, 2130969317);
        this.c = new android.graphics.Rect();
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.j = z;
        setCacheColorHint(0);
    }

    private final void c(boolean z) {
        defpackage.jb jbVar = this.i;
        if (jbVar != null) {
            jbVar.a = z;
        }
    }

    private final void d() {
        android.graphics.drawable.Drawable selector = getSelector();
        if (selector != null && this.k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:80:0x014f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0165  */
    /* JADX WARN: Code duplicated, block: B:85:0x016c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x016e  */
    /* JADX WARN: Code duplicated, block: B:88:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0181  */
    public final boolean a(android.view.MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        boolean zM;
        boolean z3;
        android.view.View childAt;
        android.view.View childAt2;
        defpackage.ecd ecdVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z4 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                z = true;
            } else {
                z = false;
            }
            if (z || z4) {
                this.k = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.h - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            ecdVar = this.l;
            if (z) {
                if (ecdVar == null) {
                    ecdVar = new defpackage.ecd(this);
                    this.l = ecdVar;
                }
                ecdVar.c(true);
                this.l.onTouch(this, motionEvent);
            } else if (ecdVar != null) {
                ecdVar.c(false);
            }
            return z;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z4 = true;
            } else {
                android.view.View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.k = true;
                drawableHotspotChanged(f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.h;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.h = iPointToPosition;
                childAt3.drawableHotspotChanged(f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                android.graphics.drawable.Drawable selector = getSelector();
                if (selector == null) {
                    z2 = false;
                } else if (iPointToPosition != -1) {
                    z2 = true;
                } else {
                    z2 = false;
                    iPointToPosition = -1;
                }
                int i3 = iPointToPosition;
                if (z2) {
                    selector.setVisible(false, false);
                }
                android.graphics.Rect rect = this.c;
                rect.set(childAt3.getLeft(), childAt3.getTop(), childAt3.getRight(), childAt3.getBottom());
                rect.left -= this.d;
                rect.top -= this.e;
                rect.right += this.f;
                rect.bottom += this.g;
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    zM = ae$.ExternalSyntheticApiModelOutline0.m(this);
                } else {
                    java.lang.reflect.Field field = defpackage.jc.a;
                    if (field != null) {
                        try {
                            zM = field.getBoolean(this);
                        } catch (java.lang.IllegalAccessException e) {
                            e.printStackTrace();
                            zM = false;
                        }
                    } else {
                        zM = false;
                    }
                }
                if (childAt3.isEnabled() != zM) {
                    boolean z5 = !zM;
                    if (android.os.Build.VERSION.SDK_INT >= 33) {
                        ae$.ExternalSyntheticApiModelOutline0.m(this, z5);
                    } else {
                        java.lang.reflect.Field field2 = defpackage.jc.a;
                        if (field2 != null) {
                            try {
                                field2.set(this, java.lang.Boolean.valueOf(z5));
                            } catch (java.lang.IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (i3 != -1) {
                        refreshDrawableState();
                    }
                }
                if (z2) {
                    android.graphics.Rect rect2 = this.c;
                    float fExactCenterX = rect2.exactCenterX();
                    float fExactCenterY = rect2.exactCenterY();
                    z3 = false;
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                } else {
                    z3 = false;
                }
                android.graphics.drawable.Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                c(z3);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z = true;
                z4 = false;
            }
        }
        if (z) {
            this.k = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.h - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.k = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.h - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        ecdVar = this.l;
        if (z) {
            if (ecdVar == null) {
                ecdVar = new defpackage.ecd(this);
                this.l = ecdVar;
            }
            ecdVar.c(true);
            this.l.onTouch(this, motionEvent);
        } else if (ecdVar != null) {
            ecdVar.c(false);
        }
        return z;
    }

    public final int b(int i, int i2) {
        int listPaddingTop = getListPaddingTop() + getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        android.graphics.drawable.Drawable divider = getDivider();
        android.widget.ListAdapter adapter = getAdapter();
        if (adapter != null) {
            if (dividerHeight <= 0 || divider == null) {
                dividerHeight = 0;
            }
            int count = adapter.getCount();
            int i3 = 0;
            android.view.View view = null;
            for (int i4 = 0; i4 < count; i4++) {
                int itemViewType = adapter.getItemViewType(i4);
                if (itemViewType != i3) {
                    view = null;
                    i3 = itemViewType;
                }
                view = adapter.getView(i4, view, this);
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = generateDefaultLayoutParams();
                    view.setLayoutParams(layoutParams);
                }
                view.measure(i, layoutParams.height > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : 0);
                view.forceLayout();
                if (i4 > 0) {
                    listPaddingTop += dividerHeight;
                }
                listPaddingTop += view.getMeasuredHeight();
                if (listPaddingTop >= i2) {
                    return i2;
                }
            }
        }
        return listPaddingTop;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable selector;
        android.graphics.Rect rect = this.c;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        if (this.b == null) {
            super.drawableStateChanged();
            c(true);
            d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.j && this.a) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.b = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10) {
            if (this.b == null) {
                defpackage.jd jdVar = new defpackage.jd(this, 0);
                this.b = jdVar;
                ((defpackage.je) jdVar.a).post(jdVar);
            }
            actionMasked = 10;
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                android.view.View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (defpackage.ja.d) {
                        try {
                            java.lang.reflect.Method method = defpackage.ja.a;
                            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iPointToPosition);
                            method.invoke(this, numValueOf, childAt, java.lang.Boolean.FALSE, -1, -1);
                            defpackage.ja.b.invoke(this, numValueOf);
                            defpackage.ja.c.invoke(this, numValueOf);
                        } catch (java.lang.IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (java.lang.reflect.InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    }
                }
                d();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        defpackage.jd jdVar = this.b;
        if (jdVar != null) {
            defpackage.je jeVar = (defpackage.je) jdVar.a;
            jeVar.b = null;
            jeVar.removeCallbacks(jdVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public final void setSelector(android.graphics.drawable.Drawable drawable) {
        defpackage.jb jbVar = drawable != null ? new defpackage.jb(drawable) : null;
        this.i = jbVar;
        super.setSelector(jbVar);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.d = rect.left;
        this.e = rect.top;
        this.f = rect.right;
        this.g = rect.bottom;
    }
}
