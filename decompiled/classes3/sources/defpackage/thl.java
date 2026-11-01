package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class thl extends epj {
    private static final aimz o = aimz.i("com/android/dialer/searchfragment/calllog/CallLogCursorLoader");

    public thl(android.content.Context context, java.lang.String str) {
        super(context, android.provider.CallLog.Calls.CONTENT_URI.buildUpon().appendQueryParameter("limit", "3").build(), defpackage.thq.a(), (java.lang.String) r(str).b, (java.lang.String[]) r(str).a, "date DESC");
    }

    private static final rsr r(java.lang.String str) {
        rsr rsrVar = new rsr();
        rsr rsrVar2 = new rsr(new kaw("normalized_number").aI("LIKE", "%" + str + '%'));
        rsrVar2.aD(new kaw("number").aI("LIKE", "%" + str + '%'));
        rsrVar2.aD(new kaw("formatted_number").aI("LIKE", "%" + str + '%'));
        rsrVar.aC(rsrVar2.aB());
        rsr rsrVar3 = new rsr(rsr.az(((java.lang.String) new kaw("name").a).concat(" IS NULL"), new java.lang.String[0]));
        rsrVar3.aD(rsr.az(((java.lang.String) new kaw("name").a).concat(" = ''"), new java.lang.String[0]));
        rsrVar.aC(rsrVar3.aB());
        rsrVar.aC(new kaw("normalized_number").aJ());
        return rsrVar.aB();
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        return i();
    }

    public final android.database.Cursor i() {
        try {
            return defpackage.thk.a(((epl) this).h, super.i());
        } catch (java.lang.SecurityException e) {
            a.bq(o.d(), "Exception occurs when loading call log search results", "com/android/dialer/searchfragment/calllog/CallLogCursorLoader", "loadInBackground", 'Y', "CallLogCursorLoader.java", e, zct.b);
            return defpackage.thk.a(((epl) this).h, null);
        }
    }
}
