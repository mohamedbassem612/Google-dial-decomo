package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agfz {
    private static boolean A = false;
    private static final java.lang.Object B = new java.lang.Object();
    public static android.os.Bundle a = null;
    public static android.os.Bundle b = null;
    public static android.os.Bundle c = null;
    public static android.os.Bundle d = null;
    public static android.os.Bundle e = null;
    public static android.os.Bundle f = null;
    public static android.os.Bundle g = null;
    public static android.os.Bundle h = null;
    public static android.os.Bundle i = null;
    public static android.os.Bundle j = null;
    public static android.os.Bundle k = null;
    public static android.os.Bundle l = null;
    public static android.os.Bundle m = null;
    public static android.os.Bundle n = null;
    public static android.os.Bundle o = null;
    public static android.os.Bundle p = null;
    public static android.os.Bundle q = null;
    public static android.os.Bundle r = null;
    public static int s = 1;
    public static int t;
    public static int u;
    private static defpackage.agfz x;
    private static android.database.ContentObserver y;
    private static int z;
    android.os.Bundle v;
    final java.util.EnumMap w;

    private agfz(android.content.Context context) {
        this.v = null;
        java.util.EnumMap enumMap = new java.util.EnumMap(defpackage.agfx.class);
        this.w = enumMap;
        android.os.Bundle bundle = this.v;
        if (bundle == null || bundle.isEmpty()) {
            this.v = h(context, "getOverlayConfig", "Fail to get config from suw provider");
            enumMap.clear();
            android.os.Bundle bundle2 = this.v;
            android.util.Log.i("PartnerConfigHelper", "PartnerConfigsBundle=".concat((bundle2 != null ? java.lang.Integer.valueOf(bundle2.size()) : "(null)").toString()));
        }
        if (w(context)) {
            if (y != null) {
                try {
                    context.getContentResolver().unregisterContentObserver(y);
                    y = null;
                } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException | java.lang.SecurityException e2) {
                    android.util.Log.w("PartnerConfigHelper", "Failed to unregister content observer: ".concat(e2.toString()));
                }
            }
            android.net.Uri uriF = f();
            try {
                y = new defpackage.agfy();
                context.getContentResolver().registerContentObserver(uriF, true, y);
            } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException | java.lang.SecurityException e3) {
                android.util.Log.w("PartnerConfigHelper", "Failed to register content observer for " + java.lang.String.valueOf(uriF) + ": " + e3.toString());
            }
        }
    }

    public static boolean A(android.content.Context context) {
        android.os.Bundle bundleG = g(context, "isSuwUseDesktopLayoutEnabled", o);
        o = bundleG;
        if (bundleG != null) {
            return bundleG.getBoolean("isSuwUseDesktopLayoutEnabled", false);
        }
        return false;
    }

    public static boolean B(android.content.Context context) {
        android.os.Bundle bundleG = g(context, "isSuwUseFocusRingEnabled", q);
        q = bundleG;
        if (bundleG == null || bundleG.isEmpty()) {
            return false;
        }
        return q.getBoolean("isSuwUseFocusRingEnabled", false);
    }

    public static boolean C(android.content.Context context) {
        android.os.Bundle bundleG = g(context, "isSuwUseFocusRingThemeEnabled", r);
        r = bundleG;
        if (bundleG == null || bundleG.isEmpty()) {
            return false;
        }
        return r.getBoolean("isSuwUseFocusRingThemeEnabled", false);
    }

    public static boolean D(android.content.Context context) {
        android.os.Bundle bundleH = b;
        if (bundleH == null) {
            bundleH = h(context, "isExtendedPartnerConfigEnabled", "SetupWizard extended partner configs supporting status unknown; return as false.");
            b = bundleH;
        }
        if (bundleH != null) {
            return bundleH.getBoolean("isExtendedPartnerConfigEnabled", false);
        }
        android.util.Log.d("PartnerConfigHelper", "shouldApplyExtendedPartnerConfig: false because applyExtendedPartnerConfigBundle is null");
        return false;
    }

    public static boolean E(android.content.Context context) {
        return J(context) && t(context) && !defpackage.aftt.y(context);
    }

    static final defpackage.agga F(android.content.Context context, defpackage.agga aggaVar) {
        try {
            android.content.res.Resources resources = aggaVar.d;
            java.lang.String resourceTypeName = resources.getResourceTypeName(aggaVar.c);
            java.lang.String strConcat = aggaVar.b.concat("_embedded_activity");
            java.lang.String str = aggaVar.a;
            int identifier = resources.getIdentifier(strConcat, resourceTypeName, str);
            if (identifier != 0) {
                android.util.Log.i("PartnerConfigHelper", a.bx(strConcat, "use embedded activity resource:"));
                aggaVar = new defpackage.agga(str, strConcat, identifier, resources);
            } else {
                android.content.res.Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.setupwizard");
                int identifier2 = resourcesForApplication.getIdentifier(strConcat, resourceTypeName, "com.google.android.setupwizard");
                if (identifier2 != 0) {
                    aggaVar = new defpackage.agga("com.google.android.setupwizard", strConcat, identifier2, resourcesForApplication);
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException | android.content.res.Resources.NotFoundException unused) {
        }
        return aggaVar;
    }

    static final defpackage.agga G(android.content.Context context, defpackage.agga aggaVar) {
        if (context != null) {
            try {
                android.content.res.Resources resources = aggaVar.d;
                java.lang.String resourceTypeName = resources.getResourceTypeName(aggaVar.c);
                java.lang.String strConcat = aggaVar.b.concat("_two_pane");
                java.lang.String str = aggaVar.a;
                int identifier = resources.getIdentifier(strConcat, resourceTypeName, str);
                if (identifier != 0) {
                    android.util.Log.i("PartnerConfigHelper", a.bx(strConcat, "two pane resource="));
                    aggaVar = new defpackage.agga(str, strConcat, identifier, resources);
                } else {
                    android.content.res.Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.setupwizard");
                    int identifier2 = resourcesForApplication.getIdentifier(strConcat, resourceTypeName, "com.google.android.setupwizard");
                    if (identifier2 != 0) {
                        aggaVar = new defpackage.agga("com.google.android.setupwizard", strConcat, identifier2, resourcesForApplication);
                    }
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException | android.content.res.Resources.NotFoundException unused) {
            }
        }
        return aggaVar;
    }

    static final defpackage.agga H(defpackage.agga aggaVar) {
        try {
            java.lang.String str = aggaVar.a;
            if (!j$.util.Objects.equals(str, "com.google.android.setupwizard")) {
                return aggaVar;
            }
            android.content.res.Resources resources = aggaVar.d;
            java.lang.String resourceTypeName = resources.getResourceTypeName(aggaVar.c);
            java.lang.String strConcat = aggaVar.b.concat("_expressive");
            int identifier = resources.getIdentifier(strConcat, resourceTypeName, str);
            if (identifier == 0) {
                return aggaVar;
            }
            android.util.Log.i("PartnerConfigHelper", a.bx(strConcat, "use expressive resource:"));
            return new defpackage.agga(str, strConcat, identifier, resources);
        } catch (android.content.res.Resources.NotFoundException unused) {
            return aggaVar;
        }
    }

    static final defpackage.agga I(defpackage.agga aggaVar) {
        try {
            java.lang.String str = aggaVar.a;
            if (!j$.util.Objects.equals(str, "com.google.android.setupwizard")) {
                return aggaVar;
            }
            android.content.res.Resources resources = aggaVar.d;
            java.lang.String resourceTypeName = resources.getResourceTypeName(aggaVar.c);
            java.lang.String strConcat = aggaVar.b.concat("_material_you");
            int identifier = resources.getIdentifier(strConcat, resourceTypeName, str);
            if (identifier == 0) {
                return aggaVar;
            }
            android.util.Log.i("PartnerConfigHelper", a.bx(strConcat, "use material you resource:"));
            return new defpackage.agga(str, strConcat, identifier, resources);
        } catch (android.content.res.Resources.NotFoundException unused) {
            return aggaVar;
        }
    }

    public static boolean J(android.content.Context context) {
        android.os.Bundle bundleH = h(context, "isSuwUseModalDialogEnabled", "Method isSuwUseModalDialogEnabled is unknown; return as false.");
        if (bundleH == null || bundleH.isEmpty()) {
            return false;
        }
        return bundleH.getBoolean("isSuwUseModalDialogEnabled", false);
    }

    private static float L(android.content.Context context, android.util.TypedValue typedValue) {
        return typedValue.getDimension(context.getResources().getDisplayMetrics());
    }

    public static android.app.Activity d(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (context instanceof android.content.ContextWrapper) {
            return d(((android.content.ContextWrapper) context).getBaseContext());
        }
        throw new java.lang.IllegalArgumentException("Cannot find instance of Activity in parent tree");
    }

    static android.net.Uri f() {
        return new android.net.Uri.Builder().scheme("content").authority("com.google.android.setupwizard.partner").build();
    }

    public static android.os.Bundle g(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        return (bundle == null || bundle.isEmpty()) ? h(context, str, str.concat(" status is unknown; return as false.")) : bundle;
    }

    public static android.os.Bundle h(android.content.Context context, java.lang.String str, java.lang.String str2) {
        try {
            if (j$.util.Objects.equals(android.os.Build.FINGERPRINT, "robolectric")) {
                android.util.Log.w("PartnerConfigHelper", "Robolectric detected, bypassing system app check for partner provider.");
            } else {
                try {
                    if (android.app.ActivityManager.isRunningInTestHarness()) {
                        android.util.Log.w("PartnerConfigHelper", "Test harness detected, bypassing system app check for partner provider.");
                    } else {
                        if ((android.os.Build.HARDWARE == null || !(android.os.Build.HARDWARE.contains("goldfish") || android.os.Build.HARDWARE.contains("ranchu") || android.os.Build.HARDWARE.contains("cutf") || android.os.Build.HARDWARE.contains("starfish") || android.os.Build.HARDWARE.contains("gce_x86"))) && ((android.os.Build.FINGERPRINT == null || !(android.os.Build.FINGERPRINT.contains("emulator") || android.os.Build.FINGERPRINT.contains("emu64") || android.os.Build.FINGERPRINT.contains("generic") || android.os.Build.FINGERPRINT.contains("sdk_gphone") || android.os.Build.FINGERPRINT.startsWith("generic"))) && ((android.os.Build.PRODUCT == null || !(android.os.Build.PRODUCT.contains("sdk_gphone") || android.os.Build.PRODUCT.contains("generic") || android.os.Build.PRODUCT.contains("emulator") || android.os.Build.PRODUCT.contains("google_sdk") || android.os.Build.PRODUCT.startsWith("sdk_") || android.os.Build.PRODUCT.contains("cutf"))) && ((android.os.Build.MODEL == null || !(android.os.Build.MODEL.contains("google_sdk") || android.os.Build.MODEL.contains("Emulator") || android.os.Build.MODEL.contains("Android SDK built for"))) && ((android.os.Build.BOARD == null || !(android.os.Build.BOARD.contains("goldfish") || android.os.Build.BOARD.contains("cutf"))) && ((android.os.Build.MANUFACTURER == null || !android.os.Build.MANUFACTURER.equalsIgnoreCase("Genymotion")) && ((android.os.Build.BRAND == null || !android.os.Build.BRAND.startsWith("generic")) && (android.os.Build.DEVICE == null || !android.os.Build.DEVICE.startsWith("generic"))))))))) {
                            android.content.pm.ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.setupwizard.partner", 0);
                            if (providerInfoResolveContentProvider == null) {
                                android.util.Log.w("PartnerConfigHelper", "Failed to resolve partner provider: com.google.android.setupwizard.partner");
                            } else if (providerInfoResolveContentProvider.applicationInfo == null) {
                                android.util.Log.w("PartnerConfigHelper", "Failed to get application info for partner provider: com.google.android.setupwizard.partner");
                            } else if ((providerInfoResolveContentProvider.applicationInfo.flags & 129) == 0) {
                                android.util.Log.w("PartnerConfigHelper", "Partner provider is not a system app: com.google.android.setupwizard.partner");
                            }
                            android.util.Log.w("PartnerConfigHelper", "Partner provider is not a system app, skipping call to partner provider.");
                            return null;
                        }
                        android.util.Log.w("PartnerConfigHelper", "Emulator detected, bypassing system app check for partner provider.");
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
            android.os.Bundle bundleCall = context.getContentResolver().call(f(), str, (java.lang.String) null, (android.os.Bundle) null);
            android.util.Log.v("PartnerConfigHelper", hgb.l(bundleCall, str, "Partner provider method ", " returned bundle: "));
            return bundleCall;
        } catch (java.lang.IllegalArgumentException | java.lang.SecurityException unused2) {
            android.util.Log.w("PartnerConfigHelper", str2);
            return null;
        }
    }

    public static synchronized defpackage.agfz i(android.content.Context context) {
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        if (x == null) {
            A = p(context) && a.o();
            z = configuration.uiMode & 48;
            s = configuration.orientation;
            u = configuration.screenWidthDp;
            t = configuration.screenHeightDp;
        } else {
            boolean z2 = w(context) && (configuration.uiMode & 48) != z;
            boolean z3 = p(context) && a.o();
            if (z2 || z3 != A || configuration.orientation != s || configuration.screenWidthDp != u || configuration.screenHeightDp != t) {
                z = configuration.uiMode & 48;
                s = configuration.orientation;
                t = configuration.screenHeightDp;
                u = configuration.screenWidthDp;
                l();
            }
        }
        x = new defpackage.agfz(context);
        return x;
    }

    public static synchronized void l() {
        x = null;
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        g = null;
        h = null;
        k = null;
        l = null;
        i = null;
        m = null;
        n = null;
        j = null;
        o = null;
        p = null;
        q = null;
        r = null;
    }

    public static boolean p(android.content.Context context) {
        android.os.Bundle bundleH = g;
        if (bundleH == null) {
            bundleH = h(context, "isEmbeddedActivityOnePaneEnabled", "SetupWizard one-pane support in embedded activity status unknown; return as false.");
            g = bundleH;
        }
        if (bundleH != null) {
            return bundleH.getBoolean("isEmbeddedActivityOnePaneEnabled", false);
        }
        android.util.Log.d("PartnerConfigHelper", "isEmbeddedActivityOnePaneEnabled: false because applyEmbeddedActivityOnePaneBundle is null");
        return false;
    }

    public static boolean q(android.content.Context context) {
        android.os.Bundle bundle = n;
        if (bundle == null || bundle.isEmpty()) {
            n = h(context, "isEnhancedSetupDesignMetricsEnabled", "Enhanced setup design metrics status is unknown; return as false.");
        }
        android.os.Bundle bundle2 = n;
        if (bundle2 == null || bundle2.isEmpty()) {
            return false;
        }
        return n.getBoolean("isEnhancedSetupDesignMetricsEnabled", false);
    }

    public static boolean r(android.content.Context context) {
        android.os.Bundle bundleH = f;
        if (bundleH == null) {
            bundleH = h(context, "isFontWeightEnabled", "SetupWizard font weight supporting status unknown; return as false.");
            f = bundleH;
        }
        if (bundleH != null) {
            return bundleH.getBoolean("isFontWeightEnabled", true);
        }
        android.util.Log.w("PartnerConfigHelper", "isFontWeightEnabled: false because applyFontWeightBundle is null");
        return false;
    }

    public static synchronized boolean s(android.content.Context context) {
        boolean z2;
        android.os.Bundle bundle = k;
        if (bundle == null || bundle.isEmpty()) {
            k = h(context, "isForceTwoPaneEnabled", "isForceTwoPaneEnabled unknown; return isForceTwoPaneEnabled as default value.");
        }
        android.os.Bundle bundle2 = k;
        z2 = false;
        if (bundle2 == null) {
            android.util.Log.d("PartnerConfigHelper", "isForceTwoPaneEnabled: false because applyForceTwoPaneBundle is null");
        } else if (bundle2.isEmpty()) {
            android.util.Log.d("PartnerConfigHelper", "isForceTwoPaneEnabled: false because applyForceTwoPaneBundle is empty");
        } else {
            z2 = k.getBoolean("isForceTwoPaneEnabled", false);
        }
        return z2;
    }

    public static boolean t(android.content.Context context) {
        synchronized (B) {
            android.os.Bundle bundle = l;
            if (bundle == null || bundle.isEmpty()) {
                l = h(context, "isGlifExpressiveEnabled", "isGlifExpressiveEnabled status is unknown; return as false.");
            }
            android.os.Bundle bundle2 = l;
            if (bundle2 != null && !bundle2.isEmpty()) {
                android.util.Log.d("PartnerConfigHelper", "isGlifExpressiveEnabled: " + bundle2.getBoolean("isGlifExpressiveEnabled", false));
                return bundle2.getBoolean("isGlifExpressiveEnabled", false);
            }
            if (context.getTheme() == null) {
                return false;
            }
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{2130970526});
            boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
            typedArrayObtainStyledAttributes.recycle();
            android.util.Log.i("PartnerConfigHelper", "isGlifExpressiveStyleEnabled is " + z2);
            return z2;
        }
    }

    public static synchronized boolean u(android.content.Context context) {
        boolean z2;
        android.os.Bundle bundle = i;
        if (bundle == null || bundle.isEmpty()) {
            i = h(context, "isKeyboardFocusEnhancementEnabled", "SetupWizard keyboard focus enhancement status unknown; return as false.");
        }
        android.os.Bundle bundle2 = i;
        z2 = false;
        if (bundle2 != null && !bundle2.isEmpty()) {
            z2 = i.getBoolean("isKeyboardFocusEnhancementEnabled", false);
        }
        return z2;
    }

    public static boolean w(android.content.Context context) {
        android.os.Bundle bundleH = a;
        if (bundleH == null) {
            bundleH = h(context, "isSuwDayNightEnabled", "SetupWizard DayNight supporting status unknown; return as false.");
            a = bundleH;
        }
        if (bundleH != null) {
            return bundleH.getBoolean("isSuwDayNightEnabled", false);
        }
        android.util.Log.d("PartnerConfigHelper", "isSetupWizardDayNightEnabled: false because suwDayNightEnabledBundle is null");
        return false;
    }

    public static boolean x(android.content.Context context) {
        android.os.Bundle bundleH = d;
        if (bundleH == null) {
            bundleH = h(context, "isDynamicColorEnabled", "SetupWizard dynamic color supporting status unknown; return as false.");
            d = bundleH;
        }
        if (bundleH != null) {
            return bundleH.getBoolean("isDynamicColorEnabled", false);
        }
        android.util.Log.d("PartnerConfigHelper", "isSetupWizardDynamicColorEnabled: false because applyDynamicColorBundle is null");
        return false;
    }

    public static boolean y(android.content.Context context) {
        android.os.Bundle bundleH = e;
        if (bundleH == null) {
            bundleH = h(context, "isFullDynamicColorEnabled", "SetupWizard full dynamic color supporting status unknown; return as false.");
            e = bundleH;
        }
        if (bundleH != null) {
            return bundleH.getBoolean("isFullDynamicColorEnabled", false);
        }
        android.util.Log.d("PartnerConfigHelper", "isSetupWizardFullDynamicColorEnabled: false because applyFullDynamicColorBundle is null");
        return false;
    }

    public static boolean z(android.content.Context context) {
        android.os.Bundle bundleG = g(context, "isSuwUseA11yShortcutEnabled", p);
        p = bundleG;
        if (bundleG == null || bundleG.isEmpty()) {
            return false;
        }
        return p.getBoolean("isSuwUseA11yShortcutEnabled", false);
    }

    public final float K(android.content.Context context, defpackage.agfx agfxVar) {
        if (agfxVar.bU != 7) {
            throw new java.lang.IllegalArgumentException("Not a fraction resource");
        }
        java.util.EnumMap enumMap = this.w;
        if (enumMap.containsKey(agfxVar)) {
            return ((java.lang.Float) this.w.get(agfxVar)).floatValue();
        }
        try {
            defpackage.agga aggaVarJ = j(context, agfxVar.bT);
            float fraction = aggaVarJ.d.getFraction(aggaVarJ.c, 1, 1);
            try {
                enumMap.put(agfxVar, java.lang.Float.valueOf(fraction));
                return fraction;
            } catch (android.content.res.Resources.NotFoundException | java.lang.NullPointerException unused) {
                return fraction;
            }
        } catch (android.content.res.Resources.NotFoundException | java.lang.NullPointerException unused2) {
            return 0.0f;
        }
    }

    public final float a(android.content.Context context, defpackage.agfx agfxVar, float f2) {
        if (agfxVar.bU != 6) {
            throw new java.lang.IllegalArgumentException("Not a dimension resource");
        }
        java.util.EnumMap enumMap = this.w;
        if (enumMap.containsKey(agfxVar)) {
            return L(context, (android.util.TypedValue) this.w.get(agfxVar));
        }
        try {
            defpackage.agga aggaVarJ = j(context, agfxVar.bT);
            android.content.res.Resources resources = aggaVarJ.d;
            int i2 = aggaVarJ.c;
            resources.getDimension(i2);
            android.util.TypedValue typedValue = new android.util.TypedValue();
            resources.getValue(i2, typedValue, true);
            if (typedValue.type == 5) {
                enumMap.put(agfxVar, typedValue);
                return L(context, (android.util.TypedValue) enumMap.get(agfxVar));
            }
            throw new android.content.res.Resources.NotFoundException("Resource ID #0x" + java.lang.Integer.toHexString(i2) + " type #0x" + java.lang.Integer.toHexString(typedValue.type) + " is not valid");
        } catch (android.content.res.Resources.NotFoundException | java.lang.NullPointerException unused) {
            return f2;
        }
    }

    public final int b(android.content.Context context, defpackage.agfx agfxVar) {
        if (agfxVar.bU != 3) {
            throw new java.lang.IllegalArgumentException("Not a color resource");
        }
        java.util.EnumMap enumMap = this.w;
        if (enumMap.containsKey(agfxVar)) {
            return ((java.lang.Integer) this.w.get(agfxVar)).intValue();
        }
        int color = 0;
        try {
            defpackage.agga aggaVarJ = j(context, agfxVar.bT);
            android.content.res.Resources resources = aggaVarJ.d;
            int i2 = aggaVarJ.c;
            android.util.TypedValue typedValue = new android.util.TypedValue();
            resources.getValue(i2, typedValue, true);
            if (typedValue.type == 1 && typedValue.data == 0) {
                return 0;
            }
            color = resources.getColor(i2, null);
            enumMap.put(agfxVar, java.lang.Integer.valueOf(color));
            return color;
        } catch (android.content.res.Resources.NotFoundException | java.lang.NullPointerException unused) {
            return color;
        }
    }

    public final int c(android.content.Context context, defpackage.agfx agfxVar, int i2) {
        if (agfxVar.bU != 1) {
            throw new java.lang.IllegalArgumentException("Not a integer resource");
        }
        java.util.EnumMap enumMap = this.w;
        if (enumMap.containsKey(agfxVar)) {
            return ((java.lang.Integer) this.w.get(agfxVar)).intValue();
        }
        try {
            defpackage.agga aggaVarJ = j(context, agfxVar.bT);
            i2 = aggaVarJ.d.getInteger(aggaVarJ.c);
            enumMap.put(agfxVar, java.lang.Integer.valueOf(i2));
            return i2;
        } catch (android.content.res.Resources.NotFoundException | java.lang.NullPointerException unused) {
            return i2;
        }
    }

    public final android.graphics.drawable.Drawable e(android.content.Context context, defpackage.agfx agfxVar) {
        if (agfxVar.bU != 4) {
            throw new java.lang.IllegalArgumentException("Not a drawable resource");
        }
        java.util.EnumMap enumMap = this.w;
        if (enumMap.containsKey(agfxVar)) {
            return (android.graphics.drawable.Drawable) this.w.get(agfxVar);
        }
        android.graphics.drawable.Drawable drawable = null;
        try {
            defpackage.agga aggaVarJ = j(context, agfxVar.bT);
            android.content.res.Resources resources = aggaVarJ.d;
            int i2 = aggaVarJ.c;
            android.util.TypedValue typedValue = new android.util.TypedValue();
            resources.getValue(i2, typedValue, true);
            if (typedValue.type == 1 && typedValue.data == 0) {
                return null;
            }
            drawable = resources.getDrawable(i2, null);
            enumMap.put(agfxVar, drawable);
            return drawable;
        } catch (android.content.res.Resources.NotFoundException | java.lang.NullPointerException unused) {
            return drawable;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    final defpackage.agga j(android.content.Context context, java.lang.String str) {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = this.v.getBundle(str);
        android.os.Bundle bundle3 = this.v.getBundle("fallbackConfig");
        if (bundle3 != null) {
            bundle2.putBundle("fallbackConfig", bundle3.getBundle(str));
        }
        defpackage.agga aggaVarA = defpackage.agga.a(context, bundle2);
        if (a.o() && n(context)) {
            aggaVarA = F(context, aggaVarA);
        }
        if (!aggaVarA.b.endsWith("_embedded_activity")) {
            if (afsq.p() && t(context)) {
                aggaVarA = H(aggaVarA);
            } else if (a.o() && s(context)) {
                aggaVarA = G(context, aggaVarA);
            } else if (afsq.o()) {
                android.os.Bundle bundle4 = c;
                if (bundle4 == null || bundle4.isEmpty()) {
                    android.os.Bundle bundleH = h(context, "IsMaterialYouStyleEnabled", "SetupWizard Material You configs supporting status unknown; return as false.");
                    c = bundleH;
                    if (bundleH == null || !bundleH.isEmpty() || afsq.o()) {
                        bundle = c;
                        if (bundle != null && (bundle.getBoolean("IsMaterialYouStyleEnabled", false) || t(context))) {
                            aggaVarA = I(aggaVarA);
                        }
                    } else if (D(context)) {
                        aggaVarA = I(aggaVarA);
                    }
                } else {
                    bundle = c;
                    if (bundle != null) {
                        aggaVarA = I(aggaVarA);
                    }
                }
            }
        }
        if (android.util.Log.isLoggable("PartnerConfigHelper", 2)) {
            android.util.Log.v("PartnerConfigHelper", hgb.l(aggaVarA, str, "getResourceEntryFromKey:", ", resourceEntry:"));
        }
        android.content.res.Resources resources = aggaVarA.d;
        android.content.res.Configuration configuration = resources.getConfiguration();
        if (!w(context) && (configuration.uiMode & 48) == 32) {
            if (aggaVarA == null) {
                android.util.Log.w("PartnerConfigHelper", "resourceEntry is null, skip to force day mode.");
            } else {
                configuration.uiMode = (configuration.uiMode & (-49)) | 16;
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            }
        }
        return aggaVarA;
    }

    public final java.lang.String k(android.content.Context context, defpackage.agfx agfxVar) {
        if (agfxVar.bU != 5) {
            throw new java.lang.IllegalArgumentException("Not a string resource");
        }
        java.util.EnumMap enumMap = this.w;
        if (enumMap.containsKey(agfxVar)) {
            return (java.lang.String) this.w.get(agfxVar);
        }
        try {
            defpackage.agga aggaVarJ = j(context, agfxVar.bT);
            java.lang.String string = aggaVarJ.d.getString(aggaVarJ.c);
            try {
                enumMap.put(agfxVar, string);
                return string;
            } catch (android.content.res.Resources.NotFoundException | java.lang.NullPointerException unused) {
                return string;
            }
        } catch (android.content.res.Resources.NotFoundException | java.lang.NullPointerException unused2) {
            return null;
        }
    }

    public final boolean m(android.content.Context context, defpackage.agfx agfxVar, boolean z2) {
        if (agfxVar.bU != 2) {
            throw new java.lang.IllegalArgumentException("Not a bool resource");
        }
        java.util.EnumMap enumMap = this.w;
        if (enumMap.containsKey(agfxVar)) {
            return ((java.lang.Boolean) this.w.get(agfxVar)).booleanValue();
        }
        try {
            defpackage.agga aggaVarJ = j(context, agfxVar.bT);
            z2 = aggaVarJ.d.getBoolean(aggaVarJ.c);
            enumMap.put(agfxVar, java.lang.Boolean.valueOf(z2));
            return z2;
        } catch (android.content.res.Resources.NotFoundException | java.lang.NullPointerException unused) {
            return z2;
        }
    }

    public final boolean n(android.content.Context context) {
        try {
            android.app.Activity activityD = d(context);
            return p(context) && gus.aT(activityD).aa(activityD);
        } catch (java.lang.IllegalArgumentException unused) {
            android.util.Log.w("PartnerConfigHelper", "Not a Activity instance in parent tree");
            return false;
        }
    }

    public final boolean o() {
        android.os.Bundle bundle = this.v;
        return (bundle == null || bundle.isEmpty()) ? false : true;
    }

    public final boolean v(defpackage.agfx agfxVar) {
        return o() && this.v.containsKey(agfxVar.bT);
    }
}
