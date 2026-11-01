package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aada implements defpackage.aadf {
    public final android.content.Context b;
    public final java.lang.String c;
    public final defpackage.aaix d;
    public final defpackage.aacu e;
    public final defpackage.aadx f;
    public final android.os.Looper g;
    public final int h;
    public final defpackage.aade i;
    protected final defpackage.aaet j;
    public final defpackage.acxg k;

    public aada(android.content.Context context, android.app.Activity activity, defpackage.acxg acxgVar, defpackage.aacu aacuVar, defpackage.aacz aaczVar) {
        aafp aafpVarE;
        if (context == null) {
            throw new java.lang.NullPointerException("Null context is not permitted.");
        }
        if (acxgVar == null) {
            throw new java.lang.NullPointerException("Api must not be null.");
        }
        if (aaczVar == null) {
            throw new java.lang.NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        }
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new java.lang.NullPointerException("The provided context did not have an application context.");
        }
        this.b = applicationContext;
        java.lang.String strM = baa$.ExternalSyntheticApiModelOutline1.m(context);
        this.c = strM;
        this.d = android.os.Build.VERSION.SDK_INT >= 31 ? new defpackage.aaix(ac$.ExternalSyntheticApiModelOutline0.m(context)) : null;
        this.k = acxgVar;
        this.e = aacuVar;
        this.g = aaczVar.b;
        defpackage.aadx aadxVar = new defpackage.aadx(acxgVar, aacuVar, strM);
        this.f = aadxVar;
        this.i = new defpackage.aaeu(this);
        defpackage.aaet aaetVarC = defpackage.aaet.c(applicationContext);
        this.j = aaetVarC;
        this.h = aaetVarC.j.getAndIncrement();
        if (activity != null && !(activity instanceof com.google.android.gms.common.api.GoogleApiActivity) && android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            if (activity instanceof defpackage.az) {
                defpackage.az azVar = (defpackage.az) activity;
                java.util.WeakHashMap weakHashMap = aafp.a;
                defpackage.bo boVarA = azVar.a();
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) aafp.a.get(azVar);
                if (weakReference == null || (aafpVarE = (aafp) weakReference.get()) == null) {
                    try {
                        aafpVarE = boVarA.e("SLifecycleFragmentImpl");
                        if (aafpVarE == null || aafpVarE.s) {
                            aafpVarE = new aafp();
                            defpackage.u uVar = new defpackage.u(boVarA);
                            uVar.e(0, aafpVarE, "SLifecycleFragmentImpl", 1);
                            uVar.i(true, true);
                        }
                        aafp.a.put(azVar, new java.lang.ref.WeakReference(aafpVarE));
                    } catch (java.lang.ClassCastException e) {
                        throw new java.lang.IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
                    }
                }
            } else {
                java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) aafa.a.get(activity);
                if (weakReference2 == null || (aafpVarE = (aafa) weakReference2.get()) == null) {
                    try {
                        aafp aafaVar = (aafa) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                        if (aafaVar == null || aafaVar.isRemoving()) {
                            aafaVar = new aafa();
                            activity.getFragmentManager().beginTransaction().add((android.app.Fragment) aafaVar, "LifecycleFragmentImpl").commitAllowingStateLoss();
                        }
                        aafpVarE = aafaVar;
                        aafa.a.put(activity, new java.lang.ref.WeakReference(aafpVarE));
                    } catch (java.lang.ClassCastException e2) {
                        throw new java.lang.IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
                    }
                }
            }
            aael aaelVar = (aael) aafpVarE.c(aael.class);
            aaelVar = aaelVar == null ? new aael(aafpVarE, aaetVarC) : aaelVar;
            aaelVar.e.add(aadxVar);
            aaetVarC.f(aaelVar);
        }
        android.os.Handler handler = aaetVarC.r;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    @Override // defpackage.aadf
    public final defpackage.aadx f() {
        return this.f;
    }

    public final defpackage.aaum i(int i, defpackage.aafr aafrVar) {
        defpackage.zzx zzxVar = new defpackage.zzx((char[]) null);
        int i2 = aafrVar.c;
        defpackage.aaet aaetVar = this.j;
        aaetVar.i(zzxVar, i2, this);
        defpackage.aadu aaduVar = new defpackage.aadu(i, aafrVar, zzxVar);
        android.os.Handler handler = aaetVar.r;
        handler.sendMessage(handler.obtainMessage(4, new defpackage.aaif(aaduVar, aaetVar.k.get(), this)));
        return (defpackage.aaum) zzxVar.a;
    }

    public final defpackage.aaum j(defpackage.aafc aafcVar, int i) {
        defpackage.zzx zzxVar = new defpackage.zzx((char[]) null);
        defpackage.aaet aaetVar = this.j;
        aaetVar.i(zzxVar, i, this);
        aadv aadvVar = new aadv(aafcVar, zzxVar);
        android.os.Handler handler = aaetVar.r;
        handler.sendMessage(handler.obtainMessage(13, new defpackage.aaif((defpackage.aadw) aadvVar, aaetVar.k.get(), this)));
        return (defpackage.aaum) zzxVar.a;
    }

    public final void k(int i, defpackage.aaeb aaebVar) {
        boolean z = true;
        if (!aaebVar.f && !((java.lang.Boolean) com.google.android.gms.common.api.internal.BasePendingResult.b.get()).booleanValue()) {
            z = false;
        }
        aaebVar.f = z;
        defpackage.aaet aaetVar = this.j;
        defpackage.aaif aaifVar = new defpackage.aaif(new defpackage.aads(i, aaebVar), aaetVar.k.get(), this);
        android.os.Handler handler = aaetVar.r;
        handler.sendMessage(handler.obtainMessage(4, aaifVar));
    }

    public final defpackage.aaum l(defpackage.aogc aogcVar) {
        java.lang.Object obj = aogcVar.b;
        defpackage.aafj aafjVar = (defpackage.aafj) obj;
        if (aafjVar.a() == null) {
            throw new java.lang.NullPointerException("Listener has already been released.");
        }
        java.lang.Object obj2 = aogcVar.c;
        defpackage.aaet aaetVar = this.j;
        java.lang.Object obj3 = aogcVar.a;
        defpackage.zzx zzxVar = new defpackage.zzx((char[]) null);
        aaetVar.i(zzxVar, aafjVar.d, this);
        defpackage.aadt aadtVar = new defpackage.aadt(new defpackage.aogc(obj, obj2, obj3, (float[]) null), zzxVar);
        android.os.Handler handler = aaetVar.r;
        handler.sendMessage(handler.obtainMessage(8, new defpackage.aaif(aadtVar, aaetVar.k.get(), this)));
        return (defpackage.aaum) zzxVar.a;
    }

    public final defpackage.aafe v(java.lang.Object obj, java.lang.String str) {
        return defpackage.aais.az(obj, this.g, str);
    }

    public final defpackage.aagh w() {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccountA;
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccountA2;
        defpackage.aagh aaghVar = new defpackage.aagh();
        defpackage.aacu aacuVar = this.e;
        boolean z = aacuVar instanceof defpackage.aacs;
        android.accounts.Account account = null;
        if (z && (googleSignInAccountA2 = ((defpackage.aacs) aacuVar).a()) != null) {
            java.lang.String str = googleSignInAccountA2.c;
            if (str != null) {
                account = new android.accounts.Account(str, "com.google");
            }
        } else if (aacuVar instanceof defpackage.aaox) {
            account = ((defpackage.aaox) aacuVar).a;
        }
        aaghVar.a = account;
        java.util.Set setA = (!z || (googleSignInAccountA = ((defpackage.aacs) aacuVar).a()) == null) ? java.util.Collections.EMPTY_SET : googleSignInAccountA.a();
        if (aaghVar.b == null) {
            aaghVar.b = new defpackage.acc(0);
        }
        aaghVar.b.addAll(setA);
        android.content.Context context = this.b;
        aaghVar.d = context.getClass().getName();
        aaghVar.c = context.getPackageName();
        return aaghVar;
    }
}
