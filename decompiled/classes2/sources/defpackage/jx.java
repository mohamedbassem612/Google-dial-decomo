package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jx extends defpackage.je {
    final int c;
    final int d;
    public defpackage.jw e;
    private android.view.MenuItem f;

    public jx(android.content.Context context, boolean z) {
        super(context, z);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        this.c = layoutDirection == 1 ? 21 : 22;
        this.d = layoutDirection == 1 ? 22 : 21;
    }

    @Override // defpackage.je, android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        defpackage.fq fqVar;
        int headersCount;
        defpackage.jw jwVar;
        defpackage.jw jwVar2;
        int iPointToPosition;
        int i;
        if (this.e != null) {
            android.widget.ListAdapter adapter = getAdapter();
            int i2 = 0;
            if (adapter instanceof android.widget.HeaderViewListAdapter) {
                android.widget.HeaderViewListAdapter headerViewListAdapter = (android.widget.HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                fqVar = (defpackage.fq) headerViewListAdapter.getWrappedAdapter();
            } else {
                fqVar = (defpackage.fq) adapter;
                headersCount = 0;
            }
            android.view.MenuItem item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= fqVar.getCount()) ? null : fqVar.getItem(i);
            android.view.MenuItem menuItem = this.f;
            if (menuItem != item) {
                ft ftVar = fqVar.a;
                if (menuItem != null && (jwVar2 = ((defpackage.jy) this.e).a) != null) {
                    ((defpackage.fm) jwVar2).a.a.removeCallbacksAndMessages(ftVar);
                }
                this.f = item;
                if (item != null && (jwVar = ((defpackage.jy) this.e).a) != null) {
                    defpackage.fm fmVar = (defpackage.fm) jwVar;
                    defpackage.fn fnVar = fmVar.a;
                    android.os.Handler handler = fnVar.a;
                    handler.removeCallbacksAndMessages(null);
                    java.util.List list = fnVar.b;
                    int size = list.size();
                    while (true) {
                        if (i2 >= size) {
                            i2 = -1;
                            break;
                        }
                        if (ftVar == ((alic) list.get(i2)).b) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 != -1) {
                        int i3 = i2 + 1;
                        handler.postAtTime(new defpackage.abb(fmVar, i3 < list.size() ? (alic) list.get(i3) : null, item, ftVar, 1), ftVar, android.os.SystemClock.uptimeMillis() + 200);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        android.support.v7.view.menu.ListMenuItemView listMenuItemView = (android.support.v7.view.menu.ListMenuItemView) getSelectedView();
        if (listMenuItemView != null) {
            if (i == this.c) {
                if (!listMenuItemView.isEnabled() || !listMenuItemView.a.hasSubMenu()) {
                    return true;
                }
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                return true;
            }
            if (i == this.d) {
                setSelection(-1);
                android.widget.ListAdapter adapter = getAdapter();
                (adapter instanceof android.widget.HeaderViewListAdapter ? (defpackage.fq) ((android.widget.HeaderViewListAdapter) adapter).getWrappedAdapter() : (defpackage.fq) adapter).a.i(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }
}
