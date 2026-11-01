package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class cm extends android.app.Activity implements defpackage.emx, defpackage.dyr {
    private final defpackage.emy a;

    public cm() {
        new defpackage.aec(0);
        this.a = new defpackage.emy(this, true);
    }

    @Override // defpackage.emx
    public defpackage.ems P() {
        return this.a;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        defpackage.aooh.f(keyEvent, "event");
        defpackage.aooh.e(getWindow().getDecorView(), "getDecorView(...)");
        int i = defpackage.dzs.a;
        return yv.d(this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        defpackage.aooh.f(keyEvent, "event");
        defpackage.aooh.e(getWindow().getDecorView(), "getDecorView(...)");
        int i = defpackage.dzs.a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // defpackage.dyr
    public final boolean h(android.view.KeyEvent keyEvent) {
        defpackage.aooh.f(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int i = defpackage.enp.a;
        defpackage.dzn.e(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        defpackage.aooh.f(bundle, "outState");
        this.a.g(defpackage.emq.c);
        super.onSaveInstanceState(bundle);
    }
}
