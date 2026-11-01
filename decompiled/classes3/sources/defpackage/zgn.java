package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zgn {
    public static final aimz a = aimz.i("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator");
    public final aolr b;
    public final defpackage.uyg c;
    private final zzx d;

    public zgn(zzx zzxVar, aolr aolrVar, defpackage.uyg uygVar) {
        aooh.f(aolrVar, "lightweightContext");
        this.d = zzxVar;
        this.b = aolrVar;
        this.c = uygVar;
    }

    public static final boolean b(defpackage.zfw zfwVar) {
        java.lang.String str = zfwVar.b;
        aooh.e(str, "getMessageId(...)");
        return str.length() > 0;
    }

    public final boolean a(defpackage.zgf zgfVar) {
        aihd aihdVarKeySet = this.d.k().keySet();
        defpackage.zdv zdvVarB = defpackage.zdv.b(zgfVar.b);
        if (zdvVarB == null) {
            zdvVarB = defpackage.zdv.UNRECOGNIZED;
        }
        return aihdVarKeySet.contains(zdvVarB);
    }
}
