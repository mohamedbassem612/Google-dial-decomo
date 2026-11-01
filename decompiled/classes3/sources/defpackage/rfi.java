package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rfi extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public rfi(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new defpackage.amzw(defpackage.rfi.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        java.lang.String str;
        defpackage.rev revVar;
        aify aifyVar;
        java.util.List list = (java.util.List) obj;
        java.lang.String str2 = (java.lang.String) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(2);
        aify aifyVar2 = (aify) list.get(3);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(4);
        defpackage.rfa rfaVar = (defpackage.rfa) list.get(5);
        if (!optional.isPresent() || aifyVar2.isEmpty()) {
            optionalEmpty = j$.util.Optional.empty();
        } else {
            defpackage.rfc rfcVar = new defpackage.rfc();
            if (str2 == null) {
                throw new java.lang.NullPointerException("Null callId");
            }
            rfcVar.a = str2;
            rfcVar.b = zBooleanValue;
            rfcVar.g = (byte) (rfcVar.g | 1);
            defpackage.rev revVar2 = (defpackage.rev) optional.orElseThrow();
            if (revVar2 == null) {
                throw new java.lang.NullPointerException("Null promoTextKey");
            }
            rfcVar.c = revVar2;
            if (aifyVar2 == null) {
                throw new java.lang.NullPointerException("Null activationChips");
            }
            rfcVar.d = aifyVar2;
            rfcVar.e = rfaVar.c.get();
            rfcVar.g = (byte) (rfcVar.g | 2);
            rfcVar.a(j$.util.Optional.empty());
            j$.util.Optional optionalA = rfaVar.a();
            defpackage.qgz qgzVar = new defpackage.qgz(rfcVar, optional2, 8);
            if (true == optionalA.isPresent()) {
                java.lang.Object obj2 = optionalA.get();
                java.lang.Object obj3 = qgzVar.b;
                java.lang.Object obj4 = qgzVar.a;
                if (((defpackage.rex) obj2) == defpackage.rex.a) {
                    ((defpackage.rfc) obj3).a((j$.util.Optional) obj4);
                }
            }
            if (rfcVar.g != 3 || (str = rfcVar.a) == null || (revVar = rfcVar.c) == null || (aifyVar = rfcVar.d) == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (rfcVar.a == null) {
                    sb.append(" callId");
                }
                if ((rfcVar.g & 1) == 0) {
                    sb.append(" showPreviewLabel");
                }
                if (rfcVar.c == null) {
                    sb.append(" promoTextKey");
                }
                if (rfcVar.d == null) {
                    sb.append(" activationChips");
                }
                if ((rfcVar.g & 2) == 0) {
                    sb.append(" shouldEnableActivationChips");
                }
                throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            optionalEmpty = j$.util.Optional.of(new defpackage.rfd(str, rfcVar.b, revVar, aifyVar, rfcVar.e, rfcVar.f));
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
