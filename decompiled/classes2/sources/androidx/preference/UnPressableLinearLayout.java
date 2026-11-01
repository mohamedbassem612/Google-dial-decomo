package androidx.preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class UnPressableLinearLayout extends android.widget.LinearLayout {
    public UnPressableLinearLayout(android.content.Context context) {
        this(context, null);
    }

    public UnPressableLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSetPressed(boolean z) {
    }
}
