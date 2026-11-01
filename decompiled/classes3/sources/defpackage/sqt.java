package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sqt {
    private static final aimz a = aimz.i("com/android/dialer/phonelookup/cp2/Cp2LocalContact");
    private final ojo b;

    public sqt(ojo ojoVar) {
        aooh.f(ojoVar, "dialerContentResolver");
        this.b = ojoVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.lang.String str, aoln aolnVar) {
        defpackage.sqr sqrVar;
        if (aolnVar instanceof defpackage.sqr) {
            sqrVar = (defpackage.sqr) aolnVar;
            int i = sqrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sqrVar.c = i - Integer.MIN_VALUE;
            } else {
                sqrVar = new defpackage.sqr(this, aolnVar);
            }
        } else {
            sqrVar = new defpackage.sqr(this, aolnVar);
        }
        defpackage.sqr sqrVar2 = sqrVar;
        java.lang.Object objI = sqrVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = sqrVar2.c;
        try {
            if (i2 == 0) {
                aooc.af(objI);
                if (str == null || str.length() == 0) {
                    return java.lang.Boolean.FALSE;
                }
                ojo ojoVar = this.b;
                android.net.Uri uriWithAppendedPath = android.net.Uri.withAppendedPath(android.provider.ContactsContract.PhoneLookup.ENTERPRISE_CONTENT_FILTER_URI, android.net.Uri.encode(str));
                aooh.e(uriWithAppendedPath, "withAppendedPath(...)");
                defpackage.sqs sqsVar = defpackage.sqs.a;
                sqrVar2.c = 1;
                int i3 = ojo.f;
                objI = ojoVar.i(uriWithAppendedPath, new java.lang.String[]{"_id"}, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null, sqsVar, sqrVar2);
                if (objI == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objI);
            }
            return java.lang.Boolean.valueOf(!((aify) objI).isEmpty());
        } catch (agui e) {
            j$.util.Objects.checkIndex(0, 3);
            if (e instanceof aguh) {
                a.b().k(e).l("com/android/dialer/phonelookup/cp2/Cp2LocalContact", "isLocalContact", 36, "Cp2LocalContact.kt").v("Cursor is null");
            } else {
                boolean z = e instanceof defpackage.aguk;
                aimz aimzVar = a;
                if (z) {
                    aimzVar.b().k(e).l("com/android/dialer/phonelookup/cp2/Cp2LocalContact", "isLocalContact", 39, "Cp2LocalContact.kt").v("No matching provider found");
                } else {
                    aimzVar.b().k(e).l("com/android/dialer/phonelookup/cp2/Cp2LocalContact", "isLocalContact", 42, "Cp2LocalContact.kt").v("Failed to query contacts");
                }
            }
            return java.lang.Boolean.FALSE;
        } catch (java.lang.RuntimeException e2) {
            a.d().k(e2).l("com/android/dialer/phonelookup/cp2/Cp2LocalContact", "isLocalContact", 47, "Cp2LocalContact.kt").v("isLocalContact failed");
            throw e2;
        }
    }
}
