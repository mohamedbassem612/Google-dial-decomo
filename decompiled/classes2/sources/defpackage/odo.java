package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class odo {
    public static final aimz a = aimz.i("com/android/dialer/errors/dataservice/SubscriptionMixinCallbacksFactory");
    public final rlv b;
    public final mgw c;
    public final aoin d;

    public odo(rlv rlvVar, mgw mgwVar, aoin aoinVar) {
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(mgwVar, "singletonRecorder");
        aooh.f(aoinVar, "enableLogDataSourceOnDataLoadErrors");
        this.b = rlvVar;
        this.c = mgwVar;
        this.d = aoinVar;
    }

    public final agza a(defpackage.odm odmVar) {
        aooh.f(odmVar, "callbacks");
        return b(odmVar, false);
    }

    public final agza b(defpackage.odm odmVar, boolean z) {
        aooh.f(odmVar, "callbacks");
        return new defpackage.odn(this, odmVar, z);
    }
}
