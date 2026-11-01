package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ib implements android.widget.ListAdapter, android.widget.SpinnerAdapter {
    private final android.widget.SpinnerAdapter a;
    private android.widget.ListAdapter b;

    public ib(android.widget.SpinnerAdapter spinnerAdapter, android.content.res.Resources.Theme theme) {
        this.a = spinnerAdapter;
        if (spinnerAdapter instanceof android.widget.ListAdapter) {
            this.b = (android.widget.ListAdapter) spinnerAdapter;
        }
        if (theme != null) {
            if (spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter) {
                android.widget.ThemedSpinnerAdapter themedSpinnerAdapter = (android.widget.ThemedSpinnerAdapter) spinnerAdapter;
                if (j$.util.Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                    return;
                }
                themedSpinnerAdapter.setDropDownViewTheme(theme);
                return;
            }
            if (spinnerAdapter instanceof defpackage.lp) {
                defpackage.lp lpVar = (defpackage.lp) spinnerAdapter;
                if (lpVar.a() == null) {
                    lpVar.b();
                }
            }
        }
    }

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        android.widget.ListAdapter listAdapter = this.b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        android.widget.SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override // android.widget.SpinnerAdapter
    public final android.view.View getDropDownView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int i) {
        android.widget.SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        android.widget.SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i);
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        android.widget.SpinnerAdapter spinnerAdapter = this.a;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        android.widget.ListAdapter listAdapter = this.b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        android.widget.SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        android.widget.SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
