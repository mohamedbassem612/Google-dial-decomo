package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afih implements java.io.Closeable {
    public final android.database.sqlite.SQLiteStatement a;
    public final android.util.SparseIntArray b;
    private final ahoq c;
    private boolean d;

    public afih(adag adagVar, java.lang.String str) {
        j$.util.Objects.requireNonNull(adagVar);
        this.b = new android.util.SparseIntArray();
        this.d = false;
        this.c = ahvr.Z(1268, "PREPARED ".concat(str));
        this.a = ((android.database.sqlite.SQLiteDatabase) adagVar.a).compileStatement(str);
    }

    public final void a(int i, byte[] bArr) {
        c(i);
        this.a.bindBlob(i, bArr);
        this.b.put(i, i);
    }

    public final void b(int i, java.lang.String str) {
        c(i);
        this.a.bindString(i, str);
        this.b.put(i, i);
    }

    public final void c(int i) {
        if (this.b.get(i) != 0) {
            throw new java.lang.IllegalArgumentException("index already bound to existing statement");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.d = true;
        try {
            this.a.close();
        } finally {
            this.c.close();
        }
    }

    public final void d() {
        android.database.sqlite.SQLiteStatement sQLiteStatement = this.a;
        sQLiteStatement.executeInsert();
        this.b.clear();
        sQLiteStatement.clearBindings();
    }
}
