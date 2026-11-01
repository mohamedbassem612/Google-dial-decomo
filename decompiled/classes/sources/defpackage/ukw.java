package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ukw implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ukw(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        boolean z = false;
        switch (this.$cid) {
            case 0:
                return java.lang.Integer.valueOf(((android.telecom.DisconnectCause) obj).getCode());
            case 1:
                java.lang.String str = (java.lang.String) obj;
                vqu vquVarBQ = defpackage.wsc.bQ(uje.a.m());
                defpackage.aooh.c(str);
                defpackage.aooh.f(str, "value");
                defpackage.akzx akzxVar = (defpackage.akzx) vquVarBQ.a;
                akzxVar.u();
                uje ujeVar = akzxVar.b;
                j$.util.Objects.requireNonNull(str);
                ujeVar.b = 1;
                ujeVar.c = str;
                return vquVarBQ.U();
            case 2:
                java.lang.Integer num = (java.lang.Integer) obj;
                if (num != null && (num.intValue() == 2 || num.intValue() == 3)) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 3:
                return defpackage.ajcm.a;
            case 4:
                unp unpVar = (unp) obj;
                defpackage.aooh.f(unpVar, "it");
                return java.lang.Integer.valueOf(unpVar.b);
            case 5:
                unp unpVar2 = (unp) obj;
                defpackage.aooh.f(unpVar2, "it");
                return unpVar2.c;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Integer.valueOf(((unp) obj).b);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((unp) obj).c;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.afsq.cc((defpackage.diq) obj);
            case 9:
                defpackage.gin ginVarA = ((defpackage.gjh) obj).a("SELECT * FROM ContactScore ORDER BY score DESC");
                try {
                    int iS = defpackage.dzk.S(ginVarA, "normalizedNumber");
                    int iS2 = defpackage.dzk.S(ginVarA, "score");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (ginVarA.m()) {
                        arrayList.add(new uqs(ginVarA.l(iS) ? null : ginVarA.e(iS), ginVarA.a(iS2)));
                        break;
                    }
                    return arrayList;
                } finally {
                    ginVarA.close();
                }
            case 10:
                defpackage.gin ginVarA2 = ((defpackage.gjh) obj).a("DELETE FROM ContactScore");
                try {
                    ginVarA2.m();
                    return null;
                } finally {
                    ginVarA2.close();
                }
            case 11:
                return java.lang.Boolean.valueOf(((defpackage.vzi) obj).m);
            case 12:
                return ((defpackage.akzx) obj).r();
            case 13:
                return defpackage.ajcm.a;
            case 14:
                return defpackage.ajcm.a;
            case 15:
                return java.lang.Boolean.valueOf((((defpackage.ipb) obj).b & 128) != 0);
            case 16:
                defpackage.wpy wpyVar = ((defpackage.ipb) obj).j;
                return wpyVar == null ? defpackage.wpy.a : wpyVar;
            case 17:
                int iO = defpackage.wsc.O(((wke) obj).e);
                if (iO != 0 && iO == 6) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 18:
                return java.lang.Boolean.valueOf((((defpackage.ipb) obj).b & 64) != 0);
            case 19:
                defpackage.xar xarVar = ((defpackage.ipb) obj).i;
                return xarVar == null ? defpackage.xar.a : xarVar;
            default:
                java.lang.String str2 = (java.lang.String) obj;
                defpackage.aooh.f(str2, "it");
                return defpackage.aooh.r(str2);
        }
    }
}
