package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class jza implements defpackage.aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jza(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [aoin, java.lang.Object] */
    @Override // defpackage.aomy
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                defpackage.kgz kgzVarF = ((defpackage.jzj) this.a).f();
                return java.lang.Boolean.valueOf(kgzVarF != null && kgzVarF.d);
            case 1:
                return (java.lang.Boolean) this.a.a();
            case 2:
                defpackage.jzr jzrVar = (defpackage.jzr) this.a;
                defpackage.jzt jztVar = new defpackage.jzt((java.util.List) jzrVar.h.c(), (defpackage.kal) ((defpackage.hia) jzrVar.i.a).a.a.jn.a());
                jzrVar.f = jztVar;
                return jztVar;
            case 3:
                j$.util.Optional optionalG = ((defpackage.zjm) this.a).g();
                defpackage.aooh.e(optionalG, "getFeature(...)");
                if (optionalG == null) {
                    defpackage.aooh.i("<this>");
                }
                return (defpackage.aogc) optionalG.orElse((java.lang.Object) null);
            case 4:
                j$.util.Optional optionalG2 = ((defpackage.zjm) this.a).g();
                defpackage.aooh.e(optionalG2, "getFeature(...)");
                if (optionalG2 == null) {
                    defpackage.aooh.i("<this>");
                }
                return (defpackage.zzx) optionalG2.orElse((java.lang.Object) null);
            case 5:
                j$.util.Optional optionalG3 = ((defpackage.kag) this.a).d.g();
                defpackage.aooh.e(optionalG3, "getFeature(...)");
                return (defpackage.kgz) defpackage.aooh.q(optionalG3);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                j$.util.Optional optionalG4 = ((defpackage.kai) this.a).d.g();
                defpackage.aooh.e(optionalG4, "getFeature(...)");
                return (defpackage.kgz) defpackage.aooh.q(optionalG4);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                j$.util.Optional optionalG5 = ((defpackage.kal) this.a).h.g();
                defpackage.aooh.e(optionalG5, "getFeature(...)");
                return (defpackage.kgz) defpackage.aooh.q(optionalG5);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aigf aigfVarK = ((defpackage.zzx) this.a).k();
                defpackage.aooh.e(aigfVarK, "get(...)");
                java.util.List listBX = defpackage.ajsz.bX(defpackage.ajsz.aW(aigfVarK), new hte(4));
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(listBX, 10));
                java.util.Iterator it = listBX.iterator();
                while (it.hasNext()) {
                    arrayList.add((defpackage.kif) ((defpackage.aoin) ((defpackage.aoiu) it.next()).b).a());
                }
                return arrayList;
            case 9:
                defpackage.aigf aigfVarK2 = ((defpackage.zzx) this.a).k();
                defpackage.aooh.e(aigfVarK2, "get(...)");
                java.util.List<defpackage.aoiu> listBX2 = defpackage.ajsz.bX(defpackage.ajsz.aW(aigfVarK2), new hte(3));
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(listBX2, 10));
                for (defpackage.aoiu aoiuVar : listBX2) {
                    arrayList2.add(new defpackage.aoiu((jyf) aoiuVar.a, ((defpackage.aoin) aoiuVar.b).a()));
                }
                return arrayList2;
            case 10:
                defpackage.aihd aihdVarE = ((defpackage.kdw) this.a).j.e();
                defpackage.aooh.e(aihdVarE, "get(...)");
                java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.ajsz.bl(aihdVarE, 10));
                java.util.Iterator<E> it2 = aihdVarE.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new defpackage.aoiu((defpackage.abwm) it2.next(), new defpackage.ahda((byte[]) null)));
                }
                return arrayList3;
            case 11:
                return ((defpackage.zzx) this.a).e();
            case 12:
                return ((defpackage.zzx) this.a).e();
            case 13:
                return ((defpackage.zzx) this.a).e();
            case 14:
                java.util.EnumMap enumMap = new java.util.EnumMap(defpackage.ken.class);
                defpackage.ailj it3 = ((defpackage.zzx) this.a).e().iterator();
                while (it3.hasNext()) {
                    defpackage.kes kesVar = (defpackage.kes) it3.next();
                    java.lang.Object objA = kesVar.a();
                    if (((defpackage.kes) enumMap.put((java.lang.Enum) objA, kesVar)) != null) {
                        java.util.Objects.toString(objA);
                        throw new java.lang.IllegalStateException("Duplicate key for ".concat(objA.toString()));
                    }
                }
                return enumMap;
            case 15:
                defpackage.aimz aimzVar = defpackage.kfm.a;
                j$.util.Optional optionalG6 = ((defpackage.zjm) this.a).g();
                defpackage.aooh.e(optionalG6, "getFeature(...)");
                if (optionalG6 == null) {
                    defpackage.aooh.i("<this>");
                }
                return (defpackage.kgz) optionalG6.orElse((java.lang.Object) null);
            case 16:
                android.net.Uri.Builder builderAppendQueryParameter = android.provider.CallLog.Calls.CONTENT_URI.buildUpon().appendQueryParameter("limit", "999");
                if (((java.lang.Boolean) ((defpackage.kfm) this.a).f.a()).booleanValue()) {
                    builderAppendQueryParameter.appendQueryParameter("include_voip_calls", "true");
                }
                return builderAppendQueryParameter.build();
            case 17:
                android.net.Uri.Builder builderAppendQueryParameter2 = android.provider.CallLog.Calls.CONTENT_URI.buildUpon().appendQueryParameter("limit", "1");
                if (((java.lang.Boolean) ((defpackage.kfm) this.a).f.a()).booleanValue()) {
                    builderAppendQueryParameter2.appendQueryParameter("include_voip_calls", "true");
                }
                return builderAppendQueryParameter2.build();
            case 18:
                java.lang.String[] strArr = {"_id", "date", "last_modified", "number", "presentation", "type", "countryiso", "duration", "data_usage", "is_read", "new", "subscription_component_name", "subscription_id", "features", "post_dial_digits", "name"};
                defpackage.kfm kfmVar = (defpackage.kfm) this.a;
                java.lang.Object[] objArrCC = defpackage.ajsz.cC(strArr, kfmVar.f() != null ? new java.lang.String[]{"uuid"} : new java.lang.String[0]);
                defpackage.kgz kgzVarF2 = kfmVar.f();
                return (java.lang.String[]) defpackage.ajsz.cC(objArrCC, (kgzVarF2 == null || !kgzVarF2.d) ? new java.lang.String[0] : new java.lang.String[]{"lookup_uri"});
            case 19:
                defpackage.aigf aigfVarK3 = ((defpackage.zzx) this.a).k();
                defpackage.aooh.e(aigfVarK3, "get(...)");
                java.util.List listBX3 = defpackage.ajsz.bX(defpackage.ajsz.aW(aigfVarK3), new hte(6));
                java.util.ArrayList arrayList4 = new java.util.ArrayList(defpackage.ajsz.bl(listBX3, 10));
                java.util.Iterator it4 = listBX3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add((defpackage.kif) ((defpackage.aoin) ((defpackage.aoiu) it4.next()).b).a());
                }
                return arrayList4;
            default:
                java.util.Set setEntrySet = ((defpackage.zzx) ((defpackage.rsr) this.a).b).k().entrySet();
                defpackage.aooh.e(setEntrySet, "<get-entries>(...)");
                java.util.List listBX4 = defpackage.ajsz.bX(setEntrySet, new hte(9));
                java.util.ArrayList arrayList5 = new java.util.ArrayList(defpackage.ajsz.bl(listBX4, 10));
                java.util.Iterator it5 = listBX4.iterator();
                while (it5.hasNext()) {
                    arrayList5.add((defpackage.aoin) ((java.util.Map.Entry) it5.next()).getValue());
                }
                return arrayList5;
        }
    }
}
