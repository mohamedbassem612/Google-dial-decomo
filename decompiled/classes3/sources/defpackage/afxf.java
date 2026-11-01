package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afxf extends afwm {
    protected final int b() {
        return 2131167152;
    }

    protected final int c() {
        return 2131624330;
    }

    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (android.view.View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), java.lang.Math.max(getMeasuredHeight(), android.view.View.MeasureSpec.getSize(i2)));
        }
    }
}
