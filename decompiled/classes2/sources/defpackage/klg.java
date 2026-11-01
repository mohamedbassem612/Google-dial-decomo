package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class klg implements java.util.function.Consumer {
    public final /* synthetic */ defpackage.kli a;

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        this.a.d((defpackage.kdf) obj);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
