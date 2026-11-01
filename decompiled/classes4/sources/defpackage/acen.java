package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class acen implements ahyc {
    private final /* synthetic */ int $cid;

    public acen(ailr ailrVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ailrVar);
    }

    public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        int iCharCount = 0;
        switch (this.$cid) {
            case 0:
                defpackage.akuy akuyVar = (defpackage.akuy) obj;
                akzx akzxVarM = defpackage.akii.a.m();
                if ((akuyVar.b & 1) != 0) {
                    int i = akuyVar.c;
                    akzxVarM.u();
                    defpackage.akii akiiVar = (defpackage.akii) akzxVarM.b;
                    akiiVar.b |= 1;
                    akiiVar.c = i;
                }
                if ((akuyVar.b & 2) != 0) {
                    java.lang.String str = akuyVar.d;
                    akzxVarM.u();
                    defpackage.akii akiiVar2 = (defpackage.akii) akzxVarM.b;
                    j$.util.Objects.requireNonNull(str);
                    akiiVar2.b |= 2;
                    akiiVar2.d = str;
                }
                if ((akuyVar.b & 4) != 0) {
                    java.lang.String str2 = akuyVar.e;
                    akzxVarM.u();
                    defpackage.akii akiiVar3 = (defpackage.akii) akzxVarM.b;
                    j$.util.Objects.requireNonNull(str2);
                    akiiVar3.b |= 4;
                    akiiVar3.e = str2;
                }
                if ((akuyVar.b & 8) != 0) {
                    java.lang.String str3 = akuyVar.f;
                    akzxVarM.u();
                    defpackage.akii akiiVar4 = (defpackage.akii) akzxVarM.b;
                    j$.util.Objects.requireNonNull(str3);
                    akiiVar4.b |= 8;
                    akiiVar4.f = str3;
                }
                return (defpackage.akii) akzxVarM.p();
            case 1:
                return ((xtq) obj).a;
            case 2:
                defpackage.aksl akslVar = (defpackage.aksl) obj;
                akzx akzxVarM2 = defpackage.akip.a.m();
                if ((akslVar.b & 1) != 0) {
                    java.lang.String str4 = akslVar.c;
                    akzxVarM2.u();
                    defpackage.akip akipVar = (defpackage.akip) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(str4);
                    akipVar.b |= 1;
                    akipVar.e = str4;
                }
                akzx akzxVarM3 = defpackage.akjn.a.m();
                int i2 = akslVar.d;
                akzxVarM3.u();
                defpackage.akjn akjnVar = (defpackage.akjn) akzxVarM3.b;
                akjnVar.b |= 1;
                akjnVar.c = i2;
                int i3 = akslVar.e;
                akzxVarM3.u();
                defpackage.akjn akjnVar2 = (defpackage.akjn) akzxVarM3.b;
                akjnVar2.b |= 2;
                akjnVar2.d = i3;
                akzxVarM2.u();
                defpackage.akip akipVar2 = (defpackage.akip) akzxVarM2.b;
                defpackage.akjn akjnVar3 = (defpackage.akjn) akzxVarM3.p();
                j$.util.Objects.requireNonNull(akjnVar3);
                akipVar2.d = akjnVar3;
                akipVar2.c = 2;
                return (defpackage.akip) akzxVarM2.p();
            case 3:
                defpackage.aksm aksmVar = (defpackage.aksm) obj;
                akzx akzxVarM4 = akiq.a.m();
                if ((aksmVar.b & 1) != 0) {
                    int i4 = aksmVar.c;
                    akzxVarM4.u();
                    akiq akiqVar = akzxVarM4.b;
                    akiqVar.b |= 1;
                    akiqVar.c = i4;
                }
                if ((aksmVar.b & 2) != 0) {
                    int i5 = aksmVar.d;
                    akzxVarM4.u();
                    akiq akiqVar2 = akzxVarM4.b;
                    akiqVar2.b |= 2;
                    akiqVar2.d = i5;
                }
                if ((aksmVar.b & 4) != 0) {
                    java.lang.String str5 = aksmVar.e;
                    akzxVarM4.u();
                    akiq akiqVar3 = akzxVarM4.b;
                    j$.util.Objects.requireNonNull(str5);
                    akiqVar3.b |= 4;
                    akiqVar3.e = str5;
                }
                return akzxVarM4.p();
            case 4:
                defpackage.akuj akujVar = (defpackage.akuj) obj;
                akzx akzxVarM5 = defpackage.akji.a.m();
                if ((akujVar.b & 1) != 0) {
                    java.lang.String str6 = akujVar.c;
                    akzxVarM5.u();
                    defpackage.akji akjiVar = (defpackage.akji) akzxVarM5.b;
                    j$.util.Objects.requireNonNull(str6);
                    akjiVar.b |= 1;
                    akjiVar.c = str6;
                }
                if ((akujVar.b & 4) != 0) {
                    akyp akypVar = akujVar.d;
                    if (akypVar == null) {
                        akypVar = akyp.a;
                    }
                    akzxVarM5.u();
                    defpackage.akji akjiVar2 = (defpackage.akji) akzxVarM5.b;
                    j$.util.Objects.requireNonNull(akypVar);
                    akjiVar2.d = akypVar;
                    akjiVar2.b |= 2;
                }
                return (defpackage.akji) akzxVarM5.p();
            case 5:
                defpackage.akuv akuvVar = (defpackage.akuv) obj;
                akzx akzxVarM6 = defpackage.akjj.a.m();
                aksr aksrVarB = aksr.b(akuvVar.c);
                if (aksrVarB == null) {
                    aksrVarB = aksr.a;
                }
                java.lang.String strName = aksrVarB.name();
                akzxVarM6.u();
                defpackage.akjj akjjVar = (defpackage.akjj) akzxVarM6.b;
                j$.util.Objects.requireNonNull(strName);
                akjjVar.b |= 1;
                akjjVar.c = strName;
                if ((akuvVar.b & 2) != 0) {
                    akyp akypVar2 = akuvVar.d;
                    if (akypVar2 == null) {
                        akypVar2 = akyp.a;
                    }
                    akzxVarM6.u();
                    defpackage.akjj akjjVar2 = (defpackage.akjj) akzxVarM6.b;
                    j$.util.Objects.requireNonNull(akypVar2);
                    akjjVar2.d = akypVar2;
                    akjjVar2.b |= 2;
                }
                return (defpackage.akjj) akzxVarM6.p();
            case 6:
                defpackage.aktr aktrVar = (defpackage.aktr) obj;
                akzx akzxVarM7 = defpackage.akkf.b.m();
                if ((aktrVar.c & 1) != 0) {
                    defpackage.ammo ammoVar = aktrVar.d;
                    if (ammoVar == null) {
                        ammoVar = defpackage.ammo.a;
                    }
                    akzxVarM7.u();
                    defpackage.akkf akkfVar = (defpackage.akkf) akzxVarM7.b;
                    j$.util.Objects.requireNonNull(ammoVar);
                    akkfVar.d = ammoVar;
                    akkfVar.c |= 1;
                }
                if ((aktrVar.c & 2) != 0) {
                    defpackage.ammo ammoVar2 = aktrVar.e;
                    if (ammoVar2 == null) {
                        ammoVar2 = defpackage.ammo.a;
                    }
                    akzxVarM7.u();
                    defpackage.akkf akkfVar2 = (defpackage.akkf) akzxVarM7.b;
                    j$.util.Objects.requireNonNull(ammoVar2);
                    akkfVar2.e = ammoVar2;
                    akkfVar2.c |= 2;
                }
                alam alamVar = new alam(aktrVar.f, defpackage.aktr.a);
                akzxVarM7.u();
                defpackage.akkf akkfVar3 = (defpackage.akkf) akzxVarM7.b;
                alak alakVar = akkfVar3.f;
                if (!alakVar.c()) {
                    akkfVar3.f = alad.H(alakVar);
                }
                java.util.Iterator it = alamVar.iterator();
                while (it.hasNext()) {
                    akkfVar3.f.g(((ammm) it.next()).a());
                }
                return (defpackage.akkf) akzxVarM7.p();
            case 7:
                defpackage.akvb akvbVar = (defpackage.akvb) obj;
                int iOrdinal = akvbVar.ordinal();
                if (iOrdinal == 0) {
                    return akgw.a;
                }
                if (iOrdinal == 1) {
                    return akgw.b;
                }
                if (iOrdinal == 2) {
                    return akgw.c;
                }
                if (iOrdinal == 3) {
                    return akgw.d;
                }
                if (iOrdinal == 4) {
                    return akgw.e;
                }
                if (iOrdinal == 5) {
                    return akgw.f;
                }
                throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(akvbVar))));
            case 8:
                defpackage.aktn aktnVar = (defpackage.aktn) obj;
                int iOrdinal2 = aktnVar.ordinal();
                if (iOrdinal2 == 0) {
                    return defpackage.akhb.CONNECTIVITY_UNKNOWN;
                }
                if (iOrdinal2 == 1) {
                    return defpackage.akhb.OFFLINE;
                }
                if (iOrdinal2 == 2) {
                    return defpackage.akhb.ONLINE;
                }
                throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(aktnVar))));
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                defpackage.akuc akucVar = (defpackage.akuc) obj;
                int iOrdinal3 = akucVar.ordinal();
                if (iOrdinal3 == 0) {
                    return defpackage.akjf.BUTTONS_ORDER_UNSPECIFIED;
                }
                if (iOrdinal3 == 1) {
                    return defpackage.akjf.ACTION_BUTTON_PRIMARY;
                }
                if (iOrdinal3 == 2) {
                    return defpackage.akjf.ACK_BUTTON_PRIMARY;
                }
                throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(akucVar))));
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                akuo akuoVar = (akuo) obj;
                int iOrdinal4 = akuoVar.ordinal();
                if (iOrdinal4 == 0) {
                    return defpackage.akjv.UITHEME_DEFAULT;
                }
                if (iOrdinal4 == 1 || iOrdinal4 == 2) {
                    return defpackage.akjv.UITHEME_GOOGLE_MATERIAL;
                }
                throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(akuoVar))));
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
                aizg aizgVarB = aizh.b(charSequence.length());
                while (iCharCount < charSequence.length()) {
                    aizgVarB.b(java.lang.Character.toLowerCase(charSequence.charAt(iCharCount)));
                    iCharCount++;
                }
                return aizgVarB.a();
            case 12:
                java.lang.CharSequence charSequence2 = (java.lang.CharSequence) obj;
                java.lang.String string = charSequence2.toString();
                aizg aizgVarB2 = aizh.b(charSequence2.length());
                while (iCharCount < string.length()) {
                    int iCodePointAt = string.codePointAt(iCharCount);
                    iCharCount += java.lang.Character.charCount(iCodePointAt);
                    aizgVarB2.b(iCodePointAt);
                }
                return aizgVarB2.a();
            case 13:
                java.lang.CharSequence charSequence3 = (java.lang.CharSequence) obj;
                aizg aizgVarB3 = aizh.b(charSequence3.length());
                while (iCharCount < charSequence3.length()) {
                    aizgVarB3.b(charSequence3.charAt(iCharCount));
                    iCharCount++;
                }
                return aizgVarB3.a();
            case 14:
                return java.lang.Long.valueOf(((java.util.concurrent.atomic.AtomicLong) obj).get());
            default:
                aihb aihbVar = new aihb();
                java.util.Iterator it2 = ((java.util.List) obj).iterator();
                while (it2.hasNext()) {
                    aihbVar.k((java.util.Collection) it2.next());
                }
                return aihbVar.h();
        }
    }

    public acen(int i) {
        this.$cid = i;
    }

    public acen(defpackage.ajau ajauVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ajauVar);
    }

    public acen(defpackage.amzt amztVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(amztVar);
    }
}
