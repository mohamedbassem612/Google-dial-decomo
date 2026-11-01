package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lne extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.lnh b;
    final /* synthetic */ android.telecom.Call.Details c;
    final /* synthetic */ android.telecom.CallScreeningService.CallResponse.Builder d;
    final /* synthetic */ defpackage.okd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lne(defpackage.lnh lnhVar, android.telecom.Call.Details details, android.telecom.CallScreeningService.CallResponse.Builder builder, defpackage.okd okdVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = lnhVar;
        this.c = details;
        this.d = builder;
        this.e = okdVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b4 A[Catch: Exception -> 0x00ce, TryCatch #0 {Exception -> 0x00ce, blocks: (B:4:0x000c, B:33:0x00af, B:35:0x00b4, B:37:0x00ba, B:38:0x00bc, B:40:0x00c0, B:41:0x00c2, B:43:0x00c6, B:44:0x00c8, B:25:0x008b, B:27:0x0093, B:29:0x009b, B:31:0x00a6), top: B:50:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba A[Catch: Exception -> 0x00ce, TryCatch #0 {Exception -> 0x00ce, blocks: (B:4:0x000c, B:33:0x00af, B:35:0x00b4, B:37:0x00ba, B:38:0x00bc, B:40:0x00c0, B:41:0x00c2, B:43:0x00c6, B:44:0x00c8, B:25:0x008b, B:27:0x0093, B:29:0x009b, B:31:0x00a6), top: B:50:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0 A[Catch: Exception -> 0x00ce, TryCatch #0 {Exception -> 0x00ce, blocks: (B:4:0x000c, B:33:0x00af, B:35:0x00b4, B:37:0x00ba, B:38:0x00bc, B:40:0x00c0, B:41:0x00c2, B:43:0x00c6, B:44:0x00c8, B:25:0x008b, B:27:0x0093, B:29:0x009b, B:31:0x00a6), top: B:50:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6 A[Catch: Exception -> 0x00ce, TryCatch #0 {Exception -> 0x00ce, blocks: (B:4:0x000c, B:33:0x00af, B:35:0x00b4, B:37:0x00ba, B:38:0x00bc, B:40:0x00c0, B:41:0x00c2, B:43:0x00c6, B:44:0x00c8, B:25:0x008b, B:27:0x0093, B:29:0x009b, B:31:0x00a6), top: B:50:0x000a }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.lms lmsVar;
        java.lang.Object next;
        aoin aoinVar;
        defpackage.lmu lmuVar;
        defpackage.lmt lmtVar;
        boolean z;
        ?? r11;
        ?? r12;
        int i;
        aolu aoluVar = aolu.a;
        try {
            if (this.a == 0) {
                aooc.af(obj);
                defpackage.lnh lnhVar = this.b;
                java.util.Set setEntrySet = lnhVar.o.k().entrySet();
                aooh.e(setEntrySet, "<get-entries>(...)");
                java.util.Iterator it = setEntrySet.iterator();
                lmsVar = null;
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int iA = ((defpackage.lmt) ((java.util.Map.Entry) next).getKey()).a();
                        do {
                            java.lang.Object next2 = it.next();
                            int iA2 = ((defpackage.lmt) ((java.util.Map.Entry) next2).getKey()).a();
                            if (iA > iA2) {
                                next = next2;
                                iA = iA2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) next;
                defpackage.lnh.a.b().l("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl", "respondToCallWithConfigurations$<anonymous>", 563, "DialerCallScreeningServiceMixinImpl.kt").y("highest priority call composer attachments contributor feature key: %s", (entry == null || (lmtVar = (defpackage.lmt) entry.getKey()) == null) ? null : lmtVar.name());
                if (entry != null && (aoinVar = (aoin) entry.getValue()) != null && (lmuVar = (defpackage.lmu) aoinVar.a()) != null) {
                    lnhVar.a(this.c);
                    ajcq ajcqVarA = lmuVar.a();
                    if (ajcqVarA != null) {
                        this.a = 1;
                        obj = aosv.D(ajcqVarA, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                    }
                    defpackage.okd okdVar = this.e;
                    android.telecom.Call.Details details = this.c;
                    android.telecom.CallScreeningService.CallResponse callResponseM = fh$.ExternalSyntheticApiModelOutline0.m(this.d);
                    aooh.e(callResponseM, "build(...)");
                    okdVar.a(details, callResponseM);
                    return aojh.a;
                }
                if (lmsVar != null) {
                    z = lmsVar.b;
                    if (lmsVar.c) {
                        r11 = z;
                        r11 = (z ? 1 : 0) | 2;
                    }
                    r11 = z;
                    r12 = r11;
                    if (lmsVar.d) {
                        r12 = (r11 == true ? 1 : 0) | 4;
                    }
                    i = r12;
                    if (lmsVar.e) {
                        i = (r12 == true ? 1 : 0) | 8;
                    }
                    mp$.ExternalSyntheticApiModelOutline0.m(this.d, i);
                }
                defpackage.okd okdVar2 = this.e;
                android.telecom.Call.Details details2 = this.c;
                android.telecom.CallScreeningService.CallResponse callResponseM2 = fh$.ExternalSyntheticApiModelOutline0.m(this.d);
                aooh.e(callResponseM2, "build(...)");
                okdVar2.a(details2, callResponseM2);
                return aojh.a;
            }
            aooc.af(obj);
            lmsVar = (defpackage.lms) obj;
            if (lmsVar != null) {
                z = lmsVar.b;
                if (lmsVar.c) {
                    r11 = z;
                    r11 = (z ? 1 : 0) | 2;
                }
                r11 = z;
                r12 = r11;
                if (lmsVar.d) {
                    r12 = (r11 == true ? 1 : 0) | 4;
                }
                i = r12;
                if (lmsVar.e) {
                    i = (r12 == true ? 1 : 0) | 8;
                }
                mp$.ExternalSyntheticApiModelOutline0.m(this.d, i);
            }
        } catch (java.lang.Exception e) {
            defpackage.lnh.a.c().i(zct.b).k(e).l("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl", "respondToCallWithConfigurations$<anonymous>", 596, "DialerCallScreeningServiceMixinImpl.kt").v("failed to retrieve call composer attachments");
        }
        defpackage.okd okdVar3 = this.e;
        android.telecom.Call.Details details3 = this.c;
        android.telecom.CallScreeningService.CallResponse callResponseM3 = fh$.ExternalSyntheticApiModelOutline0.m(this.d);
        aooh.e(callResponseM3, "build(...)");
        okdVar3.a(details3, callResponseM3);
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.lne(this.b, this.c, this.d, this.e, aolnVar);
    }
}
