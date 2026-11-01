package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gen extends defpackage.kj {
    public android.graphics.drawable.Drawable a;
    public int b;
    public boolean c = true;
    final /* synthetic */ defpackage.ger d;

    public gen(defpackage.ger gerVar) {
        this.d = gerVar;
    }

    private final boolean c(android.view.View view, android.support.v7.widget.RecyclerView recyclerView) {
        ld ldVarH = recyclerView.h(view);
        if (!(ldVarH instanceof defpackage.gfc) || !((defpackage.gfc) ldVarH).v) {
            return false;
        }
        boolean z = this.c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild < recyclerView.getChildCount() - 1) {
            z = true;
            ld ldVarH2 = recyclerView.h(recyclerView.getChildAt(iIndexOfChild + 1));
            if (!(ldVarH2 instanceof defpackage.gfc) || !((defpackage.gfc) ldVarH2).u) {
                return false;
            }
        }
        return z;
    }

    @Override // defpackage.kj
    public final void a(android.graphics.Rect rect, android.view.View view, android.support.v7.widget.RecyclerView recyclerView, la laVar) {
        if (c(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.kj
    public final void i(android.graphics.Canvas canvas, android.support.v7.widget.RecyclerView recyclerView) {
        if (this.a != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = recyclerView.getChildAt(i);
                if (c(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.a.setBounds(0, y, width, this.b + y);
                    this.a.draw(canvas);
                }
            }
        }
    }
}
