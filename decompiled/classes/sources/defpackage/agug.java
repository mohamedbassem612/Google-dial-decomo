package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agug extends android.database.CursorWrapper {
    private final android.content.ContentProviderClient a;
    private int b;

    public agug(android.database.Cursor cursor, android.content.ContentProviderClient contentProviderClient) {
        super(cursor);
        this.b = -1;
        this.a = contentProviderClient;
    }

    private final int a() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int count = getCount();
        this.b = count;
        return count;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.lang.Exception {
        try {
            getWrappedCursor().close();
        } finally {
            defpackage.agab.aZ(this.a);
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
        int count = super.getCount();
        this.b = count;
        return count;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aguj */
    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean move(int i) throws aguj {
        int position = getPosition() + i;
        if (super.move(i)) {
            return true;
        }
        if (position < -1 || position > a()) {
            return false;
        }
        throw new aguj();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aguj */
    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToFirst() throws aguj {
        if (super.moveToFirst()) {
            return true;
        }
        if (a() == 0) {
            return false;
        }
        throw new aguj();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aguj */
    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToLast() throws aguj {
        if (super.moveToLast()) {
            return true;
        }
        if (a() == 0) {
            return false;
        }
        throw new aguj();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aguj */
    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToNext() throws aguj {
        if (super.moveToNext()) {
            return true;
        }
        if (isAfterLast()) {
            return false;
        }
        throw new aguj();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aguj */
    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPosition(int i) throws aguj {
        if (super.moveToPosition(i)) {
            return true;
        }
        if (i < 0 || i >= a()) {
            return false;
        }
        throw new aguj();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aguj */
    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPrevious() throws aguj {
        if (super.moveToPrevious()) {
            return true;
        }
        if (isBeforeFirst()) {
            return false;
        }
        throw new aguj();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean requery() {
        boolean zRequery = super.requery();
        if (zRequery) {
            getCount();
        }
        return zRequery;
    }

    public final java.lang.String toString() {
        return getWrappedCursor().toString();
    }
}
