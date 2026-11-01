package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qzj implements defpackage.quh {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public qzj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.quh
    public final void a(defpackage.qug qugVar, java.lang.String str) {
        if (this.$cid != 0) {
            aooh.f(qugVar, "voiceButtonKey");
            java.lang.Object obj = this.a;
            ahok ahokVarF = ((defpackage.qyb) obj).f.f(671, str);
            try {
                ahvr.i(new defpackage.rcv(qugVar), ((defpackage.qyb) obj).b);
                ajsz.ak(ahokVarF, (java.lang.Throwable) null);
                return;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(ahokVarF, th);
                    throw th2;
                }
            }
        }
        aooh.f(qugVar, "voiceButtonKey");
        java.lang.Object obj2 = this.a;
        ahok ahokVarF2 = ((defpackage.qzk) obj2).g.f(679, str);
        try {
            ahvr.i(new defpackage.rcv(qugVar), ((defpackage.qzk) obj2).e);
            ajsz.ak(ahokVarF2, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th3) {
            try {
                throw th3;
            } catch (java.lang.Throwable th4) {
                ajsz.ak(ahokVarF2, th3);
                throw th4;
            }
        }
    }
}
