package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aaab implements aaua {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ aaab(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v15, types: [ajwi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20, types: [aabb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v3, types: [ahyc, java.lang.Object] */
    public final java.lang.Object a(aaum aaumVar) {
        zzt zztVar;
        int i = this.$cid;
        if (i == 0) {
            if (aaumVar.k()) {
                zztVar = (zzt) aaumVar.g();
            } else {
                android.util.Log.e("ClearcutLoggerApiImpl", "Error sampling log.", aaumVar.f());
                zztVar = zzt.b;
            }
            return ((aaaf) this.a).c((zyy) this.b, zztVar);
        }
        final int i2 = 1;
        if (i == 1) {
            aaap aaapVar = aaaf.a;
            if (aaumVar.k()) {
                return (aaum) this.a.apply(this.b);
            }
            android.util.Log.e("ClearcutLoggerApiImpl", "Error resolving compliance data.", aaumVar.f());
            return aaumVar;
        }
        final int i3 = 2;
        if (i == 2) {
            if (!aaumVar.k() || !aabo.d((android.os.Bundle) aaumVar.g())) {
                return aaumVar;
            }
            return ((aabo) this.a).a((android.os.Bundle) this.b).e(aabo.a, new defpackage.aaul() { // from class: aabv
                @Override // defpackage.aaul
                public final aaum a(java.lang.Object obj) {
                    if (i2 != 0) {
                        android.os.Bundle bundle = (android.os.Bundle) obj;
                        return aabo.d(bundle) ? aazc.s((java.lang.Object) null) : aazc.s(bundle);
                    }
                    aabx aabxVar = aabx.a;
                    return aazc.s((java.lang.Object) null);
                }
            });
        }
        if (i == 3) {
            java.lang.Object obj = this.b;
            java.lang.Object obj2 = this.a;
            synchronized (obj2) {
                ((apni) obj2).a.remove(obj);
            }
            return aaumVar;
        }
        if (i == 4) {
            if (!aaumVar.k()) {
                return aazc.r(gou.w(aaumVar));
            }
            ?? r0 = this.a;
            java.lang.Object obj3 = this.b;
            final java.lang.String str = ((defpackage.ajwm) aaumVar.g()).a;
            return ((gou) obj3).c.a().c((java.util.concurrent.Executor) r0, new aaua() { // from class: ajxl
                /* JADX WARN: Type inference failed for: r3v2, types: [ajwi, java.lang.Object] */
                public final java.lang.Object a(aaum aaumVar2) throws java.util.concurrent.ExecutionException {
                    java.lang.Exception excF;
                    int i4 = i2;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            return !aaumVar2.k() ? aazc.r(gou.w(aaumVar2)) : aazc.s(new android.util.Pair((java.lang.String) aaumVar2.g(), str));
                        }
                        if (!aaumVar2.k()) {
                            throw new java.util.concurrent.ExecutionException(aaumVar2.f());
                        }
                        java.lang.String str2 = (java.lang.String) aaumVar2.g();
                        if (!android.text.TextUtils.isEmpty(str2)) {
                            java.lang.Object obj4 = str;
                            if (str2.endsWith((java.lang.String) obj4)) {
                                return obj4;
                            }
                        }
                        throw new java.util.concurrent.ExecutionException(new java.lang.IllegalArgumentException("Unexpected Error: FID NOT matching!"));
                    }
                    if (aaumVar2.k() || (excF = aaumVar2.f()) == null || android.text.TextUtils.isEmpty(excF.getMessage()) || !excF.getMessage().contains("FID_ALREADY_USED:")) {
                        return aaumVar2;
                    }
                    java.lang.Object obj5 = str;
                    android.util.Log.w("FirebaseMessaging", "FID_ALREADY_USED Detected. Retrying with FID cache clearing!");
                    gou gouVar = (gou) obj5;
                    gouVar.c.f();
                    return gouVar.u();
                }
            });
        }
        if (i != 5) {
            java.lang.Object obj4 = this.a;
            java.lang.Object obj5 = this.b;
            synchronized (obj5) {
                ((apni) obj5).a.remove(obj4);
            }
            return aaumVar;
        }
        if (!aaumVar.k()) {
            return aazc.r(gou.w(aaumVar));
        }
        ?? r1 = this.a;
        java.lang.Object obj6 = this.b;
        final java.lang.String str2 = (java.lang.String) ((android.util.Pair) aaumVar.g()).first;
        java.lang.String str3 = (java.lang.String) ((android.util.Pair) aaumVar.g()).second;
        gou gouVar = (gou) obj6;
        ajtc ajtcVar = (ajtc) gouVar.b;
        ajtcVar.c();
        ajtcVar.c();
        return gouVar.e.a(new com.google.android.gms.cloudmessaging.RegisterRequest(a.f(ajtcVar), str2, str3)).b((java.util.concurrent.Executor) r1, new aaua() { // from class: ajxl
            /* JADX WARN: Type inference failed for: r3v2, types: [ajwi, java.lang.Object] */
            public final java.lang.Object a(aaum aaumVar2) throws java.util.concurrent.ExecutionException {
                java.lang.Exception excF;
                int i4 = i3;
                if (i4 != 0) {
                    if (i4 == 1) {
                        return !aaumVar2.k() ? aazc.r(gou.w(aaumVar2)) : aazc.s(new android.util.Pair((java.lang.String) aaumVar2.g(), str2));
                    }
                    if (!aaumVar2.k()) {
                        throw new java.util.concurrent.ExecutionException(aaumVar2.f());
                    }
                    java.lang.String str4 = (java.lang.String) aaumVar2.g();
                    if (!android.text.TextUtils.isEmpty(str4)) {
                        java.lang.Object obj7 = str2;
                        if (str4.endsWith((java.lang.String) obj7)) {
                            return obj7;
                        }
                    }
                    throw new java.util.concurrent.ExecutionException(new java.lang.IllegalArgumentException("Unexpected Error: FID NOT matching!"));
                }
                if (aaumVar2.k() || (excF = aaumVar2.f()) == null || android.text.TextUtils.isEmpty(excF.getMessage()) || !excF.getMessage().contains("FID_ALREADY_USED:")) {
                    return aaumVar2;
                }
                java.lang.Object obj8 = str2;
                android.util.Log.w("FirebaseMessaging", "FID_ALREADY_USED Detected. Retrying with FID cache clearing!");
                gou gouVar2 = (gou) obj8;
                gouVar2.c.f();
                return gouVar2.u();
            }
        });
    }

    public /* synthetic */ aaab(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
