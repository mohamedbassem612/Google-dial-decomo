package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aely implements java.util.concurrent.Callable {
    public final /* synthetic */ aemb a;

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String str = zwk.a;
        android.content.Context context = this.a.b;
        aais.as(context);
        zwq.f(context, 11400000);
        return (java.lang.Boolean) zwq.b(context, zwq.d, new defpackage.zwo(context.getApplicationInfo().packageName, context), 0L, (java.util.concurrent.Executor) null);
    }
}
