package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amda implements defpackage.alkc {
    private final /* synthetic */ int $cid;

    public amda(int i) {
        this.$cid = i;
    }

    @Override // defpackage.alkc
    public final j$.util.Optional a(defpackage.almy almyVar) {
        if (this.$cid != 0) {
            return j$.util.Optional.of(almyVar);
        }
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        return alnbVarB.equals(defpackage.alnb.EVENT_USER_ACTION) ? j$.util.Optional.of(defpackage.amcz.f(almyVar)) : j$.util.Optional.of(almyVar);
    }
}
