package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aaao extends aaah {
    public final java.util.concurrent.atomic.AtomicBoolean a;
    public final java.util.concurrent.atomic.AtomicReference b;
    public final java.lang.String c;
    public final aaag d;
    public final android.os.Handler e;
    final /* synthetic */ aaap f;

    public aaao(aaap aaapVar, java.lang.String str, aaag aaagVar) {
        j$.util.Objects.requireNonNull(aaapVar);
        this.f = aaapVar;
        this.a = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.b = new java.util.concurrent.atomic.AtomicReference();
        this.c = str;
        this.d = aaagVar;
        this.e = aaapVar.a(aaagVar);
    }

    public final void a(com.google.android.gms.common.api.Status status) {
        this.f.c(this.a, this.e, this.b, this.c, this.d);
    }
}
