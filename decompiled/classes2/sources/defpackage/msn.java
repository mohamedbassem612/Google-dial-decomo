package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class msn implements aonj {
    final /* synthetic */ long a;

    public msn(long j) {
        this.a = j;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        android.database.Cursor cursor = ((aguo) obj).a;
        int columnIndex = cursor.getColumnIndex("date");
        boolean z = false;
        if (columnIndex != -1 && !cursor.isNull(columnIndex)) {
            if (cursor.getLong(columnIndex) > j$.time.Instant.now().toEpochMilli() - java.util.concurrent.TimeUnit.HOURS.toMillis(this.a)) {
                z = true;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}
