package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rwx {
    public static final aimz a;
    private static final java.lang.String[] f = {"_id", "number", "presentation", "countryiso", "date", "subscription_component_name", "subscription_id", "name"};
    private static final java.lang.String[] g;
    public final aoin b;
    public final zrw c;
    public final ajct d;
    public final gpd e;
    private final ojo h;
    private final ajcu i;

    static {
        a.n();
        g = new java.lang.String[]{"_id", "number", "presentation", "countryiso", "date", "subscription_component_name", "subscription_id", "name", "missed_reason"};
        a = aimz.i("com/android/dialer/notification/missedcalls/MissedCallDataSource");
    }

    public rwx(ojo ojoVar, gpd gpdVar, zrw zrwVar, ajct ajctVar, ajcu ajcuVar, aoin aoinVar) {
        this.e = gpdVar;
        this.c = zrwVar;
        this.d = ajctVar;
        this.i = ajcuVar;
        this.h = ojoVar;
        this.b = aoinVar;
    }

    public final ajcq a(boolean z) {
        final boolean z2 = false;
        if (a.n() && !z) {
            z2 = true;
        }
        rsr rsrVar = new rsr();
        rsrVar.aC(new kaw("new").aH("= 1"));
        rsrVar.aC(new kaw("type").aI("=", 3));
        rsrVar.aC(new kaw("is_read").aH("IS NOT 1"));
        rsr rsrVarAB = rsrVar.aB();
        return this.h.d(android.provider.CallLog.Calls.CONTENT_URI, z2 ? g : f, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a, "date DESC").c(ahqx.e(new ajbc() { // from class: rww
            public final java.lang.Object a(ajyk ajykVar, java.lang.Object obj) {
                android.database.Cursor cursor = (android.database.Cursor) obj;
                if (!cursor.moveToFirst()) {
                    defpackage.rwx rwxVar = this.a;
                    a.bI(defpackage.rwx.a.d(), "Empty cursor, no system call log entry", "com/android/dialer/notification/missedcalls/MissedCallDataSource", "getNewMissedCallsInternal", (char) 159, "MissedCallDataSource.java", zct.b);
                    rwxVar.e.i((java.lang.String) null).a(mcd.d);
                    return j$.util.Optional.of(aike.a);
                }
                aift aiftVar = new aift(4);
                do {
                    android.net.Uri uriWithAppendedId = android.content.ContentUris.withAppendedId(android.provider.CallLog.Calls.CONTENT_URI, cursor.getLong(0));
                    if (uriWithAppendedId == null) {
                        throw new java.lang.NullPointerException("Null uri");
                    }
                    boolean z3 = z2;
                    java.lang.String strCo = ahvr.co(cursor.getString(1));
                    int i = cursor.getInt(2);
                    j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(cursor.getString(3));
                    aooh.f(optionalOfNullable, "countryIso");
                    java.lang.String str = (java.lang.String) aooh.q(optionalOfNullable);
                    long j = cursor.getLong(4);
                    j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable(cursor.getString(5));
                    aooh.f(optionalOfNullable2, "accountComponentName");
                    java.lang.String str2 = (java.lang.String) aooh.q(optionalOfNullable2);
                    j$.util.Optional optionalOfNullable3 = j$.util.Optional.ofNullable(cursor.getString(6));
                    aooh.f(optionalOfNullable3, "accountId");
                    java.lang.String str3 = (java.lang.String) aooh.q(optionalOfNullable3);
                    j$.util.Optional optionalOfNullable4 = j$.util.Optional.ofNullable(cursor.getString(7));
                    aooh.f(optionalOfNullable4, "cachedName");
                    java.lang.String str4 = (java.lang.String) aooh.q(optionalOfNullable4);
                    j$.util.OptionalLong optionalLongOf = z3 ? j$.util.OptionalLong.of(cursor.getLong(8)) : j$.util.OptionalLong.empty();
                    aooh.f(optionalLongOf, "missedReason");
                    aiftVar.i(new defpackage.rwv(uriWithAppendedId, strCo, i, str, j, str2, str3, optionalLongOf.isPresent() ? java.lang.Long.valueOf(optionalLongOf.getAsLong()) : null, str4));
                } while (cursor.moveToNext());
                return j$.util.Optional.of(aiftVar.h());
            }
        }), this.i).h().v(agui.class, new icz(this, z2, 2), this.d);
    }
}
