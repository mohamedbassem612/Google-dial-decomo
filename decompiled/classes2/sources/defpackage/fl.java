package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class fl {
    final android.content.Context a;
    public aec b;
    public aec c;

    public fl(android.content.Context context) {
        this.a = context;
    }

    final android.view.MenuItem a(android.view.MenuItem menuItem) {
        if (!(menuItem instanceof dwx)) {
            return menuItem;
        }
        dwx dwxVar = (dwx) menuItem;
        aec aecVar = this.b;
        if (aecVar == null) {
            aecVar = new aec(0);
            this.b = aecVar;
        }
        android.view.MenuItem menuItem2 = (android.view.MenuItem) aecVar.get(dwxVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        defpackage.ga gaVar = new defpackage.ga(this.a, dwxVar);
        this.b.put(dwxVar, gaVar);
        return gaVar;
    }

    final android.view.SubMenu b(android.view.SubMenu subMenu) {
        if (!(subMenu instanceof defpackage.dwy)) {
            return subMenu;
        }
        defpackage.dwy dwyVar = (defpackage.dwy) subMenu;
        aec aecVar = this.c;
        if (aecVar == null) {
            aecVar = new aec(0);
            this.c = aecVar;
        }
        android.view.SubMenu subMenu2 = (android.view.SubMenu) aecVar.get(dwyVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        defpackage.gn gnVar = new defpackage.gn(this.a, dwyVar);
        this.c.put(dwyVar, gnVar);
        return gnVar;
    }
}
