package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adjg {
    public static final java.lang.String[] a = {"download_id", "priority", "urls", "start_timestamp_millis", "requires_unmetered_network", "requires_charging", "file_path", "completed", "failure", "next_retry_time_millis", "retry_count", "superpack_name", "superpack_version", "ttl_millis", "scheduling_flags", "requires_idle", "requires_battery_not_low"};
    public final defpackage.adji b;
    public final boolean c;
    public java.lang.String d;
    public long e;
    public long f;

    public adjg(defpackage.adji adjiVar, boolean z, java.lang.String str, long j, long j2) {
        this.b = adjiVar;
        this.c = z;
        this.d = str;
        this.e = j;
        this.f = j2;
    }

    public static defpackage.adjg f(android.database.Cursor cursor) {
        int i;
        long jCurrentTimeMillis = cursor.getLong(3);
        try {
            i = cursor.getInt(14);
            java.util.Set set = defpackage.adik.a;
            if ((i & (-4)) != 0) {
                throw new java.lang.IllegalArgumentException("Invalid scheduling flags value: " + i);
            }
        } catch (java.lang.IllegalArgumentException e) {
            ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).k(e)).v("Invalid scheduling flags value found in the table, ignoring value...");
            i = 0;
        }
        defpackage.adjh adjhVarN = defpackage.adji.n();
        adjhVarN.c(cursor.getString(0));
        adjhVarN.d(cursor.getInt(1));
        java.lang.String string = cursor.getString(2);
        adjhVarN.l(defpackage.aify.n(string == null ? java.util.Collections.EMPTY_LIST : new defpackage.ahzf(new defpackage.ahyy(new defpackage.ahxd('|'))).f().a().j(string)));
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        }
        adjhVarN.j(jCurrentTimeMillis);
        adjhVarN.h(cursor.getInt(4) != 0);
        adjhVarN.f(cursor.getInt(5) != 0);
        adjhVarN.g(cursor.getInt(15) != 0);
        adjhVarN.e(cursor.getInt(16) != 0);
        adjhVarN.b(cursor.getString(6));
        adjhVarN.k(cursor.getLong(13));
        adjhVarN.i(i);
        java.lang.String string2 = cursor.getString(11);
        if (string2 != null) {
            int i2 = cursor.getInt(12);
            defpackage.adik.k("version", i2);
            adjhVarN.a = new com.google.android.libraries.micore.superpacks.base.AutoValue_VersionedName(string2, i2);
        }
        defpackage.adji adjiVarA = adjhVarN.a();
        boolean z = cursor.getInt(7) != 0;
        java.lang.String string3 = cursor.getString(8);
        long j = cursor.getLong(9);
        long j2 = cursor.getLong(10);
        defpackage.adik.k("nextRetryTimeMillis", j);
        defpackage.adik.k("retryCount", j2);
        return new defpackage.adjg(adjiVarA, z, string3, j, j2);
    }

    public final int a() {
        return ((defpackage.adix) this.b).c;
    }

    public final int b() {
        return ((defpackage.adix) this.b).j;
    }

    public final android.content.ContentValues c() {
        android.content.ContentValues contentValues = new android.content.ContentValues(12);
        defpackage.adix adixVar = (defpackage.adix) this.b;
        contentValues.put("download_id", adixVar.a);
        com.google.android.libraries.micore.superpacks.base.VersionedName versionedName = adixVar.b;
        if (versionedName != null) {
            contentValues.put("superpack_name", versionedName.b());
            contentValues.put("superpack_version", java.lang.Integer.valueOf(versionedName.a()));
        } else {
            contentValues.putNull("superpack_name");
            contentValues.put("superpack_version", (java.lang.Integer) 0);
        }
        contentValues.put("priority", java.lang.Integer.valueOf(adixVar.c));
        defpackage.aify aifyVar = adixVar.d;
        defpackage.ahyj ahyjVar = new defpackage.ahyj("|");
        contentValues.put("urls", new defpackage.ahyh(ahyjVar, ahyjVar).b(aifyVar));
        contentValues.put("start_timestamp_millis", java.lang.Long.valueOf(adixVar.e));
        contentValues.put("requires_unmetered_network", java.lang.Integer.valueOf(adixVar.f ? 1 : 0));
        contentValues.put("requires_charging", java.lang.Integer.valueOf(adixVar.g ? 1 : 0));
        contentValues.put("requires_idle", java.lang.Integer.valueOf(adixVar.h ? 1 : 0));
        contentValues.put("requires_battery_not_low", java.lang.Integer.valueOf(adixVar.i ? 1 : 0));
        contentValues.put("file_path", adixVar.k);
        contentValues.put("completed", java.lang.Integer.valueOf(this.c ? 1 : 0));
        java.lang.String str = this.d;
        if (str != null) {
            contentValues.put("failure", str);
        } else {
            contentValues.putNull("failure");
        }
        contentValues.put("next_retry_time_millis", java.lang.Long.valueOf(this.e));
        contentValues.put("retry_count", java.lang.Long.valueOf(this.f));
        contentValues.put("ttl_millis", java.lang.Long.valueOf(adixVar.l));
        contentValues.put("scheduling_flags", java.lang.Integer.valueOf(adixVar.j));
        return contentValues;
    }

    public final defpackage.adhw d() {
        defpackage.adji adjiVar = this.b;
        defpackage.adix adixVar = (defpackage.adix) adjiVar;
        if (adixVar.m == null) {
            synchronized (adjiVar) {
                if (((defpackage.adix) adjiVar).m == null) {
                    ((defpackage.adix) adjiVar).m = defpackage.adhw.d(((defpackage.adix) adjiVar).a);
                    if (((defpackage.adix) adjiVar).m == null) {
                        throw new java.lang.NullPointerException("qualifiedName() cannot return null");
                    }
                }
            }
        }
        return adixVar.m;
    }

    public final com.google.android.libraries.micore.superpacks.base.VersionedName e() {
        return ((defpackage.adix) this.b).b;
    }

    public final defpackage.aify g() {
        return ((defpackage.adix) this.b).d;
    }

    public final java.io.File h() {
        return new java.io.File(((defpackage.adix) this.b).k);
    }

    public final java.lang.String i() {
        return ((defpackage.adix) this.b).a;
    }

    public final void j(long j) {
        defpackage.ahvr.bM(j > 0);
        this.e = j;
    }

    public final boolean k() {
        return ((defpackage.adix) this.b).i;
    }

    public final boolean l() {
        return ((defpackage.adix) this.b).g;
    }

    public final boolean m() {
        return ((defpackage.adix) this.b).h;
    }

    public final boolean n() {
        return ((defpackage.adix) this.b).f;
    }

    public final java.lang.String toString() {
        defpackage.adji adjiVar = this.b;
        java.lang.String strM = adjiVar.m();
        defpackage.adix adixVar = (defpackage.adix) adjiVar;
        int i = adixVar.j;
        java.util.Set set = defpackage.adik.a;
        return "{" + adixVar.a + ", " + strM + ", " + defpackage.adik.g(i) + ", p" + a() + '}';
    }
}
