package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kfk implements defpackage.kfj {
    public final java.util.Map a = new j$.util.concurrent.ConcurrentHashMap();
    public final java.util.Map b = new j$.util.concurrent.ConcurrentHashMap();
    public final java.util.Set c = new java.util.concurrent.ConcurrentSkipListSet();
    public final java.util.Map d = new j$.util.concurrent.ConcurrentHashMap();

    @Override // defpackage.kfj
    public final java.util.Map a() {
        return this.a;
    }

    @Override // defpackage.kfj
    public final java.util.Map b() {
        return this.b;
    }

    @Override // defpackage.kfj
    public final void c(long j) {
        java.util.Map map = this.a;
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        defpackage.ahvr.bN(!map.containsKey(lValueOf), "Can't delete row scheduled for insert");
        defpackage.ahvr.bN(!this.b.containsKey(lValueOf), "Can't delete row scheduled for update");
        if (!this.c.add(lValueOf)) {
            throw new java.lang.IllegalArgumentException("Can't delete row already scheduled for delete");
        }
    }

    @Override // defpackage.kfj
    public final void d(long j, android.content.ContentValues contentValues) {
        java.util.Map map = this.a;
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        defpackage.ahvr.bN(!map.containsKey(lValueOf), "Can't update row scheduled for insert");
        defpackage.ahvr.bN(!this.c.contains(lValueOf), "Can't update row scheduled for delete");
        android.content.ContentValues contentValues2 = (android.content.ContentValues) j$.util.Map.-EL.putIfAbsent(this.b, lValueOf, contentValues);
        if (contentValues2 != null) {
            contentValues2.putAll(contentValues);
        }
    }

    @Override // defpackage.kfj
    public final void e(long j, android.content.ContentValues contentValues) {
        java.util.Set set = this.c;
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        defpackage.ahvr.bN(!set.contains(lValueOf), "Can't update a system call log entry row scheduled for delete");
        this.d.put(lValueOf, contentValues);
    }

    @Override // defpackage.kfj
    public final boolean f() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty();
    }
}
