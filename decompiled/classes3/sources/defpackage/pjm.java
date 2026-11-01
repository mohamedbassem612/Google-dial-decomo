package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pjm extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public pjm(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.pjm.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        ajcq ajcqVarH;
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        java.lang.String str = (java.lang.String) list.get(1);
        ahbv ahbvVar = (ahbv) list.get(2);
        ajct ajctVar = (ajct) list.get(3);
        ahoq ahoqVarW = ahvr.W(486, "CallInfoProducerModule.produceDialerPhoneNumber");
        try {
            java.lang.String str2 = (java.lang.String) optional.orElse((java.lang.Object) null);
            if (str2 == null) {
                ajcqVarH = aiql.z(j$.util.Optional.empty());
            } else {
                ajcqVarH = ahvr.H(ahbvVar.v(str2, str), new onp(17), ajctVar);
                ahoqVarW.a(ajcqVarH);
            }
            ahoqVarW.close();
            return ajcqVarH;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
