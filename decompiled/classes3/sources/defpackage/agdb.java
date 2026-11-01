package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agdb extends defpackage.agdg {
    public android.widget.AutoCompleteTextView a;
    public boolean b;
    public boolean c;
    public android.animation.ValueAnimator d;
    private final int i;
    private final int j;
    private final android.animation.TimeInterpolator k;
    private final android.view.View.OnClickListener l;
    private final android.view.View.OnFocusChangeListener m;
    private final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener n;
    private boolean o;
    private long p;
    private android.view.accessibility.AccessibilityManager q;
    private android.animation.ValueAnimator r;

    public agdb(defpackage.agdf agdfVar) {
        super(agdfVar);
        this.l = new defpackage.afrh(this, 6);
        this.m = new defpackage.agcy(this, 0);
        this.n = new android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener() { // from class: agcz
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                defpackage.agdb agdbVar = this.a;
                android.widget.AutoCompleteTextView autoCompleteTextView = agdbVar.a;
                if (autoCompleteTextView == null || defpackage.aftt.g(autoCompleteTextView)) {
                    return;
                }
                agdbVar.h.setImportantForAccessibility(true == z ? 2 : 1);
            }
        };
        this.p = Long.MAX_VALUE;
        this.j = agab.u(agdfVar.getContext(), 2130970064, 67);
        this.i = agab.u(agdfVar.getContext(), 2130970064, 50);
        this.k = agab.C(agdfVar.getContext(), 2130970073, afpc.a);
    }

    private final android.animation.ValueAnimator z(int i, float... fArr) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.k);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addUpdateListener(new defpackage.afzo(this, 8));
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.agdg
    public final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener A() {
        return this.n;
    }

    @Override // defpackage.agdg
    public final int a() {
        return 2132018610;
    }

    @Override // defpackage.agdg
    public final int b() {
        return 2131231859;
    }

    @Override // defpackage.agdg
    public final android.view.View.OnClickListener c() {
        return this.l;
    }

    @Override // defpackage.agdg
    public final android.view.View.OnFocusChangeListener d() {
        return this.m;
    }

    @Override // defpackage.agdg
    public final void g(android.widget.EditText editText) {
        if (!(editText instanceof android.widget.AutoCompleteTextView)) {
            throw new java.lang.RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        android.widget.AutoCompleteTextView autoCompleteTextView = (android.widget.AutoCompleteTextView) editText;
        this.a = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new klw(this, 10));
        this.a.setOnDismissListener(new android.widget.AutoCompleteTextView.OnDismissListener() { // from class: agcx
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                defpackage.agdb agdbVar = this.a;
                agdbVar.n();
                agdbVar.k(false);
            }
        });
        this.a.setThreshold(0);
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.e;
        textInputLayout.b.n(null);
        if (!defpackage.aftt.g(editText) && this.q.isTouchExplorationEnabled()) {
            this.h.setImportantForAccessibility(2);
        }
        textInputLayout.j(true);
    }

    @Override // defpackage.agdg
    public final void i() {
        this.d = z(this.j, 0.0f, 1.0f);
        android.animation.ValueAnimator valueAnimatorZ = z(this.i, 1.0f, 0.0f);
        this.r = valueAnimatorZ;
        valueAnimatorZ.addListener(new defpackage.agda(this));
        this.q = (android.view.accessibility.AccessibilityManager) this.g.getSystemService("accessibility");
    }

    @Override // defpackage.agdg
    public final void j() {
        android.widget.AutoCompleteTextView autoCompleteTextView = this.a;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.a.setOnDismissListener(null);
        }
    }

    public final void k(boolean z) {
        if (this.o != z) {
            this.o = z;
            this.d.cancel();
            this.r.start();
        }
    }

    @Override // defpackage.agdg
    public final void l() {
        if (this.q.isTouchExplorationEnabled() && defpackage.aftt.g(this.a) && !this.h.hasFocus()) {
            this.a.dismissDropDown();
        }
        this.a.post(new defpackage.aflt(this, 20));
    }

    public final void m() {
        if (this.a != null) {
            if (p()) {
                this.c = false;
            }
            if (this.c) {
                this.c = false;
                return;
            }
            k(!this.o);
            boolean z = this.o;
            android.widget.AutoCompleteTextView autoCompleteTextView = this.a;
            if (!z) {
                autoCompleteTextView.dismissDropDown();
            } else {
                autoCompleteTextView.requestFocus();
                this.a.showDropDown();
            }
        }
    }

    public final void n() {
        this.c = true;
        this.p = android.os.SystemClock.uptimeMillis();
    }

    @Override // defpackage.agdg
    public final boolean o(int i) {
        return i != 0;
    }

    public final boolean p() {
        long jUptimeMillis = android.os.SystemClock.uptimeMillis() - this.p;
        return jUptimeMillis < 0 || jUptimeMillis > 300;
    }

    @Override // defpackage.agdg
    public final boolean q() {
        return true;
    }

    @Override // defpackage.agdg
    public final boolean r() {
        return this.b;
    }

    @Override // defpackage.agdg
    public final boolean s() {
        return true;
    }

    @Override // defpackage.agdg
    public final boolean t() {
        return this.o;
    }

    @Override // defpackage.agdg
    public final boolean u() {
        return true;
    }

    @Override // defpackage.agdg
    public final void v(ebd ebdVar) {
        if (!defpackage.aftt.g(this.a)) {
            ebdVar.s(android.widget.Spinner.class.getName());
        }
        if (ebdVar.a.isShowingHintText()) {
            ebdVar.D((java.lang.CharSequence) null);
        }
    }

    @Override // defpackage.agdg
    public final void w(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!this.q.isEnabled() || defpackage.aftt.g(this.a)) {
            return;
        }
        boolean z = false;
        if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.o && !this.a.isPopupShowing()) {
            z = true;
        }
        if (accessibilityEvent.getEventType() == 1 || z) {
            m();
            n();
        }
    }
}
