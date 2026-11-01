package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pio implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ pio(j$.util.Optional optional, android.net.Uri uri, zjs zjsVar, j$.util.Optional optional2, int i) {
        this.$cid = i;
        this.c = optional;
        this.a = uri;
        this.b = zjsVar;
        this.d = optional2;
    }

    /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r8v66, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        int i = this.$cid;
        if (i == 0) {
            java.lang.String strF = ((defpackage.sql) this.a).f();
            boolean zIsEmpty = android.text.TextUtils.isEmpty(strF);
            java.lang.Object obj = this.d;
            if (!zIsEmpty) {
                defpackage.piz.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/incall/callinfo/CallInfoProducerModule", "produceGeoLocation", 599, "CallInfoProducerModule.java").y("location returned from phoneLookupInfoConsolidator: %s", aais.aD(strF));
                return j$.util.Optional.of(strF);
            }
            java.lang.Object obj2 = this.b;
            if (((j$.util.Optional) obj2).isPresent()) {
                java.lang.Object obj3 = this.c;
                if (((j$.util.Optional) obj3).isPresent()) {
                    android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
                    android.os.StrictMode.setThreadPolicy(android.os.StrictMode.ThreadPolicy.LAX);
                    try {
                        strF = ((ssm) ((j$.util.Optional) obj2).orElseThrow()).a((java.lang.String) ((j$.util.Optional) obj3).orElseThrow(), (java.lang.String) obj);
                        android.os.StrictMode.setThreadPolicy(threadPolicy);
                        defpackage.piz.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/incall/callinfo/CallInfoProducerModule", "produceGeoLocation", 623, "CallInfoProducerModule.java").y("location retrieved from phoneNumberGeoLocator: %s", aais.aD(strF));
                    } catch (java.lang.Throwable th) {
                        android.os.StrictMode.setThreadPolicy(threadPolicy);
                        throw th;
                    }
                }
            }
            return !android.text.TextUtils.isEmpty(strF) ? j$.util.Optional.of(strF) : j$.util.Optional.empty();
        }
        byte[] bArr = null;
        if (i == 1) {
            j$.util.Optional optional = (j$.util.Optional) this.b;
            if (!optional.isEmpty()) {
                java.lang.Object obj4 = this.c;
                j$.util.Optional optional2 = (j$.util.Optional) obj4;
                if (!optional2.isEmpty()) {
                    if (optional.equals(obj4)) {
                        return aiql.z(java.lang.Boolean.TRUE);
                    }
                    if (((java.lang.String) optional.orElseThrow()).equals(dxt.a().d((java.lang.String) optional2.orElseThrow(), dxv.a))) {
                        return aiql.z(java.lang.Boolean.TRUE);
                    }
                    java.lang.Object obj5 = this.d;
                    if (!((j$.util.Optional) obj5).isPresent() || !optional.equals(obj5)) {
                        return aiql.z(java.lang.Boolean.FALSE);
                    }
                    java.lang.Object obj6 = this.a;
                    return aiql.A((ajcq) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent((java.util.concurrent.ConcurrentMap) ((krv) obj6).c, (java.lang.String) optional2.orElseThrow(), new defpackage.pgq(obj6, (java.lang.String) optional.orElseThrow(), 6, bArr)));
                }
            }
            return aiql.z(java.lang.Boolean.FALSE);
        }
        if (i == 2) {
            java.lang.Object obj7 = this.c;
            boolean zIsPresent = ((j$.util.Optional) obj7).isPresent();
            java.lang.Object obj8 = this.d;
            java.lang.Object obj9 = this.b;
            if (!zIsPresent) {
                return java.lang.Boolean.FALSE;
            }
            if ("voicemail".equals(((android.net.Uri) this.a).getScheme())) {
                return java.lang.Boolean.TRUE;
            }
            try {
                return java.lang.Boolean.valueOf(((zjs) obj9).A((android.telecom.PhoneAccountHandle) ((j$.util.Optional) obj7).orElseThrow(), (java.lang.String) ((j$.util.Optional) obj8).orElse((java.lang.Object) null)));
            } catch (java.lang.SecurityException e) {
                a.bq(defpackage.pqv.a.d(), "TelecomManager.isVoicemailNumber called without permission.", "com/android/dialer/incall/core/call/CallProducerModule", "produceIsVoiceMailNumber", (char) 704, "CallProducerModule.java", e, zct.b);
                return java.lang.Boolean.FALSE;
            }
        }
        zjm zjmVar = (zjm) this.b;
        boolean zIsPresent2 = zjmVar.g().isPresent();
        java.lang.Object objOfNullable = this.d;
        java.lang.Object obj10 = this.a;
        if (zIsPresent2) {
            j$.util.Optional optionalG = zjmVar.g();
            if (true == optionalG.isPresent()) {
                optionalG = j$.util.Optional.ofNullable(((hrb) optionalG.get()).a());
            }
            return ahvr.H((ajcq) optionalG.orElse(aiql.z(java.lang.Boolean.FALSE)), new oqe(objOfNullable, obj10, 7, (byte[]) null), (java.util.concurrent.Executor) this.c);
        }
        j$.util.Objects.requireNonNull(obj10);
        defpackage.pnh pnhVar = new defpackage.pnh(obj10, 15);
        j$.util.Optional optional3 = (j$.util.Optional) objOfNullable;
        if (true == optional3.isPresent()) {
            defpackage.pzp pzpVar = (defpackage.pzp) optional3.get();
            aoin aoinVar = (aoin) ((defpackage.pzt) pnhVar.a).a.get(pzpVar);
            if (aoinVar == null) {
                throw new java.lang.AssertionError(java.lang.String.format("screen for %s is not bound", pzpVar.name()));
            }
            objOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.pzs) aoinVar.a()).f()));
        }
        return aiql.z((java.lang.Boolean) ((j$.util.Optional) objOfNullable).orElse(java.lang.Boolean.FALSE));
    }

    public /* synthetic */ pio(j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3, krv krvVar, int i) {
        this.$cid = i;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.a = krvVar;
    }

    public /* synthetic */ pio(defpackage.sql sqlVar, j$.util.Optional optional, j$.util.Optional optional2, java.lang.String str, int i) {
        this.$cid = i;
        this.a = sqlVar;
        this.b = optional;
        this.c = optional2;
        this.d = str;
    }

    public /* synthetic */ pio(zjm zjmVar, j$.util.Optional optional, defpackage.pzt pztVar, ajct ajctVar, int i) {
        this.$cid = i;
        this.b = zjmVar;
        this.d = optional;
        this.a = pztVar;
        this.c = ajctVar;
    }
}
