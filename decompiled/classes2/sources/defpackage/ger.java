package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class ger extends aw implements defpackage.gey, defpackage.gew, defpackage.gex, defpackage.gdy {
    public gez a;
    public android.support.v7.widget.RecyclerView b;
    private boolean d;
    private boolean e;
    private final defpackage.gen c = new defpackage.gen(this);
    private int ak = 2131624379;
    private final android.os.Handler al = new defpackage.gem(this, android.os.Looper.getMainLooper());
    private final java.lang.Runnable am = new defpackage.fkh(this, 4);

    public android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.support.v7.widget.RecyclerView recyclerViewInflate;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = A().obtainStyledAttributes(null, defpackage.gfd.h, 2130970246, 0);
        this.ak = typedArrayObtainStyledAttributes.getResourceId(0, this.ak);
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        android.view.LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(A());
        android.view.View viewInflate = layoutInflaterCloneInContext.inflate(this.ak, viewGroup, false);
        android.view.View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof android.view.ViewGroup)) {
            throw new java.lang.IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewFindViewById;
        if (!A().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerViewInflate = (android.support.v7.widget.RecyclerView) viewGroup2.findViewById(2131428773)) == null) {
            recyclerViewInflate = layoutInflaterCloneInContext.inflate(2131624381, viewGroup2, false);
            A();
            recyclerViewInflate.aa(new android.support.v7.widget.LinearLayoutManager(1, false));
            recyclerViewInflate.X(new defpackage.gfb(recyclerViewInflate));
        }
        if (recyclerViewInflate == null) {
            throw new java.lang.RuntimeException("Could not create RecyclerView");
        }
        this.b = recyclerViewInflate;
        defpackage.gen genVar = this.c;
        recyclerViewInflate.at(genVar);
        if (drawable != null) {
            genVar.b = drawable.getIntrinsicHeight();
        } else {
            genVar.b = 0;
        }
        genVar.a = drawable;
        genVar.d.b.K();
        if (dimensionPixelSize != -1) {
            r(dimensionPixelSize);
        }
        genVar.c = z;
        if (this.b.getParent() == null) {
            viewGroup2.addView(this.b);
        }
        this.al.post(this.am);
        return viewInflate;
    }

    public abstract void aU(java.lang.String str);

    @Override // defpackage.gex
    public final void aV() {
        boolean zA = false;
        aw awVar = this;
        while (!zA) {
            if (awVar == null) {
                if (!(z() instanceof defpackage.geq)) {
                    break;
                }
                zA = ((defpackage.geq) z()).a();
                break;
            } else {
                if (awVar instanceof defpackage.geq) {
                    zA = ((defpackage.geq) awVar).a();
                }
                awVar = awVar.E;
            }
        }
        if (zA || !(G() instanceof defpackage.geq)) {
            return;
        }
        G().a();
    }

    public void ao(android.view.View view, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        androidx.preference.PreferenceScreen preferenceScreenDW;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreenDW = dW()) != null) {
            preferenceScreenDW.z(bundle2);
        }
        if (this.d) {
            ef();
        }
        this.e = true;
    }

    public final void c(int i) {
        eg();
        s(this.a.g(A(), i, dW()));
    }

    public final androidx.preference.PreferenceScreen dW() {
        gez gezVar = this.a;
        if (gezVar == null) {
            return null;
        }
        return gezVar.d;
    }

    @Override // defpackage.gdy
    public final androidx.preference.Preference ee(java.lang.CharSequence charSequence) {
        gez gezVar = this.a;
        if (gezVar == null) {
            return null;
        }
        return gezVar.e(charSequence);
    }

    final void ef() {
        androidx.preference.PreferenceScreen preferenceScreenDW = dW();
        if (preferenceScreenDW != null) {
            this.b.Y(new defpackage.geu(preferenceScreenDW));
            preferenceScreenDW.D();
        }
    }

    public final void eg() {
        if (this.a == null) {
            throw new java.lang.RuntimeException("This should be called after super.onCreate.");
        }
    }

    public void h(android.os.Bundle bundle) {
        super.h(bundle);
        android.util.TypedValue typedValue = new android.util.TypedValue();
        A().getTheme().resolveAttribute(2130970252, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = 2132083548;
        }
        A().getTheme().applyStyle(i, false);
        gez gezVar = new gez(A());
        this.a = gezVar;
        gezVar.g = this;
        android.os.Bundle bundle2 = ((aw) this).m;
        aU(bundle2 != null ? bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    public void i() {
        android.os.Handler handler = this.al;
        handler.removeCallbacks(this.am);
        handler.removeMessages(1);
        if (this.d) {
            this.b.Y((kh) null);
            androidx.preference.PreferenceScreen preferenceScreenDW = dW();
            if (preferenceScreenDW != null) {
                preferenceScreenDW.F();
            }
        }
        this.b = null;
        super.i();
    }

    public void k(android.os.Bundle bundle) {
        androidx.preference.PreferenceScreen preferenceScreenDW = dW();
        if (preferenceScreenDW != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            preferenceScreenDW.A(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    public void l() {
        super.l();
        gez gezVar = this.a;
        gezVar.e = this;
        gezVar.f = this;
    }

    public void m() {
        super.m();
        gez gezVar = this.a;
        gezVar.e = null;
        gezVar.f = null;
    }

    @Override // defpackage.gew
    public void p(androidx.preference.Preference preference) {
        defpackage.al gegVar;
        boolean zA = false;
        aw awVar = this;
        while (!zA) {
            if (awVar == null) {
                if (!(z() instanceof defpackage.geo)) {
                    break;
                }
                zA = ((defpackage.geo) z()).a();
                break;
            } else {
                if (awVar instanceof defpackage.geo) {
                    zA = ((defpackage.geo) awVar).a();
                }
                awVar = awVar.E;
            }
        }
        if (zA) {
            return;
        }
        if (!((G() instanceof defpackage.geo) && G().a()) && J().e("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof androidx.preference.EditTextPreference) {
                java.lang.String str = preference.s;
                gegVar = new defpackage.gea();
                android.os.Bundle bundle = new android.os.Bundle(1);
                bundle.putString("key", str);
                gegVar.au(bundle);
            } else if (preference instanceof androidx.preference.ListPreference) {
                java.lang.String str2 = preference.s;
                gegVar = new defpackage.gee();
                android.os.Bundle bundle2 = new android.os.Bundle(1);
                bundle2.putString("key", str2);
                gegVar.au(bundle2);
            } else {
                if (!(preference instanceof androidx.preference.MultiSelectListPreference)) {
                    throw new java.lang.IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                java.lang.String str3 = preference.s;
                gegVar = new defpackage.geg();
                android.os.Bundle bundle3 = new android.os.Bundle(1);
                bundle3.putString("key", str3);
                gegVar.au(bundle3);
            }
            gegVar.aO(this);
            gegVar.q(J(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public final void r(int i) {
        defpackage.gen genVar = this.c;
        genVar.b = i;
        genVar.d.b.K();
    }

    public final void s(androidx.preference.PreferenceScreen preferenceScreen) {
        gez gezVar;
        androidx.preference.PreferenceScreen preferenceScreen2;
        if (preferenceScreen == null || preferenceScreen == (preferenceScreen2 = (gezVar = this.a).d)) {
            return;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.F();
        }
        gezVar.d = preferenceScreen;
        this.d = true;
        if (this.e) {
            android.os.Handler handler = this.al;
            if (handler.hasMessages(1)) {
                return;
            }
            handler.obtainMessage(1).sendToTarget();
        }
    }

    @Override // defpackage.gey
    public final boolean t(androidx.preference.Preference preference) {
        if (preference.u == null) {
            return false;
        }
        aw awVar = this;
        boolean zA = false;
        while (!zA) {
            if (awVar == null) {
                if (!(z() instanceof defpackage.gep)) {
                    break;
                }
                zA = ((defpackage.gep) z()).a();
                break;
            }
            if (awVar instanceof defpackage.gep) {
                zA = ((defpackage.gep) awVar).a();
            }
            awVar = awVar.E;
        }
        if (!zA && (!(G() instanceof defpackage.gep) || !G().a())) {
            android.util.Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            bo boVarJ = J();
            android.os.Bundle bundleT = preference.t();
            bc bcVarH = boVarJ.h();
            H().getClassLoader();
            aw awVarB = bcVarH.b(preference.u);
            awVarB.au(bundleT);
            awVarB.aO(this);
            u uVar = new u(boVarJ);
            uVar.q(((android.view.View) N().getParent()).getId(), awVarB, (java.lang.String) null);
            uVar.o((java.lang.String) null);
            uVar.i(false, true);
        }
        return true;
    }
}
