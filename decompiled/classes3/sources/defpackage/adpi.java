package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class adpi extends defpackage.adpb {
    final /* synthetic */ defpackage.adpj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpi(defpackage.adpj adpjVar, j$.util.Optional optional) {
        super(optional);
        j$.util.Objects.requireNonNull(adpjVar);
        this.a = adpjVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adpd */
    @Override // defpackage.adpb, defpackage.adpf
    public final defpackage.afpl a(android.media.AudioFormat audioFormat) throws adpd {
        defpackage.afpl afplVarA = super.a(audioFormat);
        this.a.i();
        return afplVarA;
    }
}
