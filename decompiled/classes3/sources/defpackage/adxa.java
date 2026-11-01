package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adxa implements defpackage.adwz {
    private static final aiof b = aiof.i("GnpSdk");
    public final aoin a;
    private final aefv c;
    private final amwu d;
    private final amwu e;
    private final aolr f;
    private final defpackage.advx g;

    public adxa(aazc aazcVar, aoin aoinVar, aefv aefvVar, amwu amwuVar, amwu amwuVar2, aolr aolrVar, defpackage.advx advxVar) {
        aooh.f(aazcVar, "clock");
        aooh.f(aoinVar, "pushIntentHandler");
        aooh.f(amwuVar, "gnpClearcutLogger");
        aooh.f(amwuVar2, "gnpLogEventFactory");
        aooh.f(aolrVar, "blockingContext");
        this.a = aoinVar;
        this.c = aefvVar;
        this.d = amwuVar;
        this.e = amwuVar2;
        this.f = aolrVar;
        this.g = advxVar;
    }

    private final void c(defpackage.advu advuVar, android.content.Context context, long j) {
        defpackage.adxa adxaVar;
        try {
            adxaVar = this;
            try {
                aoov.ah(this.f, new defpackage.advb(adxaVar, advuVar, context, j, (aoln) null, 2));
            } catch (java.lang.Exception e) {
                e = e;
                java.lang.Exception exc = e;
                adxm adxmVar = (adxm) adxaVar.d.a();
                defpackage.adxn adxnVarO = ((gat) adxaVar.e.a()).o(exc);
                ((defpackage.adxp) adxnVarO).r = "push";
                adxmVar.a(adxnVarO);
                hgb.b(b.d(), "Push intent handler failed to handle message.", exc);
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            adxaVar = this;
        }
    }

    @Override // defpackage.adwz
    public final void a(android.content.Context context) {
        aooh.f(context, "context");
        this.c.a(context);
        c(new defpackage.advu(null, 3, 0, 0, null, null, null, null, null, null), context, java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(j$.time.Instant.now().toEpochMilli()));
    }

    @Override // defpackage.adwz
    public final boolean b(android.content.Context context, com.google.firebase.messaging.RemoteMessage remoteMessage) {
        int iB;
        int iIntValue;
        aooh.f(context, "context");
        this.c.a(context);
        java.lang.String str = (java.lang.String) remoteMessage.a().get("casp");
        android.os.Bundle bundle = remoteMessage.a;
        byte[] byteArray = bundle.getByteArray("rawData");
        java.lang.String str2 = (java.lang.String) remoteMessage.a().get("chm");
        java.lang.String str3 = (java.lang.String) remoteMessage.a().get("ki");
        java.lang.String str4 = (java.lang.String) remoteMessage.a().get("cid");
        java.lang.String string = bundle.getString("google.original_priority");
        if (string == null) {
            string = bundle.getString("google.priority");
        }
        java.lang.String string2 = bundle.getString("google.delivered_priority");
        if (string2 != null) {
            iB = com.google.firebase.messaging.RemoteMessage.b(string2);
        } else if ("1".equals(bundle.getString("google.priority_reduced"))) {
            iB = 2;
        } else {
            string2 = bundle.getString("google.priority");
            iB = com.google.firebase.messaging.RemoteMessage.b(string2);
        }
        java.lang.Object obj = bundle.get("google.ttl");
        if (obj instanceof java.lang.Integer) {
            iIntValue = ((java.lang.Integer) obj).intValue();
        } else if (obj instanceof java.lang.String) {
            try {
                iIntValue = java.lang.Integer.parseInt((java.lang.String) obj);
            } catch (java.lang.NumberFormatException unused) {
                android.util.Log.w("FirebaseMessaging", "Invalid TTL: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj))));
                iIntValue = 0;
            }
        } else {
            iIntValue = 0;
        }
        android.os.Bundle bundle2 = remoteMessage.a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iIntValue);
        int iC = defpackage.advu.c(bundle2.getString("message_type"));
        java.lang.String string3 = bundle2.getString("google.message_id");
        if (string3 == null) {
            string3 = bundle2.getString("message_id");
        }
        int iB2 = com.google.firebase.messaging.RemoteMessage.b(string);
        int iV = aesg.v(iB);
        if (true == android.text.TextUtils.isEmpty(string3)) {
            string3 = null;
        }
        defpackage.advu advuVar = new defpackage.advu(string3, iC, aesg.v(iB2), iV, numValueOf, str, byteArray, str2, str3, str4);
        if (!this.g.a(advuVar)) {
            return false;
        }
        c(advuVar, context, java.util.concurrent.TimeUnit.MILLISECONDS.toMicros(j$.time.Instant.now().toEpochMilli()));
        return true;
    }
}
