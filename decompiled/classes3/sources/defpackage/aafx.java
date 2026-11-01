package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class aafx extends defpackage.aaft {
    private boolean b;
    private java.util.ArrayList c;

    protected aafx(com.google.android.gms.common.data.DataHolder dataHolder) {
        super(dataHolder);
        this.b = false;
    }

    private final void b() {
        synchronized (this) {
            if (!this.b) {
                com.google.android.gms.common.data.DataHolder dataHolder = this.a;
                aais.as(dataHolder);
                int i = dataHolder.h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                this.c = arrayList;
                if (i > 0) {
                    arrayList.add(0);
                    java.lang.String strG = g();
                    java.lang.String strC = dataHolder.c(strG, 0, dataHolder.b(0));
                    for (int i2 = 1; i2 < i; i2++) {
                        int iB = dataHolder.b(i2);
                        java.lang.String strC2 = dataHolder.c(strG, i2, iB);
                        if (strC2 == null) {
                            throw new java.lang.NullPointerException("Missing value for markerColumn: " + strG + ", at row: " + i2 + ", for window: " + iB);
                        }
                        if (!strC2.equals(strC)) {
                            this.c.add(java.lang.Integer.valueOf(i2));
                            strC = strC2;
                        }
                    }
                }
                this.b = true;
            }
        }
    }

    @Override // defpackage.aaft, defpackage.aafu
    public final int c() {
        b();
        return this.c.size();
    }

    @Override // defpackage.aafu
    public final java.lang.Object d(int i) {
        int iIntValue;
        int iIntValue2;
        b();
        int iE = e(i);
        int i2 = 0;
        if (i >= 0 && i != this.c.size()) {
            if (i == this.c.size() - 1) {
                com.google.android.gms.common.data.DataHolder dataHolder = this.a;
                aais.as(dataHolder);
                iIntValue = dataHolder.h;
                iIntValue2 = ((java.lang.Integer) this.c.get(i)).intValue();
            } else {
                iIntValue = ((java.lang.Integer) this.c.get(i + 1)).intValue();
                iIntValue2 = ((java.lang.Integer) this.c.get(i)).intValue();
            }
            i2 = iIntValue - iIntValue2;
            if (i2 == 1) {
                int iE2 = e(i);
                com.google.android.gms.common.data.DataHolder dataHolder2 = this.a;
                aais.as(dataHolder2);
                dataHolder2.b(iE2);
                i2 = 1;
            }
        }
        return f(iE, i2);
    }

    final int e(int i) {
        if (i < 0 || i >= this.c.size()) {
            throw new java.lang.IllegalArgumentException(a.bs(i, "Position ", " is out of bounds for this buffer"));
        }
        return ((java.lang.Integer) this.c.get(i)).intValue();
    }

    protected abstract java.lang.Object f(int i, int i2);

    protected abstract java.lang.String g();
}
