package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aibl extends defpackage.aibm {
    volatile long a;
    aibu b;
    aibu c;
    volatile long d;
    aibu e;
    aibu f;

    public aibl(java.lang.ref.ReferenceQueue referenceQueue, java.lang.Object obj, int i, aibu aibuVar) {
        super(referenceQueue, obj, i, aibuVar);
        this.a = Long.MAX_VALUE;
        aibi aibiVar = aibt.b;
        aiay aiayVar = aiay.a;
        this.b = aiayVar;
        this.c = aiayVar;
        this.d = Long.MAX_VALUE;
        this.e = aiayVar;
        this.f = aiayVar;
    }

    @Override // defpackage.aibm
    public final long b() {
        return this.a;
    }

    @Override // defpackage.aibm
    public final long c() {
        return this.d;
    }

    @Override // defpackage.aibm
    public final aibu f() {
        return this.b;
    }

    @Override // defpackage.aibm
    public final aibu g() {
        return this.e;
    }

    @Override // defpackage.aibm
    public final aibu h() {
        return this.c;
    }

    @Override // defpackage.aibm
    public final aibu i() {
        return this.f;
    }

    @Override // defpackage.aibm
    public final void k(long j) {
        this.a = j;
    }

    @Override // defpackage.aibm
    public final void l(aibu aibuVar) {
        this.b = aibuVar;
    }

    @Override // defpackage.aibm
    public final void m(aibu aibuVar) {
        this.e = aibuVar;
    }

    @Override // defpackage.aibm
    public final void n(aibu aibuVar) {
        this.c = aibuVar;
    }

    @Override // defpackage.aibm
    public final void o(aibu aibuVar) {
        this.f = aibuVar;
    }

    @Override // defpackage.aibm
    public final void q(long j) {
        this.d = j;
    }
}
