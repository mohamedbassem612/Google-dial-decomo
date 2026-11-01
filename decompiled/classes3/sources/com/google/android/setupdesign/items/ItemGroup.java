package com.google.android.setupdesign.items;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ItemGroup extends com.google.android.setupdesign.items.AbstractItemHierarchy {
    public final java.util.List b;
    public boolean c;
    private final android.util.SparseIntArray d;
    private int e;

    public ItemGroup() {
        this.b = new java.util.ArrayList();
        this.d = new android.util.SparseIntArray();
        this.e = 0;
        this.c = false;
    }

    private final void h() {
        if (!this.c) {
            return;
        }
        this.e = 0;
        android.util.SparseIntArray sparseIntArray = this.d;
        sparseIntArray.clear();
        int i = 0;
        while (true) {
            java.util.List list = this.b;
            if (i >= list.size()) {
                this.c = false;
                return;
            }
            defpackage.aghl aghlVar = (defpackage.aghl) list.get(i);
            if (aghlVar.a() > 0) {
                sparseIntArray.put(i, this.e);
            }
            this.e += aghlVar.a();
            i++;
        }
    }

    @Override // defpackage.aghl
    public final int a() {
        h();
        return this.e;
    }

    public final int e(defpackage.aghl aghlVar) {
        java.util.List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (list.get(i) == aghlVar) {
                break;
            }
            i++;
        }
        h();
        if (i == -1) {
            return -1;
        }
        int size2 = list.size();
        int i2 = -1;
        while (i2 < 0) {
            if (i >= size2) {
                return a();
            }
            i2 = this.d.get(i, -1);
            i++;
        }
        return i2;
    }

    public void f(defpackage.aghl aghlVar, int i) {
        this.c = true;
        int iE = e(aghlVar);
        if (iE >= 0) {
            c(iE + i);
        } else {
            android.util.Log.e("ItemGroup", "Unexpected child remove ".concat(aghlVar.toString()));
        }
    }

    public void g(defpackage.aghl aghlVar, int i) {
        this.c = true;
        int iE = e(aghlVar);
        if (iE >= 0) {
            d(iE + i);
        } else {
            android.util.Log.e("ItemGroup", "Unexpected child insert ".concat(aghlVar.toString()));
        }
    }

    public ItemGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new java.util.ArrayList();
        this.d = new android.util.SparseIntArray();
        this.e = 0;
        this.c = false;
    }
}
