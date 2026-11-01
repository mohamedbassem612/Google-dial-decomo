package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aibc extends aibe {
    volatile long a;
    aibu b;
    aibu c;

    public aibc(java.lang.Object obj, int i, aibu aibuVar) {
        super(obj, i, aibuVar);
        this.a = Long.MAX_VALUE;
        aibi aibiVar = aibt.b;
        aiay aiayVar = aiay.a;
        this.b = aiayVar;
        this.c = aiayVar;
    }

    public final long b() {
        return this.a;
    }

    public final aibu f() {
        return this.b;
    }

    public final aibu h() {
        return this.c;
    }

    public final void k(long j) {
        this.a = j;
    }

    public final void l(aibu aibuVar) {
        this.b = aibuVar;
    }

    public final void n(aibu aibuVar) {
        this.c = aibuVar;
    }
}
