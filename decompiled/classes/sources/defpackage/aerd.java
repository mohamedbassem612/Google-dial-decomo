package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aerd implements defpackage.aeqv {
    public final defpackage.ajcu a;
    public final defpackage.amwu b;

    public aerd(defpackage.gou gouVar, android.content.Context context, defpackage.ajcu ajcuVar, defpackage.amwu amwuVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        new java.util.concurrent.atomic.AtomicBoolean(false);
        new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");
        gouVar.D(ajcuVar, amwuVar, aoinVar);
        this.a = ajcuVar;
        this.b = amwuVar;
        defpackage.ahvr.bI(new defpackage.fff(this, context, 8));
        defpackage.ahvr.bI(new defpackage.aell(aoinVar2, 12));
    }

    public final synchronized void a() {
    }

    @Override // defpackage.aeqv
    public final void n() {
        defpackage.aiql.C(new absj(this, 20), this.a);
    }
}
