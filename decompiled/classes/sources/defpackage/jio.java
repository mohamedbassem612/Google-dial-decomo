package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class jio implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ jio(defpackage.adlx adlxVar, defpackage.adjl adjlVar, java.util.Map map, int i) {
        this.$cid = i;
        this.b = adlxVar;
        this.a = adjlVar;
        this.c = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v21, types: [adjl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r14v20, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v28, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v11, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.List] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.io.IOException {
        switch (this.$cid) {
            case 0:
                defpackage.aca acaVar = new defpackage.aca();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                ?? r4 = this.b;
                defpackage.ailj it = ((defpackage.aifo) r4).iterator();
                while (it.hasNext()) {
                    java.lang.Object obj = this.c;
                    java.lang.String str = (java.lang.String) it.next();
                    acaVar.put(str, java.lang.Boolean.FALSE);
                    java.lang.String numberToE164 = android.telephony.PhoneNumberUtils.formatNumberToE164(str, (java.lang.String) obj);
                    if (numberToE164 != null) {
                        arrayList.add(numberToE164);
                    }
                }
                java.lang.Object obj2 = this.a;
                defpackage.rsr rsrVar = new defpackage.rsr();
                rsrVar.aD(new defpackage.kaw("original_number").aF(r4));
                rsrVar.aD(new defpackage.kaw("e164_number").aF(arrayList));
                defpackage.rsr rsrVarAB = rsrVar.aB();
                android.database.Cursor cursorB = ((defpackage.ojo) ((defpackage.kgl) obj2).b).b(fh$.ExternalSyntheticApiModelOutline0.m(), new java.lang.String[]{"original_number", "e164_number"}, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a, null);
                try {
                    if (cursorB == null) {
                        return defpackage.aigf.i(acaVar);
                    }
                    while (cursorB.moveToNext()) {
                        java.lang.String string = cursorB.getString(0);
                        java.lang.Boolean bool = java.lang.Boolean.TRUE;
                        acaVar.put(string, bool);
                        java.lang.String string2 = cursorB.getString(1);
                        if (!android.text.TextUtils.isEmpty(string2)) {
                            acaVar.put(string2, bool);
                        }
                    }
                    cursorB.close();
                    return defpackage.aigf.i(acaVar);
                } catch (java.lang.Throwable th) {
                    if (cursorB == null) {
                        throw th;
                    }
                    try {
                        cursorB.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 1:
                androidx.work.impl.WorkDatabase workDatabase = ((defpackage.gtr) this.a).e;
                java.lang.String str2 = (java.lang.String) this.b;
                ((java.util.ArrayList) this.c).addAll(workDatabase.E().a(str2));
                return workDatabase.D().c(str2);
            case 2:
                ?? r0 = this.a;
                defpackage.ahvr.cc(r0.isDone(), "Future was expected to be done: %s", r0);
                if (!((java.lang.Boolean) defpackage.a.h(r0)).booleanValue()) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vda.a.b()).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/impl/VvmServiceProviderImpl", "hasRequiredPermissions", (char) 244, "VvmServiceProviderImpl.java")).v("Missing voicemail access permissions");
                    return java.lang.Boolean.FALSE;
                }
                ?? r1 = this.b;
                defpackage.ahvr.cc(r1.isDone(), "Future was expected to be done: %s", r1);
                if (!((java.lang.Boolean) defpackage.a.h(r1)).booleanValue()) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vda.a.b()).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/impl/VvmServiceProviderImpl", "hasRequiredPermissions", (char) 248, "VvmServiceProviderImpl.java")).v("Missing read phone state permission");
                    return java.lang.Boolean.FALSE;
                }
                ?? r14 = this.c;
                defpackage.ahvr.cc(r14.isDone(), "Future was expected to be done: %s", r14);
                if (((java.lang.Boolean) defpackage.a.h(r14)).booleanValue()) {
                    return java.lang.Boolean.TRUE;
                }
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vda.a.b()).i(defpackage.zct.a)).l("com/android/dialer/voicemail/service/impl/VvmServiceProviderImpl", "hasRequiredPermissions", (char) 252, "VvmServiceProviderImpl.java")).v("Missing send sms permission");
                return java.lang.Boolean.FALSE;
            case 3:
                defpackage.aiql.H(this.a);
                defpackage.aiql.H(this.b);
                defpackage.aiql.H(this.c);
                return null;
            case 4:
                defpackage.aiql.H(this.b);
                defpackage.aiql.H(this.c);
                ((defpackage.xek) this.a).i.a(defpackage.ajcm.a);
                return null;
            case 5:
                ?? r2 = this.a;
                defpackage.adlx adlxVar = (defpackage.adlx) this.b;
                java.lang.String str3 = adlxVar.a;
                java.util.List<defpackage.adjk> listA = r2.a(str3);
                defpackage.aiof aiofVar = defpackage.adhn.a;
                for (defpackage.adjk adjkVar : listA) {
                    adlxVar.f.f(str3, adjkVar, true != adlxVar.c.contains(adjkVar.a) ? 2 : 3);
                }
                ?? r15 = this.c;
                defpackage.adhf.a(r15.values(), "Request of " + r15.size() + " packs for " + str3 + " failed", new java.lang.Object[0]);
                return null;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ?? r3 = this.b;
                int size = r3.size();
                defpackage.aift aiftVarD = defpackage.aify.d(size);
                for (int i = 0; i < size; i++) {
                    ?? r5 = this.c;
                    java.lang.Object obj3 = this.a;
                    defpackage.aemc aemcVarA = defpackage.aeme.a();
                    aemcVarA.b(((android.accounts.Account) r3.get(i)).name);
                    ((defpackage.ahbq) obj3).c(aemcVarA, (defpackage.ajcq) r5.get(i));
                    aiftVarD.i(aemcVarA.a());
                }
                return aiftVarD.g();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.afhr) this.a).a.execSQL((java.lang.String) this.b, (java.lang.Object[]) this.c);
                return null;
            default:
                return (android.net.Uri) this.b.a(this.c.a(this.a));
        }
    }

    public /* synthetic */ jio(defpackage.aonj aonjVar, defpackage.aonj aonjVar2, java.lang.String str, int i) {
        this.$cid = i;
        this.b = aonjVar;
        this.c = aonjVar2;
        this.a = str;
    }

    public /* synthetic */ jio(defpackage.gtr gtrVar, java.util.ArrayList arrayList, java.lang.String str, int i) {
        this.$cid = i;
        this.a = gtrVar;
        this.c = arrayList;
        this.b = str;
    }

    public /* synthetic */ jio(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
