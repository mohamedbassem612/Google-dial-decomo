package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoif extends defpackage.aoib {
    final /* synthetic */ defpackage.aoih f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoif(defpackage.aoih aoihVar, java.lang.Object obj, anod anodVar) {
        super(aoihVar, obj, anodVar);
        j$.util.Objects.requireNonNull(aoihVar);
        this.f = aoihVar;
    }

    @Override // defpackage.aoib
    protected final defpackage.aoia a() {
        return new defpackage.aoie(this);
    }
}
