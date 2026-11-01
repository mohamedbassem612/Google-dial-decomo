package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aibk extends defpackage.aibm {
    volatile long a;
    aibu b;
    aibu c;

    public aibk(java.lang.ref.ReferenceQueue referenceQueue, java.lang.Object obj, int i, aibu aibuVar) {
        super(referenceQueue, obj, i, aibuVar);
        this.a = Long.MAX_VALUE;
        aibi aibiVar = aibt.b;
        aiay aiayVar = aiay.a;
        this.b = aiayVar;
        this.c = aiayVar;
    }

    @Override // defpackage.aibm
    public final long b() {
        return this.a;
    }

    @Override // defpackage.aibm
    public final aibu f() {
        return this.b;
    }

    @Override // defpackage.aibm
    public final aibu h() {
        return this.c;
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
    public final void n(aibu aibuVar) {
        this.c = aibuVar;
    }
}
