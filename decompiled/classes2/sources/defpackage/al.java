package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class al extends aw implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {
    private android.os.Handler Bt;
    private boolean By;
    private boolean as;
    private boolean at;
    private boolean au;
    public android.app.Dialog d;
    private final java.lang.Runnable Bu = new ae(this, 3, (byte[]) null);
    private final android.content.DialogInterface.OnCancelListener Bv = new defpackage.ai(this);
    public final android.content.DialogInterface.OnDismissListener a = new defpackage.nwi(this, 1);
    private int Bw = 0;
    public int b = 0;
    private boolean ao = true;
    public boolean c = true;
    private int Bx = -1;
    private final enh Bz = new defpackage.aj(this);
    public boolean e = false;

    public final android.app.Dialog c() {
        android.app.Dialog dialog = this.d;
        if (dialog != null) {
            return dialog;
        }
        throw new java.lang.IllegalStateException(a.bg(this, "DialogFragment ", " does not have a Dialog."));
    }

    public final bb d() {
        return new defpackage.ak(this, new as(this));
    }

    public final void dismissAllowingStateLoss() {
        s(true, false);
    }

    public android.view.LayoutInflater e(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterAM = aM();
        if (!this.c || this.By) {
            if (!bo.Z(2)) {
                return layoutInflaterAM;
            }
            toString();
            java.lang.String strConcat = "getting layout inflater for DialogFragment ".concat(toString());
            if (this.c) {
                android.util.Log.d("FragmentManager", "mCreatingDialog = true: ".concat(strConcat));
                return layoutInflaterAM;
            }
            android.util.Log.d("FragmentManager", "mShowsDialog = false: ".concat(strConcat));
            return layoutInflaterAM;
        }
        if (!this.e) {
            try {
                this.By = true;
                android.app.Dialog dialogEb = eb(bundle);
                this.d = dialogEb;
                if (this.c) {
                    p(dialogEb, this.Bw);
                    android.content.Context contextZ = z();
                    if (contextZ instanceof android.app.Activity) {
                        this.d.setOwnerActivity((android.app.Activity) contextZ);
                    }
                    this.d.setCancelable(this.ao);
                    this.d.setOnCancelListener(this.Bv);
                    this.d.setOnDismissListener(this.a);
                    this.e = true;
                } else {
                    this.d = null;
                }
                this.By = false;
            } catch (java.lang.Throwable th) {
                this.By = false;
                throw th;
            }
        }
        if (bo.Z(2)) {
            android.util.Log.d("FragmentManager", a.bg(this, "get layout inflater for DialogFragment ", " from dialog context"));
        }
        android.app.Dialog dialog = this.d;
        return dialog != null ? layoutInflaterAM.cloneInContext(dialog.getContext()) : layoutInflaterAM;
    }

    public android.app.Dialog eb(android.os.Bundle bundle) {
        if (bo.Z(3)) {
            toString();
            android.util.Log.d("FragmentManager", "onCreateDialog called for DialogFragment ".concat(toString()));
        }
        return new defpackage.mr(A(), ec());
    }

    public int ec() {
        return this.b;
    }

    public void f() {
        s(false, false);
    }

    public void g(android.content.Context context) {
        super.g(context);
        ((aw) this).ae.h(this.Bz);
        if (this.au) {
            return;
        }
        this.at = false;
    }

    public final android.app.Dialog getDialog() {
        return this.d;
    }

    public final boolean getShowsDialog() {
        return this.c;
    }

    public void h(android.os.Bundle bundle) {
        super.h(bundle);
        this.Bt = new android.os.Handler();
        this.c = this.G == 0;
        if (bundle != null) {
            this.Bw = bundle.getInt("android:style", 0);
            this.b = bundle.getInt("android:theme", 0);
            this.ao = bundle.getBoolean("android:cancelable", true);
            this.c = bundle.getBoolean("android:showsDialog", this.c);
            this.Bx = bundle.getInt("android:backStackId", -1);
        }
    }

    public void i() {
        super.i();
        android.app.Dialog dialog = this.d;
        if (dialog != null) {
            this.as = true;
            dialog.setOnDismissListener(null);
            this.d.dismiss();
            if (!this.at) {
                onDismiss(this.d);
            }
            this.d = null;
            this.e = false;
        }
    }

    public void j() {
        super.j();
        if (!this.au && !this.at) {
            this.at = true;
        }
        ((aw) this).ae.j(this.Bz);
    }

    public void k(android.os.Bundle bundle) {
        android.app.Dialog dialog = this.d;
        if (dialog != null) {
            android.os.Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.Bw;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        if (!this.ao) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.c) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i3 = this.Bx;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void l() {
        super.l();
        android.app.Dialog dialog = this.d;
        if (dialog != null) {
            this.as = false;
            dialog.show();
            android.view.View decorView = this.d.getWindow().getDecorView();
            dzo.l(decorView, this);
            dzo.j(decorView, this);
            dzk.O(decorView, this);
        }
    }

    public void m() {
        super.m();
        android.app.Dialog dialog = this.d;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void n(android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        super.n(bundle);
        if (this.d == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.d.onRestoreInstanceState(bundle2);
    }

    public final void o(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        super.o(layoutInflater, viewGroup, bundle);
        if (this.Q != null || this.d == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.d.onRestoreInstanceState(bundle2);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        if (this.as) {
            return;
        }
        if (bo.Z(3)) {
            toString();
            android.util.Log.d("FragmentManager", "onDismiss called for DialogFragment ".concat(toString()));
        }
        s(true, true);
    }

    public void p(android.app.Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            android.view.Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public final void q(bo boVar, java.lang.String str) {
        this.at = false;
        this.au = true;
        u uVar = new u(boVar);
        uVar.s();
        uVar.e(0, this, str, 1);
        uVar.i(false, true);
    }

    public final void r(bo boVar, java.lang.String str) {
        this.at = false;
        this.au = true;
        u uVar = new u(boVar);
        uVar.s();
        uVar.e(0, this, str, 1);
        uVar.c();
    }

    public final void s(boolean z, boolean z2) {
        if (this.at) {
            return;
        }
        this.at = true;
        this.au = false;
        android.app.Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.d.dismiss();
            if (!z2) {
                if (android.os.Looper.myLooper() == this.Bt.getLooper()) {
                    onDismiss(this.d);
                } else {
                    this.Bt.post(this.Bu);
                }
            }
        }
        this.as = true;
        if (this.Bx >= 0) {
            bo boVarJ = J();
            int i = this.Bx;
            if (i < 0) {
                throw new java.lang.IllegalArgumentException(a.bj(i, "Bad id: "));
            }
            boVarJ.I(new defpackage.bm(boVarJ, i), z);
            this.Bx = -1;
            return;
        }
        u uVar = new u(J());
        uVar.s();
        uVar.k(this);
        if (z) {
            uVar.i(true, true);
        } else {
            uVar.i(false, true);
        }
    }

    public final void t() {
        this.ao = false;
        android.app.Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
    }
}
