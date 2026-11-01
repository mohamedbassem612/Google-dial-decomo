package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
class acez extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akjq akjqVarB;
        defpackage.akjr akjrVar = (defpackage.akjr) obj;
        akzx akzxVarM = defpackage.akvj.a.m();
        if ((akjrVar.b & 1) != 0) {
            java.lang.String str = akjrVar.e;
            akzxVarM.u();
            defpackage.akvj akvjVar = (defpackage.akvj) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            akvjVar.b |= 1;
            akvjVar.e = str;
        }
        int i = akjrVar.c;
        if (i == 2 && defpackage.akky.b(2) == 1) {
            java.lang.String str2 = i == 2 ? (java.lang.String) akjrVar.d : "";
            akzxVarM.u();
            defpackage.akvj akvjVar2 = (defpackage.akvj) akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            akvjVar2.c = 2;
            akvjVar2.d = str2;
        }
        int i2 = akjrVar.c;
        if (i2 == 4 && defpackage.akky.b(4) == 2) {
            int iIntValue = i2 == 4 ? ((java.lang.Integer) akjrVar.d).intValue() : 0;
            akzxVarM.u();
            defpackage.akvj akvjVar3 = (defpackage.akvj) akzxVarM.b;
            akvjVar3.c = 4;
            akvjVar3.d = java.lang.Integer.valueOf(iIntValue);
        }
        int i3 = akjrVar.c;
        if (i3 == 5 && defpackage.akky.b(5) == 3) {
            boolean zBooleanValue = i3 == 5 ? ((java.lang.Boolean) akjrVar.d).booleanValue() : false;
            akzxVarM.u();
            defpackage.akvj akvjVar4 = (defpackage.akvj) akzxVarM.b;
            akvjVar4.c = 5;
            akvjVar4.d = java.lang.Boolean.valueOf(zBooleanValue);
        }
        if (akjrVar.c == 3 && defpackage.akky.b(3) == 4) {
            ahxq ahxqVarE = defpackage.acgd.a.e();
            if (akjrVar.c != 3 || (akjqVarB = defpackage.akjq.b(((java.lang.Integer) akjrVar.d).intValue())) == null) {
                akjqVarB = defpackage.akjq.CLIENT_VALUE_UNKNOWN;
            }
            defpackage.akvi akviVar = (defpackage.akvi) ahxqVarE.d(akjqVarB);
            akzxVarM.u();
            defpackage.akvj akvjVar5 = (defpackage.akvj) akzxVarM.b;
            akvjVar5.d = java.lang.Integer.valueOf(akviVar.c);
            akvjVar5.c = 3;
        }
        return (defpackage.akvj) akzxVarM.p();
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        defpackage.akvi akviVarB;
        defpackage.akvj akvjVar = (defpackage.akvj) obj;
        akzx akzxVarM = defpackage.akjr.a.m();
        if ((akvjVar.b & 1) != 0) {
            java.lang.String str = akvjVar.e;
            akzxVarM.u();
            defpackage.akjr akjrVar = (defpackage.akjr) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            akjrVar.b |= 1;
            akjrVar.e = str;
        }
        int i = akvjVar.c;
        if (i == 2 && a.e(2) == 3) {
            java.lang.String str2 = i == 2 ? (java.lang.String) akvjVar.d : "";
            akzxVarM.u();
            defpackage.akjr akjrVar2 = (defpackage.akjr) akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            akjrVar2.c = 2;
            akjrVar2.d = str2;
        }
        int i2 = akvjVar.c;
        if (i2 == 4 && a.e(4) == 5) {
            int iIntValue = i2 == 4 ? ((java.lang.Integer) akvjVar.d).intValue() : 0;
            akzxVarM.u();
            defpackage.akjr akjrVar3 = (defpackage.akjr) akzxVarM.b;
            akjrVar3.c = 4;
            akjrVar3.d = java.lang.Integer.valueOf(iIntValue);
        }
        int i3 = akvjVar.c;
        if (i3 == 5 && a.e(5) == 6) {
            boolean zBooleanValue = i3 == 5 ? ((java.lang.Boolean) akvjVar.d).booleanValue() : false;
            akzxVarM.u();
            defpackage.akjr akjrVar4 = (defpackage.akjr) akzxVarM.b;
            akjrVar4.c = 5;
            akjrVar4.d = java.lang.Boolean.valueOf(zBooleanValue);
        }
        int i4 = akvjVar.c;
        if (i4 == 3 && a.e(3) == 4) {
            ahxq ahxqVar = defpackage.acgd.a;
            if (i4 != 3 || (akviVarB = defpackage.akvi.b(((java.lang.Integer) akvjVar.d).intValue())) == null) {
                akviVarB = defpackage.akvi.CLIENT_VALUE_UNKNOWN;
            }
            defpackage.akjq akjqVar = (defpackage.akjq) ahxqVar.d(akviVarB);
            akzxVarM.u();
            defpackage.akjr akjrVar5 = (defpackage.akjr) akzxVarM.b;
            akjrVar5.d = java.lang.Integer.valueOf(akjqVar.c);
            akjrVar5.c = 3;
        }
        return (defpackage.akjr) akzxVarM.p();
    }
}
