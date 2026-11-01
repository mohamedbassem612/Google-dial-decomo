package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class afvc extends android.widget.FrameLayout {
    android.graphics.drawable.Drawable a;
    android.graphics.Rect b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    private android.graphics.Rect g;

    public afvc(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new android.graphics.Rect();
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = true;
        int[] iArr = defpackage.afuy.c;
        defpackage.afvl.b(context, attributeSet, i, 2132085323);
        defpackage.afvl.d(context, attributeSet, iArr, i, 2132085323, new int[0]);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 2132085323);
        this.a = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(true);
        defpackage.afvb afvbVar = new defpackage.afvb(this);
        int i2 = defpackage.dzs.a;
        defpackage.dzk.o(this, afvbVar);
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.b == null || this.a == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.c) {
            this.g.set(0, 0, width, this.b.top);
            this.a.setBounds(this.g);
            this.a.draw(canvas);
        }
        if (this.d) {
            this.g.set(0, height - this.b.bottom, width, height);
            this.a.setBounds(this.g);
            this.a.draw(canvas);
        }
        if (this.e) {
            this.g.set(0, this.b.top, this.b.left, height - this.b.bottom);
            this.a.setBounds(this.g);
            this.a.draw(canvas);
        }
        if (this.f) {
            this.g.set(width - this.b.right, this.b.top, width, height - this.b.bottom);
            this.a.setBounds(this.g);
            this.a.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.graphics.drawable.Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.graphics.drawable.Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    protected void a(defpackage.eax eaxVar) {
    }

    public afvc(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public afvc(android.content.Context context) {
        this(context, null);
    }
}
