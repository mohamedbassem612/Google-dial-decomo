package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class kxd implements defpackage.iov {
    private final /* synthetic */ int $cid;

    @Override // defpackage.iov
    public final void a(defpackage.ipc ipcVar, defpackage.albh albhVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.kwy kwyVar = (defpackage.kwy) albhVar;
            defpackage.aooh.f(kwyVar, "value");
            defpackage.akzx akzxVar = (defpackage.akzx) ipcVar.a;
            akzxVar.u();
            defpackage.ipb ipbVar = (defpackage.ipb) akzxVar.b;
            defpackage.ipb ipbVar2 = defpackage.ipb.a;
            j$.util.Objects.requireNonNull(kwyVar);
            ipbVar.f = kwyVar;
            ipbVar.b |= 8;
            return;
        }
        if (i == 1) {
            defpackage.jbr jbrVar = (defpackage.jbr) albhVar;
            defpackage.aooh.f(ipcVar, "$this$BackupAccessor");
            defpackage.aooh.f(jbrVar, "it");
            defpackage.aooh.f(jbrVar, "value");
            defpackage.akzx akzxVar2 = (defpackage.akzx) ipcVar.a;
            akzxVar2.u();
            defpackage.ipb ipbVar3 = (defpackage.ipb) akzxVar2.b;
            defpackage.ipb ipbVar4 = defpackage.ipb.a;
            j$.util.Objects.requireNonNull(jbrVar);
            ipbVar3.l = jbrVar;
            ipbVar3.b |= 512;
            return;
        }
        if (i != 2) {
            defpackage.tru truVar = (defpackage.tru) albhVar;
            defpackage.aooh.f(ipcVar, "$this$BackupAccessor");
            defpackage.aooh.f(truVar, "it");
            defpackage.aooh.f(truVar, "value");
            defpackage.akzx akzxVar3 = (defpackage.akzx) ipcVar.a;
            akzxVar3.u();
            defpackage.ipb ipbVar5 = (defpackage.ipb) akzxVar3.b;
            defpackage.ipb ipbVar6 = defpackage.ipb.a;
            j$.util.Objects.requireNonNull(truVar);
            ipbVar5.k = truVar;
            ipbVar5.b |= 256;
            return;
        }
        defpackage.nok nokVar = (defpackage.nok) albhVar;
        defpackage.aooh.f(ipcVar, "$this$BackupAccessor");
        defpackage.aooh.f(nokVar, "it");
        defpackage.aooh.f(nokVar, "value");
        defpackage.akzx akzxVar4 = (defpackage.akzx) ipcVar.a;
        akzxVar4.u();
        defpackage.ipb ipbVar7 = (defpackage.ipb) akzxVar4.b;
        defpackage.ipb ipbVar8 = defpackage.ipb.a;
        j$.util.Objects.requireNonNull(nokVar);
        ipbVar7.d = nokVar;
        ipbVar7.b |= 2;
    }
}
