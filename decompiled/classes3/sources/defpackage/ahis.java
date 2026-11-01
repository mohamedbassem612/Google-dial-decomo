package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahis implements afam {
    public final /* synthetic */ android.app.Application a;
    public final /* synthetic */ android.app.Application.ActivityLifecycleCallbacks b;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean c;
    public final /* synthetic */ long d;

    public /* synthetic */ ahis(android.app.Application application, android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, long j) {
        this.a = application;
        this.b = activityLifecycleCallbacks;
        this.c = atomicBoolean;
        this.d = j;
    }

    public final void a() {
        android.app.Application application = this.a;
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        afec.e(new defpackage.ahiu(this.c, application, activityLifecycleCallbacks, this.d, 0));
    }
}
