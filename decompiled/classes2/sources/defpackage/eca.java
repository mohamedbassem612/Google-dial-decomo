package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eca implements android.view.View.OnAttachStateChangeListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public eca(aekj aekjVar, aekm aekmVar, int i) {
        this.$cid = i;
        this.a = aekmVar;
        j$.util.Objects.requireNonNull(aekjVar);
        this.b = aekjVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        int i = this.$cid;
        if (i == 0) {
            ((android.view.ViewGroup) this.a).addView((android.view.View) this.b, 0);
            view.removeOnAttachStateChangeListener(this);
            return;
        }
        if (i == 1) {
            bt btVar = (bt) this.a;
            btVar.e();
            den.bV((android.view.ViewGroup) btVar.a.Q.getParent(), ((be) this.b).a).f();
            return;
        }
        java.lang.Object obj = this.a;
        if (i == 2) {
            ((android.support.v7.widget.RecyclerView) obj).Y((kh) this.b);
            return;
        }
        aeiv aeivVar = ((aekm) obj).a;
        aekj aekjVar = (aekj) this.b;
        aehj aehjVar = aekjVar.A;
        aeivVar.b(aehjVar);
        if (aeivVar.e) {
            aekjVar.f(false);
            aehjVar.t(aeivVar.a());
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        int i = this.$cid;
        if (i == 0) {
            ((android.view.ViewGroup) this.a).addView((android.view.View) this.b, 0);
            view.removeOnAttachStateChangeListener(this);
            return;
        }
        if (i != 1) {
            java.lang.Object obj = this.a;
            if (i != 2) {
                ((aekm) obj).a.c(((aekj) this.b).A);
            } else {
                ((android.support.v7.widget.RecyclerView) obj).Y((kh) null);
            }
        }
    }

    public eca(be beVar, bt btVar, int i) {
        this.$cid = i;
        this.a = btVar;
        this.b = beVar;
    }

    public eca(android.view.ViewGroup viewGroup, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = viewGroup;
        this.b = obj;
    }
}
