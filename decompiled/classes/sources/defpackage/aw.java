package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aw implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, defpackage.emx, defpackage.eoi, defpackage.emn, defpackage.gii, defpackage.oj {
    static final java.lang.Object f = new java.lang.Object();
    int A;
    public defpackage.bo B;
    public defpackage.bd C;
    public defpackage.aw E;
    public int F;
    public int G;
    public java.lang.String H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    boolean M;
    public boolean O;
    public android.view.ViewGroup P;
    public android.view.View Q;
    boolean R;
    public defpackage.at T;
    android.os.Handler U;
    boolean W;
    android.view.LayoutInflater X;
    boolean Y;
    public java.lang.String Z;
    public defpackage.emy ab;
    defpackage.cf ad;
    defpackage.eoe af;
    defpackage.kaw ai;
    public android.os.Bundle h;
    android.util.SparseArray i;
    android.os.Bundle j;
    java.lang.Boolean k;
    public android.os.Bundle m;
    defpackage.aw n;
    public int p;
    boolean r;
    public boolean s;
    boolean t;
    boolean u;
    public boolean v;
    boolean w;
    public boolean x;
    boolean y;
    boolean z;
    public int g = -1;
    public java.lang.String l = java.util.UUID.randomUUID().toString();
    public java.lang.String o = null;
    public java.lang.Boolean q = null;
    defpackage.bo D = new defpackage.bo();
    boolean N = true;
    public boolean S = true;
    final java.lang.Runnable V = new defpackage.am(this, 10, null);
    public defpackage.emq aa = defpackage.emq.e;
    final defpackage.og ac = new defpackage.og();
    final defpackage.eng ae = new defpackage.eng();
    public final defpackage.den aj = new defpackage.den((short[]) null);
    public final java.util.concurrent.atomic.AtomicInteger ag = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.ArrayList ah = new java.util.ArrayList();
    private final defpackage.av a = new defpackage.aq(this);
    private final defpackage.av b = new defpackage.ar(this);

    public aw() {
        dY();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: au */
    @java.lang.Deprecated
    public static defpackage.aw F(android.content.Context context, java.lang.String str, android.os.Bundle bundle) throws au {
        try {
            java.lang.ClassLoader classLoader = context.getClassLoader();
            int i = defpackage.bc.a;
            try {
                defpackage.aw awVar = (defpackage.aw) defpackage.bc.a(classLoader, str).getConstructor(null).newInstance(null);
                if (bundle != null) {
                    bundle.setClassLoader(awVar.getClass().getClassLoader());
                    awVar.au(bundle);
                }
                return awVar;
            } catch (java.lang.ClassCastException e) {
                throw new au("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
            } catch (java.lang.ClassNotFoundException e2) {
                throw new au("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
            }
        } catch (java.lang.IllegalAccessException e3) {
            throw new au(defpackage.a.bk(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (java.lang.InstantiationException e4) {
            throw new au(defpackage.a.bk(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (java.lang.NoSuchMethodException e5) {
            throw new au(defpackage.a.bk(str, "Unable to instantiate fragment ", ": could not find Fragment constructor"), e5);
        } catch (java.lang.reflect.InvocationTargetException e6) {
            throw new au(defpackage.a.bk(str, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), e6);
        }
    }

    private final void c(defpackage.av avVar) {
        if (this.g >= 0) {
            avVar.a();
        } else {
            this.ah.add(avVar);
        }
    }

    private final int dP() {
        defpackage.emq emqVar = this.aa;
        return (emqVar == defpackage.emq.b || this.E == null) ? emqVar.ordinal() : java.lang.Math.min(emqVar.ordinal(), this.E.dP());
    }

    private final void dY() {
        this.ab = new defpackage.emy(this, true);
        this.ai = defpackage.dzk.U(this);
        this.af = null;
        java.util.ArrayList arrayList = this.ah;
        defpackage.av avVar = this.a;
        if (!arrayList.contains(avVar)) {
            c(avVar);
        }
        defpackage.av avVar2 = this.b;
        if (arrayList.contains(avVar2)) {
            return;
        }
        c(avVar2);
    }

    public final android.content.Context A() {
        android.content.Context contextZ = z();
        if (contextZ != null) {
            return contextZ;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bg(this, "Fragment ", " not attached to a context."));
    }

    public final android.os.Bundle C() {
        android.os.Bundle bundle = this.m;
        if (bundle != null) {
            return bundle;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bg(this, "Fragment ", " does not have any arguments."));
    }

    public final defpackage.at D() {
        defpackage.at atVar = this.T;
        if (atVar != null) {
            return atVar;
        }
        defpackage.at atVar2 = new defpackage.at();
        this.T = atVar2;
        return atVar2;
    }

    public final defpackage.aw E(boolean z) {
        java.lang.String str;
        if (z) {
            int i = eku.a;
            ekw ekwVar = new ekw(this);
            eku.d(ekwVar);
            ekt ektVarB = eku.b(this);
            if (ektVarB.b.contains(eks.h) && eku.e(ektVarB, getClass(), ekwVar.getClass())) {
                eku.c(ektVarB, ekwVar);
            }
        }
        defpackage.aw awVar = this.n;
        if (awVar != null) {
            return awVar;
        }
        defpackage.bo boVar = this.B;
        if (boVar == null || (str = this.o) == null) {
            return null;
        }
        return boVar.c(str);
    }

    public final defpackage.az G() {
        defpackage.bd bdVar = this.C;
        if (bdVar == null) {
            return null;
        }
        return (defpackage.az) bdVar.b;
    }

    public final defpackage.az H() {
        defpackage.az azVarG = G();
        if (azVarG != null) {
            return azVarG;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bg(this, "Fragment ", " not attached to an activity."));
    }

    public final defpackage.bo I() {
        if (this.C != null) {
            return this.D;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bg(this, "Fragment ", " has not been attached yet."));
    }

    public final defpackage.bo J() {
        defpackage.bo boVar = this.B;
        if (boVar != null) {
            return boVar;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bg(this, "Fragment ", " not associated with a fragment manager."));
    }

    public final android.view.LayoutInflater K() {
        android.view.LayoutInflater layoutInflater = this.X;
        return layoutInflater == null ? L(null) : layoutInflater;
    }

    final android.view.LayoutInflater L(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterE = e(bundle);
        this.X = layoutInflaterE;
        return layoutInflaterE;
    }

    public android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return null;
    }

    public final android.view.View N() {
        android.view.View view = this.Q;
        if (view != null) {
            return view;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bg(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    @Override // defpackage.oj
    public final defpackage.ok O(defpackage.or orVar, defpackage.oi oiVar) {
        defpackage.apnt apntVar = new defpackage.apnt(this, (byte[]) null);
        if (this.g > 1) {
            throw new java.lang.IllegalStateException(defpackage.a.bg(this, "Fragment ", " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        c(new defpackage.ao(this, apntVar, atomicReference, orVar, oiVar));
        return new defpackage.ap(atomicReference);
    }

    public defpackage.ems P() {
        return this.ab;
    }

    public final defpackage.emx Q() {
        defpackage.cf cfVar = this.ad;
        if (cfVar != null) {
            return cfVar;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bg(this, "Can't access the Fragment View's LifecycleOwner for ", " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    @Override // defpackage.emn
    public defpackage.eoe R() {
        android.app.Application application;
        if (this.B == null) {
            throw new java.lang.IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.af == null) {
            android.content.Context applicationContext = A().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof android.content.ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof android.app.Application) {
                    application = (android.app.Application) applicationContext;
                    break;
                }
                applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && defpackage.bo.Z(3)) {
                android.util.Log.d("FragmentManager", "Could not find Application instance from Context " + A().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.af = new defpackage.enw(application, this, this.m);
        }
        return this.af;
    }

    @Override // defpackage.eoi
    public final defpackage.eoh S() {
        if (this.B == null) {
            throw new java.lang.IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (dP() == defpackage.emq.b.ordinal()) {
            throw new java.lang.IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        java.util.HashMap map = this.B.z.d;
        defpackage.eoh eohVar = (defpackage.eoh) map.get(this.l);
        if (eohVar != null) {
            return eohVar;
        }
        defpackage.eoh eohVar2 = new defpackage.eoh();
        map.put(this.l, eohVar2);
        return eohVar2;
    }

    @Override // defpackage.emn
    public defpackage.eoq T() {
        byte[] bArr;
        android.app.Application application;
        android.content.Context applicationContext = A().getApplicationContext();
        while (true) {
            bArr = null;
            if (!(applicationContext instanceof android.content.ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof android.app.Application) {
                application = (android.app.Application) applicationContext;
                break;
            }
            applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && defpackage.bo.Z(3)) {
            android.util.Log.d("FragmentManager", "Could not find Application instance from Context " + A().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        defpackage.eos eosVar = new defpackage.eos(bArr);
        if (application != null) {
            eosVar.b(defpackage.eod.b, application);
        }
        eosVar.b(defpackage.env.a, this);
        eosVar.b(defpackage.env.b, this);
        android.os.Bundle bundle = this.m;
        if (bundle != null) {
            eosVar.b(defpackage.env.c, bundle);
        }
        return eosVar;
    }

    public final java.lang.CharSequence U(int i) {
        return dX().getText(i);
    }

    public final java.lang.Object V() {
        defpackage.at atVar = this.T;
        if (atVar == null) {
            return null;
        }
        return atVar.i;
    }

    public final java.lang.Object W() {
        defpackage.at atVar = this.T;
        if (atVar == null) {
            return null;
        }
        return atVar.k;
    }

    public final java.lang.Object X() {
        defpackage.bd bdVar = this.C;
        if (bdVar == null) {
            return null;
        }
        return ((defpackage.ay) bdVar).a;
    }

    public final java.lang.String Y(int i) {
        return dX().getString(i);
    }

    public final java.lang.String Z(int i, java.lang.Object... objArr) {
        return dX().getString(i, objArr);
    }

    final void aA(boolean z) {
        if (this.T != null) {
            D().a = z;
        }
    }

    final void aB(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        D();
        defpackage.at atVar = this.T;
        atVar.g = arrayList;
        atVar.h = arrayList2;
    }

    @java.lang.Deprecated
    public final void aC(boolean z) {
        defpackage.bo boVar;
        int i = eku.a;
        ela elaVar = new ela(this, z);
        eku.d(elaVar);
        ekt ektVarB = eku.b(this);
        if (ektVarB.b.contains(eks.g) && eku.e(ektVarB, getClass(), elaVar.getClass())) {
            eku.c(ektVarB, elaVar);
        }
        if (!this.S && z && this.g < 5 && (boVar = this.B) != null && aG() && this.Y) {
            boVar.N(boVar.j(this));
        }
        this.S = z;
        boolean z2 = false;
        if (this.g < 5 && !z) {
            z2 = true;
        }
        this.R = z2;
        if (this.h != null) {
            this.k = java.lang.Boolean.valueOf(z);
        }
    }

    public void aD(android.content.Intent intent) {
        aP(intent);
    }

    public final void aE() {
        if (this.T == null || !D().p) {
            return;
        }
        if (this.C == null) {
            D().p = false;
        } else if (android.os.Looper.myLooper() != this.C.d.getLooper()) {
            this.C.d.postAtFrontOfQueue(new defpackage.ae(this, 15, null));
        } else {
            ac(true);
        }
    }

    final boolean aF() {
        defpackage.at atVar = this.T;
        if (atVar == null) {
            return false;
        }
        return atVar.a;
    }

    public final boolean aG() {
        return this.C != null && this.r;
    }

    public final boolean aH() {
        defpackage.aw awVar;
        if (this.I) {
            return true;
        }
        return (this.B == null || (awVar = this.E) == null || !awVar.aH()) ? false : true;
    }

    final boolean aI() {
        return this.A > 0;
    }

    public final boolean aJ() {
        defpackage.bo boVar = this.B;
        if (boVar == null) {
            return false;
        }
        return boVar.ac();
    }

    public final boolean aK() {
        android.view.View view;
        return (!aG() || aH() || (view = this.Q) == null || view.getWindowToken() == null || this.Q.getVisibility() != 0) ? false : true;
    }

    public final boolean aL(java.lang.String str) {
        defpackage.bd bdVar = this.C;
        if (bdVar != null) {
            return dus.b(((defpackage.ay) bdVar).a, str);
        }
        return false;
    }

    @java.lang.Deprecated
    public final android.view.LayoutInflater aM() {
        defpackage.bd bdVar = this.C;
        if (bdVar == null) {
            throw new java.lang.IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        defpackage.az azVar = ((defpackage.ay) bdVar).a;
        android.view.LayoutInflater layoutInflaterCloneInContext = azVar.getLayoutInflater().cloneInContext(azVar);
        layoutInflaterCloneInContext.setFactory2(this.D.e);
        return layoutInflaterCloneInContext;
    }

    public final void aN() {
        this.O = true;
    }

    @java.lang.Deprecated
    public final void aO(defpackage.aw awVar) {
        int i = eku.a;
        ekz ekzVar = new ekz(this, awVar);
        eku.d(ekzVar);
        ekt ektVarB = eku.b(this);
        if (ektVarB.b.contains(eks.h) && eku.e(ektVarB, getClass(), ekzVar.getClass())) {
            eku.c(ektVarB, ekzVar);
        }
        defpackage.bo boVar = this.B;
        defpackage.bo boVar2 = awVar.B;
        if (boVar != null && boVar2 != null && boVar != boVar2) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bg(awVar, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));
        }
        for (defpackage.aw awVarE = awVar; awVarE != null; awVarE = awVarE.E(false)) {
            if (awVarE.equals(this)) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bl(this, awVar, "Setting ", " as the target of ", " would create a target cycle"));
            }
        }
        if (this.B == null || awVar.B == null) {
            this.o = null;
            this.n = awVar;
        } else {
            this.o = awVar.l;
            this.n = null;
        }
        this.p = 0;
    }

    public void aP(android.content.Intent intent) {
        defpackage.bd bdVar = this.C;
        if (bdVar == null) {
            throw new java.lang.IllegalStateException(defpackage.a.bg(this, "Fragment ", " not attached to Activity"));
        }
        bdVar.h(intent, -1);
    }

    @java.lang.Deprecated
    public final void aQ(android.content.Intent intent, int i) {
        if (this.C == null) {
            throw new java.lang.IllegalStateException(defpackage.a.bg(this, "Fragment ", " not attached to Activity"));
        }
        defpackage.bo boVarJ = J();
        if (boVarJ.r == null) {
            boVarJ.n.h(intent, i);
            return;
        }
        boVarJ.u.addLast(new android.support.v4.app.FragmentManager.LaunchedFragmentInfo(this.l, i));
        boVarJ.r.b(intent);
    }

    @Override // defpackage.gii
    public final defpackage.aaha aT() {
        return this.ai.ap();
    }

    final java.util.ArrayList aa() {
        java.util.ArrayList arrayList;
        defpackage.at atVar = this.T;
        return (atVar == null || (arrayList = atVar.g) == null) ? new java.util.ArrayList() : arrayList;
    }

    final java.util.ArrayList ab() {
        java.util.ArrayList arrayList;
        defpackage.at atVar = this.T;
        return (atVar == null || (arrayList = atVar.h) == null) ? new java.util.ArrayList() : arrayList;
    }

    final void ac(boolean z) {
        android.view.ViewGroup viewGroup;
        defpackage.bo boVar;
        defpackage.at atVar = this.T;
        if (atVar != null) {
            atVar.p = false;
        }
        if (this.Q == null || (viewGroup = this.P) == null || (boVar = this.B) == null) {
            return;
        }
        defpackage.ck ckVarBV = defpackage.den.bV(viewGroup, boVar);
        ckVarBV.g();
        if (z) {
            this.C.d.post(new defpackage.am(ckVarBV, 11, null));
        } else {
            ckVarBV.e();
        }
        android.os.Handler handler = this.U;
        if (handler != null) {
            handler.removeCallbacks(this.V);
            this.U = null;
        }
    }

    public void ad(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(java.lang.Integer.toHexString(this.F));
        printWriter.print(" mContainerId=#");
        printWriter.print(java.lang.Integer.toHexString(this.G));
        printWriter.print(" mTag=");
        printWriter.println(this.H);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.g);
        printWriter.print(" mWho=");
        printWriter.print(this.l);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.r);
        printWriter.print(" mRemoving=");
        printWriter.print(this.s);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.v);
        printWriter.print(" mInLayout=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.I);
        printWriter.print(" mDetached=");
        printWriter.print(this.J);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.N);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.K);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.S);
        if (this.B != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.B);
        }
        if (this.C != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.C);
        }
        if (this.E != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.E);
        }
        if (this.m != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.m);
        }
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.h);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.i);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.j);
        }
        defpackage.aw awVarE = E(false);
        if (awVarE != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(awVarE);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.p);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(aF());
        if (v() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(v());
        }
        if (w() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(w());
        }
        if (x() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(x());
        }
        if (dZ() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(dZ());
        }
        if (this.P != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.P);
        }
        if (this.Q != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.Q);
        }
        if (z() != null) {
            epc.a(this).c(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.D + ':');
        this.D.G(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    final void ae() {
        dY();
        this.Z = this.l;
        this.l = java.util.UUID.randomUUID().toString();
        this.r = false;
        this.s = false;
        this.v = false;
        this.w = false;
        this.y = false;
        this.A = 0;
        this.B = null;
        this.D = new defpackage.bo();
        this.C = null;
        this.F = 0;
        this.G = 0;
        this.H = null;
        this.I = false;
        this.J = false;
    }

    @java.lang.Deprecated
    public void af(android.os.Bundle bundle) {
        this.O = true;
    }

    @java.lang.Deprecated
    public void ag(int i, int i2, android.content.Intent intent) {
        if (defpackage.bo.Z(2)) {
            android.util.Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    @java.lang.Deprecated
    public void ah(android.app.Activity activity) {
        this.O = true;
    }

    public void ai() {
        this.O = true;
    }

    public void al() {
        this.O = true;
    }

    public void an() {
        this.O = true;
    }

    final void ap() {
        android.os.Bundle bundle = this.h;
        defpackage.den.bW(new defpackage.an(this, bundle != null ? bundle.getBundle("savedInstanceState") : null, 2));
        this.D.E(2);
    }

    public final void aq(long j, java.util.concurrent.TimeUnit timeUnit) {
        android.os.Handler handler;
        D().p = true;
        android.os.Handler handler2 = this.U;
        if (handler2 != null) {
            handler2.removeCallbacks(this.V);
        }
        defpackage.bo boVar = this.B;
        if (boVar != null) {
            handler = boVar.n.d;
            this.U = handler;
        } else {
            handler = new android.os.Handler(android.os.Looper.getMainLooper());
            this.U = handler;
        }
        java.lang.Runnable runnable = this.V;
        handler.removeCallbacks(runnable);
        this.U.postDelayed(runnable, timeUnit.toMillis(j));
    }

    @java.lang.Deprecated
    public final void ar(java.lang.String[] strArr, int i) {
        if (this.C == null) {
            throw new java.lang.IllegalStateException(defpackage.a.bg(this, "Fragment ", " not attached to Activity"));
        }
        defpackage.bo boVarJ = J();
        if (boVarJ.t == null) {
            defpackage.aooh.f(strArr, "permissions");
            return;
        }
        boVarJ.u.addLast(new android.support.v4.app.FragmentManager.LaunchedFragmentInfo(this.l, i));
        boVarJ.t.b(strArr);
    }

    final void as() {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = this.h;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.D.P(bundle);
        this.D.t();
    }

    public final void at(int i, int i2, int i3, int i4) {
        if (this.T == null && i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        D().b = i;
        D().c = i2;
        D().d = i3;
        D().e = i4;
    }

    public void au(android.os.Bundle bundle) {
        if (this.B != null && aJ()) {
            throw new java.lang.IllegalStateException("Fragment already added and state has been saved");
        }
        this.m = bundle;
    }

    public void av(java.lang.Object obj) {
        D().i = obj;
    }

    public void aw(java.lang.Object obj) {
        D().k = obj;
    }

    final void ax(android.view.View view) {
        D().o = view;
    }

    public final void ay(boolean z) {
        if (this.N != z) {
            this.N = z;
        }
    }

    final void az(int i) {
        if (this.T == null && i == 0) {
            return;
        }
        D();
        this.T.f = i;
    }

    public defpackage.bb d() {
        return new defpackage.as(this);
    }

    public final android.content.res.Resources dX() {
        return A().getResources();
    }

    public final int dZ() {
        defpackage.at atVar = this.T;
        if (atVar == null) {
            return 0;
        }
        return atVar.e;
    }

    public android.view.LayoutInflater e(android.os.Bundle bundle) {
        return aM();
    }

    public void g(android.content.Context context) {
        this.O = true;
        defpackage.bd bdVar = this.C;
        android.app.Activity activity = bdVar == null ? null : bdVar.b;
        if (activity != null) {
            this.O = false;
            ah(activity);
        }
    }

    public final android.os.Bundle getArguments() {
        return this.m;
    }

    public void h(android.os.Bundle bundle) {
        this.O = true;
        as();
        defpackage.bo boVar = this.D;
        if (boVar.m <= 0) {
            boVar.t();
        }
    }

    public void i() {
        this.O = true;
    }

    public void j() {
        this.O = true;
    }

    public void l() {
        this.O = true;
    }

    public void m() {
        this.O = true;
    }

    public void n(android.os.Bundle bundle) {
        this.O = true;
    }

    public void o(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.D.noteStateNotSaved();
        this.z = true;
        this.ad = new defpackage.cf(this, S(), new defpackage.am(this, 4));
        defpackage.den.bW(new defpackage.gsr(this, layoutInflater, viewGroup, bundle, 1));
        android.view.View view = this.Q;
        defpackage.cf cfVar = this.ad;
        if (view == null) {
            if (cfVar.a != null) {
                throw new java.lang.IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.ad = null;
            return;
        }
        cfVar.b();
        if (defpackage.bo.Z(3)) {
            android.util.Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.Q + " for Fragment " + this);
        }
        android.view.View view2 = this.Q;
        defpackage.cf cfVar2 = this.ad;
        if (view2 == null) {
            defpackage.aooh.i("<this>");
        }
        view2.setTag(2131429434, cfVar2);
        android.view.View view3 = this.Q;
        defpackage.cf cfVar3 = this.ad;
        if (view3 == null) {
            defpackage.aooh.i("<this>");
        }
        view3.setTag(2131429438, cfVar3);
        android.view.View view4 = this.Q;
        defpackage.cf cfVar4 = this.ad;
        if (view4 == null) {
            defpackage.aooh.i("<this>");
        }
        view4.setTag(2131429437, cfVar4);
        this.ae.k(this.ad);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.O = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        H().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.O = true;
    }

    @java.lang.Deprecated
    public final void startActivityForResult(android.content.Intent intent, int i) {
        aQ(intent, i);
    }

    @java.lang.Deprecated
    public final void startIntentSenderForResult(android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) {
        if (this.C == null) {
            throw new java.lang.IllegalStateException(defpackage.a.bg(this, "Fragment ", " not attached to Activity"));
        }
        if (defpackage.bo.Z(2)) {
            android.util.Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: 2 IntentSender: " + intentSender + " fillInIntent: null options: null");
        }
        defpackage.bo boVarJ = J();
        if (boVarJ.s == null) {
            defpackage.aooh.f(intentSender, "intent");
            throw new java.lang.IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        op opVar = new op(intentSender);
        opVar.b(0, 0);
        androidx.activity.result.IntentSenderRequest intentSenderRequestA = opVar.a();
        boVarJ.u.addLast(new android.support.v4.app.FragmentManager.LaunchedFragmentInfo(this.l, 2));
        if (defpackage.bo.Z(2)) {
            android.util.Log.v("FragmentManager", defpackage.a.bg(this, "Fragment ", "is launching an IntentSender for result "));
        }
        boVarJ.s.b(intentSenderRequestA);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append('{');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.l);
        if (this.F != 0) {
            sb.append(" id=0x");
            sb.append(java.lang.Integer.toHexString(this.F));
        }
        if (this.H != null) {
            sb.append(" tag=");
            sb.append(this.H);
        }
        sb.append(')');
        return sb.toString();
    }

    final float u() {
        defpackage.at atVar = this.T;
        if (atVar == null) {
            return 1.0f;
        }
        return atVar.n;
    }

    public final int v() {
        defpackage.at atVar = this.T;
        if (atVar == null) {
            return 0;
        }
        return atVar.b;
    }

    public final int w() {
        defpackage.at atVar = this.T;
        if (atVar == null) {
            return 0;
        }
        return atVar.c;
    }

    public final int x() {
        defpackage.at atVar = this.T;
        if (atVar == null) {
            return 0;
        }
        return atVar.d;
    }

    public android.content.Context z() {
        defpackage.bd bdVar = this.C;
        if (bdVar == null) {
            return null;
        }
        return bdVar.c;
    }

    public void aj(boolean z) {
    }

    public void ak(boolean z) {
    }

    public void k(android.os.Bundle bundle) {
    }

    public void aR(int i, int i2) {
    }

    public void aS(int i, int i2) {
    }

    public void ao(android.view.View view, android.os.Bundle bundle) {
    }

    @java.lang.Deprecated
    public void am(int i, java.lang.String[] strArr, int[] iArr) {
    }
}
