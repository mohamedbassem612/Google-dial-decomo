package com.android.dialer.widget.branding;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class PreviewBrandingView extends android.widget.FrameLayout {
    private static final float a = 1.4142135f;
    private final float b;

    public PreviewBrandingView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.LayoutInflater.from(context).inflate(2131624391, (android.view.ViewGroup) this, true);
        float attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "layout_width", 80);
        float f = a;
        float f2 = attributeIntValue * f;
        float f3 = f * 4.0f;
        float f4 = attributeIntValue * 0.41f;
        float f5 = (f * f4) / 4.0f;
        this.b = f5;
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131428720);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = (int) a(f2);
        layoutParams.height = (int) a(f4);
        textView.setLayoutParams(layoutParams);
        textView.setRotation(true != b() ? 45.0f : -45.0f);
        float f6 = (f4 / 2.0f) + f3;
        textView.setTranslationX(a(b() ? -f5 : f5));
        textView.setTranslationY(a(-f5));
        textView.setPadding((int) a(f6), 0, (int) a(f6), 0);
    }

    private final float a(float f) {
        return android.util.TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    private final boolean b() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131428720);
        if (textView != null) {
            textView.setRotation(true != b() ? 45.0f : -45.0f);
            boolean zB = b();
            float f = this.b;
            if (zB) {
                f = -f;
            }
            textView.setTranslationX(a(f));
        }
    }
}
