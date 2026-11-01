package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class dpz implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ dpz(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56, types: [aoub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [cmw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v59, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v62, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v69, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v75, types: [gov, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13, types: [drr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v23, types: [emx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [emx, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) throws java.lang.Exception {
        android.view.WindowInsets windowInsetsE;
        fwc fwcVar;
        fwc fwcVarC;
        defpackage.ems emsVarP;
        defpackage.gab gabVar;
        defpackage.gab gabVarA;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.b;
                java.lang.Object obj3 = this.a;
                dqe.b((android.view.View) obj3, (defpackage.dbk) obj2);
                dqc dqcVar = (dqc) obj3;
                dqcVar.d.L();
                android.view.View view = dqcVar.c;
                int[] iArr = dqcVar.o;
                int i = iArr[0];
                int i2 = iArr[1];
                view.getLocationOnScreen(iArr);
                long j = dqcVar.p;
                long jH = ((defpackage.cxi) obj).h();
                dqcVar.p = jH;
                defpackage.eax eaxVar = dqcVar.q;
                if (eaxVar != null && ((i != iArr[0] || i2 != iArr[1] || !defpackage.anty.ah(j, jH)) && (windowInsetsE = dqcVar.j(eaxVar).e()) != null)) {
                    view.dispatchApplyWindowInsets(windowInsetsE);
                }
                return defpackage.aojh.a;
            case 1:
                defpackage.dij dijVar = (defpackage.dij) obj;
                defpackage.ajwz ajwzVar = (defpackage.ajwz) ((defpackage.aco) this.a).a(dijVar.c);
                if (ajwzVar != null && ajwzVar.a) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(wt.g(dijVar, (android.content.res.Resources) this.b, z));
            case 2:
                ((defpackage.dbk) this.a).ad(((defpackage.cmw) obj).a(this.b));
                return defpackage.aojh.a;
            case 3:
                defpackage.dcv dcvVar = (defpackage.dcv) obj;
                defpackage.deg degVar = dcvVar instanceof defpackage.deg ? (defpackage.deg) dcvVar : null;
                java.lang.Object obj4 = this.a;
                if (degVar != null) {
                    dey deyVarAd = degVar.ad();
                    if (deyVarAd == null) {
                        defpackage.aooh.g();
                    }
                    java.lang.Object obj5 = this.b;
                    deyVarAd.a.put(obj4, obj5);
                    android.view.View view2 = (android.view.View) obj4;
                    deyVarAd.addView(view2);
                    deyVarAd.b.put(obj5, obj4);
                    ((dqc) obj4).setImportantForAccessibility(1);
                    deb debVar = new deb(degVar, (defpackage.dbk) obj5, degVar, deyVarAd);
                    defpackage.dzs.l(view2);
                    view2.setAccessibilityDelegate(debVar.A);
                }
                dqc dqcVar2 = (dqc) obj4;
                android.view.View view3 = dqcVar2.c;
                if (view3.getParent() != obj4) {
                    dqcVar2.addView(view3);
                }
                return defpackage.aojh.a;
            case 4:
                dqe.b((android.view.View) this.a, (defpackage.dbk) this.b);
                return defpackage.aojh.a;
            case 5:
                defpackage.cbd cbdVar = dra.a;
                ?? r12 = this.a;
                drq drqVar = (drq) this.b;
                drqVar.e = r12;
                drqVar.n();
                return new dqz(0);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                defpackage.aooh.f(entry, "<destruct>");
                defpackage.emw emwVar = (defpackage.emw) entry.getKey();
                defpackage.ajxw ajxwVar = (defpackage.ajxw) entry.getValue();
                while (true) {
                    defpackage.emy emyVar = (defpackage.emy) this.a;
                    if (((defpackage.emq) ajxwVar.c).compareTo(emyVar.d) <= 0 || emyVar.b || !emyVar.e.f(emwVar)) {
                        return defpackage.aojh.a;
                    }
                    defpackage.emo emoVar = defpackage.emp.Companion;
                    defpackage.emp empVarA = defpackage.emo.a((defpackage.emq) ajxwVar.c);
                    if (empVarA == null) {
                        java.lang.Object obj6 = ajxwVar.c;
                        java.util.Objects.toString(obj6);
                        throw new java.lang.IllegalStateException("no event down from ".concat(java.lang.String.valueOf(obj6)));
                    }
                    ?? r3 = this.b;
                    java.util.List list = emyVar.c;
                    list.add(empVarA.a());
                    ajxwVar.e(r3, empVarA);
                    defpackage.ajsz.bx(list);
                }
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.eos eosVar = (defpackage.eos) obj;
                defpackage.aooh.f(eosVar, "$this$CreationExtras");
                defpackage.enw enwVar = (defpackage.enw) this.b;
                eosVar.b(defpackage.env.a, enwVar.a);
                eosVar.b(defpackage.env.b, enwVar.b);
                eosVar.b(defpackage.eog.a, this.a);
                android.os.Bundle bundle = enwVar.c;
                if (bundle != null) {
                    eosVar.b(defpackage.env.c, bundle);
                }
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                fwk fwkVar = (fwk) obj;
                defpackage.aooh.f(fwkVar, "$this$navOptions");
                fvt fvtVar = new fvt(1);
                gnu gnuVar = new gnu((byte[]) null);
                fvtVar.a(gnuVar);
                fwi fwiVar = fwkVar.a;
                fwiVar.c = gnuVar.b;
                fwiVar.d = gnuVar.a;
                fwiVar.e = -1;
                fwiVar.f = -1;
                java.lang.Object obj7 = this.a;
                if (obj7 instanceof fwe) {
                    java.util.Iterator itA = hgt.Y((fwc) obj7).a();
                    do {
                        java.lang.Object obj8 = this.b;
                        if (itA.hasNext()) {
                            fwcVar = (fwc) itA.next();
                            fwcVarC = ((fvx) obj8).c();
                        } else {
                            int i3 = fwe.g;
                            int iB = hgt.W(((fvx) obj8).d()).b();
                            fvt fvtVar2 = new fvt(0);
                            fwkVar.d = iB;
                            fwkVar.e = false;
                            agze agzeVar = new agze((byte[]) null);
                            fvtVar2.a(agzeVar);
                            fwkVar.e = false;
                            fwkVar.f = agzeVar.a;
                        }
                    } while (!defpackage.aooh.n(fwcVar, fwcVarC != null ? fwcVarC.c : null));
                }
                return defpackage.aojh.a;
            case 9:
                java.lang.Object obj9 = this.b;
                ((defpackage.fxy) this.a).e((defpackage.fya) obj9);
                return new ali(obj9, 9);
            case 10:
                ?? r13 = this.b;
                if (r13 == 0) {
                    defpackage.aooh.i("owner");
                    defpackage.aooh.i("owner");
                }
                fxr fxrVar = ((fvx) this.a).b;
                if (r13 == 0) {
                    defpackage.aooh.i("owner");
                }
                if (!defpackage.aooh.n(r13, fxrVar.j)) {
                    defpackage.emx emxVar = fxrVar.j;
                    if (emxVar != null && (emsVarP = emxVar.P()) != null) {
                        emsVarP.d(fxrVar.l);
                    }
                    fxrVar.j = r13;
                    r13.P().c(fxrVar.l);
                }
                return new dqz(3);
            case 11:
                return new defpackage.oc(this.b, this.a, 10, null);
            case 12:
                defpackage.fzd fzdVar = (defpackage.fzd) obj;
                if (fzdVar == null || (gabVar = fzdVar.d) == null) {
                    gabVar = defpackage.gab.a;
                }
                java.lang.Object obj10 = this.b;
                java.lang.Object obj11 = this.a;
                defpackage.aooh.f(obj11, "loadType");
                int iOrdinal = ((defpackage.gac) obj11).ordinal();
                if (iOrdinal == 0) {
                    gabVarA = defpackage.gab.a(gabVar, (defpackage.gaa) obj10, null, null, 6);
                } else if (iOrdinal == 1) {
                    gabVarA = defpackage.gab.a(gabVar, null, (defpackage.gaa) obj10, null, 5);
                } else {
                    if (iOrdinal != 2) {
                        throw new defpackage.aois();
                    }
                    gabVarA = defpackage.gab.a(gabVar, null, null, (defpackage.gaa) obj10, 3);
                }
                return defpackage.dzn.n(gabVarA);
            case 13:
                java.lang.Object objH = ((defpackage.gat) this.b).h(((java.lang.Integer) obj).intValue());
                return objH == null ? gdv.a : this.a.a(objH);
            case 14:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                java.lang.Object objH2 = ((defpackage.gat) this.b).h(iIntValue);
                return objH2 == null ? new androidx.paging.compose.PagingPlaceholderKey(iIntValue) : this.a.a(objH2);
            case 15:
                defpackage.gip gipVar = (defpackage.gip) obj;
                defpackage.aooh.f(gipVar, "db");
                return java.lang.Integer.valueOf(gipVar.q((android.content.ContentValues) this.b, (java.lang.Object[]) this.a));
            case 16:
                defpackage.gip gipVar2 = (defpackage.gip) obj;
                defpackage.aooh.f(gipVar2, "db");
                ghl ghlVar = (ghl) this.b;
                defpackage.giw giwVarC = gipVar2.c(ghlVar.a);
                int length = ghlVar.b.length;
                for (int i4 = 1; i4 < length; i4++) {
                    int i5 = ghlVar.b[i4];
                    if (i5 == 1) {
                        giwVarC.c(i4, ghlVar.c[i4]);
                    } else if (i5 == 2) {
                        giwVarC.b(i4, ghlVar.d[i4]);
                    } else if (i5 == 3) {
                        java.lang.String str = ghlVar.e[i4];
                        defpackage.aooh.c(str);
                        giwVarC.e(i4, str);
                    } else if (i5 == 4) {
                        byte[] bArr = ghlVar.f[i4];
                        defpackage.aooh.c(bArr);
                        giwVarC.a(i4, bArr);
                    } else if (i5 == 5) {
                        giwVarC.d(i4);
                    }
                }
                return this.a.a(giwVarC);
            case 17:
                android.view.WindowMetrics windowMetricsM = baa$.ExternalSyntheticApiModelOutline1.m(obj);
                defpackage.aooh.f(windowMetricsM, "windowMetrics");
                return java.lang.Boolean.valueOf(((defpackage.gpt) this.a).b((android.content.Context) this.b, windowMetricsM));
            case 18:
                java.util.List list2 = (java.util.List) obj;
                defpackage.aooh.f(list2, "values");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj12 : list2) {
                    if (ddz$.ExternalSyntheticApiModelOutline0.m(obj12)) {
                        arrayList.add(obj12);
                    }
                }
                this.a.a(((defpackage.goe) ((defpackage.gou) this.b).b).d(arrayList));
                return defpackage.aojh.a;
            case 19:
                this.b.s(null);
                ((defpackage.aowj) this.a).b((hgt) obj);
                return defpackage.aojh.a;
            default:
                defpackage.gjh gjhVar = (defpackage.gjh) obj;
                defpackage.aooh.f(gjhVar, "_connection");
                ((defpackage.gwq) this.a).a.e(gjhVar, this.b);
                return defpackage.aojh.a;
        }
    }

    public /* synthetic */ dpz(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
