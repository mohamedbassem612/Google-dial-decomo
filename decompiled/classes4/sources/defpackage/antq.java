package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class antq extends defpackage.antw {
    public final java.util.concurrent.atomic.AtomicReference a;
    private final j$.util.concurrent.ConcurrentLinkedQueue b;

    public antq() {
        super((char[]) null);
        this.b = new j$.util.concurrent.ConcurrentLinkedQueue();
        this.a = new java.util.concurrent.atomic.AtomicReference(null);
    }

    @Override // defpackage.antw
    public final void a() {
        this.b.offer(new defpackage.antn(3));
        g();
    }

    @Override // defpackage.antw
    public final void b() {
        this.b.offer(new defpackage.antn(0));
        g();
    }

    @Override // defpackage.antw
    public final void c() {
        this.b.offer(new defpackage.antn(1));
        g();
    }

    @Override // defpackage.antw
    public final void d(final java.lang.Object obj) {
        this.b.offer(new defpackage.antp() { // from class: anto
            @Override // defpackage.antp
            public final void a(defpackage.antw antwVar) {
                antwVar.d(obj);
            }
        });
        g();
    }

    @Override // defpackage.antw
    public final void e() {
        this.b.offer(new defpackage.antn(2));
        g();
    }

    public final void g() {
        defpackage.antw antwVar = (defpackage.antw) this.a.get();
        if (antwVar != null) {
            synchronized (this) {
                while (true) {
                    defpackage.antp antpVar = (defpackage.antp) this.b.poll();
                    if (antpVar != null) {
                        antpVar.a(antwVar);
                    }
                }
            }
        }
    }
}
