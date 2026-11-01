package com.google.android.setupdesign.items;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SectionItem extends com.google.android.setupdesign.items.ItemGroup {
    private final com.google.android.setupdesign.items.Item d;

    public SectionItem(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.v);
        java.lang.CharSequence text = typedArrayObtainStyledAttributes.getText(0);
        typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        com.google.android.setupdesign.items.SectionHeaderItem sectionHeaderItem = new com.google.android.setupdesign.items.SectionHeaderItem();
        this.d = sectionHeaderItem;
        sectionHeaderItem.e = text;
        sectionHeaderItem.b(0);
        sectionHeaderItem.g(false);
        h(sectionHeaderItem);
    }

    private final void i() {
        com.google.android.setupdesign.items.Item item = this.d;
        if (item.f) {
            if (a() == 1) {
                item.g(false);
            }
        } else {
            if (a() <= 0 || item.e == null) {
                return;
            }
            item.g(true);
        }
    }

    @Override // com.google.android.setupdesign.items.ItemGroup
    public final void f(defpackage.aghl aghlVar, int i) {
        super.f(aghlVar, i);
        i();
    }

    @Override // com.google.android.setupdesign.items.ItemGroup
    public final void g(defpackage.aghl aghlVar, int i) {
        super.g(aghlVar, i);
        i();
    }

    public final void h(defpackage.aghl aghlVar) {
        this.c = true;
        this.b.add(aghlVar);
        ((com.google.android.setupdesign.items.AbstractItemHierarchy) aghlVar).a.add(this);
        if (aghlVar.a() > 0) {
            d(super.e(aghlVar));
        }
        i();
    }

    public SectionItem() {
        com.google.android.setupdesign.items.SectionHeaderItem sectionHeaderItem = new com.google.android.setupdesign.items.SectionHeaderItem();
        this.d = sectionHeaderItem;
        sectionHeaderItem.g(false);
        h(sectionHeaderItem);
    }
}
