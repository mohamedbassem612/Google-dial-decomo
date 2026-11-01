package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hph implements defpackage.hqr {
    private final zpm a;
    private final gpd b;

    public hph(gpd gpdVar, zpm zpmVar) {
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(zpmVar, "callScopes");
        this.b = gpdVar;
        this.a = zpmVar;
    }

    @Override // defpackage.hqw
    public final defpackage.ze a() {
        defpackage.xl xlVar = new defpackage.xl();
        xlVar.c();
        return xlVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    @Override // defpackage.hqr
    public final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj, defpackage.tt ttVar, aoln aolnVar) {
        boolean z;
        defpackage.hpg hpgVar;
        androidx.car.app.model.CarIcon carIconA;
        java.lang.String string;
        int i;
        int i2;
        defpackage.hpj hpjVar = (defpackage.hpj) obj;
        defpackage.xl xlVar = new defpackage.xl();
        defpackage.xc xcVar = new defpackage.xc();
        xcVar.c(androidx.car.app.model.Action.BACK);
        xcVar.e(ttVar.getString(2132017458));
        xlVar.b(xcVar.a());
        defpackage.xi xiVar = new defpackage.xi();
        java.util.List<defpackage.hpk> list = hpjVar.a;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                if (((defpackage.hpk) it.next()).a == null && (i3 = i3 + 1) < 0) {
                    ajsz.bg();
                }
            }
            if (i3 > 1) {
                z = true;
            } else {
                z = false;
            }
        }
        int i4 = 0;
        for (defpackage.hpk hpkVar : list) {
            java.lang.String string2 = hpkVar.a;
            if (string2 == null) {
                i2 = i4 + 1;
                i = i2;
            } else {
                i = i4;
                i2 = 0;
            }
            if (string2 == null) {
                if (z) {
                    string2 = ttVar.getString(2132017465) + ' ' + i2;
                } else {
                    string2 = ttVar.getString(2132017465);
                    aooh.c(string2);
                }
            }
            defpackage.yh yhVar = new defpackage.yh();
            yhVar.d(defpackage.hhk.a(ttVar, 2131231321), 4);
            yhVar.f(string2);
            yhVar.a = true;
            if (hpkVar.b) {
                defpackage.vw vwVar = new defpackage.vw();
                vwVar.c(defpackage.hhk.a(ttVar, 2131231361));
                yhVar.b(vwVar.a());
            } else {
                yhVar.e(new defpackage.hpi(hpkVar.c, 0));
            }
            xiVar.b(yhVar.a());
            i4 = i;
        }
        java.util.List<defpackage.hpb> list2 = hpjVar.b;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list2, 10));
        for (defpackage.hpb hpbVar : list2) {
            defpackage.yh yhVar2 = new defpackage.yh();
            zmw zmwVar = hpbVar.a;
            int iOrdinal = zmwVar.ordinal();
            if (iOrdinal == 0) {
                carIconA = defpackage.hhk.a(ttVar, 2131231544);
            } else if (iOrdinal == 2) {
                carIconA = defpackage.hhk.a(ttVar, 2131231403);
            } else {
                if (iOrdinal != 3) {
                    throw new java.lang.AssertionError("Unexpected Audio Route");
                }
                carIconA = defpackage.hhk.a(ttVar, 2131231620);
            }
            yhVar2.d(carIconA, 4);
            int iOrdinal2 = zmwVar.ordinal();
            if (iOrdinal2 == 0) {
                string = ttVar.getString(2132017467);
                aooh.e(string, "getString(...)");
            } else if (iOrdinal2 == 2) {
                string = ttVar.getString(2132017466);
                aooh.e(string, "getString(...)");
            } else {
                if (iOrdinal2 != 3) {
                    throw new java.lang.AssertionError("Unexpected Audio Route");
                }
                string = ttVar.getString(2132017470);
                aooh.e(string, "getString(...)");
            }
            yhVar2.f(string);
            yhVar2.a = true;
            if (hpbVar.b) {
                defpackage.vw vwVar2 = new defpackage.vw();
                vwVar2.c(defpackage.hhk.a(ttVar, 2131231361));
                yhVar2.b(vwVar2.a());
            } else {
                yhVar2.e(new defpackage.hpi(hpbVar.c, 1));
            }
            arrayList.add(yhVar2.a());
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            xiVar.b((androidx.car.app.model.Row) it2.next());
        }
        xlVar.d(xiVar.a());
        androidx.car.app.model.ListTemplate listTemplateA = xlVar.a();
        gpd gpdVar = this.b;
        zpm zpmVar = this.a;
        j$.util.Optional optionalH = zpmVar.h();
        aooh.e(optionalH, "getPrimaryCallScope(...)");
        apqr apqrVar = (apqr) aooh.q(optionalH);
        qbe qbeVarCp = null;
        gpdVar.i((java.lang.String) (apqrVar != null ? apqrVar.b : null)).b(mce.gl);
        j$.util.Optional optionalH2 = zpmVar.h();
        aooh.e(optionalH2, "getPrimaryCallScope(...)");
        apqr apqrVar2 = (apqr) aooh.q(optionalH2);
        if (apqrVar2 != null && (hpgVar = (defpackage.hpg) apqrVar2.a(defpackage.hpg.class)) != null) {
            qbeVarCp = hpgVar.cp();
        }
        if (qbeVarCp != null) {
            qbeVarCp.c(qbc.mu);
        }
        return listTemplateA;
    }

    @Override // defpackage.hqw
    public final /* synthetic */ aoxh c(aoxh aoxhVar, defpackage.tt ttVar) {
        return defpackage.hhv.a(this, aoxhVar, ttVar);
    }
}
