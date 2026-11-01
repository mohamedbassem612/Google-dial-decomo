package com.google.android.gms.common.data;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class DataHolder extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.io.Closeable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkk(14);
    final int a;
    public final java.lang.String[] b;
    public android.os.Bundle c;
    public final android.database.CursorWindow[] d;
    public final int e;
    public final android.os.Bundle f;
    public int[] g;
    public int h;
    int i = 1;
    private final boolean j = true;

    static {
        new java.util.ArrayList();
        new java.util.HashMap();
    }

    public DataHolder(int i, java.lang.String[] strArr, android.database.CursorWindow[] cursorWindowArr, int i2, android.os.Bundle bundle) {
        this.a = i;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i2;
        this.f = bundle;
    }

    public final int a(java.lang.String str, int i, int i2) {
        d(str, i);
        return this.d[i2].getInt(i, this.c.getInt(str));
    }

    public final int b(int i) {
        int length;
        int i2 = 0;
        aais.an(i >= 0 && i < this.h);
        while (true) {
            int[] iArr = this.g;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == length ? i2 - 1 : i2;
    }

    public final java.lang.String c(java.lang.String str, int i, int i2) {
        d(str, i);
        return this.d[i2].getString(i, this.c.getInt(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e();
    }

    public final void d(java.lang.String str, int i) {
        android.os.Bundle bundle = this.c;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new java.lang.IllegalArgumentException("No such column: ".concat(str));
        }
        if (h()) {
            throw new java.lang.IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.h) {
            throw new android.database.CursorIndexOutOfBoundsException(i, this.h);
        }
    }

    public final void e() {
        synchronized (this) {
            int i = this.i - 1;
            this.i = i;
            if (i == 0) {
                for (android.database.CursorWindow cursorWindow : this.d) {
                    cursorWindow.releaseReference();
                }
            }
        }
    }

    public final boolean f(java.lang.String str) {
        return this.c.containsKey(str);
    }

    protected final void finalize() throws java.lang.Throwable {
        try {
            if (this.j && this.d.length > 0 && !h()) {
                synchronized (this) {
                    if (this.i > 1) {
                        this.i = 1;
                    }
                    e();
                }
                android.util.Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ')');
            }
            super.finalize();
        } catch (java.lang.Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final boolean g(java.lang.String str, int i, int i2) {
        d(str, i);
        return this.d[i2].isNull(i, this.c.getInt(str));
    }

    public final boolean h() {
        boolean z;
        synchronized (this) {
            z = this.i <= 0;
        }
        return z;
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String[] strArr = this.b;
        int iF = aais.f(parcel, 20293);
        aais.B(parcel, 1, strArr);
        aais.D(parcel, 2, this.d, i);
        aais.l(parcel, 3, this.e);
        aais.p(parcel, 4, this.f);
        aais.l(parcel, 1000, this.a);
        aais.g(parcel, iF);
        if ((i & 1) != 0) {
            e();
        }
    }
}
