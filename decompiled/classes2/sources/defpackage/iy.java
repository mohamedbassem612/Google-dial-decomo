package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iy extends defpackage.kj {
    private static final int[] a = {android.R.attr.listDivider};
    private final android.graphics.drawable.Drawable b;
    private final android.graphics.Rect c = new android.graphics.Rect();

    public iy(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(a);
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.b = drawable;
        if (drawable == null) {
            android.util.Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.kj
    public final void a(android.graphics.Rect rect, android.view.View view, android.support.v7.widget.RecyclerView recyclerView, la laVar) {
        android.graphics.drawable.Drawable drawable = this.b;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        }
    }

    @Override // defpackage.kj
    public final void b(android.graphics.Canvas canvas, android.support.v7.widget.RecyclerView recyclerView) {
        android.graphics.drawable.Drawable drawable;
        int width;
        int paddingLeft;
        if (recyclerView.n == null || (drawable = this.b) == null) {
            return;
        }
        canvas.save();
        if (recyclerView.i) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = recyclerView.getChildAt(i);
            android.graphics.Rect rect = this.c;
            android.support.v7.widget.RecyclerView.I(childAt, rect);
            int iRound = rect.bottom + java.lang.Math.round(childAt.getTranslationY());
            drawable.setBounds(paddingLeft, iRound - drawable.getIntrinsicHeight(), width, iRound);
            drawable.draw(canvas);
        }
        canvas.restore();
    }
}
