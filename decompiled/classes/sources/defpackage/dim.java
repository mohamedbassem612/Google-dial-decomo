package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class dim implements defpackage.aonn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ dim(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonn
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = obj2;
        switch (this.$cid) {
            case 0:
                return (defpackage.dib) obj;
            case 1:
                throw new java.lang.IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 2:
                return (java.lang.String) obj;
            case 3:
                return (defpackage.aojh) obj;
            case 4:
                java.util.List list = (java.util.List) obj;
                java.util.List list2 = (java.util.List) obj2;
                if (list == null) {
                    return list2;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(list);
                arrayList.addAll(list2);
                obj3 = arrayList;
                break;
                break;
            case 5:
                return (defpackage.cqi) obj;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return (defpackage.crd) obj;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new java.lang.IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return (defpackage.aojh) obj;
            case 9:
                return (defpackage.aojh) obj;
            case 10:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                ((java.lang.Boolean) obj2).booleanValue();
                return bool;
            case 11:
                return (java.lang.String) obj;
            case 12:
                return (wx) obj;
            case 13:
                if (obj != null) {
                    return obj;
                }
                break;
            case 14:
                defpackage.dji djiVar = (defpackage.dji) obj2;
                return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{djiVar.c, defpackage.dkp.a(djiVar.b, defpackage.dkp.b, (defpackage.cjs) obj)}, true));
            case 15:
                defpackage.cjs cjsVar = (defpackage.cjs) obj;
                dkx dkxVar = (dkx) obj2;
                defpackage.dks dksVar = dkxVar.a;
                defpackage.ckb ckbVar = defpackage.dkp.j;
                return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(dksVar, ckbVar, cjsVar), defpackage.dkp.a(dkxVar.b, ckbVar, cjsVar), defpackage.dkp.a(dkxVar.c, ckbVar, cjsVar), defpackage.dkp.a(dkxVar.d, ckbVar, cjsVar)}, true));
            case 16:
                return java.lang.Integer.valueOf(((defpackage.dou) obj2).d);
            case 17:
                defpackage.doz dozVar = (defpackage.doz) obj2;
                return new java.util.ArrayList(new defpackage.aojv(new java.lang.Float[]{java.lang.Float.valueOf(dozVar.b), java.lang.Float.valueOf(dozVar.c)}, true));
            case 18:
                defpackage.cjs cjsVar2 = (defpackage.cjs) obj;
                defpackage.dpa dpaVar = (defpackage.dpa) obj2;
                defpackage.dps dpsVar = new defpackage.dps(dpaVar.b);
                defpackage.dko dkoVar = defpackage.dkp.A;
                return new java.util.ArrayList(new defpackage.aojv(new java.lang.Object[]{defpackage.dkp.a(dpsVar, dkoVar, cjsVar2), defpackage.dkp.a(new defpackage.dps(dpaVar.c), dkoVar, cjsVar2)}, true));
            case 19:
                return ((dlb) obj2).a;
            default:
                return java.lang.Integer.valueOf(((defpackage.dnd) obj2).h);
        }
        return obj3;
    }
}
