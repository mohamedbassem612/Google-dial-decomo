package androidx.media3.ui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class SubtitleView extends android.widget.FrameLayout {
    private android.view.View a;

    public SubtitleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        java.util.List list = java.util.Collections.EMPTY_LIST;
        defpackage.fvm fvmVar = new defpackage.fvm(context);
        this.a = fvmVar;
        addView(fvmVar);
    }

    public SubtitleView(android.content.Context context) {
        this(context, null);
    }
}
