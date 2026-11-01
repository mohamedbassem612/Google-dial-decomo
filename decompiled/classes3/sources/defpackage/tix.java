package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class tix implements ajcb {
    final /* synthetic */ defpackage.tja a;
    private final android.app.Activity b;
    private final com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView c;

    public tix(defpackage.tja tjaVar, android.app.Activity activity, com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView dialerExpandedSheetView) {
        j$.util.Objects.requireNonNull(tjaVar);
        this.a = tjaVar;
        this.b = activity;
        this.c = dialerExpandedSheetView;
    }

    public final void a(java.lang.Throwable th) {
        a.by(defpackage.tja.a.d(), "failed to fetch history action", "com/android/dialer/searchfragment/enhancedsearch/SearchResultExpandedSheetPopulator$FetchOpenHistoryActionFutureCallback", "onFailure", (char) 746, "SearchResultExpandedSheetPopulator.java", th);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        defpackage.tjh tjhVar = (defpackage.tjh) obj;
        if (tjhVar == null) {
            defpackage.tja.a.b().l("com/android/dialer/searchfragment/enhancedsearch/SearchResultExpandedSheetPopulator$FetchOpenHistoryActionFutureCallback", "onSuccess", 735, "SearchResultExpandedSheetPopulator.java").v("loaded action is null");
        } else {
            if (this.b.isDestroyed()) {
                return;
            }
            defpackage.tja tjaVar = this.a;
            tjaVar.e(this.c, tjaVar.f.k(tjhVar, aify.p(tjaVar.e ? rmw.jM : rmw.jJ)));
        }
    }
}
