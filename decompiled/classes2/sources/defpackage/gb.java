package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
abstract class gb implements android.widget.AdapterView.OnItemClickListener, defpackage.gi, ge {
    public android.graphics.Rect g;

    protected static int A(android.widget.ListAdapter listAdapter, android.content.Context context, int i) {
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        android.widget.FrameLayout frameLayout = null;
        android.view.View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new android.widget.FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(0, 0);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    protected static defpackage.fq y(android.widget.ListAdapter listAdapter) {
        return listAdapter instanceof android.widget.HeaderViewListAdapter ? (defpackage.fq) ((android.widget.HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (defpackage.fq) listAdapter;
    }

    protected static boolean z(ft ftVar) {
        int size = ftVar.size();
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = ftVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public final int a() {
        return 0;
    }

    public final boolean i(fv fvVar) {
        return false;
    }

    public final boolean j(fv fvVar) {
        return false;
    }

    public abstract void l(ft ftVar);

    public abstract void o(android.view.View view);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        android.widget.ListAdapter listAdapter = (android.widget.ListAdapter) adapterView.getAdapter();
        y(listAdapter).a.B((android.view.MenuItem) listAdapter.getItem(i), this, true != w() ? 4 : 0);
    }

    public abstract void p(boolean z);

    public abstract void q(int i);

    public abstract void r(int i);

    public abstract void s(android.widget.PopupWindow.OnDismissListener onDismissListener);

    public abstract void t(boolean z);

    public abstract void u(int i);

    protected boolean w() {
        return true;
    }

    public final void c(android.content.Context context, ft ftVar) {
    }
}
