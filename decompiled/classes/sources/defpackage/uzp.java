package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uzp implements defpackage.kfh {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/calllog/VoicemailDataSource");
    public final defpackage.zjs b;
    public final defpackage.oko c;
    public final defpackage.aoin d;
    private final android.content.Context e;
    private final defpackage.ajct f;

    public uzp(android.content.Context context, defpackage.ajct ajctVar, defpackage.zjs zjsVar, defpackage.oko okoVar, defpackage.aoin aoinVar) {
        this.e = context;
        this.f = ajctVar;
        this.b = zjsVar;
        this.c = okoVar;
        this.d = aoinVar;
    }

    @Override // defpackage.kfh
    public final defpackage.aenj a() {
        return new defpackage.aenj("VoicemailDataSource");
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq b(defpackage.kfj kfjVar) {
        java.util.Map map = ((defpackage.kfk) kfjVar).a;
        if (map.isEmpty()) {
            return defpackage.ajcm.a;
        }
        android.content.Context context = this.e;
        defpackage.aify aifyVar = defpackage.zqz.a;
        if (defpackage.dvx.c(context, "android.permission.READ_PHONE_STATE") != 0) {
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                ((android.content.ContentValues) ((java.util.Map.Entry) it.next()).getValue()).put("is_voicemail_call", (java.lang.Integer) 0);
            }
            return defpackage.ajcm.a;
        }
        defpackage.ajct ajctVar = this.f;
        uwl uwlVar = new uwl(this, map, 3);
        long j = defpackage.ahqx.a;
        return ajctVar.submit(new defpackage.ajav(defpackage.ahns.c(false), uwlVar, 1));
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq d() {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq e() {
        return defpackage.ajcm.a;
    }
}
