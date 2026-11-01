package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amem implements defpackage.amel {
    private final /* synthetic */ int $cid;

    public amem(int i) {
        this.$cid = i;
    }

    @Override // defpackage.amel
    public final aify a(defpackage.amcp amcpVar, defpackage.altp altpVar) {
        if (this.$cid == 0) {
            return aike.a;
        }
        j$.util.stream.Stream stream = j$.util.Collection.-EL.stream((aify) amcpVar.d.get(defpackage.amco.b));
        j$.util.Objects.requireNonNull(altpVar);
        return (aify) stream.filter(new defpackage.amcc(altpVar, 17)).collect(aido.a);
    }
}
