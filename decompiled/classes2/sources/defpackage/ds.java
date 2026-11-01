package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ds extends defpackage.mr {
    private dc a;
    private final dyr b;

    public ds(android.content.Context context, int i) {
        super(context, a(context, i));
        this.b = new dyr() { // from class: dr
            public final boolean h(android.view.KeyEvent keyEvent) {
                return this.a.f(keyEvent);
            }
        };
        dq dqVarE = e();
        dqVarE.G = a(context, i);
        dqVarE.q();
    }

    private static int a(android.content.Context context, int i) {
        if (i != 0) {
            return i;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(2130969258, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.mr, android.app.Dialog
    public final void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        h();
        e().d(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        getWindow().getDecorView();
        return defpackage.yv.d(this.b, keyEvent);
    }

    public final dc e() {
        if (this.a == null) {
            int i = dc.b;
            this.a = new dq(getContext(), getWindow(), this);
        }
        return this.a;
    }

    final boolean f(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final android.view.View findViewById(int i) {
        return e().c(i);
    }

    public final void g() {
        e().r(1);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        e().f();
    }

    @Override // defpackage.mr, android.app.Dialog
    protected void onCreate(android.os.Bundle bundle) {
        e().e();
        super.onCreate(bundle);
        e().q();
    }

    @Override // defpackage.mr, android.app.Dialog
    protected final void onStop() {
        super.onStop();
        e().h();
    }

    @Override // defpackage.mr, android.app.Dialog
    public void setContentView(int i) {
        h();
        e().j(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        e().n(getContext().getString(i));
    }

    @Override // defpackage.mr, android.app.Dialog
    public void setContentView(android.view.View view) {
        h();
        e().k(view);
    }

    @Override // defpackage.mr, android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        h();
        e().l(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        e().n(charSequence);
    }
}
