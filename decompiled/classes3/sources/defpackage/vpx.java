package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vpx extends aomh implements aonn {
    long a;
    int b;
    final /* synthetic */ defpackage.vpz c;
    final /* synthetic */ android.telecom.PhoneAccountHandle d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpx(defpackage.vpz vpzVar, android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar) {
        super(2, aolnVar);
        this.c = vpzVar;
        this.d = phoneAccountHandle;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        long j;
        aolu aoluVar = aolu.a;
        int i = this.b;
        if (i == 0) {
            aooc.af(obj);
            defpackage.vpz.a.b().l("com/android/dialer/voicemail/settings/greeting/single/impl/service/VoicemailSingleGreetingDataService$getDataSource$<anonymous>", "loadData$<anonymous>", 65, "VoicemailSingleGreetingDataService.kt").v("load data");
            defpackage.vpz vpzVar = this.c;
            this.b = 1;
            obj = vpzVar.f.b(this);
            if (obj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    aooc.af(obj);
                    return agxh.b(obj);
                }
                j = this.a;
                aooc.af(obj);
                return agxh.a(obj, j$.time.Instant.ofEpochMilli(j));
            }
            aooc.af(obj);
        }
        defpackage.vpt vptVar = (defpackage.vpt) obj;
        if (!vptVar.equals(wsc.az(defpackage.vpt.a.m()).d())) {
            android.telecom.PhoneAccountHandle phoneAccountHandle = this.d;
            if (vptVar.c.equals(phoneAccountHandle.getComponentName().flattenToString()) && vptVar.d.equals(phoneAccountHandle.getId())) {
                long j2 = vptVar.e;
                vcr vcrVar = vptVar.f;
                if (vcrVar == null) {
                    vcrVar = vcr.a;
                }
                int i2 = vcrVar.b;
                defpackage.vpz vpzVar2 = this.c;
                java.lang.Long l = i2 == 1 ? (java.lang.Long) vpzVar2.e.a() : (java.lang.Long) vpzVar2.d.a();
                defpackage.vpz vpzVar3 = this.c;
                aooh.c(l);
                long jLongValue = l.longValue();
                long epochMilli = j$.time.Instant.now().toEpochMilli() - j2;
                if (epochMilli >= 0 && epochMilli <= jLongValue) {
                    this.a = j2;
                    this.b = 2;
                    obj = vpzVar3.a(phoneAccountHandle, vptVar, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    j = j2;
                    return agxh.a(obj, j$.time.Instant.ofEpochMilli(j));
                }
                vcr vcrVar2 = vptVar.f;
                if (vcrVar2 == null) {
                    vcrVar2 = vcr.a;
                }
                if (vcrVar2.b != 1) {
                    return agxh.a;
                }
                this.b = 3;
                obj = vpzVar3.a(phoneAccountHandle, vptVar, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                return agxh.b(obj);
            }
        }
        defpackage.vpz.a.b().l("com/android/dialer/voicemail/settings/greeting/single/impl/service/VoicemailSingleGreetingDataService$getDataSource$<anonymous>", "loadData$<anonymous>", 71, "VoicemailSingleGreetingDataService.kt").v("Failed to load the data");
        return agxh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.vpx(this.c, this.d, aolnVar);
    }
}
