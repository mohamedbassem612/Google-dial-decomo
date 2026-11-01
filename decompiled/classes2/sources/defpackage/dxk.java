package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dxk implements java.util.concurrent.Callable {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ android.content.Context b;
    final /* synthetic */ dxj c;
    final /* synthetic */ int d;

    public dxk(java.lang.String str, android.content.Context context, dxj dxjVar, int i) {
        this.a = str;
        this.b = context;
        this.c = dxjVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        return defpackage.dxn.b(this.a, this.b, vx.z(new java.lang.Object[]{this.c}), this.d);
    }
}
