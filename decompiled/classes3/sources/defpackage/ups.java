package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ups implements iph {
    private static final aimz b = aimz.i("com/android/dialer/speeddial/database/SpeedDialUnboundedBackupIntegration");
    public final android.content.Context a;
    private final ojo c;
    private final aoin d;
    private final aoir e;

    public ups(android.content.Context context, ojo ojoVar, aoin aoinVar) {
        aooh.f(context, "appContext");
        aooh.f(ojoVar, "dialerContentResolver");
        aooh.f(aoinVar, "catchContentProviderException");
        this.a = context;
        this.c = ojoVar;
        this.d = aoinVar;
        this.e = aooc.ag(new defpackage.wsn(this, 1));
    }

    private final upp d() {
        return (upp) this.e.a();
    }

    public final java.lang.Object a(java.io.OutputStream outputStream, aoln aolnVar) {
        aimz aimzVar = b;
        aimzVar.b().l("com/android/dialer/speeddial/database/SpeedDialUnboundedBackupIntegration", "backup", 40, "SpeedDialUnboundedBackupIntegration.kt").v("backup");
        aify aifyVarA = d().a();
        if (aifyVarA.isEmpty()) {
            aimzVar.b().l("com/android/dialer/speeddial/database/SpeedDialUnboundedBackupIntegration", "backup", 45, "SpeedDialUnboundedBackupIntegration.kt").v("no data to backup");
            return aojh.a;
        }
        ailk ailkVarY = aifyVarA.y(0);
        aooh.e(ailkVarY, "iterator(...)");
        while (ailkVarY.hasNext()) {
            defpackage.upo upoVar = (defpackage.upo) ailkVarY.next();
            aooh.c(upoVar);
            aooh.f(upoVar, "<this>");
            akzx akzxVarM = defpackage.upm.a.m();
            aooh.f(akzxVarM, "builder");
            java.lang.String str = upoVar.d;
            aooh.e(str, "lookupKey(...)");
            aooh.f(str, "value");
            akzxVarM.u();
            defpackage.upm upmVar = (defpackage.upm) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            upmVar.c = str;
            long j = upoVar.c;
            akzxVarM.u();
            ((defpackage.upm) akzxVarM.b).d = j;
            defpackage.upl uplVar = upoVar.f;
            if (uplVar != null) {
                akzxVarM.u();
                defpackage.upm upmVar2 = (defpackage.upm) akzxVarM.b;
                j$.util.Objects.requireNonNull(uplVar);
                upmVar2.e = uplVar;
                upmVar2.b |= 1;
            }
            j$.util.Optional optional = upoVar.b;
            aooh.e(optional, "pinnedPosition(...)");
            java.lang.Integer num = (java.lang.Integer) aooh.q(optional);
            if (num != null) {
                int iIntValue = num.intValue();
                akzxVarM.u();
                defpackage.upm upmVar3 = (defpackage.upm) akzxVarM.b;
                upmVar3.b |= 2;
                upmVar3.f = iIntValue;
            }
            java.lang.String str2 = upoVar.e;
            if (str2 != null) {
                akzxVarM.u();
                defpackage.upm upmVar4 = (defpackage.upm) akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                upmVar4.b |= 4;
                upmVar4.g = str2;
            }
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            ((defpackage.upm) aladVarP).g(outputStream);
        }
        aimzVar.b().l("com/android/dialer/speeddial/database/SpeedDialUnboundedBackupIntegration", "backup", 53, "SpeedDialUnboundedBackupIntegration.kt").v("backup finished");
        return aojh.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: agui */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.Map] */
    public final java.lang.Object b(java.io.InputStream inputStream, aoln aolnVar) throws agui {
        defpackage.upr uprVar;
        ?? r13;
        int i;
        if (aolnVar instanceof defpackage.upr) {
            uprVar = (defpackage.upr) aolnVar;
            int i2 = uprVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uprVar.d = i2 - Integer.MIN_VALUE;
            } else {
                uprVar = new defpackage.upr(this, aolnVar);
            }
        } else {
            uprVar = new defpackage.upr(this, aolnVar);
        }
        java.lang.Object objC = uprVar.b;
        aolu aoluVar = aolu.a;
        int i3 = uprVar.d;
        if (i3 == 0) {
            aooc.af(objC);
            aimz aimzVar = b;
            aimzVar.b().l("com/android/dialer/speeddial/database/SpeedDialUnboundedBackupIntegration", "restore", 57, "SpeedDialUnboundedBackupIntegration.kt").v("restore");
            aooh.f(inputStream, "<this>");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            while (true) {
                aooh.f(inputStream, "<this>");
                defpackage.upm upmVar = (defpackage.upm) defpackage.upm.u(defpackage.upm.a, inputStream, akzq.a());
                if (upmVar == null) {
                    break;
                }
                linkedHashMap.put(upmVar.c, upmVar);
            }
            if (linkedHashMap.isEmpty()) {
                aimzVar.b().l("com/android/dialer/speeddial/database/SpeedDialUnboundedBackupIntegration", "restore", 61, "SpeedDialUnboundedBackupIntegration.kt").v("no data to restore");
                return ipg.a;
            }
            ojo ojoVar = this.c;
            uprVar.a = linkedHashMap;
            uprVar.d = 1;
            objC = c(ojoVar, uprVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
            r13 = linkedHashMap;
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj = uprVar.a;
            aooc.af(objC);
            r13 = obj;
        }
        if (((java.util.List) objC).isEmpty()) {
            b.b().l("com/android/dialer/speeddial/database/SpeedDialUnboundedBackupIntegration", "restore", 68, "SpeedDialUnboundedBackupIntegration.kt").v("pending cp2 contact migration; cannot restore");
            return ipg.b;
        }
        aify aifyVarA = d().a();
        aooh.e(aifyVarA, "getAllEntries(...)");
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(aifyVarA, 10)), 16));
        for (java.lang.Object obj2 : aifyVarA) {
            linkedHashMap2.put(((defpackage.upo) obj2).d, obj2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.util.Map.Entry entry : r13.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            defpackage.upm upmVar2 = (defpackage.upm) entry.getValue();
            defpackage.upo upoVar = (defpackage.upo) linkedHashMap2.get(str);
            if (upoVar != null) {
                aooh.f(upmVar2, "backup");
                defpackage.adrp adrpVar = new defpackage.adrp(upoVar);
                if (upoVar.f == null && (upmVar2.b & 1) != 0) {
                    defpackage.upl uplVar = upmVar2.e;
                    if (uplVar == null) {
                        uplVar = defpackage.upl.a;
                    }
                    adrpVar.d = uplVar;
                }
                if (upoVar.b.isEmpty() && (upmVar2.b & 2) != 0 && (i = upmVar2.f) != -1) {
                    adrpVar.p(j$.util.Optional.of(java.lang.Integer.valueOf(i)));
                }
                if (upoVar.e == null && (upmVar2.b & 4) != 0) {
                    adrpVar.c = upmVar2.g;
                }
                arrayList.add(adrpVar.m());
            } else {
                aooh.f(upmVar2, "<this>");
                defpackage.adrp adrpVarA = defpackage.upo.a();
                adrpVarA.o(upmVar2.c);
                adrpVarA.n(upmVar2.d);
                if ((upmVar2.b & 1) != 0) {
                    defpackage.upl uplVar2 = upmVar2.e;
                    if (uplVar2 == null) {
                        uplVar2 = defpackage.upl.a;
                    }
                    adrpVarA.d = uplVar2;
                }
                if ((upmVar2.b & 2) != 0) {
                    adrpVarA.p(j$.util.Optional.of(java.lang.Integer.valueOf(upmVar2.f)));
                }
                if ((upmVar2.b & 4) != 0) {
                    adrpVarA.c = upmVar2.g;
                }
                arrayList2.add(adrpVarA.m());
            }
        }
        if (!arrayList.isEmpty()) {
            d().d(ahvr.bv(arrayList));
        }
        if (!arrayList2.isEmpty()) {
            upp uppVarD = d();
            aify aifyVarBv = ahvr.bv(arrayList2);
            upp.a.b().l("com/android/dialer/speeddial/database/SpeedDialEntryDatabaseHelper", "insert", 252, "SpeedDialEntryDatabaseHelper.java").v("enter");
            if (!aifyVarBv.isEmpty()) {
                android.database.sqlite.SQLiteDatabase writableDatabase = uppVarD.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    upp.b(writableDatabase, aifyVarBv);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    writableDatabase.close();
                } catch (java.lang.Throwable th) {
                    writableDatabase.endTransaction();
                    writableDatabase.close();
                    throw th;
                }
            }
        }
        b.b().l("com/android/dialer/speeddial/database/SpeedDialUnboundedBackupIntegration", "restore", 94, "SpeedDialUnboundedBackupIntegration.kt").v("restore finished");
        return ipg.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: agui */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(ojo ojoVar, aoln aolnVar) throws agui {
        defpackage.upq upqVar;
        aokc aokcVar;
        if (aolnVar instanceof defpackage.upq) {
            upqVar = (defpackage.upq) aolnVar;
            int i = upqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                upqVar.c = i - Integer.MIN_VALUE;
            } else {
                upqVar = new defpackage.upq(this, aolnVar);
            }
        } else {
            upqVar = new defpackage.upq(this, aolnVar);
        }
        defpackage.upq upqVar2 = upqVar;
        java.lang.Object objI = upqVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = upqVar2.c;
        try {
            if (i2 == 0) {
                aooc.af(objI);
                android.net.Uri uri = android.provider.ContactsContract.Contacts.CONTENT_URI;
                aooh.e(uri, "CONTENT_URI");
                defpackage.sqs sqsVar = defpackage.sqs.g;
                upqVar2.c = 1;
                int i3 = ojo.f;
                objI = ojoVar.i(uri, new java.lang.String[]{"_id"}, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null, sqsVar, upqVar2);
                if (objI == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objI);
            }
            return (java.util.List) objI;
        } catch (java.lang.RuntimeException e) {
            b.d().k(e).l("com/android/dialer/speeddial/database/SpeedDialUnboundedBackupIntegration", "queryContacts", 104, "SpeedDialUnboundedBackupIntegration.kt").v("Failed to query ContactsProvider");
            aokcVar = aokc.a;
            return aokcVar;
        } catch (agui e2) {
            if (!((java.lang.Boolean) this.d.a()).booleanValue()) {
                throw e2;
            }
            b.d().k(e2).l("com/android/dialer/speeddial/database/SpeedDialUnboundedBackupIntegration", "queryContacts", 108, "SpeedDialUnboundedBackupIntegration.kt").v("Failed to query ContactsProvider");
            aokcVar = aokc.a;
            return aokcVar;
        }
    }
}
