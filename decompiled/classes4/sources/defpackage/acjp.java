package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class acjp implements java.lang.Runnable {
    public final /* synthetic */ android.app.Dialog a;
    public final /* synthetic */ defpackage.akjh b;
    public final /* synthetic */ android.app.Activity c;
    public final /* synthetic */ android.view.View d;
    public final /* synthetic */ android.content.res.Configuration e;
    public final /* synthetic */ android.view.View f;
    public final /* synthetic */ aofv g;

    public /* synthetic */ acjp(aofv aofvVar, android.app.Dialog dialog, defpackage.akjh akjhVar, android.app.Activity activity, android.view.View view, android.content.res.Configuration configuration, android.view.View view2) {
        this.g = aofvVar;
        this.a = dialog;
        this.b = akjhVar;
        this.c = activity;
        this.d = view;
        this.e = configuration;
        this.f = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity = this.c;
        android.content.res.Configuration configuration = this.e;
        android.view.View view = this.f;
        this.g.h(this.a, this.b, activity, this.d, aofv.f(activity, configuration, view.getWidth()), aofv.e(activity, configuration, view.getHeight()));
    }
}
