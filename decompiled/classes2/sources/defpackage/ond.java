package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ond extends amzm {
    private final amzg b;
    private final amzg c;

    public ond(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.ond.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x005c  */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        if (zBooleanValue) {
            ahvr.bN(optional.isPresent(), "No fides call state");
            if (optional.orElseThrow() == defpackage.aayy.ENCRYPTED) {
                akzx akzxVarM = defpackage.omz.a.m();
                akzxVarM.u();
                defpackage.omz omzVar = (defpackage.omz) akzxVarM.b;
                omzVar.b |= 1;
                omzVar.c = true;
                defpackage.omz omzVar2 = (defpackage.omz) akzxVarM.p();
                hgb.c(defpackage.onc.a.b(), "producing fides details", "com/android/dialer/fides/impl/FidesDetailsProducerModule", "produceFidesDetails", '&', "FidesDetailsProducerModule.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                optionalEmpty = j$.util.Optional.of(omzVar2);
            } else {
                optionalEmpty = j$.util.Optional.empty();
            }
        } else {
            optionalEmpty = j$.util.Optional.empty();
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
