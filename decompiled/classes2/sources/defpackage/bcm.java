package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bcm implements aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ bcm(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01cd  */
    public final java.lang.Object a(java.lang.Object obj) {
        ait arrayList;
        dks dksVar;
        int i = 0;
        switch (this.$cid) {
            case 0:
                ((java.lang.Integer) obj).intValue();
                defpackage.bcb bcbVar = defpackage.bco.a;
                return aokc.a;
            case 1:
                java.util.List list = (java.util.List) obj;
                return new defpackage.bcl(((java.lang.Number) list.get(0)).intValue(), ((java.lang.Number) list.get(1)).intValue());
            case 2:
                ((java.lang.Integer) obj).intValue();
                defpackage.bcb bcbVar2 = defpackage.bco.a;
                return -1;
            case 3:
                java.lang.Long l = (java.lang.Long) obj;
                l.longValue();
                return l;
            case 4:
                dip dipVar = din.C;
                arrayList = aojh.a;
                ((diq) obj).a(dipVar, arrayList);
                break;
            case 5:
                djg djgVar = (djg) obj;
                java.lang.Object obj2 = djgVar.a;
                if (obj2 instanceof defpackage.djw) {
                    if (obj2 == null) {
                        aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                    }
                    defpackage.djw djwVar = (defpackage.djw) obj2;
                    if (!defpackage.wx.h(djwVar.b())) {
                        djg[] djgVarArr = new djg[2];
                        djgVarArr[0] = djgVar;
                        if (obj2 == null) {
                            aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                        }
                        defpackage.dkx dkxVarB = djwVar.b();
                        if (dkxVarB == null || (dksVar = dkxVarB.a) == null) {
                            dksVar = new dks(0L, 0L, (dnd) null, (dmw) null, (dmx) null, (dmq) null, (java.lang.String) null, 0L, (dok) null, (doz) null, (dnx) null, 0L, (dou) null, (crc) null, 65535);
                        }
                        djgVarArr[1] = new djg(dksVar, djgVar.b, djgVar.c, "");
                        return new java.util.ArrayList((java.util.Collection) new aojv(djgVarArr, true));
                    }
                }
                return new java.util.ArrayList((java.util.Collection) new aojv(new djg[]{djgVar}, true));
            case 6:
                android.content.Context context = (android.content.Context) obj;
                java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(defpackage.bhb.a(), 0);
                arrayList = new java.util.ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                while (i < size) {
                    android.content.pm.ResolveInfo resolveInfo = listQueryIntentActivities.get(i);
                    android.content.pm.ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        android.content.pm.ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && (activityInfo.permission == null || context.checkSelfPermission(activityInfo.permission) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                    i++;
                }
                break;
            case 7:
                return java.lang.Long.valueOf(((defpackage.bkl) obj).a);
            case 8:
                long j = ((cpm) obj).a;
                long j2 = 9223372034707292159L & j;
                ait aitVar = defpackage.blk.a;
                if (j2 == 9205357640488583168L) {
                    return defpackage.blk.a;
                }
                arrayList = new ait(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
                break;
                break;
            case 9:
                ait aitVar2 = (ait) obj;
                ait aitVar3 = defpackage.blk.a;
                return new cpm((((long) java.lang.Float.floatToRawIntBits(aitVar2.a)) << 32) | (((long) java.lang.Float.floatToRawIntBits(aitVar2.b)) & 4294967295L));
            case 10:
                return java.lang.Long.valueOf(((defpackage.bke) obj).a);
            case 11:
                arrayList = new defpackage.blz(((java.lang.Long) obj).longValue());
                break;
            case 12:
                java.util.List list2 = (java.util.List) obj;
                arrayList = new defpackage.bmb();
                java.lang.Object obj3 = list2.get(0);
                aooh.d(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                java.util.List list3 = (java.util.List) obj3;
                ckb ckbVar = dji.a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(list3.size());
                int size2 = list3.size();
                while (i < size2) {
                    dji djiVar = (dji) ckbVar.a(list3.get(i));
                    if (djiVar != null) {
                        arrayList2.add(djiVar);
                    }
                    i++;
                }
                arrayList.c(arrayList2);
                java.lang.Object obj4 = list2.get(1);
                java.lang.Integer num = obj4 instanceof java.lang.Integer ? (java.lang.Integer) obj4 : null;
                if (num != null) {
                    java.lang.Object obj5 = list2.get(2);
                    aooh.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                    long jLongValue = ((java.lang.Long) obj5).longValue();
                    java.lang.Object obj6 = list2.get(3);
                    aooh.d(obj6, "null cannot be cast to non-null type kotlin.String");
                    java.lang.Object obj7 = list2.get(4);
                    aooh.d(obj7, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((java.lang.Integer) obj7).intValue();
                    java.lang.Object obj8 = list2.get(5);
                    aooh.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                    long jLongValue2 = ((java.lang.Long) obj8).longValue();
                    java.lang.Object obj9 = list2.get(6);
                    aooh.d(obj9, "null cannot be cast to non-null type kotlin.String");
                    java.lang.Object obj10 = list2.get(7);
                    aooh.d(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                    arrayList.b(new defpackage.bko(new defpackage.bkn(defpackage.dpm.d((java.lang.String) obj6), num.intValue(), jLongValue), new defpackage.bkn(defpackage.dpm.d((java.lang.String) obj9), iIntValue, jLongValue2), ((java.lang.Boolean) obj10).booleanValue()));
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ajb ajbVar = defpackage.bmz.a;
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ajb ajbVar2 = defpackage.bmz.a;
                return pf.j((diq) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                ajb ajbVar3 = defpackage.bmz.a;
                return pf.j((diq) obj);
            case 16:
                ajb ajbVar4 = defpackage.bmz.a;
                return pf.j((diq) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ajb ajbVar5 = defpackage.bmz.a;
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.Long l2 = (java.lang.Long) obj;
                l2.longValue();
                return l2;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                java.lang.Long l3 = (java.lang.Long) obj;
                l3.longValue();
                return l3;
            default:
                return pf.k((diq) obj);
        }
        return arrayList;
    }
}
