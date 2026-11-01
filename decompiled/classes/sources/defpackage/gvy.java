package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gvy extends defpackage.gwd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvy(android.content.Context context, defpackage.gou gouVar) {
        super(context, gouVar);
        if (context == null) {
            defpackage.aooh.i("context");
        }
    }

    @Override // defpackage.gwd
    public final android.content.IntentFilter a() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // defpackage.gwf
    public final /* synthetic */ java.lang.Object b() {
        android.content.Intent intentRegisterReceiver = this.a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            defpackage.gsh.a();
            android.util.Log.e(gvz.a, "getInitialState - null intent received");
            return java.lang.Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        boolean z = true;
        if (intExtra != 2 && intExtra != 5) {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.gwd
    public final void c(android.content.Intent intent) {
        defpackage.aooh.f(intent, "intent");
        java.lang.String action = intent.getAction();
        if (action != null) {
            defpackage.gsh.a().c(gvz.a, "Received ".concat(action));
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        f(java.lang.Boolean.FALSE);
                    }
                    break;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        f(java.lang.Boolean.FALSE);
                    }
                    break;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        f(java.lang.Boolean.TRUE);
                    }
                    break;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        f(java.lang.Boolean.TRUE);
                    }
                    break;
            }
        }
    }
}
