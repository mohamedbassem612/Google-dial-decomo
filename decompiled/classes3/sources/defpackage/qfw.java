package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qfw extends amzm {
    private final amzg b;
    private final amzg c;

    public qfw(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.qfw.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.qgo qgoVar;
        java.util.List list = (java.util.List) obj;
        zms zmsVar = (zms) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        akzx akzxVarM = defpackage.qgo.a.m();
        if (zBooleanValue) {
            akzxVarM.u();
            defpackage.qgo qgoVar2 = (defpackage.qgo) akzxVarM.b;
            qgoVar2.b |= 1;
            qgoVar2.c = true;
            int iOrdinal = zmsVar.a().ordinal();
            if (iOrdinal == 1) {
                akzxVarM.u();
                defpackage.qgo qgoVar3 = (defpackage.qgo) akzxVarM.b;
                qgoVar3.b |= 2;
                qgoVar3.d = 2131231931;
                akzxVarM.u();
                defpackage.qgo qgoVar4 = (defpackage.qgo) akzxVarM.b;
                qgoVar4.b |= 16;
                qgoVar4.g = true;
                akzxVarM.u();
                defpackage.qgo qgoVar5 = (defpackage.qgo) akzxVarM.b;
                qgoVar5.b |= 4;
                qgoVar5.e = 2132017465;
                if (zmsVar.d().isPresent()) {
                    j$.util.Optional optionalE = zmsVar.e((android.bluetooth.BluetoothDevice) zmsVar.d().orElseThrow());
                    j$.util.Objects.requireNonNull(akzxVarM);
                    defpackage.qbf qbfVar = new defpackage.qbf(akzxVarM, 8);
                    if (true == optionalE.isPresent()) {
                        java.lang.String str = (java.lang.String) optionalE.get();
                        akzx akzxVar = (akzx) qbfVar.a;
                        akzxVar.u();
                        defpackage.qgo qgoVar6 = (defpackage.qgo) akzxVar.b;
                        j$.util.Objects.requireNonNull(str);
                        qgoVar6.b |= 8;
                        qgoVar6.f = str;
                    }
                }
                qgoVar = (defpackage.qgo) akzxVarM.p();
            } else if (iOrdinal == 2) {
                akzxVarM.u();
                defpackage.qgo qgoVar7 = (defpackage.qgo) akzxVarM.b;
                qgoVar7.b |= 2;
                qgoVar7.d = 2131231958;
                akzxVarM.u();
                defpackage.qgo qgoVar8 = (defpackage.qgo) akzxVarM.b;
                qgoVar8.b |= 4;
                qgoVar8.e = 2132017466;
                akzxVarM.u();
                defpackage.qgo qgoVar9 = (defpackage.qgo) akzxVarM.b;
                qgoVar9.b |= 16;
                qgoVar9.g = true;
                qgoVar = (defpackage.qgo) akzxVarM.p();
            } else if (iOrdinal != 3) {
                akzxVarM.u();
                defpackage.qgo qgoVar10 = (defpackage.qgo) akzxVarM.b;
                qgoVar10.b |= 2;
                qgoVar10.d = 2131231058;
                akzxVarM.u();
                defpackage.qgo qgoVar11 = (defpackage.qgo) akzxVarM.b;
                qgoVar11.b |= 4;
                qgoVar11.e = 2132017467;
                akzxVarM.u();
                defpackage.qgo qgoVar12 = (defpackage.qgo) akzxVarM.b;
                qgoVar12.b |= 16;
                qgoVar12.g = false;
                qgoVar = (defpackage.qgo) akzxVarM.p();
            } else {
                akzxVarM.u();
                defpackage.qgo qgoVar13 = (defpackage.qgo) akzxVarM.b;
                qgoVar13.b |= 2;
                qgoVar13.d = 2131232007;
                akzxVarM.u();
                defpackage.qgo qgoVar14 = (defpackage.qgo) akzxVarM.b;
                qgoVar14.b |= 4;
                qgoVar14.e = 2132017470;
                akzxVarM.u();
                defpackage.qgo qgoVar15 = (defpackage.qgo) akzxVarM.b;
                qgoVar15.b |= 16;
                qgoVar15.g = true;
                qgoVar = (defpackage.qgo) akzxVarM.p();
            }
        } else {
            akzxVarM.u();
            defpackage.qgo qgoVar16 = (defpackage.qgo) akzxVarM.b;
            qgoVar16.b |= 1;
            qgoVar16.c = false;
            boolean z = zmsVar.a() == defpackage.zmw.ROUTE_SPEAKER;
            akzxVarM.u();
            defpackage.qgo qgoVar17 = (defpackage.qgo) akzxVarM.b;
            qgoVar17.b |= 16;
            qgoVar17.g = z;
            akzxVarM.u();
            defpackage.qgo qgoVar18 = (defpackage.qgo) akzxVarM.b;
            qgoVar18.b |= 4;
            qgoVar18.e = 2132019076;
            akzxVarM.u();
            defpackage.qgo qgoVar19 = (defpackage.qgo) akzxVarM.b;
            qgoVar19.b |= 2;
            qgoVar19.d = 2131232091;
            qgoVar = (defpackage.qgo) akzxVarM.p();
        }
        return aiql.z(qgoVar);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
