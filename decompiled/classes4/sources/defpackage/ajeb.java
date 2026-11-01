package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ajeb implements defpackage.aohg {
    private final /* synthetic */ int $cid;

    public ajeb(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aohg
    public final /* synthetic */ aohh a(anmc anmcVar, anmb anmbVar) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.ajed(anmcVar, anmbVar);
        }
        if (i == 1) {
            return new defpackage.afcc(anmcVar, anmbVar);
        }
        if (i == 2) {
            return new defpackage.ajec(anmcVar, anmbVar);
        }
        if (i != 3) {
            return i != 4 ? new defpackage.anaq(anmcVar, anmbVar) : new defpackage.amjj(anmcVar, anmbVar);
        }
        return new defpackage.akmq(anmcVar, anmbVar);
    }
}
