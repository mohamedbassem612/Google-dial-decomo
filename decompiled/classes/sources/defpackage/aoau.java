package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoau extends defpackage.anop {
    static final boolean a;
    public static final /* synthetic */ int b = 0;

    static {
        java.nio.charset.Charset charset = defpackage.anxo.a;
        a = defpackage.annb.a("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", true);
    }

    @Override // defpackage.anod
    public final anon a(anof anofVar) {
        return a ? new aoap(anofVar) : new aoat(anofVar);
    }

    @Override // defpackage.anop
    public final defpackage.anpr b(java.util.Map map) {
        try {
            java.lang.Boolean boolB = defpackage.aodc.b(map, "shuffleAddressList");
            return new defpackage.anpr(a ? new aoal(boolB) : new aoar(boolB));
        } catch (java.lang.RuntimeException e) {
            return new defpackage.anpr(defpackage.anqw.l.e(e).f("Failed parsing configuration for pick_first"));
        }
    }

    @Override // defpackage.anop
    public final java.lang.String c() {
        return "pick_first";
    }

    @Override // defpackage.anop
    public final void d() {
    }

    @Override // defpackage.anop
    public final void e() {
    }
}
