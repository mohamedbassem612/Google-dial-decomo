package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gjg extends defpackage.gjf implements defpackage.giw {
    public final android.database.sqlite.SQLiteStatement a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjg(android.database.sqlite.SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        if (sQLiteStatement == null) {
            defpackage.aooh.i("delegate");
        }
        this.a = sQLiteStatement;
    }

    @Override // defpackage.giw
    public final void f() {
        this.a.execute();
    }
}
