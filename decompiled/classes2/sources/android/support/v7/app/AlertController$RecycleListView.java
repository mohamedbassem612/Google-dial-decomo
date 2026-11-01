package android.support.v7.app;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class AlertController$RecycleListView extends android.widget.ListView {
    public final int a;
    public final int b;

    public AlertController$RecycleListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ef.u);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }

    public AlertController$RecycleListView(android.content.Context context) {
        this(context, null);
    }
}
