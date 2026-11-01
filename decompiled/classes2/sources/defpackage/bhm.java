package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bhm {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public bhm(long j, long j2, long j3) {
        cpp cppVar = new cpp(j);
        cdu cduVar = cdu.c;
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(cppVar, cduVar);
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(new cpm(j2), cduVar);
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(new cpm(j3), cduVar);
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(new cpm(j2), cduVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [aomy, java.lang.Object] */
    public final boolean a(android.view.Menu menu) {
        int i;
        int i2;
        java.lang.Object objA = this.b.a();
        if (aooh.n(objA, (java.lang.Object) null)) {
            return false;
        }
        menu.clear();
        java.util.List list = ((defpackage.bhe) objA).b;
        int size = list.size();
        int i3 = 1;
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            defpackage.bhd bhdVar = (defpackage.bhd) list.get(i5);
            if (bhdVar instanceof defpackage.bhf) {
                i = i3 + 1;
                java.lang.Object obj = bhdVar.a;
                if (aooh.n(obj, defpackage.bhg.a)) {
                    i2 = android.R.id.cut;
                } else if (aooh.n(obj, defpackage.bhg.b)) {
                    i2 = android.R.id.copy;
                } else if (aooh.n(obj, defpackage.bhg.c)) {
                    i2 = android.R.id.paste;
                } else if (aooh.n(obj, defpackage.bhg.d)) {
                    i2 = android.R.id.selectAll;
                } else {
                    i2 = aooh.n(obj, defpackage.bhg.e) ? android.R.id.autofill : i3;
                }
                android.view.MenuItem menuItemAdd = menu.add(i4, i2, i3, ((defpackage.bhf) bhdVar).b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new rpw(bhdVar, this, 1));
            } else {
                if (bhdVar instanceof defpackage.bhj) {
                    i = i3 + 1;
                    final android.content.Context context = ((android.view.View) this.d).getContext();
                    defpackage.bhj bhjVar = (defpackage.bhj) bhdVar;
                    final android.view.textclassifier.TextClassification textClassification = bhjVar.b;
                    int i6 = bhjVar.c;
                    android.graphics.drawable.Drawable drawable = bhjVar.d;
                    if (i6 < 0) {
                        android.view.MenuItem menuItemAdd2 = menu.add(android.R.id.textAssist, android.R.id.textAssist, i3, aa$.ExternalSyntheticApiModelOutline0.m(textClassification));
                        menuItemAdd2.setShowAsAction(2);
                        menuItemAdd2.setIcon(drawable);
                        menuItemAdd2.setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() { // from class: bid
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public final boolean onMenuItemClick(android.view.MenuItem menuItem) throws android.app.PendingIntent.CanceledException {
                                defpackage.yv.c(context, textClassification);
                                return true;
                            }
                        });
                    } else {
                        final android.app.RemoteAction remoteActionM = aa$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(textClassification).get(i6));
                        android.view.MenuItem menuItemAdd3 = menu.add(android.R.id.textAssist, i6 != 0 ? 0 : 16908353, i3, aa$.ExternalSyntheticApiModelOutline0.m(remoteActionM));
                        menuItemAdd3.setShowAsAction(i6 != 0 ? 0 : 2);
                        if (drawable != null) {
                            menuItemAdd3.setIcon(drawable);
                        }
                        menuItemAdd3.setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() { // from class: bie
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public final boolean onMenuItemClick(android.view.MenuItem menuItem) throws android.app.PendingIntent.CanceledException {
                                defpackage.yv.b(aa$.ExternalSyntheticApiModelOutline0.m(remoteActionM));
                                return true;
                            }
                        });
                    }
                } else if (bhdVar instanceof defpackage.bhh) {
                    i4++;
                }
            }
            i3 = i;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [cer, java.lang.Object] */
    public final long b() {
        return ((cpm) this.b.a()).a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [cer, java.lang.Object] */
    public final long c() {
        return ((cpm) this.c.a()).a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [cer, java.lang.Object] */
    public final long d() {
        return ((cpp) this.d.a()).a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [cer, java.lang.Object] */
    public final long e() {
        return ((cpm) this.a.a()).a;
    }

    public bhm(defpackage.bhi bhiVar, aomy aomyVar, aomy aomyVar2, android.view.View view) {
        this.a = bhiVar;
        this.b = aomyVar;
        this.c = aomyVar2;
        this.d = view;
    }

    public bhm(aonp aonpVar) {
        this.a = aonpVar;
        this.c = new rai(this, (byte[]) null);
        this.b = new nf((char[]) null, (byte[]) null, (byte[]) null);
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, cdu.c);
    }
}
