package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nuz {
    private static final aimz a = aimz.i("com/android/dialer/dobby/impl/wear/bam/synctowear/BamDfpMessageSender");
    private final afpl b;

    public nuz(afpl afplVar) {
        this.b = afplVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(zkq zkqVar, aoln aolnVar) {
        defpackage.nuy nuyVar;
        if (aolnVar instanceof defpackage.nuy) {
            nuyVar = (defpackage.nuy) aolnVar;
            int i = nuyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nuyVar.c = i - Integer.MIN_VALUE;
            } else {
                nuyVar = new defpackage.nuy(this, aolnVar);
            }
        } else {
            nuyVar = new defpackage.nuy(this, aolnVar);
        }
        java.lang.Object objAe = nuyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nuyVar.c;
        if (i2 == 0) {
            aooc.af(objAe);
            a.b().l("com/android/dialer/dobby/impl/wear/bam/synctowear/BamDfpMessageSender", "sendMessage", 17, "BamDfpMessageSender.kt").y("Sending message: %s", zkqVar);
            afpl afplVar = this.b;
            zoe zoeVarCo = aehj.co(zki.a.m());
            zoeVarCo.k();
            zoe zoeVarCn = aehj.cn(zkh.a.m());
            aooh.f(zkqVar, "value");
            akzx akzxVar = (akzx) zoeVarCn.a;
            akzxVar.u();
            zkh zkhVar = akzxVar.b;
            j$.util.Objects.requireNonNull(zkqVar);
            zkhVar.c = zkqVar;
            zkhVar.b = 1;
            zoeVarCo.j(zoeVarCn.h());
            zki zkiVarI = zoeVarCo.i();
            nuyVar.c = 1;
            objAe = afplVar.ae(zkiVarI, nuyVar);
            if (objAe == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAe);
        }
        zke zkeVar = (zke) ajsz.bE((java.util.List) objAe);
        a.b().l("com/android/dialer/dobby/impl/wear/bam/synctowear/BamDfpMessageSender", "sendMessage", 26, "BamDfpMessageSender.kt").y("Message sent status: %s", zkeVar);
        return zkeVar;
    }
}
