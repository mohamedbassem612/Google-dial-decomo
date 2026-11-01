package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class am implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ am(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                ((defpackage.aw) this.a).l();
                break;
            case 1:
                defpackage.aw awVar = (defpackage.aw) this.a;
                awVar.g(awVar.C.c);
                break;
            case 2:
                ((defpackage.aw) this.a).ab.f(defpackage.emp.ON_START);
                break;
            case 3:
                ((defpackage.aw) this.a).ad.a(defpackage.emp.ON_START);
                break;
            case 4:
                defpackage.aw awVar2 = (defpackage.aw) this.a;
                defpackage.cf cfVar = awVar2.ad;
                cfVar.b.ae(awVar2.j);
                awVar2.j = null;
                break;
            case 5:
                ((defpackage.aw) this.a).an();
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.aw) this.a).ab.f(defpackage.emp.ON_RESUME);
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.aw) this.a).ad.a(defpackage.emp.ON_RESUME);
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.aw) this.a).ad.a(defpackage.emp.ON_CREATE);
                break;
            case 9:
                ((defpackage.aw) this.a).ab.f(defpackage.emp.ON_CREATE);
                break;
            case 10:
                ((defpackage.aw) this.a).aE();
                break;
            case 11:
                defpackage.ck ckVar = (defpackage.ck) this.a;
                if (!ckVar.b.isEmpty()) {
                    ckVar.e();
                }
                break;
            case 12:
                ((defpackage.bo) this.a).ak(true);
                break;
            case 13:
                defpackage.dq dqVar = (defpackage.dq) this.a;
                if ((dqVar.I & 1) != 0) {
                    dqVar.D(0);
                }
                if ((dqVar.I & 4096) != 0) {
                    dqVar.D(108);
                }
                dqVar.H = false;
                dqVar.I = 0;
                break;
            case 14:
                ((android.support.v7.widget.RecyclerView) this.a).t = false;
                break;
            case 15:
                android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
                if (recyclerView.s && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.q) {
                        recyclerView.requestLayout();
                    } else if (recyclerView.v) {
                        recyclerView.u = true;
                    } else {
                        recyclerView.x();
                    }
                    break;
                }
                break;
            case 16:
                android.support.v7.widget.RecyclerView recyclerView2 = (android.support.v7.widget.RecyclerView) this.a;
                defpackage.km kmVar = recyclerView2.E;
                if (kmVar != null) {
                    kmVar.d();
                }
                recyclerView2.P = false;
                break;
            case 17:
                android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) this.a;
                java.util.ArrayList arrayList = toolbar.t;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    toolbar.f().removeItem(((android.view.MenuItem) arrayList.get(i)).getItemId());
                }
                android.view.Menu menuF = toolbar.f();
                java.util.ArrayList arrayListJ = toolbar.j();
                toolbar.A.bp(menuF, toolbar.g());
                java.util.ArrayList arrayListJ2 = toolbar.j();
                arrayListJ2.removeAll(arrayListJ);
                toolbar.t = arrayListJ2;
                break;
            case 18:
                ((android.support.v7.widget.Toolbar) this.a).eu();
                break;
            case 19:
                ((defpackage.mp) this.a).invalidateOptionsMenu();
                break;
            default:
                defpackage.mp.u((defpackage.mp) this.a);
                break;
        }
    }

    public am(java.lang.Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
