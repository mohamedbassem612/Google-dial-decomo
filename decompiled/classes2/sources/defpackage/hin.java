package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hin implements defpackage.hqu {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.hio a;

    public hin(defpackage.hio hioVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(hioVar);
        this.a = hioVar;
    }

    @Override // defpackage.hqu
    public final defpackage.hqv a(defpackage.tt ttVar, defpackage.hqw hqwVar, defpackage.hqs hqsVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.him himVar = this.a.a;
            return new defpackage.hqv(ttVar, hqwVar, hqsVar, (aoss) himVar.fh.a(), (gpd) himVar.fD.a(), (aolr) himVar.bn.a(), (apni) himVar.eY.a());
        }
        defpackage.hio hioVar = this.a;
        if (i != 1) {
            defpackage.him himVar2 = hioVar.a;
            return new defpackage.hqv(ttVar, hqwVar, hqsVar, (aoss) himVar2.fh.a(), (gpd) himVar2.fD.a(), (aolr) himVar2.bn.a(), (apni) himVar2.eY.a());
        }
        defpackage.him himVar3 = hioVar.a;
        return new defpackage.hqv(ttVar, hqwVar, hqsVar, (aoss) himVar3.fh.a(), (gpd) himVar3.fD.a(), (aolr) himVar3.bn.a(), (apni) himVar3.eY.a());
    }

    public hin(defpackage.hio hioVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(hioVar);
        this.a = hioVar;
    }

    public hin(defpackage.hio hioVar, int i, char[] cArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(hioVar);
        this.a = hioVar;
    }
}
