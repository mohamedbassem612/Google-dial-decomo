package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ssi extends android.database.AbstractCursor {
    private final java.lang.String[] a;

    public ssi(java.lang.String[] strArr) {
        this.a = strArr;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final java.lang.String[] getColumnNames() {
        return this.a;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final int getCount() {
        return 0;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final double getDouble(int i) {
        throw new android.database.CursorIndexOutOfBoundsException("Operation not permitted on an empty cursor.");
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final float getFloat(int i) {
        throw new android.database.CursorIndexOutOfBoundsException("Operation not permitted on an empty cursor.");
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final int getInt(int i) {
        throw new android.database.CursorIndexOutOfBoundsException("Operation not permitted on an empty cursor.");
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final long getLong(int i) {
        throw new android.database.CursorIndexOutOfBoundsException("Operation not permitted on an empty cursor.");
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final short getShort(int i) {
        throw new android.database.CursorIndexOutOfBoundsException("Operation not permitted on an empty cursor.");
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final java.lang.String getString(int i) {
        throw new android.database.CursorIndexOutOfBoundsException("Operation not permitted on an empty cursor.");
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final boolean isNull(int i) {
        throw new android.database.CursorIndexOutOfBoundsException("Operation not permitted on an empty cursor.");
    }
}
