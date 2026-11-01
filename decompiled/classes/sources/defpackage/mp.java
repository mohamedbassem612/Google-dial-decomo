package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class mp extends defpackage.cm implements defpackage.emx, defpackage.eoi, defpackage.emn, defpackage.gii, defpackage.nh, defpackage.fxz, defpackage.oo, defpackage.oj, defpackage.dvz, defpackage.dwa, defpackage.dvs, defpackage.dvt, defpackage.dys {
    private defpackage.eoh a;
    private final defpackage.aoir b;
    private final java.util.concurrent.atomic.AtomicInteger c;
    private final java.util.concurrent.CopyOnWriteArrayList d;
    private final java.util.concurrent.CopyOnWriteArrayList e;
    public final defpackage.on g;
    public final java.util.concurrent.CopyOnWriteArrayList h;
    public final java.util.concurrent.CopyOnWriteArrayList i;
    public final java.util.concurrent.CopyOnWriteArrayList j;
    public final java.util.concurrent.CopyOnWriteArrayList k;
    public final defpackage.mn l;
    private final java.util.concurrent.CopyOnWriteArrayList n;
    private boolean o;
    private boolean p;
    private final defpackage.aoir q;
    private final defpackage.aoir r;
    private final defpackage.aoir s;
    private final defpackage.aoir t;
    private final defpackage.kaw u;
    public final defpackage.og f = new defpackage.og();
    public final defpackage.aogc m = new defpackage.aogc(new defpackage.am(this, 19));

    public mp() {
        defpackage.kaw kawVarU = defpackage.dzk.U(this);
        this.u = kawVarU;
        this.l = new defpackage.mn(this);
        this.b = new defpackage.aoiy(new defpackage.ml(this, 1));
        this.c = new java.util.concurrent.atomic.AtomicInteger();
        this.g = new defpackage.on(this);
        this.d = new java.util.concurrent.CopyOnWriteArrayList();
        this.h = new java.util.concurrent.CopyOnWriteArrayList();
        this.i = new java.util.concurrent.CopyOnWriteArrayList();
        this.j = new java.util.concurrent.CopyOnWriteArrayList();
        this.k = new java.util.concurrent.CopyOnWriteArrayList();
        this.e = new java.util.concurrent.CopyOnWriteArrayList();
        this.n = new java.util.concurrent.CopyOnWriteArrayList();
        int i = 0;
        this.q = new defpackage.aoiy(new defpackage.ml(this, i));
        int i2 = 2;
        this.r = new defpackage.aoiy(new defpackage.ml(this, i2));
        if (P() == null) {
            throw new java.lang.IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        P().c(new defpackage.mm(this, i));
        P().c(new defpackage.mm(this, i2));
        int i3 = 3;
        P().c(new defpackage.mm(this, 3, null));
        kawVarU.ad();
        defpackage.env.b(this);
        aT().e("android:support:activity-result", new defpackage.bf(this, i3));
        r(new defpackage.cz(this, i2));
        this.s = new defpackage.aoiy(new defpackage.ml(this, i3));
        this.t = new defpackage.aoiy(new defpackage.ml(this, 4));
    }

    public static final void u(defpackage.mp mpVar) {
        try {
            super.onBackPressed();
        } catch (java.lang.IllegalStateException e) {
            if (!defpackage.aooh.n(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (java.lang.NullPointerException e2) {
            if (!defpackage.aooh.n(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.oj
    public final defpackage.ok O(defpackage.or orVar, defpackage.oi oiVar) {
        defpackage.on onVar = this.g;
        defpackage.aooh.f(onVar, "registry");
        return onVar.b("activity_rq#" + this.c.getAndIncrement(), this, orVar, oiVar);
    }

    public defpackage.eoe R() {
        return (defpackage.eoe) this.s.a();
    }

    @Override // defpackage.eoi
    public final defpackage.eoh S() {
        if (getApplication() == null) {
            throw new java.lang.IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        s();
        defpackage.eoh eohVar = this.a;
        if (eohVar == null) {
            defpackage.aooh.g();
        }
        return eohVar;
    }

    public defpackage.eoq T() {
        defpackage.eos eosVar = new defpackage.eos((byte[]) null);
        if (getApplication() != null) {
            eosVar.b(defpackage.eod.b, getApplication());
        }
        eosVar.b(defpackage.env.a, this);
        eosVar.b(defpackage.env.b, this);
        android.os.Bundle bundleO = o();
        if (bundleO != null) {
            eosVar.b(defpackage.env.c, bundleO);
        }
        return eosVar;
    }

    @Override // defpackage.gii
    public final defpackage.aaha aT() {
        return this.u.ap();
    }

    @Override // android.app.Activity
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        ff();
        android.view.View decorView = getWindow().getDecorView();
        defpackage.aooh.e(decorView, "getDecorView(...)");
        this.l.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.oo
    public final defpackage.on d() {
        return this.g;
    }

    @Override // defpackage.dvz
    public final void e(defpackage.dxw dxwVar) {
        if (dxwVar == null) {
            defpackage.aooh.i("listener");
        }
        this.d.add(dxwVar);
    }

    @Override // defpackage.nh
    public final defpackage.nf fc() {
        return (defpackage.nf) this.t.a();
    }

    @Override // defpackage.fxz
    public final defpackage.fxy fd() {
        return fc().b();
    }

    public final void fe(defpackage.nf nfVar) {
        P().c(new defpackage.ne(nfVar, this, 1));
    }

    public final void ff() {
        android.view.View decorView = getWindow().getDecorView();
        defpackage.aooh.e(decorView, "getDecorView(...)");
        if (decorView == null) {
            defpackage.aooh.i("<this>");
        }
        decorView.setTag(2131429434, this);
        android.view.View decorView2 = getWindow().getDecorView();
        defpackage.aooh.e(decorView2, "getDecorView(...)");
        if (decorView2 == null) {
            defpackage.aooh.i("<this>");
        }
        decorView2.setTag(2131429438, this);
        android.view.View decorView3 = getWindow().getDecorView();
        defpackage.aooh.e(decorView3, "getDecorView(...)");
        if (decorView3 == null) {
            defpackage.aooh.i("<this>");
        }
        decorView3.setTag(2131429437, this);
        android.view.View decorView4 = getWindow().getDecorView();
        defpackage.aooh.e(decorView4, "getDecorView(...)");
        defpackage.den.bJ(decorView4, this);
        android.view.View decorView5 = getWindow().getDecorView();
        defpackage.aooh.e(decorView5, "getDecorView(...)");
        if (decorView5 == null) {
            defpackage.aooh.i("<this>");
        }
        decorView5.setTag(2131428782, this);
        android.view.View decorView6 = getWindow().getDecorView();
        defpackage.aooh.e(decorView6, "getDecorView(...)");
        if (decorView6 == null) {
            defpackage.aooh.i("<this>");
        }
        decorView6.setTag(2131429435, this);
    }

    @Override // defpackage.dvz
    public final void fg(defpackage.dxw dxwVar) {
        defpackage.aooh.f(dxwVar, "listener");
        this.d.remove(dxwVar);
    }

    public final android.os.Bundle o() {
        android.content.Intent intent;
        if ((defpackage.den.g || !((java.lang.Boolean) this.r.a()).booleanValue()) && (intent = getIntent()) != null) {
            return intent.getExtras();
        }
        return null;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (this.g.e(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ((defpackage.fyd) this.q.a()).b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        defpackage.aooh.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        java.util.Iterator it = this.d.iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((defpackage.dxw) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.cm, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        this.u.ae(bundle);
        this.f.b(this);
        super.onCreate(bundle);
        int i = defpackage.enp.a;
        defpackage.dzn.e(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        defpackage.aooh.f(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(0, menu);
        this.m.bp(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        defpackage.aooh.f(menuItem, "item");
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.m.br(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, android.content.res.Configuration configuration) {
        defpackage.aooh.f(configuration, "newConfig");
        this.o = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.o = false;
            java.util.Iterator it = this.j.iterator();
            defpackage.aooh.e(it, "iterator(...)");
            while (it.hasNext()) {
                defpackage.dxw dxwVar = (defpackage.dxw) it.next();
                defpackage.aooh.f(configuration, "newConfig");
                dxwVar.accept(new xhk(z));
            }
        } catch (java.lang.Throwable th) {
            this.o = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent intent) {
        defpackage.aooh.f(intent, "intent");
        super.onNewIntent(intent);
        java.util.Iterator it = this.i.iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((defpackage.dxw) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, android.view.Menu menu) {
        defpackage.aooh.f(menu, "menu");
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.m.b).iterator();
        while (it.hasNext()) {
            ((defpackage.bo) ((defpackage.apnt) it.next()).a).y(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, android.content.res.Configuration configuration) {
        defpackage.aooh.f(configuration, "newConfig");
        this.p = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.p = false;
            java.util.Iterator it = this.k.iterator();
            defpackage.aooh.e(it, "iterator(...)");
            while (it.hasNext()) {
                defpackage.dxw dxwVar = (defpackage.dxw) it.next();
                defpackage.aooh.f(configuration, "newConfig");
                dxwVar.accept(new xhk(z));
            }
        } catch (java.lang.Throwable th) {
            this.p = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(android.app.PictureInPictureUiState pictureInPictureUiState) {
        dve dveVar;
        defpackage.aooh.f(pictureInPictureUiState, "pipState");
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        defpackage.aooh.f(pictureInPictureUiState, "uiState");
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            mp$.ExternalSyntheticApiModelOutline0.m(pictureInPictureUiState);
            mp$.ExternalSyntheticApiModelOutline1.m(pictureInPictureUiState);
            dveVar = new dve();
        } else if (android.os.Build.VERSION.SDK_INT >= 31) {
            mp$.ExternalSyntheticApiModelOutline0.m(pictureInPictureUiState);
            dveVar = new dve();
        } else {
            dveVar = new dve();
        }
        java.util.Iterator it = this.e.iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((defpackage.dxw) it.next()).accept(dveVar);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
        defpackage.aooh.f(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(0, view, menu);
        this.m.bq(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        defpackage.aooh.f(strArr, "permissions");
        defpackage.aooh.f(iArr, "grantResults");
        if (this.g.e(i, -1, new android.content.Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
        defpackage.aiyy aiyyVar;
        java.lang.Object obj = this.a;
        if (obj == null && (aiyyVar = (defpackage.aiyy) getLastNonConfigurationInstance()) != null) {
            obj = aiyyVar.a;
        }
        if (obj == null) {
            return null;
        }
        defpackage.aiyy aiyyVar2 = new defpackage.aiyy();
        aiyyVar2.a = obj;
        return aiyyVar2;
    }

    @Override // defpackage.cm, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        defpackage.aooh.f(bundle, "outState");
        if (P() instanceof defpackage.emy) {
            defpackage.ems emsVarP = P();
            defpackage.aooh.d(emsVarP, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((defpackage.emy) emsVarP).g(defpackage.emq.c);
        }
        super.onSaveInstanceState(bundle);
        this.u.af(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        java.util.Iterator it = this.h.iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((defpackage.dxw) it.next()).accept(java.lang.Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        java.util.Iterator it = this.n.iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }

    public final void r(defpackage.oh ohVar) {
        defpackage.og ogVar = this.f;
        if (ogVar.b != null) {
            ohVar.a();
        }
        ogVar.a.add(ohVar);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (da$.ExternalSyntheticApiModelOutline0.m()) {
                android.os.Trace.beginSection(defpackage.dzk.H("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            defpackage.aewl aewlVarV = v();
            synchronized (aewlVarV.d) {
                aewlVarV.b = true;
                ?? r3 = aewlVarV.c;
                java.util.Iterator it = r3.iterator();
                while (it.hasNext()) {
                    ((defpackage.aomy) it.next()).a();
                }
                r3.clear();
            }
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    public final void s() {
        if (this.a == null) {
            defpackage.aiyy aiyyVar = (defpackage.aiyy) getLastNonConfigurationInstance();
            if (aiyyVar != null) {
                this.a = (defpackage.eoh) aiyyVar.a;
            }
            if (this.a == null) {
                this.a = new defpackage.eoh();
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        ff();
        android.view.View decorView = getWindow().getDecorView();
        defpackage.aooh.e(decorView, "getDecorView(...)");
        this.l.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(android.content.Intent intent, int i) {
        defpackage.aooh.f(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4) {
        defpackage.aooh.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final defpackage.aewl v() {
        return (defpackage.aewl) this.b.a();
    }

    @Override // android.app.Activity
    public final void startActivityForResult(android.content.Intent intent, int i, android.os.Bundle bundle) {
        defpackage.aooh.f(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) {
        defpackage.aooh.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View view) {
        ff();
        android.view.View decorView = getWindow().getDecorView();
        defpackage.aooh.e(decorView, "getDecorView(...)");
        this.l.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        ff();
        android.view.View decorView = getWindow().getDecorView();
        defpackage.aooh.e(decorView, "getDecorView(...)");
        this.l.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.o) {
            return;
        }
        java.util.Iterator it = this.j.iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((defpackage.dxw) it.next()).accept(new xhk(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.p) {
            return;
        }
        java.util.Iterator it = this.k.iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((defpackage.dxw) it.next()).accept(new xhk(z));
        }
    }
}
