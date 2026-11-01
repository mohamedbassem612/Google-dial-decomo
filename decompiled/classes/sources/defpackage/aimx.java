package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aimx extends defpackage.aimv implements defpackage.aimw {
    final /* synthetic */ defpackage.aimz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aimx(defpackage.aimz aimzVar, java.util.logging.Level level) {
        super(level);
        j$.util.Objects.requireNonNull(aimzVar);
        this.a = aimzVar;
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
