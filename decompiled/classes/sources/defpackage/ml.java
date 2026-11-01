package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ml implements defpackage.aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ml(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [gii, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26, types: [dao, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v50, types: [cer, java.lang.Object] */
    @Override // defpackage.aomy
    public final java.lang.Object a() {
        boolean z = false;
        switch (this.$cid) {
            case 0:
                defpackage.fyd fydVar = new defpackage.fyd();
                ((defpackage.mp) this.a).fd().a(fydVar);
                return fydVar;
            case 1:
                return new defpackage.aewl(((defpackage.mp) this.a).l);
            case 2:
                java.lang.Object obj = this.a;
                try {
                    android.content.pm.ActivityInfo activityInfo = ((defpackage.mp) obj).getPackageManager().getActivityInfo(((defpackage.mp) obj).getComponentName(), 786432);
                    defpackage.aooh.e(activityInfo, "getActivityInfo(...)");
                    z = activityInfo.exported;
                    break;
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                }
                return java.lang.Boolean.valueOf(z);
            case 3:
                ?? r5 = this.a;
                defpackage.mp mpVar = (defpackage.mp) r5;
                return new defpackage.enw(mpVar.getApplication(), r5, mpVar.o());
            case 4:
                java.lang.Object obj2 = this.a;
                defpackage.nf nfVar = new defpackage.nf(new defpackage.am(obj2, 20));
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    if (defpackage.aooh.n(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                        ((defpackage.mp) obj2).fe(nfVar);
                    } else {
                        new android.os.Handler(android.os.Looper.getMainLooper()).post(new defpackage.ad(obj2, nfVar, 11, (byte[]) null));
                    }
                }
                return nfVar;
            case 5:
                return new defpackage.nd((defpackage.nf) this.a);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Long.valueOf(((defpackage.alg) this.a).a());
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.alg algVar = (defpackage.alg) this.a;
                return java.lang.Boolean.valueOf(!defpackage.aooh.n(algVar.h(), algVar.f()) || algVar.B() || ((java.lang.Boolean) algVar.b.a()).booleanValue());
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.amk) this.a).r();
                return java.lang.Boolean.TRUE;
            case 9:
                ?? r6 = this.a;
                defpackage.ams amsVar = (defpackage.ams) r6;
                defpackage.cso csoVar = amsVar.a;
                if (csoVar != null) {
                    return csoVar;
                }
                defpackage.cso csoVarI = ((defpackage.deg) defpackage.cfo.C(r6)).N.i();
                amsVar.a = csoVarI;
                return csoVarI;
            case 10:
                return java.lang.Boolean.valueOf(((defpackage.cmv) this.a).D);
            case 11:
                defpackage.cpg cpgVar = ((defpackage.ath) this.a).j;
                if (!cpgVar.t.D) {
                    return null;
                }
                defpackage.cpe cpeVarE = cpgVar.e();
                if (!cpeVarE.a()) {
                    return null;
                }
                if (cpeVarE.b()) {
                    if (cpgVar == null) {
                        defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.focus.FocusTargetNode");
                    }
                    return cpgVar.f(null);
                }
                defpackage.cpg cpgVarB = ((defpackage.deg) defpackage.cfo.C(cpgVar)).F.b();
                if (cpgVarB != null) {
                    return cpgVarB.f(defpackage.cfo.y(cpgVar));
                }
                return null;
            case 12:
                return java.lang.Integer.valueOf(((defpackage.bbh) this.a).j().n);
            case 13:
                return new defpackage.bar((defpackage.aonj) this.a.a());
            case 14:
                return java.lang.Integer.valueOf(((defpackage.bay) ((defpackage.bbh) this.a).f.a()).i);
            case 15:
                return (defpackage.bdy) ((defpackage.aomy) this.a.a()).a();
            case 16:
                return java.lang.Float.valueOf(((defpackage.bes) this.a).b.b());
            case 17:
                return java.lang.Float.valueOf(((defpackage.bes) this.a).b.a());
            case 18:
                defpackage.bes besVar = (defpackage.bes) this.a;
                return java.lang.Float.valueOf(besVar.b.d() - besVar.b.c());
            case 19:
                defpackage.bjn bjnVar = (defpackage.bjn) this.a;
                bjnVar.g();
                bjnVar.k();
                return java.lang.Boolean.TRUE;
            default:
                defpackage.bjr bjrVar = (defpackage.bjr) this.a;
                bjrVar.g();
                bjrVar.h();
                return java.lang.Boolean.TRUE;
        }
    }
}
