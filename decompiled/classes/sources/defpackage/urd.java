package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class urd extends defpackage.da {
    private android.content.SharedPreferences n;

    @Override // defpackage.az, defpackage.mp, defpackage.cm, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        defpackage.urc urcVar = (defpackage.urc) defpackage.agab.aH(this, defpackage.urc.class);
        urcVar.cI().i();
        this.n = urcVar.dU().a();
        urcVar.oE().r(this, 2132084702);
        java.lang.String string = getString(2132018327);
        if (this.n.getBoolean(string, false)) {
            return;
        }
        this.n.edit().putBoolean(string, true).apply();
        android.content.Intent intent = new android.content.Intent();
        intent.setPackage("com.google.android.contacts");
        intent.setAction("com.google.android.comms.action.CHECK_THEME");
        intent.addFlags(32);
        sendBroadcast(intent);
    }
}
