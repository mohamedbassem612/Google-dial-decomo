package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aemr implements defpackage.aemh {
    public final defpackage.aemh a;
    final /* synthetic */ defpackage.aems b;
    private final defpackage.aemh c;
    private defpackage.aiof d;

    public aemr(defpackage.aems aemsVar, defpackage.aemh aemhVar, defpackage.aemh aemhVar2) {
        j$.util.Objects.requireNonNull(aemsVar);
        this.b = aemsVar;
        this.c = aemhVar;
        this.a = aemhVar2;
    }

    private final defpackage.ajcq i(defpackage.ahyc ahycVar) {
        return defpackage.ahvr.C((defpackage.ajcq) ahycVar.apply(this.c), defpackage.aemn.class, new defpackage.adpx(this, ahycVar, 5), defpackage.ajbm.INSTANCE);
    }

    private final defpackage.ajcq j(aemp aempVar, java.lang.String str, int i) {
        return defpackage.ahvr.C(aempVar.a(this.c, str, i), defpackage.aemn.class, new vlq(this, aempVar, str, i, 4), defpackage.ajbm.INSTANCE);
    }

    @Override // defpackage.aemh
    public final defpackage.ajcq a() {
        return i(new adfe(18));
    }

    @Override // defpackage.aemh
    public final defpackage.ajcq b(java.lang.String str) {
        return defpackage.ahvr.C(this.c.b(str), defpackage.aemn.class, new adot(this, str, 4), defpackage.ajbm.INSTANCE);
    }

    @Override // defpackage.aemh
    public final defpackage.ajcq c() {
        return i(new defpackage.adcu(13));
    }

    @Override // defpackage.aemh
    public final void d(aemg aemgVar) {
        java.util.List list = this.b.b;
        synchronized (list) {
            list.add(aemgVar);
            this.c.d(aemgVar);
        }
    }

    @Override // defpackage.aemh
    public final void e(aemg aemgVar) {
        java.util.List list = this.b.b;
        synchronized (list) {
            list.remove(aemgVar);
            this.c.e(aemgVar);
        }
    }

    @Override // defpackage.aemh
    public final defpackage.ajcq f(java.lang.String str, int i) {
        return j(new aemq(1), str, i);
    }

    @Override // defpackage.aemh
    public final defpackage.ajcq g(java.lang.String str, int i) {
        return j(new aemq(0), str, i);
    }

    public final void h(java.lang.Exception exc) {
        defpackage.aems aemsVar = this.b;
        java.util.List list = aemsVar.b;
        synchronized (list) {
            if (this.d == null) {
                this.d = defpackage.aiof.i("OneGoogle");
            }
            ((defpackage.aiob) ((defpackage.aiob) this.d.d()).l("com/google/android/libraries/onegoogle/owners/mdi/SafeMdiOwnersProvider$SafeDelegate", "enableSafeDelegate", 190, "SafeMdiOwnersProvider.java")).y("MDI Profile Sync not available on device. Reverting to backup implementation. Exception: %s", defpackage.aehj.m(exc));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                this.a.d((aemg) it.next());
            }
            aemsVar.a = this.a;
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                this.c.e((aemg) it2.next());
            }
            list.clear();
        }
    }
}
