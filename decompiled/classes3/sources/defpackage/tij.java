package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tij extends epj {
    public static final aimz o = aimz.i("com/android/dialer/searchfragment/cp2/extendeddirectories/DirectoryCursorLoader");
    public static final aify p;
    private static final java.lang.String[] q;

    static {
        java.lang.String[] strArr = {"_id", "displayName", "photoSupport"};
        q = strArr;
        p = aify.o(strArr);
    }

    public tij(android.content.Context context) {
        super(context, fh$.ExternalSyntheticApiModelOutline0.m$1(), (java.lang.String[]) p.toArray(new java.lang.String[0]), (java.lang.String) null, (java.lang.String[]) null, "_id");
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        return i();
    }

    public final android.database.Cursor i() {
        if (!zqz.a(((epl) this).h, "android.permission.READ_CONTACTS")) {
            o.b().l("com/android/dialer/searchfragment/cp2/extendeddirectories/DirectoryCursorLoader", "loadInBackground", 71, "DirectoryCursorLoader.java").v("Contacts permission denied.");
            return null;
        }
        try {
            return super.i();
        } catch (java.lang.SecurityException e) {
            a.bq(o.c(), "exception in base class", "com/android/dialer/searchfragment/cp2/extendeddirectories/DirectoryCursorLoader", "loadInBackground", 'M', "DirectoryCursorLoader.java", e, zct.b);
            return null;
        }
    }
}
