package com.android.dialer.incall.video.ui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class VideoCheckableLabeledButton extends android.widget.LinearLayout {
    public static final /* synthetic */ int h = 0;
    private static final int[] i = {android.R.attr.state_checked};
    public final android.widget.ImageView a;
    public final android.widget.TextView b;
    public final android.graphics.drawable.Drawable c;
    public final android.graphics.drawable.Drawable d;
    public boolean e;
    public j$.util.Optional f;
    public j$.util.Optional g;

    public VideoCheckableLabeledButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
        this.f = j$.util.Optional.empty();
        this.g = j$.util.Optional.empty();
        android.view.LayoutInflater.from(context).inflate(2131624683, (android.view.ViewGroup) this, true);
        this.a = (android.widget.ImageView) findViewById(2131428358);
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131428437);
        this.b = textView;
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(2131232241, null);
        this.d = drawable;
        this.c = getResources().getDrawable(2131232240, null);
        textView.setVisibility(0);
        setOrientation(1);
        setGravity(1);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131166185);
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        ((android.graphics.drawable.LayerDrawable) drawable).findDrawableByLayerId(2131428540).setTintList(context.getColorStateList(2131102961));
        findViewById(2131428355).setVisibility(8);
        super.setOnClickListener(new defpackage.qht(this, 6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (this.e) {
            mergeDrawableStates(iArrOnCreateDrawableState, i);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.g = j$.util.Optional.ofNullable(onClickListener);
    }

    public VideoCheckableLabeledButton(android.content.Context context) {
        this(context, null);
    }
}
