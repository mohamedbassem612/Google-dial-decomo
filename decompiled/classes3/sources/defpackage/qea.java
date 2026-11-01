package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qea extends amzm {
    private final amzg b;
    private final amzg c;
    private final amyz d;

    public qea(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amyz amyzVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.qea.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amyzVar3;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0069  */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = false;
        tkl tklVar = (tkl) list.get(0);
        tkl tklVar2 = (tkl) list.get(1);
        if (((java.lang.Boolean) this.d.a()).booleanValue()) {
            zBooleanValue = ((java.lang.Boolean) tklVar.e().orElse(java.lang.Boolean.FALSE)).booleanValue();
        } else if (((java.lang.Boolean) tklVar.e().orElse(java.lang.Boolean.FALSE)).booleanValue()) {
            zBooleanValue = true;
        } else {
            java.lang.Object objF = new mgf((mgu) tklVar2.a, ((android.os.PowerManager) tklVar2.c).isInteractive()).a(mgv.dZ).f();
            aooh.e(objF, "ifTrue(...)");
            if (!((java.lang.Boolean) objF).booleanValue()) {
                zBooleanValue = true;
            }
        }
        return aiql.z(java.lang.Boolean.valueOf(zBooleanValue));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
