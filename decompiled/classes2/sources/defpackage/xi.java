package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class xi {
    public final java.util.List a;
    public int b;
    public defpackage.ya c;
    public defpackage.xy d;
    public androidx.car.app.model.CarText e;

    public xi(androidx.car.app.model.ItemList itemList) {
        this.b = itemList.getSelectedIndex();
        this.c = itemList.getOnSelectedDelegate();
        this.d = itemList.getOnItemVisibilityChangedDelegate();
        this.e = itemList.getNoItemsMessage();
        this.a = new java.util.ArrayList(itemList.getItems());
    }

    public final androidx.car.app.model.ItemList a() {
        if (this.c != null) {
            java.util.List<defpackage.xh> list = this.a;
            int size = list.size();
            if (size == 0) {
                throw new java.lang.IllegalStateException("A selectable list cannot be empty");
            }
            if (this.b >= size) {
                throw new java.lang.IllegalStateException("The selected item index (" + this.b + ") is larger than the size of the list (" + size + ')');
            }
            for (defpackage.xh xhVar : list) {
                if (androidx.car.app.model.ItemList.getOnClickDelegate(xhVar) != null) {
                    throw new java.lang.IllegalStateException("Items that belong to selectable lists can't have an onClickListener. Use the OnSelectedListener of the list instead");
                }
                if (androidx.car.app.model.ItemList.getToggle(xhVar) != null) {
                    throw new java.lang.IllegalStateException("Items that belong to selectable lists can't have a toggle");
                }
            }
        }
        return new androidx.car.app.model.ItemList(this);
    }

    public final void b(defpackage.xh xhVar) {
        this.a.add((defpackage.xh) j$.util.Objects.requireNonNull(xhVar));
    }

    public xi() {
        this.a = new java.util.ArrayList();
    }
}
