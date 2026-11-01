package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kgq implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ kgq(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v34, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r9v35, types: [java.lang.Object, krk] */
    /* JADX WARN: Type inference failed for: r9v36, types: [java.lang.Object, krk] */
    /* JADX WARN: Type inference failed for: r9v58, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v59, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v60, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v61, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v62, types: [ccp, java.lang.Object] */
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                android.content.Context context = ((defpackage.kmi) this.a).s.getContext();
                aooh.e(context, "getContext(...)");
                aooh.f(context, "context");
                return ((kgr) agab.aH(context, kgr.class)).oA();
            case 1:
                kew kewVar = (kew) this.a;
                return aosv.F(kewVar.c, 0, new defpackage.hqi(kewVar, (aoln) null, 9, (byte[]) null), 3);
            case 2:
                j$.util.Optional optionalG = ((defpackage.klc) this.a).j.g();
                aooh.e(optionalG, "getFeature(...)");
                return (defpackage.hgt) aooh.q(optionalG);
            case 3:
                aigf aigfVarK = ((defpackage.klc) this.a).l.k();
                aooh.e(aigfVarK, "get(...)");
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(ajsz.aL(aigfVarK.size()));
                for (java.util.Map.Entry entry : aigfVarK.entrySet()) {
                    linkedHashMap.put(entry.getKey(), (kfy) ((aoin) entry.getValue()).a());
                }
                return linkedHashMap;
            case 4:
                aihd aihdVarE = ((defpackage.klc) this.a).i.e();
                aooh.e(aihdVarE, "get(...)");
                return ajsz.bX(aihdVarE, new defpackage.hte(7));
            case 5:
                defpackage.kny knyVar = (defpackage.kny) this.a;
                java.util.Set setEntrySet = knyVar.c.k().entrySet();
                aooh.e(setEntrySet, "<get-entries>(...)");
                java.util.List listBX = ajsz.bX(setEntrySet, new defpackage.hte(8));
                java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listBX, 10));
                java.util.Iterator it = listBX.iterator();
                while (it.hasNext()) {
                    java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
                    aooh.d(value, "null cannot be cast to non-null type javax.inject.Provider<com.google.android.libraries.dialer.ui.viewbinder.ViewBinder<com.android.dialer.calllog.ui.CallIntegrationInfo, out com.android.dialer.calllog.ui.multibindingmenu.SectionLayoutResourceIdProvider, out kotlin.Any?>>");
                    arrayList.add((vqf) ((aoin) value).a());
                }
                if (arrayList.isEmpty()) {
                    defpackage.kny.a.b().l("com/android/dialer/calllog/ui/multibindingmenu/DropdownMenuViewPeer", "viewBinderGroupAdapter$<anonymous>", 42, "DropdownMenuViewPeer.kt").v("No ViewBinder is available to bind");
                    return null;
                }
                com.android.dialer.calllog.ui.multibindingmenu.DropdownMenuView dropdownMenuView = knyVar.b;
                android.content.Context context2 = dropdownMenuView.getContext();
                aooh.e(context2, "getContext(...)");
                return new vwb(arrayList, new defpackage.knx(new abye(dropdownMenuView, new afpl(context2, (byte[]) null), 0)));
            case 6:
                java.lang.Object obj = this.a;
                ((defpackage.krv) obj).c.o(rmx.qh);
                return aojh.a;
            case 7:
                this.a.a(new defpackage.krg(1));
                return aojh.a;
            case 8:
                this.a.a(new defpackage.krg(1));
                return aojh.a;
            case 9:
                ((ok) this.a).a();
                return aojh.a;
            case 10:
                defpackage.ksv ksvVar = (defpackage.ksv) this.a;
                if (ksvVar.i == 2) {
                    ksvVar.i = 3;
                    ksvVar.e.o(rmx.AR);
                    ksvVar.l.i((java.lang.String) null).b(mce.hV);
                }
                return aojh.a;
            case 11:
                defpackage.lon lonVar = (defpackage.lon) this.a;
                defpackage.lnx lnxVar = (defpackage.lnx) lonVar.a.a();
                lonVar.b = lnxVar;
                aooh.e(lnxVar, "let(...)");
                return lnxVar;
            case 12:
                java.util.EnumMap enumMap = new java.util.EnumMap(lzk.class);
                ailj ailjVarK = ((zzx) this.a).e().k();
                while (ailjVarK.hasNext()) {
                    kes kesVar = (kes) ailjVarK.next();
                    java.lang.Object objA = kesVar.a();
                    if (((kes) enumMap.put((java.lang.Enum) objA, kesVar)) != null) {
                        java.util.Objects.toString(objA);
                        throw new java.lang.IllegalStateException("Duplicate key for ".concat(objA.toString()));
                    }
                }
                return enumMap;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return new sso((android.content.Context) ((defpackage.ifb) this.a).a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.mba mbaVar = (defpackage.mba) this.a;
                return mbaVar.b.j(mbaVar.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return a.r((aomy) this.a);
            case 16:
                return a.r((aomy) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                this.a.a();
                return java.lang.Boolean.TRUE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                this.a.a();
                return java.lang.Boolean.TRUE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                a.E((ccp) this.a, false);
                return aojh.a;
            default:
                java.lang.Object obj2 = this.a;
                ((defpackage.mli) obj2).q.n(rmw.fY);
                return null;
        }
    }
}
