package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aohv extends defpackage.antw {
    private final defpackage.aohy a;
    private final defpackage.anql b;
    private boolean c;
    private final defpackage.aoht d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aohv(defpackage.aohx aohxVar, defpackage.aohy aohyVar, defpackage.aoht aohtVar, defpackage.anql anqlVar) {
        super((char[]) null);
        j$.util.Objects.requireNonNull(aohxVar);
        this.c = false;
        this.a = aohyVar;
        this.d = aohtVar;
        this.b = anqlVar;
    }

    @Override // defpackage.antw
    public final void a() {
        this.d.b = true;
        if (this.c) {
            return;
        }
        this.a.f(new defpackage.anqz(anqw.c.f("client cancelled"), null));
    }

    @Override // defpackage.antw
    public final void c() {
        this.c = true;
        this.a.e();
    }

    @Override // defpackage.antw
    public final void d(java.lang.Object obj) {
        this.a.g(obj);
        this.b.c(1);
    }

    @Override // defpackage.antw
    public final void b() {
    }

    @Override // defpackage.antw
    public final void e() {
    }
}
