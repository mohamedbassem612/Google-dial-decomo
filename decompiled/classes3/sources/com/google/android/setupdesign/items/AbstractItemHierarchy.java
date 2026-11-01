package com.google.android.setupdesign.items;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class AbstractItemHierarchy implements defpackage.aghl {
    public final java.util.ArrayList a = new java.util.ArrayList();

    public AbstractItemHierarchy(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.a);
        typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(int i) {
        if (i < 0) {
            android.util.Log.w("AbstractItemHierarchy", a.bj(i, "notifyItemRangeChanged: Invalid position="));
            return;
        }
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.setupdesign.items.ItemGroup itemGroup = (com.google.android.setupdesign.items.ItemGroup) arrayList.get(i2);
            int iE = itemGroup.e(this);
            if (iE >= 0) {
                itemGroup.b(iE + i);
            } else {
                android.util.Log.e("ItemGroup", "Unexpected child change ".concat(toString()));
            }
        }
    }

    public final void c(int i) {
        if (i < 0) {
            android.util.Log.w("AbstractItemHierarchy", a.bj(i, "notifyItemRangeInserted: Invalid position="));
            return;
        }
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((com.google.android.setupdesign.items.ItemGroup) arrayList.get(i2)).f(this, i);
        }
    }

    public final void d(int i) {
        if (i < 0) {
            android.util.Log.w("AbstractItemHierarchy", a.bj(i, "notifyItemRangeInserted: Invalid position="));
            return;
        }
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((com.google.android.setupdesign.items.ItemGroup) arrayList.get(i2)).g(this, i);
        }
    }

    public AbstractItemHierarchy() {
    }
}
