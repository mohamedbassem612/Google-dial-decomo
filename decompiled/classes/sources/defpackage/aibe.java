package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
class aibe extends defpackage.aiaf {
    final java.lang.Object g;
    final int h;
    final defpackage.aibu i;
    volatile defpackage.aibi j = defpackage.aibt.b;

    public aibe(java.lang.Object obj, int i, defpackage.aibu aibuVar) {
        this.g = obj;
        this.h = i;
        this.i = aibuVar;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final int a() {
        return this.h;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final defpackage.aibi d() {
        return this.j;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final defpackage.aibu e() {
        return this.i;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final java.lang.Object j() {
        return this.g;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final void p(defpackage.aibi aibiVar) {
        this.j = aibiVar;
    }
}
