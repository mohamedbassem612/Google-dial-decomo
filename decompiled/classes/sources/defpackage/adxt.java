package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adxt implements defpackage.ajcb {
    final /* synthetic */ java.util.function.Consumer a;
    final /* synthetic */ java.util.function.Consumer b;

    public adxt(java.util.function.Consumer consumer, java.util.function.Consumer consumer2) {
        this.a = consumer;
        this.b = consumer2;
    }

    @Override // defpackage.ajcb
    public final void a(java.lang.Throwable th) {
        java.util.function.Consumer consumer = this.b;
        if (consumer != null) {
            aa$.ExternalSyntheticApiModelOutline1.m(consumer, th);
        }
    }

    @Override // defpackage.ajcb
    public final void b(java.lang.Object obj) {
        java.util.function.Consumer consumer = this.a;
        if (consumer != null) {
            aa$.ExternalSyntheticApiModelOutline1.m(consumer, obj);
        }
    }
}
