package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ft implements defpackage.dww {
    private static final int[] k = {1, 4, 5, 3, 2, 0};
    public final android.content.Context a;
    public defpackage.fr b;
    public final java.util.ArrayList c;
    public final java.util.ArrayList d;
    java.lang.CharSequence e;
    android.graphics.drawable.Drawable f;
    android.view.View g;
    public defpackage.fv i;
    public boolean j;
    private final android.content.res.Resources l;
    private boolean m;
    private final boolean n;
    private final java.util.ArrayList o;
    private boolean p;
    private final java.util.ArrayList q;
    private boolean r;
    private int s = 0;
    public boolean h = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private final java.util.ArrayList w = new java.util.ArrayList();
    private final java.util.concurrent.CopyOnWriteArrayList x = new java.util.concurrent.CopyOnWriteArrayList();
    private boolean y = false;

    public ft(android.content.Context context) {
        boolean z = false;
        this.a = context;
        android.content.res.Resources resources = context.getResources();
        this.l = resources;
        this.c = new java.util.ArrayList();
        this.o = new java.util.ArrayList();
        this.p = true;
        this.d = new java.util.ArrayList();
        this.q = new java.util.ArrayList();
        this.r = true;
        if (resources.getConfiguration().keyboard != 1 && ft$.ExternalSyntheticApiModelOutline0.m(android.view.ViewConfiguration.get(context))) {
            z = true;
        }
        this.n = z;
    }

    private final void F(int i, boolean z) {
        if (i >= 0) {
            java.util.ArrayList arrayList = this.c;
            if (i < arrayList.size()) {
                arrayList.remove(i);
                if (z) {
                    n(true);
                }
            }
        }
    }

    public boolean A() {
        return this.n;
    }

    public final boolean B(android.view.MenuItem menuItem, defpackage.ge geVar, int i) {
        boolean zH;
        defpackage.fv fvVar = (defpackage.fv) menuItem;
        if (fvVar == null || !fvVar.isEnabled()) {
            return false;
        }
        boolean zN = fvVar.n();
        defpackage.dzk dzkVar = fvVar.q;
        boolean z = dzkVar != null && dzkVar.c();
        if (fvVar.m()) {
            boolean zExpandActionView = zN | fvVar.expandActionView();
            if (!zExpandActionView) {
                return zExpandActionView;
            }
            i(true);
            return true;
        }
        if (fvVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                i(false);
            }
            if (!fvVar.hasSubMenu()) {
                fvVar.l(new gm(this.a, this, fvVar));
            }
            gm gmVar = fvVar.k;
            if (z) {
                dzkVar.b(gmVar);
            }
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.x;
            if (copyOnWriteArrayList.isEmpty()) {
                zH = false;
            } else {
                zH = geVar != null ? geVar.h(gmVar) : false;
                for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
                    defpackage.ge geVar2 = (defpackage.ge) weakReference.get();
                    if (geVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zH) {
                        zH = geVar2.h(gmVar);
                    }
                }
            }
            zN |= zH;
            if (!zN) {
                i(true);
                return false;
            }
        } else if ((i & 1) == 0) {
            i(true);
        }
        return zN;
    }

    final void C() {
        this.r = true;
        n(true);
    }

    final void D() {
        this.p = true;
        n(true);
    }

    public final void E() {
        this.s = 1;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i) {
        return c(0, 0, 0, this.l.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i4, android.view.MenuItem[] menuItemArr) {
        android.content.pm.PackageManager packageManager = this.a.getPackageManager();
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            android.content.pm.ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i5);
            android.content.Intent intent2 = new android.content.Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new android.content.ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            android.view.MenuItem menuItemC = c(i, i2, i3, resolveInfo.loadLabel(packageManager));
            menuItemC.setIcon(resolveInfo.loadIcon(packageManager));
            ((defpackage.fv) menuItemC).e = intent2;
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = menuItemC;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        defpackage.fv fvVar = (defpackage.fv) c(i, i2, i3, charSequence);
        gm gmVar = new gm(this.a, this, fvVar);
        fvVar.l(gmVar);
        return gmVar;
    }

    final defpackage.fv b(int i, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = this.w;
        arrayList.clear();
        l(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (defpackage.fv) arrayList.get(0);
        }
        boolean z = z();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.fv fvVar = (defpackage.fv) arrayList.get(i2);
            char c = z ? fvVar.h : fvVar.f;
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (z && c == '\b' && i == 67))) {
                return fvVar;
            }
        }
        return null;
    }

    public android.view.MenuItem c(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        int i4;
        int i5 = i3 >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new java.lang.IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (k[i5] << 16) | ((char) i3);
        defpackage.fv fvVar = new defpackage.fv(this, i, i2, i3, i6, charSequence, this.s);
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                i4 = 0;
            }
            arrayList.add(i4, fvVar);
            n(true);
            return fvVar;
        } while (((defpackage.fv) arrayList.get(size)).c > i6);
        i4 = size + 1;
        arrayList.add(i4, fvVar);
        n(true);
        return fvVar;
    }

    @Override // android.view.Menu
    public final void clear() {
        defpackage.fv fvVar = this.i;
        if (fvVar != null) {
            v(fvVar);
        }
        this.c.clear();
        n(true);
    }

    public final void clearHeader() {
        this.f = null;
        this.e = null;
        this.g = null;
        n(false);
    }

    @Override // android.view.Menu
    public final void close() {
        i(true);
    }

    protected java.lang.String d() {
        return "android:menu:actionviewstates";
    }

    public final java.util.ArrayList e() {
        m();
        return this.q;
    }

    public final java.util.ArrayList f() {
        boolean z = this.p;
        java.util.ArrayList arrayList = this.o;
        if (z) {
            arrayList.clear();
            java.util.ArrayList arrayList2 = this.c;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                defpackage.fv fvVar = (defpackage.fv) arrayList2.get(i);
                if (fvVar.isVisible()) {
                    arrayList.add(fvVar);
                }
            }
            this.p = false;
            this.r = true;
        }
        return arrayList;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem findItem(int i) {
        android.view.MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.fv fvVar = (defpackage.fv) this.c.get(i2);
            if (fvVar.a == i) {
                return fvVar;
            }
            if (fvVar.hasSubMenu() && (menuItemFindItem = fvVar.k.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final void g(defpackage.ge geVar) {
        h(geVar, this.a);
    }

    @Override // android.view.Menu
    public final android.view.MenuItem getItem(int i) {
        return (android.view.MenuItem) this.c.get(i);
    }

    public final void h(defpackage.ge geVar, android.content.Context context) {
        this.x.add(new java.lang.ref.WeakReference(geVar));
        geVar.c(context, this);
        this.r = true;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.j) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((defpackage.fv) this.c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z) {
        if (this.v) {
            return;
        }
        this.v = true;
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.x;
        for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
            defpackage.ge geVar = (defpackage.ge) weakReference.get();
            if (geVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                geVar.d(this, z);
            }
        }
        this.v = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, android.view.KeyEvent keyEvent) {
        return b(i, keyEvent) != null;
    }

    public final void j(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        android.util.SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.x;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
                defpackage.ge geVar = (defpackage.ge) weakReference.get();
                if (geVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int iA = geVar.a();
                    if (iA > 0 && (parcelable = (android.os.Parcelable) sparseParcelableArray.get(iA)) != null) {
                        geVar.n(parcelable);
                    }
                }
            }
        }
    }

    public final void k(android.os.Bundle bundle) {
        android.os.Parcelable parcelableCH;
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.x;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        android.util.SparseArray<? extends android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
            defpackage.ge geVar = (defpackage.ge) weakReference.get();
            if (geVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int iA = geVar.a();
                if (iA > 0 && (parcelableCH = geVar.cH()) != null) {
                    sparseArray.put(iA, parcelableCH);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    final void l(java.util.List list, int i, android.view.KeyEvent keyEvent) {
        char c;
        int i2;
        boolean z = z();
        int modifiers = keyEvent.getModifiers();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData)) {
            if (i != 67) {
                return;
            } else {
                i = 67;
            }
        }
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.fv fvVar = (defpackage.fv) arrayList.get(i3);
            if (fvVar.hasSubMenu()) {
                fvVar.k.l(list, i, keyEvent);
            }
            if (z) {
                c = fvVar.h;
                i2 = fvVar.i;
            } else {
                c = fvVar.f;
                i2 = fvVar.g;
            }
            if ((modifiers & 69647) == (i2 & 69647) && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (z && c == '\b' && i == 67)) && fvVar.isEnabled())) {
                list.add(fvVar);
            }
        }
    }

    public final void m() {
        java.util.ArrayList arrayListF = f();
        if (this.r) {
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.x;
            boolean zG = false;
            for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
                defpackage.ge geVar = (defpackage.ge) weakReference.get();
                if (geVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zG |= geVar.g();
                }
            }
            java.util.ArrayList arrayList = this.d;
            if (zG) {
                arrayList.clear();
                java.util.ArrayList arrayList2 = this.q;
                arrayList2.clear();
                int size = arrayListF.size();
                for (int i = 0; i < size; i++) {
                    defpackage.fv fvVar = (defpackage.fv) arrayListF.get(i);
                    if (fvVar.o()) {
                        arrayList.add(fvVar);
                    } else {
                        arrayList2.add(fvVar);
                    }
                }
            } else {
                arrayList.clear();
                java.util.ArrayList arrayList3 = this.q;
                arrayList3.clear();
                arrayList3.addAll(f());
            }
            this.r = false;
        }
    }

    public void n(boolean z) {
        boolean z2 = true;
        if (this.h) {
            this.t = true;
            if (z) {
                this.u = true;
                return;
            }
            return;
        }
        if (z) {
            this.p = true;
            this.r = true;
        } else {
            z2 = false;
        }
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.x;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        u();
        for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
            defpackage.ge geVar = (defpackage.ge) weakReference.get();
            if (geVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                geVar.f(z2);
            }
        }
        t();
    }

    public final void o(defpackage.ge geVar) {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.x;
        for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
            defpackage.ge geVar2 = (defpackage.ge) weakReference.get();
            if (geVar2 == null || geVar2 == geVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void p(android.os.Bundle bundle) {
        android.view.MenuItem menuItemFindItem;
        android.util.SparseArray<android.os.Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(d());
        int size = size();
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = getItem(i);
            android.view.View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                item.getSubMenu().p(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return B(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, android.view.KeyEvent keyEvent, int i2) {
        defpackage.fv fvVarB = b(i, keyEvent);
        boolean zB = fvVarB != null ? B(fvVarB, null, i2) : false;
        if ((i2 & 2) != 0) {
            i(true);
        }
        return zB;
    }

    public final void q(android.os.Bundle bundle) {
        int size = size();
        android.util.SparseArray<? extends android.os.Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            android.view.MenuItem item = getItem(i);
            android.view.View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new android.util.SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                item.getSubMenu().q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(d(), sparseArray);
        }
    }

    public void r(defpackage.fr frVar) {
        this.b = frVar;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((defpackage.fv) this.c.get(i2)).b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            java.util.ArrayList arrayList = this.c;
            int size2 = arrayList.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((defpackage.fv) arrayList.get(i2)).b != i) {
                    break;
                }
                F(i2, false);
                i3 = i4;
            }
            n(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            if (((defpackage.fv) this.c.get(i2)).a == i) {
                F(i2, true);
            }
            i2++;
        }
        i2 = -1;
        F(i2, true);
    }

    public final void s(int i, java.lang.CharSequence charSequence, int i2, android.graphics.drawable.Drawable drawable, android.view.View view) {
        if (view != null) {
            this.g = view;
            this.e = null;
            this.f = null;
        } else {
            if (i > 0) {
                this.e = this.l.getText(i);
            } else if (charSequence != null) {
                this.e = charSequence;
            }
            if (i2 > 0) {
                this.f = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.f = drawable;
            }
            this.g = null;
        }
        n(false);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.fv fvVar = (defpackage.fv) arrayList.get(i2);
            if (fvVar.b == i) {
                fvVar.j(z2);
                fvVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.fv fvVar = (defpackage.fv) arrayList.get(i2);
            if (fvVar.b == i) {
                fvVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.fv fvVar = (defpackage.fv) arrayList.get(i2);
            if (fvVar.b == i && fvVar.s(z)) {
                z2 = true;
            }
        }
        if (z2) {
            n(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.m = z;
        n(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    public final void t() {
        this.h = false;
        if (this.t) {
            this.t = false;
            n(this.u);
        }
    }

    public final void u() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.t = false;
        this.u = false;
    }

    public boolean v(defpackage.fv fvVar) {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.x;
        boolean zI = false;
        if (!copyOnWriteArrayList.isEmpty() && this.i == fvVar) {
            u();
            for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
                defpackage.ge geVar = (defpackage.ge) weakReference.get();
                if (geVar != null) {
                    zI = geVar.i(fvVar);
                    if (zI) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            t();
            if (zI) {
                this.i = null;
            }
        }
        return zI;
    }

    public boolean w(defpackage.ft ftVar, android.view.MenuItem menuItem) {
        defpackage.fr frVar = this.b;
        return frVar != null && frVar.L(ftVar, menuItem);
    }

    public boolean x(defpackage.fv fvVar) {
        java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference> copyOnWriteArrayList = this.x;
        boolean zJ = false;
        if (!copyOnWriteArrayList.isEmpty()) {
            u();
            for (java.lang.ref.WeakReference weakReference : copyOnWriteArrayList) {
                defpackage.ge geVar = (defpackage.ge) weakReference.get();
                if (geVar != null) {
                    zJ = geVar.j(fvVar);
                    if (zJ) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            t();
            if (zJ) {
                this.i = fvVar;
            }
        }
        return zJ;
    }

    public boolean y() {
        return this.y;
    }

    public boolean z() {
        return this.m;
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i, int i2, int i3, int i4) {
        return c(i, i2, i3, this.l.getString(i4));
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int i, int i2, int i3, java.lang.CharSequence charSequence) {
        return c(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(java.lang.CharSequence charSequence) {
        return c(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.l.getString(i4));
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.l.getString(i));
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public defpackage.ft a() {
        return this;
    }
}
