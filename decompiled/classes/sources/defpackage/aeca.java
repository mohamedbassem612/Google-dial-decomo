package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeca extends defpackage.aomh implements defpackage.aono {
    private final /* synthetic */ int $cid;
    /* synthetic */ java.lang.Object a;
    /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeca(defpackage.aoln aolnVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
    }

    @Override // defpackage.aono
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (this.$cid != 0) {
            defpackage.aeca aecaVar = new defpackage.aeca((defpackage.aoln) obj3, 1, null);
            aecaVar.a = (defpackage.kcr) obj;
            aecaVar.b = (defpackage.kcr) obj2;
            return aecaVar.b(defpackage.aojh.a);
        }
        defpackage.aeca aecaVar2 = new defpackage.aeca((defpackage.aoln) obj3, 0);
        aecaVar2.a = (defpackage.vx) obj;
        aecaVar2.b = (defpackage.aegw) obj2;
        return aecaVar2.b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2 = null;
        if (this.$cid != 0) {
            defpackage.aooc.af(obj);
            java.lang.Object obj3 = this.a;
            java.lang.Object obj4 = this.b;
            if (obj4 == null) {
                return null;
            }
            if (obj3 == null) {
                return new kcs(((defpackage.kcr) obj4).a.p);
            }
            kbx kbxVar = ((defpackage.kcr) obj4).a;
            int i = ((defpackage.kcr) obj3).a.p;
            int i2 = kbxVar.p;
            if (i != i2) {
                return new kcs(i2);
            }
            return null;
        }
        defpackage.aooc.af(obj);
        java.lang.Object obj5 = this.a;
        defpackage.tvn tvnVarBS = defpackage.agab.bS(((defpackage.alad) this.b).L());
        defpackage.vx vxVar = (defpackage.vx) obj5;
        tvnVarBS.H(vxVar.v("last_successful_registration_request_hash_code", 0));
        java.lang.String strY = vxVar.y("last_successful_registration_environment_url");
        if (strY == null) {
            strY = "";
        }
        tvnVarBS.F(strY);
        tvnVarBS.I(vxVar.x("last_successful_registration_time_ms"));
        tvnVarBS.C(vxVar.w("is_registered_to_unified_fcm_registration", false));
        defpackage.aojl aojlVar = new defpackage.aojl((defpackage.aojo) defpackage.adzy.f);
        java.lang.Object obj6 = null;
        boolean z = false;
        while (true) {
            if (!aojlVar.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            java.lang.Object next = aojlVar.next();
            if (((defpackage.adzy) next).g == vxVar.v("last_successful_registration_account_type", defpackage.aegv.SIGNED_IN.a())) {
                if (!z) {
                    obj6 = next;
                    z = true;
                }
            }
            obj6 = null;
            break;
        }
        defpackage.adzy adzyVar = (defpackage.adzy) obj6;
        if (adzyVar == null) {
            adzyVar = defpackage.adzy.SIGNED_IN;
        }
        tvnVarBS.E((defpackage.aegv) java.lang.Enum.valueOf(defpackage.aegv.class, adzyVar.name()));
        java.lang.String strY2 = vxVar.y("last_successful_registration_pseudonymous_cookie");
        if (strY2 == null) {
            strY2 = "";
        }
        tvnVarBS.G(strY2);
        java.lang.String strY3 = vxVar.y("last_successful_fcm_registration_token");
        if (strY3 == null) {
            strY3 = "";
        }
        tvnVarBS.D(strY3);
        defpackage.aojl aojlVar2 = new defpackage.aojl((defpackage.aojo) defpackage.adzu.d);
        java.lang.Object obj7 = null;
        boolean z2 = false;
        while (true) {
            if (!aojlVar2.hasNext()) {
                if (!z2) {
                    break;
                }
                obj2 = obj7;
                break;
            }
            java.lang.Object next2 = aojlVar2.next();
            if (((defpackage.adzu) next2).e == vxVar.v("last_used_registration_api", 0)) {
                if (z2) {
                    break;
                }
                obj7 = next2;
                z2 = true;
            }
        }
        defpackage.adzu adzuVar = (defpackage.adzu) obj2;
        if (adzuVar == null) {
            adzuVar = defpackage.adzu.NONE;
        }
        tvnVarBS.J((defpackage.aegu) java.lang.Enum.valueOf(defpackage.aegu.class, adzuVar.name()));
        java.lang.String strY4 = vxVar.y("internal_target_id");
        if (strY4 == null) {
            strY4 = "";
        }
        tvnVarBS.B(strY4);
        java.lang.String strY5 = vxVar.y("fetch_only_id");
        tvnVarBS.A(strY5 != null ? strY5 : "");
        return tvnVarBS.z();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeca(defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(3, aolnVar);
        this.$cid = i;
    }
}
