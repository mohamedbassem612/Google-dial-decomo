package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gwh extends defpackage.gwd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwh(android.content.Context context, defpackage.gou gouVar) {
        super(context, gouVar);
        if (context == null) {
            defpackage.aooh.i("context");
        }
    }

    @Override // defpackage.gwd
    public final android.content.IntentFilter a() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // defpackage.gwf
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        android.content.Intent intentRegisterReceiver = this.a.registerReceiver(null, a());
        boolean z = true;
        if (intentRegisterReceiver != null && intentRegisterReceiver.getAction() != null) {
            java.lang.String action = intentRegisterReceiver.getAction();
            if (action == null) {
                z = false;
            } else {
                int iHashCode = action.hashCode();
                if (iHashCode == -1181163412) {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                }
                z = false;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }

    @Override // defpackage.gwd
    public final void c(android.content.Intent intent) {
        defpackage.aooh.f(intent, "intent");
        if (intent.getAction() != null) {
            defpackage.gsh.a().c(gwi.a, "Received ".concat(java.lang.String.valueOf(intent.getAction())));
            java.lang.String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode == -1181163412) {
                    if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                        f(java.lang.Boolean.FALSE);
                    }
                } else if (iHashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    f(java.lang.Boolean.TRUE);
                }
            }
        }
    }
}
