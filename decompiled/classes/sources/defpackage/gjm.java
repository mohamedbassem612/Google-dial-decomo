package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class gjm extends defpackage.gjo {
    public int[] a;
    public long[] b;
    public double[] c;
    public java.lang.String[] d;
    public byte[][] e;
    private android.database.Cursor i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjm(defpackage.gip gipVar, java.lang.String str) {
        super(gipVar, str);
        if (str == null) {
            defpackage.aooh.i("sql");
        }
        this.a = new int[0];
        this.b = new long[0];
        this.c = new double[0];
        this.d = new java.lang.String[0];
        this.e = new byte[0][];
    }

    private final android.database.Cursor r() {
        android.database.Cursor cursor = this.i;
        if (cursor != null) {
            return cursor;
        }
        fsu.J(21, "no row");
        throw new defpackage.aoiq();
    }

    private final void s(int i, int i2) {
        int[] iArr = this.a;
        int i3 = i2 + 1;
        if (iArr.length < i3) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i3);
            defpackage.aooh.e(iArrCopyOf, "copyOf(...)");
            this.a = iArrCopyOf;
        }
        if (i == 1) {
            long[] jArr = this.b;
            if (jArr.length < i3) {
                long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, i3);
                defpackage.aooh.e(jArrCopyOf, "copyOf(...)");
                this.b = jArrCopyOf;
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.c;
            if (dArr.length < i3) {
                double[] dArrCopyOf = java.util.Arrays.copyOf(dArr, i3);
                defpackage.aooh.e(dArrCopyOf, "copyOf(...)");
                this.c = dArrCopyOf;
                return;
            }
            return;
        }
        if (i == 3) {
            java.lang.String[] strArr = this.d;
            if (strArr.length < i3) {
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(strArr, i3);
                defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
                this.d = (java.lang.String[]) objArrCopyOf;
                return;
            }
            return;
        }
        if (i == 4) {
            byte[][] bArr = this.e;
            if (bArr.length < i3) {
                java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(bArr, i3);
                defpackage.aooh.e(objArrCopyOf2, "copyOf(...)");
                this.e = (byte[][]) objArrCopyOf2;
            }
        }
    }

    private final void t() {
        if (this.i == null) {
            this.i = this.f.a(new defpackage.gjl(this));
        }
    }

    private static final void u(android.database.Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            fsu.J(25, "column index out of range");
            throw new defpackage.aoiq();
        }
    }

    @Override // defpackage.gin
    public final double a(int i) {
        p();
        android.database.Cursor cursorR = r();
        u(cursorR, i);
        return cursorR.getDouble(i);
    }

    @Override // defpackage.gin
    public final int b() {
        p();
        t();
        android.database.Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.gin
    public final long c(int i) {
        p();
        android.database.Cursor cursorR = r();
        u(cursorR, i);
        return cursorR.getLong(i);
    }

    @Override // defpackage.gin, java.lang.AutoCloseable
    public final void close() {
        if (!this.h) {
            p();
            this.a = new int[0];
            this.b = new long[0];
            this.c = new double[0];
            this.d = new java.lang.String[0];
            this.e = new byte[0][];
            k();
        }
        q();
    }

    @Override // defpackage.gin
    public final java.lang.String d(int i) {
        p();
        t();
        android.database.Cursor cursor = this.i;
        if (cursor == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        u(cursor, i);
        java.lang.String columnName = cursor.getColumnName(i);
        defpackage.aooh.e(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // defpackage.gin
    public final java.lang.String e(int i) {
        p();
        android.database.Cursor cursorR = r();
        u(cursorR, i);
        java.lang.String string = cursorR.getString(i);
        defpackage.aooh.e(string, "getString(...)");
        return string;
    }

    @Override // defpackage.gin
    public final void f(int i, byte[] bArr) {
        defpackage.aooh.f(bArr, "value");
        p();
        s(4, i);
        this.a[i] = 4;
        this.e[i] = bArr;
    }

    @Override // defpackage.gin
    public final void g(int i, double d) {
        p();
        s(2, i);
        this.a[i] = 2;
        this.c[i] = d;
    }

    @Override // defpackage.gin
    public final void h(int i, long j) {
        p();
        s(1, i);
        this.a[i] = 1;
        this.b[i] = j;
    }

    @Override // defpackage.gin
    public final void i(int i) {
        p();
        s(5, i);
        this.a[i] = 5;
    }

    @Override // defpackage.gin
    public final void j(int i, java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("value");
        }
        p();
        s(3, i);
        this.a[i] = 3;
        this.d[i] = str;
    }

    @Override // defpackage.gin
    public final void k() {
        p();
        android.database.Cursor cursor = this.i;
        if (cursor != null) {
            cursor.close();
        }
        this.i = null;
    }

    @Override // defpackage.gin
    public final boolean l(int i) {
        p();
        android.database.Cursor cursorR = r();
        u(cursorR, i);
        return cursorR.isNull(i);
    }

    @Override // defpackage.gin
    public final boolean m() {
        p();
        t();
        android.database.Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    @Override // defpackage.gin
    public final byte[] n(int i) {
        p();
        android.database.Cursor cursorR = r();
        u(cursorR, i);
        byte[] blob = cursorR.getBlob(i);
        defpackage.aooh.e(blob, "getBlob(...)");
        return blob;
    }
}
