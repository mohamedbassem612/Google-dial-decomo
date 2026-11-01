package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class gpg implements defpackage.aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ gpg(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.aomy
    public final java.lang.Object a() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        java.lang.String str;
        switch (this.$cid) {
            case 0:
                java.lang.reflect.Method method = ((defpackage.kgl) this.a).A().getMethod("unregisterActivityStackCallback", ddz$.ExternalSyntheticApiModelOutline0.m());
                if (method == null) {
                    defpackage.aooh.g();
                }
                return java.lang.Boolean.valueOf(defpackage.gus.G(method));
            case 1:
                defpackage.kgl kglVar = (defpackage.kgl) this.a;
                java.lang.reflect.Method method2 = ((defpackage.kaw) kglVar.b).ab().getMethod("getActivityEmbeddingComponent", null);
                java.lang.Class clsA = kglVar.A();
                if (method2 == null) {
                    defpackage.aooh.g();
                }
                return java.lang.Boolean.valueOf(defpackage.gus.G(method2) && defpackage.gus.D(method2, clsA));
            case 2:
                defpackage.gyc.a((defpackage.guc) this.a);
                return defpackage.aojh.a;
            case 3:
                return new defpackage.gxw((defpackage.gfy) this.a);
            case 4:
                return new defpackage.gwq((defpackage.gfy) this.a);
            case 5:
                return new defpackage.gxz((defpackage.gfy) this.a);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return new defpackage.gxc((defpackage.gfy) this.a);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.gxg((defpackage.gfy) this.a);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.gxi((defpackage.gfy) this.a);
            case 9:
                return new defpackage.gwu((defpackage.gfy) this.a);
            case 10:
                return new defpackage.gwx((defpackage.gfy) this.a);
            case 11:
                defpackage.guq guqVar = (defpackage.guq) this.a;
                android.content.Context context = guqVar.c;
                java.lang.String str2 = defpackage.gvl.a;
                if (android.os.Build.VERSION.SDK_INT >= 34) {
                    defpackage.gvj.a(context).cancelAll();
                }
                android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) context.getSystemService("jobscheduler");
                java.util.List listF = defpackage.gvl.f(context, jobScheduler);
                if (listF != null && !listF.isEmpty()) {
                    java.util.Iterator it = listF.iterator();
                    while (it.hasNext()) {
                        defpackage.gvl.g(jobScheduler, ((android.app.job.JobInfo) it.next()).getId());
                    }
                }
                guqVar.e.D().x();
                defpackage.gtv.a(guqVar.d, guqVar.e, guqVar.f);
                return defpackage.aojh.a;
            case 12:
                return java.lang.Float.valueOf(((android.content.Context) ((defpackage.ahbv) this.a).a).getResources().getDimension(2131166943));
            case 13:
                return java.lang.Float.valueOf(((android.content.Context) ((defpackage.ahbv) this.a).a).getResources().getDimension(2131166944));
            case 14:
                return java.lang.Float.valueOf(((android.content.Context) ((defpackage.ahbv) this.a).a).getResources().getDimension(2131165604));
            case 15:
                return java.lang.Integer.valueOf(((android.content.Context) ((defpackage.ahbv) this.a).a).getResources().getDimensionPixelSize(2131166942));
            case 16:
                return java.lang.Integer.valueOf(((android.content.Context) ((defpackage.ahbv) this.a).a).getResources().getDimensionPixelSize(2131166941));
            case 17:
                defpackage.aihd aihdVarE = ((defpackage.zzx) this.a).e();
                defpackage.aooh.e(aihdVarE, "get(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(aihdVarE, 10));
                java.util.Iterator<E> it2 = aihdVarE.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new defpackage.aoiu((defpackage.abwm) it2.next(), new defpackage.ahda((byte[]) null)));
                }
                return arrayList;
            case 18:
                defpackage.iwc iwcVar = (defpackage.iwc) this.a;
                java.util.Locale localeAe = defpackage.gus.ae(iwcVar.b);
                defpackage.aooh.e(localeAe, "getLocale(...)");
                java.lang.String strB = defpackage.iwc.b(localeAe);
                if (defpackage.aooh.n(strB, "en-US")) {
                    str = "en-US";
                } else if (((java.lang.Boolean) iwcVar.d.a()).booleanValue()) {
                    str = "en-GB";
                } else if (((java.lang.Boolean) iwcVar.e.a()).booleanValue()) {
                    str = "en-CA";
                } else if (((java.lang.Boolean) iwcVar.f.a()).booleanValue()) {
                    str = "en-IE";
                } else if (((java.lang.Boolean) iwcVar.g.a()).booleanValue()) {
                    str = "en-AU";
                } else {
                    ((java.lang.Boolean) iwcVar.c.a()).booleanValue();
                    str = "en-US";
                }
                ((defpackage.aimw) defpackage.iwc.a.b().l("com/android/dialer/beesly/impl/locale/BeeslySingletonLocaleProvider", "getLocaleImpl", 64, "BeeslySingletonLocaleProvider.kt")).I("SystemLocale: '%s', BeeslyRunningLocale: '%s'", strB, str);
                return str;
            case 19:
                defpackage.aigf aigfVarK = ((defpackage.zzx) this.a).k();
                defpackage.aooh.e(aigfVarK, "get(...)");
                java.util.List<defpackage.aoiu> listBX = defpackage.ajsz.bX(defpackage.ajsz.aW(aigfVarK), new hte(2));
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(listBX, 10));
                for (defpackage.aoiu aoiuVar : listBX) {
                    arrayList2.add(new defpackage.aoiu((jyf) aoiuVar.a, ((defpackage.aoin) aoiuVar.b).a()));
                }
                return arrayList2;
            default:
                j$.util.Optional optionalG = ((defpackage.zjm) this.a).g();
                defpackage.aooh.e(optionalG, "getFeature(...)");
                return (defpackage.kgz) defpackage.aooh.q(optionalG);
        }
    }
}
