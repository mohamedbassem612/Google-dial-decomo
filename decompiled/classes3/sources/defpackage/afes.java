package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afes {
    public static final defpackage.afes a = new defpackage.afes(null);
    private final java.util.List b;

    static {
        new defpackage.afeq(null, null);
    }

    public afes(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.b = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public static final java.lang.String a(java.lang.String str) {
        return j$.net.URLEncoder.encode(str, java.nio.charset.StandardCharsets.UTF_8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.List] */
    public static defpackage.afeq b(android.net.Uri uri) {
        defpackage.afep afepVar;
        defpackage.afes afesVar;
        defpackage.afep afepVar2;
        java.lang.String[] strArr;
        int i;
        int i2;
        java.util.ArrayList arrayList;
        defpackage.afep afepVar3;
        java.lang.String encodedFragment = uri.getEncodedFragment();
        if (android.text.TextUtils.isEmpty(encodedFragment)) {
            afesVar = a;
            afepVar = null;
        } else {
            java.util.ArrayList<defpackage.afpl> arrayList2 = new java.util.ArrayList();
            java.lang.String[] strArrSplit = encodedFragment.split("&");
            int length = strArrSplit.length;
            int i3 = 0;
            int i4 = 0;
            while (i4 < length) {
                java.lang.String[] strArrSplit2 = strArrSplit[i4].split("=", 2);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.String str = strArrSplit2[i3];
                boolean z = !android.text.TextUtils.isEmpty(str);
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[i3] = encodedFragment;
                agab.ah(z, "malformed key: %s", objArr);
                boolean z2 = (strArrSplit2.length != 2 || android.text.TextUtils.isEmpty(strArrSplit2[1])) ? i3 : 1;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                objArr2[i3] = encodedFragment;
                agab.ah(z2, "missing param value: %s", objArr2);
                java.lang.String[] strArrSplit3 = strArrSplit2[1].split("\\+");
                int i5 = i3;
                while (i5 < strArrSplit3.length) {
                    java.lang.String strSubstring = strArrSplit3[i5];
                    if (strSubstring.isEmpty()) {
                        encodedFragment = encodedFragment;
                        strArr = strArrSplit;
                        i = length;
                        i2 = i3;
                    } else {
                        int iIndexOf = strSubstring.indexOf("(");
                        if (iIndexOf != -1) {
                            java.lang.String strSubstring2 = strSubstring.substring(iIndexOf);
                            int i6 = i3;
                            boolean z3 = (strSubstring2.charAt(i3) == '(' && strSubstring2.charAt(strSubstring2.length() + (-1)) == ')') ? 1 : i6;
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            objArr3[i6] = encodedFragment;
                            agab.ah(z3, "malformed fragment subparams: %s", objArr3);
                            java.lang.String strSubstring3 = strSubstring2.substring(1, strSubstring2.length() - 1);
                            arrayList = new java.util.ArrayList();
                            java.lang.String[] strArrSplit4 = strSubstring3.split(",");
                            int i7 = i6;
                            while (i7 < strArrSplit4.length) {
                                java.lang.String str2 = strSubstring3;
                                java.lang.String[] strArrSplit5 = strArrSplit4[i7].split("=", 2);
                                java.lang.String str3 = strArrSplit5[i6];
                                java.lang.String[] strArr2 = strArrSplit;
                                boolean z4 = !android.text.TextUtils.isEmpty(str3);
                                int i8 = length;
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                objArr4[i6] = str2;
                                agab.ah(z4, "missing fragment subparam key: %s", objArr4);
                                if (strArrSplit5.length != 2 || android.text.TextUtils.isEmpty(strArrSplit5[1])) {
                                    arrayList.add(new defpackage.afer(c(str3), null));
                                } else {
                                    arrayList.add(new defpackage.afer(c(str3), c(strArrSplit5[1])));
                                }
                                i7++;
                                strSubstring3 = str2;
                                length = i8;
                                strArrSplit = strArr2;
                            }
                            strArr = strArrSplit;
                            i = length;
                            i2 = i6;
                            strSubstring = strSubstring.substring(i2, iIndexOf);
                        } else {
                            encodedFragment = encodedFragment;
                            strArr = strArrSplit;
                            i = length;
                            i2 = i3;
                            boolean z5 = !strSubstring.contains(")");
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            objArr5[i2] = encodedFragment;
                            agab.ah(z5, "malformed fragment subparams: %s", objArr5);
                            arrayList = null;
                        }
                        arrayList3.add(new defpackage.afpl(c(strSubstring), (java.util.List) arrayList));
                    }
                    i5++;
                    i3 = i2;
                    encodedFragment = encodedFragment;
                    length = i;
                    strArrSplit = strArr;
                }
                arrayList2.add(new defpackage.afpl(c(str), (java.util.List) arrayList3, (byte[]) null));
                i4++;
                encodedFragment = encodedFragment;
                strArrSplit = strArrSplit;
            }
            int i9 = i3;
            afepVar = null;
            java.util.ArrayList<defpackage.afpl> arrayList4 = new java.util.ArrayList();
            for (defpackage.afpl afplVar : arrayList2) {
                int i10 = i9;
                while (true) {
                    if (i10 >= arrayList4.size()) {
                        arrayList4.add(afplVar);
                        break;
                    }
                    if (((java.lang.String) ((defpackage.afpl) arrayList4.get(i10)).b).equals(afplVar.b)) {
                        arrayList4.set(i10, afplVar);
                        break;
                    }
                    i10++;
                }
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (defpackage.afpl afplVar2 : arrayList4) {
                ?? r3 = afplVar2.a;
                if (r3.isEmpty()) {
                    afepVar2 = null;
                } else {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    for (defpackage.afpl afplVar3 : r3) {
                        arrayList6.add(new defpackage.afeq((java.lang.String) afplVar3.a, afplVar3.b));
                    }
                    afepVar2 = new defpackage.afep((java.lang.String) afplVar2.b, arrayList6);
                }
                if (afepVar2 != null) {
                    arrayList5.add(afepVar2);
                }
            }
            afesVar = new defpackage.afes(arrayList5);
        }
        java.util.Iterator it = afesVar.b.iterator();
        do {
            if (!it.hasNext()) {
                afepVar3 = afepVar;
                break;
            }
            afepVar3 = (defpackage.afep) it.next();
        } while (!afepVar3.a.equals("transform"));
        if (afepVar3 != null) {
            for (defpackage.afeq afeqVar : afepVar3.b) {
                if (afeqVar.a.equals("encrypt")) {
                    return afeqVar;
                }
            }
        }
        return afepVar;
    }

    private static final java.lang.String c(java.lang.String str) {
        return j$.net.URLDecoder.decode(str, java.nio.charset.StandardCharsets.UTF_8);
    }

    public final java.lang.String toString() {
        return android.text.TextUtils.join("&", this.b);
    }
}
