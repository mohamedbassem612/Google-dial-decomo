package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahpg implements defpackage.ahpn {
    private final /* synthetic */ int $cid;

    public ahpg(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahpn
    public final defpackage.ahpj a() {
        if (this.$cid == 0) {
            return defpackage.ahns.c(true);
        }
        defpackage.ahpe ahpeVar = (defpackage.ahpe) defpackage.ahns.d.get();
        defpackage.ahpj ahpjVar = ahpeVar.c;
        if (ahpjVar == null) {
            return defpackage.ahob.m(ahpeVar).b ? new defpackage.ahoi(ahpeVar) : defpackage.ahoo.a;
        }
        return ahpjVar;
    }
}
