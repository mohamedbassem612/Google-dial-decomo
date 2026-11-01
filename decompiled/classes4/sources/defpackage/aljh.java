package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aljh implements defpackage.aliu {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public aljh(defpackage.aliz alizVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(alizVar);
        this.a = alizVar;
    }

    @Override // defpackage.aliu
    public final void a(defpackage.aljk aljkVar) {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            j$.util.Optional optional = ((defpackage.aliz) obj).b;
            defpackage.akxd akxdVar = new defpackage.akxd(aljkVar, 4);
            if (true == optional.isPresent()) {
                ((aprf) optional.get()).d((defpackage.aljk) akxdVar.a);
                return;
            }
            return;
        }
        j$.util.Optional optional2 = ((defpackage.alji) obj).c;
        defpackage.akxd akxdVar2 = new defpackage.akxd(aljkVar, 6);
        if (true == optional2.isPresent()) {
            ((aprf) optional2.get()).d((defpackage.aljk) akxdVar2.a);
        }
    }

    public aljh(defpackage.alji aljiVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aljiVar);
        this.a = aljiVar;
    }
}
