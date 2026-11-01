package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aohj extends defpackage.aohi {
    public final boolean a;
    private boolean b = false;
    private boolean c = false;
    private final ajsz d;

    public aohj(ajsz ajszVar, boolean z) {
        this.d = ajszVar;
        this.a = z;
    }

    public final void a() {
        boolean z = this.a;
        ajsz ajszVar = this.d;
        if (z) {
            ajszVar.dx(1);
        } else {
            ajszVar.dx(2);
        }
    }

    @Override // defpackage.aohy
    public final void e() {
        this.d.dw();
        this.c = true;
    }

    @Override // defpackage.aohy
    public final void f(java.lang.Throwable th) {
        this.d.dv("Cancelled by client with StreamObserver.onError()", th);
        this.b = true;
    }

    @Override // defpackage.aohy
    public final void g(java.lang.Object obj) {
        ahvr.bZ(!this.b, "Stream was terminated by error, no further calls are allowed");
        ahvr.bZ(!this.c, "Stream is already completed, no further calls are allowed");
        this.d.dy(obj);
    }
}
