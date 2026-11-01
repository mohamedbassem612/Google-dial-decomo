package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dm extends defpackage.dl {
    final /* synthetic */ dq a;
    public final izg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(dq dqVar, izg izgVar) {
        super(dqVar);
        this.a = dqVar;
        this.b = izgVar;
    }

    @Override // defpackage.dl
    public final android.content.IntentFilter a() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override // defpackage.dl
    public final void b() {
        this.a.R(true, true);
    }
}
