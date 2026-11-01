package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aohx implements defpackage.anqm {
    private final /* synthetic */ int $cid;
    public final amwp a;

    public aohx(amwp amwpVar, int i) {
        this.$cid = i;
        this.a = amwpVar;
    }

    @Override // defpackage.anqm
    public final defpackage.antw a(defpackage.anql anqlVar, anph anphVar) {
        defpackage.aohy aohyVarA;
        if (this.$cid == 0) {
            ahvr.bN(anqlVar.f().a.a(), "asyncUnaryRequestCall is only for clientSendsOneMessage methods");
            defpackage.aoht aohtVar = new defpackage.aoht(anqlVar, false);
            anqlVar.c(2);
            return new defpackage.aohw(this, aohtVar, anqlVar);
        }
        defpackage.aoht aohtVar2 = new defpackage.aoht(anqlVar, true);
        amwp amwpVar = this.a;
        int i = amwpVar.a;
        if (i == 5) {
            aohyVarA = ((defpackage.ahur) amwpVar.b).a(aohtVar2);
        } else {
            if (i != 6) {
                throw new java.lang.AssertionError();
            }
            defpackage.aoil.c(ahus.g(), aohtVar2);
            aohyVarA = new defpackage.aohu();
        }
        anqlVar.c(1);
        return new defpackage.aohv(this, aohyVarA, aohtVar2, anqlVar);
    }
}
