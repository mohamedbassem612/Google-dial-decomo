package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class SectionedItemList {
    private final androidx.car.app.model.CarText mHeader;
    private final androidx.car.app.model.ItemList mItemList;

    private SectionedItemList() {
        this.mItemList = null;
        this.mHeader = null;
    }

    public static androidx.car.app.model.SectionedItemList create(androidx.car.app.model.ItemList itemList, java.lang.CharSequence charSequence) {
        androidx.car.app.model.CarText carTextCreate = androidx.car.app.model.CarText.create((java.lang.CharSequence) j$.util.Objects.requireNonNull(charSequence));
        defpackage.zl.d.a(carTextCreate);
        return new androidx.car.app.model.SectionedItemList((androidx.car.app.model.ItemList) j$.util.Objects.requireNonNull(itemList), carTextCreate);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.SectionedItemList) {
            androidx.car.app.model.SectionedItemList sectionedItemList = (androidx.car.app.model.SectionedItemList) obj;
            if (j$.util.Objects.equals(this.mItemList, sectionedItemList.mItemList) && j$.util.Objects.equals(this.mHeader, sectionedItemList.mHeader)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.CarText getHeader() {
        return (androidx.car.app.model.CarText) j$.util.Objects.requireNonNull(this.mHeader);
    }

    public androidx.car.app.model.ItemList getItemList() {
        return (androidx.car.app.model.ItemList) j$.util.Objects.requireNonNull(this.mItemList);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mItemList, this.mHeader});
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[ items: ");
        sb.append(this.mItemList);
        sb.append(", has header: ");
        sb.append(this.mHeader != null);
        sb.append(']');
        return sb.toString();
    }

    private SectionedItemList(androidx.car.app.model.ItemList itemList, androidx.car.app.model.CarText carText) {
        this.mItemList = itemList;
        this.mHeader = carText;
    }
}
