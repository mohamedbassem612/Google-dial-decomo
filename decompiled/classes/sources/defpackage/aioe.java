package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aioe extends defpackage.aimv implements defpackage.aiob {
    final /* synthetic */ defpackage.aiof a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aioe(defpackage.aiof aiofVar, java.util.logging.Level level) {
        super(level);
        j$.util.Objects.requireNonNull(aiofVar);
        this.a = aiofVar;
    }

    @Override // defpackage.aine
    protected final /* synthetic */ defpackage.aimp c() {
        return this.a;
    }

    @Override // defpackage.aine
    protected final /* bridge */ /* synthetic */ defpackage.ainm d() {
        return this;
    }
}
