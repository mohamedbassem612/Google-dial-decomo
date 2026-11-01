package android.support.v7.view.menu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ExpandedMenuView extends android.widget.ListView implements android.widget.AdapterView.OnItemClickListener, fs, gg {
    private static final int[] a = {android.R.attr.background, android.R.attr.divider};
    private ft b;

    public ExpandedMenuView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        ajxw ajxwVarD = ajxw.D(context, attributeSet, a, i, 0);
        if (ajxwVarD.z(0)) {
            setBackgroundDrawable(ajxwVarD.t(0));
        }
        if (ajxwVarD.z(1)) {
            setDivider(ajxwVarD.t(1));
        }
        ajxwVarD.x();
    }

    public final void a(ft ftVar) {
        this.b = ftVar;
    }

    public final boolean b(fv fvVar) {
        throw null;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        this.b.B((fv) getAdapter().getItem(i), (ge) null, 0);
    }

    public ExpandedMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.listViewStyle);
    }
}
