package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class upv {
    public static final java.lang.String[] a = {"lookup", "contact_id", "display_name", "starred", "data1", "data2", "data3", "photo_id", "photo_uri", "carrier_presence", "is_super_primary", "_id", "display_name_alt"};

    public static defpackage.upl a(defpackage.upt uptVar) {
        if (uptVar.l.size() == 1) {
            return (defpackage.upl) uptVar.l.get(0);
        }
        if ((uptVar.b & 4) == 0) {
            return null;
        }
        defpackage.upl uplVar = uptVar.m;
        if (uplVar == null) {
            uplVar = defpackage.upl.a;
        }
        defpackage.upk upkVarB = defpackage.upk.b(uplVar.f);
        if (upkVarB == null) {
            upkVarB = defpackage.upk.UNRECOGNIZED;
        }
        defpackage.upk upkVar = defpackage.upk.VOICE;
        if (upkVarB != upkVar) {
            defpackage.upl uplVar2 = uptVar.m;
            if (uplVar2 == null) {
                uplVar2 = defpackage.upl.a;
            }
            defpackage.upk upkVarB2 = defpackage.upk.b(uplVar2.f);
            if (upkVarB2 == null) {
                upkVarB2 = defpackage.upk.UNRECOGNIZED;
            }
            if (upkVarB2 != defpackage.upk.UNKNOWN) {
                for (defpackage.upl uplVar3 : uptVar.l) {
                    java.lang.String str = uplVar3.c;
                    defpackage.upl uplVar4 = uptVar.m;
                    if (uplVar4 == null) {
                        uplVar4 = defpackage.upl.a;
                    }
                    if (str.equals(uplVar4.c)) {
                        defpackage.upk upkVarB3 = defpackage.upk.b(uplVar3.f);
                        if (upkVarB3 == null) {
                            upkVarB3 = defpackage.upk.UNRECOGNIZED;
                        }
                        if (upkVarB3 == upkVar) {
                            return uplVar3;
                        }
                    }
                }
                return null;
            }
        }
        defpackage.upl uplVar5 = uptVar.m;
        return uplVar5 == null ? defpackage.upl.a : uplVar5;
    }

    static defpackage.upt b(android.content.Context context, android.database.Cursor cursor, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str) {
        java.util.Set set;
        int i;
        java.lang.String strNormalizeNumber;
        gus.aJ();
        int i2 = 1;
        ahvr.bM(cursor.getCount() != 0);
        java.lang.String string = cursor.getString(0);
        akzx akzxVarM = defpackage.upt.a.m();
        akzxVarM.u();
        defpackage.upt uptVar = (defpackage.upt) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        uptVar.g = string;
        long j = cursor.getLong(1);
        akzxVarM.u();
        ((defpackage.upt) akzxVarM.b).f = j;
        int i3 = cursor.getInt(3);
        akzxVarM.u();
        ((defpackage.upt) akzxVarM.b).h = i3 == 1;
        long j2 = cursor.getLong(7);
        akzxVarM.u();
        ((defpackage.upt) akzxVarM.b).i = j2;
        java.lang.String string2 = android.text.TextUtils.isEmpty(cursor.getString(8)) ? "" : cursor.getString(8);
        akzxVarM.u();
        defpackage.upt uptVar2 = (defpackage.upt) akzxVarM.b;
        j$.util.Objects.requireNonNull(string2);
        uptVar2.j = string2;
        java.lang.String string3 = cursor.getString(11);
        akzxVarM.u();
        defpackage.upt uptVar3 = (defpackage.upt) akzxVarM.b;
        j$.util.Objects.requireNonNull(string3);
        uptVar3.k = string3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Set accVar = new acc(0);
        java.lang.String string4 = cursor.getString(true != z3 ? 12 : 2);
        java.lang.String string5 = cursor.getString(true == z4 ? 2 : 12);
        defpackage.akfx akfxVarAI = ((upu) agab.aH(context, upu.class)).tb().aI();
        akfg akfgVarB = akfg.b(str);
        defpackage.upl uplVar = null;
        java.lang.String str2 = null;
        while (true) {
            java.lang.String string6 = cursor.getString(4);
            if (string6 != null) {
                try {
                    strNormalizeNumber = akfxVarAI.x(akfxVarAI.i(string6, akfgVarB), i2);
                } catch (akfp unused) {
                    strNormalizeNumber = android.telephony.PhoneNumberUtils.normalizeNumber(string6);
                }
                if (accVar.add(strNormalizeNumber)) {
                    akzx akzxVarM2 = defpackage.upl.a.m();
                    akzxVarM2.u();
                    int i4 = i2;
                    defpackage.upl uplVar2 = (defpackage.upl) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string6);
                    str2 = strNormalizeNumber;
                    uplVar2.b |= 1;
                    uplVar2.c = string6;
                    akzxVarM = akzxVarM;
                    long j3 = cursor.getInt(5);
                    akzxVarM2.u();
                    defpackage.upl uplVar3 = (defpackage.upl) akzxVarM2.b;
                    set = accVar;
                    uplVar3.b |= 2;
                    uplVar3.d = j3;
                    j$.util.Optional optionalBU = mni.bU(context.getResources(), cursor.getInt(5), cursor.getString(6));
                    if (i4 == optionalBU.isPresent()) {
                        optionalBU = j$.util.Optional.ofNullable((java.lang.String) optionalBU.get());
                    }
                    java.lang.String str3 = (java.lang.String) optionalBU.orElse("");
                    akzxVarM2.u();
                    defpackage.upl uplVar4 = (defpackage.upl) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(str3);
                    uplVar4.b |= 4;
                    uplVar4.e = str3;
                    defpackage.upk upkVar = defpackage.upk.VOICE;
                    akzxVarM2.u();
                    defpackage.upl uplVar5 = (defpackage.upl) akzxVarM2.b;
                    uplVar5.f = upkVar.a();
                    uplVar5.b |= 8;
                    defpackage.upl uplVar6 = (defpackage.upl) akzxVarM2.p();
                    arrayList.add(uplVar6);
                    if (z2 && cursor.getInt(10) != 0) {
                        uplVar = uplVar6;
                    }
                    if (z) {
                        i = 1;
                        if ((cursor.getInt(9) & 1) == 1) {
                            akzx akzxVarP = uplVar6.p();
                            defpackage.upk upkVar2 = defpackage.upk.IMS_VIDEO;
                            akzxVarP.u();
                            defpackage.upl uplVar7 = (defpackage.upl) akzxVarP.b;
                            uplVar7.f = upkVar2.a();
                            uplVar7.b |= 8;
                            arrayList.add((defpackage.upl) akzxVarP.p());
                        }
                    } else {
                        i = 1;
                    }
                } else {
                    str2 = strNormalizeNumber;
                }
                if (!cursor.moveToNext() || !j$.util.Objects.equals(string, cursor.getString(0))) {
                    break;
                }
                i2 = i;
                akzxVarM = akzxVarM;
                accVar = set;
            }
            set = accVar;
            i = i2;
            if (!cursor.moveToNext()) {
                break;
            }
            break;
            break;
        }
        if (android.text.TextUtils.isEmpty(string4) && !android.text.TextUtils.isEmpty(str2)) {
            string5 = str2;
            string4 = string5;
        }
        if (uplVar != null) {
            akzxVarM.u();
            defpackage.upt uptVar4 = (defpackage.upt) akzxVarM.b;
            j$.util.Objects.requireNonNull(uplVar);
            uptVar4.m = uplVar;
            uptVar4.b |= 4;
        }
        akzxVarM.Q(arrayList);
        akzxVarM.u();
        defpackage.upt uptVar5 = (defpackage.upt) akzxVarM.b;
        j$.util.Objects.requireNonNull(string4);
        uptVar5.e = string4;
        akzxVarM.u();
        defpackage.upt uptVar6 = (defpackage.upt) akzxVarM.b;
        j$.util.Objects.requireNonNull(string5);
        uptVar6.b |= 16;
        uptVar6.o = string5;
        return (defpackage.upt) akzxVarM.p();
    }
}
