package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class mr extends android.app.Dialog implements emx, nh, fxz, gii {
    private emy a;
    private final aoir b;
    private final aoir c;
    private final kaw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr(android.content.Context context, int i) {
        super(context, i);
        aooh.f(context, "context");
        this.d = dzk.U(this);
        this.b = aooc.ag(new defpackage.mq(this, 1));
        this.c = aooc.ag(new defpackage.mq(this, 0));
    }

    private final emy a() {
        emy emyVar = this.a;
        if (emyVar != null) {
            return emyVar;
        }
        emy emyVar2 = new emy(this, true);
        this.a = emyVar2;
        return emyVar2;
    }

    public static final void i(defpackage.mr mrVar) {
        super.onBackPressed();
    }

    public final ems P() {
        return a();
    }

    public final aaha aT() {
        return this.d.ap();
    }

    @Override // android.app.Dialog
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        aooh.f(view, "view");
        h();
        super.addContentView(view, layoutParams);
    }

    public final nf fc() {
        return (nf) this.c.a();
    }

    public final fxy fd() {
        return fc().b();
    }

    public final void h() {
        android.view.Window window = getWindow();
        aooh.c(window);
        android.view.View decorView = window.getDecorView();
        aooh.e(decorView, "getDecorView(...)");
        dzo.l(decorView, this);
        android.view.Window window2 = getWindow();
        aooh.c(window2);
        android.view.View decorView2 = window2.getDecorView();
        aooh.e(decorView2, "getDecorView(...)");
        den.bJ(decorView2, this);
        android.view.Window window3 = getWindow();
        aooh.c(window3);
        android.view.View decorView3 = window3.getDecorView();
        aooh.e(decorView3, "getDecorView(...)");
        dzk.O(decorView3, this);
        android.view.Window window4 = getWindow();
        aooh.c(window4);
        android.view.View decorView4 = window4.getDecorView();
        aooh.e(decorView4, "getDecorView(...)");
        dzl.j(decorView4, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((fyd) this.b.a()).b();
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            nf nfVarFc = fc();
            android.window.OnBackInvokedDispatcher onBackInvokedDispatcherM = ae$.ExternalSyntheticApiModelOutline0.m(this);
            aooh.e(onBackInvokedDispatcherM, "getOnBackInvokedDispatcher(...)");
            nfVarFc.f(onBackInvokedDispatcherM);
        }
        this.d.ae(bundle);
        a().f(emp.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final android.os.Bundle onSaveInstanceState() {
        android.os.Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        aooh.e(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.d.af(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        a().f(emp.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        a().f(emp.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View view) {
        aooh.f(view, "view");
        h();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        h();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        aooh.f(view, "view");
        h();
        super.setContentView(view, layoutParams);
    }
}
