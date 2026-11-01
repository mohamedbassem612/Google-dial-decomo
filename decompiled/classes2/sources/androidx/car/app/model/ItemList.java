package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class ItemList {
    private final java.util.List mItems;
    private final androidx.car.app.model.CarText mNoItemsMessage;
    private final defpackage.xy mOnItemVisibilityChangedDelegate;
    private final defpackage.ya mOnSelectedDelegate;
    private final int mSelectedIndex;

    public ItemList(defpackage.xi xiVar) {
        this.mSelectedIndex = xiVar.b;
        this.mItems = defpackage.rv.d(xiVar.a);
        this.mNoItemsMessage = xiVar.e;
        this.mOnSelectedDelegate = xiVar.c;
        this.mOnItemVisibilityChangedDelegate = xiVar.d;
    }

    public static defpackage.xs getOnClickDelegate(defpackage.xh xhVar) {
        if (xhVar instanceof androidx.car.app.model.Row) {
            return ((androidx.car.app.model.Row) xhVar).getOnClickDelegate();
        }
        if (xhVar instanceof androidx.car.app.model.GridItem) {
            return ((androidx.car.app.model.GridItem) xhVar).getOnClickDelegate();
        }
        return null;
    }

    public static androidx.car.app.model.Toggle getToggle(defpackage.xh xhVar) {
        if (xhVar instanceof androidx.car.app.model.Row) {
            return ((androidx.car.app.model.Row) xhVar).getToggle();
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.ItemList) {
            androidx.car.app.model.ItemList itemList = (androidx.car.app.model.ItemList) obj;
            if (this.mSelectedIndex == itemList.mSelectedIndex && j$.util.Objects.equals(this.mItems, itemList.mItems)) {
                if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mOnSelectedDelegate == null), java.lang.Boolean.valueOf(itemList.mOnSelectedDelegate == null))) {
                    if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), java.lang.Boolean.valueOf(itemList.mOnItemVisibilityChangedDelegate == null)) && j$.util.Objects.equals(this.mNoItemsMessage, itemList.mNoItemsMessage)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public java.util.List getItems() {
        return defpackage.rv.c(this.mItems);
    }

    public androidx.car.app.model.CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public defpackage.xy getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public defpackage.ya getOnSelectedDelegate() {
        return this.mOnSelectedDelegate;
    }

    public int getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.mSelectedIndex), this.mItems, java.lang.Boolean.valueOf(this.mOnSelectedDelegate == null), java.lang.Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), this.mNoItemsMessage});
    }

    public defpackage.xi toBuilder() {
        return new defpackage.xi(this);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[ items: ");
        java.util.List list = this.mItems;
        sb.append(list != null ? list.toString() : null);
        sb.append(", selected: ");
        sb.append(this.mSelectedIndex);
        sb.append(']');
        return sb.toString();
    }

    private ItemList() {
        this.mSelectedIndex = 0;
        this.mItems = java.util.Collections.EMPTY_LIST;
        this.mNoItemsMessage = null;
        this.mOnSelectedDelegate = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }
}
