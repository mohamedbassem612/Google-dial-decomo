package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pje extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public pje(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.pje.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        qbc qbcVar;
        qbc qbcVar2;
        qbc qbcVar3;
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        defpackage.spn spnVar = (defpackage.spn) list.get(0);
        mgu mguVar = (mgu) list.get(1);
        defpackage.qbe qbeVar = (defpackage.qbe) list.get(2);
        nwy nwyVar = spnVar.r;
        if (nwyVar == null) {
            nwyVar = nwy.a;
        }
        nwv nwvVarB = nwv.b(nwyVar.c);
        if (nwvVarB == null) {
            nwvVarB = nwv.f;
        }
        int iOrdinal = nwvVarB.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            qbcVar = qbc.eu;
        } else if (iOrdinal == 3) {
            qbcVar = qbc.ev;
        } else if (iOrdinal != 4) {
            qbcVar = qbc.et;
        } else {
            qbcVar = qbc.eu;
        }
        qbeVar.c(qbcVar);
        nwx nwxVarB = nwx.b(nwyVar.d);
        if (nwxVarB == null) {
            nwxVarB = nwx.d;
        }
        boolean z2 = nwyVar.g;
        int iOrdinal2 = nwxVarB.ordinal();
        if (iOrdinal2 == 1) {
            qbcVar2 = qbc.ex;
        } else if (iOrdinal2 != 2) {
            qbcVar2 = qbc.ew;
        } else {
            qbcVar2 = z2 ? qbc.ey : qbc.ez;
        }
        qbeVar.c(qbcVar2);
        int iAR = a.aR(nwyVar.f);
        if (iAR == 0) {
            iAR = 1;
        }
        int i = iAR - 2;
        if (i != 1) {
            qbcVar3 = i != 2 ? qbc.eA : qbc.eC;
        } else {
            qbcVar3 = qbc.eB;
        }
        qbeVar.c(qbcVar3);
        nwy nwyVar2 = spnVar.r;
        nwv nwvVarB2 = nwv.b((nwyVar2 == null ? nwy.a : nwyVar2).c);
        if (nwvVarB2 == null) {
            nwvVarB2 = nwv.f;
        }
        nwx nwxVarB2 = nwx.b((nwyVar2 == null ? nwy.a : nwyVar2).d);
        if (nwxVarB2 == null) {
            nwxVarB2 = nwx.d;
        }
        if (nwyVar2 == null) {
            nwyVar2 = nwy.a;
        }
        int iAR2 = a.aR(nwyVar2.f);
        if (iAR2 == 0) {
            iAR2 = 1;
        }
        if (nwvVarB2 == nwv.d && nwxVarB2 == nwx.c && iAR2 != 3) {
            z = true;
        }
        java.lang.Boolean bool = (java.lang.Boolean) new mgf(mguVar, z).a(mfy.ex).f();
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
