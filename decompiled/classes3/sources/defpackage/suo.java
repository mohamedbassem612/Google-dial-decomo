package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class suo {
    public static final android.content.Intent b;
    public static final java.util.Set c;
    public final android.content.Context d;
    public final aolr e;
    public final aolr f;
    public final aolr g;
    public final ojo h;
    public final zrw i;
    public static final defpackage.sns j = new defpackage.sns();
    public static final aimz a = aimz.i("com/android/dialer/preferredsim/impl/simselector/DataIdProvider");

    static {
        android.content.Intent intent = new android.content.Intent("android.provider.action.QUICK_CONTACT");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setData(android.provider.ContactsContract.Contacts.CONTENT_URI.buildUpon().appendPath("1").build());
        b = intent;
        c = ajsz.cW(new java.lang.String[]{"com.google", "com.osp.app.signin", "com.android.exchange", "com.google.android.exchange", "com.google.android.gm.exchange"});
    }

    public suo(android.content.Context context, aolr aolrVar, aolr aolrVar2, aolr aolrVar3, ojo ojoVar, zrw zrwVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(aolrVar2, "blockingContext");
        aooh.f(aolrVar3, "lightweightContext");
        aooh.f(ojoVar, "dialerContentResolver");
        this.d = context;
        this.e = aolrVar;
        this.f = aolrVar2;
        this.g = aolrVar3;
        this.h = ojoVar;
        this.i = zrwVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:0: B:27:0x0073->B:41:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(long j2, aoln aolnVar) {
        defpackage.sul sulVar;
        aify<j$.util.Optional> aifyVar;
        java.lang.String str;
        if (aolnVar instanceof defpackage.sul) {
            sulVar = (defpackage.sul) aolnVar;
            int i = sulVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sulVar.c = i - Integer.MIN_VALUE;
            } else {
                sulVar = new defpackage.sul(this, aolnVar);
            }
        } else {
            sulVar = new defpackage.sul(this, aolnVar);
        }
        defpackage.sul sulVar2 = sulVar;
        java.lang.Object objB = sulVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = sulVar2.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    aooc.af(objB);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(objB);
                }
                aifyVar = (aify) objB;
                if (aifyVar != null) {
                    for (j$.util.Optional optional : aifyVar) {
                        aooh.c(optional);
                        str = (java.lang.String) aooh.q(optional);
                        if (str != null) {
                            return str;
                        }
                    }
                }
                return null;
            }
            aooc.af(objB);
            sulVar2.c = 1;
            objB = b(j2, sulVar2);
            if (objB == aoluVar) {
                return aoluVar;
            }
            java.lang.Long l = (java.lang.Long) objB;
            if (l != null) {
                long jLongValue = l.longValue();
                defpackage.sns snsVar = j;
                ojo ojoVar = this.h;
                android.net.Uri uriWithAppendedId = android.content.ContentUris.withAppendedId(android.provider.ContactsContract.RawContacts.CONTENT_URI, jLongValue);
                aooh.e(uriWithAppendedId, "withAppendedId(...)");
                defpackage.sqs sqsVar = defpackage.sqs.c;
                sulVar2.c = 2;
                objB = snsVar.w(ojoVar, uriWithAppendedId, new java.lang.String[]{"account_type"}, sqsVar, sulVar2);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                aifyVar = (aify) objB;
                if (aifyVar != null) {
                    while (r8.hasNext()) {
                        aooh.c(optional);
                        str = (java.lang.String) aooh.q(optional);
                        if (str != null) {
                            return str;
                        }
                    }
                }
            }
            return null;
        } catch (java.lang.RuntimeException e) {
            a.d().k(e).l("com/android/dialer/preferredsim/impl/simselector/DataIdProvider", "getAccountType", 108, "DataIdProvider.kt").v("getAccountType failed");
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(long j2, aoln aolnVar) {
        defpackage.sum sumVar;
        if (aolnVar instanceof defpackage.sum) {
            sumVar = (defpackage.sum) aolnVar;
            int i = sumVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sumVar.c = i - Integer.MIN_VALUE;
            } else {
                sumVar = new defpackage.sum(this, aolnVar);
            }
        } else {
            sumVar = new defpackage.sum(this, aolnVar);
        }
        defpackage.sum sumVar2 = sumVar;
        java.lang.Object objW = sumVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = sumVar2.c;
        try {
            if (i2 == 0) {
                aooc.af(objW);
                defpackage.sns snsVar = j;
                ojo ojoVar = this.h;
                android.net.Uri uriWithAppendedId = android.content.ContentUris.withAppendedId(android.provider.ContactsContract.Data.CONTENT_URI, j2);
                aooh.e(uriWithAppendedId, "withAppendedId(...)");
                defpackage.sqs sqsVar = defpackage.sqs.d;
                sumVar2.c = 1;
                objW = snsVar.w(ojoVar, uriWithAppendedId, new java.lang.String[]{"raw_contact_id"}, sqsVar, sumVar2);
                if (objW == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objW);
            }
            aify aifyVar = (aify) objW;
            if (aifyVar == null) {
                return null;
            }
            return ajsz.bG(aifyVar);
        } catch (java.lang.RuntimeException e) {
            a.d().k(e).l("com/android/dialer/preferredsim/impl/simselector/DataIdProvider", "getRawContactId", 125, "DataIdProvider.kt").v("getRawContactId failed");
            throw e;
        }
    }
}
