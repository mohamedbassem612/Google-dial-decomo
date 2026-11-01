package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aibp extends defpackage.aiaf {
    defpackage.aibu a;
    defpackage.aibu b;

    public aibp(defpackage.aibr aibrVar) {
        j$.util.Objects.requireNonNull(aibrVar);
        this.a = this;
        this.b = this;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final long c() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final defpackage.aibu g() {
        return this.a;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final defpackage.aibu i() {
        return this.b;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final void m(defpackage.aibu aibuVar) {
        this.a = aibuVar;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final void o(defpackage.aibu aibuVar) {
        this.b = aibuVar;
    }

    @Override // defpackage.aiaf, defpackage.aibu
    public final void q(long j) {
    }
}
