package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gej implements android.view.View.OnCreateContextMenuListener, android.view.MenuItem.OnMenuItemClickListener {
    private final androidx.preference.Preference a;

    public gej(androidx.preference.Preference preference) {
        this.a = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        androidx.preference.Preference preference = this.a;
        java.lang.CharSequence charSequenceM = preference.m();
        if (!preference.y || android.text.TextUtils.isEmpty(charSequenceM)) {
            return;
        }
        contextMenu.setHeaderTitle(charSequenceM);
        contextMenu.add(0, 0, 0, 2132018197).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        androidx.preference.Preference preference = this.a;
        android.content.Context context = preference.j;
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) context.getSystemService("clipboard");
        java.lang.CharSequence charSequenceM = preference.m();
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText("Preference", charSequenceM));
        if (android.os.Build.VERSION.SDK_INT <= 32) {
            android.widget.Toast.makeText(context, context.getString(2132019798, charSequenceM), 0).show();
        }
        return true;
    }
}
