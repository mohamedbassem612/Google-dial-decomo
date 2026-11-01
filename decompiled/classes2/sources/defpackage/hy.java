package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hy extends defpackage.hu {
    public final android.widget.SeekBar b;
    public android.graphics.drawable.Drawable c;
    private android.content.res.ColorStateList d;
    private android.graphics.PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public hy(android.widget.SeekBar seekBar) {
        super(seekBar);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = seekBar;
    }

    private final void c() {
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            if (this.f || this.g) {
                android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
                this.c = drawableMutate;
                if (this.f) {
                    drawableMutate.setTintList(this.d);
                }
                if (this.g) {
                    this.c.setTintMode(this.e);
                }
                if (this.c.isStateful()) {
                    this.c.setState(this.b.getDrawableState());
                }
            }
        }
    }

    @Override // defpackage.hu
    public final void b(android.util.AttributeSet attributeSet, int i) {
        super.b(attributeSet, 2130970334);
        android.widget.SeekBar seekBar = this.b;
        android.content.Context context = seekBar.getContext();
        int[] iArr = ef.g;
        ajxw ajxwVarD = ajxw.D(context, attributeSet, iArr, 2130970334, 0);
        java.lang.Object obj = ajxwVarD.b;
        android.content.Context context2 = seekBar.getContext();
        int i2 = dzs.a;
        dzp.b(seekBar, context2, iArr, attributeSet, (android.content.res.TypedArray) obj, 2130970334, 0);
        android.graphics.drawable.Drawable drawableU = ajxwVarD.u(0);
        if (drawableU != null) {
            seekBar.setThumb(drawableU);
        }
        android.graphics.drawable.Drawable drawableT = ajxwVarD.t(1);
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = drawableT;
        if (drawableT != null) {
            drawableT.setCallback(seekBar);
            drawableT.setLayoutDirection(seekBar.getLayoutDirection());
            if (drawableT.isStateful()) {
                drawableT.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (ajxwVarD.z(3)) {
            int iO = ajxwVarD.o(3, -1);
            android.graphics.PorterDuff.Mode mode = this.e;
            android.graphics.Rect rect = iz.a;
            this.e = a.q(iO, mode);
            this.g = true;
        }
        if (ajxwVarD.z(2)) {
            this.d = ajxwVarD.s(2);
            this.f = true;
        }
        ajxwVarD.x();
        c();
    }
}
