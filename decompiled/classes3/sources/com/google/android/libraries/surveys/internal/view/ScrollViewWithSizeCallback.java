package com.google.android.libraries.surveys.internal.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ScrollViewWithSizeCallback extends android.widget.ScrollView {
    public defpackage.afli a;

    public ScrollViewWithSizeCallback(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        defpackage.afli afliVar = this.a;
        if (afliVar == null || i4 == i2 || i2 == 0) {
            return;
        }
        afliVar.a(i2);
    }
}
