package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aidu extends defpackage.aidx {
    final /* synthetic */ defpackage.aieb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aidu(defpackage.aieb aiebVar) {
        super(aiebVar);
        j$.util.Objects.requireNonNull(aiebVar);
        this.a = aiebVar;
    }

    @Override // defpackage.aidx
    public final /* bridge */ /* synthetic */ java.lang.Object a(int i) {
        return new aidz(this.a, i);
    }
}
