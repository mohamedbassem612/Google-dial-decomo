package androidx.car.app;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class CarAppBinder extends androidx.car.app.ICarApp.Stub {
    private volatile int mAuthenticatedUid = -1;
    private volatile defpackage.ue mCurrentSession;
    private final androidx.car.app.SessionInfo mCurrentSessionInfo;
    private androidx.car.app.HandshakeInfo mHandshakeInfo;
    private defpackage.abo mHostValidator;
    private volatile defpackage.tp mService;

    public CarAppBinder(defpackage.tp tpVar, androidx.car.app.SessionInfo sessionInfo) {
        this.mService = tpVar;
        this.mCurrentSessionInfo = sessionInfo;
    }

    private ems getCurrentLifecycle() {
        defpackage.ue ueVar = this.mCurrentSession;
        if (ueVar == null) {
            return null;
        }
        return ueVar.a;
    }

    private defpackage.abo getHostValidator() {
        defpackage.abo aboVar = this.mHostValidator;
        if (aboVar != null) {
            return aboVar;
        }
        defpackage.abo aboVarC = ((defpackage.tp) j$.util.Objects.requireNonNull(this.mService)).c();
        this.mHostValidator = aboVarC;
        return aboVarC;
    }

    private boolean isValidCaller(int i) {
        return this.mAuthenticatedUid != -1 && i == this.mAuthenticatedUid;
    }

    private boolean isValidCallingUid(int i, java.lang.String[] strArr) {
        if (strArr == null) {
            return false;
        }
        for (java.lang.String str : strArr) {
            if (getHostValidator().a(new defpackage.ty(str, i))) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidClaimedPackage(java.lang.String str, java.lang.String[] strArr) {
        if (strArr == null) {
            return false;
        }
        for (java.lang.String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void onConfigurationChangedInternal(defpackage.ue ueVar, android.content.res.Configuration configuration) {
        defpackage.abn.a();
        if (android.util.Log.isLoggable("CarApp", 3)) {
            java.util.Objects.toString(configuration);
            android.util.Log.d("CarApp", "onCarConfigurationChanged configuration: ".concat(java.lang.String.valueOf(configuration)));
        }
        defpackage.tt ttVar = ueVar.b;
        ttVar.c(configuration);
        ttVar.getResources().getConfiguration();
    }

    private boolean onHandshakeAlreadyCompletedException(java.lang.String str, androidx.car.app.IOnDoneCallback iOnDoneCallback, int i) {
        if (this.mAuthenticatedUid == -1 || i == this.mAuthenticatedUid) {
            return false;
        }
        defpackage.rx.j(iOnDoneCallback, str, new java.lang.SecurityException("Handshake already completed by another host"));
        return true;
    }

    private boolean onHostCallException(java.lang.String str, androidx.car.app.IOnDoneCallback iOnDoneCallback, int i) {
        if (this.mService == null) {
            defpackage.rx.j(iOnDoneCallback, str, new java.lang.IllegalStateException("Service is null"));
            return true;
        }
        if (isValidCaller(i)) {
            return false;
        }
        defpackage.rx.j(iOnDoneCallback, str, new java.lang.SecurityException("Calling UID does not match authenticated UID"));
        return true;
    }

    private void onNewIntentInternal(defpackage.ue ueVar, android.content.Intent intent) {
        defpackage.abn.a();
        ueVar.d(intent);
    }

    private defpackage.ty verifyHandshakeInfo(defpackage.tp tpVar, int i, androidx.car.app.HandshakeInfo handshakeInfo) {
        java.lang.String[] packagesForUid = tpVar.getPackageManager().getPackagesForUid(i);
        if (!isValidCallingUid(i, packagesForUid)) {
            throw new java.lang.SecurityException(a.bj(i, "Unrecognized host with uid "));
        }
        java.lang.String hostPackageName = handshakeInfo.getHostPackageName();
        if (!isValidClaimedPackage(hostPackageName, packagesForUid)) {
            throw new java.lang.SecurityException(a.bu(i, hostPackageName, "Claimed host package name ", " does not match calling UID "));
        }
        defpackage.ty tyVar = new defpackage.ty(hostPackageName, i);
        if (!getHostValidator().a(tyVar)) {
            throw new java.lang.SecurityException("The host is not allowed to call this service");
        }
        androidx.car.app.AppInfo appInfoA = tpVar.a();
        int minCarAppApiLevel = appInfoA.getMinCarAppApiLevel();
        int latestCarAppApiLevel = appInfoA.getLatestCarAppApiLevel();
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        if (minCarAppApiLevel > hostCarAppApiLevel) {
            throw new java.lang.IllegalArgumentException(a.bv((byte) 41, minCarAppApiLevel, hostCarAppApiLevel, "Host API level (", ") is less than the app's min API level ("));
        }
        if (latestCarAppApiLevel >= hostCarAppApiLevel) {
            return tyVar;
        }
        throw new java.lang.IllegalArgumentException(a.bv((byte) 41, latestCarAppApiLevel, hostCarAppApiLevel, "Host API level (", ") is greater than the app's max API level ("));
    }

    public void destroy() {
        onDestroyLifecycle();
        this.mHostValidator = null;
        this.mHandshakeInfo = null;
        this.mService = null;
    }

    @Override // androidx.car.app.ICarApp
    public void getAppInfo(final androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        defpackage.abn.b(new java.lang.Runnable() { // from class: ti
            @Override // java.lang.Runnable
            public final void run() {
                this.a.m14lambda$getAppInfo$0$androidxcarappCarAppBinder(iOnDoneCallback);
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void getAppTheme(androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        defpackage.rx.h(getCurrentLifecycle(), iOnDoneCallback, "getAppTheme", new defpackage.abc() { // from class: tf
            @Override // defpackage.abc
            public final java.lang.Object a() {
                return this.a.m15lambda$getAppTheme$0$androidxcarappCarAppBinder();
            }
        });
    }

    defpackage.tp getCarAppService() {
        return this.mService;
    }

    defpackage.ue getCurrentSession() {
        return this.mCurrentSession;
    }

    public androidx.car.app.SessionInfo getCurrentSessionInfo() {
        return this.mCurrentSessionInfo;
    }

    public androidx.car.app.HandshakeInfo getHandshakeInfo() {
        return this.mHandshakeInfo;
    }

    @Override // androidx.car.app.ICarApp
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.ICarApp
    public void getManager(final java.lang.String str, final androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("getManager", iOnDoneCallback, android.os.Binder.getCallingUid())) {
            return;
        }
        defpackage.abn.b(new java.lang.Runnable() { // from class: tm
            @Override // java.lang.Runnable
            public final void run() {
                this.a.m16lambda$getManager$0$androidxcarappCarAppBinder(str, iOnDoneCallback);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getAppInfo$0$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ void m14lambda$getAppInfo$0$androidxcarappCarAppBinder(androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        defpackage.tp tpVar = this.mService;
        if (tpVar == null) {
            defpackage.rx.j(iOnDoneCallback, "getAppInfo", new java.lang.IllegalStateException("Service is null"));
            return;
        }
        try {
            defpackage.rx.k(iOnDoneCallback, "getAppInfo", tpVar.a());
        } catch (java.lang.RuntimeException e) {
            defpackage.rx.j(iOnDoneCallback, "getAppInfo", e);
        }
    }

    /* JADX INFO: renamed from: lambda$getAppTheme$0$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ java.lang.Object m15lambda$getAppTheme$0$androidxcarappCarAppBinder() {
        defpackage.tp tpVar = this.mService;
        return 0;
    }

    /* JADX INFO: renamed from: lambda$getManager$0$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ void m16lambda$getManager$0$androidxcarappCarAppBinder(java.lang.String str, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        defpackage.ue ueVar = (defpackage.ue) j$.util.Objects.requireNonNull(this.mCurrentSession);
        int iHashCode = str.hashCode();
        if (iHashCode != 96801) {
            if (iHashCode == 1862666772 && str.equals("navigation")) {
                defpackage.rx.k(iOnDoneCallback, "getManager", ((defpackage.zv) ueVar.a().a(defpackage.zv.class)).a);
                return;
            }
        } else if (str.equals("app")) {
            defpackage.rx.k(iOnDoneCallback, "getManager", ((defpackage.tc) ueVar.a().a(defpackage.tc.class)).b);
            return;
        }
        android.util.Log.e("CarApp", java.lang.String.valueOf(str).concat("%s is not a valid manager"));
        defpackage.rx.j(iOnDoneCallback, "getManager", new java.security.InvalidParameterException(java.lang.String.valueOf(str).concat(" is not a valid manager type")));
    }

    /* JADX INFO: renamed from: lambda$onAppCreate$0$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ java.lang.Object m17lambda$onAppCreate$0$androidxcarappCarAppBinder(androidx.car.app.ICarHost iCarHost, android.content.res.Configuration configuration, android.content.Intent intent) {
        defpackage.tp tpVar = (defpackage.tp) j$.util.Objects.requireNonNull(this.mService);
        defpackage.ue ueVarB = this.mCurrentSession;
        if (ueVarB == null || ueVarB.a.d == emq.a) {
            ueVarB = tpVar.b();
            this.mCurrentSession = ueVarB;
        }
        androidx.car.app.HandshakeInfo handshakeInfo = (androidx.car.app.HandshakeInfo) j$.util.Objects.requireNonNull(getHandshakeInfo());
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        defpackage.tt ttVar = ueVarB.b;
        ttVar.d = hostCarAppApiLevel;
        ttVar.b(tpVar, configuration);
        defpackage.abn.a();
        androidx.car.app.ICarHost iCarHost2 = (androidx.car.app.ICarHost) j$.util.Objects.requireNonNull(iCarHost);
        defpackage.abn.a();
        defpackage.tw twVar = ttVar.b;
        twVar.a();
        twVar.a = iCarHost2;
        emy emyVar = ueVarB.a;
        emq emqVar = emyVar.d;
        int size = ((defpackage.uc) ueVarB.a().a(defpackage.uc.class)).a.size();
        if (emqVar.a(emq.c) && size > 0) {
            if (android.util.Log.isLoggable("CarApp", 3)) {
                android.util.Log.d("CarApp", "onAppCreate the app was already created");
            }
            onNewIntentInternal(ueVarB, intent);
            return null;
        }
        if (android.util.Log.isLoggable("CarApp", 3)) {
            android.util.Log.d("CarApp", "onAppCreate the app was not yet created or the screen stack was empty state: " + emyVar.d + ", stack size: " + size);
        }
        ueVarB.c(emp.ON_CREATE);
        ((defpackage.uc) ueVarB.a().a(defpackage.uc.class)).e(ueVarB.b(intent));
        return null;
    }

    /* JADX INFO: renamed from: lambda$onAppPause$0$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ java.lang.Object m18lambda$onAppPause$0$androidxcarappCarAppBinder() {
        ((defpackage.ue) j$.util.Objects.requireNonNull(this.mCurrentSession)).c(emp.ON_PAUSE);
        return null;
    }

    /* JADX INFO: renamed from: lambda$onAppResume$0$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ java.lang.Object m19lambda$onAppResume$0$androidxcarappCarAppBinder() {
        ((defpackage.ue) j$.util.Objects.requireNonNull(this.mCurrentSession)).c(emp.ON_RESUME);
        return null;
    }

    /* JADX INFO: renamed from: lambda$onAppStart$0$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ java.lang.Object m20lambda$onAppStart$0$androidxcarappCarAppBinder() {
        ((defpackage.ue) j$.util.Objects.requireNonNull(this.mCurrentSession)).c(emp.ON_START);
        return null;
    }

    /* JADX INFO: renamed from: lambda$onAppStop$0$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ java.lang.Object m21lambda$onAppStop$0$androidxcarappCarAppBinder() {
        ((defpackage.ue) j$.util.Objects.requireNonNull(this.mCurrentSession)).c(emp.ON_STOP);
        return null;
    }

    /* JADX INFO: renamed from: lambda$onConfigurationChanged$0$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ java.lang.Object m22lambda$onConfigurationChanged$0$androidxcarappCarAppBinder(android.content.res.Configuration configuration) {
        onConfigurationChangedInternal((defpackage.ue) j$.util.Objects.requireNonNull(this.mCurrentSession), configuration);
        return null;
    }

    /* JADX INFO: renamed from: lambda$onHandshakeCompleted$0$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ void m23lambda$onHandshakeCompleted$0$androidxcarappCarAppBinder(androidx.car.app.IOnDoneCallback iOnDoneCallback, int i, androidx.car.app.serialization.Bundleable bundleable) {
        if (onHandshakeAlreadyCompletedException("onHandshakeCompleted", iOnDoneCallback, i)) {
            return;
        }
        defpackage.tp tpVar = this.mService;
        if (tpVar == null) {
            defpackage.rx.j(iOnDoneCallback, "onHandshakeCompleted", new java.lang.IllegalStateException("Service is null"));
            return;
        }
        try {
            androidx.car.app.HandshakeInfo handshakeInfo = (androidx.car.app.HandshakeInfo) bundleable.a();
            if (handshakeInfo == null) {
                throw new java.lang.IllegalArgumentException("Handshake info is null");
            }
            tpVar.b = verifyHandshakeInfo(tpVar, i, handshakeInfo);
            this.mHandshakeInfo = handshakeInfo;
            this.mAuthenticatedUid = i;
            defpackage.rx.k(iOnDoneCallback, "onHandshakeCompleted", null);
        } catch (defpackage.aav | java.lang.RuntimeException e) {
            tpVar.b = null;
            this.mAuthenticatedUid = -1;
            defpackage.rx.j(iOnDoneCallback, "onHandshakeCompleted", e);
        }
    }

    /* JADX INFO: renamed from: lambda$onNewIntent$0$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ java.lang.Object m24lambda$onNewIntent$0$androidxcarappCarAppBinder(android.content.Intent intent) {
        onNewIntentInternal((defpackage.ue) j$.util.Objects.requireNonNull(this.mCurrentSession), intent);
        return null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppCreate(final androidx.car.app.ICarHost iCarHost, final android.content.Intent intent, final android.content.res.Configuration configuration, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        int callingUid = android.os.Binder.getCallingUid();
        if (android.util.Log.isLoggable("CarApp", 3)) {
            java.util.Objects.toString(intent);
            android.util.Log.d("CarApp", "onAppCreate intent: ".concat(java.lang.String.valueOf(intent)));
        }
        if (onHostCallException("onAppCreate", iOnDoneCallback, callingUid)) {
            return;
        }
        defpackage.rx.f(iOnDoneCallback, "onAppCreate", new defpackage.abc() { // from class: tk
            @Override // defpackage.abc
            public final java.lang.Object a() {
                this.a.m17lambda$onAppCreate$0$androidxcarappCarAppBinder(iCarHost, configuration, intent);
                return null;
            }
        });
        if (android.util.Log.isLoggable("CarApp", 3)) {
            android.util.Log.d("CarApp", "onAppCreate completed");
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onAppPause(androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onAppPause", iOnDoneCallback, android.os.Binder.getCallingUid())) {
            return;
        }
        defpackage.rx.h(getCurrentLifecycle(), iOnDoneCallback, "onAppPause", new defpackage.abc() { // from class: tg
            @Override // defpackage.abc
            public final java.lang.Object a() {
                this.a.m18lambda$onAppPause$0$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppResume(androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onAppResume", iOnDoneCallback, android.os.Binder.getCallingUid())) {
            return;
        }
        defpackage.rx.h(getCurrentLifecycle(), iOnDoneCallback, "onAppResume", new defpackage.abc() { // from class: te
            @Override // defpackage.abc
            public final java.lang.Object a() {
                this.a.m19lambda$onAppResume$0$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStart(androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onAppStart", iOnDoneCallback, android.os.Binder.getCallingUid())) {
            return;
        }
        defpackage.rx.h(getCurrentLifecycle(), iOnDoneCallback, "onAppStart", new defpackage.abc() { // from class: th
            @Override // defpackage.abc
            public final java.lang.Object a() {
                this.a.m20lambda$onAppStart$0$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStop(androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onAppStop", iOnDoneCallback, android.os.Binder.getCallingUid())) {
            return;
        }
        defpackage.rx.h(getCurrentLifecycle(), iOnDoneCallback, "onAppStop", new defpackage.abc() { // from class: tj
            @Override // defpackage.abc
            public final java.lang.Object a() {
                this.a.m21lambda$onAppStop$0$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    public void onAutoDriveEnabled() {
        defpackage.ue ueVar = this.mCurrentSession;
        if (ueVar != null) {
            defpackage.abn.a();
            if (android.util.Log.isLoggable("CarApp.Nav", 3)) {
                android.util.Log.d("CarApp.Nav", "Executing onAutoDriveEnabled");
            }
            android.util.Log.w("CarApp.Nav", "NavigationManagerCallback not set, skipping onAutoDriveEnabled");
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onConfigurationChanged(final android.content.res.Configuration configuration, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onConfigurationChanged", iOnDoneCallback, android.os.Binder.getCallingUid())) {
            return;
        }
        defpackage.rx.h(getCurrentLifecycle(), iOnDoneCallback, "onConfigurationChanged", new defpackage.abc() { // from class: td
            @Override // defpackage.abc
            public final java.lang.Object a() {
                this.a.m22lambda$onConfigurationChanged$0$androidxcarappCarAppBinder(configuration);
                return null;
            }
        });
    }

    public void onDestroyLifecycle() {
        defpackage.ue ueVar = this.mCurrentSession;
        if (ueVar != null) {
            ueVar.c(emp.ON_DESTROY);
        }
        this.mCurrentSession = null;
    }

    @Override // androidx.car.app.ICarApp
    public void onHandshakeCompleted(final androidx.car.app.serialization.Bundleable bundleable, final androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        final int callingUid = android.os.Binder.getCallingUid();
        defpackage.abn.b(new java.lang.Runnable() { // from class: tl
            @Override // java.lang.Runnable
            public final void run() {
                this.a.m23lambda$onHandshakeCompleted$0$androidxcarappCarAppBinder(iOnDoneCallback, callingUid, bundleable);
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onNewIntent(final android.content.Intent intent, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onNewIntent", iOnDoneCallback, android.os.Binder.getCallingUid())) {
            return;
        }
        defpackage.rx.h(getCurrentLifecycle(), iOnDoneCallback, "onNewIntent", new defpackage.abc() { // from class: tn
            @Override // defpackage.abc
            public final java.lang.Object a() {
                this.a.m24lambda$onNewIntent$0$androidxcarappCarAppBinder(intent);
                return null;
            }
        });
    }

    void setHandshakeInfo(androidx.car.app.HandshakeInfo handshakeInfo) {
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        int i = defpackage.abp.a;
        if (hostCarAppApiLevel <= 0 || hostCarAppApiLevel > defpackage.abp.a()) {
            throw new java.lang.IllegalArgumentException(a.bj(hostCarAppApiLevel, "Invalid Car App API level received: "));
        }
        this.mHandshakeInfo = handshakeInfo;
        this.mAuthenticatedUid = android.os.Binder.getCallingUid();
    }
}
