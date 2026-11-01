package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dj extends defpackage.dl {
    public final android.os.PowerManager a;
    final /* synthetic */ dq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(dq dqVar, android.content.Context context) {
        super(dqVar);
        this.b = dqVar;
        this.a = (android.os.PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.dl
    public final android.content.IntentFilter a() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // defpackage.dl
    public final void b() {
        this.b.R(true, true);
    }
}
