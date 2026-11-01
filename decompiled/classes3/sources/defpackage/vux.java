package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class vux extends agwz {
    final /* synthetic */ dsd a;
    final /* synthetic */ vva b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vux(vva vvaVar, ahpz ahpzVar, java.util.concurrent.Executor executor, dsd dsdVar) {
        super(ahpzVar, "fetch_content", executor);
        this.a = dsdVar;
        j$.util.Objects.requireNonNull(vvaVar);
        this.b = vvaVar;
    }

    public final void a(boolean z, android.net.Uri uri) {
        this.a.b((java.lang.Object) null);
        this.b.d.m(this);
    }
}
