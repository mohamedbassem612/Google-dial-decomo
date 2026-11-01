package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afwo {
    public final defpackage.ft a;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    private final java.util.List e = new java.util.ArrayList();

    public afwo(defpackage.ft ftVar) {
        this.a = ftVar;
        c();
    }

    public final int a() {
        return this.e.size();
    }

    public final android.view.MenuItem b(int i) {
        return (android.view.MenuItem) this.e.get(i);
    }

    public final void c() {
        java.util.List list = this.e;
        list.clear();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        int i = 0;
        while (true) {
            defpackage.ft ftVar = this.a;
            if (i >= ftVar.size()) {
                break;
            }
            android.view.MenuItem item = ftVar.getItem(i);
            if (item.hasSubMenu()) {
                if (!list.isEmpty() && !(list.get(list.size() - 1) instanceof defpackage.afwf) && item.isVisible()) {
                    list.add(new defpackage.afwf());
                }
                list.add(item);
                android.view.SubMenu subMenu = item.getSubMenu();
                for (int i2 = 0; i2 < subMenu.size(); i2++) {
                    android.view.MenuItem item2 = subMenu.getItem(i2);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    list.add(item2);
                    this.b++;
                    if (item2.isVisible()) {
                        this.c++;
                    }
                }
                list.add(new defpackage.afwf());
            } else {
                list.add(item);
                this.b++;
                if (item.isVisible()) {
                    this.c++;
                    this.d++;
                }
            }
            i++;
        }
        if (list.isEmpty() || !(list.get(list.size() - 1) instanceof defpackage.afwf)) {
            return;
        }
        list.remove(list.size() - 1);
    }
}
