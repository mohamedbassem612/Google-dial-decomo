package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aibd extends defpackage.aibe {
    volatile long a;
    defpackage.aibu b;
    defpackage.aibu c;
    volatile long d;
    defpackage.aibu e;
    defpackage.aibu f;

    public aibd(java.lang.Object obj, int i, defpackage.aibu aibuVar) {
        super(obj, i, aibuVar);
        this.a = Long.MAX_VALUE;
        defpackage.aibi aibiVar = defpackage.aibt.b;
        defpackage.aiay aiayVar = defpackage.aiay.INSTANCE;
        this.b = aiayVar;
        this.c = aiayVar;
        this.d = Long.MAX_VALUE;
        this.e = aiayVar;
        this.f = aiayVar;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final long b() {
        return this.a;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final long c() {
        return this.d;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final defpackage.aibu f() {
        return this.b;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final defpackage.aibu g() {
        return this.e;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final defpackage.aibu h() {
        return this.c;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final defpackage.aibu i() {
        return this.f;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final void k(long j) {
        this.a = j;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final void l(defpackage.aibu aibuVar) {
        this.b = aibuVar;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final void m(defpackage.aibu aibuVar) {
        this.e = aibuVar;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final void n(defpackage.aibu aibuVar) {
        this.c = aibuVar;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final void o(defpackage.aibu aibuVar) {
        this.f = aibuVar;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final void q(long j) {
        this.d = j;
    }
}
