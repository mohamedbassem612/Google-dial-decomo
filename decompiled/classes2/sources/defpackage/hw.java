package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hw extends android.widget.RatingBar {
    private final defpackage.hu a;

    public hw(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 2130970274);
        lo.d(this, getContext());
        defpackage.hu huVar = new defpackage.hu(this);
        this.a = huVar;
        huVar.b(attributeSet, 2130970274);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        android.graphics.Bitmap bitmap = this.a.a;
        if (bitmap != null) {
            setMeasuredDimension(android.view.View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
