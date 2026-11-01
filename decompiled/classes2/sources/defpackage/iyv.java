package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iyv extends defpackage.kj {
    private final int a;

    public iyv(int i) {
        this.a = i;
    }

    @Override // defpackage.kj
    public final void a(android.graphics.Rect rect, android.view.View view, android.support.v7.widget.RecyclerView recyclerView, la laVar) {
        aooh.f(rect, "outRect");
        aooh.f(view, "view");
        aooh.f(laVar, "state");
        kh khVar = recyclerView.m;
        if (khVar != null) {
            if (recyclerView.c(view) == khVar.a() - 1) {
                return;
            }
        }
        rect.bottom = this.a;
    }
}
