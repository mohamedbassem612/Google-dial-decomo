package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wmq extends amzm {
    private final amzg b;

    public wmq(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.wmq.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
        if (true == optionalOfNullable.isPresent()) {
            defpackage.whc whcVar = (defpackage.whc) optionalOfNullable.get();
            akzx akzxVarM = defpackage.wlf.a.m();
            akzxVarM.u();
            defpackage.wlf wlfVar = (defpackage.wlf) akzxVarM.b;
            j$.util.Objects.requireNonNull("BANNER");
            wlfVar.b |= 1;
            wlfVar.e = "BANNER";
            akzxVarM.u();
            defpackage.wlf wlfVar2 = (defpackage.wlf) akzxVarM.b;
            j$.util.Objects.requireNonNull(whcVar);
            wlfVar2.d = whcVar;
            wlfVar2.c = 3;
            optionalOfNullable = j$.util.Optional.ofNullable((defpackage.wlf) akzxVarM.p());
        }
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
