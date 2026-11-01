package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wbm {
    private static final aimz a = aimz.i("com/android/dialer/wear/echo/impl/relay/impl/EchoRelayDfpMessageSender");
    private final defpackage.afpl b;

    public wbm(defpackage.afpl afplVar) {
        this.b = afplVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.zkz zkzVar, aoln aolnVar) {
        defpackage.wbl wblVar;
        if (aolnVar instanceof defpackage.wbl) {
            wblVar = (defpackage.wbl) aolnVar;
            int i = wblVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wblVar.c = i - Integer.MIN_VALUE;
            } else {
                wblVar = new defpackage.wbl(this, aolnVar);
            }
        } else {
            wblVar = new defpackage.wbl(this, aolnVar);
        }
        java.lang.Object objAe = wblVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wblVar.c;
        if (i2 == 0) {
            aooc.af(objAe);
            a.b().l("com/android/dialer/wear/echo/impl/relay/impl/EchoRelayDfpMessageSender", "sendMessage", 17, "EchoRelayDfpMessageSender.kt").y("Sending message: %s", zkzVar);
            defpackage.afpl afplVar = this.b;
            defpackage.zoe zoeVarCo = aehj.co(defpackage.zki.a.m());
            zoeVarCo.k();
            defpackage.zoe zoeVarCn = aehj.cn(defpackage.zkh.a.m());
            aooh.f(zkzVar, "value");
            akzx akzxVar = (akzx) zoeVarCn.a;
            akzxVar.u();
            defpackage.zkh zkhVar = (defpackage.zkh) akzxVar.b;
            j$.util.Objects.requireNonNull(zkzVar);
            zkhVar.c = zkzVar;
            zkhVar.b = 3;
            zoeVarCo.j(zoeVarCn.h());
            defpackage.zki zkiVarI = zoeVarCo.i();
            wblVar.c = 1;
            objAe = afplVar.ae(zkiVarI, wblVar);
            if (objAe == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAe);
        }
        defpackage.zke zkeVar = (defpackage.zke) ajsz.bE((java.util.List) objAe);
        a.b().l("com/android/dialer/wear/echo/impl/relay/impl/EchoRelayDfpMessageSender", "sendMessage", 25, "EchoRelayDfpMessageSender.kt").y("Message sent status: %s", zkeVar);
        return zkeVar;
    }
}
