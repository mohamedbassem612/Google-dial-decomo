package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class gjf implements defpackage.giu {
    private final android.database.sqlite.SQLiteProgram a;

    public gjf(android.database.sqlite.SQLiteProgram sQLiteProgram) {
        if (sQLiteProgram == null) {
            defpackage.aooh.i("delegate");
        }
        this.a = sQLiteProgram;
    }

    @Override // defpackage.giu
    public final void a(int i, byte[] bArr) {
        if (bArr == null) {
            defpackage.aooh.i("value");
        }
        this.a.bindBlob(i, bArr);
    }

    @Override // defpackage.giu
    public final void b(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // defpackage.giu
    public final void c(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.giu
    public final void d(int i) {
        this.a.bindNull(i);
    }

    @Override // defpackage.giu
    public final void e(int i, java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("value");
        }
        this.a.bindString(i, str);
    }
}
