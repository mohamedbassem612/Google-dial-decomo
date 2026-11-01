package androidx.browser.browseractions;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@java.lang.Deprecated
public class BrowserActionsFallbackMenuView extends android.widget.LinearLayout {
    private final int a;
    private final int b;

    public BrowserActionsFallbackMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = getResources().getDimensionPixelOffset(2131165369);
        this.b = getResources().getDimensionPixelOffset(2131165368);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(getResources().getDisplayMetrics().widthPixels - (this.a << 1), this.b), 1073741824), i2);
    }
}
