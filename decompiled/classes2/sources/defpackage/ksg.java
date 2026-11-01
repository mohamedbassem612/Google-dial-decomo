package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ksg {
    public static final aimz a = aimz.i("com/android/dialer/callnotesinfra/ui/CallNotesUiModelsMappers");
    public final aoss b;
    private final android.content.Context c;
    private final aolr d;

    public ksg(android.content.Context context, aoss aossVar, aolr aolrVar) {
        aooh.f(context, "appContext");
        aooh.f(aossVar, "uiScope");
        aooh.f(aolrVar, "lightweightContext");
        this.c = context;
        this.b = aossVar;
        this.d = aolrVar;
    }

    public final defpackage.krp a(defpackage.kor korVar) {
        int i;
        char c;
        aokc aokcVarAY;
        aooh.f(korVar, "callActionsState");
        int i2 = korVar.b;
        char c2 = 0;
        if (i2 == 0) {
            i = 4;
        } else if (i2 == 1) {
            i = 1;
        } else if (i2 != 2) {
            i = i2 != 3 ? 0 : 3;
        } else {
            i = 2;
        }
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 == 1) {
                return defpackage.kro.a;
            }
            if (i3 == 2) {
                return defpackage.krn.a;
            }
            return null;
        }
        alat<defpackage.kqx> alatVar = (i2 == 1 ? (defpackage.kqy) korVar.c : defpackage.kqy.a).c;
        aooh.e(alatVar, "getCallActionsList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.kqx kqxVar : alatVar) {
            aooh.c(kqxVar);
            int i4 = kqxVar.b;
            int iX = a.X(i4);
            int i5 = iX - 1;
            if (iX == 0) {
                throw null;
            }
            if (i5 == 0) {
                c = c2;
                java.lang.String str = (i4 == 1 ? (defpackage.krb) kqxVar.c : defpackage.krb.a).c;
                aooh.e(str, "getReminderText(...)");
                defpackage.krb krbVar = kqxVar.b == 1 ? (defpackage.krb) kqxVar.c : defpackage.krb.a;
                aooh.e(krbVar, "getReminder(...)");
                aokcVarAY = ajsz.aY(new defpackage.krl(2, 2131231288, str, "", new defpackage.ksd(this, krbVar)));
            } else if (i5 == 1) {
                c = c2;
                java.lang.String str2 = (i4 == 2 ? (defpackage.kqw) kqxVar.c : defpackage.kqw.a).c;
                aooh.e(str2, "getCalendarInviteTitle(...)");
                java.lang.String str3 = (kqxVar.b == 2 ? (defpackage.kqw) kqxVar.c : defpackage.kqw.a).g;
                aooh.e(str3, "getDescription(...)");
                defpackage.kqw kqwVar = kqxVar.b == 2 ? (defpackage.kqw) kqxVar.c : defpackage.kqw.a;
                aooh.e(kqwVar, "getCalendarInvite(...)");
                aokcVarAY = ajsz.aY(new defpackage.krl(1, 2131231335, str2, str3, new defpackage.krz(this, kqwVar)));
            } else if (i5 == 2) {
                defpackage.krl[] krlVarArr = new defpackage.krl[2];
                android.content.Context context = this.c;
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[c2] = (i4 == 3 ? (defpackage.kqv) kqxVar.c : defpackage.kqv.a).d;
                java.lang.String string = context.getString(2132019154, objArr);
                aooh.e(string, "getString(...)");
                defpackage.kqv kqvVar = kqxVar.b == 3 ? (defpackage.kqv) kqxVar.c : defpackage.kqv.a;
                c = c2;
                aooh.e(kqvVar, "getAddContact(...)");
                krlVarArr[c] = new defpackage.krl(3, 2131231536, string, "", new defpackage.kry(kqvVar));
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                objArr2[c] = (kqxVar.b == 3 ? (defpackage.kqv) kqxVar.c : defpackage.kqv.a).d;
                java.lang.String string2 = context.getString(2132019155, objArr2);
                aooh.e(string2, "getString(...)");
                defpackage.kqv kqvVar2 = kqxVar.b == 3 ? (defpackage.kqv) kqxVar.c : defpackage.kqv.a;
                aooh.e(kqvVar2, "getAddContact(...)");
                krlVarArr[1] = new defpackage.krl(4, 2131231345, string2, "", new defpackage.ksa(kqvVar2));
                aokcVarAY = ajsz.bb(krlVarArr);
            } else {
                if (i5 != 3) {
                    throw new aois();
                }
                aokcVarAY = aokc.a;
                c = c2;
            }
            ajsz.bv(arrayList, aokcVarAY);
            c2 = c;
        }
        return new defpackage.krm(arrayList);
    }

    public final java.lang.Object b(az azVar, java.lang.Object obj, or orVar, aomy aomyVar, aoln aolnVar) {
        return aoov.aj(this.d, new defpackage.blv(azVar, orVar, obj, aomyVar, (aoln) null, 11), aolnVar);
    }
}
