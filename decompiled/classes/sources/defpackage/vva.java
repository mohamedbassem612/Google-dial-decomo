package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vva implements defpackage.vtv {
    public static final java.lang.String[] a = {"com.android.phone"};
    public static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailDataServiceImpl");
    public static final java.lang.String[] c = {"_id", "number", "date", "type", "countryiso", "voicemail_uri", "is_read", "new", "presentation", "subscription_component_name", "subscription_id", "transcription", "post_dial_digits", "via_number", "duration", "transcription_state"};
    public final defpackage.ojo d;
    public final android.content.Context e;
    public final defpackage.ajct f;
    public final defpackage.ajcu g;
    public final defpackage.ahpz h;
    public final defpackage.rwi i;
    public final defpackage.oko j;
    public final defpackage.ssq k;
    public final defpackage.aoin l;
    public final defpackage.zrw m;
    public final defpackage.aoin n;
    public final defpackage.aeqx o;
    public final defpackage.gpd p;
    public final defpackage.kaw q;
    public final defpackage.ahbv r;
    public final defpackage.kaw s;
    private final defpackage.ajct t;

    public vva(defpackage.ojo ojoVar, android.content.Context context, defpackage.kaw kawVar, defpackage.ajct ajctVar, defpackage.ajcu ajcuVar, defpackage.ajct ajctVar2, defpackage.ahpz ahpzVar, defpackage.rwi rwiVar, defpackage.oko okoVar, defpackage.aeqx aeqxVar, defpackage.ssq ssqVar, defpackage.aoin aoinVar, defpackage.ahbv ahbvVar, defpackage.zrw zrwVar, defpackage.kaw kawVar2, defpackage.gpd gpdVar, defpackage.aoin aoinVar2) {
        this.d = ojoVar;
        this.e = context;
        this.q = kawVar;
        this.f = ajctVar;
        this.g = ajcuVar;
        this.t = ajctVar2;
        this.h = ahpzVar;
        this.i = rwiVar;
        this.j = okoVar;
        this.o = aeqxVar;
        this.k = ssqVar;
        this.l = aoinVar;
        this.r = ahbvVar;
        this.m = zrwVar;
        this.s = kawVar2;
        this.p = gpdVar;
        this.n = aoinVar2;
    }

    public static boolean j(android.database.Cursor cursor) {
        return cursor == null || !cursor.moveToFirst();
    }

    public static java.lang.String[] k() {
        return new java.lang.String[]{"_id"};
    }

    public static android.net.Uri l() {
        return android.provider.CallLog.Calls.CONTENT_URI_WITH_VOICEMAIL.buildUpon().appendQueryParameter("limit", "1000").build();
    }

    public static defpackage.rsr m(j$.util.Optional optional) {
        defpackage.rsr rsrVar = new defpackage.rsr();
        vdi vdiVar = new vdi(rsrVar, 19);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            vtt vttVar = (vtt) obj;
            defpackage.rsr rsrVar2 = (defpackage.rsr) vdiVar.a;
            rsrVar2.aC(new defpackage.kaw("source_package").aI("=", vttVar.c));
            if ((vttVar.b & 2) != 0) {
                vtq vtqVar = vttVar.d;
                if (vtqVar == null) {
                    vtqVar = vtq.a;
                }
                android.telecom.PhoneAccountHandle phoneAccountHandleAt = defpackage.wsc.at(vtqVar);
                rsrVar2.aC(new defpackage.kaw("subscription_component_name").aI("IS", phoneAccountHandleAt.getComponentName().flattenToString()));
                rsrVar2.aC(new defpackage.kaw("subscription_id").aI("IS", phoneAccountHandleAt.getId()));
            }
        }
        return rsrVar;
    }

    @Override // defpackage.vtv
    public final defpackage.ajcq a(android.net.Uri uri) {
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(1011, "VoicemailDataServiceImpl_fetchVoicemail");
        try {
            defpackage.ahrv ahrvVarG = defpackage.ahrv.g(f(uri));
            defpackage.vmv vmvVar = new defpackage.vmv(this, uri, 7);
            defpackage.ajcu ajcuVar = this.g;
            defpackage.ahrv ahrvVarH = ahrvVarG.i(vmvVar, ajcuVar).i(new defpackage.vmv(this, uri, 8), ajcuVar).h(new defpackage.vrx(4), ajcuVar);
            ahoqVarW.close();
            return ahrvVarH;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vtv
    public final defpackage.ajcq b(j$.util.Optional optional, boolean z) {
        defpackage.rsr rsrVarM = m(optional);
        rsrVarM.aC(new defpackage.kaw("archived").aI("=", java.lang.Integer.valueOf(z ? 1 : 0)));
        return o(rsrVarM);
    }

    @Override // defpackage.vtv
    public final defpackage.ajcq c() {
        ((defpackage.aimw) ((defpackage.aimw) b.b()).l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailDataServiceImpl", "markAllNewVoicemailsAsOld", 919, "VoicemailDataServiceImpl.java")).v("enter");
        return defpackage.ahvr.I(g(null), new defpackage.vuu(this, 0), this.g);
    }

    @Override // defpackage.vtv
    public final defpackage.ajcq d(android.net.Uri uri) {
        ((defpackage.aimw) ((defpackage.aimw) b.b()).l("com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailDataServiceImpl", "markVoicemailAsRead", 759, "VoicemailDataServiceImpl.java")).y("voicemailUri: %s enter", uri);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("is_read", java.lang.Boolean.TRUE);
        contentValues.put("dirty", (java.lang.Integer) 1);
        defpackage.rsr rsrVar = new defpackage.rsr();
        rsrVar.aC(new defpackage.kaw("is_read").aH("= 0"));
        defpackage.rsr rsrVarAB = rsrVar.aB();
        java.lang.Object obj = rsrVarAB.b;
        java.lang.String[] strArr = (java.lang.String[]) rsrVarAB.a;
        return defpackage.ahvr.I(this.d.f(uri, contentValues, (java.lang.String) obj, strArr), new vmq(this, 19), this.g);
    }

    public final defpackage.ajcq e(j$.util.Optional optional) {
        defpackage.rsr rsrVarM = m(optional);
        rsrVarM.aC(new defpackage.kaw("is_read").aH("= 0"));
        rsrVarM.aC(new defpackage.kaw("archived").aH("=0"));
        return defpackage.ahvr.H(n(rsrVarM), new defpackage.kvf(12), this.g);
    }

    public final defpackage.ajcq f(android.net.Uri uri) {
        return this.d.d(uri, new java.lang.String[]{"has_content"}, null, null, null).c(defpackage.ahqx.e(new vur(3)), this.g).h();
    }

    public final defpackage.ajcq g(android.net.Uri uri) {
        defpackage.rsr rsrVar = new defpackage.rsr();
        rsrVar.aC(new defpackage.kaw("new").aH("= 1"));
        rsrVar.aC(new defpackage.kaw("type").aI("= ", "4"));
        if (uri != null) {
            rsrVar.aC(new defpackage.kaw("voicemail_uri").aI("= ", uri.toString()));
        }
        defpackage.rsr rsrVarAB = rsrVar.aB();
        android.content.ContentValues contentValues = new android.content.ContentValues(1);
        contentValues.put("new", "0");
        defpackage.ojo ojoVar = this.d;
        java.lang.Object obj = rsrVarAB.b;
        return defpackage.ahvr.H(ojoVar.f(android.provider.CallLog.Calls.CONTENT_URI_WITH_VOICEMAIL, contentValues, (java.lang.String) obj, (java.lang.String[]) rsrVarAB.a), new defpackage.vrx(5), this.g);
    }

    public final defpackage.ajcq h(android.net.Uri uri) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("deleted", "1");
        return this.d.f(uri, contentValues, null, null);
    }

    public final void i() {
        android.content.Intent intent = new android.content.Intent("com.android.voicemail.VoicemailClient.ACTION_UPLOAD");
        android.content.Context context = this.e;
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent);
    }

    public final defpackage.ajcq n(defpackage.rsr rsrVar) {
        rsrVar.aC(new defpackage.kaw("deleted").aH("= 0"));
        rsrVar.aC(new defpackage.kaw("type").aH("= 4"));
        defpackage.nyf nyfVar = new defpackage.nyf(this, rsrVar, 7, null);
        long j = defpackage.ahqx.a;
        defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ajav(defpackage.ahns.c(false), nyfVar, 1));
        this.t.execute(ajdkVar);
        return ajdkVar;
    }

    public final defpackage.ajcq o(defpackage.rsr rsrVar) {
        return defpackage.ahrv.g(this.m.a()).i(new defpackage.kjs(this, rsrVar, 15), this.g);
    }
}
