package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lw implements android.view.View.OnClickListener {
    final defpackage.fi a;
    final /* synthetic */ defpackage.ly b;

    public lw(defpackage.ly lyVar) {
        this.b = lyVar;
        this.a = new defpackage.fi(lyVar.a.getContext(), lyVar.c);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        defpackage.ly lyVar = this.b;
        android.view.Window.Callback callback = lyVar.d;
        if (callback == null || !lyVar.e) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
