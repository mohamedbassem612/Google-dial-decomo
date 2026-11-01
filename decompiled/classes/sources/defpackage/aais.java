package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aais {
    public aais(defpackage.ahhp ahhpVar) {
        if (ahhpVar == null) {
            defpackage.aooh.i("imageManager");
        }
    }

    public static void A(android.os.Parcel parcel, int i, java.lang.String str) {
        if (str != null) {
            int iF = f(parcel, i);
            parcel.writeString(str);
            g(parcel, iF);
        }
    }

    public static void B(android.os.Parcel parcel, int i, java.lang.String[] strArr) {
        if (strArr != null) {
            int iF = f(parcel, i);
            parcel.writeStringArray(strArr);
            g(parcel, iF);
        }
    }

    public static void C(android.os.Parcel parcel, int i, java.util.List list) {
        if (list != null) {
            int iF = f(parcel, i);
            parcel.writeStringList(list);
            g(parcel, iF);
        }
    }

    public static void D(android.os.Parcel parcel, int i, android.os.Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            int iF = f(parcel, i);
            parcel.writeInt(parcelableArr.length);
            for (android.os.Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    n(parcel, parcelable, i2);
                }
            }
            g(parcel, iF);
        }
    }

    public static void E(android.os.Parcel parcel, int i, java.util.List list) {
        if (list != null) {
            int iF = f(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                android.os.Parcelable parcelable = (android.os.Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    n(parcel, parcelable, 0);
                }
            }
            g(parcel, iF);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static byte F(android.os.Parcel parcel, int i) throws aahs {
        Z(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static double G(android.os.Parcel parcel, int i) throws aahs {
        Z(parcel, i, 8);
        return parcel.readDouble();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static float H(android.os.Parcel parcel, int i) throws aahs {
        Z(parcel, i, 4);
        return parcel.readFloat();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static int I(android.os.Parcel parcel, int i) throws aahs {
        Z(parcel, i, 4);
        return parcel.readInt();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static int J(android.os.Parcel parcel, int i) throws aahs {
        int i2 = (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
        if (i2 < 0 || parcel.dataPosition() + i2 > parcel.dataSize()) {
            throw new aahs(defpackage.a.bj(i2, "Invalid field size: "), parcel);
        }
        return i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static int K(android.os.Parcel parcel) throws aahs {
        int i = parcel.readInt();
        int iJ = J(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new aahs("Expected object header. Got 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(i))), parcel);
        }
        int i2 = iJ + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new aahs(defpackage.a.bf(i2, iDataPosition, "Size read is invalid start=", " end="), parcel);
        }
        return i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static long L(android.os.Parcel parcel, int i) throws aahs {
        Z(parcel, i, 8);
        return parcel.readLong();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static android.os.Bundle M(android.os.Parcel parcel, int i) throws aahs {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        android.os.Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iJ);
        return bundle;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static android.os.IBinder N(android.os.Parcel parcel, int i) throws aahs {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iJ);
        return strongBinder;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static android.os.Parcelable O(android.os.Parcel parcel, int i, android.os.Parcelable.Creator creator) throws aahs {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        android.os.Parcelable parcelable = (android.os.Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iJ);
        return parcelable;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static java.lang.Boolean P(android.os.Parcel parcel, int i) throws aahs {
        int iJ = J(parcel, i);
        if (iJ == 0) {
            return null;
        }
        aN(parcel, iJ, 4);
        return java.lang.Boolean.valueOf(parcel.readInt() != 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static java.lang.Double Q(android.os.Parcel parcel, int i) throws aahs {
        int iJ = J(parcel, i);
        if (iJ == 0) {
            return null;
        }
        aN(parcel, iJ, 8);
        return java.lang.Double.valueOf(parcel.readDouble());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static java.lang.Float R(android.os.Parcel parcel, int i) throws aahs {
        int iJ = J(parcel, i);
        if (iJ == 0) {
            return null;
        }
        aN(parcel, iJ, 4);
        return java.lang.Float.valueOf(parcel.readFloat());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static java.lang.Integer S(android.os.Parcel parcel, int i) throws aahs {
        int iJ = J(parcel, i);
        if (iJ == 0) {
            return null;
        }
        aN(parcel, iJ, 4);
        return java.lang.Integer.valueOf(parcel.readInt());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static java.lang.Long T(android.os.Parcel parcel, int i) throws aahs {
        int iJ = J(parcel, i);
        if (iJ == 0) {
            return null;
        }
        aN(parcel, iJ, 8);
        return java.lang.Long.valueOf(parcel.readLong());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static java.lang.String U(android.os.Parcel parcel, int i) throws aahs {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        java.lang.String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iJ);
        return string;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static java.util.ArrayList V(android.os.Parcel parcel, int i) throws aahs {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(java.lang.Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(iDataPosition + iJ);
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static java.util.ArrayList W(android.os.Parcel parcel, int i) throws aahs {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iJ);
        return arrayListCreateStringArrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static java.util.ArrayList X(android.os.Parcel parcel, int i, android.os.Parcelable.Creator creator) throws aahs {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iJ);
        return arrayListCreateTypedArrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static void Y(android.os.Parcel parcel, int i) throws aahs {
        if (parcel.dataPosition() != i) {
            throw new aahs(defpackage.a.bj(i, "Overread allowed size end="), parcel);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static void Z(android.os.Parcel parcel, int i, int i2) throws aahs {
        int iJ = J(parcel, i);
        if (iJ == i2) {
            return;
        }
        throw new aahs("Expected size " + i2 + " got " + iJ + " (0x" + java.lang.Integer.toHexString(iJ) + ')', parcel);
    }

    public static java.lang.String aA(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return defpackage.a.bj(i, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
            case 23:
                return "RATE_LIMIT_EXCEEDED";
        }
    }

    public static com.google.android.gms.common.api.ApiMetadata aB(com.google.android.gms.common.api.ComplianceOptions complianceOptions, boolean z, com.google.android.gms.common.api.SourceUserContext sourceUserContext, boolean z2) {
        com.google.android.gms.common.api.ApiMetadata apiMetadata = new com.google.android.gms.common.api.ApiMetadata(complianceOptions, z, sourceUserContext);
        apiMetadata.e = z2;
        return apiMetadata;
    }

    public static java.lang.String aC(java.lang.String str) {
        if (android.util.Log.isLoggable("Dialer", 3)) {
            return str;
        }
        if (str == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        for (char c : str.toCharArray()) {
            if (!android.util.Log.isLoggable("Dialer", 3) && android.telephony.PhoneNumberUtils.is12Key(c)) {
                c = '*';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static java.lang.String aD(java.lang.Object obj) {
        if (obj == null) {
            return "null";
        }
        if (android.util.Log.isLoggable("Dialer", 3)) {
            return obj.toString();
        }
        return "Redacted-" + obj.toString().length() + "-chars";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.mhc aE(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        java.lang.String strFlattenToString;
        defpackage.kaw kawVarAQ = defpackage.gus.aQ(defpackage.mhc.a.m());
        java.lang.String str = "null";
        if (phoneAccountHandle != null) {
            android.content.ComponentName componentName = phoneAccountHandle.getComponentName();
            java.lang.String id = phoneAccountHandle.getId();
            if (componentName == null || (strFlattenToString = componentName.flattenToString()) == null) {
                strFlattenToString = "null";
            }
            str = "[" + strFlattenToString + " : [PII]" + (id != null ? java.lang.Integer.valueOf(id.hashCode()) : "null") + ']';
        }
        kawVarAQ.N(str);
        return kawVarAQ.L();
    }

    public static defpackage.mhc aF(android.telephony.SubscriptionInfo subscriptionInfo) {
        java.lang.String string;
        defpackage.kaw kawVarAQ = defpackage.gus.aQ(defpackage.mhc.a.m());
        if (subscriptionInfo == null) {
            string = "null";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append("countryIso=".concat(java.lang.String.valueOf(subscriptionInfo.getCountryIso())));
            java.lang.CharSequence carrierName = subscriptionInfo.getCarrierName();
            java.util.Objects.toString(carrierName);
            sb.append(", carrierName=".concat(java.lang.String.valueOf(carrierName)));
            sb.append(", dataRoaming=" + subscriptionInfo.getDataRoaming());
            sb.append(", iconTint=" + subscriptionInfo.getIconTint());
            sb.append(", simSlotIndex=" + subscriptionInfo.getSimSlotIndex());
            sb.append(", subscriptionId=" + subscriptionInfo.getSubscriptionId());
            sb.append(", carrierId=" + da$.ExternalSyntheticApiModelOutline0.m(subscriptionInfo));
            sb.append(", mccString=".concat(java.lang.String.valueOf(da$.ExternalSyntheticApiModelOutline0.m(subscriptionInfo))));
            sb.append(", mncString=".concat(java.lang.String.valueOf(da$.ExternalSyntheticApiModelOutline0.m$1(subscriptionInfo))));
            sb.append(", subscriptionType=" + da$.ExternalSyntheticApiModelOutline0.m$1(subscriptionInfo));
            sb.append(", isEmbedded=" + ft$.ExternalSyntheticApiModelOutline0.m(subscriptionInfo));
            sb.append(", isOpportunistic=" + da$.ExternalSyntheticApiModelOutline0.m(subscriptionInfo));
            sb.append(']');
            string = sb.toString();
        }
        kawVarAQ.N(string);
        return kawVarAQ.L();
    }

    public static defpackage.mhc aG(java.lang.String str) {
        if (str == null) {
            defpackage.kaw kawVarAQ = defpackage.gus.aQ(defpackage.mhc.a.m());
            kawVarAQ.N("");
            return kawVarAQ.L();
        }
        defpackage.kaw kawVarAQ2 = defpackage.gus.aQ(defpackage.mhc.a.m());
        kawVarAQ2.N(str);
        return kawVarAQ2.L();
    }

    public static java.lang.String aH(java.lang.String str) {
        java.lang.String strValueOf;
        return (str == null || (strValueOf = java.lang.String.valueOf(str.hashCode())) == null) ? "Default" : strValueOf;
    }

    public static defpackage.aaif aI(java.lang.String str, int i) {
        return new defpackage.aaif(new defpackage.aenj(str), i, new defpackage.vkl(15));
    }

    public static defpackage.ajni aJ(defpackage.aonj aonjVar) {
        defpackage.ajni ajniVar = new defpackage.ajni(null);
        aonjVar.a(ajniVar);
        return ajniVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0129  */
    /* JADX WARN: Code duplicated, block: B:104:0x012f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0132  */
    /* JADX WARN: Code duplicated, block: B:109:0x013a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0141  */
    /* JADX WARN: Code duplicated, block: B:112:0x0144  */
    /* JADX WARN: Code duplicated, block: B:116:0x014c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0153  */
    /* JADX WARN: Code duplicated, block: B:119:0x0156  */
    /* JADX WARN: Code duplicated, block: B:123:0x015e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0165  */
    /* JADX WARN: Code duplicated, block: B:126:0x0168  */
    /* JADX WARN: Code duplicated, block: B:130:0x0170  */
    /* JADX WARN: Code duplicated, block: B:132:0x0177  */
    /* JADX WARN: Code duplicated, block: B:133:0x0179  */
    /* JADX WARN: Code duplicated, block: B:135:0x017d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0183  */
    /* JADX WARN: Code duplicated, block: B:140:0x0188  */
    /* JADX WARN: Code duplicated, block: B:142:0x018c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0199  */
    /* JADX WARN: Code duplicated, block: B:148:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:152:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:155:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:157:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:161:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:164:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:166:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:170:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:173:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:175:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:177:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:181:0x020e  */
    /* JADX WARN: Code duplicated, block: B:184:0x0219  */
    /* JADX WARN: Code duplicated, block: B:187:0x0222  */
    /* JADX WARN: Code duplicated, block: B:189:0x0231  */
    /* JADX WARN: Code duplicated, block: B:190:0x0233  */
    /* JADX WARN: Code duplicated, block: B:192:0x0237  */
    /* JADX WARN: Code duplicated, block: B:194:0x0244  */
    /* JADX WARN: Code duplicated, block: B:196:0x0251  */
    /* JADX WARN: Code duplicated, block: B:198:0x0257  */
    /* JADX WARN: Code duplicated, block: B:200:0x0264  */
    /* JADX WARN: Code duplicated, block: B:202:0x0272  */
    /* JADX WARN: Code duplicated, block: B:205:0x027d  */
    /* JADX WARN: Code duplicated, block: B:207:0x0281  */
    /* JADX WARN: Code duplicated, block: B:209:0x0290  */
    /* JADX WARN: Code duplicated, block: B:211:0x0294  */
    /* JADX WARN: Code duplicated, block: B:212:0x029a  */
    /* JADX WARN: Code duplicated, block: B:214:0x029e  */
    /* JADX WARN: Code duplicated, block: B:217:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:219:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:221:0x02df  */
    /* JADX WARN: Code duplicated, block: B:223:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:225:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:227:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:228:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:230:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:231:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:233:0x0308  */
    /* JADX WARN: Code duplicated, block: B:235:0x030d  */
    /* JADX WARN: Code duplicated, block: B:236:0x0311  */
    /* JADX WARN: Code duplicated, block: B:238:0x0319  */
    /* JADX WARN: Code duplicated, block: B:240:0x031d  */
    /* JADX WARN: Code duplicated, block: B:241:0x0322  */
    /* JADX WARN: Code duplicated, block: B:246:0x037f  */
    /* JADX WARN: Code duplicated, block: B:247:0x0398  */
    /* JADX WARN: Code duplicated, block: B:251:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:254:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x010b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x011e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0121  */
    public static void aK(defpackage.ttj ttjVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, defpackage.aomy aomyVar, defpackage.aomy aomyVar2, defpackage.aonj aonjVar, defpackage.aonj aonjVar2, defpackage.aomy aomyVar3, defpackage.aomy aomyVar4, defpackage.aonn aonnVar, defpackage.aomy aomyVar5, defpackage.aomy aomyVar6, defpackage.aomy aomyVar7, defpackage.cav cavVar, int i, int i2, int i3) {
        int i4;
        int i5;
        boolean z6;
        int i6;
        int i7;
        boolean z7;
        boolean z8;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z9;
        defpackage.cav cavVar2;
        boolean z10;
        boolean z11;
        defpackage.aomy aomyVar8;
        defpackage.aomy aomyVar9;
        defpackage.aomy aomyVar10;
        boolean z12;
        boolean z13;
        boolean z14;
        defpackage.cdk cdkVarI;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        defpackage.aomy aomyVar11;
        defpackage.aomy aomyVar12;
        defpackage.aomy aomyVar13;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        defpackage.aais uoxVar;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        umy umyVar;
        unf unfVar;
        java.lang.Integer num;
        java.lang.String str;
        int i18;
        int i19;
        int iValueOf;
        int i20;
        defpackage.cbt cbtVar;
        java.lang.Object objR;
        defpackage.cbt cbtVar2;
        java.lang.Object objR2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        if (ttjVar == null) {
            defpackage.aooh.i("model");
        }
        if (aomyVar == null) {
            defpackage.aooh.i("onAddFavoriteClicked");
        }
        if (aomyVar2 == null) {
            defpackage.aooh.i("onAddPermissionsClicked");
        }
        if (aonjVar == null) {
            defpackage.aooh.i("onContactClicked");
        }
        if (aonjVar2 == null) {
            defpackage.aooh.i("onUnstarContact");
        }
        if (aomyVar3 == null) {
            defpackage.aooh.i("onToggleHideContacts");
        }
        if (aonnVar == null) {
            defpackage.aooh.i("onMove");
        }
        if (aomyVar5 == null) {
            defpackage.aooh.i("onDrop");
        }
        defpackage.cav cavVarB = cavVar.b(409657104);
        if ((i & 6) == 0) {
            i4 = (true != cavVarB.D(ttjVar) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        int i26 = i3 & 2;
        boolean z24 = i26 == 0;
        if (i26 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= true != cavVarB.C(z) ? 16 : 32;
        }
        int i27 = i3 & 4;
        boolean z25 = i27 == 0;
        if (i27 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= true != cavVarB.C(z2) ? 128 : 256;
        }
        int i28 = i3 & 8;
        boolean z26 = i28 == 0;
        if (i28 == 0) {
            if ((i & 3072) == 0) {
                i4 |= true != cavVarB.C(z3) ? 1024 : 2048;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    if (true != cavVarB.C(z4)) {
                        i6 = 8192;
                    } else {
                        i6 = 16384;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (i7 != 0) {
                    if ((i & 196608) == 0) {
                        z8 = true;
                        if (true != cavVarB.C(z5)) {
                            i8 = 65536;
                        } else {
                            i8 = 131072;
                        }
                        i4 |= i8;
                    }
                    if ((1572864 & i) == 0) {
                        if (z8 != cavVarB.D(aomyVar)) {
                            i25 = 524288;
                        } else {
                            i25 = 1048576;
                        }
                        i4 |= i25;
                    }
                    if ((12582912 & i) == 0) {
                        if (true != cavVarB.D(aomyVar2)) {
                            i24 = 4194304;
                        } else {
                            i24 = 8388608;
                        }
                        i4 |= i24;
                    }
                    if ((100663296 & i) == 0) {
                        if (true != cavVarB.D(aonjVar)) {
                            i23 = 33554432;
                        } else {
                            i23 = 67108864;
                        }
                        i4 |= i23;
                    }
                    if ((805306368 & i) == 0) {
                        if (true != cavVarB.D(aonjVar2)) {
                            i22 = 268435456;
                        } else {
                            i22 = 536870912;
                        }
                        i4 |= i22;
                    }
                    i9 = i4;
                    if ((i2 & 6) == 0) {
                        if (true != cavVarB.D(aomyVar3)) {
                            i21 = 2;
                        } else {
                            i21 = 4;
                        }
                        i10 = i2 | i21;
                    } else {
                        i10 = i2;
                    }
                    i11 = i3 & 2048;
                    if (i11 != 0) {
                        if ((i2 & 48) == 0) {
                            i10 |= true == cavVarB.D(aomyVar4) ? 32 : 16;
                        }
                        i12 = i10;
                        if ((i2 & 384) == 0) {
                            i13 = i12 | (true == cavVarB.D(aonnVar) ? 256 : 128);
                        } else {
                            i13 = i12;
                        }
                        if ((i2 & 3072) == 0) {
                            i13 |= true == cavVarB.D(aomyVar5) ? 2048 : 1024;
                        }
                        i14 = i3 & 16384;
                        if (i14 != 0) {
                            i13 |= 24576;
                            i15 = i14;
                        } else {
                            i15 = i14;
                            if ((i2 & 24576) == 0) {
                                i13 |= true == cavVarB.D(aomyVar6) ? 16384 : 8192;
                            }
                        }
                        i16 = 32768 & i3;
                        if (i16 != 0) {
                            if ((i2 & 196608) == 0) {
                                i13 |= true == cavVarB.D(aomyVar7) ? 131072 : 65536;
                            }
                            i17 = i13;
                            if ((i9 & 306783379) == 306783378 || (74899 & i17) != 74898) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (cavVarB.H(z9, i9 & 1)) {
                                z15 = (!z24) | z;
                                z16 = z25 & z2;
                                z17 = z26 & z3;
                                z18 = z6 & z4;
                                z19 = z7 & z5;
                                if (i11 != 0) {
                                    aomyVar11 = null;
                                } else {
                                    aomyVar11 = aomyVar4;
                                }
                                if (i15 != 0) {
                                    cbtVar2 = (defpackage.cbt) cavVarB;
                                    objR2 = cbtVar2.R();
                                    if (objR2 == defpackage.cau.a) {
                                        objR2 = new defpackage.uoq(0);
                                        cbtVar2.ab(objR2);
                                    }
                                    aomyVar12 = (defpackage.aomy) objR2;
                                } else {
                                    aomyVar12 = aomyVar6;
                                }
                                if (i16 != 0) {
                                    cbtVar = (defpackage.cbt) cavVarB;
                                    objR = cbtVar.R();
                                    if (objR == defpackage.cau.a) {
                                        objR = new defpackage.uoq(2);
                                        cbtVar.ab(objR);
                                    }
                                    aomyVar13 = (defpackage.aomy) objR;
                                } else {
                                    aomyVar13 = aomyVar7;
                                }
                                j$.util.Objects.checkIndex(0, 4);
                                if (ttjVar != null) {
                                    if (ttjVar instanceof defpackage.und) {
                                        uoxVar = new defpackage.uoy(aomyVar);
                                    } else {
                                        if (ttjVar instanceof une) {
                                            uoxVar = new uoz(aomyVar2);
                                        } else if (ttjVar instanceof defpackage.unc) {
                                            defpackage.unc uncVar = (defpackage.unc) ttjVar;
                                            java.util.List list = uncVar.a;
                                            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
                                            it = list.iterator();
                                            while (it.hasNext()) {
                                                umyVar = (umy) it.next();
                                                java.util.Iterator it2 = it;
                                                boolean z27 = z19;
                                                long j = umyVar.c;
                                                long j2 = umyVar.a;
                                                java.lang.String str2 = umyVar.e;
                                                android.net.Uri uri = umyVar.f;
                                                unfVar = umyVar.g;
                                                if (unfVar != null) {
                                                    i18 = unfVar.e - 1;
                                                    if (i18 != 2) {
                                                        if (true != umyVar.j) {
                                                            i19 = 2131231080;
                                                        } else {
                                                            i19 = 2131231081;
                                                        }
                                                        iValueOf = java.lang.Integer.valueOf(i19);
                                                    } else if (i18 != 3) {
                                                        iValueOf = 2131231080;
                                                    } else if (i18 != 4) {
                                                        if (true != umyVar.i) {
                                                            i20 = 2131231060;
                                                        } else {
                                                            i20 = 2131231083;
                                                        }
                                                        iValueOf = java.lang.Integer.valueOf(i20);
                                                    } else {
                                                        iValueOf = 2131231991;
                                                    }
                                                    num = iValueOf;
                                                } else {
                                                    num = null;
                                                }
                                                if (unfVar != null) {
                                                    str = unfVar.c;
                                                } else {
                                                    str = null;
                                                }
                                                arrayList.add(new uov(j, j2, str2, uri, num, str, new lpg(str2, umyVar.b)));
                                                z19 = z27;
                                                it = it2;
                                            }
                                            boolean z28 = z19;
                                            z20 = false;
                                            uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar.b, z16, z17, z18, z28, aomyVar3, aomyVar11);
                                            z21 = z18;
                                            z22 = z28;
                                            z23 = z17;
                                        }
                                        cavVar2 = cavVarB;
                                        defpackage.aomy aomyVar14 = aomyVar13;
                                        defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar14, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                        if (ttjVar instanceof defpackage.unc) {
                                            cavVar2.u(2094189670);
                                            defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                            ((defpackage.cbt) cavVar2).W(z20);
                                        } else {
                                            cavVar2.u(2094324210);
                                            ((defpackage.cbt) cavVar2).W(z20);
                                        }
                                        aomyVar10 = aomyVar14;
                                        z13 = z21;
                                        aomyVar8 = aomyVar11;
                                        aomyVar9 = aomyVar12;
                                        z10 = z15;
                                        z11 = z16;
                                        z14 = z23;
                                        z12 = z22;
                                    }
                                    z23 = z17;
                                    z21 = z18;
                                    z20 = false;
                                    z22 = z19;
                                    cavVar2 = cavVarB;
                                    defpackage.aomy aomyVar15 = aomyVar13;
                                    defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar15, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                    if (ttjVar instanceof defpackage.unc) {
                                        cavVar2.u(2094189670);
                                        defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                        ((defpackage.cbt) cavVar2).W(z20);
                                    } else {
                                        cavVar2.u(2094324210);
                                        ((defpackage.cbt) cavVar2).W(z20);
                                    }
                                    aomyVar10 = aomyVar15;
                                    z13 = z21;
                                    aomyVar8 = aomyVar11;
                                    aomyVar9 = aomyVar12;
                                    z10 = z15;
                                    z11 = z16;
                                    z14 = z23;
                                    z12 = z22;
                                }
                                throw new defpackage.aois();
                            }
                            cavVar2 = cavVarB;
                            cavVar2.s();
                            z10 = z;
                            z11 = z2;
                            aomyVar8 = aomyVar4;
                            aomyVar9 = aomyVar6;
                            aomyVar10 = aomyVar7;
                            z12 = z5;
                            z13 = z4;
                            z14 = z3;
                            cdkVarI = cavVar2.I();
                            if (cdkVarI != null) {
                                cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                            }
                        }
                        i13 |= 196608;
                        i17 = i13;
                        if ((i9 & 306783379) == 306783378) {
                            z9 = true;
                        } else {
                            z9 = true;
                        }
                        if (cavVarB.H(z9, i9 & 1)) {
                            z15 = (!z24) | z;
                            z16 = z25 & z2;
                            z17 = z26 & z3;
                            z18 = z6 & z4;
                            z19 = z7 & z5;
                            if (i11 != 0) {
                                aomyVar11 = null;
                            } else {
                                aomyVar11 = aomyVar4;
                            }
                            if (i15 != 0) {
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR2 = cbtVar2.R();
                                if (objR2 == defpackage.cau.a) {
                                    objR2 = new defpackage.uoq(0);
                                    cbtVar2.ab(objR2);
                                }
                                aomyVar12 = (defpackage.aomy) objR2;
                            } else {
                                aomyVar12 = aomyVar6;
                            }
                            if (i16 != 0) {
                                cbtVar = (defpackage.cbt) cavVarB;
                                objR = cbtVar.R();
                                if (objR == defpackage.cau.a) {
                                    objR = new defpackage.uoq(2);
                                    cbtVar.ab(objR);
                                }
                                aomyVar13 = (defpackage.aomy) objR;
                            } else {
                                aomyVar13 = aomyVar7;
                            }
                            j$.util.Objects.checkIndex(0, 4);
                            if (ttjVar != null) {
                                if (ttjVar instanceof defpackage.und) {
                                    uoxVar = new defpackage.uoy(aomyVar);
                                } else {
                                    if (ttjVar instanceof une) {
                                        uoxVar = new uoz(aomyVar2);
                                    } else if (ttjVar instanceof defpackage.unc) {
                                        defpackage.unc uncVar2 = (defpackage.unc) ttjVar;
                                        java.util.List list2 = uncVar2.a;
                                        arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list2, 10));
                                        it = list2.iterator();
                                        while (it.hasNext()) {
                                            umyVar = (umy) it.next();
                                            java.util.Iterator it3 = it;
                                            boolean z29 = z19;
                                            long j3 = umyVar.c;
                                            long j4 = umyVar.a;
                                            java.lang.String str3 = umyVar.e;
                                            android.net.Uri uri2 = umyVar.f;
                                            unfVar = umyVar.g;
                                            if (unfVar != null) {
                                                i18 = unfVar.e - 1;
                                                if (i18 != 2) {
                                                    if (true != umyVar.j) {
                                                        i19 = 2131231080;
                                                    } else {
                                                        i19 = 2131231081;
                                                    }
                                                    iValueOf = java.lang.Integer.valueOf(i19);
                                                } else if (i18 != 3) {
                                                    iValueOf = 2131231080;
                                                } else if (i18 != 4) {
                                                    if (true != umyVar.i) {
                                                        i20 = 2131231060;
                                                    } else {
                                                        i20 = 2131231083;
                                                    }
                                                    iValueOf = java.lang.Integer.valueOf(i20);
                                                } else {
                                                    iValueOf = 2131231991;
                                                }
                                                num = iValueOf;
                                            } else {
                                                num = null;
                                            }
                                            if (unfVar != null) {
                                                str = unfVar.c;
                                            } else {
                                                str = null;
                                            }
                                            arrayList.add(new uov(j3, j4, str3, uri2, num, str, new lpg(str3, umyVar.b)));
                                            z19 = z29;
                                            it = it3;
                                        }
                                        boolean z210 = z19;
                                        z20 = false;
                                        uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar2.b, z16, z17, z18, z210, aomyVar3, aomyVar11);
                                        z21 = z18;
                                        z22 = z210;
                                        z23 = z17;
                                    }
                                    cavVar2 = cavVarB;
                                    defpackage.aomy aomyVar16 = aomyVar13;
                                    defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar16, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                    if (ttjVar instanceof defpackage.unc) {
                                        cavVar2.u(2094189670);
                                        defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                        ((defpackage.cbt) cavVar2).W(z20);
                                    } else {
                                        cavVar2.u(2094324210);
                                        ((defpackage.cbt) cavVar2).W(z20);
                                    }
                                    aomyVar10 = aomyVar16;
                                    z13 = z21;
                                    aomyVar8 = aomyVar11;
                                    aomyVar9 = aomyVar12;
                                    z10 = z15;
                                    z11 = z16;
                                    z14 = z23;
                                    z12 = z22;
                                }
                                z23 = z17;
                                z21 = z18;
                                z20 = false;
                                z22 = z19;
                                cavVar2 = cavVarB;
                                defpackage.aomy aomyVar17 = aomyVar13;
                                defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar17, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                if (ttjVar instanceof defpackage.unc) {
                                    cavVar2.u(2094189670);
                                    defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                } else {
                                    cavVar2.u(2094324210);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                }
                                aomyVar10 = aomyVar17;
                                z13 = z21;
                                aomyVar8 = aomyVar11;
                                aomyVar9 = aomyVar12;
                                z10 = z15;
                                z11 = z16;
                                z14 = z23;
                                z12 = z22;
                            }
                            throw new defpackage.aois();
                        }
                        cavVar2 = cavVarB;
                        cavVar2.s();
                        z10 = z;
                        z11 = z2;
                        aomyVar8 = aomyVar4;
                        aomyVar9 = aomyVar6;
                        aomyVar10 = aomyVar7;
                        z12 = z5;
                        z13 = z4;
                        z14 = z3;
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                        }
                    }
                    i10 |= 48;
                    i12 = i10;
                    if ((i2 & 384) == 0) {
                        i13 = i12 | (true == cavVarB.D(aonnVar) ? 256 : 128);
                    } else {
                        i13 = i12;
                    }
                    if ((i2 & 3072) == 0) {
                        i13 |= true == cavVarB.D(aomyVar5) ? 2048 : 1024;
                    }
                    i14 = i3 & 16384;
                    if (i14 != 0) {
                        i13 |= 24576;
                        i15 = i14;
                    } else {
                        i15 = i14;
                        if ((i2 & 24576) == 0) {
                            i13 |= true == cavVarB.D(aomyVar6) ? 16384 : 8192;
                        }
                    }
                    i16 = 32768 & i3;
                    if (i16 != 0) {
                        if ((i2 & 196608) == 0) {
                            i13 |= true == cavVarB.D(aomyVar7) ? 131072 : 65536;
                        }
                        i17 = i13;
                        if ((i9 & 306783379) == 306783378) {
                            z9 = true;
                        } else {
                            z9 = true;
                        }
                        if (cavVarB.H(z9, i9 & 1)) {
                            z15 = (!z24) | z;
                            z16 = z25 & z2;
                            z17 = z26 & z3;
                            z18 = z6 & z4;
                            z19 = z7 & z5;
                            if (i11 != 0) {
                                aomyVar11 = null;
                            } else {
                                aomyVar11 = aomyVar4;
                            }
                            if (i15 != 0) {
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR2 = cbtVar2.R();
                                if (objR2 == defpackage.cau.a) {
                                    objR2 = new defpackage.uoq(0);
                                    cbtVar2.ab(objR2);
                                }
                                aomyVar12 = (defpackage.aomy) objR2;
                            } else {
                                aomyVar12 = aomyVar6;
                            }
                            if (i16 != 0) {
                                cbtVar = (defpackage.cbt) cavVarB;
                                objR = cbtVar.R();
                                if (objR == defpackage.cau.a) {
                                    objR = new defpackage.uoq(2);
                                    cbtVar.ab(objR);
                                }
                                aomyVar13 = (defpackage.aomy) objR;
                            } else {
                                aomyVar13 = aomyVar7;
                            }
                            j$.util.Objects.checkIndex(0, 4);
                            if (ttjVar != null) {
                                if (ttjVar instanceof defpackage.und) {
                                    uoxVar = new defpackage.uoy(aomyVar);
                                } else {
                                    if (ttjVar instanceof une) {
                                        uoxVar = new uoz(aomyVar2);
                                    } else if (ttjVar instanceof defpackage.unc) {
                                        defpackage.unc uncVar3 = (defpackage.unc) ttjVar;
                                        java.util.List list3 = uncVar3.a;
                                        arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list3, 10));
                                        it = list3.iterator();
                                        while (it.hasNext()) {
                                            umyVar = (umy) it.next();
                                            java.util.Iterator it4 = it;
                                            boolean z211 = z19;
                                            long j5 = umyVar.c;
                                            long j6 = umyVar.a;
                                            java.lang.String str4 = umyVar.e;
                                            android.net.Uri uri3 = umyVar.f;
                                            unfVar = umyVar.g;
                                            if (unfVar != null) {
                                                i18 = unfVar.e - 1;
                                                if (i18 != 2) {
                                                    if (true != umyVar.j) {
                                                        i19 = 2131231080;
                                                    } else {
                                                        i19 = 2131231081;
                                                    }
                                                    iValueOf = java.lang.Integer.valueOf(i19);
                                                } else if (i18 != 3) {
                                                    iValueOf = 2131231080;
                                                } else if (i18 != 4) {
                                                    if (true != umyVar.i) {
                                                        i20 = 2131231060;
                                                    } else {
                                                        i20 = 2131231083;
                                                    }
                                                    iValueOf = java.lang.Integer.valueOf(i20);
                                                } else {
                                                    iValueOf = 2131231991;
                                                }
                                                num = iValueOf;
                                            } else {
                                                num = null;
                                            }
                                            if (unfVar != null) {
                                                str = unfVar.c;
                                            } else {
                                                str = null;
                                            }
                                            arrayList.add(new uov(j5, j6, str4, uri3, num, str, new lpg(str4, umyVar.b)));
                                            z19 = z211;
                                            it = it4;
                                        }
                                        boolean z212 = z19;
                                        z20 = false;
                                        uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar3.b, z16, z17, z18, z212, aomyVar3, aomyVar11);
                                        z21 = z18;
                                        z22 = z212;
                                        z23 = z17;
                                    }
                                    cavVar2 = cavVarB;
                                    defpackage.aomy aomyVar18 = aomyVar13;
                                    defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar18, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                    if (ttjVar instanceof defpackage.unc) {
                                        cavVar2.u(2094189670);
                                        defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                        ((defpackage.cbt) cavVar2).W(z20);
                                    } else {
                                        cavVar2.u(2094324210);
                                        ((defpackage.cbt) cavVar2).W(z20);
                                    }
                                    aomyVar10 = aomyVar18;
                                    z13 = z21;
                                    aomyVar8 = aomyVar11;
                                    aomyVar9 = aomyVar12;
                                    z10 = z15;
                                    z11 = z16;
                                    z14 = z23;
                                    z12 = z22;
                                }
                                z23 = z17;
                                z21 = z18;
                                z20 = false;
                                z22 = z19;
                                cavVar2 = cavVarB;
                                defpackage.aomy aomyVar19 = aomyVar13;
                                defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar19, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                if (ttjVar instanceof defpackage.unc) {
                                    cavVar2.u(2094189670);
                                    defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                } else {
                                    cavVar2.u(2094324210);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                }
                                aomyVar10 = aomyVar19;
                                z13 = z21;
                                aomyVar8 = aomyVar11;
                                aomyVar9 = aomyVar12;
                                z10 = z15;
                                z11 = z16;
                                z14 = z23;
                                z12 = z22;
                            }
                            throw new defpackage.aois();
                        }
                        cavVar2 = cavVarB;
                        cavVar2.s();
                        z10 = z;
                        z11 = z2;
                        aomyVar8 = aomyVar4;
                        aomyVar9 = aomyVar6;
                        aomyVar10 = aomyVar7;
                        z12 = z5;
                        z13 = z4;
                        z14 = z3;
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                        }
                    }
                    i13 |= 196608;
                    i17 = i13;
                    if ((i9 & 306783379) == 306783378) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (cavVarB.H(z9, i9 & 1)) {
                        z15 = (!z24) | z;
                        z16 = z25 & z2;
                        z17 = z26 & z3;
                        z18 = z6 & z4;
                        z19 = z7 & z5;
                        if (i11 != 0) {
                            aomyVar11 = null;
                        } else {
                            aomyVar11 = aomyVar4;
                        }
                        if (i15 != 0) {
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR2 = cbtVar2.R();
                            if (objR2 == defpackage.cau.a) {
                                objR2 = new defpackage.uoq(0);
                                cbtVar2.ab(objR2);
                            }
                            aomyVar12 = (defpackage.aomy) objR2;
                        } else {
                            aomyVar12 = aomyVar6;
                        }
                        if (i16 != 0) {
                            cbtVar = (defpackage.cbt) cavVarB;
                            objR = cbtVar.R();
                            if (objR == defpackage.cau.a) {
                                objR = new defpackage.uoq(2);
                                cbtVar.ab(objR);
                            }
                            aomyVar13 = (defpackage.aomy) objR;
                        } else {
                            aomyVar13 = aomyVar7;
                        }
                        j$.util.Objects.checkIndex(0, 4);
                        if (ttjVar != null) {
                            if (ttjVar instanceof defpackage.und) {
                                uoxVar = new defpackage.uoy(aomyVar);
                            } else {
                                if (ttjVar instanceof une) {
                                    uoxVar = new uoz(aomyVar2);
                                } else if (ttjVar instanceof defpackage.unc) {
                                    defpackage.unc uncVar4 = (defpackage.unc) ttjVar;
                                    java.util.List list4 = uncVar4.a;
                                    arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list4, 10));
                                    it = list4.iterator();
                                    while (it.hasNext()) {
                                        umyVar = (umy) it.next();
                                        java.util.Iterator it5 = it;
                                        boolean z213 = z19;
                                        long j7 = umyVar.c;
                                        long j8 = umyVar.a;
                                        java.lang.String str5 = umyVar.e;
                                        android.net.Uri uri4 = umyVar.f;
                                        unfVar = umyVar.g;
                                        if (unfVar != null) {
                                            i18 = unfVar.e - 1;
                                            if (i18 != 2) {
                                                if (true != umyVar.j) {
                                                    i19 = 2131231080;
                                                } else {
                                                    i19 = 2131231081;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i19);
                                            } else if (i18 != 3) {
                                                iValueOf = 2131231080;
                                            } else if (i18 != 4) {
                                                if (true != umyVar.i) {
                                                    i20 = 2131231060;
                                                } else {
                                                    i20 = 2131231083;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i20);
                                            } else {
                                                iValueOf = 2131231991;
                                            }
                                            num = iValueOf;
                                        } else {
                                            num = null;
                                        }
                                        if (unfVar != null) {
                                            str = unfVar.c;
                                        } else {
                                            str = null;
                                        }
                                        arrayList.add(new uov(j7, j8, str5, uri4, num, str, new lpg(str5, umyVar.b)));
                                        z19 = z213;
                                        it = it5;
                                    }
                                    boolean z214 = z19;
                                    z20 = false;
                                    uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar4.b, z16, z17, z18, z214, aomyVar3, aomyVar11);
                                    z21 = z18;
                                    z22 = z214;
                                    z23 = z17;
                                }
                                cavVar2 = cavVarB;
                                defpackage.aomy aomyVar110 = aomyVar13;
                                defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar110, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                if (ttjVar instanceof defpackage.unc) {
                                    cavVar2.u(2094189670);
                                    defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                } else {
                                    cavVar2.u(2094324210);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                }
                                aomyVar10 = aomyVar110;
                                z13 = z21;
                                aomyVar8 = aomyVar11;
                                aomyVar9 = aomyVar12;
                                z10 = z15;
                                z11 = z16;
                                z14 = z23;
                                z12 = z22;
                            }
                            z23 = z17;
                            z21 = z18;
                            z20 = false;
                            z22 = z19;
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar111 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar111, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar111;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        throw new defpackage.aois();
                    }
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    z10 = z;
                    z11 = z2;
                    aomyVar8 = aomyVar4;
                    aomyVar9 = aomyVar6;
                    aomyVar10 = aomyVar7;
                    z12 = z5;
                    z13 = z4;
                    z14 = z3;
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                    }
                }
                i4 |= 196608;
                z8 = true;
                if ((1572864 & i) == 0) {
                    if (z8 != cavVarB.D(aomyVar)) {
                        i25 = 524288;
                    } else {
                        i25 = 1048576;
                    }
                    i4 |= i25;
                }
                if ((12582912 & i) == 0) {
                    if (true != cavVarB.D(aomyVar2)) {
                        i24 = 4194304;
                    } else {
                        i24 = 8388608;
                    }
                    i4 |= i24;
                }
                if ((100663296 & i) == 0) {
                    if (true != cavVarB.D(aonjVar)) {
                        i23 = 33554432;
                    } else {
                        i23 = 67108864;
                    }
                    i4 |= i23;
                }
                if ((805306368 & i) == 0) {
                    if (true != cavVarB.D(aonjVar2)) {
                        i22 = 268435456;
                    } else {
                        i22 = 536870912;
                    }
                    i4 |= i22;
                }
                i9 = i4;
                if ((i2 & 6) == 0) {
                    if (true != cavVarB.D(aomyVar3)) {
                        i21 = 2;
                    } else {
                        i21 = 4;
                    }
                    i10 = i2 | i21;
                } else {
                    i10 = i2;
                }
                i11 = i3 & 2048;
                if (i11 != 0) {
                    if ((i2 & 48) == 0) {
                        i10 |= true == cavVarB.D(aomyVar4) ? 32 : 16;
                    }
                    i12 = i10;
                    if ((i2 & 384) == 0) {
                        i13 = i12 | (true == cavVarB.D(aonnVar) ? 256 : 128);
                    } else {
                        i13 = i12;
                    }
                    if ((i2 & 3072) == 0) {
                        i13 |= true == cavVarB.D(aomyVar5) ? 2048 : 1024;
                    }
                    i14 = i3 & 16384;
                    if (i14 != 0) {
                        i13 |= 24576;
                        i15 = i14;
                    } else {
                        i15 = i14;
                        if ((i2 & 24576) == 0) {
                            i13 |= true == cavVarB.D(aomyVar6) ? 16384 : 8192;
                        }
                    }
                    i16 = 32768 & i3;
                    if (i16 != 0) {
                        if ((i2 & 196608) == 0) {
                            i13 |= true == cavVarB.D(aomyVar7) ? 131072 : 65536;
                        }
                        i17 = i13;
                        if ((i9 & 306783379) == 306783378) {
                            z9 = true;
                        } else {
                            z9 = true;
                        }
                        if (cavVarB.H(z9, i9 & 1)) {
                            z15 = (!z24) | z;
                            z16 = z25 & z2;
                            z17 = z26 & z3;
                            z18 = z6 & z4;
                            z19 = z7 & z5;
                            if (i11 != 0) {
                                aomyVar11 = null;
                            } else {
                                aomyVar11 = aomyVar4;
                            }
                            if (i15 != 0) {
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR2 = cbtVar2.R();
                                if (objR2 == defpackage.cau.a) {
                                    objR2 = new defpackage.uoq(0);
                                    cbtVar2.ab(objR2);
                                }
                                aomyVar12 = (defpackage.aomy) objR2;
                            } else {
                                aomyVar12 = aomyVar6;
                            }
                            if (i16 != 0) {
                                cbtVar = (defpackage.cbt) cavVarB;
                                objR = cbtVar.R();
                                if (objR == defpackage.cau.a) {
                                    objR = new defpackage.uoq(2);
                                    cbtVar.ab(objR);
                                }
                                aomyVar13 = (defpackage.aomy) objR;
                            } else {
                                aomyVar13 = aomyVar7;
                            }
                            j$.util.Objects.checkIndex(0, 4);
                            if (ttjVar != null) {
                                if (ttjVar instanceof defpackage.und) {
                                    uoxVar = new defpackage.uoy(aomyVar);
                                } else {
                                    if (ttjVar instanceof une) {
                                        uoxVar = new uoz(aomyVar2);
                                    } else if (ttjVar instanceof defpackage.unc) {
                                        defpackage.unc uncVar5 = (defpackage.unc) ttjVar;
                                        java.util.List list5 = uncVar5.a;
                                        arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list5, 10));
                                        it = list5.iterator();
                                        while (it.hasNext()) {
                                            umyVar = (umy) it.next();
                                            java.util.Iterator it6 = it;
                                            boolean z215 = z19;
                                            long j9 = umyVar.c;
                                            long j10 = umyVar.a;
                                            java.lang.String str6 = umyVar.e;
                                            android.net.Uri uri5 = umyVar.f;
                                            unfVar = umyVar.g;
                                            if (unfVar != null) {
                                                i18 = unfVar.e - 1;
                                                if (i18 != 2) {
                                                    if (true != umyVar.j) {
                                                        i19 = 2131231080;
                                                    } else {
                                                        i19 = 2131231081;
                                                    }
                                                    iValueOf = java.lang.Integer.valueOf(i19);
                                                } else if (i18 != 3) {
                                                    iValueOf = 2131231080;
                                                } else if (i18 != 4) {
                                                    if (true != umyVar.i) {
                                                        i20 = 2131231060;
                                                    } else {
                                                        i20 = 2131231083;
                                                    }
                                                    iValueOf = java.lang.Integer.valueOf(i20);
                                                } else {
                                                    iValueOf = 2131231991;
                                                }
                                                num = iValueOf;
                                            } else {
                                                num = null;
                                            }
                                            if (unfVar != null) {
                                                str = unfVar.c;
                                            } else {
                                                str = null;
                                            }
                                            arrayList.add(new uov(j9, j10, str6, uri5, num, str, new lpg(str6, umyVar.b)));
                                            z19 = z215;
                                            it = it6;
                                        }
                                        boolean z216 = z19;
                                        z20 = false;
                                        uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar5.b, z16, z17, z18, z216, aomyVar3, aomyVar11);
                                        z21 = z18;
                                        z22 = z216;
                                        z23 = z17;
                                    }
                                    cavVar2 = cavVarB;
                                    defpackage.aomy aomyVar112 = aomyVar13;
                                    defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar112, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                    if (ttjVar instanceof defpackage.unc) {
                                        cavVar2.u(2094189670);
                                        defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                        ((defpackage.cbt) cavVar2).W(z20);
                                    } else {
                                        cavVar2.u(2094324210);
                                        ((defpackage.cbt) cavVar2).W(z20);
                                    }
                                    aomyVar10 = aomyVar112;
                                    z13 = z21;
                                    aomyVar8 = aomyVar11;
                                    aomyVar9 = aomyVar12;
                                    z10 = z15;
                                    z11 = z16;
                                    z14 = z23;
                                    z12 = z22;
                                }
                                z23 = z17;
                                z21 = z18;
                                z20 = false;
                                z22 = z19;
                                cavVar2 = cavVarB;
                                defpackage.aomy aomyVar113 = aomyVar13;
                                defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar113, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                if (ttjVar instanceof defpackage.unc) {
                                    cavVar2.u(2094189670);
                                    defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                } else {
                                    cavVar2.u(2094324210);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                }
                                aomyVar10 = aomyVar113;
                                z13 = z21;
                                aomyVar8 = aomyVar11;
                                aomyVar9 = aomyVar12;
                                z10 = z15;
                                z11 = z16;
                                z14 = z23;
                                z12 = z22;
                            }
                            throw new defpackage.aois();
                        }
                        cavVar2 = cavVarB;
                        cavVar2.s();
                        z10 = z;
                        z11 = z2;
                        aomyVar8 = aomyVar4;
                        aomyVar9 = aomyVar6;
                        aomyVar10 = aomyVar7;
                        z12 = z5;
                        z13 = z4;
                        z14 = z3;
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                        }
                    }
                    i13 |= 196608;
                    i17 = i13;
                    if ((i9 & 306783379) == 306783378) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (cavVarB.H(z9, i9 & 1)) {
                        z15 = (!z24) | z;
                        z16 = z25 & z2;
                        z17 = z26 & z3;
                        z18 = z6 & z4;
                        z19 = z7 & z5;
                        if (i11 != 0) {
                            aomyVar11 = null;
                        } else {
                            aomyVar11 = aomyVar4;
                        }
                        if (i15 != 0) {
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR2 = cbtVar2.R();
                            if (objR2 == defpackage.cau.a) {
                                objR2 = new defpackage.uoq(0);
                                cbtVar2.ab(objR2);
                            }
                            aomyVar12 = (defpackage.aomy) objR2;
                        } else {
                            aomyVar12 = aomyVar6;
                        }
                        if (i16 != 0) {
                            cbtVar = (defpackage.cbt) cavVarB;
                            objR = cbtVar.R();
                            if (objR == defpackage.cau.a) {
                                objR = new defpackage.uoq(2);
                                cbtVar.ab(objR);
                            }
                            aomyVar13 = (defpackage.aomy) objR;
                        } else {
                            aomyVar13 = aomyVar7;
                        }
                        j$.util.Objects.checkIndex(0, 4);
                        if (ttjVar != null) {
                            if (ttjVar instanceof defpackage.und) {
                                uoxVar = new defpackage.uoy(aomyVar);
                            } else {
                                if (ttjVar instanceof une) {
                                    uoxVar = new uoz(aomyVar2);
                                } else if (ttjVar instanceof defpackage.unc) {
                                    defpackage.unc uncVar6 = (defpackage.unc) ttjVar;
                                    java.util.List list6 = uncVar6.a;
                                    arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list6, 10));
                                    it = list6.iterator();
                                    while (it.hasNext()) {
                                        umyVar = (umy) it.next();
                                        java.util.Iterator it7 = it;
                                        boolean z217 = z19;
                                        long j11 = umyVar.c;
                                        long j12 = umyVar.a;
                                        java.lang.String str7 = umyVar.e;
                                        android.net.Uri uri6 = umyVar.f;
                                        unfVar = umyVar.g;
                                        if (unfVar != null) {
                                            i18 = unfVar.e - 1;
                                            if (i18 != 2) {
                                                if (true != umyVar.j) {
                                                    i19 = 2131231080;
                                                } else {
                                                    i19 = 2131231081;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i19);
                                            } else if (i18 != 3) {
                                                iValueOf = 2131231080;
                                            } else if (i18 != 4) {
                                                if (true != umyVar.i) {
                                                    i20 = 2131231060;
                                                } else {
                                                    i20 = 2131231083;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i20);
                                            } else {
                                                iValueOf = 2131231991;
                                            }
                                            num = iValueOf;
                                        } else {
                                            num = null;
                                        }
                                        if (unfVar != null) {
                                            str = unfVar.c;
                                        } else {
                                            str = null;
                                        }
                                        arrayList.add(new uov(j11, j12, str7, uri6, num, str, new lpg(str7, umyVar.b)));
                                        z19 = z217;
                                        it = it7;
                                    }
                                    boolean z218 = z19;
                                    z20 = false;
                                    uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar6.b, z16, z17, z18, z218, aomyVar3, aomyVar11);
                                    z21 = z18;
                                    z22 = z218;
                                    z23 = z17;
                                }
                                cavVar2 = cavVarB;
                                defpackage.aomy aomyVar114 = aomyVar13;
                                defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar114, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                if (ttjVar instanceof defpackage.unc) {
                                    cavVar2.u(2094189670);
                                    defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                } else {
                                    cavVar2.u(2094324210);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                }
                                aomyVar10 = aomyVar114;
                                z13 = z21;
                                aomyVar8 = aomyVar11;
                                aomyVar9 = aomyVar12;
                                z10 = z15;
                                z11 = z16;
                                z14 = z23;
                                z12 = z22;
                            }
                            z23 = z17;
                            z21 = z18;
                            z20 = false;
                            z22 = z19;
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar115 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar115, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar115;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        throw new defpackage.aois();
                    }
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    z10 = z;
                    z11 = z2;
                    aomyVar8 = aomyVar4;
                    aomyVar9 = aomyVar6;
                    aomyVar10 = aomyVar7;
                    z12 = z5;
                    z13 = z4;
                    z14 = z3;
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                    }
                }
                i10 |= 48;
                i12 = i10;
                if ((i2 & 384) == 0) {
                    i13 = i12 | (true == cavVarB.D(aonnVar) ? 256 : 128);
                } else {
                    i13 = i12;
                }
                if ((i2 & 3072) == 0) {
                    i13 |= true == cavVarB.D(aomyVar5) ? 2048 : 1024;
                }
                i14 = i3 & 16384;
                if (i14 != 0) {
                    i13 |= 24576;
                    i15 = i14;
                } else {
                    i15 = i14;
                    if ((i2 & 24576) == 0) {
                        i13 |= true == cavVarB.D(aomyVar6) ? 16384 : 8192;
                    }
                }
                i16 = 32768 & i3;
                if (i16 != 0) {
                    if ((i2 & 196608) == 0) {
                        i13 |= true == cavVarB.D(aomyVar7) ? 131072 : 65536;
                    }
                    i17 = i13;
                    if ((i9 & 306783379) == 306783378) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (cavVarB.H(z9, i9 & 1)) {
                        z15 = (!z24) | z;
                        z16 = z25 & z2;
                        z17 = z26 & z3;
                        z18 = z6 & z4;
                        z19 = z7 & z5;
                        if (i11 != 0) {
                            aomyVar11 = null;
                        } else {
                            aomyVar11 = aomyVar4;
                        }
                        if (i15 != 0) {
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR2 = cbtVar2.R();
                            if (objR2 == defpackage.cau.a) {
                                objR2 = new defpackage.uoq(0);
                                cbtVar2.ab(objR2);
                            }
                            aomyVar12 = (defpackage.aomy) objR2;
                        } else {
                            aomyVar12 = aomyVar6;
                        }
                        if (i16 != 0) {
                            cbtVar = (defpackage.cbt) cavVarB;
                            objR = cbtVar.R();
                            if (objR == defpackage.cau.a) {
                                objR = new defpackage.uoq(2);
                                cbtVar.ab(objR);
                            }
                            aomyVar13 = (defpackage.aomy) objR;
                        } else {
                            aomyVar13 = aomyVar7;
                        }
                        j$.util.Objects.checkIndex(0, 4);
                        if (ttjVar != null) {
                            if (ttjVar instanceof defpackage.und) {
                                uoxVar = new defpackage.uoy(aomyVar);
                            } else {
                                if (ttjVar instanceof une) {
                                    uoxVar = new uoz(aomyVar2);
                                } else if (ttjVar instanceof defpackage.unc) {
                                    defpackage.unc uncVar7 = (defpackage.unc) ttjVar;
                                    java.util.List list7 = uncVar7.a;
                                    arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list7, 10));
                                    it = list7.iterator();
                                    while (it.hasNext()) {
                                        umyVar = (umy) it.next();
                                        java.util.Iterator it8 = it;
                                        boolean z219 = z19;
                                        long j13 = umyVar.c;
                                        long j14 = umyVar.a;
                                        java.lang.String str8 = umyVar.e;
                                        android.net.Uri uri7 = umyVar.f;
                                        unfVar = umyVar.g;
                                        if (unfVar != null) {
                                            i18 = unfVar.e - 1;
                                            if (i18 != 2) {
                                                if (true != umyVar.j) {
                                                    i19 = 2131231080;
                                                } else {
                                                    i19 = 2131231081;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i19);
                                            } else if (i18 != 3) {
                                                iValueOf = 2131231080;
                                            } else if (i18 != 4) {
                                                if (true != umyVar.i) {
                                                    i20 = 2131231060;
                                                } else {
                                                    i20 = 2131231083;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i20);
                                            } else {
                                                iValueOf = 2131231991;
                                            }
                                            num = iValueOf;
                                        } else {
                                            num = null;
                                        }
                                        if (unfVar != null) {
                                            str = unfVar.c;
                                        } else {
                                            str = null;
                                        }
                                        arrayList.add(new uov(j13, j14, str8, uri7, num, str, new lpg(str8, umyVar.b)));
                                        z19 = z219;
                                        it = it8;
                                    }
                                    boolean z2110 = z19;
                                    z20 = false;
                                    uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar7.b, z16, z17, z18, z2110, aomyVar3, aomyVar11);
                                    z21 = z18;
                                    z22 = z2110;
                                    z23 = z17;
                                }
                                cavVar2 = cavVarB;
                                defpackage.aomy aomyVar116 = aomyVar13;
                                defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar116, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                if (ttjVar instanceof defpackage.unc) {
                                    cavVar2.u(2094189670);
                                    defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                } else {
                                    cavVar2.u(2094324210);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                }
                                aomyVar10 = aomyVar116;
                                z13 = z21;
                                aomyVar8 = aomyVar11;
                                aomyVar9 = aomyVar12;
                                z10 = z15;
                                z11 = z16;
                                z14 = z23;
                                z12 = z22;
                            }
                            z23 = z17;
                            z21 = z18;
                            z20 = false;
                            z22 = z19;
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar117 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar117, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar117;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        throw new defpackage.aois();
                    }
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    z10 = z;
                    z11 = z2;
                    aomyVar8 = aomyVar4;
                    aomyVar9 = aomyVar6;
                    aomyVar10 = aomyVar7;
                    z12 = z5;
                    z13 = z4;
                    z14 = z3;
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                    }
                }
                i13 |= 196608;
                i17 = i13;
                if ((i9 & 306783379) == 306783378) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (cavVarB.H(z9, i9 & 1)) {
                    z15 = (!z24) | z;
                    z16 = z25 & z2;
                    z17 = z26 & z3;
                    z18 = z6 & z4;
                    z19 = z7 & z5;
                    if (i11 != 0) {
                        aomyVar11 = null;
                    } else {
                        aomyVar11 = aomyVar4;
                    }
                    if (i15 != 0) {
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (objR2 == defpackage.cau.a) {
                            objR2 = new defpackage.uoq(0);
                            cbtVar2.ab(objR2);
                        }
                        aomyVar12 = (defpackage.aomy) objR2;
                    } else {
                        aomyVar12 = aomyVar6;
                    }
                    if (i16 != 0) {
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = new defpackage.uoq(2);
                            cbtVar.ab(objR);
                        }
                        aomyVar13 = (defpackage.aomy) objR;
                    } else {
                        aomyVar13 = aomyVar7;
                    }
                    j$.util.Objects.checkIndex(0, 4);
                    if (ttjVar != null) {
                        if (ttjVar instanceof defpackage.und) {
                            uoxVar = new defpackage.uoy(aomyVar);
                        } else {
                            if (ttjVar instanceof une) {
                                uoxVar = new uoz(aomyVar2);
                            } else if (ttjVar instanceof defpackage.unc) {
                                defpackage.unc uncVar8 = (defpackage.unc) ttjVar;
                                java.util.List list8 = uncVar8.a;
                                arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list8, 10));
                                it = list8.iterator();
                                while (it.hasNext()) {
                                    umyVar = (umy) it.next();
                                    java.util.Iterator it9 = it;
                                    boolean z2111 = z19;
                                    long j15 = umyVar.c;
                                    long j16 = umyVar.a;
                                    java.lang.String str9 = umyVar.e;
                                    android.net.Uri uri8 = umyVar.f;
                                    unfVar = umyVar.g;
                                    if (unfVar != null) {
                                        i18 = unfVar.e - 1;
                                        if (i18 != 2) {
                                            if (true != umyVar.j) {
                                                i19 = 2131231080;
                                            } else {
                                                i19 = 2131231081;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i19);
                                        } else if (i18 != 3) {
                                            iValueOf = 2131231080;
                                        } else if (i18 != 4) {
                                            if (true != umyVar.i) {
                                                i20 = 2131231060;
                                            } else {
                                                i20 = 2131231083;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i20);
                                        } else {
                                            iValueOf = 2131231991;
                                        }
                                        num = iValueOf;
                                    } else {
                                        num = null;
                                    }
                                    if (unfVar != null) {
                                        str = unfVar.c;
                                    } else {
                                        str = null;
                                    }
                                    arrayList.add(new uov(j15, j16, str9, uri8, num, str, new lpg(str9, umyVar.b)));
                                    z19 = z2111;
                                    it = it9;
                                }
                                boolean z2112 = z19;
                                z20 = false;
                                uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar8.b, z16, z17, z18, z2112, aomyVar3, aomyVar11);
                                z21 = z18;
                                z22 = z2112;
                                z23 = z17;
                            }
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar118 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar118, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar118;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        z23 = z17;
                        z21 = z18;
                        z20 = false;
                        z22 = z19;
                        cavVar2 = cavVarB;
                        defpackage.aomy aomyVar119 = aomyVar13;
                        defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar119, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                        if (ttjVar instanceof defpackage.unc) {
                            cavVar2.u(2094189670);
                            defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                            ((defpackage.cbt) cavVar2).W(z20);
                        } else {
                            cavVar2.u(2094324210);
                            ((defpackage.cbt) cavVar2).W(z20);
                        }
                        aomyVar10 = aomyVar119;
                        z13 = z21;
                        aomyVar8 = aomyVar11;
                        aomyVar9 = aomyVar12;
                        z10 = z15;
                        z11 = z16;
                        z14 = z23;
                        z12 = z22;
                    }
                    throw new defpackage.aois();
                }
                cavVar2 = cavVarB;
                cavVar2.s();
                z10 = z;
                z11 = z2;
                aomyVar8 = aomyVar4;
                aomyVar9 = aomyVar6;
                aomyVar10 = aomyVar7;
                z12 = z5;
                z13 = z4;
                z14 = z3;
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                }
            }
            i4 |= 24576;
            i7 = i3 & 32;
            if (i7 != 0) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (i7 != 0) {
                if ((i & 196608) == 0) {
                    z8 = true;
                    if (true != cavVarB.C(z5)) {
                        i8 = 65536;
                    } else {
                        i8 = 131072;
                    }
                    i4 |= i8;
                }
                if ((1572864 & i) == 0) {
                    if (z8 != cavVarB.D(aomyVar)) {
                        i25 = 524288;
                    } else {
                        i25 = 1048576;
                    }
                    i4 |= i25;
                }
                if ((12582912 & i) == 0) {
                    if (true != cavVarB.D(aomyVar2)) {
                        i24 = 4194304;
                    } else {
                        i24 = 8388608;
                    }
                    i4 |= i24;
                }
                if ((100663296 & i) == 0) {
                    if (true != cavVarB.D(aonjVar)) {
                        i23 = 33554432;
                    } else {
                        i23 = 67108864;
                    }
                    i4 |= i23;
                }
                if ((805306368 & i) == 0) {
                    if (true != cavVarB.D(aonjVar2)) {
                        i22 = 268435456;
                    } else {
                        i22 = 536870912;
                    }
                    i4 |= i22;
                }
                i9 = i4;
                if ((i2 & 6) == 0) {
                    if (true != cavVarB.D(aomyVar3)) {
                        i21 = 2;
                    } else {
                        i21 = 4;
                    }
                    i10 = i2 | i21;
                } else {
                    i10 = i2;
                }
                i11 = i3 & 2048;
                if (i11 != 0) {
                    if ((i2 & 48) == 0) {
                        i10 |= true == cavVarB.D(aomyVar4) ? 32 : 16;
                    }
                    i12 = i10;
                    if ((i2 & 384) == 0) {
                        i13 = i12 | (true == cavVarB.D(aonnVar) ? 256 : 128);
                    } else {
                        i13 = i12;
                    }
                    if ((i2 & 3072) == 0) {
                        i13 |= true == cavVarB.D(aomyVar5) ? 2048 : 1024;
                    }
                    i14 = i3 & 16384;
                    if (i14 != 0) {
                        i13 |= 24576;
                        i15 = i14;
                    } else {
                        i15 = i14;
                        if ((i2 & 24576) == 0) {
                            i13 |= true == cavVarB.D(aomyVar6) ? 16384 : 8192;
                        }
                    }
                    i16 = 32768 & i3;
                    if (i16 != 0) {
                        if ((i2 & 196608) == 0) {
                            i13 |= true == cavVarB.D(aomyVar7) ? 131072 : 65536;
                        }
                        i17 = i13;
                        if ((i9 & 306783379) == 306783378) {
                            z9 = true;
                        } else {
                            z9 = true;
                        }
                        if (cavVarB.H(z9, i9 & 1)) {
                            z15 = (!z24) | z;
                            z16 = z25 & z2;
                            z17 = z26 & z3;
                            z18 = z6 & z4;
                            z19 = z7 & z5;
                            if (i11 != 0) {
                                aomyVar11 = null;
                            } else {
                                aomyVar11 = aomyVar4;
                            }
                            if (i15 != 0) {
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR2 = cbtVar2.R();
                                if (objR2 == defpackage.cau.a) {
                                    objR2 = new defpackage.uoq(0);
                                    cbtVar2.ab(objR2);
                                }
                                aomyVar12 = (defpackage.aomy) objR2;
                            } else {
                                aomyVar12 = aomyVar6;
                            }
                            if (i16 != 0) {
                                cbtVar = (defpackage.cbt) cavVarB;
                                objR = cbtVar.R();
                                if (objR == defpackage.cau.a) {
                                    objR = new defpackage.uoq(2);
                                    cbtVar.ab(objR);
                                }
                                aomyVar13 = (defpackage.aomy) objR;
                            } else {
                                aomyVar13 = aomyVar7;
                            }
                            j$.util.Objects.checkIndex(0, 4);
                            if (ttjVar != null) {
                                if (ttjVar instanceof defpackage.und) {
                                    uoxVar = new defpackage.uoy(aomyVar);
                                } else {
                                    if (ttjVar instanceof une) {
                                        uoxVar = new uoz(aomyVar2);
                                    } else if (ttjVar instanceof defpackage.unc) {
                                        defpackage.unc uncVar9 = (defpackage.unc) ttjVar;
                                        java.util.List list9 = uncVar9.a;
                                        arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list9, 10));
                                        it = list9.iterator();
                                        while (it.hasNext()) {
                                            umyVar = (umy) it.next();
                                            java.util.Iterator it10 = it;
                                            boolean z2113 = z19;
                                            long j17 = umyVar.c;
                                            long j18 = umyVar.a;
                                            java.lang.String str10 = umyVar.e;
                                            android.net.Uri uri9 = umyVar.f;
                                            unfVar = umyVar.g;
                                            if (unfVar != null) {
                                                i18 = unfVar.e - 1;
                                                if (i18 != 2) {
                                                    if (true != umyVar.j) {
                                                        i19 = 2131231080;
                                                    } else {
                                                        i19 = 2131231081;
                                                    }
                                                    iValueOf = java.lang.Integer.valueOf(i19);
                                                } else if (i18 != 3) {
                                                    iValueOf = 2131231080;
                                                } else if (i18 != 4) {
                                                    if (true != umyVar.i) {
                                                        i20 = 2131231060;
                                                    } else {
                                                        i20 = 2131231083;
                                                    }
                                                    iValueOf = java.lang.Integer.valueOf(i20);
                                                } else {
                                                    iValueOf = 2131231991;
                                                }
                                                num = iValueOf;
                                            } else {
                                                num = null;
                                            }
                                            if (unfVar != null) {
                                                str = unfVar.c;
                                            } else {
                                                str = null;
                                            }
                                            arrayList.add(new uov(j17, j18, str10, uri9, num, str, new lpg(str10, umyVar.b)));
                                            z19 = z2113;
                                            it = it10;
                                        }
                                        boolean z2114 = z19;
                                        z20 = false;
                                        uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar9.b, z16, z17, z18, z2114, aomyVar3, aomyVar11);
                                        z21 = z18;
                                        z22 = z2114;
                                        z23 = z17;
                                    }
                                    cavVar2 = cavVarB;
                                    defpackage.aomy aomyVar1110 = aomyVar13;
                                    defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1110, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                    if (ttjVar instanceof defpackage.unc) {
                                        cavVar2.u(2094189670);
                                        defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                        ((defpackage.cbt) cavVar2).W(z20);
                                    } else {
                                        cavVar2.u(2094324210);
                                        ((defpackage.cbt) cavVar2).W(z20);
                                    }
                                    aomyVar10 = aomyVar1110;
                                    z13 = z21;
                                    aomyVar8 = aomyVar11;
                                    aomyVar9 = aomyVar12;
                                    z10 = z15;
                                    z11 = z16;
                                    z14 = z23;
                                    z12 = z22;
                                }
                                z23 = z17;
                                z21 = z18;
                                z20 = false;
                                z22 = z19;
                                cavVar2 = cavVarB;
                                defpackage.aomy aomyVar1111 = aomyVar13;
                                defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1111, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                if (ttjVar instanceof defpackage.unc) {
                                    cavVar2.u(2094189670);
                                    defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                } else {
                                    cavVar2.u(2094324210);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                }
                                aomyVar10 = aomyVar1111;
                                z13 = z21;
                                aomyVar8 = aomyVar11;
                                aomyVar9 = aomyVar12;
                                z10 = z15;
                                z11 = z16;
                                z14 = z23;
                                z12 = z22;
                            }
                            throw new defpackage.aois();
                        }
                        cavVar2 = cavVarB;
                        cavVar2.s();
                        z10 = z;
                        z11 = z2;
                        aomyVar8 = aomyVar4;
                        aomyVar9 = aomyVar6;
                        aomyVar10 = aomyVar7;
                        z12 = z5;
                        z13 = z4;
                        z14 = z3;
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                        }
                    }
                    i13 |= 196608;
                    i17 = i13;
                    if ((i9 & 306783379) == 306783378) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (cavVarB.H(z9, i9 & 1)) {
                        z15 = (!z24) | z;
                        z16 = z25 & z2;
                        z17 = z26 & z3;
                        z18 = z6 & z4;
                        z19 = z7 & z5;
                        if (i11 != 0) {
                            aomyVar11 = null;
                        } else {
                            aomyVar11 = aomyVar4;
                        }
                        if (i15 != 0) {
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR2 = cbtVar2.R();
                            if (objR2 == defpackage.cau.a) {
                                objR2 = new defpackage.uoq(0);
                                cbtVar2.ab(objR2);
                            }
                            aomyVar12 = (defpackage.aomy) objR2;
                        } else {
                            aomyVar12 = aomyVar6;
                        }
                        if (i16 != 0) {
                            cbtVar = (defpackage.cbt) cavVarB;
                            objR = cbtVar.R();
                            if (objR == defpackage.cau.a) {
                                objR = new defpackage.uoq(2);
                                cbtVar.ab(objR);
                            }
                            aomyVar13 = (defpackage.aomy) objR;
                        } else {
                            aomyVar13 = aomyVar7;
                        }
                        j$.util.Objects.checkIndex(0, 4);
                        if (ttjVar != null) {
                            if (ttjVar instanceof defpackage.und) {
                                uoxVar = new defpackage.uoy(aomyVar);
                            } else {
                                if (ttjVar instanceof une) {
                                    uoxVar = new uoz(aomyVar2);
                                } else if (ttjVar instanceof defpackage.unc) {
                                    defpackage.unc uncVar10 = (defpackage.unc) ttjVar;
                                    java.util.List list10 = uncVar10.a;
                                    arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list10, 10));
                                    it = list10.iterator();
                                    while (it.hasNext()) {
                                        umyVar = (umy) it.next();
                                        java.util.Iterator it11 = it;
                                        boolean z2115 = z19;
                                        long j19 = umyVar.c;
                                        long j110 = umyVar.a;
                                        java.lang.String str11 = umyVar.e;
                                        android.net.Uri uri10 = umyVar.f;
                                        unfVar = umyVar.g;
                                        if (unfVar != null) {
                                            i18 = unfVar.e - 1;
                                            if (i18 != 2) {
                                                if (true != umyVar.j) {
                                                    i19 = 2131231080;
                                                } else {
                                                    i19 = 2131231081;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i19);
                                            } else if (i18 != 3) {
                                                iValueOf = 2131231080;
                                            } else if (i18 != 4) {
                                                if (true != umyVar.i) {
                                                    i20 = 2131231060;
                                                } else {
                                                    i20 = 2131231083;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i20);
                                            } else {
                                                iValueOf = 2131231991;
                                            }
                                            num = iValueOf;
                                        } else {
                                            num = null;
                                        }
                                        if (unfVar != null) {
                                            str = unfVar.c;
                                        } else {
                                            str = null;
                                        }
                                        arrayList.add(new uov(j19, j110, str11, uri10, num, str, new lpg(str11, umyVar.b)));
                                        z19 = z2115;
                                        it = it11;
                                    }
                                    boolean z2116 = z19;
                                    z20 = false;
                                    uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar10.b, z16, z17, z18, z2116, aomyVar3, aomyVar11);
                                    z21 = z18;
                                    z22 = z2116;
                                    z23 = z17;
                                }
                                cavVar2 = cavVarB;
                                defpackage.aomy aomyVar1112 = aomyVar13;
                                defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1112, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                if (ttjVar instanceof defpackage.unc) {
                                    cavVar2.u(2094189670);
                                    defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                } else {
                                    cavVar2.u(2094324210);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                }
                                aomyVar10 = aomyVar1112;
                                z13 = z21;
                                aomyVar8 = aomyVar11;
                                aomyVar9 = aomyVar12;
                                z10 = z15;
                                z11 = z16;
                                z14 = z23;
                                z12 = z22;
                            }
                            z23 = z17;
                            z21 = z18;
                            z20 = false;
                            z22 = z19;
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar1113 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1113, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar1113;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        throw new defpackage.aois();
                    }
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    z10 = z;
                    z11 = z2;
                    aomyVar8 = aomyVar4;
                    aomyVar9 = aomyVar6;
                    aomyVar10 = aomyVar7;
                    z12 = z5;
                    z13 = z4;
                    z14 = z3;
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                    }
                }
                i10 |= 48;
                i12 = i10;
                if ((i2 & 384) == 0) {
                    i13 = i12 | (true == cavVarB.D(aonnVar) ? 256 : 128);
                } else {
                    i13 = i12;
                }
                if ((i2 & 3072) == 0) {
                    i13 |= true == cavVarB.D(aomyVar5) ? 2048 : 1024;
                }
                i14 = i3 & 16384;
                if (i14 != 0) {
                    i13 |= 24576;
                    i15 = i14;
                } else {
                    i15 = i14;
                    if ((i2 & 24576) == 0) {
                        i13 |= true == cavVarB.D(aomyVar6) ? 16384 : 8192;
                    }
                }
                i16 = 32768 & i3;
                if (i16 != 0) {
                    if ((i2 & 196608) == 0) {
                        i13 |= true == cavVarB.D(aomyVar7) ? 131072 : 65536;
                    }
                    i17 = i13;
                    if ((i9 & 306783379) == 306783378) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (cavVarB.H(z9, i9 & 1)) {
                        z15 = (!z24) | z;
                        z16 = z25 & z2;
                        z17 = z26 & z3;
                        z18 = z6 & z4;
                        z19 = z7 & z5;
                        if (i11 != 0) {
                            aomyVar11 = null;
                        } else {
                            aomyVar11 = aomyVar4;
                        }
                        if (i15 != 0) {
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR2 = cbtVar2.R();
                            if (objR2 == defpackage.cau.a) {
                                objR2 = new defpackage.uoq(0);
                                cbtVar2.ab(objR2);
                            }
                            aomyVar12 = (defpackage.aomy) objR2;
                        } else {
                            aomyVar12 = aomyVar6;
                        }
                        if (i16 != 0) {
                            cbtVar = (defpackage.cbt) cavVarB;
                            objR = cbtVar.R();
                            if (objR == defpackage.cau.a) {
                                objR = new defpackage.uoq(2);
                                cbtVar.ab(objR);
                            }
                            aomyVar13 = (defpackage.aomy) objR;
                        } else {
                            aomyVar13 = aomyVar7;
                        }
                        j$.util.Objects.checkIndex(0, 4);
                        if (ttjVar != null) {
                            if (ttjVar instanceof defpackage.und) {
                                uoxVar = new defpackage.uoy(aomyVar);
                            } else {
                                if (ttjVar instanceof une) {
                                    uoxVar = new uoz(aomyVar2);
                                } else if (ttjVar instanceof defpackage.unc) {
                                    defpackage.unc uncVar11 = (defpackage.unc) ttjVar;
                                    java.util.List list11 = uncVar11.a;
                                    arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list11, 10));
                                    it = list11.iterator();
                                    while (it.hasNext()) {
                                        umyVar = (umy) it.next();
                                        java.util.Iterator it12 = it;
                                        boolean z2117 = z19;
                                        long j111 = umyVar.c;
                                        long j112 = umyVar.a;
                                        java.lang.String str12 = umyVar.e;
                                        android.net.Uri uri11 = umyVar.f;
                                        unfVar = umyVar.g;
                                        if (unfVar != null) {
                                            i18 = unfVar.e - 1;
                                            if (i18 != 2) {
                                                if (true != umyVar.j) {
                                                    i19 = 2131231080;
                                                } else {
                                                    i19 = 2131231081;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i19);
                                            } else if (i18 != 3) {
                                                iValueOf = 2131231080;
                                            } else if (i18 != 4) {
                                                if (true != umyVar.i) {
                                                    i20 = 2131231060;
                                                } else {
                                                    i20 = 2131231083;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i20);
                                            } else {
                                                iValueOf = 2131231991;
                                            }
                                            num = iValueOf;
                                        } else {
                                            num = null;
                                        }
                                        if (unfVar != null) {
                                            str = unfVar.c;
                                        } else {
                                            str = null;
                                        }
                                        arrayList.add(new uov(j111, j112, str12, uri11, num, str, new lpg(str12, umyVar.b)));
                                        z19 = z2117;
                                        it = it12;
                                    }
                                    boolean z2118 = z19;
                                    z20 = false;
                                    uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar11.b, z16, z17, z18, z2118, aomyVar3, aomyVar11);
                                    z21 = z18;
                                    z22 = z2118;
                                    z23 = z17;
                                }
                                cavVar2 = cavVarB;
                                defpackage.aomy aomyVar1114 = aomyVar13;
                                defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1114, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                if (ttjVar instanceof defpackage.unc) {
                                    cavVar2.u(2094189670);
                                    defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                } else {
                                    cavVar2.u(2094324210);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                }
                                aomyVar10 = aomyVar1114;
                                z13 = z21;
                                aomyVar8 = aomyVar11;
                                aomyVar9 = aomyVar12;
                                z10 = z15;
                                z11 = z16;
                                z14 = z23;
                                z12 = z22;
                            }
                            z23 = z17;
                            z21 = z18;
                            z20 = false;
                            z22 = z19;
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar1115 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1115, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar1115;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        throw new defpackage.aois();
                    }
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    z10 = z;
                    z11 = z2;
                    aomyVar8 = aomyVar4;
                    aomyVar9 = aomyVar6;
                    aomyVar10 = aomyVar7;
                    z12 = z5;
                    z13 = z4;
                    z14 = z3;
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                    }
                }
                i13 |= 196608;
                i17 = i13;
                if ((i9 & 306783379) == 306783378) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (cavVarB.H(z9, i9 & 1)) {
                    z15 = (!z24) | z;
                    z16 = z25 & z2;
                    z17 = z26 & z3;
                    z18 = z6 & z4;
                    z19 = z7 & z5;
                    if (i11 != 0) {
                        aomyVar11 = null;
                    } else {
                        aomyVar11 = aomyVar4;
                    }
                    if (i15 != 0) {
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (objR2 == defpackage.cau.a) {
                            objR2 = new defpackage.uoq(0);
                            cbtVar2.ab(objR2);
                        }
                        aomyVar12 = (defpackage.aomy) objR2;
                    } else {
                        aomyVar12 = aomyVar6;
                    }
                    if (i16 != 0) {
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = new defpackage.uoq(2);
                            cbtVar.ab(objR);
                        }
                        aomyVar13 = (defpackage.aomy) objR;
                    } else {
                        aomyVar13 = aomyVar7;
                    }
                    j$.util.Objects.checkIndex(0, 4);
                    if (ttjVar != null) {
                        if (ttjVar instanceof defpackage.und) {
                            uoxVar = new defpackage.uoy(aomyVar);
                        } else {
                            if (ttjVar instanceof une) {
                                uoxVar = new uoz(aomyVar2);
                            } else if (ttjVar instanceof defpackage.unc) {
                                defpackage.unc uncVar12 = (defpackage.unc) ttjVar;
                                java.util.List list12 = uncVar12.a;
                                arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list12, 10));
                                it = list12.iterator();
                                while (it.hasNext()) {
                                    umyVar = (umy) it.next();
                                    java.util.Iterator it13 = it;
                                    boolean z2119 = z19;
                                    long j113 = umyVar.c;
                                    long j114 = umyVar.a;
                                    java.lang.String str13 = umyVar.e;
                                    android.net.Uri uri12 = umyVar.f;
                                    unfVar = umyVar.g;
                                    if (unfVar != null) {
                                        i18 = unfVar.e - 1;
                                        if (i18 != 2) {
                                            if (true != umyVar.j) {
                                                i19 = 2131231080;
                                            } else {
                                                i19 = 2131231081;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i19);
                                        } else if (i18 != 3) {
                                            iValueOf = 2131231080;
                                        } else if (i18 != 4) {
                                            if (true != umyVar.i) {
                                                i20 = 2131231060;
                                            } else {
                                                i20 = 2131231083;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i20);
                                        } else {
                                            iValueOf = 2131231991;
                                        }
                                        num = iValueOf;
                                    } else {
                                        num = null;
                                    }
                                    if (unfVar != null) {
                                        str = unfVar.c;
                                    } else {
                                        str = null;
                                    }
                                    arrayList.add(new uov(j113, j114, str13, uri12, num, str, new lpg(str13, umyVar.b)));
                                    z19 = z2119;
                                    it = it13;
                                }
                                boolean z21110 = z19;
                                z20 = false;
                                uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar12.b, z16, z17, z18, z21110, aomyVar3, aomyVar11);
                                z21 = z18;
                                z22 = z21110;
                                z23 = z17;
                            }
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar1116 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1116, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar1116;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        z23 = z17;
                        z21 = z18;
                        z20 = false;
                        z22 = z19;
                        cavVar2 = cavVarB;
                        defpackage.aomy aomyVar1117 = aomyVar13;
                        defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1117, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                        if (ttjVar instanceof defpackage.unc) {
                            cavVar2.u(2094189670);
                            defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                            ((defpackage.cbt) cavVar2).W(z20);
                        } else {
                            cavVar2.u(2094324210);
                            ((defpackage.cbt) cavVar2).W(z20);
                        }
                        aomyVar10 = aomyVar1117;
                        z13 = z21;
                        aomyVar8 = aomyVar11;
                        aomyVar9 = aomyVar12;
                        z10 = z15;
                        z11 = z16;
                        z14 = z23;
                        z12 = z22;
                    }
                    throw new defpackage.aois();
                }
                cavVar2 = cavVarB;
                cavVar2.s();
                z10 = z;
                z11 = z2;
                aomyVar8 = aomyVar4;
                aomyVar9 = aomyVar6;
                aomyVar10 = aomyVar7;
                z12 = z5;
                z13 = z4;
                z14 = z3;
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                }
            }
            i4 |= 196608;
            z8 = true;
            if ((1572864 & i) == 0) {
                if (z8 != cavVarB.D(aomyVar)) {
                    i25 = 524288;
                } else {
                    i25 = 1048576;
                }
                i4 |= i25;
            }
            if ((12582912 & i) == 0) {
                if (true != cavVarB.D(aomyVar2)) {
                    i24 = 4194304;
                } else {
                    i24 = 8388608;
                }
                i4 |= i24;
            }
            if ((100663296 & i) == 0) {
                if (true != cavVarB.D(aonjVar)) {
                    i23 = 33554432;
                } else {
                    i23 = 67108864;
                }
                i4 |= i23;
            }
            if ((805306368 & i) == 0) {
                if (true != cavVarB.D(aonjVar2)) {
                    i22 = 268435456;
                } else {
                    i22 = 536870912;
                }
                i4 |= i22;
            }
            i9 = i4;
            if ((i2 & 6) == 0) {
                if (true != cavVarB.D(aomyVar3)) {
                    i21 = 2;
                } else {
                    i21 = 4;
                }
                i10 = i2 | i21;
            } else {
                i10 = i2;
            }
            i11 = i3 & 2048;
            if (i11 != 0) {
                if ((i2 & 48) == 0) {
                    i10 |= true == cavVarB.D(aomyVar4) ? 32 : 16;
                }
                i12 = i10;
                if ((i2 & 384) == 0) {
                    i13 = i12 | (true == cavVarB.D(aonnVar) ? 256 : 128);
                } else {
                    i13 = i12;
                }
                if ((i2 & 3072) == 0) {
                    i13 |= true == cavVarB.D(aomyVar5) ? 2048 : 1024;
                }
                i14 = i3 & 16384;
                if (i14 != 0) {
                    i13 |= 24576;
                    i15 = i14;
                } else {
                    i15 = i14;
                    if ((i2 & 24576) == 0) {
                        i13 |= true == cavVarB.D(aomyVar6) ? 16384 : 8192;
                    }
                }
                i16 = 32768 & i3;
                if (i16 != 0) {
                    if ((i2 & 196608) == 0) {
                        i13 |= true == cavVarB.D(aomyVar7) ? 131072 : 65536;
                    }
                    i17 = i13;
                    if ((i9 & 306783379) == 306783378) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (cavVarB.H(z9, i9 & 1)) {
                        z15 = (!z24) | z;
                        z16 = z25 & z2;
                        z17 = z26 & z3;
                        z18 = z6 & z4;
                        z19 = z7 & z5;
                        if (i11 != 0) {
                            aomyVar11 = null;
                        } else {
                            aomyVar11 = aomyVar4;
                        }
                        if (i15 != 0) {
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR2 = cbtVar2.R();
                            if (objR2 == defpackage.cau.a) {
                                objR2 = new defpackage.uoq(0);
                                cbtVar2.ab(objR2);
                            }
                            aomyVar12 = (defpackage.aomy) objR2;
                        } else {
                            aomyVar12 = aomyVar6;
                        }
                        if (i16 != 0) {
                            cbtVar = (defpackage.cbt) cavVarB;
                            objR = cbtVar.R();
                            if (objR == defpackage.cau.a) {
                                objR = new defpackage.uoq(2);
                                cbtVar.ab(objR);
                            }
                            aomyVar13 = (defpackage.aomy) objR;
                        } else {
                            aomyVar13 = aomyVar7;
                        }
                        j$.util.Objects.checkIndex(0, 4);
                        if (ttjVar != null) {
                            if (ttjVar instanceof defpackage.und) {
                                uoxVar = new defpackage.uoy(aomyVar);
                            } else {
                                if (ttjVar instanceof une) {
                                    uoxVar = new uoz(aomyVar2);
                                } else if (ttjVar instanceof defpackage.unc) {
                                    defpackage.unc uncVar13 = (defpackage.unc) ttjVar;
                                    java.util.List list13 = uncVar13.a;
                                    arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list13, 10));
                                    it = list13.iterator();
                                    while (it.hasNext()) {
                                        umyVar = (umy) it.next();
                                        java.util.Iterator it14 = it;
                                        boolean z21111 = z19;
                                        long j115 = umyVar.c;
                                        long j116 = umyVar.a;
                                        java.lang.String str14 = umyVar.e;
                                        android.net.Uri uri13 = umyVar.f;
                                        unfVar = umyVar.g;
                                        if (unfVar != null) {
                                            i18 = unfVar.e - 1;
                                            if (i18 != 2) {
                                                if (true != umyVar.j) {
                                                    i19 = 2131231080;
                                                } else {
                                                    i19 = 2131231081;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i19);
                                            } else if (i18 != 3) {
                                                iValueOf = 2131231080;
                                            } else if (i18 != 4) {
                                                if (true != umyVar.i) {
                                                    i20 = 2131231060;
                                                } else {
                                                    i20 = 2131231083;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i20);
                                            } else {
                                                iValueOf = 2131231991;
                                            }
                                            num = iValueOf;
                                        } else {
                                            num = null;
                                        }
                                        if (unfVar != null) {
                                            str = unfVar.c;
                                        } else {
                                            str = null;
                                        }
                                        arrayList.add(new uov(j115, j116, str14, uri13, num, str, new lpg(str14, umyVar.b)));
                                        z19 = z21111;
                                        it = it14;
                                    }
                                    boolean z21112 = z19;
                                    z20 = false;
                                    uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar13.b, z16, z17, z18, z21112, aomyVar3, aomyVar11);
                                    z21 = z18;
                                    z22 = z21112;
                                    z23 = z17;
                                }
                                cavVar2 = cavVarB;
                                defpackage.aomy aomyVar1118 = aomyVar13;
                                defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1118, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                if (ttjVar instanceof defpackage.unc) {
                                    cavVar2.u(2094189670);
                                    defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                } else {
                                    cavVar2.u(2094324210);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                }
                                aomyVar10 = aomyVar1118;
                                z13 = z21;
                                aomyVar8 = aomyVar11;
                                aomyVar9 = aomyVar12;
                                z10 = z15;
                                z11 = z16;
                                z14 = z23;
                                z12 = z22;
                            }
                            z23 = z17;
                            z21 = z18;
                            z20 = false;
                            z22 = z19;
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar1119 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1119, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar1119;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        throw new defpackage.aois();
                    }
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    z10 = z;
                    z11 = z2;
                    aomyVar8 = aomyVar4;
                    aomyVar9 = aomyVar6;
                    aomyVar10 = aomyVar7;
                    z12 = z5;
                    z13 = z4;
                    z14 = z3;
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                    }
                }
                i13 |= 196608;
                i17 = i13;
                if ((i9 & 306783379) == 306783378) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (cavVarB.H(z9, i9 & 1)) {
                    z15 = (!z24) | z;
                    z16 = z25 & z2;
                    z17 = z26 & z3;
                    z18 = z6 & z4;
                    z19 = z7 & z5;
                    if (i11 != 0) {
                        aomyVar11 = null;
                    } else {
                        aomyVar11 = aomyVar4;
                    }
                    if (i15 != 0) {
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (objR2 == defpackage.cau.a) {
                            objR2 = new defpackage.uoq(0);
                            cbtVar2.ab(objR2);
                        }
                        aomyVar12 = (defpackage.aomy) objR2;
                    } else {
                        aomyVar12 = aomyVar6;
                    }
                    if (i16 != 0) {
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = new defpackage.uoq(2);
                            cbtVar.ab(objR);
                        }
                        aomyVar13 = (defpackage.aomy) objR;
                    } else {
                        aomyVar13 = aomyVar7;
                    }
                    j$.util.Objects.checkIndex(0, 4);
                    if (ttjVar != null) {
                        if (ttjVar instanceof defpackage.und) {
                            uoxVar = new defpackage.uoy(aomyVar);
                        } else {
                            if (ttjVar instanceof une) {
                                uoxVar = new uoz(aomyVar2);
                            } else if (ttjVar instanceof defpackage.unc) {
                                defpackage.unc uncVar14 = (defpackage.unc) ttjVar;
                                java.util.List list14 = uncVar14.a;
                                arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list14, 10));
                                it = list14.iterator();
                                while (it.hasNext()) {
                                    umyVar = (umy) it.next();
                                    java.util.Iterator it15 = it;
                                    boolean z21113 = z19;
                                    long j117 = umyVar.c;
                                    long j118 = umyVar.a;
                                    java.lang.String str15 = umyVar.e;
                                    android.net.Uri uri14 = umyVar.f;
                                    unfVar = umyVar.g;
                                    if (unfVar != null) {
                                        i18 = unfVar.e - 1;
                                        if (i18 != 2) {
                                            if (true != umyVar.j) {
                                                i19 = 2131231080;
                                            } else {
                                                i19 = 2131231081;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i19);
                                        } else if (i18 != 3) {
                                            iValueOf = 2131231080;
                                        } else if (i18 != 4) {
                                            if (true != umyVar.i) {
                                                i20 = 2131231060;
                                            } else {
                                                i20 = 2131231083;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i20);
                                        } else {
                                            iValueOf = 2131231991;
                                        }
                                        num = iValueOf;
                                    } else {
                                        num = null;
                                    }
                                    if (unfVar != null) {
                                        str = unfVar.c;
                                    } else {
                                        str = null;
                                    }
                                    arrayList.add(new uov(j117, j118, str15, uri14, num, str, new lpg(str15, umyVar.b)));
                                    z19 = z21113;
                                    it = it15;
                                }
                                boolean z21114 = z19;
                                z20 = false;
                                uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar14.b, z16, z17, z18, z21114, aomyVar3, aomyVar11);
                                z21 = z18;
                                z22 = z21114;
                                z23 = z17;
                            }
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar11110 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar11110, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar11110;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        z23 = z17;
                        z21 = z18;
                        z20 = false;
                        z22 = z19;
                        cavVar2 = cavVarB;
                        defpackage.aomy aomyVar11111 = aomyVar13;
                        defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar11111, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                        if (ttjVar instanceof defpackage.unc) {
                            cavVar2.u(2094189670);
                            defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                            ((defpackage.cbt) cavVar2).W(z20);
                        } else {
                            cavVar2.u(2094324210);
                            ((defpackage.cbt) cavVar2).W(z20);
                        }
                        aomyVar10 = aomyVar11111;
                        z13 = z21;
                        aomyVar8 = aomyVar11;
                        aomyVar9 = aomyVar12;
                        z10 = z15;
                        z11 = z16;
                        z14 = z23;
                        z12 = z22;
                    }
                    throw new defpackage.aois();
                }
                cavVar2 = cavVarB;
                cavVar2.s();
                z10 = z;
                z11 = z2;
                aomyVar8 = aomyVar4;
                aomyVar9 = aomyVar6;
                aomyVar10 = aomyVar7;
                z12 = z5;
                z13 = z4;
                z14 = z3;
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                }
            }
            i10 |= 48;
            i12 = i10;
            if ((i2 & 384) == 0) {
                i13 = i12 | (true == cavVarB.D(aonnVar) ? 256 : 128);
            } else {
                i13 = i12;
            }
            if ((i2 & 3072) == 0) {
                i13 |= true == cavVarB.D(aomyVar5) ? 2048 : 1024;
            }
            i14 = i3 & 16384;
            if (i14 != 0) {
                i13 |= 24576;
                i15 = i14;
            } else {
                i15 = i14;
                if ((i2 & 24576) == 0) {
                    i13 |= true == cavVarB.D(aomyVar6) ? 16384 : 8192;
                }
            }
            i16 = 32768 & i3;
            if (i16 != 0) {
                if ((i2 & 196608) == 0) {
                    i13 |= true == cavVarB.D(aomyVar7) ? 131072 : 65536;
                }
                i17 = i13;
                if ((i9 & 306783379) == 306783378) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (cavVarB.H(z9, i9 & 1)) {
                    z15 = (!z24) | z;
                    z16 = z25 & z2;
                    z17 = z26 & z3;
                    z18 = z6 & z4;
                    z19 = z7 & z5;
                    if (i11 != 0) {
                        aomyVar11 = null;
                    } else {
                        aomyVar11 = aomyVar4;
                    }
                    if (i15 != 0) {
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (objR2 == defpackage.cau.a) {
                            objR2 = new defpackage.uoq(0);
                            cbtVar2.ab(objR2);
                        }
                        aomyVar12 = (defpackage.aomy) objR2;
                    } else {
                        aomyVar12 = aomyVar6;
                    }
                    if (i16 != 0) {
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = new defpackage.uoq(2);
                            cbtVar.ab(objR);
                        }
                        aomyVar13 = (defpackage.aomy) objR;
                    } else {
                        aomyVar13 = aomyVar7;
                    }
                    j$.util.Objects.checkIndex(0, 4);
                    if (ttjVar != null) {
                        if (ttjVar instanceof defpackage.und) {
                            uoxVar = new defpackage.uoy(aomyVar);
                        } else {
                            if (ttjVar instanceof une) {
                                uoxVar = new uoz(aomyVar2);
                            } else if (ttjVar instanceof defpackage.unc) {
                                defpackage.unc uncVar15 = (defpackage.unc) ttjVar;
                                java.util.List list15 = uncVar15.a;
                                arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list15, 10));
                                it = list15.iterator();
                                while (it.hasNext()) {
                                    umyVar = (umy) it.next();
                                    java.util.Iterator it16 = it;
                                    boolean z21115 = z19;
                                    long j119 = umyVar.c;
                                    long j1110 = umyVar.a;
                                    java.lang.String str16 = umyVar.e;
                                    android.net.Uri uri15 = umyVar.f;
                                    unfVar = umyVar.g;
                                    if (unfVar != null) {
                                        i18 = unfVar.e - 1;
                                        if (i18 != 2) {
                                            if (true != umyVar.j) {
                                                i19 = 2131231080;
                                            } else {
                                                i19 = 2131231081;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i19);
                                        } else if (i18 != 3) {
                                            iValueOf = 2131231080;
                                        } else if (i18 != 4) {
                                            if (true != umyVar.i) {
                                                i20 = 2131231060;
                                            } else {
                                                i20 = 2131231083;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i20);
                                        } else {
                                            iValueOf = 2131231991;
                                        }
                                        num = iValueOf;
                                    } else {
                                        num = null;
                                    }
                                    if (unfVar != null) {
                                        str = unfVar.c;
                                    } else {
                                        str = null;
                                    }
                                    arrayList.add(new uov(j119, j1110, str16, uri15, num, str, new lpg(str16, umyVar.b)));
                                    z19 = z21115;
                                    it = it16;
                                }
                                boolean z21116 = z19;
                                z20 = false;
                                uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar15.b, z16, z17, z18, z21116, aomyVar3, aomyVar11);
                                z21 = z18;
                                z22 = z21116;
                                z23 = z17;
                            }
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar11112 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar11112, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar11112;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        z23 = z17;
                        z21 = z18;
                        z20 = false;
                        z22 = z19;
                        cavVar2 = cavVarB;
                        defpackage.aomy aomyVar11113 = aomyVar13;
                        defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar11113, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                        if (ttjVar instanceof defpackage.unc) {
                            cavVar2.u(2094189670);
                            defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                            ((defpackage.cbt) cavVar2).W(z20);
                        } else {
                            cavVar2.u(2094324210);
                            ((defpackage.cbt) cavVar2).W(z20);
                        }
                        aomyVar10 = aomyVar11113;
                        z13 = z21;
                        aomyVar8 = aomyVar11;
                        aomyVar9 = aomyVar12;
                        z10 = z15;
                        z11 = z16;
                        z14 = z23;
                        z12 = z22;
                    }
                    throw new defpackage.aois();
                }
                cavVar2 = cavVarB;
                cavVar2.s();
                z10 = z;
                z11 = z2;
                aomyVar8 = aomyVar4;
                aomyVar9 = aomyVar6;
                aomyVar10 = aomyVar7;
                z12 = z5;
                z13 = z4;
                z14 = z3;
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                }
            }
            i13 |= 196608;
            i17 = i13;
            if ((i9 & 306783379) == 306783378) {
                z9 = true;
            } else {
                z9 = true;
            }
            if (cavVarB.H(z9, i9 & 1)) {
                z15 = (!z24) | z;
                z16 = z25 & z2;
                z17 = z26 & z3;
                z18 = z6 & z4;
                z19 = z7 & z5;
                if (i11 != 0) {
                    aomyVar11 = null;
                } else {
                    aomyVar11 = aomyVar4;
                }
                if (i15 != 0) {
                    cbtVar2 = (defpackage.cbt) cavVarB;
                    objR2 = cbtVar2.R();
                    if (objR2 == defpackage.cau.a) {
                        objR2 = new defpackage.uoq(0);
                        cbtVar2.ab(objR2);
                    }
                    aomyVar12 = (defpackage.aomy) objR2;
                } else {
                    aomyVar12 = aomyVar6;
                }
                if (i16 != 0) {
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = new defpackage.uoq(2);
                        cbtVar.ab(objR);
                    }
                    aomyVar13 = (defpackage.aomy) objR;
                } else {
                    aomyVar13 = aomyVar7;
                }
                j$.util.Objects.checkIndex(0, 4);
                if (ttjVar != null) {
                    if (ttjVar instanceof defpackage.und) {
                        uoxVar = new defpackage.uoy(aomyVar);
                    } else {
                        if (ttjVar instanceof une) {
                            uoxVar = new uoz(aomyVar2);
                        } else if (ttjVar instanceof defpackage.unc) {
                            defpackage.unc uncVar16 = (defpackage.unc) ttjVar;
                            java.util.List list16 = uncVar16.a;
                            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list16, 10));
                            it = list16.iterator();
                            while (it.hasNext()) {
                                umyVar = (umy) it.next();
                                java.util.Iterator it17 = it;
                                boolean z21117 = z19;
                                long j1111 = umyVar.c;
                                long j1112 = umyVar.a;
                                java.lang.String str17 = umyVar.e;
                                android.net.Uri uri16 = umyVar.f;
                                unfVar = umyVar.g;
                                if (unfVar != null) {
                                    i18 = unfVar.e - 1;
                                    if (i18 != 2) {
                                        if (true != umyVar.j) {
                                            i19 = 2131231080;
                                        } else {
                                            i19 = 2131231081;
                                        }
                                        iValueOf = java.lang.Integer.valueOf(i19);
                                    } else if (i18 != 3) {
                                        iValueOf = 2131231080;
                                    } else if (i18 != 4) {
                                        if (true != umyVar.i) {
                                            i20 = 2131231060;
                                        } else {
                                            i20 = 2131231083;
                                        }
                                        iValueOf = java.lang.Integer.valueOf(i20);
                                    } else {
                                        iValueOf = 2131231991;
                                    }
                                    num = iValueOf;
                                } else {
                                    num = null;
                                }
                                if (unfVar != null) {
                                    str = unfVar.c;
                                } else {
                                    str = null;
                                }
                                arrayList.add(new uov(j1111, j1112, str17, uri16, num, str, new lpg(str17, umyVar.b)));
                                z19 = z21117;
                                it = it17;
                            }
                            boolean z21118 = z19;
                            z20 = false;
                            uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar16.b, z16, z17, z18, z21118, aomyVar3, aomyVar11);
                            z21 = z18;
                            z22 = z21118;
                            z23 = z17;
                        }
                        cavVar2 = cavVarB;
                        defpackage.aomy aomyVar11114 = aomyVar13;
                        defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar11114, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                        if (ttjVar instanceof defpackage.unc) {
                            cavVar2.u(2094189670);
                            defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                            ((defpackage.cbt) cavVar2).W(z20);
                        } else {
                            cavVar2.u(2094324210);
                            ((defpackage.cbt) cavVar2).W(z20);
                        }
                        aomyVar10 = aomyVar11114;
                        z13 = z21;
                        aomyVar8 = aomyVar11;
                        aomyVar9 = aomyVar12;
                        z10 = z15;
                        z11 = z16;
                        z14 = z23;
                        z12 = z22;
                    }
                    z23 = z17;
                    z21 = z18;
                    z20 = false;
                    z22 = z19;
                    cavVar2 = cavVarB;
                    defpackage.aomy aomyVar11115 = aomyVar13;
                    defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar11115, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                    if (ttjVar instanceof defpackage.unc) {
                        cavVar2.u(2094189670);
                        defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                        ((defpackage.cbt) cavVar2).W(z20);
                    } else {
                        cavVar2.u(2094324210);
                        ((defpackage.cbt) cavVar2).W(z20);
                    }
                    aomyVar10 = aomyVar11115;
                    z13 = z21;
                    aomyVar8 = aomyVar11;
                    aomyVar9 = aomyVar12;
                    z10 = z15;
                    z11 = z16;
                    z14 = z23;
                    z12 = z22;
                }
                throw new defpackage.aois();
            }
            cavVar2 = cavVarB;
            cavVar2.s();
            z10 = z;
            z11 = z2;
            aomyVar8 = aomyVar4;
            aomyVar9 = aomyVar6;
            aomyVar10 = aomyVar7;
            z12 = z5;
            z13 = z4;
            z14 = z3;
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
            }
        }
        i4 |= 3072;
        i5 = i3 & 16;
        if (i5 != 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                if (true != cavVarB.C(z4)) {
                    i6 = 8192;
                } else {
                    i6 = 16384;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (i7 != 0) {
                if ((i & 196608) == 0) {
                    z8 = true;
                    if (true != cavVarB.C(z5)) {
                        i8 = 65536;
                    } else {
                        i8 = 131072;
                    }
                    i4 |= i8;
                }
                if ((1572864 & i) == 0) {
                    if (z8 != cavVarB.D(aomyVar)) {
                        i25 = 524288;
                    } else {
                        i25 = 1048576;
                    }
                    i4 |= i25;
                }
                if ((12582912 & i) == 0) {
                    if (true != cavVarB.D(aomyVar2)) {
                        i24 = 4194304;
                    } else {
                        i24 = 8388608;
                    }
                    i4 |= i24;
                }
                if ((100663296 & i) == 0) {
                    if (true != cavVarB.D(aonjVar)) {
                        i23 = 33554432;
                    } else {
                        i23 = 67108864;
                    }
                    i4 |= i23;
                }
                if ((805306368 & i) == 0) {
                    if (true != cavVarB.D(aonjVar2)) {
                        i22 = 268435456;
                    } else {
                        i22 = 536870912;
                    }
                    i4 |= i22;
                }
                i9 = i4;
                if ((i2 & 6) == 0) {
                    if (true != cavVarB.D(aomyVar3)) {
                        i21 = 2;
                    } else {
                        i21 = 4;
                    }
                    i10 = i2 | i21;
                } else {
                    i10 = i2;
                }
                i11 = i3 & 2048;
                if (i11 != 0) {
                    if ((i2 & 48) == 0) {
                        i10 |= true == cavVarB.D(aomyVar4) ? 32 : 16;
                    }
                    i12 = i10;
                    if ((i2 & 384) == 0) {
                        i13 = i12 | (true == cavVarB.D(aonnVar) ? 256 : 128);
                    } else {
                        i13 = i12;
                    }
                    if ((i2 & 3072) == 0) {
                        i13 |= true == cavVarB.D(aomyVar5) ? 2048 : 1024;
                    }
                    i14 = i3 & 16384;
                    if (i14 != 0) {
                        i13 |= 24576;
                        i15 = i14;
                    } else {
                        i15 = i14;
                        if ((i2 & 24576) == 0) {
                            i13 |= true == cavVarB.D(aomyVar6) ? 16384 : 8192;
                        }
                    }
                    i16 = 32768 & i3;
                    if (i16 != 0) {
                        if ((i2 & 196608) == 0) {
                            i13 |= true == cavVarB.D(aomyVar7) ? 131072 : 65536;
                        }
                        i17 = i13;
                        if ((i9 & 306783379) == 306783378) {
                            z9 = true;
                        } else {
                            z9 = true;
                        }
                        if (cavVarB.H(z9, i9 & 1)) {
                            z15 = (!z24) | z;
                            z16 = z25 & z2;
                            z17 = z26 & z3;
                            z18 = z6 & z4;
                            z19 = z7 & z5;
                            if (i11 != 0) {
                                aomyVar11 = null;
                            } else {
                                aomyVar11 = aomyVar4;
                            }
                            if (i15 != 0) {
                                cbtVar2 = (defpackage.cbt) cavVarB;
                                objR2 = cbtVar2.R();
                                if (objR2 == defpackage.cau.a) {
                                    objR2 = new defpackage.uoq(0);
                                    cbtVar2.ab(objR2);
                                }
                                aomyVar12 = (defpackage.aomy) objR2;
                            } else {
                                aomyVar12 = aomyVar6;
                            }
                            if (i16 != 0) {
                                cbtVar = (defpackage.cbt) cavVarB;
                                objR = cbtVar.R();
                                if (objR == defpackage.cau.a) {
                                    objR = new defpackage.uoq(2);
                                    cbtVar.ab(objR);
                                }
                                aomyVar13 = (defpackage.aomy) objR;
                            } else {
                                aomyVar13 = aomyVar7;
                            }
                            j$.util.Objects.checkIndex(0, 4);
                            if (ttjVar != null) {
                                if (ttjVar instanceof defpackage.und) {
                                    uoxVar = new defpackage.uoy(aomyVar);
                                } else {
                                    if (ttjVar instanceof une) {
                                        uoxVar = new uoz(aomyVar2);
                                    } else if (ttjVar instanceof defpackage.unc) {
                                        defpackage.unc uncVar17 = (defpackage.unc) ttjVar;
                                        java.util.List list17 = uncVar17.a;
                                        arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list17, 10));
                                        it = list17.iterator();
                                        while (it.hasNext()) {
                                            umyVar = (umy) it.next();
                                            java.util.Iterator it18 = it;
                                            boolean z21119 = z19;
                                            long j1113 = umyVar.c;
                                            long j1114 = umyVar.a;
                                            java.lang.String str18 = umyVar.e;
                                            android.net.Uri uri17 = umyVar.f;
                                            unfVar = umyVar.g;
                                            if (unfVar != null) {
                                                i18 = unfVar.e - 1;
                                                if (i18 != 2) {
                                                    if (true != umyVar.j) {
                                                        i19 = 2131231080;
                                                    } else {
                                                        i19 = 2131231081;
                                                    }
                                                    iValueOf = java.lang.Integer.valueOf(i19);
                                                } else if (i18 != 3) {
                                                    iValueOf = 2131231080;
                                                } else if (i18 != 4) {
                                                    if (true != umyVar.i) {
                                                        i20 = 2131231060;
                                                    } else {
                                                        i20 = 2131231083;
                                                    }
                                                    iValueOf = java.lang.Integer.valueOf(i20);
                                                } else {
                                                    iValueOf = 2131231991;
                                                }
                                                num = iValueOf;
                                            } else {
                                                num = null;
                                            }
                                            if (unfVar != null) {
                                                str = unfVar.c;
                                            } else {
                                                str = null;
                                            }
                                            arrayList.add(new uov(j1113, j1114, str18, uri17, num, str, new lpg(str18, umyVar.b)));
                                            z19 = z21119;
                                            it = it18;
                                        }
                                        boolean z211110 = z19;
                                        z20 = false;
                                        uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar17.b, z16, z17, z18, z211110, aomyVar3, aomyVar11);
                                        z21 = z18;
                                        z22 = z211110;
                                        z23 = z17;
                                    }
                                    cavVar2 = cavVarB;
                                    defpackage.aomy aomyVar11116 = aomyVar13;
                                    defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar11116, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                    if (ttjVar instanceof defpackage.unc) {
                                        cavVar2.u(2094189670);
                                        defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                        ((defpackage.cbt) cavVar2).W(z20);
                                    } else {
                                        cavVar2.u(2094324210);
                                        ((defpackage.cbt) cavVar2).W(z20);
                                    }
                                    aomyVar10 = aomyVar11116;
                                    z13 = z21;
                                    aomyVar8 = aomyVar11;
                                    aomyVar9 = aomyVar12;
                                    z10 = z15;
                                    z11 = z16;
                                    z14 = z23;
                                    z12 = z22;
                                }
                                z23 = z17;
                                z21 = z18;
                                z20 = false;
                                z22 = z19;
                                cavVar2 = cavVarB;
                                defpackage.aomy aomyVar11117 = aomyVar13;
                                defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar11117, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                if (ttjVar instanceof defpackage.unc) {
                                    cavVar2.u(2094189670);
                                    defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                } else {
                                    cavVar2.u(2094324210);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                }
                                aomyVar10 = aomyVar11117;
                                z13 = z21;
                                aomyVar8 = aomyVar11;
                                aomyVar9 = aomyVar12;
                                z10 = z15;
                                z11 = z16;
                                z14 = z23;
                                z12 = z22;
                            }
                            throw new defpackage.aois();
                        }
                        cavVar2 = cavVarB;
                        cavVar2.s();
                        z10 = z;
                        z11 = z2;
                        aomyVar8 = aomyVar4;
                        aomyVar9 = aomyVar6;
                        aomyVar10 = aomyVar7;
                        z12 = z5;
                        z13 = z4;
                        z14 = z3;
                        cdkVarI = cavVar2.I();
                        if (cdkVarI != null) {
                            cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                        }
                    }
                    i13 |= 196608;
                    i17 = i13;
                    if ((i9 & 306783379) == 306783378) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (cavVarB.H(z9, i9 & 1)) {
                        z15 = (!z24) | z;
                        z16 = z25 & z2;
                        z17 = z26 & z3;
                        z18 = z6 & z4;
                        z19 = z7 & z5;
                        if (i11 != 0) {
                            aomyVar11 = null;
                        } else {
                            aomyVar11 = aomyVar4;
                        }
                        if (i15 != 0) {
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR2 = cbtVar2.R();
                            if (objR2 == defpackage.cau.a) {
                                objR2 = new defpackage.uoq(0);
                                cbtVar2.ab(objR2);
                            }
                            aomyVar12 = (defpackage.aomy) objR2;
                        } else {
                            aomyVar12 = aomyVar6;
                        }
                        if (i16 != 0) {
                            cbtVar = (defpackage.cbt) cavVarB;
                            objR = cbtVar.R();
                            if (objR == defpackage.cau.a) {
                                objR = new defpackage.uoq(2);
                                cbtVar.ab(objR);
                            }
                            aomyVar13 = (defpackage.aomy) objR;
                        } else {
                            aomyVar13 = aomyVar7;
                        }
                        j$.util.Objects.checkIndex(0, 4);
                        if (ttjVar != null) {
                            if (ttjVar instanceof defpackage.und) {
                                uoxVar = new defpackage.uoy(aomyVar);
                            } else {
                                if (ttjVar instanceof une) {
                                    uoxVar = new uoz(aomyVar2);
                                } else if (ttjVar instanceof defpackage.unc) {
                                    defpackage.unc uncVar18 = (defpackage.unc) ttjVar;
                                    java.util.List list18 = uncVar18.a;
                                    arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list18, 10));
                                    it = list18.iterator();
                                    while (it.hasNext()) {
                                        umyVar = (umy) it.next();
                                        java.util.Iterator it19 = it;
                                        boolean z211111 = z19;
                                        long j1115 = umyVar.c;
                                        long j1116 = umyVar.a;
                                        java.lang.String str19 = umyVar.e;
                                        android.net.Uri uri18 = umyVar.f;
                                        unfVar = umyVar.g;
                                        if (unfVar != null) {
                                            i18 = unfVar.e - 1;
                                            if (i18 != 2) {
                                                if (true != umyVar.j) {
                                                    i19 = 2131231080;
                                                } else {
                                                    i19 = 2131231081;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i19);
                                            } else if (i18 != 3) {
                                                iValueOf = 2131231080;
                                            } else if (i18 != 4) {
                                                if (true != umyVar.i) {
                                                    i20 = 2131231060;
                                                } else {
                                                    i20 = 2131231083;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i20);
                                            } else {
                                                iValueOf = 2131231991;
                                            }
                                            num = iValueOf;
                                        } else {
                                            num = null;
                                        }
                                        if (unfVar != null) {
                                            str = unfVar.c;
                                        } else {
                                            str = null;
                                        }
                                        arrayList.add(new uov(j1115, j1116, str19, uri18, num, str, new lpg(str19, umyVar.b)));
                                        z19 = z211111;
                                        it = it19;
                                    }
                                    boolean z211112 = z19;
                                    z20 = false;
                                    uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar18.b, z16, z17, z18, z211112, aomyVar3, aomyVar11);
                                    z21 = z18;
                                    z22 = z211112;
                                    z23 = z17;
                                }
                                cavVar2 = cavVarB;
                                defpackage.aomy aomyVar11118 = aomyVar13;
                                defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar11118, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                if (ttjVar instanceof defpackage.unc) {
                                    cavVar2.u(2094189670);
                                    defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                } else {
                                    cavVar2.u(2094324210);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                }
                                aomyVar10 = aomyVar11118;
                                z13 = z21;
                                aomyVar8 = aomyVar11;
                                aomyVar9 = aomyVar12;
                                z10 = z15;
                                z11 = z16;
                                z14 = z23;
                                z12 = z22;
                            }
                            z23 = z17;
                            z21 = z18;
                            z20 = false;
                            z22 = z19;
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar11119 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar11119, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar11119;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        throw new defpackage.aois();
                    }
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    z10 = z;
                    z11 = z2;
                    aomyVar8 = aomyVar4;
                    aomyVar9 = aomyVar6;
                    aomyVar10 = aomyVar7;
                    z12 = z5;
                    z13 = z4;
                    z14 = z3;
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                    }
                }
                i10 |= 48;
                i12 = i10;
                if ((i2 & 384) == 0) {
                    i13 = i12 | (true == cavVarB.D(aonnVar) ? 256 : 128);
                } else {
                    i13 = i12;
                }
                if ((i2 & 3072) == 0) {
                    i13 |= true == cavVarB.D(aomyVar5) ? 2048 : 1024;
                }
                i14 = i3 & 16384;
                if (i14 != 0) {
                    i13 |= 24576;
                    i15 = i14;
                } else {
                    i15 = i14;
                    if ((i2 & 24576) == 0) {
                        i13 |= true == cavVarB.D(aomyVar6) ? 16384 : 8192;
                    }
                }
                i16 = 32768 & i3;
                if (i16 != 0) {
                    if ((i2 & 196608) == 0) {
                        i13 |= true == cavVarB.D(aomyVar7) ? 131072 : 65536;
                    }
                    i17 = i13;
                    if ((i9 & 306783379) == 306783378) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (cavVarB.H(z9, i9 & 1)) {
                        z15 = (!z24) | z;
                        z16 = z25 & z2;
                        z17 = z26 & z3;
                        z18 = z6 & z4;
                        z19 = z7 & z5;
                        if (i11 != 0) {
                            aomyVar11 = null;
                        } else {
                            aomyVar11 = aomyVar4;
                        }
                        if (i15 != 0) {
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR2 = cbtVar2.R();
                            if (objR2 == defpackage.cau.a) {
                                objR2 = new defpackage.uoq(0);
                                cbtVar2.ab(objR2);
                            }
                            aomyVar12 = (defpackage.aomy) objR2;
                        } else {
                            aomyVar12 = aomyVar6;
                        }
                        if (i16 != 0) {
                            cbtVar = (defpackage.cbt) cavVarB;
                            objR = cbtVar.R();
                            if (objR == defpackage.cau.a) {
                                objR = new defpackage.uoq(2);
                                cbtVar.ab(objR);
                            }
                            aomyVar13 = (defpackage.aomy) objR;
                        } else {
                            aomyVar13 = aomyVar7;
                        }
                        j$.util.Objects.checkIndex(0, 4);
                        if (ttjVar != null) {
                            if (ttjVar instanceof defpackage.und) {
                                uoxVar = new defpackage.uoy(aomyVar);
                            } else {
                                if (ttjVar instanceof une) {
                                    uoxVar = new uoz(aomyVar2);
                                } else if (ttjVar instanceof defpackage.unc) {
                                    defpackage.unc uncVar19 = (defpackage.unc) ttjVar;
                                    java.util.List list19 = uncVar19.a;
                                    arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list19, 10));
                                    it = list19.iterator();
                                    while (it.hasNext()) {
                                        umyVar = (umy) it.next();
                                        java.util.Iterator it110 = it;
                                        boolean z211113 = z19;
                                        long j1117 = umyVar.c;
                                        long j1118 = umyVar.a;
                                        java.lang.String str110 = umyVar.e;
                                        android.net.Uri uri19 = umyVar.f;
                                        unfVar = umyVar.g;
                                        if (unfVar != null) {
                                            i18 = unfVar.e - 1;
                                            if (i18 != 2) {
                                                if (true != umyVar.j) {
                                                    i19 = 2131231080;
                                                } else {
                                                    i19 = 2131231081;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i19);
                                            } else if (i18 != 3) {
                                                iValueOf = 2131231080;
                                            } else if (i18 != 4) {
                                                if (true != umyVar.i) {
                                                    i20 = 2131231060;
                                                } else {
                                                    i20 = 2131231083;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i20);
                                            } else {
                                                iValueOf = 2131231991;
                                            }
                                            num = iValueOf;
                                        } else {
                                            num = null;
                                        }
                                        if (unfVar != null) {
                                            str = unfVar.c;
                                        } else {
                                            str = null;
                                        }
                                        arrayList.add(new uov(j1117, j1118, str110, uri19, num, str, new lpg(str110, umyVar.b)));
                                        z19 = z211113;
                                        it = it110;
                                    }
                                    boolean z211114 = z19;
                                    z20 = false;
                                    uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar19.b, z16, z17, z18, z211114, aomyVar3, aomyVar11);
                                    z21 = z18;
                                    z22 = z211114;
                                    z23 = z17;
                                }
                                cavVar2 = cavVarB;
                                defpackage.aomy aomyVar111110 = aomyVar13;
                                defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar111110, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                if (ttjVar instanceof defpackage.unc) {
                                    cavVar2.u(2094189670);
                                    defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                } else {
                                    cavVar2.u(2094324210);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                }
                                aomyVar10 = aomyVar111110;
                                z13 = z21;
                                aomyVar8 = aomyVar11;
                                aomyVar9 = aomyVar12;
                                z10 = z15;
                                z11 = z16;
                                z14 = z23;
                                z12 = z22;
                            }
                            z23 = z17;
                            z21 = z18;
                            z20 = false;
                            z22 = z19;
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar111111 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar111111, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar111111;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        throw new defpackage.aois();
                    }
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    z10 = z;
                    z11 = z2;
                    aomyVar8 = aomyVar4;
                    aomyVar9 = aomyVar6;
                    aomyVar10 = aomyVar7;
                    z12 = z5;
                    z13 = z4;
                    z14 = z3;
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                    }
                }
                i13 |= 196608;
                i17 = i13;
                if ((i9 & 306783379) == 306783378) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (cavVarB.H(z9, i9 & 1)) {
                    z15 = (!z24) | z;
                    z16 = z25 & z2;
                    z17 = z26 & z3;
                    z18 = z6 & z4;
                    z19 = z7 & z5;
                    if (i11 != 0) {
                        aomyVar11 = null;
                    } else {
                        aomyVar11 = aomyVar4;
                    }
                    if (i15 != 0) {
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (objR2 == defpackage.cau.a) {
                            objR2 = new defpackage.uoq(0);
                            cbtVar2.ab(objR2);
                        }
                        aomyVar12 = (defpackage.aomy) objR2;
                    } else {
                        aomyVar12 = aomyVar6;
                    }
                    if (i16 != 0) {
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = new defpackage.uoq(2);
                            cbtVar.ab(objR);
                        }
                        aomyVar13 = (defpackage.aomy) objR;
                    } else {
                        aomyVar13 = aomyVar7;
                    }
                    j$.util.Objects.checkIndex(0, 4);
                    if (ttjVar != null) {
                        if (ttjVar instanceof defpackage.und) {
                            uoxVar = new defpackage.uoy(aomyVar);
                        } else {
                            if (ttjVar instanceof une) {
                                uoxVar = new uoz(aomyVar2);
                            } else if (ttjVar instanceof defpackage.unc) {
                                defpackage.unc uncVar110 = (defpackage.unc) ttjVar;
                                java.util.List list110 = uncVar110.a;
                                arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list110, 10));
                                it = list110.iterator();
                                while (it.hasNext()) {
                                    umyVar = (umy) it.next();
                                    java.util.Iterator it111 = it;
                                    boolean z211115 = z19;
                                    long j1119 = umyVar.c;
                                    long j11110 = umyVar.a;
                                    java.lang.String str111 = umyVar.e;
                                    android.net.Uri uri110 = umyVar.f;
                                    unfVar = umyVar.g;
                                    if (unfVar != null) {
                                        i18 = unfVar.e - 1;
                                        if (i18 != 2) {
                                            if (true != umyVar.j) {
                                                i19 = 2131231080;
                                            } else {
                                                i19 = 2131231081;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i19);
                                        } else if (i18 != 3) {
                                            iValueOf = 2131231080;
                                        } else if (i18 != 4) {
                                            if (true != umyVar.i) {
                                                i20 = 2131231060;
                                            } else {
                                                i20 = 2131231083;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i20);
                                        } else {
                                            iValueOf = 2131231991;
                                        }
                                        num = iValueOf;
                                    } else {
                                        num = null;
                                    }
                                    if (unfVar != null) {
                                        str = unfVar.c;
                                    } else {
                                        str = null;
                                    }
                                    arrayList.add(new uov(j1119, j11110, str111, uri110, num, str, new lpg(str111, umyVar.b)));
                                    z19 = z211115;
                                    it = it111;
                                }
                                boolean z211116 = z19;
                                z20 = false;
                                uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar110.b, z16, z17, z18, z211116, aomyVar3, aomyVar11);
                                z21 = z18;
                                z22 = z211116;
                                z23 = z17;
                            }
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar111112 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar111112, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar111112;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        z23 = z17;
                        z21 = z18;
                        z20 = false;
                        z22 = z19;
                        cavVar2 = cavVarB;
                        defpackage.aomy aomyVar111113 = aomyVar13;
                        defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar111113, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                        if (ttjVar instanceof defpackage.unc) {
                            cavVar2.u(2094189670);
                            defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                            ((defpackage.cbt) cavVar2).W(z20);
                        } else {
                            cavVar2.u(2094324210);
                            ((defpackage.cbt) cavVar2).W(z20);
                        }
                        aomyVar10 = aomyVar111113;
                        z13 = z21;
                        aomyVar8 = aomyVar11;
                        aomyVar9 = aomyVar12;
                        z10 = z15;
                        z11 = z16;
                        z14 = z23;
                        z12 = z22;
                    }
                    throw new defpackage.aois();
                }
                cavVar2 = cavVarB;
                cavVar2.s();
                z10 = z;
                z11 = z2;
                aomyVar8 = aomyVar4;
                aomyVar9 = aomyVar6;
                aomyVar10 = aomyVar7;
                z12 = z5;
                z13 = z4;
                z14 = z3;
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                }
            }
            i4 |= 196608;
            z8 = true;
            if ((1572864 & i) == 0) {
                if (z8 != cavVarB.D(aomyVar)) {
                    i25 = 524288;
                } else {
                    i25 = 1048576;
                }
                i4 |= i25;
            }
            if ((12582912 & i) == 0) {
                if (true != cavVarB.D(aomyVar2)) {
                    i24 = 4194304;
                } else {
                    i24 = 8388608;
                }
                i4 |= i24;
            }
            if ((100663296 & i) == 0) {
                if (true != cavVarB.D(aonjVar)) {
                    i23 = 33554432;
                } else {
                    i23 = 67108864;
                }
                i4 |= i23;
            }
            if ((805306368 & i) == 0) {
                if (true != cavVarB.D(aonjVar2)) {
                    i22 = 268435456;
                } else {
                    i22 = 536870912;
                }
                i4 |= i22;
            }
            i9 = i4;
            if ((i2 & 6) == 0) {
                if (true != cavVarB.D(aomyVar3)) {
                    i21 = 2;
                } else {
                    i21 = 4;
                }
                i10 = i2 | i21;
            } else {
                i10 = i2;
            }
            i11 = i3 & 2048;
            if (i11 != 0) {
                if ((i2 & 48) == 0) {
                    i10 |= true == cavVarB.D(aomyVar4) ? 32 : 16;
                }
                i12 = i10;
                if ((i2 & 384) == 0) {
                    i13 = i12 | (true == cavVarB.D(aonnVar) ? 256 : 128);
                } else {
                    i13 = i12;
                }
                if ((i2 & 3072) == 0) {
                    i13 |= true == cavVarB.D(aomyVar5) ? 2048 : 1024;
                }
                i14 = i3 & 16384;
                if (i14 != 0) {
                    i13 |= 24576;
                    i15 = i14;
                } else {
                    i15 = i14;
                    if ((i2 & 24576) == 0) {
                        i13 |= true == cavVarB.D(aomyVar6) ? 16384 : 8192;
                    }
                }
                i16 = 32768 & i3;
                if (i16 != 0) {
                    if ((i2 & 196608) == 0) {
                        i13 |= true == cavVarB.D(aomyVar7) ? 131072 : 65536;
                    }
                    i17 = i13;
                    if ((i9 & 306783379) == 306783378) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (cavVarB.H(z9, i9 & 1)) {
                        z15 = (!z24) | z;
                        z16 = z25 & z2;
                        z17 = z26 & z3;
                        z18 = z6 & z4;
                        z19 = z7 & z5;
                        if (i11 != 0) {
                            aomyVar11 = null;
                        } else {
                            aomyVar11 = aomyVar4;
                        }
                        if (i15 != 0) {
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR2 = cbtVar2.R();
                            if (objR2 == defpackage.cau.a) {
                                objR2 = new defpackage.uoq(0);
                                cbtVar2.ab(objR2);
                            }
                            aomyVar12 = (defpackage.aomy) objR2;
                        } else {
                            aomyVar12 = aomyVar6;
                        }
                        if (i16 != 0) {
                            cbtVar = (defpackage.cbt) cavVarB;
                            objR = cbtVar.R();
                            if (objR == defpackage.cau.a) {
                                objR = new defpackage.uoq(2);
                                cbtVar.ab(objR);
                            }
                            aomyVar13 = (defpackage.aomy) objR;
                        } else {
                            aomyVar13 = aomyVar7;
                        }
                        j$.util.Objects.checkIndex(0, 4);
                        if (ttjVar != null) {
                            if (ttjVar instanceof defpackage.und) {
                                uoxVar = new defpackage.uoy(aomyVar);
                            } else {
                                if (ttjVar instanceof une) {
                                    uoxVar = new uoz(aomyVar2);
                                } else if (ttjVar instanceof defpackage.unc) {
                                    defpackage.unc uncVar111 = (defpackage.unc) ttjVar;
                                    java.util.List list111 = uncVar111.a;
                                    arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list111, 10));
                                    it = list111.iterator();
                                    while (it.hasNext()) {
                                        umyVar = (umy) it.next();
                                        java.util.Iterator it112 = it;
                                        boolean z211117 = z19;
                                        long j11111 = umyVar.c;
                                        long j11112 = umyVar.a;
                                        java.lang.String str112 = umyVar.e;
                                        android.net.Uri uri111 = umyVar.f;
                                        unfVar = umyVar.g;
                                        if (unfVar != null) {
                                            i18 = unfVar.e - 1;
                                            if (i18 != 2) {
                                                if (true != umyVar.j) {
                                                    i19 = 2131231080;
                                                } else {
                                                    i19 = 2131231081;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i19);
                                            } else if (i18 != 3) {
                                                iValueOf = 2131231080;
                                            } else if (i18 != 4) {
                                                if (true != umyVar.i) {
                                                    i20 = 2131231060;
                                                } else {
                                                    i20 = 2131231083;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i20);
                                            } else {
                                                iValueOf = 2131231991;
                                            }
                                            num = iValueOf;
                                        } else {
                                            num = null;
                                        }
                                        if (unfVar != null) {
                                            str = unfVar.c;
                                        } else {
                                            str = null;
                                        }
                                        arrayList.add(new uov(j11111, j11112, str112, uri111, num, str, new lpg(str112, umyVar.b)));
                                        z19 = z211117;
                                        it = it112;
                                    }
                                    boolean z211118 = z19;
                                    z20 = false;
                                    uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar111.b, z16, z17, z18, z211118, aomyVar3, aomyVar11);
                                    z21 = z18;
                                    z22 = z211118;
                                    z23 = z17;
                                }
                                cavVar2 = cavVarB;
                                defpackage.aomy aomyVar111114 = aomyVar13;
                                defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar111114, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                if (ttjVar instanceof defpackage.unc) {
                                    cavVar2.u(2094189670);
                                    defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                } else {
                                    cavVar2.u(2094324210);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                }
                                aomyVar10 = aomyVar111114;
                                z13 = z21;
                                aomyVar8 = aomyVar11;
                                aomyVar9 = aomyVar12;
                                z10 = z15;
                                z11 = z16;
                                z14 = z23;
                                z12 = z22;
                            }
                            z23 = z17;
                            z21 = z18;
                            z20 = false;
                            z22 = z19;
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar111115 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar111115, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar111115;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        throw new defpackage.aois();
                    }
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    z10 = z;
                    z11 = z2;
                    aomyVar8 = aomyVar4;
                    aomyVar9 = aomyVar6;
                    aomyVar10 = aomyVar7;
                    z12 = z5;
                    z13 = z4;
                    z14 = z3;
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                    }
                }
                i13 |= 196608;
                i17 = i13;
                if ((i9 & 306783379) == 306783378) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (cavVarB.H(z9, i9 & 1)) {
                    z15 = (!z24) | z;
                    z16 = z25 & z2;
                    z17 = z26 & z3;
                    z18 = z6 & z4;
                    z19 = z7 & z5;
                    if (i11 != 0) {
                        aomyVar11 = null;
                    } else {
                        aomyVar11 = aomyVar4;
                    }
                    if (i15 != 0) {
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (objR2 == defpackage.cau.a) {
                            objR2 = new defpackage.uoq(0);
                            cbtVar2.ab(objR2);
                        }
                        aomyVar12 = (defpackage.aomy) objR2;
                    } else {
                        aomyVar12 = aomyVar6;
                    }
                    if (i16 != 0) {
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = new defpackage.uoq(2);
                            cbtVar.ab(objR);
                        }
                        aomyVar13 = (defpackage.aomy) objR;
                    } else {
                        aomyVar13 = aomyVar7;
                    }
                    j$.util.Objects.checkIndex(0, 4);
                    if (ttjVar != null) {
                        if (ttjVar instanceof defpackage.und) {
                            uoxVar = new defpackage.uoy(aomyVar);
                        } else {
                            if (ttjVar instanceof une) {
                                uoxVar = new uoz(aomyVar2);
                            } else if (ttjVar instanceof defpackage.unc) {
                                defpackage.unc uncVar112 = (defpackage.unc) ttjVar;
                                java.util.List list112 = uncVar112.a;
                                arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list112, 10));
                                it = list112.iterator();
                                while (it.hasNext()) {
                                    umyVar = (umy) it.next();
                                    java.util.Iterator it113 = it;
                                    boolean z211119 = z19;
                                    long j11113 = umyVar.c;
                                    long j11114 = umyVar.a;
                                    java.lang.String str113 = umyVar.e;
                                    android.net.Uri uri112 = umyVar.f;
                                    unfVar = umyVar.g;
                                    if (unfVar != null) {
                                        i18 = unfVar.e - 1;
                                        if (i18 != 2) {
                                            if (true != umyVar.j) {
                                                i19 = 2131231080;
                                            } else {
                                                i19 = 2131231081;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i19);
                                        } else if (i18 != 3) {
                                            iValueOf = 2131231080;
                                        } else if (i18 != 4) {
                                            if (true != umyVar.i) {
                                                i20 = 2131231060;
                                            } else {
                                                i20 = 2131231083;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i20);
                                        } else {
                                            iValueOf = 2131231991;
                                        }
                                        num = iValueOf;
                                    } else {
                                        num = null;
                                    }
                                    if (unfVar != null) {
                                        str = unfVar.c;
                                    } else {
                                        str = null;
                                    }
                                    arrayList.add(new uov(j11113, j11114, str113, uri112, num, str, new lpg(str113, umyVar.b)));
                                    z19 = z211119;
                                    it = it113;
                                }
                                boolean z2111110 = z19;
                                z20 = false;
                                uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar112.b, z16, z17, z18, z2111110, aomyVar3, aomyVar11);
                                z21 = z18;
                                z22 = z2111110;
                                z23 = z17;
                            }
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar111116 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar111116, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar111116;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        z23 = z17;
                        z21 = z18;
                        z20 = false;
                        z22 = z19;
                        cavVar2 = cavVarB;
                        defpackage.aomy aomyVar111117 = aomyVar13;
                        defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar111117, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                        if (ttjVar instanceof defpackage.unc) {
                            cavVar2.u(2094189670);
                            defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                            ((defpackage.cbt) cavVar2).W(z20);
                        } else {
                            cavVar2.u(2094324210);
                            ((defpackage.cbt) cavVar2).W(z20);
                        }
                        aomyVar10 = aomyVar111117;
                        z13 = z21;
                        aomyVar8 = aomyVar11;
                        aomyVar9 = aomyVar12;
                        z10 = z15;
                        z11 = z16;
                        z14 = z23;
                        z12 = z22;
                    }
                    throw new defpackage.aois();
                }
                cavVar2 = cavVarB;
                cavVar2.s();
                z10 = z;
                z11 = z2;
                aomyVar8 = aomyVar4;
                aomyVar9 = aomyVar6;
                aomyVar10 = aomyVar7;
                z12 = z5;
                z13 = z4;
                z14 = z3;
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                }
            }
            i10 |= 48;
            i12 = i10;
            if ((i2 & 384) == 0) {
                i13 = i12 | (true == cavVarB.D(aonnVar) ? 256 : 128);
            } else {
                i13 = i12;
            }
            if ((i2 & 3072) == 0) {
                i13 |= true == cavVarB.D(aomyVar5) ? 2048 : 1024;
            }
            i14 = i3 & 16384;
            if (i14 != 0) {
                i13 |= 24576;
                i15 = i14;
            } else {
                i15 = i14;
                if ((i2 & 24576) == 0) {
                    i13 |= true == cavVarB.D(aomyVar6) ? 16384 : 8192;
                }
            }
            i16 = 32768 & i3;
            if (i16 != 0) {
                if ((i2 & 196608) == 0) {
                    i13 |= true == cavVarB.D(aomyVar7) ? 131072 : 65536;
                }
                i17 = i13;
                if ((i9 & 306783379) == 306783378) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (cavVarB.H(z9, i9 & 1)) {
                    z15 = (!z24) | z;
                    z16 = z25 & z2;
                    z17 = z26 & z3;
                    z18 = z6 & z4;
                    z19 = z7 & z5;
                    if (i11 != 0) {
                        aomyVar11 = null;
                    } else {
                        aomyVar11 = aomyVar4;
                    }
                    if (i15 != 0) {
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (objR2 == defpackage.cau.a) {
                            objR2 = new defpackage.uoq(0);
                            cbtVar2.ab(objR2);
                        }
                        aomyVar12 = (defpackage.aomy) objR2;
                    } else {
                        aomyVar12 = aomyVar6;
                    }
                    if (i16 != 0) {
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = new defpackage.uoq(2);
                            cbtVar.ab(objR);
                        }
                        aomyVar13 = (defpackage.aomy) objR;
                    } else {
                        aomyVar13 = aomyVar7;
                    }
                    j$.util.Objects.checkIndex(0, 4);
                    if (ttjVar != null) {
                        if (ttjVar instanceof defpackage.und) {
                            uoxVar = new defpackage.uoy(aomyVar);
                        } else {
                            if (ttjVar instanceof une) {
                                uoxVar = new uoz(aomyVar2);
                            } else if (ttjVar instanceof defpackage.unc) {
                                defpackage.unc uncVar113 = (defpackage.unc) ttjVar;
                                java.util.List list113 = uncVar113.a;
                                arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list113, 10));
                                it = list113.iterator();
                                while (it.hasNext()) {
                                    umyVar = (umy) it.next();
                                    java.util.Iterator it114 = it;
                                    boolean z2111111 = z19;
                                    long j11115 = umyVar.c;
                                    long j11116 = umyVar.a;
                                    java.lang.String str114 = umyVar.e;
                                    android.net.Uri uri113 = umyVar.f;
                                    unfVar = umyVar.g;
                                    if (unfVar != null) {
                                        i18 = unfVar.e - 1;
                                        if (i18 != 2) {
                                            if (true != umyVar.j) {
                                                i19 = 2131231080;
                                            } else {
                                                i19 = 2131231081;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i19);
                                        } else if (i18 != 3) {
                                            iValueOf = 2131231080;
                                        } else if (i18 != 4) {
                                            if (true != umyVar.i) {
                                                i20 = 2131231060;
                                            } else {
                                                i20 = 2131231083;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i20);
                                        } else {
                                            iValueOf = 2131231991;
                                        }
                                        num = iValueOf;
                                    } else {
                                        num = null;
                                    }
                                    if (unfVar != null) {
                                        str = unfVar.c;
                                    } else {
                                        str = null;
                                    }
                                    arrayList.add(new uov(j11115, j11116, str114, uri113, num, str, new lpg(str114, umyVar.b)));
                                    z19 = z2111111;
                                    it = it114;
                                }
                                boolean z2111112 = z19;
                                z20 = false;
                                uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar113.b, z16, z17, z18, z2111112, aomyVar3, aomyVar11);
                                z21 = z18;
                                z22 = z2111112;
                                z23 = z17;
                            }
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar111118 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar111118, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar111118;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        z23 = z17;
                        z21 = z18;
                        z20 = false;
                        z22 = z19;
                        cavVar2 = cavVarB;
                        defpackage.aomy aomyVar111119 = aomyVar13;
                        defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar111119, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                        if (ttjVar instanceof defpackage.unc) {
                            cavVar2.u(2094189670);
                            defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                            ((defpackage.cbt) cavVar2).W(z20);
                        } else {
                            cavVar2.u(2094324210);
                            ((defpackage.cbt) cavVar2).W(z20);
                        }
                        aomyVar10 = aomyVar111119;
                        z13 = z21;
                        aomyVar8 = aomyVar11;
                        aomyVar9 = aomyVar12;
                        z10 = z15;
                        z11 = z16;
                        z14 = z23;
                        z12 = z22;
                    }
                    throw new defpackage.aois();
                }
                cavVar2 = cavVarB;
                cavVar2.s();
                z10 = z;
                z11 = z2;
                aomyVar8 = aomyVar4;
                aomyVar9 = aomyVar6;
                aomyVar10 = aomyVar7;
                z12 = z5;
                z13 = z4;
                z14 = z3;
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                }
            }
            i13 |= 196608;
            i17 = i13;
            if ((i9 & 306783379) == 306783378) {
                z9 = true;
            } else {
                z9 = true;
            }
            if (cavVarB.H(z9, i9 & 1)) {
                z15 = (!z24) | z;
                z16 = z25 & z2;
                z17 = z26 & z3;
                z18 = z6 & z4;
                z19 = z7 & z5;
                if (i11 != 0) {
                    aomyVar11 = null;
                } else {
                    aomyVar11 = aomyVar4;
                }
                if (i15 != 0) {
                    cbtVar2 = (defpackage.cbt) cavVarB;
                    objR2 = cbtVar2.R();
                    if (objR2 == defpackage.cau.a) {
                        objR2 = new defpackage.uoq(0);
                        cbtVar2.ab(objR2);
                    }
                    aomyVar12 = (defpackage.aomy) objR2;
                } else {
                    aomyVar12 = aomyVar6;
                }
                if (i16 != 0) {
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = new defpackage.uoq(2);
                        cbtVar.ab(objR);
                    }
                    aomyVar13 = (defpackage.aomy) objR;
                } else {
                    aomyVar13 = aomyVar7;
                }
                j$.util.Objects.checkIndex(0, 4);
                if (ttjVar != null) {
                    if (ttjVar instanceof defpackage.und) {
                        uoxVar = new defpackage.uoy(aomyVar);
                    } else {
                        if (ttjVar instanceof une) {
                            uoxVar = new uoz(aomyVar2);
                        } else if (ttjVar instanceof defpackage.unc) {
                            defpackage.unc uncVar114 = (defpackage.unc) ttjVar;
                            java.util.List list114 = uncVar114.a;
                            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list114, 10));
                            it = list114.iterator();
                            while (it.hasNext()) {
                                umyVar = (umy) it.next();
                                java.util.Iterator it115 = it;
                                boolean z2111113 = z19;
                                long j11117 = umyVar.c;
                                long j11118 = umyVar.a;
                                java.lang.String str115 = umyVar.e;
                                android.net.Uri uri114 = umyVar.f;
                                unfVar = umyVar.g;
                                if (unfVar != null) {
                                    i18 = unfVar.e - 1;
                                    if (i18 != 2) {
                                        if (true != umyVar.j) {
                                            i19 = 2131231080;
                                        } else {
                                            i19 = 2131231081;
                                        }
                                        iValueOf = java.lang.Integer.valueOf(i19);
                                    } else if (i18 != 3) {
                                        iValueOf = 2131231080;
                                    } else if (i18 != 4) {
                                        if (true != umyVar.i) {
                                            i20 = 2131231060;
                                        } else {
                                            i20 = 2131231083;
                                        }
                                        iValueOf = java.lang.Integer.valueOf(i20);
                                    } else {
                                        iValueOf = 2131231991;
                                    }
                                    num = iValueOf;
                                } else {
                                    num = null;
                                }
                                if (unfVar != null) {
                                    str = unfVar.c;
                                } else {
                                    str = null;
                                }
                                arrayList.add(new uov(j11117, j11118, str115, uri114, num, str, new lpg(str115, umyVar.b)));
                                z19 = z2111113;
                                it = it115;
                            }
                            boolean z2111114 = z19;
                            z20 = false;
                            uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar114.b, z16, z17, z18, z2111114, aomyVar3, aomyVar11);
                            z21 = z18;
                            z22 = z2111114;
                            z23 = z17;
                        }
                        cavVar2 = cavVarB;
                        defpackage.aomy aomyVar1111110 = aomyVar13;
                        defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1111110, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                        if (ttjVar instanceof defpackage.unc) {
                            cavVar2.u(2094189670);
                            defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                            ((defpackage.cbt) cavVar2).W(z20);
                        } else {
                            cavVar2.u(2094324210);
                            ((defpackage.cbt) cavVar2).W(z20);
                        }
                        aomyVar10 = aomyVar1111110;
                        z13 = z21;
                        aomyVar8 = aomyVar11;
                        aomyVar9 = aomyVar12;
                        z10 = z15;
                        z11 = z16;
                        z14 = z23;
                        z12 = z22;
                    }
                    z23 = z17;
                    z21 = z18;
                    z20 = false;
                    z22 = z19;
                    cavVar2 = cavVarB;
                    defpackage.aomy aomyVar1111111 = aomyVar13;
                    defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1111111, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                    if (ttjVar instanceof defpackage.unc) {
                        cavVar2.u(2094189670);
                        defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                        ((defpackage.cbt) cavVar2).W(z20);
                    } else {
                        cavVar2.u(2094324210);
                        ((defpackage.cbt) cavVar2).W(z20);
                    }
                    aomyVar10 = aomyVar1111111;
                    z13 = z21;
                    aomyVar8 = aomyVar11;
                    aomyVar9 = aomyVar12;
                    z10 = z15;
                    z11 = z16;
                    z14 = z23;
                    z12 = z22;
                }
                throw new defpackage.aois();
            }
            cavVar2 = cavVarB;
            cavVar2.s();
            z10 = z;
            z11 = z2;
            aomyVar8 = aomyVar4;
            aomyVar9 = aomyVar6;
            aomyVar10 = aomyVar7;
            z12 = z5;
            z13 = z4;
            z14 = z3;
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
            }
        }
        i4 |= 24576;
        i7 = i3 & 32;
        if (i7 != 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (i7 != 0) {
            if ((i & 196608) == 0) {
                z8 = true;
                if (true != cavVarB.C(z5)) {
                    i8 = 65536;
                } else {
                    i8 = 131072;
                }
                i4 |= i8;
            }
            if ((1572864 & i) == 0) {
                if (z8 != cavVarB.D(aomyVar)) {
                    i25 = 524288;
                } else {
                    i25 = 1048576;
                }
                i4 |= i25;
            }
            if ((12582912 & i) == 0) {
                if (true != cavVarB.D(aomyVar2)) {
                    i24 = 4194304;
                } else {
                    i24 = 8388608;
                }
                i4 |= i24;
            }
            if ((100663296 & i) == 0) {
                if (true != cavVarB.D(aonjVar)) {
                    i23 = 33554432;
                } else {
                    i23 = 67108864;
                }
                i4 |= i23;
            }
            if ((805306368 & i) == 0) {
                if (true != cavVarB.D(aonjVar2)) {
                    i22 = 268435456;
                } else {
                    i22 = 536870912;
                }
                i4 |= i22;
            }
            i9 = i4;
            if ((i2 & 6) == 0) {
                if (true != cavVarB.D(aomyVar3)) {
                    i21 = 2;
                } else {
                    i21 = 4;
                }
                i10 = i2 | i21;
            } else {
                i10 = i2;
            }
            i11 = i3 & 2048;
            if (i11 != 0) {
                if ((i2 & 48) == 0) {
                    i10 |= true == cavVarB.D(aomyVar4) ? 32 : 16;
                }
                i12 = i10;
                if ((i2 & 384) == 0) {
                    i13 = i12 | (true == cavVarB.D(aonnVar) ? 256 : 128);
                } else {
                    i13 = i12;
                }
                if ((i2 & 3072) == 0) {
                    i13 |= true == cavVarB.D(aomyVar5) ? 2048 : 1024;
                }
                i14 = i3 & 16384;
                if (i14 != 0) {
                    i13 |= 24576;
                    i15 = i14;
                } else {
                    i15 = i14;
                    if ((i2 & 24576) == 0) {
                        i13 |= true == cavVarB.D(aomyVar6) ? 16384 : 8192;
                    }
                }
                i16 = 32768 & i3;
                if (i16 != 0) {
                    if ((i2 & 196608) == 0) {
                        i13 |= true == cavVarB.D(aomyVar7) ? 131072 : 65536;
                    }
                    i17 = i13;
                    if ((i9 & 306783379) == 306783378) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (cavVarB.H(z9, i9 & 1)) {
                        z15 = (!z24) | z;
                        z16 = z25 & z2;
                        z17 = z26 & z3;
                        z18 = z6 & z4;
                        z19 = z7 & z5;
                        if (i11 != 0) {
                            aomyVar11 = null;
                        } else {
                            aomyVar11 = aomyVar4;
                        }
                        if (i15 != 0) {
                            cbtVar2 = (defpackage.cbt) cavVarB;
                            objR2 = cbtVar2.R();
                            if (objR2 == defpackage.cau.a) {
                                objR2 = new defpackage.uoq(0);
                                cbtVar2.ab(objR2);
                            }
                            aomyVar12 = (defpackage.aomy) objR2;
                        } else {
                            aomyVar12 = aomyVar6;
                        }
                        if (i16 != 0) {
                            cbtVar = (defpackage.cbt) cavVarB;
                            objR = cbtVar.R();
                            if (objR == defpackage.cau.a) {
                                objR = new defpackage.uoq(2);
                                cbtVar.ab(objR);
                            }
                            aomyVar13 = (defpackage.aomy) objR;
                        } else {
                            aomyVar13 = aomyVar7;
                        }
                        j$.util.Objects.checkIndex(0, 4);
                        if (ttjVar != null) {
                            if (ttjVar instanceof defpackage.und) {
                                uoxVar = new defpackage.uoy(aomyVar);
                            } else {
                                if (ttjVar instanceof une) {
                                    uoxVar = new uoz(aomyVar2);
                                } else if (ttjVar instanceof defpackage.unc) {
                                    defpackage.unc uncVar115 = (defpackage.unc) ttjVar;
                                    java.util.List list115 = uncVar115.a;
                                    arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list115, 10));
                                    it = list115.iterator();
                                    while (it.hasNext()) {
                                        umyVar = (umy) it.next();
                                        java.util.Iterator it116 = it;
                                        boolean z2111115 = z19;
                                        long j11119 = umyVar.c;
                                        long j111110 = umyVar.a;
                                        java.lang.String str116 = umyVar.e;
                                        android.net.Uri uri115 = umyVar.f;
                                        unfVar = umyVar.g;
                                        if (unfVar != null) {
                                            i18 = unfVar.e - 1;
                                            if (i18 != 2) {
                                                if (true != umyVar.j) {
                                                    i19 = 2131231080;
                                                } else {
                                                    i19 = 2131231081;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i19);
                                            } else if (i18 != 3) {
                                                iValueOf = 2131231080;
                                            } else if (i18 != 4) {
                                                if (true != umyVar.i) {
                                                    i20 = 2131231060;
                                                } else {
                                                    i20 = 2131231083;
                                                }
                                                iValueOf = java.lang.Integer.valueOf(i20);
                                            } else {
                                                iValueOf = 2131231991;
                                            }
                                            num = iValueOf;
                                        } else {
                                            num = null;
                                        }
                                        if (unfVar != null) {
                                            str = unfVar.c;
                                        } else {
                                            str = null;
                                        }
                                        arrayList.add(new uov(j11119, j111110, str116, uri115, num, str, new lpg(str116, umyVar.b)));
                                        z19 = z2111115;
                                        it = it116;
                                    }
                                    boolean z2111116 = z19;
                                    z20 = false;
                                    uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar115.b, z16, z17, z18, z2111116, aomyVar3, aomyVar11);
                                    z21 = z18;
                                    z22 = z2111116;
                                    z23 = z17;
                                }
                                cavVar2 = cavVarB;
                                defpackage.aomy aomyVar1111112 = aomyVar13;
                                defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1111112, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                                if (ttjVar instanceof defpackage.unc) {
                                    cavVar2.u(2094189670);
                                    defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                } else {
                                    cavVar2.u(2094324210);
                                    ((defpackage.cbt) cavVar2).W(z20);
                                }
                                aomyVar10 = aomyVar1111112;
                                z13 = z21;
                                aomyVar8 = aomyVar11;
                                aomyVar9 = aomyVar12;
                                z10 = z15;
                                z11 = z16;
                                z14 = z23;
                                z12 = z22;
                            }
                            z23 = z17;
                            z21 = z18;
                            z20 = false;
                            z22 = z19;
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar1111113 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1111113, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar1111113;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        throw new defpackage.aois();
                    }
                    cavVar2 = cavVarB;
                    cavVar2.s();
                    z10 = z;
                    z11 = z2;
                    aomyVar8 = aomyVar4;
                    aomyVar9 = aomyVar6;
                    aomyVar10 = aomyVar7;
                    z12 = z5;
                    z13 = z4;
                    z14 = z3;
                    cdkVarI = cavVar2.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                    }
                }
                i13 |= 196608;
                i17 = i13;
                if ((i9 & 306783379) == 306783378) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (cavVarB.H(z9, i9 & 1)) {
                    z15 = (!z24) | z;
                    z16 = z25 & z2;
                    z17 = z26 & z3;
                    z18 = z6 & z4;
                    z19 = z7 & z5;
                    if (i11 != 0) {
                        aomyVar11 = null;
                    } else {
                        aomyVar11 = aomyVar4;
                    }
                    if (i15 != 0) {
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (objR2 == defpackage.cau.a) {
                            objR2 = new defpackage.uoq(0);
                            cbtVar2.ab(objR2);
                        }
                        aomyVar12 = (defpackage.aomy) objR2;
                    } else {
                        aomyVar12 = aomyVar6;
                    }
                    if (i16 != 0) {
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = new defpackage.uoq(2);
                            cbtVar.ab(objR);
                        }
                        aomyVar13 = (defpackage.aomy) objR;
                    } else {
                        aomyVar13 = aomyVar7;
                    }
                    j$.util.Objects.checkIndex(0, 4);
                    if (ttjVar != null) {
                        if (ttjVar instanceof defpackage.und) {
                            uoxVar = new defpackage.uoy(aomyVar);
                        } else {
                            if (ttjVar instanceof une) {
                                uoxVar = new uoz(aomyVar2);
                            } else if (ttjVar instanceof defpackage.unc) {
                                defpackage.unc uncVar116 = (defpackage.unc) ttjVar;
                                java.util.List list116 = uncVar116.a;
                                arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list116, 10));
                                it = list116.iterator();
                                while (it.hasNext()) {
                                    umyVar = (umy) it.next();
                                    java.util.Iterator it117 = it;
                                    boolean z2111117 = z19;
                                    long j111111 = umyVar.c;
                                    long j111112 = umyVar.a;
                                    java.lang.String str117 = umyVar.e;
                                    android.net.Uri uri116 = umyVar.f;
                                    unfVar = umyVar.g;
                                    if (unfVar != null) {
                                        i18 = unfVar.e - 1;
                                        if (i18 != 2) {
                                            if (true != umyVar.j) {
                                                i19 = 2131231080;
                                            } else {
                                                i19 = 2131231081;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i19);
                                        } else if (i18 != 3) {
                                            iValueOf = 2131231080;
                                        } else if (i18 != 4) {
                                            if (true != umyVar.i) {
                                                i20 = 2131231060;
                                            } else {
                                                i20 = 2131231083;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i20);
                                        } else {
                                            iValueOf = 2131231991;
                                        }
                                        num = iValueOf;
                                    } else {
                                        num = null;
                                    }
                                    if (unfVar != null) {
                                        str = unfVar.c;
                                    } else {
                                        str = null;
                                    }
                                    arrayList.add(new uov(j111111, j111112, str117, uri116, num, str, new lpg(str117, umyVar.b)));
                                    z19 = z2111117;
                                    it = it117;
                                }
                                boolean z2111118 = z19;
                                z20 = false;
                                uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar116.b, z16, z17, z18, z2111118, aomyVar3, aomyVar11);
                                z21 = z18;
                                z22 = z2111118;
                                z23 = z17;
                            }
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar1111114 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1111114, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar1111114;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        z23 = z17;
                        z21 = z18;
                        z20 = false;
                        z22 = z19;
                        cavVar2 = cavVarB;
                        defpackage.aomy aomyVar1111115 = aomyVar13;
                        defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1111115, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                        if (ttjVar instanceof defpackage.unc) {
                            cavVar2.u(2094189670);
                            defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                            ((defpackage.cbt) cavVar2).W(z20);
                        } else {
                            cavVar2.u(2094324210);
                            ((defpackage.cbt) cavVar2).W(z20);
                        }
                        aomyVar10 = aomyVar1111115;
                        z13 = z21;
                        aomyVar8 = aomyVar11;
                        aomyVar9 = aomyVar12;
                        z10 = z15;
                        z11 = z16;
                        z14 = z23;
                        z12 = z22;
                    }
                    throw new defpackage.aois();
                }
                cavVar2 = cavVarB;
                cavVar2.s();
                z10 = z;
                z11 = z2;
                aomyVar8 = aomyVar4;
                aomyVar9 = aomyVar6;
                aomyVar10 = aomyVar7;
                z12 = z5;
                z13 = z4;
                z14 = z3;
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                }
            }
            i10 |= 48;
            i12 = i10;
            if ((i2 & 384) == 0) {
                i13 = i12 | (true == cavVarB.D(aonnVar) ? 256 : 128);
            } else {
                i13 = i12;
            }
            if ((i2 & 3072) == 0) {
                i13 |= true == cavVarB.D(aomyVar5) ? 2048 : 1024;
            }
            i14 = i3 & 16384;
            if (i14 != 0) {
                i13 |= 24576;
                i15 = i14;
            } else {
                i15 = i14;
                if ((i2 & 24576) == 0) {
                    i13 |= true == cavVarB.D(aomyVar6) ? 16384 : 8192;
                }
            }
            i16 = 32768 & i3;
            if (i16 != 0) {
                if ((i2 & 196608) == 0) {
                    i13 |= true == cavVarB.D(aomyVar7) ? 131072 : 65536;
                }
                i17 = i13;
                if ((i9 & 306783379) == 306783378) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (cavVarB.H(z9, i9 & 1)) {
                    z15 = (!z24) | z;
                    z16 = z25 & z2;
                    z17 = z26 & z3;
                    z18 = z6 & z4;
                    z19 = z7 & z5;
                    if (i11 != 0) {
                        aomyVar11 = null;
                    } else {
                        aomyVar11 = aomyVar4;
                    }
                    if (i15 != 0) {
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (objR2 == defpackage.cau.a) {
                            objR2 = new defpackage.uoq(0);
                            cbtVar2.ab(objR2);
                        }
                        aomyVar12 = (defpackage.aomy) objR2;
                    } else {
                        aomyVar12 = aomyVar6;
                    }
                    if (i16 != 0) {
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = new defpackage.uoq(2);
                            cbtVar.ab(objR);
                        }
                        aomyVar13 = (defpackage.aomy) objR;
                    } else {
                        aomyVar13 = aomyVar7;
                    }
                    j$.util.Objects.checkIndex(0, 4);
                    if (ttjVar != null) {
                        if (ttjVar instanceof defpackage.und) {
                            uoxVar = new defpackage.uoy(aomyVar);
                        } else {
                            if (ttjVar instanceof une) {
                                uoxVar = new uoz(aomyVar2);
                            } else if (ttjVar instanceof defpackage.unc) {
                                defpackage.unc uncVar117 = (defpackage.unc) ttjVar;
                                java.util.List list117 = uncVar117.a;
                                arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list117, 10));
                                it = list117.iterator();
                                while (it.hasNext()) {
                                    umyVar = (umy) it.next();
                                    java.util.Iterator it118 = it;
                                    boolean z2111119 = z19;
                                    long j111113 = umyVar.c;
                                    long j111114 = umyVar.a;
                                    java.lang.String str118 = umyVar.e;
                                    android.net.Uri uri117 = umyVar.f;
                                    unfVar = umyVar.g;
                                    if (unfVar != null) {
                                        i18 = unfVar.e - 1;
                                        if (i18 != 2) {
                                            if (true != umyVar.j) {
                                                i19 = 2131231080;
                                            } else {
                                                i19 = 2131231081;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i19);
                                        } else if (i18 != 3) {
                                            iValueOf = 2131231080;
                                        } else if (i18 != 4) {
                                            if (true != umyVar.i) {
                                                i20 = 2131231060;
                                            } else {
                                                i20 = 2131231083;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i20);
                                        } else {
                                            iValueOf = 2131231991;
                                        }
                                        num = iValueOf;
                                    } else {
                                        num = null;
                                    }
                                    if (unfVar != null) {
                                        str = unfVar.c;
                                    } else {
                                        str = null;
                                    }
                                    arrayList.add(new uov(j111113, j111114, str118, uri117, num, str, new lpg(str118, umyVar.b)));
                                    z19 = z2111119;
                                    it = it118;
                                }
                                boolean z21111110 = z19;
                                z20 = false;
                                uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar117.b, z16, z17, z18, z21111110, aomyVar3, aomyVar11);
                                z21 = z18;
                                z22 = z21111110;
                                z23 = z17;
                            }
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar1111116 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1111116, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar1111116;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        z23 = z17;
                        z21 = z18;
                        z20 = false;
                        z22 = z19;
                        cavVar2 = cavVarB;
                        defpackage.aomy aomyVar1111117 = aomyVar13;
                        defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1111117, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                        if (ttjVar instanceof defpackage.unc) {
                            cavVar2.u(2094189670);
                            defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                            ((defpackage.cbt) cavVar2).W(z20);
                        } else {
                            cavVar2.u(2094324210);
                            ((defpackage.cbt) cavVar2).W(z20);
                        }
                        aomyVar10 = aomyVar1111117;
                        z13 = z21;
                        aomyVar8 = aomyVar11;
                        aomyVar9 = aomyVar12;
                        z10 = z15;
                        z11 = z16;
                        z14 = z23;
                        z12 = z22;
                    }
                    throw new defpackage.aois();
                }
                cavVar2 = cavVarB;
                cavVar2.s();
                z10 = z;
                z11 = z2;
                aomyVar8 = aomyVar4;
                aomyVar9 = aomyVar6;
                aomyVar10 = aomyVar7;
                z12 = z5;
                z13 = z4;
                z14 = z3;
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                }
            }
            i13 |= 196608;
            i17 = i13;
            if ((i9 & 306783379) == 306783378) {
                z9 = true;
            } else {
                z9 = true;
            }
            if (cavVarB.H(z9, i9 & 1)) {
                z15 = (!z24) | z;
                z16 = z25 & z2;
                z17 = z26 & z3;
                z18 = z6 & z4;
                z19 = z7 & z5;
                if (i11 != 0) {
                    aomyVar11 = null;
                } else {
                    aomyVar11 = aomyVar4;
                }
                if (i15 != 0) {
                    cbtVar2 = (defpackage.cbt) cavVarB;
                    objR2 = cbtVar2.R();
                    if (objR2 == defpackage.cau.a) {
                        objR2 = new defpackage.uoq(0);
                        cbtVar2.ab(objR2);
                    }
                    aomyVar12 = (defpackage.aomy) objR2;
                } else {
                    aomyVar12 = aomyVar6;
                }
                if (i16 != 0) {
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = new defpackage.uoq(2);
                        cbtVar.ab(objR);
                    }
                    aomyVar13 = (defpackage.aomy) objR;
                } else {
                    aomyVar13 = aomyVar7;
                }
                j$.util.Objects.checkIndex(0, 4);
                if (ttjVar != null) {
                    if (ttjVar instanceof defpackage.und) {
                        uoxVar = new defpackage.uoy(aomyVar);
                    } else {
                        if (ttjVar instanceof une) {
                            uoxVar = new uoz(aomyVar2);
                        } else if (ttjVar instanceof defpackage.unc) {
                            defpackage.unc uncVar118 = (defpackage.unc) ttjVar;
                            java.util.List list118 = uncVar118.a;
                            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list118, 10));
                            it = list118.iterator();
                            while (it.hasNext()) {
                                umyVar = (umy) it.next();
                                java.util.Iterator it119 = it;
                                boolean z21111111 = z19;
                                long j111115 = umyVar.c;
                                long j111116 = umyVar.a;
                                java.lang.String str119 = umyVar.e;
                                android.net.Uri uri118 = umyVar.f;
                                unfVar = umyVar.g;
                                if (unfVar != null) {
                                    i18 = unfVar.e - 1;
                                    if (i18 != 2) {
                                        if (true != umyVar.j) {
                                            i19 = 2131231080;
                                        } else {
                                            i19 = 2131231081;
                                        }
                                        iValueOf = java.lang.Integer.valueOf(i19);
                                    } else if (i18 != 3) {
                                        iValueOf = 2131231080;
                                    } else if (i18 != 4) {
                                        if (true != umyVar.i) {
                                            i20 = 2131231060;
                                        } else {
                                            i20 = 2131231083;
                                        }
                                        iValueOf = java.lang.Integer.valueOf(i20);
                                    } else {
                                        iValueOf = 2131231991;
                                    }
                                    num = iValueOf;
                                } else {
                                    num = null;
                                }
                                if (unfVar != null) {
                                    str = unfVar.c;
                                } else {
                                    str = null;
                                }
                                arrayList.add(new uov(j111115, j111116, str119, uri118, num, str, new lpg(str119, umyVar.b)));
                                z19 = z21111111;
                                it = it119;
                            }
                            boolean z21111112 = z19;
                            z20 = false;
                            uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar118.b, z16, z17, z18, z21111112, aomyVar3, aomyVar11);
                            z21 = z18;
                            z22 = z21111112;
                            z23 = z17;
                        }
                        cavVar2 = cavVarB;
                        defpackage.aomy aomyVar1111118 = aomyVar13;
                        defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1111118, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                        if (ttjVar instanceof defpackage.unc) {
                            cavVar2.u(2094189670);
                            defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                            ((defpackage.cbt) cavVar2).W(z20);
                        } else {
                            cavVar2.u(2094324210);
                            ((defpackage.cbt) cavVar2).W(z20);
                        }
                        aomyVar10 = aomyVar1111118;
                        z13 = z21;
                        aomyVar8 = aomyVar11;
                        aomyVar9 = aomyVar12;
                        z10 = z15;
                        z11 = z16;
                        z14 = z23;
                        z12 = z22;
                    }
                    z23 = z17;
                    z21 = z18;
                    z20 = false;
                    z22 = z19;
                    cavVar2 = cavVarB;
                    defpackage.aomy aomyVar1111119 = aomyVar13;
                    defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar1111119, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                    if (ttjVar instanceof defpackage.unc) {
                        cavVar2.u(2094189670);
                        defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                        ((defpackage.cbt) cavVar2).W(z20);
                    } else {
                        cavVar2.u(2094324210);
                        ((defpackage.cbt) cavVar2).W(z20);
                    }
                    aomyVar10 = aomyVar1111119;
                    z13 = z21;
                    aomyVar8 = aomyVar11;
                    aomyVar9 = aomyVar12;
                    z10 = z15;
                    z11 = z16;
                    z14 = z23;
                    z12 = z22;
                }
                throw new defpackage.aois();
            }
            cavVar2 = cavVarB;
            cavVar2.s();
            z10 = z;
            z11 = z2;
            aomyVar8 = aomyVar4;
            aomyVar9 = aomyVar6;
            aomyVar10 = aomyVar7;
            z12 = z5;
            z13 = z4;
            z14 = z3;
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
            }
        }
        i4 |= 196608;
        z8 = true;
        if ((1572864 & i) == 0) {
            if (z8 != cavVarB.D(aomyVar)) {
                i25 = 524288;
            } else {
                i25 = 1048576;
            }
            i4 |= i25;
        }
        if ((12582912 & i) == 0) {
            if (true != cavVarB.D(aomyVar2)) {
                i24 = 4194304;
            } else {
                i24 = 8388608;
            }
            i4 |= i24;
        }
        if ((100663296 & i) == 0) {
            if (true != cavVarB.D(aonjVar)) {
                i23 = 33554432;
            } else {
                i23 = 67108864;
            }
            i4 |= i23;
        }
        if ((805306368 & i) == 0) {
            if (true != cavVarB.D(aonjVar2)) {
                i22 = 268435456;
            } else {
                i22 = 536870912;
            }
            i4 |= i22;
        }
        i9 = i4;
        if ((i2 & 6) == 0) {
            if (true != cavVarB.D(aomyVar3)) {
                i21 = 2;
            } else {
                i21 = 4;
            }
            i10 = i2 | i21;
        } else {
            i10 = i2;
        }
        i11 = i3 & 2048;
        if (i11 != 0) {
            if ((i2 & 48) == 0) {
                i10 |= true == cavVarB.D(aomyVar4) ? 32 : 16;
            }
            i12 = i10;
            if ((i2 & 384) == 0) {
                i13 = i12 | (true == cavVarB.D(aonnVar) ? 256 : 128);
            } else {
                i13 = i12;
            }
            if ((i2 & 3072) == 0) {
                i13 |= true == cavVarB.D(aomyVar5) ? 2048 : 1024;
            }
            i14 = i3 & 16384;
            if (i14 != 0) {
                i13 |= 24576;
                i15 = i14;
            } else {
                i15 = i14;
                if ((i2 & 24576) == 0) {
                    i13 |= true == cavVarB.D(aomyVar6) ? 16384 : 8192;
                }
            }
            i16 = 32768 & i3;
            if (i16 != 0) {
                if ((i2 & 196608) == 0) {
                    i13 |= true == cavVarB.D(aomyVar7) ? 131072 : 65536;
                }
                i17 = i13;
                if ((i9 & 306783379) == 306783378) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (cavVarB.H(z9, i9 & 1)) {
                    z15 = (!z24) | z;
                    z16 = z25 & z2;
                    z17 = z26 & z3;
                    z18 = z6 & z4;
                    z19 = z7 & z5;
                    if (i11 != 0) {
                        aomyVar11 = null;
                    } else {
                        aomyVar11 = aomyVar4;
                    }
                    if (i15 != 0) {
                        cbtVar2 = (defpackage.cbt) cavVarB;
                        objR2 = cbtVar2.R();
                        if (objR2 == defpackage.cau.a) {
                            objR2 = new defpackage.uoq(0);
                            cbtVar2.ab(objR2);
                        }
                        aomyVar12 = (defpackage.aomy) objR2;
                    } else {
                        aomyVar12 = aomyVar6;
                    }
                    if (i16 != 0) {
                        cbtVar = (defpackage.cbt) cavVarB;
                        objR = cbtVar.R();
                        if (objR == defpackage.cau.a) {
                            objR = new defpackage.uoq(2);
                            cbtVar.ab(objR);
                        }
                        aomyVar13 = (defpackage.aomy) objR;
                    } else {
                        aomyVar13 = aomyVar7;
                    }
                    j$.util.Objects.checkIndex(0, 4);
                    if (ttjVar != null) {
                        if (ttjVar instanceof defpackage.und) {
                            uoxVar = new defpackage.uoy(aomyVar);
                        } else {
                            if (ttjVar instanceof une) {
                                uoxVar = new uoz(aomyVar2);
                            } else if (ttjVar instanceof defpackage.unc) {
                                defpackage.unc uncVar119 = (defpackage.unc) ttjVar;
                                java.util.List list119 = uncVar119.a;
                                arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list119, 10));
                                it = list119.iterator();
                                while (it.hasNext()) {
                                    umyVar = (umy) it.next();
                                    java.util.Iterator it1110 = it;
                                    boolean z21111113 = z19;
                                    long j111117 = umyVar.c;
                                    long j111118 = umyVar.a;
                                    java.lang.String str1110 = umyVar.e;
                                    android.net.Uri uri119 = umyVar.f;
                                    unfVar = umyVar.g;
                                    if (unfVar != null) {
                                        i18 = unfVar.e - 1;
                                        if (i18 != 2) {
                                            if (true != umyVar.j) {
                                                i19 = 2131231080;
                                            } else {
                                                i19 = 2131231081;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i19);
                                        } else if (i18 != 3) {
                                            iValueOf = 2131231080;
                                        } else if (i18 != 4) {
                                            if (true != umyVar.i) {
                                                i20 = 2131231060;
                                            } else {
                                                i20 = 2131231083;
                                            }
                                            iValueOf = java.lang.Integer.valueOf(i20);
                                        } else {
                                            iValueOf = 2131231991;
                                        }
                                        num = iValueOf;
                                    } else {
                                        num = null;
                                    }
                                    if (unfVar != null) {
                                        str = unfVar.c;
                                    } else {
                                        str = null;
                                    }
                                    arrayList.add(new uov(j111117, j111118, str1110, uri119, num, str, new lpg(str1110, umyVar.b)));
                                    z19 = z21111113;
                                    it = it1110;
                                }
                                boolean z21111114 = z19;
                                z20 = false;
                                uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar119.b, z16, z17, z18, z21111114, aomyVar3, aomyVar11);
                                z21 = z18;
                                z22 = z21111114;
                                z23 = z17;
                            }
                            cavVar2 = cavVarB;
                            defpackage.aomy aomyVar11111110 = aomyVar13;
                            defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar11111110, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                            if (ttjVar instanceof defpackage.unc) {
                                cavVar2.u(2094189670);
                                defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                                ((defpackage.cbt) cavVar2).W(z20);
                            } else {
                                cavVar2.u(2094324210);
                                ((defpackage.cbt) cavVar2).W(z20);
                            }
                            aomyVar10 = aomyVar11111110;
                            z13 = z21;
                            aomyVar8 = aomyVar11;
                            aomyVar9 = aomyVar12;
                            z10 = z15;
                            z11 = z16;
                            z14 = z23;
                            z12 = z22;
                        }
                        z23 = z17;
                        z21 = z18;
                        z20 = false;
                        z22 = z19;
                        cavVar2 = cavVarB;
                        defpackage.aomy aomyVar11111111 = aomyVar13;
                        defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar11111111, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                        if (ttjVar instanceof defpackage.unc) {
                            cavVar2.u(2094189670);
                            defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                            ((defpackage.cbt) cavVar2).W(z20);
                        } else {
                            cavVar2.u(2094324210);
                            ((defpackage.cbt) cavVar2).W(z20);
                        }
                        aomyVar10 = aomyVar11111111;
                        z13 = z21;
                        aomyVar8 = aomyVar11;
                        aomyVar9 = aomyVar12;
                        z10 = z15;
                        z11 = z16;
                        z14 = z23;
                        z12 = z22;
                    }
                    throw new defpackage.aois();
                }
                cavVar2 = cavVarB;
                cavVar2.s();
                z10 = z;
                z11 = z2;
                aomyVar8 = aomyVar4;
                aomyVar9 = aomyVar6;
                aomyVar10 = aomyVar7;
                z12 = z5;
                z13 = z4;
                z14 = z3;
                cdkVarI = cavVar2.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
                }
            }
            i13 |= 196608;
            i17 = i13;
            if ((i9 & 306783379) == 306783378) {
                z9 = true;
            } else {
                z9 = true;
            }
            if (cavVarB.H(z9, i9 & 1)) {
                z15 = (!z24) | z;
                z16 = z25 & z2;
                z17 = z26 & z3;
                z18 = z6 & z4;
                z19 = z7 & z5;
                if (i11 != 0) {
                    aomyVar11 = null;
                } else {
                    aomyVar11 = aomyVar4;
                }
                if (i15 != 0) {
                    cbtVar2 = (defpackage.cbt) cavVarB;
                    objR2 = cbtVar2.R();
                    if (objR2 == defpackage.cau.a) {
                        objR2 = new defpackage.uoq(0);
                        cbtVar2.ab(objR2);
                    }
                    aomyVar12 = (defpackage.aomy) objR2;
                } else {
                    aomyVar12 = aomyVar6;
                }
                if (i16 != 0) {
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = new defpackage.uoq(2);
                        cbtVar.ab(objR);
                    }
                    aomyVar13 = (defpackage.aomy) objR;
                } else {
                    aomyVar13 = aomyVar7;
                }
                j$.util.Objects.checkIndex(0, 4);
                if (ttjVar != null) {
                    if (ttjVar instanceof defpackage.und) {
                        uoxVar = new defpackage.uoy(aomyVar);
                    } else {
                        if (ttjVar instanceof une) {
                            uoxVar = new uoz(aomyVar2);
                        } else if (ttjVar instanceof defpackage.unc) {
                            defpackage.unc uncVar1110 = (defpackage.unc) ttjVar;
                            java.util.List list1110 = uncVar1110.a;
                            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list1110, 10));
                            it = list1110.iterator();
                            while (it.hasNext()) {
                                umyVar = (umy) it.next();
                                java.util.Iterator it1111 = it;
                                boolean z21111115 = z19;
                                long j111119 = umyVar.c;
                                long j1111110 = umyVar.a;
                                java.lang.String str1111 = umyVar.e;
                                android.net.Uri uri1110 = umyVar.f;
                                unfVar = umyVar.g;
                                if (unfVar != null) {
                                    i18 = unfVar.e - 1;
                                    if (i18 != 2) {
                                        if (true != umyVar.j) {
                                            i19 = 2131231080;
                                        } else {
                                            i19 = 2131231081;
                                        }
                                        iValueOf = java.lang.Integer.valueOf(i19);
                                    } else if (i18 != 3) {
                                        iValueOf = 2131231080;
                                    } else if (i18 != 4) {
                                        if (true != umyVar.i) {
                                            i20 = 2131231060;
                                        } else {
                                            i20 = 2131231083;
                                        }
                                        iValueOf = java.lang.Integer.valueOf(i20);
                                    } else {
                                        iValueOf = 2131231991;
                                    }
                                    num = iValueOf;
                                } else {
                                    num = null;
                                }
                                if (unfVar != null) {
                                    str = unfVar.c;
                                } else {
                                    str = null;
                                }
                                arrayList.add(new uov(j111119, j1111110, str1111, uri1110, num, str, new lpg(str1111, umyVar.b)));
                                z19 = z21111115;
                                it = it1111;
                            }
                            boolean z21111116 = z19;
                            z20 = false;
                            uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar1110.b, z16, z17, z18, z21111116, aomyVar3, aomyVar11);
                            z21 = z18;
                            z22 = z21111116;
                            z23 = z17;
                        }
                        cavVar2 = cavVarB;
                        defpackage.aomy aomyVar11111112 = aomyVar13;
                        defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar11111112, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                        if (ttjVar instanceof defpackage.unc) {
                            cavVar2.u(2094189670);
                            defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                            ((defpackage.cbt) cavVar2).W(z20);
                        } else {
                            cavVar2.u(2094324210);
                            ((defpackage.cbt) cavVar2).W(z20);
                        }
                        aomyVar10 = aomyVar11111112;
                        z13 = z21;
                        aomyVar8 = aomyVar11;
                        aomyVar9 = aomyVar12;
                        z10 = z15;
                        z11 = z16;
                        z14 = z23;
                        z12 = z22;
                    }
                    z23 = z17;
                    z21 = z18;
                    z20 = false;
                    z22 = z19;
                    cavVar2 = cavVarB;
                    defpackage.aomy aomyVar11111113 = aomyVar13;
                    defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar11111113, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                    if (ttjVar instanceof defpackage.unc) {
                        cavVar2.u(2094189670);
                        defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                        ((defpackage.cbt) cavVar2).W(z20);
                    } else {
                        cavVar2.u(2094324210);
                        ((defpackage.cbt) cavVar2).W(z20);
                    }
                    aomyVar10 = aomyVar11111113;
                    z13 = z21;
                    aomyVar8 = aomyVar11;
                    aomyVar9 = aomyVar12;
                    z10 = z15;
                    z11 = z16;
                    z14 = z23;
                    z12 = z22;
                }
                throw new defpackage.aois();
            }
            cavVar2 = cavVarB;
            cavVar2.s();
            z10 = z;
            z11 = z2;
            aomyVar8 = aomyVar4;
            aomyVar9 = aomyVar6;
            aomyVar10 = aomyVar7;
            z12 = z5;
            z13 = z4;
            z14 = z3;
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
            }
        }
        i10 |= 48;
        i12 = i10;
        if ((i2 & 384) == 0) {
            i13 = i12 | (true == cavVarB.D(aonnVar) ? 256 : 128);
        } else {
            i13 = i12;
        }
        if ((i2 & 3072) == 0) {
            i13 |= true == cavVarB.D(aomyVar5) ? 2048 : 1024;
        }
        i14 = i3 & 16384;
        if (i14 != 0) {
            i13 |= 24576;
            i15 = i14;
        } else {
            i15 = i14;
            if ((i2 & 24576) == 0) {
                i13 |= true == cavVarB.D(aomyVar6) ? 16384 : 8192;
            }
        }
        i16 = 32768 & i3;
        if (i16 != 0) {
            if ((i2 & 196608) == 0) {
                i13 |= true == cavVarB.D(aomyVar7) ? 131072 : 65536;
            }
            i17 = i13;
            if ((i9 & 306783379) == 306783378) {
                z9 = true;
            } else {
                z9 = true;
            }
            if (cavVarB.H(z9, i9 & 1)) {
                z15 = (!z24) | z;
                z16 = z25 & z2;
                z17 = z26 & z3;
                z18 = z6 & z4;
                z19 = z7 & z5;
                if (i11 != 0) {
                    aomyVar11 = null;
                } else {
                    aomyVar11 = aomyVar4;
                }
                if (i15 != 0) {
                    cbtVar2 = (defpackage.cbt) cavVarB;
                    objR2 = cbtVar2.R();
                    if (objR2 == defpackage.cau.a) {
                        objR2 = new defpackage.uoq(0);
                        cbtVar2.ab(objR2);
                    }
                    aomyVar12 = (defpackage.aomy) objR2;
                } else {
                    aomyVar12 = aomyVar6;
                }
                if (i16 != 0) {
                    cbtVar = (defpackage.cbt) cavVarB;
                    objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = new defpackage.uoq(2);
                        cbtVar.ab(objR);
                    }
                    aomyVar13 = (defpackage.aomy) objR;
                } else {
                    aomyVar13 = aomyVar7;
                }
                j$.util.Objects.checkIndex(0, 4);
                if (ttjVar != null) {
                    if (ttjVar instanceof defpackage.und) {
                        uoxVar = new defpackage.uoy(aomyVar);
                    } else {
                        if (ttjVar instanceof une) {
                            uoxVar = new uoz(aomyVar2);
                        } else if (ttjVar instanceof defpackage.unc) {
                            defpackage.unc uncVar1111 = (defpackage.unc) ttjVar;
                            java.util.List list1111 = uncVar1111.a;
                            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list1111, 10));
                            it = list1111.iterator();
                            while (it.hasNext()) {
                                umyVar = (umy) it.next();
                                java.util.Iterator it1112 = it;
                                boolean z21111117 = z19;
                                long j1111111 = umyVar.c;
                                long j1111112 = umyVar.a;
                                java.lang.String str1112 = umyVar.e;
                                android.net.Uri uri1111 = umyVar.f;
                                unfVar = umyVar.g;
                                if (unfVar != null) {
                                    i18 = unfVar.e - 1;
                                    if (i18 != 2) {
                                        if (true != umyVar.j) {
                                            i19 = 2131231080;
                                        } else {
                                            i19 = 2131231081;
                                        }
                                        iValueOf = java.lang.Integer.valueOf(i19);
                                    } else if (i18 != 3) {
                                        iValueOf = 2131231080;
                                    } else if (i18 != 4) {
                                        if (true != umyVar.i) {
                                            i20 = 2131231060;
                                        } else {
                                            i20 = 2131231083;
                                        }
                                        iValueOf = java.lang.Integer.valueOf(i20);
                                    } else {
                                        iValueOf = 2131231991;
                                    }
                                    num = iValueOf;
                                } else {
                                    num = null;
                                }
                                if (unfVar != null) {
                                    str = unfVar.c;
                                } else {
                                    str = null;
                                }
                                arrayList.add(new uov(j1111111, j1111112, str1112, uri1111, num, str, new lpg(str1112, umyVar.b)));
                                z19 = z21111117;
                                it = it1112;
                            }
                            boolean z21111118 = z19;
                            z20 = false;
                            uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar1111.b, z16, z17, z18, z21111118, aomyVar3, aomyVar11);
                            z21 = z18;
                            z22 = z21111118;
                            z23 = z17;
                        }
                        cavVar2 = cavVarB;
                        defpackage.aomy aomyVar11111114 = aomyVar13;
                        defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar11111114, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                        if (ttjVar instanceof defpackage.unc) {
                            cavVar2.u(2094189670);
                            defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                            ((defpackage.cbt) cavVar2).W(z20);
                        } else {
                            cavVar2.u(2094324210);
                            ((defpackage.cbt) cavVar2).W(z20);
                        }
                        aomyVar10 = aomyVar11111114;
                        z13 = z21;
                        aomyVar8 = aomyVar11;
                        aomyVar9 = aomyVar12;
                        z10 = z15;
                        z11 = z16;
                        z14 = z23;
                        z12 = z22;
                    }
                    z23 = z17;
                    z21 = z18;
                    z20 = false;
                    z22 = z19;
                    cavVar2 = cavVarB;
                    defpackage.aomy aomyVar11111115 = aomyVar13;
                    defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar11111115, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                    if (ttjVar instanceof defpackage.unc) {
                        cavVar2.u(2094189670);
                        defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                        ((defpackage.cbt) cavVar2).W(z20);
                    } else {
                        cavVar2.u(2094324210);
                        ((defpackage.cbt) cavVar2).W(z20);
                    }
                    aomyVar10 = aomyVar11111115;
                    z13 = z21;
                    aomyVar8 = aomyVar11;
                    aomyVar9 = aomyVar12;
                    z10 = z15;
                    z11 = z16;
                    z14 = z23;
                    z12 = z22;
                }
                throw new defpackage.aois();
            }
            cavVar2 = cavVarB;
            cavVar2.s();
            z10 = z;
            z11 = z2;
            aomyVar8 = aomyVar4;
            aomyVar9 = aomyVar6;
            aomyVar10 = aomyVar7;
            z12 = z5;
            z13 = z4;
            z14 = z3;
            cdkVarI = cavVar2.I();
            if (cdkVarI != null) {
                cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
            }
        }
        i13 |= 196608;
        i17 = i13;
        if ((i9 & 306783379) == 306783378) {
            z9 = true;
        } else {
            z9 = true;
        }
        if (cavVarB.H(z9, i9 & 1)) {
            z15 = (!z24) | z;
            z16 = z25 & z2;
            z17 = z26 & z3;
            z18 = z6 & z4;
            z19 = z7 & z5;
            if (i11 != 0) {
                aomyVar11 = null;
            } else {
                aomyVar11 = aomyVar4;
            }
            if (i15 != 0) {
                cbtVar2 = (defpackage.cbt) cavVarB;
                objR2 = cbtVar2.R();
                if (objR2 == defpackage.cau.a) {
                    objR2 = new defpackage.uoq(0);
                    cbtVar2.ab(objR2);
                }
                aomyVar12 = (defpackage.aomy) objR2;
            } else {
                aomyVar12 = aomyVar6;
            }
            if (i16 != 0) {
                cbtVar = (defpackage.cbt) cavVarB;
                objR = cbtVar.R();
                if (objR == defpackage.cau.a) {
                    objR = new defpackage.uoq(2);
                    cbtVar.ab(objR);
                }
                aomyVar13 = (defpackage.aomy) objR;
            } else {
                aomyVar13 = aomyVar7;
            }
            j$.util.Objects.checkIndex(0, 4);
            if (ttjVar != null) {
                if (ttjVar instanceof defpackage.und) {
                    uoxVar = new defpackage.uoy(aomyVar);
                } else {
                    if (ttjVar instanceof une) {
                        uoxVar = new uoz(aomyVar2);
                    } else if (ttjVar instanceof defpackage.unc) {
                        defpackage.unc uncVar1112 = (defpackage.unc) ttjVar;
                        java.util.List list1112 = uncVar1112.a;
                        arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list1112, 10));
                        it = list1112.iterator();
                        while (it.hasNext()) {
                            umyVar = (umy) it.next();
                            java.util.Iterator it1113 = it;
                            boolean z21111119 = z19;
                            long j1111113 = umyVar.c;
                            long j1111114 = umyVar.a;
                            java.lang.String str1113 = umyVar.e;
                            android.net.Uri uri1112 = umyVar.f;
                            unfVar = umyVar.g;
                            if (unfVar != null) {
                                i18 = unfVar.e - 1;
                                if (i18 != 2) {
                                    if (true != umyVar.j) {
                                        i19 = 2131231080;
                                    } else {
                                        i19 = 2131231081;
                                    }
                                    iValueOf = java.lang.Integer.valueOf(i19);
                                } else if (i18 != 3) {
                                    iValueOf = 2131231080;
                                } else if (i18 != 4) {
                                    if (true != umyVar.i) {
                                        i20 = 2131231060;
                                    } else {
                                        i20 = 2131231083;
                                    }
                                    iValueOf = java.lang.Integer.valueOf(i20);
                                } else {
                                    iValueOf = 2131231991;
                                }
                                num = iValueOf;
                            } else {
                                num = null;
                            }
                            if (unfVar != null) {
                                str = unfVar.c;
                            } else {
                                str = null;
                            }
                            arrayList.add(new uov(j1111113, j1111114, str1113, uri1112, num, str, new lpg(str1113, umyVar.b)));
                            z19 = z21111119;
                            it = it1113;
                        }
                        boolean z211111110 = z19;
                        z20 = false;
                        uoxVar = new defpackage.uox(defpackage.ajsz.bU(arrayList, defpackage.uou.a), aomyVar, aonjVar, aonjVar2, uncVar1112.b, z16, z17, z18, z211111110, aomyVar3, aomyVar11);
                        z21 = z18;
                        z22 = z211111110;
                        z23 = z17;
                    }
                    cavVar2 = cavVarB;
                    defpackage.aomy aomyVar11111116 = aomyVar13;
                    defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar11111116, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                    if (ttjVar instanceof defpackage.unc) {
                        cavVar2.u(2094189670);
                        defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                        ((defpackage.cbt) cavVar2).W(z20);
                    } else {
                        cavVar2.u(2094324210);
                        ((defpackage.cbt) cavVar2).W(z20);
                    }
                    aomyVar10 = aomyVar11111116;
                    z13 = z21;
                    aomyVar8 = aomyVar11;
                    aomyVar9 = aomyVar12;
                    z10 = z15;
                    z11 = z16;
                    z14 = z23;
                    z12 = z22;
                }
                z23 = z17;
                z21 = z18;
                z20 = false;
                z22 = z19;
                cavVar2 = cavVarB;
                defpackage.aomy aomyVar11111117 = aomyVar13;
                defpackage.ttj.W(uoxVar, aonnVar, aomyVar5, aomyVar11111117, null, z15, cavVar2, ((i17 >> 3) & 1008) | ((i17 >> 6) & 7168) | ((i9 << 12) & 458752));
                if (ttjVar instanceof defpackage.unc) {
                    cavVar2.u(2094189670);
                    defpackage.wsc.bz(((defpackage.unc) ttjVar).c, aomyVar12, cavVar2, (i17 >> 9) & 112);
                    ((defpackage.cbt) cavVar2).W(z20);
                } else {
                    cavVar2.u(2094324210);
                    ((defpackage.cbt) cavVar2).W(z20);
                }
                aomyVar10 = aomyVar11111117;
                z13 = z21;
                aomyVar8 = aomyVar11;
                aomyVar9 = aomyVar12;
                z10 = z15;
                z11 = z16;
                z14 = z23;
                z12 = z22;
            }
            throw new defpackage.aois();
        }
        cavVar2 = cavVarB;
        cavVar2.s();
        z10 = z;
        z11 = z2;
        aomyVar8 = aomyVar4;
        aomyVar9 = aomyVar6;
        aomyVar10 = aomyVar7;
        z12 = z5;
        z13 = z4;
        z14 = z3;
        cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new uor(ttjVar, z10, z11, z14, z13, z12, aomyVar, aomyVar2, aonjVar, aonjVar2, aomyVar3, aomyVar8, aonnVar, aomyVar5, aomyVar9, aomyVar10, i, i2, i3);
        }
    }

    public static /* synthetic */ defpackage.tvn aL(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.tvn(akzxVar);
    }

    public static /* synthetic */ defpackage.tvn aM(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.tvn(akzxVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    private static void aN(android.os.Parcel parcel, int i, int i2) throws aahs {
        if (i == i2) {
            return;
        }
        throw new aahs("Expected size " + i2 + " got " + i + " (0x" + java.lang.Integer.toHexString(i) + ')', parcel);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static void aa(android.os.Parcel parcel, int i) throws aahs {
        parcel.setDataPosition(parcel.dataPosition() + J(parcel, i));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static boolean ab(android.os.Parcel parcel, int i) throws aahs {
        Z(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static byte[] ac(android.os.Parcel parcel, int i) throws aahs {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return bArrCreateByteArray;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static int[] ad(android.os.Parcel parcel, int i) throws aahs {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return iArrCreateIntArray;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static long[] ae(android.os.Parcel parcel, int i) throws aahs {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return jArrCreateLongArray;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static java.lang.Object[] af(android.os.Parcel parcel, int i, android.os.Parcelable.Creator creator) throws aahs {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        java.lang.Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iJ);
        return objArrCreateTypedArray;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static java.lang.String[] ag(android.os.Parcel parcel, int i) throws aahs {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        java.lang.String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return strArrCreateStringArray;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    public static byte[][] ah(android.os.Parcel parcel, int i) throws aahs {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iJ);
        return bArr;
    }

    public static void ai(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void aj(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException((java.lang.String) obj);
        }
    }

    public static void ak(boolean z, java.lang.String str, java.lang.Object... objArr) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(str, objArr));
        }
    }

    public static void al(android.os.Handler handler) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            java.lang.String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new java.lang.IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + '.');
        }
    }

    public static void am(java.lang.String str) {
        if (d()) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static void an(boolean z) {
        if (!z) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void ao(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException((java.lang.String) obj);
        }
    }

    public static void ap(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void aq(java.lang.String str, java.lang.Object obj) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException((java.lang.String) obj);
        }
    }

    public static void ar() {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        if (looperMyLooper != null && j$.util.Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new java.lang.IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
    }

    public static void as(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("null reference");
        }
    }

    public static void at(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException((java.lang.String) obj2);
        }
    }

    public static void au(com.google.android.gms.common.api.Status status, java.lang.Object obj, defpackage.zzx zzxVar) {
        if (status.c()) {
            zzxVar.g(obj);
        } else {
            zzxVar.f(defpackage.aehj.bY(status));
        }
    }

    public static void av(com.google.android.gms.common.api.Status status, java.lang.Object obj, defpackage.zzx zzxVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        if (apiMetadata != null) {
            defpackage.aazc aazcVar = defpackage.aamz.a;
        }
        au(status, obj, zzxVar);
    }

    public static void aw(com.google.android.gms.common.api.Status status, java.lang.Object obj, defpackage.zzx zzxVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
        if (apiMetadata != null) {
            defpackage.aazc aazcVar = defpackage.aamz.a;
        }
        ax(status, obj, zzxVar);
    }

    public static void ax(com.google.android.gms.common.api.Status status, java.lang.Object obj, defpackage.zzx zzxVar) {
        if (status.c()) {
            zzxVar.i(obj);
        } else {
            zzxVar.h(defpackage.aehj.bY(status));
        }
    }

    public static defpackage.aafc ay(java.lang.Object obj, java.lang.String str) {
        at(obj, "Listener must not be null");
        at(str, "Listener type must not be null");
        aq(str, "Listener type must not be empty");
        return new defpackage.aafc(obj, str);
    }

    public static defpackage.aafe az(java.lang.Object obj, android.os.Looper looper, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.NullPointerException("Listener must not be null");
        }
        if (looper == null) {
            throw new java.lang.NullPointerException("Looper must not be null");
        }
        if (str != null) {
            return new defpackage.aafe(looper, obj, str);
        }
        throw new java.lang.NullPointerException("Listener type must not be null");
    }

    public static android.os.StrictMode.VmPolicy.Builder c(android.os.StrictMode.VmPolicy.Builder builder) {
        return ac$.ExternalSyntheticApiModelOutline0.m(builder);
    }

    public static boolean d() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper();
    }

    public static java.lang.String e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return android.util.Base64.encodeToString(bArr, 11);
    }

    public static int f(android.os.Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void g(android.os.Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void h(android.os.Parcel parcel, int i, boolean z) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void i(android.os.Parcel parcel, int i, byte b) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(b);
    }

    public static void j(android.os.Parcel parcel, int i, double d) {
        parcel.writeInt(i | 524288);
        parcel.writeDouble(d);
    }

    public static void k(android.os.Parcel parcel, int i, float f) {
        parcel.writeInt(i | 262144);
        parcel.writeFloat(f);
    }

    public static void l(android.os.Parcel parcel, int i, int i2) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(i2);
    }

    public static void m(android.os.Parcel parcel, int i, long j) {
        parcel.writeInt(i | 524288);
        parcel.writeLong(j);
    }

    public static void n(android.os.Parcel parcel, android.os.Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static void o(android.os.Parcel parcel, int i, java.lang.Boolean bool) {
        if (bool != null) {
            parcel.writeInt(i | 262144);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static void p(android.os.Parcel parcel, int i, android.os.Bundle bundle) {
        if (bundle != null) {
            int iF = f(parcel, i);
            parcel.writeBundle(bundle);
            g(parcel, iF);
        }
    }

    public static void q(android.os.Parcel parcel, int i, byte[] bArr) {
        if (bArr != null) {
            int iF = f(parcel, i);
            parcel.writeByteArray(bArr);
            g(parcel, iF);
        }
    }

    public static void r(android.os.Parcel parcel, int i, byte[][] bArr) {
        if (bArr != null) {
            int iF = f(parcel, i);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            g(parcel, iF);
        }
    }

    public static void s(android.os.Parcel parcel, int i, java.lang.Double d) {
        if (d != null) {
            parcel.writeInt(i | 524288);
            parcel.writeDouble(d.doubleValue());
        }
    }

    public static void t(android.os.Parcel parcel, int i, java.lang.Float f) {
        if (f != null) {
            parcel.writeInt(i | 262144);
            parcel.writeFloat(f.floatValue());
        }
    }

    public static void u(android.os.Parcel parcel, int i, android.os.IBinder iBinder) {
        if (iBinder != null) {
            int iF = f(parcel, i);
            parcel.writeStrongBinder(iBinder);
            g(parcel, iF);
        }
    }

    public static void v(android.os.Parcel parcel, int i, int[] iArr) {
        if (iArr != null) {
            int iF = f(parcel, i);
            parcel.writeIntArray(iArr);
            g(parcel, iF);
        }
    }

    public static void w(android.os.Parcel parcel, int i, java.lang.Integer num) {
        if (num != null) {
            parcel.writeInt(i | 262144);
            parcel.writeInt(num.intValue());
        }
    }

    public static void x(android.os.Parcel parcel, int i, java.util.List list) {
        if (list != null) {
            int iF = f(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeLong(((java.lang.Long) list.get(i2)).longValue());
            }
            g(parcel, iF);
        }
    }

    public static void y(android.os.Parcel parcel, int i, java.lang.Long l) {
        if (l != null) {
            parcel.writeInt(i | 524288);
            parcel.writeLong(l.longValue());
        }
    }

    public static void z(android.os.Parcel parcel, int i, android.os.Parcelable parcelable, int i2) {
        if (parcelable != null) {
            int iF = f(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            g(parcel, iF);
        }
    }

    @java.lang.Deprecated
    public defpackage.aacv a(android.content.Context context, android.os.Looper looper, defpackage.aagi aagiVar, java.lang.Object obj, defpackage.aadc aadcVar, defpackage.aadd aaddVar) {
        return b(context, looper, aagiVar, obj, aadcVar, aaddVar);
    }

    public defpackage.aacv b(android.content.Context context, android.os.Looper looper, defpackage.aagi aagiVar, java.lang.Object obj, defpackage.aaei aaeiVar, defpackage.aafi aafiVar) {
        throw new java.lang.UnsupportedOperationException("buildClient must be implemented");
    }

    public aais(short[] sArr) {
    }

    public /* synthetic */ aais() {
    }
}
