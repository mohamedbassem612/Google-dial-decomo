package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kny {
    public static final aimz a = aimz.i("com/android/dialer/calllog/ui/multibindingmenu/DropdownMenuViewPeer");
    public final com.android.dialer.calllog.ui.multibindingmenu.DropdownMenuView b;
    public final zzx c;
    private final aoin d;
    private defpackage.klb e;
    private final aoir f;

    public kny(com.android.dialer.calllog.ui.multibindingmenu.DropdownMenuView dropdownMenuView, zzx zzxVar, aoin aoinVar) {
        aooh.f(aoinVar, "enableCallLogInCompose");
        this.b = dropdownMenuView;
        this.c = zzxVar;
        this.d = aoinVar;
        this.f = aooc.ah(3, new defpackage.kgq(this, 5));
    }

    private final void c() {
        d();
        if (this.e == null) {
            throw new java.lang.IllegalStateException("Called unbind before bind.");
        }
        vwb vwbVarE = e();
        if (vwbVarE != null) {
            vwbVarE.m((java.lang.Object) null);
        }
        this.e = null;
    }

    private static final void d() {
        if (!aooh.n(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            throw new java.lang.IllegalStateException("Called from non-main thread");
        }
    }

    private final vwb e() {
        return (vwb) this.f.a();
    }

    public final void a() {
        if (this.e != null) {
            c();
        }
    }

    public final void b(defpackage.klb klbVar) {
        if (((java.lang.Boolean) this.d.a()).booleanValue() && aooh.n(klbVar, this.e)) {
            return;
        }
        if (this.e != null) {
            c();
        }
        d();
        this.e = klbVar;
        vwb vwbVarE = e();
        if (vwbVarE != null) {
            vwbVarE.m(klbVar);
        }
    }
}
