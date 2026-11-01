package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kbl implements defpackage.ahtl {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public kbl(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.ahtl
    public final /* synthetic */ ahtm a(defpackage.ahth ahthVar) throws java.io.IOException {
        switch (this.$cid) {
            case 0:
                defpackage.map mapVar = (defpackage.map) ahthVar;
                defpackage.aooh.f(mapVar, "event");
                defpackage.kiu kiuVar = mapVar.a;
                defpackage.kbk kbkVar = (defpackage.kbk) this.a;
                defpackage.kbi kbiVar = kbkVar.a;
                kbkVar.c.g(kbkVar.d.m(kbiVar.H(), kiuVar, defpackage.kbk.a(kbiVar)), 5L, java.util.concurrent.TimeUnit.SECONDS);
                break;
            case 1:
                defpackage.kuk kukVar = (defpackage.kuk) ahthVar;
                defpackage.aooh.f(kukVar, "event");
                long j = kukVar.b;
                java.lang.String str = kukVar.a;
                defpackage.kbk kbkVar2 = (defpackage.kbk) this.a;
                kbkVar2.e.i(zoe.N(kbkVar2.i.X(j, str)), kbkVar2.f);
                break;
            case 2:
                defpackage.aooh.f((defpackage.rod) ahthVar, "event");
                defpackage.aimz aimzVar = defpackage.rqi.a;
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "onShowDialpadEvent", 942, "MainFragmentPeer.kt")).v("enter");
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "onShowDialpadEvent", 943, "MainFragmentPeer.kt")).v("select dialpad tab");
                java.lang.Object obj = this.a;
                defpackage.rqi rqiVar = (defpackage.rqi) obj;
                rqiVar.f.i(zoe.N(rqiVar.d.b(defpackage.roc.DIALPAD_KEY)), rqiVar.v);
                break;
            case 3:
                defpackage.aooh.f((defpackage.rqm) ahthVar, "event");
                defpackage.rqi rqiVar2 = (defpackage.rqi) this.a;
                defpackage.rlv rlvVar = rqiVar2.h;
                android.view.View viewN = rqiVar2.b.N();
                rlvVar.o(defpackage.rmx.HAMBURGER_MENU_CLICKED);
                rqiVar2.e(defpackage.mce.USER_CLICKED_NAVIGATION_MENU_BUTTON);
                defpackage.rqi.j(viewN).u(defpackage.rqi.i(viewN));
                if (!rqiVar2.p) {
                    ((defpackage.aimw) defpackage.rqi.a.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "onHamburgerIconClicked", 698, "MainFragmentPeer.kt")).v("initializing menu");
                    rqiVar2.d();
                }
                break;
            case 4:
                defpackage.aooh.f((defpackage.rqn) ahthVar, "event");
                java.lang.Object obj2 = this.a;
                defpackage.rqi rqiVar3 = (defpackage.rqi) obj2;
                rqiVar3.h.o(defpackage.rmx.SEARCH_BAR_CLICKED);
                rqiVar3.e(defpackage.mce.USER_CLICKED_SEARCH_BAR);
                rqiVar3.f.i(zoe.N(rqiVar3.d.f(3, "")), rqiVar3.w);
                rqiVar3.c.d(rqiVar3.b.H());
                break;
            case 5:
                defpackage.rqq rqqVar = (defpackage.rqq) ahthVar;
                defpackage.aooh.f(rqqVar, "event");
                defpackage.rqi rqiVar4 = (defpackage.rqi) this.a;
                rqiVar4.e(defpackage.mce.VOICE_SEARCH_TEXT_RECEIVED);
                rqiVar4.f.i(zoe.N(rqiVar4.d.f(3, rqqVar.a)), rqiVar4.w);
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aooh.f((defpackage.rqr) ahthVar, "event");
                defpackage.rqi rqiVar5 = (defpackage.rqi) this.a;
                rqiVar5.f.i(zoe.N(rqiVar5.d.a()), rqiVar5.x);
                break;
            default:
                defpackage.aooh.f((defpackage.rqs) ahthVar, "event");
                ((defpackage.rqi) this.a).o = true;
                break;
        }
        return ahtm.a;
    }
}
