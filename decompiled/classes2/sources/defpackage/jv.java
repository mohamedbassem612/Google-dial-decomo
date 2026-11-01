package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class jv implements defpackage.gi {
    private final android.content.Context a;
    private android.widget.ListAdapter b;
    private int c;
    private boolean d;
    public defpackage.je e;
    public int g;
    public boolean h;
    public boolean i;
    public android.view.View k;
    public android.widget.AdapterView.OnItemClickListener l;
    public android.widget.AdapterView.OnItemSelectedListener m;
    public final android.os.Handler n;
    public boolean o;
    public final android.widget.PopupWindow p;
    private android.database.DataSetObserver r;
    private android.graphics.Rect u;
    public int f = -2;
    public int j = 0;
    public final defpackage.jd q = new defpackage.jd(this, 6);
    private final defpackage.klw v = new defpackage.klw(this, 1);
    private final defpackage.ju s = new defpackage.ju(this);
    private final defpackage.jd w = new defpackage.jd(this, 5);
    private final android.graphics.Rect t = new android.graphics.Rect();

    public jv(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this.a = context;
        this.n = new android.os.Handler(context.getMainLooper());
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ef.p, i, i2);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.c = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.d = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        defpackage.ht htVar = new defpackage.ht(context, attributeSet, i, i2);
        this.p = htVar;
        htVar.setInputMethodMode(1);
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        if (this.d) {
            return this.c;
        }
        return 0;
    }

    public final android.graphics.drawable.Drawable c() {
        return this.p.getBackground();
    }

    @Override // defpackage.gi
    public final android.widget.ListView cI() {
        return this.e;
    }

    public void e(android.widget.ListAdapter listAdapter) {
        android.database.DataSetObserver dataSetObserver = this.r;
        if (dataSetObserver == null) {
            this.r = new defpackage.jt(this);
        } else {
            android.widget.ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.r);
        }
        defpackage.je jeVar = this.e;
        if (jeVar != null) {
            jeVar.setAdapter(this.b);
        }
    }

    public final void f(android.graphics.drawable.Drawable drawable) {
        this.p.setBackgroundDrawable(drawable);
    }

    public final void g(int i) {
        this.g = i;
    }

    public final void j(int i) {
        this.c = i;
        this.d = true;
    }

    @Override // defpackage.gi
    public final void m() {
        android.widget.PopupWindow popupWindow = this.p;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.e = null;
        this.n.removeCallbacks(this.q);
    }

    public final int o() {
        if (x()) {
            return this.e.getSelectedItemPosition();
        }
        return -1;
    }

    public defpackage.je p(android.content.Context context, boolean z) {
        return new defpackage.je(context, z);
    }

    public final void q() {
        defpackage.je jeVar = this.e;
        if (jeVar != null) {
            jeVar.a = true;
            jeVar.requestLayout();
        }
    }

    public final void r(int i) {
        android.graphics.drawable.Drawable background = this.p.getBackground();
        if (background == null) {
            this.f = i;
            return;
        }
        android.graphics.Rect rect = this.t;
        background.getPadding(rect);
        this.f = rect.left + rect.right + i;
    }

    public final void s(android.graphics.Rect rect) {
        this.u = rect != null ? new android.graphics.Rect(rect) : null;
    }

    public final void t(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.p.setOnDismissListener(onDismissListener);
    }

    public final boolean u() {
        return this.p.getInputMethodMode() == 2;
    }

    @Override // defpackage.gi
    public final void v() {
        int i;
        int iMakeMeasureSpec;
        if (this.e == null) {
            defpackage.je jeVarP = p(this.a, !this.o);
            this.e = jeVarP;
            jeVarP.setAdapter(this.b);
            this.e.setOnItemClickListener(this.l);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new defpackage.gdz(this, 1));
            this.e.setOnScrollListener(this.s);
            android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = this.m;
            if (onItemSelectedListener != null) {
                this.e.setOnItemSelectedListener(onItemSelectedListener);
            }
            this.p.setContentView(this.e);
        }
        android.widget.PopupWindow popupWindow = this.p;
        android.graphics.drawable.Drawable background = popupWindow.getBackground();
        android.graphics.Rect rect = this.t;
        if (background != null) {
            background.getPadding(rect);
            i = rect.top + rect.bottom;
            if (!this.d) {
                this.c = -rect.top;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iM = fh$.ExternalSyntheticApiModelOutline0.m(popupWindow, this.k, this.c, popupWindow.getInputMethodMode() == 2);
        int i2 = this.f;
        if (i2 == -2) {
            int i3 = this.a.getResources().getDisplayMetrics().widthPixels;
            android.graphics.Rect rect2 = this.t;
            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i3 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i2 != -1) {
            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            int i4 = this.a.getResources().getDisplayMetrics().widthPixels;
            android.graphics.Rect rect3 = this.t;
            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i4 - (rect3.left + rect3.right), 1073741824);
        }
        int iB = this.e.b(iMakeMeasureSpec, iM);
        int paddingTop = iB > 0 ? this.e.getPaddingTop() + this.e.getPaddingBottom() + i : 0;
        u();
        popupWindow.setWindowLayoutType(1002);
        int i5 = iB + paddingTop;
        if (popupWindow.isShowing()) {
            if (this.k.isAttachedToWindow()) {
                int width = this.f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.k.getWidth();
                }
                popupWindow.setOutsideTouchable(true);
                popupWindow.update(this.k, this.g, this.c, width < 0 ? -1 : width, i5 >= 0 ? i5 : -1);
                return;
            }
            return;
        }
        int width2 = this.f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.k.getWidth();
        }
        popupWindow.setWidth(width2);
        popupWindow.setHeight(i5);
        fn$.ExternalSyntheticApiModelOutline0.m$1(popupWindow, true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.v);
        if (this.i) {
            popupWindow.setOverlapAnchor(this.h);
        }
        fn$.ExternalSyntheticApiModelOutline0.m(popupWindow, this.u);
        popupWindow.showAsDropDown(this.k, this.g, this.c, this.j);
        this.e.setSelection(-1);
        if (!this.o || this.e.isInTouchMode()) {
            q();
        }
        if (this.o) {
            return;
        }
        this.n.post(this.w);
    }

    public final void w() {
        this.p.setInputMethodMode(2);
    }

    @Override // defpackage.gi
    public final boolean x() {
        return this.p.isShowing();
    }

    public final void y() {
        this.o = true;
        this.p.setFocusable(true);
    }
}
