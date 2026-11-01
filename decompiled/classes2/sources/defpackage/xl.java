package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class xl {
    public boolean a;
    public androidx.car.app.model.ItemList b;
    public final java.util.List c;
    public androidx.car.app.model.CarText d;
    public androidx.car.app.model.Action e;
    public androidx.car.app.model.ActionStrip f;
    public final java.util.List g;
    public androidx.car.app.model.Header h;

    public xl(androidx.car.app.model.ListTemplate listTemplate) {
        this.a = listTemplate.isLoading();
        this.e = listTemplate.getHeaderAction();
        this.d = listTemplate.getTitle();
        this.b = listTemplate.getSingleList();
        this.c = new java.util.ArrayList(listTemplate.getSectionedLists());
        this.f = listTemplate.getActionStrip();
        this.g = new java.util.ArrayList(listTemplate.getActions());
        this.h = listTemplate.getHeader();
    }

    public final androidx.car.app.model.ListTemplate a() {
        boolean z = true;
        if (this.b == null && this.c.isEmpty()) {
            z = false;
        }
        if (this.a == z) {
            throw new java.lang.IllegalStateException("Template is in a loading state but lists are added, or vice versa");
        }
        if (z) {
            java.util.List list = this.c;
            if (!list.isEmpty()) {
                defpackage.zp zpVar = defpackage.zp.b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    androidx.car.app.model.ItemList itemList = ((androidx.car.app.model.SectionedItemList) it.next()).getItemList();
                    if (itemList.getOnSelectedDelegate() != null && !zpVar.e) {
                        throw new java.lang.IllegalArgumentException("Selectable lists are not allowed");
                    }
                    arrayList.addAll(itemList.getItems());
                }
                zpVar.a(arrayList);
            } else if (this.b != null) {
                defpackage.zp zpVar2 = defpackage.zp.b;
                androidx.car.app.model.ItemList itemList2 = this.b;
                if (itemList2.getOnSelectedDelegate() != null && !zpVar2.e) {
                    throw new java.lang.IllegalArgumentException("Selectable lists are not allowed");
                }
                zpVar2.a(itemList2.getItems());
            }
        }
        java.util.List list2 = this.c;
        if (list2.isEmpty()) {
            androidx.car.app.model.ItemList itemList3 = this.b;
            if (itemList3 != null) {
                this.b = androidx.car.app.model.ListTemplate.truncate(itemList3, new xm());
            }
        } else {
            java.util.List truncatedCopy = androidx.car.app.model.ListTemplate.getTruncatedCopy(list2);
            list2.clear();
            list2.addAll(truncatedCopy);
        }
        return new androidx.car.app.model.ListTemplate(this);
    }

    public final void b(androidx.car.app.model.Header header) {
        if (header.getStartHeaderAction() != null) {
            this.e = header.getStartHeaderAction();
        }
        if (header.getTitle() != null) {
            this.d = header.getTitle();
        }
        if (!header.getEndHeaderActions().isEmpty()) {
            vx vxVar = new vx();
            java.util.Iterator it = header.getEndHeaderActions().iterator();
            while (it.hasNext()) {
                vxVar.b((androidx.car.app.model.Action) it.next());
            }
            this.f = vxVar.a();
        }
        this.h = header;
    }

    public final void c() {
        this.a = true;
    }

    public final void d(androidx.car.app.model.ItemList itemList) {
        this.b = (androidx.car.app.model.ItemList) j$.util.Objects.requireNonNull(itemList);
        this.c.clear();
    }

    public xl() {
        this.c = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
    }
}
