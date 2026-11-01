package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mkh extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ android.telecom.PhoneAccountHandle f;
    final /* synthetic */ defpackage.mki g;
    private /* synthetic */ java.lang.Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkh(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.mki mkiVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = phoneAccountHandle;
        this.g = mkiVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:18:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:21:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:28:0x010d  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        aosy aosyVarAm;
        aosy aosyVarAm2;
        java.lang.Object objA;
        android.telecom.PhoneAccount phoneAccount;
        java.lang.Object string;
        java.lang.Object objA2;
        java.lang.String str;
        java.lang.Object objFlattenToString;
        java.lang.String id;
        android.graphics.drawable.Icon icon;
        java.lang.Object objA3;
        java.lang.String str2;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int iOrdinal;
        boolean z;
        aolu aoluVar = aolu.a;
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                aosyVarAm2 = (aosy) this.a;
                aosy aosyVar = (aosy) this.h;
                aooc.af(obj);
                aosyVarAm = aosyVar;
                objA = obj;
            } else if (i != 2) {
                obj2 = this.d;
                obj3 = this.c;
                java.lang.Object obj4 = this.b;
                java.lang.String str3 = (java.lang.String) this.a;
                java.lang.String str4 = (java.lang.String) this.h;
                aooc.af(obj);
                objFlattenToString = obj4;
                str2 = str3;
                string = str4;
                objA3 = obj;
            } else {
                java.lang.Object obj5 = this.b;
                android.telecom.PhoneAccount phoneAccount2 = (android.telecom.PhoneAccount) this.a;
                aosy aosyVar2 = (aosy) this.h;
                aooc.af(obj);
                aosyVarAm = aosyVar2;
                phoneAccount = phoneAccount2;
                string = obj5;
                objA2 = obj;
                android.telecom.PhoneAccountHandle phoneAccountHandle = this.f;
                str = (java.lang.String) objA2;
                objFlattenToString = phoneAccountHandle.getComponentName().flattenToString();
                aooh.e(objFlattenToString, "flattenToString(...)");
                id = phoneAccountHandle.getId();
                aooh.e(id, "getId(...)");
                icon = phoneAccount.getIcon();
                this.h = string;
                this.a = str;
                this.b = objFlattenToString;
                this.c = id;
                this.d = icon;
                this.e = 3;
                objA3 = aosyVarAm.a(this);
                if (objA3 != aoluVar) {
                    return aoluVar;
                }
                str2 = str;
                obj2 = icon;
                obj3 = id;
            }
            iOrdinal = ((defpackage.nvr) objA3).ordinal();
            if (iOrdinal == 0) {
                z = true;
            } else {
                if (iOrdinal == 1 && iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                    throw new aois();
                }
                z = false;
            }
            return new defpackage.mjq(z, (java.lang.String) string, str2, (java.lang.String) objFlattenToString, (java.lang.String) obj3, (android.graphics.drawable.Icon) obj2);
        }
        aooc.af(obj);
        aoss aossVar = (aoss) this.h;
        defpackage.mki mkiVar = this.g;
        android.telecom.PhoneAccountHandle phoneAccountHandle2 = this.f;
        aosyVarAm = aoov.am(aossVar, 0, new defpackage.kqd(mkiVar, phoneAccountHandle2, (aoln) null, 16), 3);
        aosy aosyVarAm3 = aoov.am(aossVar, 0, new defpackage.kqd(mkiVar, phoneAccountHandle2, (aoln) null, 18, (char[]) null), 3);
        aosyVarAm2 = aoov.am(aossVar, 0, new defpackage.lwe(mkiVar, phoneAccountHandle2, (aoln) null, 4), 3);
        this.h = aosyVarAm;
        this.a = aosyVarAm2;
        this.e = 1;
        objA = aosyVarAm3.a(this);
        if (objA == aoluVar) {
            return aoluVar;
        }
        phoneAccount = (android.telecom.PhoneAccount) objA;
        if (phoneAccount == null) {
            defpackage.mki.a.d().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dialpadview/simselector/service/SimSelectorFlow", "toEntry$<anonymous>", 266, "SimSelectorFlow.kt").v("Failed to get phone account");
            return null;
        }
        string = phoneAccount.getLabel().toString();
        this.h = aosyVarAm;
        this.a = phoneAccount;
        this.b = string;
        this.e = 2;
        objA2 = aosyVarAm2.a(this);
        if (objA2 == aoluVar) {
            return aoluVar;
        }
        android.telecom.PhoneAccountHandle phoneAccountHandle3 = this.f;
        str = (java.lang.String) objA2;
        objFlattenToString = phoneAccountHandle3.getComponentName().flattenToString();
        aooh.e(objFlattenToString, "flattenToString(...)");
        id = phoneAccountHandle3.getId();
        aooh.e(id, "getId(...)");
        icon = phoneAccount.getIcon();
        this.h = string;
        this.a = str;
        this.b = objFlattenToString;
        this.c = id;
        this.d = icon;
        this.e = 3;
        objA3 = aosyVarAm.a(this);
        if (objA3 != aoluVar) {
            return aoluVar;
        }
        str2 = str;
        obj2 = icon;
        obj3 = id;
        iOrdinal = ((defpackage.nvr) objA3).ordinal();
        if (iOrdinal == 0) {
            if (iOrdinal == 1) {
            }
            z = false;
        } else {
            z = true;
        }
        return new defpackage.mjq(z, (java.lang.String) string, str2, (java.lang.String) objFlattenToString, (java.lang.String) obj3, (android.graphics.drawable.Icon) obj2);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.mkh mkhVar = new defpackage.mkh(this.f, this.g, aolnVar);
        mkhVar.h = obj;
        return mkhVar;
    }
}
