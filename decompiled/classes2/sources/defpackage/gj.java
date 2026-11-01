package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gj implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public gj(com.google.android.setupdesign.GlifLayout glifLayout, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(glifLayout);
        this.a = glifLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$cid) {
            case 0:
                defpackage.gl glVar = (defpackage.gl) this.a;
                if (glVar.x()) {
                    defpackage.jy jyVar = glVar.a;
                    if (!jyVar.o) {
                        android.view.View view = glVar.c;
                        if (view != null && view.isShown()) {
                            jyVar.v();
                        } else {
                            glVar.m();
                        }
                    }
                }
                break;
            case 1:
                defpackage.fn fnVar = (defpackage.fn) this.a;
                if (fnVar.x()) {
                    java.util.List list = fnVar.b;
                    if (list.size() > 0 && !((defpackage.jv) ((alic) list.get(0)).c).o) {
                        android.view.View view2 = fnVar.d;
                        if (view2 != null && view2.isShown()) {
                            java.util.Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((defpackage.jv) ((alic) it.next()).c).v();
                            }
                        } else {
                            fnVar.m();
                        }
                        break;
                    }
                }
                break;
            case 2:
                defpackage.ie ieVar = (defpackage.ie) this.a;
                if (!ieVar.b.x()) {
                    ieVar.b();
                }
                android.view.ViewTreeObserver viewTreeObserver = ieVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 3:
                java.lang.Object obj = this.a;
                defpackage.ic icVar = (defpackage.ic) obj;
                defpackage.ie ieVar2 = icVar.d;
                if (ieVar2.isAttachedToWindow() && ieVar2.getGlobalVisibleRect(icVar.c)) {
                    icVar.n();
                    super/*jv*/.v();
                } else {
                    ((defpackage.jv) obj).m();
                }
                break;
            case 4:
                java.lang.Object obj2 = this.a;
                xan xanVar = (xan) obj2;
                xanVar.l.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                xanVar.o.b(xanVar.d.z(), xanVar.t.k(), new defpackage.kll(obj2, 19), new taw(obj2, 10));
                break;
            case 5:
                ((aekj) this.a).n();
                break;
            case 6:
                ((agbj) this.a).h();
                break;
            default:
                ((com.google.android.setupdesign.GlifLayout) this.a).u();
                break;
        }
    }

    public gj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public /* synthetic */ gj(android.view.View view, int i) {
        this.$cid = i;
        this.a = view;
    }

    public gj(xan xanVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(xanVar);
        this.a = xanVar;
    }
}
