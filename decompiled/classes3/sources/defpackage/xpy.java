package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xpy extends defpackage.xpw {
    private static final xtq d;
    private final android.content.Context b;
    private final defpackage.xhu c;

    static {
        int i = defpackage.xox.a;
        d = new xtq("DefaultOnboardingChanges", (byte[]) null);
    }

    public xpy(android.content.Context context) {
        aooh.f(context, "context");
        android.content.Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        java.lang.String packageName = applicationContext.getPackageName();
        java.lang.String packageName2 = applicationContext.getPackageName();
        aooh.e(packageName2, "getPackageName(...)");
        this.c = defpackage.xhy.j(packageName + '/' + aoov.D(packageName2, ".", packageName2));
    }

    @Override // defpackage.xpw
    protected final java.lang.Integer b(java.lang.String str) {
        try {
            return java.lang.Integer.valueOf(android.provider.Settings.Global.getInt(this.b.getContentResolver(), str));
        } catch (android.provider.Settings.SettingNotFoundException unused) {
            return null;
        }
    }

    @Override // defpackage.xpw
    protected final java.lang.String c(defpackage.xhu xhuVar) {
        java.lang.String string;
        java.lang.String string2 = null;
        try {
            android.content.res.Resources resourcesForApplication = this.b.getPackageManager().getResourcesForApplication(xhuVar.getNodePackage());
            aooh.e(resourcesForApplication, "getResourcesForApplication(...)");
            string = resourcesForApplication.getString(resourcesForApplication.getIdentifier(java.lang.String.valueOf(aoov.Q(aoov.Q((java.lang.String) ((defpackage.xht) xhuVar).b.a(), ".", "_"), "-", "_")).concat("_onboarding_compliance_date"), "string", xhuVar.getNodePackage()));
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            d.b("Package " + xhuVar.getNodePackage() + " not found in package manager", e);
            string = null;
        } catch (android.content.res.Resources.NotFoundException unused) {
            string = null;
        }
        if (string != null) {
            return string;
        }
        try {
            android.content.pm.ApplicationInfo applicationInfo = this.b.getPackageManager().getApplicationInfo(xhuVar.getNodePackage(), 128);
            aooh.e(applicationInfo, "getApplicationInfo(...)");
            android.os.Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                string2 = bundle.getString("onboarding-compliance-date");
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            d.b("Package " + xhuVar.getNodePackage() + " not found in package manager", e2);
        }
        return string2;
    }

    @Override // defpackage.xpw
    protected final java.lang.String d(java.lang.String str) {
        try {
            return android.provider.Settings.Global.getString(this.b.getContentResolver(), str);
        } catch (android.provider.Settings.SettingNotFoundException unused) {
            return null;
        }
    }

    @Override // defpackage.xpz
    public final boolean e(long j) {
        java.lang.Object next;
        defpackage.xhu xhuVar = this.c;
        java.lang.String nodePackage = xhuVar.getNodePackage();
        java.lang.Object obj = defpackage.xqf.a.get(java.lang.Long.valueOf(j));
        if (obj == null) {
            throw new java.lang.IllegalStateException(a.bC(j, "Invalid change ID ", " - this should have been blocked by the conformance checker"));
        }
        defpackage.xqb xqbVar = (defpackage.xqb) obj;
        if (xqbVar.c() == defpackage.xqc.a) {
            aooh.f(nodePackage, "packageName");
            if (aooh.n(java.lang.Boolean.valueOf(aooh.n(nodePackage, xhuVar.getNodePackage())), java.lang.Boolean.FALSE)) {
                throw new java.lang.IllegalArgumentException("You cannot query changes which are SINGLE_COMPONENT across process boundaries.");
            }
        }
        boolean z = false;
        java.lang.Boolean boolA = super.a(nodePackage + '.' + xqbVar.a(), false);
        if (boolA == null) {
            java.lang.Object[] objArrCB = ajsz.cB(xqbVar.i(), "all");
            aooh.f(objArrCB, "<this>");
            aoqu aoquVar = new aoqu(new aoqt(objArrCB.length == 0 ? defpackage.aoqg.a : new defpackage.aoka(objArrCB, 0), new uph(this, nodePackage, 11, (byte[]) null), 2));
            do {
                if (!aoquVar.hasNext()) {
                    next = null;
                    break;
                }
                next = aoquVar.next();
            } while (((java.lang.Boolean) next) == null);
            boolA = (java.lang.Boolean) next;
        }
        if (boolA != null) {
            return boolA.booleanValue();
        }
        if (!aooh.n(xqbVar.g(), "NOT_RELEASED")) {
            return true;
        }
        java.lang.String nodePackage2 = xhuVar.getNodePackage();
        java.lang.String strD = d(java.lang.String.valueOf(nodePackage2).concat(".complianceDate"));
        defpackage.xpx xpxVar = strD != null ? new defpackage.xpx(strD) : null;
        if (xpxVar != null) {
            this.a.put(nodePackage2, xpxVar);
        } else {
            try {
                java.lang.String strC = c(xhuVar);
                if (strC == null) {
                    strC = defpackage.xpx.a;
                }
                this.a.put(nodePackage2, new defpackage.xpx(strC));
            } catch (java.lang.Exception e) {
                defpackage.xox.f((java.lang.String) d.a, "Could not find package info for ".concat(java.lang.String.valueOf(nodePackage2)), e);
                this.a.put(nodePackage2, null);
            }
        }
        defpackage.xpx xpxVar2 = (defpackage.xpx) this.a.get(nodePackage);
        if (xpxVar2 != null && !aooh.n(xqbVar.e(), "NOT_AVAILABLE")) {
            z = !new defpackage.xpx(xqbVar.e()).b.isAfter(xpxVar2.b);
        }
        return z;
    }
}
