package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aiah extends defpackage.aidc {
    final /* synthetic */ aiai a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiah(aiai aiaiVar, aibu aibuVar) {
        super(aibuVar);
        j$.util.Objects.requireNonNull(aiaiVar);
        this.a = aiaiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aidc
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        aiai aiaiVar = this.a;
        aibu aibuVarF = obj.f();
        if (aibuVarF == aiaiVar.a) {
            return null;
        }
        return aibuVarF;
    }
}
