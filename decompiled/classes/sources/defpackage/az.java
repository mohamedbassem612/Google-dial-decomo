package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class az extends defpackage.mp {
    boolean b;
    boolean c;
    public final defpackage.kaw e = new defpackage.kaw(new defpackage.ay(this));
    final defpackage.emy a = new defpackage.emy(this, true);
    boolean d = true;

    public az() {
        int i = 1;
        aT().e("android:support:lifecycle", new defpackage.bf(this, i));
        e(new defpackage.ax(this, i));
        this.i.add(new defpackage.ax(this, 0));
        r(new defpackage.cz(this, i));
    }

    private static boolean i(defpackage.bo boVar, defpackage.emq emqVar) {
        boolean zI = false;
        for (defpackage.aw awVar : boVar.k()) {
            if (awVar != null) {
                if (awVar.X() != null) {
                    zI |= i(awVar.I(), emqVar);
                }
                defpackage.cf cfVar = awVar.ad;
                if (cfVar != null && ((defpackage.emy) cfVar.P()).d.a(defpackage.emq.d)) {
                    awVar.ad.a.g(emqVar);
                    zI = true;
                }
                if (awVar.ab.d.a(defpackage.emq.d)) {
                    awVar.ab.g(emqVar);
                    zI = true;
                }
            }
        }
        return zI;
    }

    public final defpackage.bo a() {
        return this.e.aC();
    }

    final android.view.View dV(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return ((defpackage.bd) this.e.a).e.e.onCreateView(view, str, context, attributeSet);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            java.lang.String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && android.os.Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (android.os.Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (android.os.Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture")) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        printWriter.println(" State:");
        java.lang.String strConcat = java.lang.String.valueOf(str).concat("  ");
        printWriter.print(strConcat);
        printWriter.print("mCreated=");
        printWriter.print(this.b);
        printWriter.print(" mResumed=");
        printWriter.print(this.c);
        printWriter.print(" mStopped=");
        printWriter.print(this.d);
        if (getApplication() != null) {
            epc.a(this).c(strConcat, fileDescriptor, printWriter, strArr);
        }
        this.e.aC().G(str, fileDescriptor, printWriter, strArr);
    }

    final void g() {
        while (i(a(), defpackage.emq.c)) {
        }
    }

    @Override // defpackage.mp, android.app.Activity
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        this.e.aD();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.mp, defpackage.cm, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.a.f(defpackage.emp.ON_CREATE);
        ((defpackage.bd) this.e.a).e.t();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View viewDV = dV(null, str, context, attributeSet);
        return viewDV == null ? super.onCreateView(str, context, attributeSet) : viewDV;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ((defpackage.bd) this.e.a).e.u();
        this.a.f(defpackage.emp.ON_DESTROY);
    }

    @Override // defpackage.mp, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((defpackage.bd) this.e.a).e.V(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.c = false;
        ((defpackage.bd) this.e.a).e.A();
        this.a.f(defpackage.emp.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.a.f(defpackage.emp.ON_RESUME);
        ((defpackage.bd) this.e.a).e.C();
    }

    @Override // defpackage.mp, android.app.Activity
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        this.e.aD();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        defpackage.kaw kawVar = this.e;
        kawVar.aD();
        super.onResume();
        this.c = true;
        kawVar.aE();
    }

    @Override // android.app.Activity
    protected void onStart() {
        defpackage.kaw kawVar = this.e;
        kawVar.aD();
        super.onStart();
        this.d = false;
        if (!this.b) {
            this.b = true;
            ((defpackage.bd) kawVar.a).e.r();
        }
        kawVar.aE();
        this.a.f(defpackage.emp.ON_START);
        ((defpackage.bd) kawVar.a).e.D();
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.e.aD();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.d = true;
        g();
        ((defpackage.bd) this.e.a).e.F();
        this.a.f(defpackage.emp.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View viewDV = dV(view, str, context, attributeSet);
        return viewDV == null ? super.onCreateView(view, str, context, attributeSet) : viewDV;
    }
}
