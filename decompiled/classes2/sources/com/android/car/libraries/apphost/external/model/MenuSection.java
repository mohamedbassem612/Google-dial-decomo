package com.android.car.libraries.apphost.external.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class MenuSection {
    private androidx.car.app.model.CarText header;
    private defpackage.hhg itemSize;
    private java.util.List items;
    private defpackage.aaw itemsDelegate;
    private java.lang.CharSequence noItemsMessage;
    private defpackage.xy onItemVisibilityChangedListener;
    private defpackage.ya onSelectedListener;
    private int selectedIndex;
    private defpackage.hhh textAlign;

    private MenuSection(defpackage.hhf hhfVar) {
        this();
        this.items = hhfVar.a;
        defpackage.aaw aawVar = hhfVar.b;
        this.itemsDelegate = aawVar == null ? new androidx.car.app.serialization.ListDelegateImpl(hhfVar.a) : aawVar;
        this.noItemsMessage = hhfVar.c;
        this.selectedIndex = hhfVar.d;
        this.onSelectedListener = hhfVar.e;
        this.onItemVisibilityChangedListener = hhfVar.f;
        this.itemSize = hhfVar.g;
        this.header = hhfVar.h;
        this.textAlign = hhfVar.i;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.android.car.libraries.apphost.external.model.MenuSection) {
            com.android.car.libraries.apphost.external.model.MenuSection menuSection = (com.android.car.libraries.apphost.external.model.MenuSection) obj;
            if (aooh.n(getItems(), menuSection.getItems()) && aooh.n(this.noItemsMessage, menuSection.noItemsMessage) && this.selectedIndex == menuSection.selectedIndex && aooh.n(this.onSelectedListener, menuSection.onSelectedListener) && aooh.n(this.onItemVisibilityChangedListener, menuSection.onItemVisibilityChangedListener) && getItemSize() == menuSection.getItemSize() && aooh.n(this.header, menuSection.header) && this.textAlign == menuSection.textAlign) {
                return true;
            }
        }
        return false;
    }

    public final androidx.car.app.model.CarText getHeader() {
        return this.header;
    }

    public final defpackage.hhg getItemSize() {
        defpackage.hhg hhgVar = this.itemSize;
        if (hhgVar != null) {
            return hhgVar;
        }
        aooh.j("itemSize");
        return null;
    }

    public final java.util.List getItems() {
        java.util.List list = this.items;
        if (list != null) {
            return list;
        }
        aooh.j("items");
        return null;
    }

    public final defpackage.aaw getItemsDelegate() {
        defpackage.aaw aawVar = this.itemsDelegate;
        if (aawVar != null) {
            return aawVar;
        }
        aooh.j("itemsDelegate");
        return null;
    }

    public final java.lang.CharSequence getNoItemsMessage() {
        return this.noItemsMessage;
    }

    public final defpackage.xy getOnItemVisibilityChangedListener() {
        return this.onItemVisibilityChangedListener;
    }

    public final defpackage.ya getOnSelectedListener() {
        return this.onSelectedListener;
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    public final defpackage.hhh getTextAlign() {
        return this.textAlign;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{getItems(), this.noItemsMessage, java.lang.Integer.valueOf(this.selectedIndex), this.onSelectedListener, this.onItemVisibilityChangedListener, getItemSize(), this.header, this.textAlign});
    }

    public final defpackage.hhf toBuilder() {
        defpackage.hhf hhfVar = new defpackage.hhf(getItems());
        hhfVar.c = this.noItemsMessage;
        hhfVar.b = getItemsDelegate();
        hhfVar.d = this.selectedIndex;
        hhfVar.e = this.onSelectedListener;
        hhfVar.f = this.onItemVisibilityChangedListener;
        defpackage.hhg itemSize = getItemSize();
        aooh.f(itemSize, "itemSize");
        hhfVar.g = itemSize;
        hhfVar.h = this.header;
        defpackage.hhh hhhVar = this.textAlign;
        aooh.f(hhhVar, "textAlign");
        hhfVar.i = hhhVar;
        return hhfVar;
    }

    public java.lang.String toString() {
        int size = getItems().size();
        java.lang.CharSequence charSequence = this.noItemsMessage;
        return "MenuSection([" + size + " items], " + ((java.lang.Object) charSequence) + ", " + this.selectedIndex + ", " + this.onSelectedListener + ", " + this.onItemVisibilityChangedListener + ", " + getItemSize() + ", " + this.header + ", " + this.textAlign + ')';
    }

    public /* synthetic */ MenuSection(defpackage.hhf hhfVar, aooc aoocVar) {
        this(hhfVar);
    }

    private MenuSection() {
        this.textAlign = defpackage.hhh.a;
    }
}
