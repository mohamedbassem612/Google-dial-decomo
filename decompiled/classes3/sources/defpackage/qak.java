package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qak implements java.util.function.Consumer {
    public final /* synthetic */ aonj a;

    public qak(aonj aonjVar) {
        this.a = aonjVar;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(java.lang.Object obj) {
        this.a.a(obj);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
