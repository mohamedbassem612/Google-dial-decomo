package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vks implements java.util.concurrent.Callable {
    public final /* synthetic */ vku a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ajcq c;
    public final /* synthetic */ int d;

    public /* synthetic */ vks(vku vkuVar, int i, long j, ajcq ajcqVar) {
        this.a = vkuVar;
        this.d = i;
        this.b = j;
        this.c = ajcqVar;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        j$.util.Optional optionalOf = j$.util.Optional.of(-1);
        j$.util.Optional optionalOf2 = j$.util.Optional.of(java.lang.Long.valueOf(this.b));
        vku vkuVar = this.a;
        int i = this.d;
        vkuVar.d(i, optionalOf, optionalOf2, 2);
        vkuVar.e(i, 4, 4);
        return (defpackage.vek) aiql.H(this.c);
    }
}
