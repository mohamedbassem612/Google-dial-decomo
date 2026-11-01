package com.android.dialer.androidauto.impl.carservice;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class DialerCarAppService extends defpackage.tp {
    @Override // defpackage.tp
    public final defpackage.ue b() {
        hlz hlzVar = (hlz) agab.aH(this, hlz.class);
        ahok ahokVarF = hlzVar.fi().f(7, "DialerCarAppService.onCreateSession");
        try {
            hlzVar.nJ().i((java.lang.String) null).b(mce.fW);
            defpackage.hmf hmfVarR = hlzVar.r();
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
            return hmfVarR;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.tp
    public final defpackage.abo c() {
        if ((getApplicationInfo().flags & 2) != 0) {
            defpackage.abo aboVar = defpackage.abo.a;
            aooh.c(aboVar);
            return aboVar;
        }
        android.content.Context applicationContext = getApplicationContext();
        java.util.HashMap map = new java.util.HashMap();
        java.lang.String[] stringArray = applicationContext.getResources().getStringArray(2130903080);
        if (stringArray == null) {
            throw new java.lang.IllegalArgumentException("Invalid allowlist res id: 2130903080");
        }
        for (java.lang.String str : stringArray) {
            java.lang.String[] strArrSplit = str.split(",", -1);
            if (strArrSplit.length != 2) {
                throw new java.lang.IllegalArgumentException(a.bp((byte) 39, str, "Invalid allowed host entry: '"));
            }
            java.lang.String strC = rz.c(strArrSplit[1]);
            java.lang.String strC2 = rz.c(strArrSplit[0]);
            j$.util.Objects.requireNonNull(strC);
            j$.util.Objects.requireNonNull(strC2);
            java.util.List arrayList = (java.util.List) map.get(strC);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                map.put(strC, arrayList);
            }
            arrayList.add(strC2);
        }
        return new defpackage.abo(applicationContext.getPackageManager(), map, false);
    }
}
