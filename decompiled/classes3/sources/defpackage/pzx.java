package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pzx extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public pzx(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new defpackage.amzw(defpackage.pzx.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        java.lang.String str = (java.lang.String) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(4)).booleanValue();
        j$.util.Optional optional2 = (j$.util.Optional) list.get(5);
        if (optional.isPresent()) {
            j$.util.Optional.empty();
            if (str == null) {
                throw new java.lang.NullPointerException("Null callId");
            }
            defpackage.pzp pzpVar = (defpackage.pzp) optional.orElseThrow();
            if (pzpVar == null) {
                throw new java.lang.NullPointerException("Null selectedScreenKey");
            }
            if (optional2 == null) {
                throw new java.lang.NullPointerException("Null outgoingCallRequestId");
            }
            optionalOf = j$.util.Optional.of(new defpackage.pzu(str, pzpVar, zBooleanValue, zBooleanValue2, zBooleanValue3, optional2));
        } else {
            optionalOf = j$.util.Optional.empty();
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
