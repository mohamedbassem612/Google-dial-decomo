package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class bd extends defpackage.bb {
    public final android.app.Activity b;
    public final android.content.Context c;
    public final android.os.Handler d;
    public final defpackage.bo e = new defpackage.bo();

    public bd(android.app.Activity activity, android.content.Context context, android.os.Handler handler) {
        this.b = activity;
        this.c = context;
        this.d = handler;
    }

    @Override // defpackage.bb
    public android.view.View a(int i) {
        throw null;
    }

    @Override // defpackage.bb
    public boolean b() {
        throw null;
    }

    public final void h(android.content.Intent intent, int i) {
        defpackage.aooh.f(intent, "intent");
        if (i != -1) {
            throw new java.lang.IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.c.startActivity(intent, null);
    }
}
