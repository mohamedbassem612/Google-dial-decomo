package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aibo extends defpackage.aibm {
    volatile long a;
    aibu b;
    aibu c;

    public aibo(java.lang.ref.ReferenceQueue referenceQueue, java.lang.Object obj, int i, aibu aibuVar) {
        super(referenceQueue, obj, i, aibuVar);
        this.a = Long.MAX_VALUE;
        aibi aibiVar = aibt.b;
        aiay aiayVar = aiay.a;
        this.b = aiayVar;
        this.c = aiayVar;
    }

    @Override // defpackage.aibm
    public final long c() {
        return this.a;
    }

    @Override // defpackage.aibm
    public final aibu g() {
        return this.b;
    }

    @Override // defpackage.aibm
    public final aibu i() {
        return this.c;
    }

    @Override // defpackage.aibm
    public final void m(aibu aibuVar) {
        this.b = aibuVar;
    }

    @Override // defpackage.aibm
    public final void o(aibu aibuVar) {
        this.c = aibuVar;
    }

    @Override // defpackage.aibm
    public final void q(long j) {
        this.a = j;
    }
}
