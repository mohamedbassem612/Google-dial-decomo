package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ryx implements agye {
    final /* synthetic */ defpackage.rza a;

    public ryx(defpackage.rza rzaVar) {
        this.a = rzaVar;
    }

    public final void a(java.lang.Throwable th) {
        defpackage.rza.a.c().k(th).l("com/android/dialer/patrick/account/ui/CallingCardAccountFragmentPeer$accountListCallbacks$<anonymous>", "onError", 243, "CallingCardAccountFragmentPeer.kt").v("Account list retrieval failure.");
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aooh.f(list, "data");
        defpackage.rza rzaVar = this.a;
        java.lang.String str = rzaVar.l.a().h;
        if (str.length() == 0) {
            str = rzaVar.f.f;
            aooh.e(str, "getGaiaAccountName(...)");
        }
        if (((java.lang.Boolean) rzaVar.j.a()).booleanValue() && str.length() > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (aooh.n(((defpackage.agon) obj2).b.g, str)) {
                    arrayList.add(obj2);
                }
            }
            list = arrayList;
        }
        rzaVar.h.e.a(ahvr.bv(list));
    }

    public final /* synthetic */ void c() {
    }
}
