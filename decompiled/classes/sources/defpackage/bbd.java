package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class bbd implements defpackage.aonn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ bbd(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0133 A[LOOP:0: B:42:0x00f4->B:53:0x0133, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0136 A[SYNTHETIC] */
    @Override // defpackage.aonn
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        java.util.List list = null;
        switch (this.$cid) {
            case 0:
                defpackage.bbh bbhVar = (defpackage.bbh) obj2;
                defpackage.ckb ckbVar = defpackage.bbh.a;
                java.util.List listAsList = java.util.Arrays.asList(java.lang.Integer.valueOf(bbhVar.b()), java.lang.Integer.valueOf(bbhVar.c()));
                defpackage.aooh.e(listAsList, "asList(...)");
                return listAsList;
            case 1:
                defpackage.afr afrVar = (defpackage.afr) obj2;
                return java.lang.Boolean.valueOf(((defpackage.afr) obj) == afrVar && afrVar == defpackage.afr.c);
            case 2:
                java.util.Map mapB = ((defpackage.beu) obj2).b();
                if (!mapB.isEmpty()) {
                    return mapB;
                }
                break;
            case 3:
                return defpackage.a.A((defpackage.cav) obj, ((java.lang.Integer) obj2).intValue());
            case 4:
                return defpackage.a.A((defpackage.cav) obj, ((java.lang.Integer) obj2).intValue());
            case 5:
                defpackage.cjw cjwVar = (defpackage.cjw) obj2;
                defpackage.adw adwVar = cjwVar.d;
                java.lang.Object[] objArr = adwVar.b;
                java.lang.Object[] objArr2 = adwVar.c;
                long[] jArr = adwVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = i - length;
                            int i3 = 0;
                            while (true) {
                                int i4 = 8 - ((~i2) >>> 31);
                                if (i3 < i4) {
                                    if ((255 & j) < 128) {
                                        int i5 = (i << 3) + i3;
                                        cjwVar.b.put(objArr[i5], ((defpackage.cjx) objArr2[i5]).b());
                                    }
                                    j >>= 8;
                                    i3++;
                                } else if (i4 == 8) {
                                    if (i != length) {
                                        i++;
                                    }
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                java.util.Map map = cjwVar.b;
                defpackage.ajsz.bt(map.values(), new defpackage.aln(20));
                if (!map.isEmpty()) {
                    return map;
                }
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return obj2;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.a.A((defpackage.cav) obj, ((java.lang.Integer) obj2).intValue());
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.cyc) obj2).a = new defpackage.bpa((defpackage.dbk) obj, 9);
                return defpackage.aojh.a;
            case 9:
                ((defpackage.dbk) obj).ad((defpackage.cmw) obj2);
                return defpackage.aojh.a;
            case 10:
                ((defpackage.dbk) obj).ay((defpackage.cje) obj2);
                return defpackage.aojh.a;
            case 11:
                ((defpackage.dbk) obj).ac((defpackage.cye) obj2);
                return defpackage.aojh.a;
            case 12:
                ((java.lang.Integer) obj2).intValue();
                ((defpackage.dbk) obj).as();
                return defpackage.aojh.a;
            case 13:
                return defpackage.a.A((defpackage.cav) obj, ((java.lang.Integer) obj2).intValue());
            case 14:
                java.util.Collection collection = (java.util.List) obj;
                java.util.List list2 = (java.util.List) obj2;
                if (collection == null) {
                    collection = defpackage.aokc.a;
                }
                return defpackage.ajsz.bT(collection, list2);
            case 15:
                java.util.List list3 = (java.util.List) obj;
                list = (java.util.List) obj2;
                if (list3 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(list3);
                    arrayList.addAll(list);
                    return arrayList;
                }
                break;
            case 16:
                return (cnj) obj;
            case 17:
                return (defpackage.cnc) obj;
            case 18:
                return (cne) obj;
            case 19:
                java.lang.Float f = (java.lang.Float) obj;
                ((java.lang.Float) obj2).floatValue();
                return f;
            default:
                throw new java.lang.IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
        return list;
    }
}
