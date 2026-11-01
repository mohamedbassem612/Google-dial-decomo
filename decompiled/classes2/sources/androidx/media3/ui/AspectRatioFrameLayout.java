package androidx.media3.ui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class AspectRatioFrameLayout extends android.widget.FrameLayout {
    public AspectRatioFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.fvn.a, 0, 0);
            try {
                typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (java.lang.Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        new defpackage.fvl(this, 0);
    }

    public AspectRatioFrameLayout(android.content.Context context) {
        this(context, null);
    }
}
