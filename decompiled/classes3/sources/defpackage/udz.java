package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class udz {
    public uip a;
    public uip b;
    public int e;
    private uip f;
    private final j$.util.Optional g = j$.util.Optional.empty();
    private j$.util.Optional h = j$.util.Optional.empty();
    public j$.util.Optional c = j$.util.Optional.empty();
    public j$.util.Optional d = j$.util.Optional.empty();

    public final defpackage.uea a() {
        uip uipVar;
        uip uipVar2;
        uip uipVar3;
        if (this.e != 0 && (uipVar = this.a) != null && (uipVar2 = this.b) != null && (uipVar3 = this.f) != null) {
            defpackage.uds udsVar = new defpackage.uds(1, uipVar, uipVar2, uipVar3, this.g, this.h, this.c, this.d);
            uip uipVar4 = udsVar.a;
            ahvr.bZ(uipVar4.k().g().isPresent(), "InAppSpamStatus must provide user spam list data");
            ahvr.bZ(uipVar4.k().b().isPresent(), "InAppSpamStatus must provide global spam list data");
            return udsVar;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.e == 0) {
            sb.append(" compositeSuspiciousStatus");
        }
        if (this.a == null) {
            sb.append(" inAppSpamStatus");
        }
        if (this.b == null) {
            sb.append(" stirShakenSpamStatus");
        }
        if (this.f == null) {
            sb.append(" patronusSpamStatus");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null alternativeSpamSolutionUsed");
        }
        this.h = optional;
    }

    public final void c(uip uipVar) {
        if (uipVar == null) {
            throw new java.lang.NullPointerException("Null patronusSpamStatus");
        }
        this.f = uipVar;
    }
}
