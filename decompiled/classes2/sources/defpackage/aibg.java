package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aibg extends aibe {
    volatile long a;
    aibu b;
    aibu c;

    public aibg(java.lang.Object obj, int i, aibu aibuVar) {
        super(obj, i, aibuVar);
        this.a = Long.MAX_VALUE;
        aibi aibiVar = aibt.b;
        aiay aiayVar = aiay.a;
        this.b = aiayVar;
        this.c = aiayVar;
    }

    public final long c() {
        return this.a;
    }

    public final aibu g() {
        return this.b;
    }

    public final aibu i() {
        return this.c;
    }

    public final void m(aibu aibuVar) {
        this.b = aibuVar;
    }

    public final void o(aibu aibuVar) {
        this.c = aibuVar;
    }

    public final void q(long j) {
        this.a = j;
    }
}
