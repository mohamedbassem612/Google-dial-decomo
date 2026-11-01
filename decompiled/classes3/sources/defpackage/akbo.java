package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akbo implements anme {
    private final /* synthetic */ int $cid;
    private final defpackage.akbg a = new defpackage.akbg(new defpackage.agjd(4), new defpackage.agkh(15));

    public akbo(int i) {
        this.$cid = i;
    }

    public final ajsz b(anpk anpkVar, anmb anmbVar, anmc anmcVar) {
        if (this.$cid != 0) {
            aooh.f(anmbVar, "callOptions");
            return anmbVar.f(defpackage.ajzy.a) == null ? anmcVar.b(anpkVar, anmbVar) : this.a.b(anpkVar, anmbVar, anmcVar);
        }
        aooh.f(anmbVar, "callOptions");
        return this.a.b(anpkVar, anmbVar, anmcVar);
    }

    public akbo(int i, byte[] bArr) {
        this.$cid = i;
    }
}
