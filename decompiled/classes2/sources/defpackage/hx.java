package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hx extends android.widget.SeekBar {
    private final defpackage.hy a;

    public hx(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 2130970334);
        lo.d(this, getContext());
        defpackage.hy hyVar = new defpackage.hy(this);
        this.a = hyVar;
        hyVar.b(attributeSet, 2130970334);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        defpackage.hy hyVar = this.a;
        android.graphics.drawable.Drawable drawable = hyVar.c;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        android.widget.SeekBar seekBar = hyVar.b;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.a.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        defpackage.hy hyVar = this.a;
        if (hyVar.c != null) {
            android.widget.SeekBar seekBar = hyVar.b;
            int max = seekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = hyVar.c.getIntrinsicWidth();
                int intrinsicHeight = hyVar.c.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth >> 1 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight >> 1 : 1;
                hyVar.c.setBounds(-i, -i2, i, i2);
                int width = (seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight();
                int iSave = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    hyVar.c.draw(canvas);
                    canvas.translate(width / max, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
