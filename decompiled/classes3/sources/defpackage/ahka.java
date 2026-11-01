package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahka implements anme {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public ahka(gou gouVar, ahjz ahjzVar, int i) {
        this.$cid = i;
        this.a = ahjzVar;
        j$.util.Objects.requireNonNull(gouVar);
    }

    public final ajsz b(anpk anpkVar, anmb anmbVar, anmc anmcVar) {
        if (this.$cid != 0) {
            aooh.f(anmbVar, "callOptions");
            return new defpackage.tyo(anmcVar.b(anpkVar, anmbVar), (android.os.ParcelFileDescriptor) this.a);
        }
        anma anmaVar = defpackage.ajzu.a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        ahjz ahjzVar = (ahjz) this.a;
        sb.append(ahjzVar.a);
        sb.append(':');
        sb.append(ahjzVar.b);
        ajsz ajszVarB = anmcVar.b(anpkVar, anmbVar.e(anmaVar, sb.toString()));
        j$.util.Objects.requireNonNull(this);
        return new anne(ajszVarB);
    }

    public ahka(android.os.ParcelFileDescriptor parcelFileDescriptor, int i) {
        this.$cid = i;
        this.a = parcelFileDescriptor;
    }
}
