package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class apjw implements java.util.concurrent.ThreadFactory {
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ apjw(java.lang.String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.util.TimeZone timeZone = defpackage.apjx.a;
        java.lang.Thread thread = new java.lang.Thread(runnable, this.a);
        thread.setDaemon(this.b);
        return thread;
    }
}
