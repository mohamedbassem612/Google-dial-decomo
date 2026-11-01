package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aibq extends defpackage.aidc {
    final /* synthetic */ aibr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aibq(aibr aibrVar, aibu aibuVar) {
        super(aibuVar);
        j$.util.Objects.requireNonNull(aibrVar);
        this.a = aibrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aidc
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        aibr aibrVar = this.a;
        aibu aibuVarG = obj.g();
        if (aibuVarG == aibrVar.a) {
            return null;
        }
        return aibuVarG;
    }
}
