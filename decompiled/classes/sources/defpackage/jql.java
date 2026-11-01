package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jql {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callclassification/sip/SipHeaderRetriever");
    private final defpackage.rlv b;
    private final defpackage.zjs c;

    public jql(defpackage.rlv rlvVar, defpackage.zjs zjsVar) {
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (zjsVar == null) {
            defpackage.aooh.i("dialerTelecom");
        }
        this.b = rlvVar;
        this.c = zjsVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(android.telecom.Call.Details details, defpackage.aoln aolnVar) {
        jqk jqkVar;
        java.lang.Object obj;
        if (aolnVar instanceof jqk) {
            jqkVar = (jqk) aolnVar;
            int i = jqkVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jqkVar.d = i - Integer.MIN_VALUE;
            } else {
                jqkVar = new jqk(this, aolnVar);
            }
        } else {
            jqkVar = new jqk(this, aolnVar);
        }
        java.lang.Object objAj = jqkVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jqkVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            ((defpackage.aimw) a.b().l("com/android/dialer/callclassification/sip/SipHeaderRetriever", "query", 33, "SipHeaderRetriever.kt")).w("VERSION.SDK_INT: %d", android.os.Build.VERSION.SDK_INT);
            defpackage.zjs zjsVar = this.c;
            jqkVar.a = details;
            jqkVar.d = 1;
            objAj = defpackage.aoov.aj(zjsVar.d, new defpackage.zhb(zjsVar, (defpackage.aoln) null, 13, (short[]) null), jqkVar);
            if (objAj == aoluVar) {
                obj = details;
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj2 = jqkVar.a;
            defpackage.aooc.af(objAj);
            obj = obj2;
        }
        obj = details;
        if (!((java.lang.Boolean) objAj).booleanValue()) {
            ((defpackage.aimw) a.b().l("com/android/dialer/callclassification/sip/SipHeaderRetriever", "query", 35, "SipHeaderRetriever.kt")).v("sip headers only available when in a call");
        } else if (obj == null) {
            ((defpackage.aimw) a.b().l("com/android/dialer/callclassification/sip/SipHeaderRetriever", "query", 40, "SipHeaderRetriever.kt")).v("null call details");
        } else {
            this.b.o(defpackage.rmx.SPAM_SIP_HEADERS_QUERYABLE);
            android.telecom.Call.Details details2 = (android.telecom.Call.Details) obj;
            android.os.Bundle extras = details2.getExtras();
            defpackage.aimz aimzVar = a;
            if (extras != null) {
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/callclassification/sip/SipHeaderRetriever$Companion", "getSipHeadersFromCallDetails", 56, "SipHeaderRetriever.kt")).v("reading SIP headers from call details");
                return details2.getExtras().getString("android.telecom.extra.SIP_INVITE");
            }
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/callclassification/sip/SipHeaderRetriever$Companion", "getSipHeadersFromCallDetails", 53, "SipHeaderRetriever.kt")).v("null extras in details");
        }
        return null;
    }
}
