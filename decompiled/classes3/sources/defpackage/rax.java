package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rax extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public rax(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.rax.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.rcd rcdVarB;
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        defpackage.rce rceVar = (defpackage.rce) list.get(1);
        defpackage.rce rceVar2 = (defpackage.rce) list.get(2);
        if (zBooleanValue) {
            int i = rceVar.c;
            defpackage.rcd rcdVarB2 = defpackage.rcd.b(i);
            if (rcdVarB2 == null) {
                rcdVarB2 = defpackage.rcd.EMPTY;
            }
            if (rcdVarB2 != defpackage.rcd.MULTIBINDING_PROVIDED_FRAGMENT) {
                rcdVarB = defpackage.rcd.b(i);
                if (rcdVarB == null) {
                    rcdVarB = defpackage.rcd.EMPTY;
                }
                if (rcdVarB == defpackage.rcd.EMPTY) {
                    rceVar = rceVar2;
                }
            } else {
                defpackage.qtr qtrVarB = defpackage.qtr.b(rceVar.d);
                if (qtrVarB == null) {
                    qtrVarB = defpackage.qtr.BOTTOM_SHEET_FRAGMENT_KEY_NONE;
                }
                if (qtrVarB != defpackage.qtr.BOTTOM_SHEET_FRAGMENT_KEY_NONE) {
                    rcdVarB = defpackage.rcd.b(i);
                    if (rcdVarB == null) {
                        rcdVarB = defpackage.rcd.EMPTY;
                    }
                    if (rcdVarB == defpackage.rcd.EMPTY) {
                        rceVar = rceVar2;
                    }
                } else {
                    rceVar = rceVar2;
                }
            }
        } else {
            defpackage.rce rceVar3 = defpackage.rcf.a;
            rceVar = defpackage.rcf.a;
        }
        return aiql.z(rceVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
