package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afzf implements android.view.View.OnFocusChangeListener {
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z) {
        android.view.inputmethod.InputMethodManager inputMethodManagerH;
        if (z || (inputMethodManagerH = agab.H(view)) == null) {
            return;
        }
        inputMethodManagerH.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
