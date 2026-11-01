package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dxl implements java.util.concurrent.Callable {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ android.content.Context b;
    final /* synthetic */ java.util.List c;
    final /* synthetic */ int d;

    public dxl(java.lang.String str, android.content.Context context, java.util.List list, int i) {
        this.a = str;
        this.b = context;
        this.c = list;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final amwp call() {
        try {
            return defpackage.dxn.b(this.a, this.b, this.c, this.d);
        } catch (java.lang.Throwable unused) {
            return new amwp(-3, (byte[]) null);
        }
    }
}
