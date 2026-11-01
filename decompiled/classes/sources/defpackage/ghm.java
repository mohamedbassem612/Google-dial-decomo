package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ghm implements android.database.Cursor {
    private final android.database.Cursor a;
    private final defpackage.ghh b;

    public ghm(android.database.Cursor cursor, defpackage.ghh ghhVar) {
        if (cursor == null) {
            defpackage.aooh.i("delegate");
        }
        this.a = cursor;
        this.b = ghhVar;
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        this.b.c();
    }

    @Override // android.database.Cursor
    public final void copyStringToBuffer(int i, android.database.CharArrayBuffer charArrayBuffer) {
        this.a.copyStringToBuffer(i, charArrayBuffer);
    }

    @Override // android.database.Cursor
    public final void deactivate() {
        this.a.deactivate();
    }

    @Override // android.database.Cursor
    public final byte[] getBlob(int i) {
        return this.a.getBlob(i);
    }

    @Override // android.database.Cursor
    public final int getColumnCount() {
        return this.a.getColumnCount();
    }

    @Override // android.database.Cursor
    public final int getColumnIndex(java.lang.String str) {
        return this.a.getColumnIndex(str);
    }

    @Override // android.database.Cursor
    public final int getColumnIndexOrThrow(java.lang.String str) {
        return this.a.getColumnIndexOrThrow(str);
    }

    @Override // android.database.Cursor
    public final java.lang.String getColumnName(int i) {
        return this.a.getColumnName(i);
    }

    @Override // android.database.Cursor
    public final java.lang.String[] getColumnNames() {
        return this.a.getColumnNames();
    }

    @Override // android.database.Cursor
    public final int getCount() {
        return this.a.getCount();
    }

    @Override // android.database.Cursor
    public final double getDouble(int i) {
        return this.a.getDouble(i);
    }

    @Override // android.database.Cursor
    public final android.os.Bundle getExtras() {
        return this.a.getExtras();
    }

    @Override // android.database.Cursor
    public final float getFloat(int i) {
        return this.a.getFloat(i);
    }

    @Override // android.database.Cursor
    public final int getInt(int i) {
        return this.a.getInt(i);
    }

    @Override // android.database.Cursor
    public final long getLong(int i) {
        return this.a.getLong(i);
    }

    @Override // android.database.Cursor
    public final android.net.Uri getNotificationUri() {
        return this.a.getNotificationUri();
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.a.getPosition();
    }

    @Override // android.database.Cursor
    public final short getShort(int i) {
        return this.a.getShort(i);
    }

    @Override // android.database.Cursor
    public final java.lang.String getString(int i) {
        return this.a.getString(i);
    }

    @Override // android.database.Cursor
    public final int getType(int i) {
        return this.a.getType(i);
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        return this.a.getWantsAllOnMoveCalls();
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return this.a.isAfterLast();
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return this.a.isBeforeFirst();
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        return this.a.isClosed();
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.a.isFirst();
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        return this.a.isLast();
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i) {
        return this.a.isNull(i);
    }

    @Override // android.database.Cursor
    public final boolean move(int i) {
        return this.a.move(i);
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        return this.a.moveToFirst();
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return this.a.moveToLast();
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        return this.a.moveToNext();
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i) {
        return this.a.moveToPosition(i);
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return this.a.moveToPrevious();
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(android.database.ContentObserver contentObserver) {
        this.a.registerContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.a.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    public final boolean requery() {
        return this.a.requery();
    }

    @Override // android.database.Cursor
    public final android.os.Bundle respond(android.os.Bundle bundle) {
        return this.a.respond(bundle);
    }

    @Override // android.database.Cursor
    public final void setExtras(android.os.Bundle bundle) {
        this.a.setExtras(bundle);
    }

    @Override // android.database.Cursor
    public final void setNotificationUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        this.a.setNotificationUri(contentResolver, uri);
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(android.database.ContentObserver contentObserver) {
        this.a.unregisterContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.a.unregisterDataSetObserver(dataSetObserver);
    }
}
