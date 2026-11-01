package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class qks implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ qks(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return java.lang.Boolean.valueOf(((android.os.PersistableBundle) obj).getBoolean("display_in_call_notification_wifi_icon_bool", true));
            case 1:
                return java.lang.Integer.valueOf(((qib) obj).a.I);
            case 2:
                return ((qij) obj).a;
            case 3:
                return ((qjd) obj).a;
            case 4:
                out outVar = (out) obj;
                defpackage.aimz aimzVar = qng.a;
                defpackage.aooh.f(outVar, "it");
                java.lang.String strA = outVar.a();
                defpackage.aooh.e(strA, "tag(...)");
                return strA;
            case 5:
                return (qvh) defpackage.aooc.ar((hkl) obj, qvh.class);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.afsq.cp((defpackage.diq) obj);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Boolean.valueOf(((rex) obj) == rex.b);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return ((apqr) obj).b;
            case 9:
                defpackage.diq diqVar = (defpackage.diq) obj;
                defpackage.aooh.f(diqVar, "$this$semantics");
                defpackage.dfb.o(diqVar, 0);
                return defpackage.aojh.a;
            case 10:
                defpackage.diq diqVar2 = (defpackage.diq) obj;
                defpackage.aooh.f(diqVar2, "$this$semantics");
                defpackage.dfb.o(diqVar2, 0);
                return defpackage.aojh.a;
            case 11:
                return ((rcq) obj).aq();
            case 12:
                qvq qvqVar = (qvq) obj;
                defpackage.aooh.f(qvqVar, "controller");
                qvqVar.a(false);
                return defpackage.aojh.a;
            case 13:
                return (rcq) ((apqr) obj).a(rcq.class);
            case 14:
                return ((rcq) obj).cq();
            case 15:
                qvq qvqVar2 = (qvq) obj;
                defpackage.aooh.f(qvqVar2, "controller");
                defpackage.aimz aimzVar2 = defpackage.zih.a;
                defpackage.aoov.al(qvqVar2.b, defpackage.zih.b.plus(defpackage.aols.a), 1, new loe((defpackage.aoln) null, qvqVar2, 19, (byte[]) null));
                return defpackage.aojh.a;
            case 16:
                pqm pqmVar = (pqm) obj;
                defpackage.aooh.f(pqmVar, "callController");
                pqmVar.o();
                return defpackage.aojh.a;
            case 17:
                amtp amtpVar = (amtp) obj;
                ajyi ajyiVarT = defpackage.anar.T(amtr.a.m());
                defpackage.aooh.c(amtpVar);
                defpackage.aooh.f(amtpVar, "value");
                defpackage.akzx akzxVar = (defpackage.akzx) ajyiVarT.a;
                akzxVar.u();
                amtr amtrVar = akzxVar.b;
                j$.util.Objects.requireNonNull(amtpVar);
                amtrVar.c = amtpVar;
                amtrVar.b = 1;
                return ajyiVarT.au();
            case 18:
                aes aesVar = (aes) obj;
                defpackage.aooh.f(aesVar, "$this$AnimatedContent");
                defpackage.agf agfVar = defpackage.rtn.a;
                defpackage.afo afoVar = defpackage.rtn.c;
                if (!(aesVar.c() instanceof defpackage.rti)) {
                    return afoVar;
                }
                aesVar.a(afoVar, (defpackage.ahu) null);
                return afoVar;
            case 19:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                defpackage.aooh.f(th, "it");
                saa.f(th);
                return defpackage.aojh.a;
            default:
                java.lang.Throwable th2 = (java.lang.Throwable) obj;
                defpackage.aooh.f(th2, "it");
                sbe.e(th2);
                return defpackage.aojh.a;
        }
    }
}
