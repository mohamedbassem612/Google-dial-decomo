package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afzi implements android.view.ViewTreeObserver.OnTouchModeChangeListener {
    final /* synthetic */ com.google.android.material.search.SearchView a;

    public afzi(com.google.android.material.search.SearchView searchView) {
        j$.util.Objects.requireNonNull(searchView);
        this.a = searchView;
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        android.widget.EditText editText;
        if (z) {
            return;
        }
        com.google.android.material.search.SearchView searchView = this.a;
        if (searchView.hasWindowFocus()) {
            int i = searchView.r;
            if (i == 0) {
                throw null;
            }
            if ((i != 4 && i != 3) || (editText = searchView.k) == null || editText.isFocused()) {
                return;
            }
            j$.util.Objects.requireNonNull(editText);
            editText.post(new defpackage.aflt(editText, 11));
        }
    }
}
