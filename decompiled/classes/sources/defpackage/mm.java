package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class mm implements defpackage.emv {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public mm(defpackage.amyf amyfVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(amyfVar);
        this.a = amyfVar;
    }

    @Override // defpackage.emv
    public final void a(defpackage.emx emxVar, defpackage.emp empVar) {
        android.view.Window window;
        android.view.View viewPeekDecorView;
        android.view.View view;
        switch (this.$cid) {
            case 0:
                if (empVar != defpackage.emp.ON_STOP || (window = ((defpackage.mp) this.a).getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
                    return;
                }
                viewPeekDecorView.cancelPendingInputEvents();
                return;
            case 1:
                if (empVar != defpackage.emp.ON_STOP || (view = ((defpackage.aw) this.a).Q) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 2:
                if (empVar == defpackage.emp.ON_DESTROY) {
                    defpackage.mp mpVar = (defpackage.mp) this.a;
                    mpVar.f.a();
                    if (!mpVar.isChangingConfigurations()) {
                        mpVar.S().a();
                    }
                    defpackage.mn mnVar = mpVar.l;
                    defpackage.mp mpVar2 = mnVar.b;
                    mpVar2.getWindow().getDecorView().removeCallbacks(mnVar);
                    mpVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(mnVar);
                    return;
                }
                return;
            case 3:
                java.lang.Object obj = this.a;
                ((defpackage.mp) obj).s();
                ((defpackage.cm) obj).P().d(this);
                return;
            case 4:
                if (empVar == defpackage.emp.ON_DESTROY) {
                    ((defpackage.ddl) this.a).g();
                    return;
                }
                return;
            case 5:
                if (empVar != defpackage.emp.ON_CREATE) {
                    java.util.Objects.toString(empVar);
                    throw new java.lang.IllegalStateException("Next event must be ON_CREATE, it was ".concat(empVar.toString()));
                }
                emxVar.P().d(this);
                ((defpackage.ent) ((defpackage.aoot) this.a).a).c();
                return;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj2 = this.a;
                if (empVar == defpackage.emp.ON_START) {
                    ((defpackage.gim) ((defpackage.cop) obj2).d).c = true;
                    return;
                } else {
                    if (empVar == defpackage.emp.ON_STOP) {
                        ((defpackage.gim) ((defpackage.cop) obj2).d).c = false;
                        return;
                    }
                    return;
                }
            default:
                if (empVar == defpackage.emp.ON_DESTROY) {
                    defpackage.amyf amyfVar = (defpackage.amyf) this.a;
                    amyfVar.a = null;
                    amyfVar.b = null;
                    amyfVar.c = null;
                    return;
                }
                return;
        }
    }

    public mm(java.lang.Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }

    public /* synthetic */ mm(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
