package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class gy extends android.support.v7.widget.AppCompatImageView implements defpackage.hc {
    final /* synthetic */ defpackage.hb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy(defpackage.hb hbVar, android.content.Context context) {
        super(context, null, 2130968610);
        this.a = hbVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        aa$.ExternalSyntheticApiModelOutline0.m(this, getContentDescription());
        setOnTouchListener(new defpackage.gx(this, this));
    }

    @Override // defpackage.hc
    public final boolean c() {
        return false;
    }

    @Override // defpackage.hc
    public final boolean d() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.a.o();
        }
        return true;
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        android.graphics.drawable.Drawable drawable = getDrawable();
        android.graphics.drawable.Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = java.lang.Math.max(width, height) / 2;
            int paddingLeft = getPaddingLeft() - getPaddingRight();
            int i5 = (width + paddingLeft) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(i5 - iMax, paddingTop - iMax, i5 + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
